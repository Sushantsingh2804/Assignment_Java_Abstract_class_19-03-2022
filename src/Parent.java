abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent{
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent{

    void message() {
        System.out.println("This is Second subclass");
    }
}
class Main_class {
    public static void main(String[] args) {
       Parent first= new FirstSubclass();
       Parent second = new SecondSubclass();
       first.message();
       second.message();
    }
}
