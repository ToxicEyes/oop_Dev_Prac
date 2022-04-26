
/*
Q-1
Write a program to illustrate the concept of class with Method overl
*/

/*
class Vehicle {

 void run(){
  System.out.println("Vehicle is Running");
 }
}

public class Prac5 extends Vehicle{
 void run(){
  System.out.println("Bike is Running!");
 }

 public static void main(String[] args){
  Prac5 p = new Prac5();
  p.run();

  Vehicle p1 = new Vehicle();
  p1.run();
 }
}
*/

//Q3 - . Write a program to illustrate the concept of Single inheritance
/*
class Vehicle{
 void run(){
  System.out.println("Vehicle is Running");
 }
}

class Bike extends Vehicle{
 void speedUp(){
  System.out.println("SpeedingUp");
 }

 void changeGear(){
  System.out.println("Gear Changed");
 }
}

class Prac5{
 public static void main(String[] args){
  Bike b = new Bike();
  b.run();
  b.speedUp();
  b.changeGear();
 }
}*/






//Q-4
// Write a program to illustrate the concept of Multi level inheritance
/*
class A{
 void one(){
  System.out.println("Java");
 }
}

class B extends A{
 void two(){
  System.out.println("T");
 }
}

class C extends B{
 void three(){
  System.out.println("Point");
 }
}

class Prac5{
 public static void main(String[] args){
  C c = new C();
  c.one();
  c.two();
  c.three();
 }
}
*/


//Q-2
// Write a program to illustrate the concept of Dynamic Polymorphism.
/*
class Bank{
 float GROI(){
  return 0;
 }
}

class SBI extends Bank{
 float GROI(){
  return 7.6f;
 }
}

class HDFC extends Bank{
 float GROI(){
  return 8.8f;
 }
}

class AXIS extends Bank{
 float GROI(){
  return 13.5f;
 }
}

class Prac5{
 public static void main(String[] args){
  Bank b = new SBI();
  System.out.println("SBI Rate OF Interest:"+b.GROI());

  AXIS b1 = new AXIS();
  System.out.println("AXIS Rate OF Interest:"+b1.GROI());

  HDFC b2 = new HDFC();
  System.out.println("HDFC Rate OF Interest:"+b2.GROI());
 }
}
*/
