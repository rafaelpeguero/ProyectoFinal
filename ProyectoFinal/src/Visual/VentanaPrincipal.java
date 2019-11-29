package Visual;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

import Logico.Centro;
import Visual.RegistrarUsuario;

import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
				//	VentanaPrincipal frame = new VentanaPrincipal();
				//	frame.setVisible(true);
				//} catch (Exception e) {
			//		e.printStackTrace();
			//	}
		//	}
	//	});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileOutputStream empresa2;
				ObjectOutputStream empresaWrite;
				try {
					empresa2 = new  FileOutputStream("empresa.dat");
					empresaWrite = new ObjectOutputStream(empresa2);
					empresaWrite.writeObject(Centro.getInstance());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		setFont(new Font("Segoe UI", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/Images/casa.png")));
		setTitle("Men\u00FA Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 365);
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEditor = new JMenu("Editor");
		mnEditor.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnEditor);
		if(!Centro.getLoginUsuario().getTipo().equalsIgnoreCase("Administrador")){
			mnEditor.setVisible(false);
		}
		
		JMenuItem mntmNuevo = new JMenuItem("+ Nuevo ");
		mnEditor.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("+ Abrir");
		mnEditor.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("+ Salvar");
		mnEditor.add(mntmSalvar);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		mnEstudiante.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnEstudiante);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro Estudiante");
		mnEstudiante.add(mntmRegistro);
		mntmRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario users = new RegistrarUsuario();
				users.setModal(true);
				users.setVisible(true);
			}
		});
		
		JMenuItem mntmListado = new JMenuItem("Listado Estudiante");
		mnEstudiante.add(mntmListado);
		mntmListado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ObjtListadoEst list = new ObjtListadoEst();
				list.setVisible(true);
				dispose();
			}
		});
		JMenu mnFunciones = new JMenu("Reporte");
		mnFunciones.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnFunciones);
		
		JMenu mnReporte = new JMenu("Aplicaciones");
		mnReporte.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnReporte);
		
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnConfiguracion);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/pelicula-3D.png")));
		label.setBounds(0, 11, 256, 256);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 267, 562, 39);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		button.setActionCommand("Cancel");
		panel.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fod.png")));
		label_1.setBounds(115, -33, 591, 355);
		contentPane.add(label_1);
	}
}
