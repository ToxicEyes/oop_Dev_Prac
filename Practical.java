import java.util.Scanner;
public class Practical
{
/*
EX-4-1. Write a Java Program to Count Number of Words in Given String
*/

/*
public static void main(String[] args){
 
 String s = "I Love JAVA";
 System.out.println("Total Words In String: "+wordCounter(s));  
}

public static int wordCounter(String s){
 int counter = 0;
 char ch[] = new char[s.length()];
 for(int i = 0; i<s.length(); i++){
  ch[i]= s.charAt(i);
  if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0))){
   counter++;
  }
 }
 return counter;
}*/


/*
EX-4-2:Write a Java Program to Count the Occurrences of Each Character in String
*/

/*
	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str)
	{
		
		// Create an array of size 256
		// i.e. ASCII_SIZE
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println(
					"Number of Occurrence of "
					+ str.charAt(i)
					+ " is:" + count[str.charAt(i)]);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "JavatPoint";
		getOccuringChar(str);
	} */


 


/*
EX-4-3: Write a Java program to count number of occurrence of substring in given string.
*/

/*

 public static void main(String[] args){
   String myString = "HelloHelloFelloJelloHello";
   String TargetStr = "Hello";
   int lastIndex = 0,counter = 0;

   while(lastIndex != -1){
     lastIndex = myString.indexOf(TargetStr, lastIndex);

     if(lastIndex != -1){
       counter++;
       lastIndex = lastIndex + TargetStr.length();
     }
   }
   System.out.println(" "+counter);
 }*/


 /*
 EX-4-4:Write a program that prompts the user to enter a letter and check whether a letter is a vowel orconstant.
 */

/*
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 System.out.print("Enter Character : ");
 char ch = input.next().charAt(0);
 switch(Character.toLowerCase(ch))
 {
  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u':
   System.out.print(ch + " is vowel");
   break;
  default:
   System.out.print(ch + " is constant");
 }
 }
 */



 /*
 EX-4-5:  Assume a vehicle plate number consists of three uppercase letters followed by four digits. 
 Writeaprogram to generate a plate number
 */
/*
 public static void main(String[] args){
  int alpha1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
  int alpha2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
  int alpha3 = 'A' + (int)(Math.random() * ('Z' - 'A')); 

  int digit1 = (int)(Math.random() * 10);
  int digit2 = (int)(Math.random() * 10);
  int digit3 = (int)(Math.random() * 10);
  int digit4 = (int)(Math.random() * 10);

  System.out.println("" + (char)(alpha1) + ((char)(alpha2)) + 
   ((char)(alpha3)) + digit1 + digit2 + digit3 + digit4);
 }*/


 /*
EX-4-6
Write a program for calculator to accept an expression as a string in which the operands and operator areseparated by zero or more spaces. 
For ex: 3+4 and 3 + 4 are acceptable expressions
*/


 /*
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Equation : ");
  String str = input.nextLine();
  String a = str.replaceAll(" ","");
  
  if (a.length() < 3) {
   System.out.println(
    "Minimum 2 Opearator and 1 Opearand Required");
   System.exit(0);
  }

  int result = 0;
  int i = 0;

  while(a.charAt(i)!='+' && a.charAt(i)!='-' && a.charAt(i)!='*' && a.charAt(i)!='/')
  {
   i++;
  }

  switch (a.charAt(i)) {
   case '+' : 
    result = Integer.parseInt(a.substring(0,i))+Integer.parseInt(a.substring(i+1,a.length()));
    break;
   case '-' : 
    result = Integer.parseInt(a.substring(0,i))-Integer.parseInt(a.substring(i+1,a.length()));
    break;
   case '*' : 
    result = Integer.parseInt(a.substring(0,i))*Integer.parseInt(a.substring(i+1,a.length()));
    break;
   case '/' : 
    result = Integer.parseInt(a.substring(0,i))/Integer.parseInt(a.substring(i+1,a.length()));
    break;
  }

  System.out.println(a.substring(0,i) + ' ' + a.charAt(i) + ' ' + a.substring(i+1,a.length())
   + " = " + result);
 }*/
}
 









 