#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/types.h>

int main(){
    const int BUFFER_SIZE = 4096;       //4096 == max char path length in Linux
    char input_filename[BUFFER_SIZE];
    char output_filename[BUFFER_SIZE];
    char buf;                           //character buffer

    //2. Prompt for input file
    const char msg_input[] = "Enter input file name: ";
    write(STDOUT_FILENO, msg_input, sizeof(msg_input)-1);

    //3. Read input file name
    for(int i = 0; read(STDIN_FILENO, &buf, 1) == 1 && i < BUFFER_SIZE; ++i){
        if(buf == '\n'){
            input_filename[i] = '\0';
            break;
        }
        input_filename[i] = buf;
    }

    //4. Prompt for output file
    const char msg_output[] = "Enter output file name: ";
    write(STDOUT_FILENO, msg_output, sizeof(msg_output)-1);

    //5. Read output file name
    for(int i = 0; read(STDIN_FILENO, &buf, 1) == 1 && i < BUFFER_SIZE; ++i){
        if(buf == '\n'){
            output_filename[i] = '\0';
            break;
        }
        output_filename[i] = buf;
    }

    //6. check if input file exists and open
    if(access(input_filename, F_OK | R_OK) < 0){        //check for input file existence and permissions
        const char msg_input_error[] = "Input file either does not exist or cannot be read. Aborting.";
        write(STDOUT_FILENO, &msg_input_error, sizeof(msg_input_error)-1);
        _exit(1);                                        //abort on failure
    }
    int input_fd = open(input_filename, O_RDONLY);      //open input file in read only mode

    //7. check if output file exists and create
    if(access(output_filename, F_OK) == 0){              //check if output file already exists
        const char msg_output_error[] = "Output file already exists. It cannot be overwritten. Aborting.";
        write(STDOUT_FILENO, &msg_output_error, sizeof(msg_output_error)-1);
        _exit(1);
    }
    int output_fd = open(output_filename, O_WRONLY | O_CREAT, 0664); //create and open the output file

    //8. copy the file byte by byte
    while(read(input_fd, &buf, 1)){
        write(output_fd, &buf, 1);
    }

    //9. finally, close the file descriptors
    close(input_fd);
    close(output_fd);

    //print completion message
    const char msg_complete[] = "File copy complete!\n";
    write(STDOUT_FILENO, &msg_complete, sizeof(msg_complete)-1);

    //terminate process
    _exit(0);
}
