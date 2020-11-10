package Creational.Builder;

public class Build {
    private Builder builder;
    public Build(int i) {
        if(i == 1) {
            builder = new OneBuilderImp();
        } else if (i == 2) {
            builder = new TwoBuilderImp();
        }
    }
    public Car carBuild() {
        return builder.carBuilder();
    }
}
