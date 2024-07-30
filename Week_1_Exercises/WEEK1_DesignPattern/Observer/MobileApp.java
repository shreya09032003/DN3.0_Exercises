package WEEK1_DesignPattern.Observer;

public class MobileApp implements Observer {
    @Override
    public void update(String stockName, float stockPrice) {
        System.out.println("Mobile App - Stock: " + stockName + " Price: " + stockPrice);
    }
}

