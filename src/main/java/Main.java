import edu.gmu.zergHoard.BWInterface;

public class Main {

    public static void main(String[] args) {
        BWInterface i = new BWInterface();
        i.start();
        while(i.isConnected()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.print("BWAPI Disconnected");
        i.shutdown();
    }
}
