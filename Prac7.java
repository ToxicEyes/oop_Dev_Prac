/*

EX-7-1 : The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato.
Write an applicationthatdemonstrates how to establish this class hierarchy.
Declare one instance variable of type String that indicatesthecolor of a vegetable.
Create and display instances of these objects. 
Override the toString() methodof Objecttoreturn a string with the name of the vegetable and its color. .
*/


/*
public abstract class Prac7{
  public String color;
  public abstract String toString();


  public static void main(String[] args){
    Prac7 v = new Potato();
    System.out.println(v.toString());

    Prac7 v1 = new Brinjal();
    System.out.println(v1.toString());

    Prac7 v2 = new Tomato();
    System.out.println(v2.toString());
  }
}

class Potato extends Prac7{
  Potato(){
    color = "Brown";
  }

  public String toString(){
    return ("Color of Potato: "+this.color);
  }
}


class Brinjal extends Prac7{
  Brinjal(){
    color = "Purple";
  }

  public String toString(){
    return ("Color Of Brinjal: "+this.color);
  } 
}

class Tomato extends Prac7{
  Tomato(){
    color = "Red";
  }

  public String toString(){
    return ("Color of Tomato: "+this.color);
  }
}*/



/*abstract class Shape{
 
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
}*/
