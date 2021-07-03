package five;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class First {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
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
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(12, 12, 205, 167);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rajkot", "Jamnagar", "Surat"}));
		comboBox.setBounds(12, 118, 114, 25);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(12, 86, 114, 20);
		textField.setText("Hello");
		textField.setColumns(10);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new third().setVisible(true);
			}
			
		});
		btnNewButton.setBounds(12, 48, 71, 26);
		btnNewButton.setToolTipText("Click for results");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Frame - 1");
		lblNewLabel.setBounds(12, 12, 58, 24);
		panel.add(lblNewLabel);
	}
}
