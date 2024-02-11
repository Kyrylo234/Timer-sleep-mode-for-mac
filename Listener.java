import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Listener implements ActionListener {
    private Driver main;
    public Listener(Driver main){
        this.main = main;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = main.getValue();
        if(num == -1){

        }else{
            System.out.println(num);
            try {
                // Sleep for 5 seconds
                Thread.sleep((num * 1000 * 60));
            } catch (InterruptedException exception1) {
                // Handle interrupted exception
                exception1.printStackTrace();
            }
            String command = "pmset sleepnow";

            try {
                Runtime.getRuntime().exec(command);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
