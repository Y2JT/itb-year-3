import java.awt.*;
import javax.swing.*;

public class GreenCommand implements Command {
   private JFrame frame;
   private JPanel pnl;

   public GreenCommand(JFrame fr, JPanel p) {
      frame = fr;
      pnl = p;
   }
   public void Execute() {
      pnl.setBackground(Color.green);
   }
}
