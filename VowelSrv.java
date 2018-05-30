/*File: VowelSrv
 * Description: To contain methods that help the user count the vowels in a phrase. 
 * Author: Dewey Milton
 * Date: 10/2/2015
*/

public class VowelSrv
{
  public String vowels(String vowel)   //This method captures all the vowels
  {
    int vowelLngth = vowel.length();
    int inputPos = 0;
    String vowels = "";
    
   while(inputPos < vowelLngth)
          {

              switch(vowel.charAt(inputPos))
              {
                 case 'A':
                 case 'a':
                   vowels += "a";
                   break;
                case 'E':
                case 'e':
                  vowels +="e";
                  break;
                case 'I':
                case 'i':
                  vowels += "i";
                  break;
                case 'O':
                case 'o':
                  vowels += "o";
                  break;
                case 'U':
                case 'u':
                  vowels += "u";
                  break;
                default:
                  break;
              }
              
              ++inputPos;
           }
         return vowels; 
    }  
  
   public int vowelCnt(String vowel) //This method counts the number of vowels in a string
   {
    int vowelLngth = vowel.length();
    int numVowels = 0;
    int inputPos = 0;
      
      while(inputPos < vowelLngth)
       {

              switch(vowel.charAt(inputPos))
              {
                 case 'A':
                 case 'a':
                   numVowels++;
                   break;
                case 'E':
                case 'e':
                  numVowels++;
                  break;
                case 'I':
                case 'i':
                  numVowels++;
                  break;
                case 'O':
                case 'o':
                  numVowels++;
                  break;
                case 'U':
                case 'u':
                  numVowels++;
                  break;
                default:
                  break;
              }
              
              ++inputPos;
           }
         return numVowels; 
      
   }
}