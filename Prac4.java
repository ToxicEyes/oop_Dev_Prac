public class Main {
 //Q-3 Write a java program that demostrate use of constructor overloading
 /*
 String name;
 int id;

 //constructor overloading
 Prac4(){
  System.out.println("Default Constructor Called");
 }

 Prac4(String name,int id){
  this.name = name;
  this.id = id;
 }

 public static void main(String[] args){
  Prac4 s1 = new Prac4();
  System.out.println("Name:   "+s1.name+"  Id:   "+s1.id);

  Prac4 s2 = new Prac4("Dev",17);
  System.out.println("Name:   "+s2.name+"  Id:   "+s2.id);
 }*/


 //Q-1rite a program that declares a class named Person. It should have instance variables to record name, age and salary. Use new operator to create a Person object. Set and display its instance variables. Add a
//constructor to the Person 

//instance variables
/*
int age;
long salary;
String name;


Prac4(int age,long salary,String name){
 this.age = age;
 this.salary = salary;
 this.name = name;
}

public static void main(String[] args){

 Prac4 p1 = new Prac4(19,50000,"Dev");
 System.out.println("Age: "+p1.age+" Salary: "+p1.salary+" Name: "+p1.name);

}*/

//Q-2
/*
The employee list for a company contains employee code, name, designation and basic
pay. The employee is given HRA of 10% of the basic and DA of 45% of the basic pay. The total pay
of the employee is calculated as Basic pay+HRA+ DA. Write a class to define the details of the
employee. Write a constructor to assign the required initial values. Add a method to calculate HRA, DA and Total pay and print them out. Write another class with a main method. Create objects for
three different employees and calculate the HRA, DA and total
*/

/*
int emp_code;
String name;
String designation;
public static double basic_pay;
public static double TotalPay;
public static double HRA,DA;


Main(int emp_code,String name,String designation,long basic_pay){
 this.emp_code = emp_code;
 this.name = name;
 this.designation = designation;
 this.basic_pay = basic_pay;
}

public void display(){
    System.out.println("Name: "+name+"Designation: "+designation+"TotalPay: "+TotalPay+"EmployeeId:"+emp_code);
}

void calc(){
HRA = basic_pay*0.1;
DA = basic_pay*0.45;
TotalPay = basic_pay+HRA+DA;
}



public static void main(String[] args){

Main p1 = new Main(102,"Dev","SEO",50000);


//System.out.println("Name: "+p1.name+"  ,Designation:  "+p1.designation+" ,TotalPay: "+TotalPay+"  ,Employee_id: "+p1.emp_code);
p1.calc();
p1.display();

Main p2 = new Main(101,"Akash","CEO",60000);
p2.calc();
p2.display();

Main p3 = new Main(112,"Aryan","Emoloyee",45000);
p3.calc();
p3.display();

}*/
}
