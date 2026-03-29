package inheritance;

public class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("barking");
    }
}
class cat extends Dog{
    @Override
    void sound(){
        System.out.println("meow");
    }
}
class main{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();
        cat c1 = new cat();
        c1.sound();
    }
}

