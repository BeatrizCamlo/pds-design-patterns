package visitor;

public class Cat extends Animal{

    public Cat(String nome, boolean isDomestico) {
        super(nome, isDomestico);
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

}
