abstract class Shape{
 
 abstract double area();
}

class Rectangle extends Shape{

 public double area(){
   return (2*3);
 }
}

class Triangle extends Shape{
 public double area(){
     return 0.5*3*2;
 }
}


class Prac7 {
 
 public static void main(String[] args){
  Shape s = new Rectangle();
  System.out.println("Area of Rectangle:"+s.area());

  Shape s1 = new Triangle();
  System.out.println("Area of Triangle: "+s1.area());
 }
}
