import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//implements separate inner Command classes as extensions of
//Button and Menu items

public class tCommand extends Frame
   implements ActionListener
{
   Menu mnuFile;
   fileOpenCommand mnuOpen;
   fileExitCommand mnuExit;
   fileDisplayCommand mnuDisplay;
   btnRedCommand btnRed;
   btnYellowCommand btnYellow;
   Panel p;
   Frame fr;
   //-----------------------------------------
   public tCommand()
   {
      super("Frame with commands");
      fr = this;     //save frame object
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new fileOpenCommand("Open...");
      mnuFile.add(mnuOpen);
      mnuDisplay = new fileDisplayCommand("Display");
      mnuFile.add(mnuDisplay);
      mnuExit = new fileExitCommand("Exit");
      mnuFile.add(mnuExit);


      mnuOpen.addActionListener(this);
      mnuDisplay.addActionListener(this);
      mnuExit.addActionListener(this);

      btnRed = new btnRedCommand("Red");
      btnYellow = new btnYellowCommand("Yellow");
      p = new Panel();
      add(p);
      p.add(btnRed);
      p.add(btnYellow);

      btnRed.addActionListener(this);
      btnYellow.addActionListener(this);
      setBounds(100,100,200,100);
      setVisible(true);
   }
   //-----------------------------------------
   public void actionPerformed(ActionEvent e)
   {
      Command obj = (Command)e.getSource();
      obj.Execute();
   }
   //-----------------------------------------
   static public void main(String argv[])
   {
      new tCommand();
   }
   //====----====-----inner class----=====----
   class btnRedCommand extends Button implements Command
   {
      public btnRedCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         p.setBackground(Color.red);
      }
   }

   class btnYellowCommand extends Button implements Command
   {
      public btnYellowCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         p.setBackground(Color.yellow);
      }
   }
   //------------------------------------------
   class fileOpenCommand extends MenuItem implements Command
   {
      public fileOpenCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         FileDialog fDlg=new FileDialog(fr,"Open file");
         fDlg.show();
      }
   }

   class fileDisplayCommand extends MenuItem implements Command
   {
      public fileDisplayCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         JOptionPane.showMessageDialog(p, "Display menu selected.");
      }
   }
   //-------------------------------------------
   class fileExitCommand extends MenuItem implements Command
   {
      public fileExitCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         System.exit(0);
      }
   }
}
//==========================================


