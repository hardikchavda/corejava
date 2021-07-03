package five;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

/**
 * @author Er. Hardik Chavda https://t.me/hardikchavda
 * 
 */
public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(10, 11, 67, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 50, 67, 14);
		contentPane.add(lblPassword);

		txtUsername = new JTextField();
		txtUsername.setBounds(111, 8, 114, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setBounds(111, 47, 114, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
					JOptionPane.showMessageDialog(LoginForm.this, "Please Enter some data.");
				} else {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logintest", "root",
								"");
						Statement st = conn.createStatement();
						String login = "select * from users where name like '" + txtUsername.getText()
								+ "' and password like '" + txtPassword.getText() + "'";
						ResultSet rs = st.executeQuery(login);
						if (rs.next()) {
							JOptionPane.showMessageDialog(LoginForm.this, "Login Successfull");
							new third().setVisible(true);
							LoginForm.this.setVisible(false);
						} else {
							JOptionPane.showMessageDialog(LoginForm.this, "Something is wrong");
						}
					} catch (ClassNotFoundException e) {
						JOptionPane.showMessageDialog(LoginForm.this, e.getMessage());
					} catch (SQLException e) {
						JOptionPane.showMessageDialog(LoginForm.this, e.getMessage());
					}

				}
			}
		});
		btnLogin.setBounds(10, 96, 98, 26);
		contentPane.add(btnLogin);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(127, 96, 98, 26);
		contentPane.add(btnCancel);
	}
}
