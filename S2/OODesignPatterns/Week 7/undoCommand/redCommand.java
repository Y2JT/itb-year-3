import java.awt.*;
import javax.swing.*;

public class redCommand extends drawCommand {
   public redCommand(JPanel p1) {
      super(p1);
      x = 30;
      y = 0;
      dx = 20;
      dy = -20;
      color = Color.red;
   }
   public void setPanel(JPanel p1) {
     p = p1;


  }
}
