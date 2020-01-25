#include <iostream>

using namespace std;

int main()
{
    cin.unsetf(ios_base::skipws);            // disable whitespace skipping
    bool is_within_double_quotes = false;    // double quote state is initially false
    for(char byte; cin >> byte; )            // read in byte by byte and process
    {
        if(byte == '\"')                     // Enter/exit double quote state 
        {
            cout << byte;
            is_within_double_quotes = is_within_double_quotes ? false : true; // toggle double quote flag
        }
        else
        {
            if(is_within_double_quotes)      // if byte is contained in double quotes
            {
                cout << byte;
            }
            else                             // if byte is not contained in double quotes
            {                                // filter byte if it is a punctuation symbol
                if(
                (byte == '.') ||
                (byte == ',') ||
                (byte == '?') ||
                (byte == '-') ||
                (byte == '\''))
                {
                    cout << ' ';             // puntuation is replaced with a whitespace
                }
                else
                {
                    cout << byte;            // if byte is not a punctuation symbol, print byte
                }
            }
        }
    }

    return 0;
}