package ieheima.Threadpriority;

public class MythreadPriority extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
