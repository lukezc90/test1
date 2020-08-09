package ieheima.Threadpriority;

public class threadPriority {

    public static void main(String[] args) {
        MythreadPriority mythreadP1 = new MythreadPriority();
        MythreadPriority mythreadP2 = new MythreadPriority();
        MythreadPriority mythreadP3 = new MythreadPriority();

        mythreadP1.setName("高铁");
        mythreadP2.setName("飞机");
        mythreadP3.setName("汽车");

        mythreadP1.setPriority(5);
        mythreadP2.setPriority(10);
        mythreadP3.setPriority(1);


        mythreadP1.start();
        mythreadP2.start();
        mythreadP3.start();

    }
}
