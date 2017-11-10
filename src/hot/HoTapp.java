package hot;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hot.devices.DimmableLamp;
import hot.devices.Lamp;
import hot.ui.Dashboard;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class HoTapp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoTapp window = new HoTapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HoTapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dashboard dashboard = new Dashboard();
		frame.getContentPane().add(dashboard.getPanel(), BorderLayout.CENTER);

		dashboard.add(new Lamp(),0,0,2,1);
		dashboard.add(new Lamp(),0,1,1,1);
		dashboard.add(new Lamp(),0,2,1,1);
		dashboard.add(new Lamp(),0,3,1,1);
		dashboard.add(new Lamp(),1,1,1,1);
		dashboard.add(new Lamp(),1,2,1,1);
		dashboard.add(new Lamp(),1,3,1,1);
		dashboard.add(new Lamp(),2,0,2,2);
		dashboard.add(new Lamp(),2,2,1,1);
		dashboard.add(new Lamp(),2,3,1,1);
		dashboard.add(new Lamp(),3,2,1,1);
		dashboard.add(new DimmableLamp(),3,3,1,1);
	}

}
