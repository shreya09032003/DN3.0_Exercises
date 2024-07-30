package WEEK1_DesignPattern.Observer;

public class WebApp implements Observer {
    @Override
    public void update(String stockName, float stockPrice) {
        System.out.println("Web App - Stock: " + stockName + " Price: " + stockPrice);
    }
}
