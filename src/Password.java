import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Password extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserId;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password frame = new Password();
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
	public Password() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel headingLabel = new JLabel("Welcome to the Point-Of-Sale Registration System");
		headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		headingLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel userIdLabel = new JLabel("Please enter your user ID:");
		userIdLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel passwordLabel = new JLabel("Please enter your password:");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// after sign in clicked, get values, pass in to LogIn class to
				// validate ?
				if (!textFieldUserId.getText().isEmpty()) {

				}
			}
		});

		textFieldUserId = new JTextField();
		textFieldUserId.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(165).addComponent(btnSignIn).addContainerGap(194,
						Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addGap(58)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(headingLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(59))
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(userIdLabel)
										.addComponent(passwordLabel))
								.addGap(20)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldPassword, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldUserId, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(122)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap().addComponent(headingLabel).addGap(31)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(userIdLabel).addComponent(
						textFieldUserId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(32)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(passwordLabel).addComponent(
						textFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(40).addComponent(btnSignIn).addContainerGap(69, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}
}
