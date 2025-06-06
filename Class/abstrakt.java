// package Class;

// //EXPOSING THE SET OF SERVICES BUT HIDING THE INTERNAL IMPLEMENTATION
// abstract class Plane{
//     public abstract void takeoff();
//     public abstract void fly();
//     public abstract void land();
// }

// class Passengerplane extends Plane{
//     public void takeoff(){
//         System.out.println("Passenger-Plane took off.");
//     }
//     public void fly(){
//         System.out.println("Passenger-Plane is flying.");
//     }
//     public void land(){
//         System.out.println("Passenger-Plane is landing.");
//     }
// }

// class CargoPlane extends Plane{
//     public void takeoff(){
//         System.out.println("Cargo-Plane took off.");
//     }
//     public void fly(){
//         System.out.println("Cargo-Plane is flying.");
//     }
//     public void land(){
//         System.out.println("Cargo-Plane is landing.");
//     }

// }

// class FighterPlane extends Plane{
//     public void takeoff(){
//         System.out.println("Fighter-Plane took off.");
//     }
//     public void fly(){
//         System.out.println("Fighter-Plane is flying.");
//     }
//     public void land(){
//         System.out.println("Fighter-Plane is landing.");
//     }
// }

// class Airport{
//     public void allowPlane(Plane ref){
//         ref.takeoff();
//         ref.fly();
//         ref.land();
//         System.out.println();
//     }
// }
// public class abstrakt {
//     public static void main(String[] args) {
//     Airport a = new Airport();
//     a.allowPlane(new Passengerplane());
//     a.allowPlane(new FighterPlane());
//     a.allowPlane(new CargoPlane());
    

        
//     }
// }



// package Class;
// abstract class Person{
//     String name;
//     int age;
//     float height;


//     Person(String name, int age, float height){
//         this.name = name;   
//         this.age = age;
//         this.height = height;
//     }
// }
// class Student extends Person{
//     int marks;
//     float avg;

//     Student(String name, int age, float height, int marks, float avg){
//     //TO CALL PARAMETERISED CONSTRUCTOR OF PARENT FROM CHILD CLASS
//     super(name,age,height);
//     this.marks = marks;
//     this.avg = avg;

//     }
//     public void display(){
//         System.out.println("Nmae is : "+name);
//         System.out.println("Age is :"+age);
//         System.out.println("Height is : "+height);
//         System.out.println("Marks is : "+marks);
//         System.out.println("Average is :"+avg);
        
//     }
// }

// public class abstrakt{
//     public static void main(String[] args) {
//     Student student =  new Student("Pranav", 021, 5.3f, 70, 80);
//     student.display();
//     }
    
// }



package Class;

abstract class Birds {
    public abstract void fly();
    public abstract void eat();
}

class Eagle extends Birds {
    public void fly() {
        System.out.println("Eagle flies high.");
    }
    public void eat() {
        System.out.println("Eagle eats meat.");
    }
}

class Crow extends Birds {
    public void fly() {
        System.out.println("Crow flies at medium height.");
    }
    public void eat() {
        System.out.println("Crow eats grains.");
    }
}

class Sky {
    public void allowBirds(Birds ref) {
        ref.fly();
        ref.eat();
        System.out.println();
    }
}

public class abstrakt {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allowBirds(new Eagle());
        sky.allowBirds(new Crow());
    }
}