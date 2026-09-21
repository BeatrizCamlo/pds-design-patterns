package visitor;

public class Horse extends Animal {
    
    public Horse(String nome, boolean isDomestico) {
        super(nome, isDomestico);
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
