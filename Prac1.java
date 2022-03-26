import java.util.Scanner;

public class Prac1 {
 public static void main(String[] args){



  //-----------------------------------------------
  /*
  //EX-1-1:-Write a program to display “Welcome To Java World”.
  
  System.out.println("Welcome To Java World.");*/
  //-----------------------------------------------




  //-----------------------------------------------
  
 /*EX-1-2:-Write a program that solves the following equation and displays the value x and y:
1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
ax+by=e x=ed-bf/ad-bc
cx+dy=f y=af-ec/ad-bc*/

/*
 float a = Float.parseFloat(args[0]);
 float b = Float.parseFloat(args[1]);
 float c = Float.parseFloat(args[2]);

 float d = Float.parseFloat(args[3]);
 float e = Float.parseFloat(args[4]);
 float f = Float.parseFloat(args[5]);

 System.out.println("Values From Equation-1:-");
 System.out.println("a: "+a);
 System.out.println("b: "+b);
 System.out.println("e: "+e);

 System.out.println("Values From Equation-2:-");
 System.out.println("c: "+c);
 System.out.println("d: "+d);
 System.out.println("f: "+f);

 float x = ((e * d) - (b * f)) / ((a * d) - (b * c));
 float y = ((a * f) - (e * c)) / ((a * d) - (b * c));

 System.out.println("Value Of X: "+x+", Value Of Y: "+y);*/
 //-----------------------------------------------





 //-----------------------------------------------
 /*
 //EX-1-3:-. Write a program that reads a number in meters, converts it to feet, and displays the result.
 double met = Double.parseDouble(args[0]);
 System.out.println("Number in Meters: "+met);
 double result = 3.28084 * met;
 System.out.println("Number in Feet: "+result);*/
 //-----------------------------------------------



 //-----------------------------------------------
 /*EX-1-4:-Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in
kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a
weight in pounds and height in inches and displays the BMI. Note:- 1 pound=.45359237 Kg and 1 */
 

 /*
 double weight = Float.parseFloat(args[0]);
 double height = Float.parseFloat(args[1]);
 System.out.println("Weight in Pounds: "+weight);
 System.out.println("Height in Meters: "+height);

 double weightInpound = 0.45359237 * weight;
 double heightInmeters = 0.0254 * height;

 double BMI = weightInpound / (heightInmeters * heightInmeters);

 System.out.println("BMI: "+BMI);*/
//-----------------------------------------------




//-----------------------------------------------
 /*
 //EX-1-5:-Write a program to find whether the number is prime or not
 int counter = 0;
 int no = Integer.parseInt(args[0]);
 for(int i = 2 ; i<no ; i++){
  if(no%i==0){
   counter = 1;
   break;
  }
 }


 if(counter == 1){
  System.out.println("Not Prime Number!");
 }
 else{
  System.out.println("Prime Number!");
 }*/
 //-----------------------------------------------



 //-----------------------------------------------
 /*
 //EX-1-6:-. Write a program to find a greater number among given three numbers using a) ternary operator and b) nested if
 int a = Integer.parseInt(args[0]);
 int b = Integer.parseInt(args[1]);
 int c = Integer.parseInt(args[2]);

 int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
 System.out.println("Greatest Number: "+max);*/
  //-----------------------------------------------





 //-----------------------------------------------
 /*
 //EX-1-7:-Write a program to print the Fibonacci series
 Scanner input = new Scanner(System.in);
 int num1 = 0,num2 = 1,num3;
 System.out.println("Enter Total Number of Elements: ");
 int n = input.nextInt();

 
 System.out.print(num1+"  "+num2);

 for(int i = 2;i<n;i++){
  //Started from i = 2 because first two numbers are already printed
   num3 = num2 + num1;
   System.out.print("  "+num3);
  num1 = num2;
  num2 = num3;
 }*/
 //-----------------------------------------------



//-----------------------------------------------
/*
//EX-1-8:-Write a program to find grade from percentage with three subject mark using switch case statement

Scanner input = new Scanner(System.in);
System.out.println("--:Enter Marks Of Three Subjects(out of 100):--");


System.out.println("Enter Marks Of Subject-1:");
int m1 = input.nextInt();

System.out.println("Enter Marks Of Subject-2:");
int m2 = input.nextInt();

System.out.println("Enter Marks Of Subject-3:");
int m3 = input.nextInt();

int total = m1+m2+m3;

int perc = (total*100)/300;

System.out.println("Percentage: "+perc);

switch(perc / 10){
 case 10:
 System.out.println("Grade - A");
 break;

 case 9:
 System.out.println("Grade - A");
 break;

 case 8:
 System.out.println("Grade - B");
 break;

 case 7:
 System.out.println("Grade - C");
 break;

 case 6:
 System.out.println("Grade - D");
 break;

 case 5:
 System.out.println("Grade - E");
 break;

 case 4:
 System.out.println("Grade - F");
 break;

 default:
 System.out.println("Failed");
}*/
//-----------------------------------------------

 }
}
