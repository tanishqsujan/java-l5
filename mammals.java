class Mammal{
    void mam(){
        System.out.println("Inside Mammal class");
    }
}
class Lion extends Mammal{
    void roar(){
        System.out.println("Inside Lion class");
    }
}
class Human extends Mammal{
    void hum(){
        System.out.println("Inside Human class");
    }
}

public class mammals{
    public static void main(String[] args){
        Lion l= new Lion();
        Human h= new Human();
        h.hum();
        l.roar();
        l.mam();
        h.mam();
    }
}