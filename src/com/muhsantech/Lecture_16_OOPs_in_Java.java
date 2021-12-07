package com.muhsantech;


//class Pen{
//    String color;
//    String type;// ballpoint; gel
//    public void write(){
//        System.out.println("Writing someting");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//    }
//}
//
//class Student{
//    String name;
//    int age;
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//    // Constructor with out Parmeter
//    Student(){
//        System.out.println("constructor called");
//    }
//    // Constructor with Parmeter
//    Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    // Copy Constructor
//    Student(Student s2){
//        this.name =s2.name;
//        this.age = s2.age;
//    }
//}
//
//class YourStutent{
//    String name;
//    int age;
//    public void printInfo(int age) {
//        System.out.println(age);
//    }
//    public void printInfo(String name) {
//        System.out.println(name);
//    }
//    public  void printInfo(String name, int age) {
//        System.out.println(name + " " +age);
//    }
//}

/*bstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new Animal");
    }
    public void eat(){
        System.out.println("Animal ears");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}*/

/*interface Animal{
    int eyes = 2;
    void walk();
//    public void walk();
}
interface Herbivore {
}

class Horse implements Animal, Herbivore{
    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}*/

class Student{
    String name;
    static String school;
    public static void changeSchool(){
        school = "NewSchool";
    }
}

public class Lecture_16_OOPs_in_Java {
    public static void main(String[] args) {
//        Horse horse = new Horse();
        Student.school = "JMV";
        Student student = new Student();
        student.name = "Ali";
//        System.out.println(student.school);


        //OOPs ---> Object Oriented Programming
        // Pen Class
//        Pen pen= new Pen();
//        pen.color = "blue";
//        pen.type = "gel";
////        pen.write();
//
//        Pen pen1 = new Pen();
//        pen1.color = "Black";
//        pen1.type = "ballpoint";
//        pen.printColor();
//        pen1.printColor();
//        System.out.println();
//
//        // Student Class
//        // Constructor with Parmeter
//        Student s = new Student("Muhsan javed", 18);// create object plus insert Value name and age
//        s.printInfo(); // Called
//        // Constructor with out Parmeter
//        Student s1 = new Student();
//        s1.name = "Ali Hyder"; // insert name
//        s1.age = 17; // insert age
//        s1.printInfo(); // called
//        // Copy Constructor
//        Student s2 = new Student(s1);
//        s2.printInfo();
//
////        YourStutent s1 = new YourStutent("Muhsan",32);
//        YourStutent ss1 = new YourStutent();
//        ss1.name = "Ali";
//        ss1.age = 11;
//        ss1.printInfo(s1.name, s1.age);

//        YourStutent s2= new YourStutent(17);


        System.out.println("\n\n");
        // Inheritance

//        Triangle t1 = new Triangle();
//        t1.color= "Red";
    }
}
// Single level Inheritance
/*
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

// extends keyworld

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}
*/

// Hierarchial Inheritance
/*class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}*/

// Multi Level Inheritance
/*

class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}
*/
// Hierarchial Inheritance
/*class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.17)*r*r);
    }
}*/
// Hybrid Inheritance