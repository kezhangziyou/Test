package inter.test;

/**
   @version 1.00 2000-04-13
   @author Cay Horstmann
*/

import javax.swing.*;
import java.awt.event.ActionListener;
// to resolve conflict with java.util.Timer

public class TimerTest {
   public static void main(String[] args) {
      ActionListener listener = new TimePrinter();

      // construct a timer that calls the listener
      // once every 10 seconds
      Timer t = new Timer(10000, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}


