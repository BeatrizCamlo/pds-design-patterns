package visitor;

public abstract class Animal implements AnimalBehavior {

    private String nome;
    private boolean isDomestico;

    public Animal(String nome, boolean isDomestico) {
        this.nome = nome;
        this.isDomestico = isDomestico;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isDomestico() {
        return this.isDomestico;
    }

    public abstract void accept(AnimalVisitor visitor);
}