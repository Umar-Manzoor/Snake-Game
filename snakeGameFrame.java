import javax.swing.JFrame;

public class snakeGameFrame extends JFrame{

    snakeGameFrame(){

        snakeGamePanel panel = new snakeGamePanel();
        //makes newinstance of snakeGamePanel

        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
