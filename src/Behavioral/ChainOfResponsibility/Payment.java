package Behavioral.ChainOfResponsibility;

public interface Payment {
    void setNext(Payment payment);
    void pay();
}
