package visitor;

public interface AnimalVisitor {
    public void visit(Dog dog);
    public void visit(Cat cat);
    public void visit(Horse horse);
}