package WEEK1_DesignPattern.FactoryMethod;

public class PdfDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing PDF Document.");
    }
}
