package Class;
class Parent{
    public void property(){
        System.out.println("Land+cash+gold");
    }
    public void marry(){
        System.out.println("Relativegirl");
    }
}

class Child extends Parent{
    //OVERRIDING
    public void marry(){
        //REIMPLEMENTATION
        System.out.println("Someother girl");
    }

}
public class test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.property();
        p1.marry();

        System.out.println();
        Child c1 = new Child();
        c1.property();
        c1.marry();


        System.out.println();
        Parent p2 = new Child();
        p2.property();
        p2.marry();

    }
}

