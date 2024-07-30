package WEEK1_DesignPattern.FactoryMethod;

public class WordDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing Word Document.");
    }
}
