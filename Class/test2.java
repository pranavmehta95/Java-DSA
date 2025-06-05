package Class;
class Plane{
    public void takeoff(){
        System.out.println("Plane took off.");
    }
    public void fly(){
        System.out.println("Plane is flying.");
    }
    public void land(){
        System.out.println("Plane is landing.");
    }
}

class Passengerplane extends Plane{
    public void takeoff(){
        System.out.println("Passenger-Plane took off.");
    }
    public void fly(){
        System.out.println("Passenger-Plane is flying.");
    }
    public void land(){
        System.out.println("Passenger-Plane is landing.");
    }
}

class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("Cargo-Plane took off.");
    }
    public void fly(){
        System.out.println("Cargo-Plane is flying.");
    }
    public void land(){
        System.out.println("Cargo-Plane is landing.");
    }

}

class FighterPlane extends Plane{
    public void takeoff(){
        System.out.println("Fighter-Plane took off.");
    }
    public void fly(){
        System.out.println("Fighter-Plane is flying.");
    }
    public void land(){
        System.out.println("Fighter-Plane is landing.");
    }
}

class Airport{
    public void allowPlane(Plane p){
        p.takeoff();
        p.fly();
        p.land();

        System.out.println();
    }
}
public class test2 {
    public static void main(String[] args) {
        Passengerplane p = new Passengerplane();
        FighterPlane f = new FighterPlane();
        CargoPlane c = new CargoPlane();

        Airport a = new Airport();
        a.allowPlane(p);
        a.allowPlane(f);
        a.allowPlane(c);




        // Plane p = null;

        // p = new Passengerplane();
        // p.takeoff();
        // p.fly();
        // p.land();

        // System.out.println();
        // p = new CargoPlane();
        // p.takeoff();
        // p.fly();
        // p.land();

        // System.out.println();
        // p = new FighterPlane();
        // p.takeoff();
        // p.fly();
        // p.land();
    }
}
