package Creational.FactoryMethod;

public class Factory {
    public OS getCurrentOS(String strOS) {
        OS os = null;
        if (strOS.equals("linux")) {
            os = new LinuxOS();
        } else if (strOS.equals("windows")){
            os = new WindowsOS();
        } else if (strOS.equals("mac")) {
            os = new MacOS();
        }
        return os;
    }
}
