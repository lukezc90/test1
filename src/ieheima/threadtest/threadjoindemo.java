package ieheima.threadtest;

public class threadjoindemo {
    public static void main(String[] args) throws InterruptedException {
        threadjoin to1 = new threadjoin();
        threadjoin to2 = new threadjoin();
        threadjoin to3 = new threadjoin();

        to1.setName("张驰");
        to2.setName("王婷婷");
        to3.setName("son");

        to1.start();
        to1.join();
        to2.start();
        to3.start();
    }
}
