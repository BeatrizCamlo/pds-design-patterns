package visitor;

public class Dog extends Animal {

    public Dog(String nome, boolean isDomestico) {
        super(nome, isDomestico);
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

}