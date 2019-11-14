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
		setResizable(false);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjLogin.class.getResource("/Imagenes/icons8-bloquear-64.png")));
		setBounds(100, 100, 288, 342);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(102, 153, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Tipo :");
			lblUsuario.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblUsuario.setBounds(85, 86, 41, 20);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblUsuario_1 = new JLabel("Usuario :");
			lblUsuario_1.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblUsuario_1.setBounds(60, 117, 66, 20);
			contentPanel.add(lblUsuario_1);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
			lblContrasea.setFont(new Font("Yu Gothic", Font.BOLD, 15));
			lblContrasea.setBounds(32, 148, 94, 20);
			contentPanel.add(lblContrasea);
		}
		{
			textusuario = new JTextField();
			textusuario.setBounds(132, 118, 111, 20);
			contentPanel.add(textusuario);
			textusuario.setColumns(10);
		}
		{
			txtcontrasena = new JTextField();
			txtcontrasena.setName("txtcontrasena");
			txtcontrasena.setColumns(10);
			txtcontrasena.setBounds(132, 149, 111, 20);
			contentPanel.add(txtcontrasena);
		}
		
		JComboBox cmbtipousuario = new JComboBox();
		cmbtipousuario.setBounds(132, 87, 111, 20);
		contentPanel.add(cmbtipousuario);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(99, 190, 89, 23);
		contentPanel.add(btnEntrar);
		{
			JButton btnregistrar = new JButton("Registrar");
			btnregistrar.setBounds(99, 224, 89, 23);
			contentPanel.add(btnregistrar);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(ObjLogin.class.getResource("/Imagenes/candado.png")));
			label.setBounds(114, 0, 66, 98);
			contentPanel.add(label);
		}
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ObjLogin.class.getResource("/Imagenes/lol.png")));
		label.setBounds(-140, -105, 423, 482);
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
