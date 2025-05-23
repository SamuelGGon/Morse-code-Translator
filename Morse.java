public class Morse {

     String translateChar(String morse, String word) {

          if (morse.equals(".-") || morse.equals("._")) {
               word += "A";
               return word;

          } else if (morse.equals("-...") || morse.equals("_...")) {
               word += "B";
               return word;

          } else if (morse.equals("-.-.") || morse.equals("_._.")) {
               word += "C";
               return word;

          } else if (morse.equals("-..") || morse.equals("_..")) {
               word += "D";
               return word;

          } else if (morse.equals(".")) {
               word += "E";
               return word;

          } else if (morse.equals("..-.") || morse.equals(".._.")) {
               word += "F";
               return word;

          } else if (morse.equals("--.") || morse.equals("__.")) {
               word += "G";
               return word;

          } else if (morse.equals("....")) {
               word += "H";
               return word;

          } else if (morse.equals("..")) {
               word += "I";
               return word;

          } else if (morse.equals(".---") || morse.equals(".___")) {
               word += "J";
               return word;

          } else if (morse.equals("-.-") || morse.equals("_._")) {
               word += "K";
               return word;

          } else if (morse.equals(".-..") || morse.equals("._..")) {
               word += "L";
               return word;

          } else if (morse.equals("--") || morse.equals("__")) {
               word += "M";
               return word;

          } else if (morse.equals("-.") || morse.equals("_.")) {
               word += "N";
               return word;

          } else if (morse.equals("---") || morse.equals("___")) {
               word += "O";
               return word;

          } else if (morse.equals(".--.") || morse.equals(".__.")) {
               word += "P";
               return word;

          } else if (morse.equals("--.-") || morse.equals("__._")) {
               word += "Q";
               return word;

          } else if (morse.equals(".-.") || morse.equals("._.")) {
               word += "R";
               return word;

          } else if (morse.equals("...")) {
               word += "S";
               return word;

          } else if (morse.equals("-") || morse.equals("_")) {
               word += "T";
               return word;

          } else if (morse.equals("..-") || morse.equals(".._")) {
               word += "U";
               return word;

          } else if (morse.equals("...-") || morse.equals("..._")) {
               word += "V";
               return word;

          } else if (morse.equals(".--") || morse.equals(".__")) {
               word += "W";
               return word;

          } else if (morse.equals("-..-") || morse.equals("_.._")) {
               word += "X";
               return word;

          } else if (morse.equals("-.--") || morse.equals("_.__")) {
               word += "Y";
               return word;

          } else if (morse.equals("--..") || morse.equals("__..")) {
               word += "Z";
               return word;

          } else if (morse.equals(".----") || morse.equals(".____")) {
               word += "1";
               return word;

          } else if (morse.equals("..---") || morse.equals("..___")) {
               word += "2";
               return word;

          } else if (morse.equals("...--") || morse.equals("...__")) {
               word += "3";
               return word;

          } else if (morse.equals("....-") || morse.equals("...._")) {
               word += "4";
               return word;

          } else if (morse.equals(".....")) {
               word += "5";
               return word;

          } else if (morse.equals("-....") || morse.equals("_....")) {
               word += "6";
               return word;

          } else if (morse.equals("--...") || morse.equals("__...")) {
               word += "7";
               return word;

          } else if (morse.equals("---..") || morse.equals("___..")) {
               word += "8";
               return word;

          } else if (morse.equals("----.") || morse.equals("____.")) {
               word += "9";
               return word;

          } else if (morse.equals("-----") || morse.equals("_____")) {
               word += "0";
               return word;

          } else if (morse.equals("+")) {
               word += " ";

               return word;

          } else if (morse.equals("a") || morse.equals("A")) {
               word += ".-";
               return word;
          } else if (morse.equals("b") || morse.equals("B")) {
               word += "-...";
               return word;
          } else if (morse.equals("c") || morse.equals("C")) {
               word += "-.-.";
               return word;
          } else if (morse.equals("d") || morse.equals("D")) {
               word += "-..";
               return word;
          } else if (morse.equals("e") || morse.equals("E")) {
               word += ".";
               return word;
          } else if (morse.equals("f") || morse.equals("F")) {
               word += " ..-.";
               return word;
          } else if (morse.equals("g") || morse.equals("G")) {
               word += "--.";
               return word;
          } else if (morse.equals("h") || morse.equals("H")) {
               word += "....";
               return word;
          } else if (morse.equals("i") || morse.equals("I")) {
               word += "..";
               return word;
          } else if (morse.equals("j") || morse.equals("J")) {
               word += ".---";
               return word;
          } else if (morse.equals("k") || morse.equals("K")) {
               word += "-.-";
               return word;
          } else if (morse.equals("l") || morse.equals("L")) {
               word += ".-..";
               return word;
          } else if (morse.equals("m") || morse.equals("M")) {
               word += "--";
               return word;
          } else if (morse.equals("n") || morse.equals("N")) {
               word += "-.";
               return word;
          } else if (morse.equals("o") || morse.equals("O")) {
               word += "---";
               return word;
          } else if (morse.equals("p") || morse.equals("P")) {
               word += ".--.";
               return word;
          } else if (morse.equals("q") || morse.equals("Q")) {
               word += "--.-";
               return word;
          } else if (morse.equals("r") || morse.equals("R")) {
               word += ".-.";
               return word;
          } else if (morse.equals("s") || morse.equals("S")) {
               word += "...";
               return word;
          } else if (morse.equals("t") || morse.equals("T")) {
               word += "-";
               return word;
          } else if (morse.equals("u") || morse.equals("U")) {
               word += " ..-";
               return word;
          } else if (morse.equals("v") || morse.equals("V")) {
               word += "...-";
               return word;
          } else if (morse.equals("w") || morse.equals("W")) {
               word += " .--";
               return word;
          } else if (morse.equals("x") || morse.equals("X")) {
               word += "-..-";
               return word;
          } else if (morse.equals("y") || morse.equals("Y")) {
               word += "-.--";
               return word;
          } else if (morse.equals("z") || morse.equals("Z")) {
               word += "--..";
               return word;
          }

          else if (morse.equals("1")) {
               word += ".----";
               return word;
          }

          else if (morse.equals("2")) {
               word += "..---";
               return word;
          }

          else if (morse.equals("3")) {
               word += "...--";
               return word;
          }

          else if (morse.equals("4")) {
               word += "....-";
               return word;
          }

          else if (morse.equals("5")) {
               word += ".....";
               return word;
          }

          else if (morse.equals("6")) {
               word += "-....";
               return word;
          }

          else if (morse.equals("7")) {
               word += "--...";
               return word;
          }

          else if (morse.equals("8")) {
               word += "---..";
               return word;
          }

          else if (morse.equals("9")) {
               word += "----.";
               return word;
          }

          else if (morse.equals("0")) {
               word += "-----";
               return word;
          }
          return word;
     }

     String translate(String morse) {

          String[] array = morse.split(" ");
          String word = "";

          for (int exit = 0; exit < array.length; exit += 1) {
               word = translateChar(array[exit], word);
          }

          return word;
     }

     String translateMorse(String morse) {

          String word = "";

          for (int exit = 0; exit < morse.length(); exit += 1) {
               char a = morse.charAt(exit);
               String s = Character.toString(a);
               word = translateChar(s, word) + " ";
          }

          return word;
     }
}