package ieheima.threadtest;

public class threadsleepdemo {
    public static void main(String[] args) {
        threadsleep ts1 = new threadsleep();
        threadsleep ts2 = new threadsleep();
        threadsleep ts3 = new threadsleep();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
