package WEEK1_DesignPattern.Builder;

public class ComputerTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                                .setCPU("Intel i9")
                                .setRAM("32GB")
                                .setStorage("1TB SSD")
                                .setGPU("NVIDIA RTX 3080")
                                .setOS("Windows 11")
                                .build();

        Computer officePC = new Computer.Builder()
                                .setCPU("Intel i5")
                                .setRAM("16GB")
                                .setStorage("512GB SSD")
                                .setOS("Windows 10")
                                .build();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
