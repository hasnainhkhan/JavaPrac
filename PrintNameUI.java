import javax.swing.*;
import java.awt.*;

public class PrintNameUI extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.setColor(Color.BLUE);
        g.drawString("Hasnain Haidar", 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Print Name UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new PrintNameUI());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
