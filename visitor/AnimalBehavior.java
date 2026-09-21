package visitor;

public interface AnimalBehavior {

    public abstract void accept(AnimalVisitor animalVisitor);
}
