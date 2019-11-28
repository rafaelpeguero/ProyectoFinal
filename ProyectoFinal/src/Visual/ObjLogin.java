package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;


import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

@SuppressWarnings("unused")
public class ObjLogin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textusuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			ObjLogin dialog = new ObjLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ObjLogin() {
		setResizable(false);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjLogin.class.getResource("/Images/login.png")));
		setBounds(100, 100, 356, 197);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(102, 153, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textusuario = new JTextField();
			textusuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
			textusuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(ObjLogin.class.getResource("/Images/bloquear.png")));
			label_2.setBounds(45, 75, 29, 30);
			contentPanel.add(label_2);
			textusuario.setToolTipText("");
			textusuario.setBounds(74, 34, 141, 30);
			contentPanel.add(textusuario);
			textusuario.setColumns(10);
		}
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnEntrar.setBounds(239, 41, 89, 23);
		contentPanel.add(btnEntrar);
		{
			JButton btnregistrar = new JButton("Registrar");
			btnregistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RegistrarUsuario regusuario = new RegistrarUsuario();
					regusuario.setVisible(true);
					dispose();
				}
			});
			btnregistrar.setBounds(239, 75, 89, 23);
			contentPanel.add(btnregistrar);
		}
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ObjLogin.class.getResource("/Images/Users.png")));
		label_1.setBounds(45, 34, 29, 30);
		contentPanel.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setFont(new Font("Segoe UI", Font.BOLD, 14));
		passwordField.setEchoChar('*');
		passwordField.setName("txtcontrasena");
		passwordField.setBounds(74, 75, 141, 30);
		contentPanel.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ObjLogin.class.getResource("/Images/fod.png")));
		label.setBounds(-19, -82, 369, 262);
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setBackground(new Color(112, 128, 144));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
