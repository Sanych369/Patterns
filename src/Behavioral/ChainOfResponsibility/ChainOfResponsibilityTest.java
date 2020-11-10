package Behavioral.ChainOfResponsibility;

/**
 *Цепочка обязанностей (Chain of responsibility) - Позволяет избежать жесткой зависимости отправителя
 *  запроса от его получателя, при этом запрос может быть обработан несколькими объектами.
 * Пример в java - метод log() у java.util.logging.Logger.
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Payment visa = new VisaPayment();
        Payment paypal = new PayPalPayment();
        visa.setNext(paypal);
        visa.pay();
        System.out.println();
        paypal.setNext(visa);
        paypal.pay();
    }
}
