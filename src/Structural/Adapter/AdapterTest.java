package Structural.Adapter;

/**
 * Адаптер (Adapter) - Объект, обеспечивающий взаимодействие двух других объектов,
 * один из которых использует, а другой предоставляет несовместимый с первым интерфейс.
 * Пример в java - метод asList() у Arrays.
 */
public class AdapterTest {
    public static void main(String[] args) {
        PBank pBank = new PBank();
        ABank aBank = new ABank();
        pBank.getBalance();
        aBank.getBalance();
        PBankAdapter pBankAdapter = new PBankAdapter(aBank);
        System.out.println("pbankadapter:");
        pBankAdapter.getBalance();
    }
}
