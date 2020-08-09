package ieheima.thread;

public class threaddemo {
    public static void main(String[] args) {
        Mythread my1 = new Mythread();
        Mythread my2 = new Mythread();

        my1.start();
        my2.start();
    }
}
