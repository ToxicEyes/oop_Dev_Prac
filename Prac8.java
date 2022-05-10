/*
EX-8-1
Write a program that illustrates interface inheritance. 
Interface A is extended by A1 and A2.
 InterfaceA12inherits from both P1 and P2.Each interface declares one constant and one method.
 Class BimplementsA12.Instantiate B and invoke each of its methods. Each method displays one 

*/

/*
 interface A{
  final int a = 5;
  void methodA();
 }

 interface A1 extends A{
 final int a1 = 10;
  void methodA1();
 }

 interface A2 extends A{
  final int a2 = 15;
  void methodA2();
 }

 interface A12 extends A1,A2{
 final int a12 = 20;
  void methodA12();
 }


class B implements A12{
 public void methodA12(){
  System.out.println("A12 class method constant: "+a12);
 }

 public void methodA2(){
  System.out.println("A2 class method constant: "+a2);
 }

 public void methodA1(){
  System.out.println("A1 class method constant: "+a1);
 }

 public void methodA(){
  System.out.println("A Class method constant: "+a);
 }
}

class Prac8{
public static void main(String[] args){
 B obj = new B();
 obj.methodA12();
 obj.methodA2();
 obj.methodA1();
 obj.methodA();
}
}*/




/*
EX-8-2 Write an interface called shape with methods draw() and getArea().
 Further design twoclassescalled‘Circle’ and ‘Rectangle’ that implements ‘Shape’ to 
 compute area of respective shapes. 
Useappropriategetter and setter methods. Write a java program for the same. 
*/


/*
interface Shape{
 public void draw();
 public void get_area();
}

class Circle implements Shape{
 float r;
 Circle(float r){
 this.r = r;
}

 public void draw(){
  System.out.println("Drawing Circle");
 }

 public void get_area(){
  System.out.println("Area of Cirlce: "+(3.14*r*r));
 }
}

class Rectangle implements Shape{
 float l,w;
  Rectangle(float l,float w){
  this.l = l;
  this.w = w;
 }

 public void  draw(){
  System.out.println("Drawing Rectangle");
 }

 public void get_area(){
  System.out.println("Area of Rectangle:"+(l*w));
 }
}

class Prac8{
 public static void main(String[] args){
  Circle c = new Circle(12);
  c.draw();
  c.get_area();

  Rectangle r = new Rectangle(12, 18);
  r.draw();
  r.get_area();
 }
}*/