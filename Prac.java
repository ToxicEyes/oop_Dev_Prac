import java.util.Scanner;

public class Prac {
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int[][] a = new int[6][6];
  int i,j;

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


  System.out.println("After");
  for(i = 0;i<a.length;i++){
   for(j = 0;j<a[i].length;j++){
    System.out.print("  "+a[i][j]);
   }
   System.out.println(" ");
   System.out.println(" ");
  }

 }
}
 
