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

@SuppressWarnings("unused")
public class ObjLogin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjLogin.class.getResource("/Images/icons8-importar-100.png")));
		setBounds(100, 100, 288, 342);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(102, 153, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textusuario = new JTextField();
			textusuario.setEnabled(false);
			textusuario.setToolTipText("");
			textusuario.setText("usuario");
			textusuario.setBounds(88, 114, 111, 20);
			contentPanel.add(textusuario);
			textusuario.setColumns(10);
		}
		{
			txtcontrasena = new JTextField();
			txtcontrasena.setEnabled(false);
			txtcontrasena.setText("contrase\u00F1a");
			txtcontrasena.setName("txtcontrasena");
			txtcontrasena.setColumns(10);
			txtcontrasena.setBounds(88, 145, 111, 20);
			contentPanel.add(txtcontrasena);
		}
		
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
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(43, 106, 46, 14);
		contentPanel.add(label_1);
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
