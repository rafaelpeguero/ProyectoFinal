package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.SoftBevelBorder;

import Logico.Centro;
import Logico.Usuario;

import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtcontrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileInputStream empresa;
				FileOutputStream empresa2;
				ObjectInputStream empresaRead;
				ObjectOutputStream empresaWrite;
				try {
					empresa = new FileInputStream ("empresa.dat");
					empresaRead = new ObjectInputStream(empresa);
					Centro temp = (Centro)empresaRead.readObject();
					Centro.setCentro(temp);
					empresa.close();
					empresaRead.close();
				} catch (FileNotFoundException e) {
					try {
						empresa2 = new  FileOutputStream("empresa.dat");
						empresaWrite = new ObjectOutputStream(empresa2);
						Usuario aux = new Usuario("Administrador", "Admin", "Admin",	null);
						Centro.getInstance().InsertarUsuario(aux);
						empresaWrite.writeObject(Centro.getInstance());
						empresa2.close();
						empresaWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Images/login.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		Dimensionador();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtusuario = new JTextField();
		txtusuario.setToolTipText("");
		txtusuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtusuario.setColumns(10);
		txtusuario.setBounds(66, 41, 141, 30);
		panel.add(txtusuario);
		
		txtcontrasena = new JTextField();
		txtcontrasena.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		txtcontrasena.setColumns(10);
		txtcontrasena.setBounds(66, 82, 141, 30);
		panel.add(txtcontrasena);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Centro.getInstance().ConfirmarLogin(txtusuario.getText(),txtcontrasena.getText())){
					VentanaPrincipal principal = new VentanaPrincipal();
					dispose();
					principal.setVisible(true);
				}else {
					if(txtusuario.getText().length() == 0 && txtcontrasena.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "¡Favor de llenar los datos correspondientes!", "Error", JOptionPane.ERROR_MESSAGE);
					}else {
						if(!Centro.getInstance().ConfirmarLogin(txtusuario.getText(),txtcontrasena.getText())){
							JOptionPane.showMessageDialog(null, "¡Usuario no Existe, favor registrarse!", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnEntrar.setBounds(231, 48, 89, 23);
		panel.add(btnEntrar);
		
		JButton btnregistrar = new JButton("Registrar");
		btnregistrar.setBounds(231, 82, 89, 23);
		panel.add(btnregistrar);
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario registrar = new RegistrarUsuario();
				dispose();
				registrar.setVisible(true);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(112, 128, 144));
		panel_1.setBounds(0, 137, 350, 39);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setActionCommand("Cancel");
		panel_1.add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/Images/Users.png")));
		label.setBounds(32, 41, 29, 30);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/Images/bloquear.png")));
		label_1.setBounds(32, 82, 29, 30);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/Images/fod.png")));
		label_2.setBounds(-29, -64, 379, 297);
		panel.add(label_2);
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
}
