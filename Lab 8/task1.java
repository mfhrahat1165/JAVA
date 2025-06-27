class Animal {

void sound() {

System.out.println("Sound");

}
}
//override
class Dog extends Animal {

void sound() {

System.out.println("Dog barks");

}
}
//override 
class Cat extends Animal { 
    
void sound() {

System.out.println("Cat meows");

}
}

public class task1 {

public static void main(String[] args) 
{ 
    Animal a = new Animal();
    Dog d = new Dog(); 
    Cat c = new Cat();
    a.sound();
    d.sound();
    c.sound();

}
}