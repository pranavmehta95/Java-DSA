package Class;
class Animal{
    public void eat(){
        System.out.println("Animal is eating.");
    }
    public void sleep(){
        System.out.println("Animal is Slepping.");
    }
}
class monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is eating.");
    }
    public void sleep(){
        System.out.println("Monkey is Slepping.");
    }
}
class deer extends Animal{
    public void eat(){
        System.out.println("Deer is eating.");
    }
    public void sleep(){
        System.out.println("Deer is Slepping.");
    }
}
class lion extends Animal{
    public void eat(){
        System.out.println("Lion is eating.");
    }
    public void sleep(){
        System.out.println("Lion is Slepping.");
    }
}

class Forest{
    public void AllowAnimal(Animal a){
        a.eat();
        a.sleep();

        System.out.println();

    }
}
public class test3 {
    public static void main(String[] args) {
        monkey m = new monkey();
        deer d = new deer();
        lion l = new lion();



        System.out.println();
        Forest f = new Forest();
        f.AllowAnimal(m);
        f.AllowAnimal(d);
        f.AllowAnimal(l);




    }
}
