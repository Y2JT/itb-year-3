import java.awt.*;
import javax.swing.*;

public class UpdateCommand implements Command {
   JFrame frame;

   public UpdateCommand(JFrame fr) {
      frame = fr;
   }
//------------------------------
   public void Execute() {
      JOptionPane.showMessageDialog(frame, "Update menu selected.");
   }
}
