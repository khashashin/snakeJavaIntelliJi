import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Sneak");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mw = new MainWindow();
    }
}
