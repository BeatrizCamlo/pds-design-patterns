package visitor;

public class Speak implements AnimalVisitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("The dog " + dog.getNome() + " is barking: woof woof");
    }

    @Override
    public void visit(Cat cat) {
        System.out.printf("The cat %s meows: meow meow%n", cat.getNome());
    }
    
    @Override
    public void visit(Horse horse) {
        System.out.printf("The horse %s is neighing%n", horse.getNome());
    }
}