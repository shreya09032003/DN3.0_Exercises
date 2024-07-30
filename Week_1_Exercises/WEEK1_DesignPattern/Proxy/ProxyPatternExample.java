package WEEK1_DesignPattern.Proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display(); // Image will be loaded and displayed
        image1.display(); // Image will be displayed from cache
        image2.display(); // Image will be loaded and displayed
    }
}
