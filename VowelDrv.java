/* File: VowelDrvr
 * Description: To test the methods of the VowelSrv Class
 * Author: Dewey Milton
 * Date: 10/2/2015
*/ 

public class VowelDrv
{
  public static void main(String[] args)
  {
    VowelSrv testObj = new VowelSrv(); 
    
    String testCase_1 = "", testCase_2 = "A", testCase_3 = "e", testCase_4 = "DbZwRlMp";
    String testCase_5 = "aeiouaeiou", testCase_6 = "AEIOUOUIEA", testCase_7 = "aEiOuUoIeA", testCase_8 = "f";
    boolean testPass = true;
    
  
    
       //TestCase 1 Vowel length of empty string
           
         System.out.println("Test case 1 of empty string for: " + testCase_1 + " number of characters 0");
         if (testObj.vowelCnt(testCase_1) == 0) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
         //TestCase 1 for vowel Finder
         
         if(testObj.vowels(testCase_1).equals(testCase_1)){
            System.out.println("Vowel Finder 1 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
          
         
       //TestCase 2 Vowel length 1
           
         System.out.println("Test case 1 of empty string for: :" + testCase_2 + ": number of characters 1");
         if (testObj.vowelCnt(testCase_2) == 1) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
                  //TestCase 2 for vowel Finder
         
         if(testObj.vowels(testCase_2).equals(testCase_2.toLowerCase())){
            System.out.println("Vowel Finder 2 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
            //TestCase 3 Vowel length 1
           
         System.out.println("Test case 2 of empty string for: :" + testCase_3 + ": number of characters 1");
         if (testObj.vowelCnt(testCase_3) == 1) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
          //TestCase 3 for vowel Finder
         
         if(testObj.vowels(testCase_3).equals(testCase_3.toLowerCase())){
            System.out.println("Vowel Finder 3 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
    
            //TestCase 4 length 8 no vowels

         System.out.println("Test case 4 of empty string for: :" + testCase_4 + ": number of characters 8 No vowel");
         if (testObj.vowelCnt(testCase_4) == 0) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
          //TestCase 4 for vowel Finder
         
         if(!testObj.vowels(testCase_4).equals(testCase_4.toLowerCase())){
            System.out.println("Vowel Finder 4 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
            //TestCase 5 length 10 & 10 vowels

         System.out.println("Test case 5 all lowercase vowels: :" + testCase_5 + ": 10 number of characters");
         if (testObj.vowelCnt(testCase_5) == 10) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
          //TestCase 5 for vowel Finder
         
         if(testObj.vowels(testCase_5).equals(testCase_5.toLowerCase())){
            System.out.println("Vowel Finder 5 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
    
            //TestCase 6 length 10 & 10 vowels all caps

         System.out.println("Test case 6 all caps: :" + testCase_6 + ": number of characters 10");
         if (testObj.vowelCnt(testCase_6) == 10) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
          //TestCase 6 for vowel Finder
         
         if(testObj.vowels(testCase_6).equals(testCase_6.toLowerCase())){
            System.out.println("Vowel Finder 2 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
         
       //TestCase 7 length 10 & 10 vowels all mixed

         System.out.println("Test case 7 all mixed vowels: :" + testCase_7 + ": number of characters 10");
         if (testObj.vowelCnt(testCase_7) == 10) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
          //TestCase 7 for vowel Finder
         
         if(testObj.vowels(testCase_7).equals(testCase_7.toLowerCase())){
            System.out.println("Vowel Finder 7 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
         
            //TestCase 8 length 10 & 10 vowels all caps

         System.out.println("Test case 8 non vowel: :" + testCase_8 + ": number of characters 1");
         if (testObj.vowelCnt(testCase_8) == 0) 
         {
           System.out.println("Pass");
         }
         else
         {
           System.out.println("Fail");
           testPass = false;
         }
         
          //TestCase 8 for vowel Finder
         
         if(!testObj.vowels(testCase_8).equals(testCase_8.toLowerCase())){
            System.out.println("Vowel Finder 8 Pass");
            System.out.println();
         }
         else
          {
           System.out.println("Fail");
           testPass = false;
         }
     
  }
}