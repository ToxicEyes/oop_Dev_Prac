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
 float b,h;
 Rectangle(float b,float h){
  this.b = b;
  this.h = h;
 }

 public void  draw(){
  System.out.println("Drawing Rectangle");
 }

 public void 
}

class Prac8{
 public static void main(String[] args){
  Circle c = new Circle(12);
  c.draw();
  c.get_area();
 }
}