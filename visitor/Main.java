package visitor;

public class Main {
    public static void main(String [] args){

        AnimalVisitor speak = new Speak();
        Dog casemiro = new Dog("casemiro", true);

        casemiro.accept(speak);

    }
}
