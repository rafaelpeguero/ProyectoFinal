package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.Centro;
import Logico.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtusuario;
	private JTextField txtcontrasena;
	private JTextField txtconfirmar;
	private JComboBox<Object> cmbtipo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarUsuario dialog = new RegistrarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarUsuario.class.getResource("/Images/Users.png")));
		setTitle("Registro de Usuario");
		setName("RegistrarUsuario");
		setBounds(100, 100, 355, 272);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		JLabel lblNewLabel = new JLabel("Nombre Usuario:");
		lblNewLabel.setBounds(56, 41, 105, 14);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_1.setBounds(88, 112, 73, 14);
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setBounds(129, 76, 32, 14);
			lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a:");
			lblConfirmarContrasea.setBounds(22, 144, 139, 14);
			lblConfirmarContrasea.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblConfirmarContrasea);
		}
		
		txtusuario = new JTextField();
		txtusuario.setBounds(171, 37, 130, 22);
		txtusuario.setToolTipText("");
		txtusuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtusuario.setColumns(10);
		contentPanel.add(txtusuario);
		
		txtcontrasena = new JTextField();
		txtcontrasena.setBounds(171, 108, 130, 22);
		txtcontrasena.setToolTipText("");
		txtcontrasena.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtcontrasena.setColumns(10);
		contentPanel.add(txtcontrasena);
		
		txtconfirmar = new JTextField();
		txtconfirmar.setBounds(171, 140, 130, 22);
		txtconfirmar.setToolTipText("");
		txtconfirmar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtconfirmar.setColumns(10);
		contentPanel.add(txtconfirmar);
		
		cmbtipo = new JComboBox<Object>();
		cmbtipo.setModel(new DefaultComboBoxModel<Object>(new String[] {"<Seleccione>", "Administrador", "Estudiante"}));
		cmbtipo.setBounds(174, 74, 127, 20);
		contentPanel.add(cmbtipo);
		
		JLabel label = new JLabel("");
		label.setBounds(-85, 0, 424, 241);
		label.setIcon(new ImageIcon(RegistrarUsuario.class.getResource("/Images/fod.png")));
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(112, 128, 144));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Usuario aux = new Usuario(cmbtipo.getSelectedItem().toString(), txtusuario.getText(), txtcontrasena.getText());
					    Centro.getInstance().RegistrarUsuario(aux);	
					    	Login login = new Login();
					    	dispose();
						    login.setVisible(true);
						}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Login login = new Login();
						login.setVisible(true);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
