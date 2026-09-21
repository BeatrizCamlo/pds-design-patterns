package visitor;

public class Main {
    public static void main(String [] args){

        AnimalVisitor speak = new Speak();
        Dog casemiro = new Dog("casemiro", true);
        Cat gilson = new Cat("gilson", true);
        Horse peDePano = new Horse("pe de pano", false);
        casemiro.accept(speak);
        gilson.accept(speak);
        peDePano.accept(speak);

    }
}
