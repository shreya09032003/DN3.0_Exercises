package WEEK1_DesignPattern.FactoryMethod;

public class ExcelDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing Excel Document.");
    }
}
