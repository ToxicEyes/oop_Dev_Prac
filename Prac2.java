import java.util.Scanner;

public class Prac2 {
 //-----------------------------------------------
 /* 
 //EX-2-1
 static int gcd(int a,int b){
  int gcd = 1;
  for(int i = 1;i<=a && i<=b;i++){
   if( a%i == 0 && b%i == 0){
    gcd = i;
   }
  }
  return gcd;
 }

 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter First Number: ");
  int a = input.nextInt();
  System.out.println("Enter Second Number: ");
  int b = input.nextInt();
  int c = gcd(a,b);
  System.out.printf("GCD of %d and %d is %d",a,b,c);
 }*/
 
 //-----------------------------------------------


 
 //-----------------------------------------------
 /*
//EX-2-3
 public static void ReverseArray(int[] a){
 
  for(int i = a.length - 1;i>=0;i--){
   System.out.print("  "+a[i]);
  }
 }

 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int[] a = new int[10];
  System.out.println("Enter 10 Numbers: ");


  
  for(int i = 0;i<10;i++){
   System.out.println("Enter Number "+i+":");
   a[i] = input.nextInt();
  }
  
  System.out.println("Before...");
  for(int i = 0;i<a.length;i++){
   System.out.print("  "+a[i]);
  }

  System.out.println(" ");
  System.out.println("After...");
  //Calling ReverseArray method
  ReverseArray(a);
 }*/

 //-----------------------------------------------



  
 //-----------------------------------------------
 /*
 //EX-2-4
 public static void main(String[] args){

  
  Scanner input = new Scanner(System.in);
  int[][] a = new int[6][6];
  int i=0,j=0;

  //or we can use Math.random() 

  a[0] = new int[] {0,0,1,1,0,0};
  a[1] = new int[] {1,1,1,0,0,0};
  a[2] = new int[] {1,1,1,1,1,0};
  a[3] = new int[] {0,0,0,0,0,0};
  a[4] = new int[] {1,1,1,1,1,1};
  a[5] = new int[] {1,0,1,0,1,0};

  System.out.println("Before");
  for(i = 0;i<a.length;i++){
   for(j = 0;j<a[i].length;j++){
    System.out.print("  "+a[i][j]);
   }
   System.out.println(" ");
   System.out.println(" ");
  }

 //for rows
  for(i = 0;i<a.length;i++){
   int counter = 0;
   for(j =0;j<a[i].length-1;j++){
    if(a[i][j] == 1){
     counter = counter + 1;
    }
   }
   if (counter%2==0)
   {
    a[i][j] = 1;
   }
   else
   {
    a[i][j] = 0;
   }
  }

  //for columns
  for( i = 0;i<a.length;i++){
   int colCounter = 0;
   for(j = 0;j<a[i].length-1;j++){
    if(a[j][i] == 1){
     colCounter = colCounter + 1;
    }
   }
   if(colCounter%2 == 0){
    a[j][i] = 1;
   }
   else{
    a[j][i] = 0;
   }
  }


  System.out.println("After");
  for(i = 0;i<a.length;i++){
   for(j = 0;j<a[i].length;j++){
    System.out.print("  "+a[i][j]);
   }
   System.out.println(" ");
   System.out.println(" ");
  }
 }
 */

 //-----------------------------------------------




  //-----------------------------------------------
  /*
  //EX-2-5
  //demonstration of jagged array
  public static void main(String[] args){

   int[][] a = new int[5][]; //base 5

   a[0] = new int[] {1,2,3};
   a[1] = new int[] {4,5,6,7};
   a[2] = new int[] {8,9};
   a[3] = new int[] {10};
   a[4] = new int[] {11,12,13,14,15};

   //display jagged array
   System.out.println("--:Elements in Jagged Array:--");
   for(int i = 0;i<a.length;i++){
    for(int j = 0;j<a[i].length;j++){
     System.out.print("  "+a[i][j]);
    }
    System.out.println(" ");
    System.out.println(" ");
   }
  }
  */
    //-----------------------------------------------





 /*
 //EX-2-6
 public static void main(String[] args){
  int[][] a = new int[4][]; //base = 4

  for(int i =0;i<a.length;i++){
   a[i] = new int[i+1];
  }


  //OR
  //a[0] = new int[1];
  //a[1] = new int[2];
  //a[2] = new int[3];
  //a[3] = new int[4];

  int counter = 0;
  for(int i = 0;i<a.length;i++){
   for(int j = 0;j<a[i].length;j++){
    a[i][j] = counter++;
   }
  }

  //display
  for(int i = 0;i<a.length;i++){
   for(int j = 0;j<a[i].length;j++){
    System.out.print("  "+a[i][j]);
   }
   System.out.println("  ");
   System.out.println("  ");
  }
 }*/

   //-----------------------------------------------
   




  
  //EX-2-7
  /*public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter A Number: ");
   int div = 2;
   int num = input.nextInt();
    while(num>1){
     if(num%div == 0){
      System.out.print("  "+div);
      num = num / div;
     }
     else{
      div++;
     }
    }
  }*/

  }
 


 




