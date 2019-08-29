package inter.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author zhangke
 * @version 1.0
 * @className TimePrinter
 * @description
 * @date 2019/8/29 10:21 AM
 **/
class TimePrinter implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}