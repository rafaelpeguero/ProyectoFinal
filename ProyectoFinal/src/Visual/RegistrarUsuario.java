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

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class RegistrarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtusuario;
	private JTextField txtcontrasena;
	private JTextField txtconfirmar;
	private JComboBox<Object> cmbtipo;
	private Centro micentro = null;
	private Usuario miusuario = null;
	protected Centro centro;
	
	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	//	try {
	//		RegistrarUsuario dialog = new RegistrarUsuario(micentro);
	//		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	//		dialog.setVisible(true);
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
	//}

	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario(Centro micentro) {
		this.micentro = micentro;
		setResizable(false);
		if(micentro==null) 
		{
		  setTitle("Registrar Suplidor");
		}else{
		  setTitle("Modificar: "+micentro.getUser());	
		}
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarUsuario.class.getResource("/Images/Users.png")));
		setTitle("Registro de Usuario");
		setName("RegistrarUsuario");
		setBounds(100, 100, 847, 470);
		//Dimensionador();
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(128, 128, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		JLabel lblNewLabel = new JLabel("Nombre Usuario:");
		lblNewLabel.setBounds(329, 134, 136, 14);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_1.setBounds(371, 210, 94, 14);
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setBounds(424, 169, 41, 14);
			lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 17));
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a:");
			lblConfirmarContrasea.setBounds(284, 243, 181, 14);
			lblConfirmarContrasea.setFont(new Font("Segoe UI", Font.BOLD, 17));
			contentPanel.add(lblConfirmarContrasea);
		}
		
		txtusuario = new JTextField();
		txtusuario.setBounds(492, 131, 130, 22);
		txtusuario.setToolTipText("");
		txtusuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtusuario.setColumns(10);
		contentPanel.add(txtusuario);
		
		txtcontrasena = new JTextField();
		txtcontrasena.setBounds(492, 207, 130, 22);
		txtcontrasena.setToolTipText("");
		txtcontrasena.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtcontrasena.setColumns(10);
		contentPanel.add(txtcontrasena);
		
		txtconfirmar = new JTextField();
		txtconfirmar.setBounds(492, 240, 130, 22);
		txtconfirmar.setToolTipText("");
		txtconfirmar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtconfirmar.setColumns(10);
		contentPanel.add(txtconfirmar);
		
		cmbtipo = new JComboBox<Object>();
		cmbtipo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbtipo.setModel(new DefaultComboBoxModel<Object>(new String[] {"<Seleccione>", "Administrador", "Estudiante"}));
		cmbtipo.setBounds(492, 167, 127, 20);
		contentPanel.add(cmbtipo);
		JPanel buttonPane = new JPanel();
		buttonPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		buttonPane.setBounds(0, 374, 840, 66);
		contentPanel.add(buttonPane);
		buttonPane.setBackground(new Color(112, 128, 144));
		JButton btnregistrar = new JButton("Registrar");
		btnregistrar.setBounds(493, 11, 200, 33);
		btnregistrar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(miusuario==null){
					Usuario aux = new Usuario( txtusuario.getText(), cmbtipo.getSelectedItem().toString(), txtcontrasena.getText(), txtconfirmar.getText(), null);
					micentro.InsertarUsuario(aux);
					JOptionPane.showMessageDialog(null, "Operaci�n satisfactoria", "Notificaci�n", JOptionPane.INFORMATION_MESSAGE);
					clean();
					}else{
						miusuario.setNombreUsuario(txtusuario.getText());
						miusuario.setTipo(cmbtipo.getSelectedItem().toString());
						micentro.modificarUsuario(miusuario);
						ListadoUsuario.loadUsuarios();
						dispose();
					}
				//Usuario aux = null;
				//String id = txtId.getText();
				//String nombre = txtusuario.getText();
				//String contrasena = txtcontrasena.getText();
				//String confirmar = txtconfirmar.getText();
			 			//String tipo = cmbtipo.getSelectedItem().toString();
				//if(txtusuario.getText().length() == 0 ^ txtcontrasena.getText().length() == 0 ^ txtconfirmar.getText().length() == 0){
				//	JOptionPane.showMessageDialog(null, "�Favor de llenar los datos correspondientes!", "Error", JOptionPane.ERROR_MESSAGE);
				//	}else {
				//		if(!txtcontrasena.getText().equals(txtconfirmar.getText())) {
				//			JOptionPane.showMessageDialog(null, "�Las contrase�as no son iguales!", "Error", JOptionPane.ERROR_MESSAGE);
				//		}else {
				//			if(txtcontrasena.getText().length() == 0 && txtconfirmar.getText().length() == 0) {
				//				JOptionPane.showMessageDialog(null, "�Favor Insertar una contrase�a!", "Error", JOptionPane.ERROR_MESSAGE);
				//			}else {
				//aux = new Usuario( tipo, nombre, contrasena, confirmar, null);
				//if(!Centro.getInstance().ConfirmarLogin(txtusuario.getText(),txtcontrasena.getText())){
				//Centro.getInstance().InsertarUsuario(aux);
				//dispose();
				//}
				//			}
				//			}
				//			}
				}
		});
		buttonPane.setLayout(null);
		btnregistrar.setActionCommand("OK");
		buttonPane.add(btnregistrar);
		getRootPane().setDefaultButton(btnregistrar);
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(716, 11, 114, 33);
			cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login login = new Login(centro);
					login.setVisible(true);
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
		{
			{
				if(micentro==null){
					btnregistrar.setText("Registrar");
				}else{
					btnregistrar.setText("Modificar");
				}
			}
		}
	}
	/*
	 * Nombre 	  : Dimensionador
	 * Funcion	  : Ajustar la dimension correcta de la vista
	 * Argumentos : Ninguno
	 * Retorno	  : Ninguno
	 */
	public void Dimensionador() {
		Dimension dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, dim.height);
		setLocationRelativeTo(null);
	}
	

	private void clean() {
		cmbtipo.setSelectedIndex(0);
		txtusuario.setText("");
		txtcontrasena.setText("");
		txtconfirmar.setText("");

	}
}
