package Behavioral.Strategy;

public class DownloadWindowsStrategy implements Strategy {
    @Override
    public void download(String file) {
        System.out.println("windows download: " + file);
    }
}
