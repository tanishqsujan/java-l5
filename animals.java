class Animal{
    void eat(){
        System.out.println("Eating.... Animal Class.... eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Roaring.... Lion class.... roar method");
    }
}
class Cub extends Lion{
    void weep(){
        System.out.println("Weeping.... Cub class.... weep method");
    }
}

public class animals{
    public static void main(String[] args){
        Cub c= new Cub();
        c.weep();
        c.roar();
        c.eat();

    }
}