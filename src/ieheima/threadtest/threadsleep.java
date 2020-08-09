package ieheima.threadtest;

public class threadsleep extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
            try {
                threadsleep.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
