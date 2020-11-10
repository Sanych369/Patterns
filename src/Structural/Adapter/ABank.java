package Structural.Adapter;

public class ABank {
    private int balance;
    public ABank() {
        balance = 250;
    }
    public void getBalance() {
        System.out.println("ABank balance = " + balance);
    }
}
