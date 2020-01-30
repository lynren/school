#include <cmath>      // for std::sqrt
#include <array>      // for std::array
#include <vector>     // for std::vector
#include <limits>     // for std::numeric_limits
#include <string>     // for std::string
#include <istream>    // for std::istream
#include <ostream>    // for std::ostream
#include <iostream>   // for std::cin, std::cout
#include <algorithm>  // for std::transform

using namespace std;

typedef struct rgb_struct{
   unsigned char red;
   unsigned char green;
   unsigned char blue;
} rgb;

std::istream& operator >>(std::istream&, rgb&);
std::ostream& operator <<(std::ostream&, rgb&);
double distance(rgb const& a, rgb const& b);

int main(){
   array<rgb,16> const colours{{
    { 0x00, 0x00, 0x00 }, // 0: black
    { 0x80, 0x00, 0x00 }, // 1: maroon
    { 0x00, 0x80, 0x00 }, // 2: green
    { 0x80, 0x80, 0x00 }, // 3: olive
    { 0x00, 0x00, 0x80 }, // 4: navy
    { 0x80, 0x00, 0x80 }, // 5: purple
    { 0x00, 0x80, 0x80 }, // 6: teal
    { 0xC0, 0xC0, 0xC0 }, // 7: silver
    { 0x80, 0x80, 0x80 }, // 8: grey
    { 0xFF, 0x00, 0x00 }, // 9: red
    { 0x00, 0xFF, 0x00 }, // 10: lime
    { 0xFF, 0xFF, 0x00 }, // 11: yellow
    { 0x00, 0x00, 0xFF }, // 12: blue
    { 0xFF, 0x00, 0xFF }, // 13: fushsia
    { 0x00, 0xFF, 0xFF }, // 14: aqua
    { 0xFF, 0xFF, 0xFF }  // 15: white
   }};

   array<string,16> const colour_names{
      "black", "maroon", "green", "olive", "navy", "purple", "teal", "silver",
      "gray", "red", "lime", "yellow", "blue", "fushsia", "aqua", "white"
   };

   for(rgb value{}; cin >> value;){  
      vector<double> distances;
      distances.reserve(colours.size());

      transform(colours.begin(), colours.end(), back_inserter(distances), 
      [&value](auto const& color){
         return distance(color, value);
      });

      size_t index = std::numeric_limits<size_t>::max(); // set current smallest distance
      double smallest_distance = std::numeric_limits<double>::max(); // set initial index as invalid

      for(auto i = begin(distances), iEnd = end(distances); i != iEnd; ++i){
         if(*i < smallest_distance){      // when a new smallest distance is found,
            smallest_distance = *i;       // update smallest_distance and
            index = i - begin(distances); // store the index of the color
         }
      }

      // check validity of index
      if(index == std::numeric_limits<size_t>::max()){
         cout << "ERROR occurred. Aborting...\n";
         return 1;
      }

      cout << colour_names[index] << endl;   // print the smallest distance color

      // prepare cin for next set of rgb values
      cin.clear();
      cin.ignore(std::numeric_limits<int>::max(), '\n');
   }
}

/* Handles istream reading for rgb types
 * Valid input is of the form "a b c" where 0 <= a,b,c <= 255
 * For invalid input, the istream's failbit flag is set and 
 * a reference to the istream is returned.
 */
std::istream& operator >>(std::istream& is, rgb& colors){
   unsigned int color_codes[3];  // color code storage
   is.unsetf(ios::skipws);       // turn off whitespaces skipping as it is the delimiter

   for(int color_count = 0; color_count < 3; ++color_count){
      unsigned color_code;                   // r, g, or b value
      if(!(is >> color_code && color_code <= 255)){  // check input is an int within range
         is.setstate(ios_base::failbit);     // set stream error flag if color value is out of range
         return is;
      }
      color_codes[color_count] = color_code; // save valid color value to storage

      is.clear();                            // clear previous stream error
      if(is.peek() == ' '){                  // prepare stream for next color code
         char buf;               
         is >> buf;                          // flush whitespace delimiter
      }
   }

   // if all color values are valid, store them in the struct
   colors.red = color_codes[0];
   colors.green = color_codes[1];
   colors.blue = color_codes[2];
   
   return is;
}

/* Handles ostream writing for rgb types
 * Output of of the form "r g b" where 0 <= r, g, b <= 255 and are unsigned integers
 * @param std::ostream& os    ostream being written to
 * @param rgb& colors         rgb struct being written to os
 */
std::ostream& operator <<(std::ostream& os, rgb& colors){
   os << static_cast<unsigned>(colors.red) <<
   ' ' << static_cast<unsigned>(colors.green) <<
   ' ' << static_cast<unsigned>(colors.blue);

   return os;
}

/* Computes the distance between two rgb values
 * Returns the distance as a double
 * @param rgb const& a        point 1
 * @param rgb const& b        point 2
 */
double distance(rgb const& a, rgb const& b){
   float dist_red = (static_cast<int>(a.red) - static_cast<int>(b.red));
   float dist_green = (static_cast<int>(a.green) - static_cast<int>(b.green));
   float dist_blue = (static_cast<int>(a.blue) - static_cast<int>(b.blue));
   
   dist_red = pow(dist_red, 2);
   dist_green = pow(dist_green, 2);
   dist_blue = pow(dist_blue, 2);

   return sqrt(dist_red + dist_green + dist_blue);
}