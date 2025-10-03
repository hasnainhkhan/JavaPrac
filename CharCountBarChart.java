import javax.swing.*;
import java.awt.*;

public class CharCountBarChart extends JPanel {
    private int letters, spaces, digits, others;

    public CharCountBarChart(int letters, int spaces, int digits, int others) {
        this.letters = letters;
        this.spaces = spaces;
        this.digits = digits;
        this.others = others;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] values = {letters, spaces, digits, others};
        String[] labels = {"Letters", "Spaces", "Digits", "Others"};
        Color[] colors = {Color.BLUE, Color.GREEN, Color.ORANGE, Color.RED};
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / values.length;
        int max = 1;
        for (int v : values) if (v > max) max = v;
        for (int i = 0; i < values.length; i++) {
            int barHeight = (int)(((double)values[i] / max) * (height - 50));
            g.setColor(colors[i]);
            g.fillRect(i * barWidth + 20, height - barHeight - 30, barWidth - 40, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(labels[i] + ": " + values[i], i * barWidth + 20, height - 10);
        }
    }

    public static void main(String[] args) {
        // Example counts, replace with actual values or pass as args
        int letters = 10, spaces = 5, digits = 3, others = 2;
        if (args.length == 4) {
            letters = Integer.parseInt(args[0]);
            spaces = Integer.parseInt(args[1]);
            digits = Integer.parseInt(args[2]);
            others = Integer.parseInt(args[3]);
        }
        JFrame frame = new JFrame("Character Count Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(new CharCountBarChart(letters, spaces, digits, others));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
