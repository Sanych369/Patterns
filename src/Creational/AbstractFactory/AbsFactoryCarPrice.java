package Creational.AbstractFactory;

public class AbsFactoryCarPrice implements AbsFactory {
    @Override
    public Lada getLada() {
        return new LadaImp();
    }

    @Override
    public Ferrari getFerrari() {
        return new FerrariImp();
    }

    @Override
    public Porsche getPorsche() {
        return new PorscheImp();
    }
}
