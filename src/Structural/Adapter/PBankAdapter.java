package Structural.Adapter;

public class PBankAdapter extends PBank {
    private ABank aBank;

    public PBankAdapter(ABank aBank) {
        this.aBank = aBank;
    }

    public void getBalance() {
        aBank.getBalance();
    }
}
