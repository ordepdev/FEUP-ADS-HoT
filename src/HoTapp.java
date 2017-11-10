import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hot.Device;
import hot.HoT;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
		
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JLabel label1 = new JLabel("1 OFF");
		panel_1.add(label1);
		
		JLabel label2 = new JLabel("2 OFF");
		panel_1.add(label2);

		JButton btnNewButton_1 = new JButton("Lamp 1");
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lamp 2");
		panel.add(btnNewButton_2);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Device d = HoT.getInstance().getDevice("L1");
				if (d.isOn()) {
					label1.setText("L1 OFF");
					d.turnOff();
				} else {
					label1.setText("L1 ON");
					d.turnOn();
				}
				
			}
		});

		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
	}

}
