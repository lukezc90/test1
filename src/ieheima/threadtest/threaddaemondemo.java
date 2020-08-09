package ieheima.threadtest;

public class threaddaemondemo {
    public static void main(String[] args) throws InterruptedException {
        threaddaemon ta1 = new threaddaemon();
        threaddaemon ta2 = new threaddaemon();


        ta1.setName("张驰");
        ta2.setName("王婷婷");
        //设置主线程为dau
        Thread.currentThread().setName("女儿");
        //设置守护线程
        ta1.setDaemon(true);
        ta2.setDaemon(true);

        ta1.start();
        ta2.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+ i);
        }
    }
}
