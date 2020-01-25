/**
 * a1_pointers.cxx filters punctuation characters read from the standard input, replacing them
 * with a  whitespace, then writes them to the standard output. Punctuation filtering does not 
 * apply to symbols within double quotes. Any non-punctuation symbols are simply written to the
 * standard output.
 */  

#include <iostream>

using namespace std;

void process_byte(char*, bool*);

int main()
{
    cin.unsetf(ios_base::skipws);            // disable whitespace skipping
    bool is_within_double_quotes = false;    // double quote state is initially false
    for(char byte; cin >> byte; )            // read in byte by byte and process
    {
       process_byte(&byte, &is_within_double_quotes); // filter byte based on double quote state
       cout << byte;                                  // print processed byte
    }

    return 0;
}

/**
 * process_byte replaces punctuation characters with a whitespace
 * @param char* byte    address of byte to be processed
 * @param bool* byte    address of double quote state flag
 */
void process_byte(char* byte, bool* is_within_double_quotes){
   if(*byte == '\"')                     // Enter/exit double quote state 
   {
      *is_within_double_quotes = *is_within_double_quotes ? false : true; // toggle double quote flag
      return;
   }
   else
   {
      if(*is_within_double_quotes)      // if byte is contained in double quotes
      {
         return;
      }
      else                             // if byte is not contained in double quotes
      {                                // filter byte if it is a punctuation symbol
         if(
         (*byte == '.') ||
         (*byte == ',') ||
         (*byte == '?') ||
         (*byte == '-') ||
         (*byte == '\''))
         {
            *byte = ' ';             // puntuation is replaced with a whitespace
            return;
         }
         else
         {
            return;           // if byte is not a punctuation symbol, print byte
         }
      }
   }
}
