package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class ObjLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textusuario;
	private JTextField txtcontrasena;

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
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjLogin.class.getResource("/Imagenes/icons8-bloquear-64.png")));
		setBounds(100, 100, 320, 372);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Tipo :");
			lblUsuario.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblUsuario.setBounds(95, 86, 41, 20);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblUsuario_1 = new JLabel("Usuario :");
			lblUsuario_1.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblUsuario_1.setBounds(70, 117, 66, 20);
			contentPanel.add(lblUsuario_1);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
			lblContrasea.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblContrasea.setBounds(42, 148, 94, 20);
			contentPanel.add(lblContrasea);
		}
		{
			textusuario = new JTextField();
			textusuario.setBounds(142, 118, 111, 20);
			contentPanel.add(textusuario);
			textusuario.setColumns(10);
		}
		{
			txtcontrasena = new JTextField();
			txtcontrasena.setName("txtcontrasena");
			txtcontrasena.setColumns(10);
			txtcontrasena.setBounds(142, 149, 111, 20);
			contentPanel.add(txtcontrasena);
		}
		
		JComboBox cmbtipousuario = new JComboBox();
		cmbtipousuario.setBounds(142, 87, 111, 20);
		contentPanel.add(cmbtipousuario);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(ObjLogin.class.getResource("/Imagenes/icons8-importar-100.png")));
		button.setBounds(112, 179, 89, 81);
		contentPanel.add(button);
		{
			JButton btnregistrar = new JButton("Registrar");
			btnregistrar.setBounds(112, 266, 89, 23);
			contentPanel.add(btnregistrar);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(ObjLogin.class.getResource("/Imagenes/usuario (1).png")));
			label.setBounds(130, 11, 71, 75);
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
