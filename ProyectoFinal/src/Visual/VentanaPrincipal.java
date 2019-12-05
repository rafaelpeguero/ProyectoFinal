package Visual;

import java.awt.Color;
import java.awt.Dimension;
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
import Visual.ObjtHerramienta;

import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantEst;
	private JTextField txtPrismSalvado;
	private JTextField txtPrismCreados;
	private Centro micentro = null;
	

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
	public VentanaPrincipal(Centro centro) {
		this.micentro = centro;
        Calendar fecha = new GregorianCalendar();

        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
   
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
		setBounds(100, 100, 1366, 768);
		Dimensionador();//Extra
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEditor = new JMenu("Editor");
		mnEditor.setFont(new Font("Segoe UI", Font.BOLD, 17));
		menuBar.add(mnEditor);
		
		
		JMenuItem mntmNuevo = new JMenuItem("+ Nuevo ");
		mntmNuevo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObjtHerramienta aux  = new ObjtHerramienta();
				aux.setVisible(true);
				
			}
		});
		mnEditor.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("+ Abrir");
		mntmAbrir.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnEditor.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("+ Salvar");
		mntmSalvar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnEditor.add(mntmSalvar);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		mnEstudiante.setFont(new Font("Segoe UI", Font.BOLD, 17));
		menuBar.add(mnEstudiante);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro Estudiante");
		mntmRegistro.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnEstudiante.add(mntmRegistro);
		mntmRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario users = new RegistrarUsuario(null);
				users.setModal(true);
				users.setVisible(true);
			}
		});
		
		JMenuItem mntmListado = new JMenuItem("Listado Estudiante");
		mntmListado.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnEstudiante.add(mntmListado);
		if(!Centro.getLoginUsuario().getTipo().equalsIgnoreCase("Administrador")){
			mnEstudiante.setVisible(false);
		}
		mntmListado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ListadoUsuario list = new ListadoUsuario(micentro);
				list.setVisible(true);
				dispose();
			}
		});
		JMenu mnFunciones = new JMenu("Reporte");
		mnFunciones.setFont(new Font("Segoe UI", Font.BOLD, 17));
		menuBar.add(mnFunciones);
		
		JMenu mnReporte = new JMenu("Aplicaciones");
		mnReporte.setFont(new Font("Segoe UI", Font.BOLD, 17));
		menuBar.add(mnReporte);
		
		JMenuItem mntmGraficard = new JMenuItem("Graficar 3D");
		mntmGraficard.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnReporte.add(mntmGraficard);
		mntmGraficard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ObjtHerramienta herramienta = new ObjtHerramienta();
				herramienta.setVisible(true);
				dispose();
			}
		});
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Segoe UI", Font.BOLD, 17));
		menuBar.add(mnConfiguracion);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/pelicula-3D.png")));
		label.setBounds(1094, 449, 256, 182);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 636, 1360, 83);
		contentPane.add(panel);
		
		JButton button = new JButton("Salir");
		button.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button.setBounds(1204, 26, 124, 35);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login(centro);
				login.setVisible(true);
				dispose();
			}
		});
		panel.setLayout(null);
		button.setActionCommand("Cancel");
		panel.add(button);
		
		JPanel panelFechaHora = new JPanel();
		panelFechaHora.setBounds(27, 11, 152, 55);
		panel.add(panelFechaHora);
		panelFechaHora.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelFechaHora.setBackground(new Color(255, 255, 255));
		panelFechaHora.setLayout(null);
		
		JLabel lblfecha = new JLabel("");
		lblfecha.setBounds(10, 11, 159, 17);
		lblfecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelFechaHora.add(lblfecha);
		
		lblfecha.setText("Fecha: "+ dia + "/" + (mes+1) + "/" + año);
		
		JLabel lblhora = new JLabel("");
		lblhora.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblhora.setBounds(10, 28, 159, 17);
		panelFechaHora.add(lblhora);
		
		lblhora.setText("Hora : "+ hora +":" + minuto + ":" + segundo);
		
		JPanel panelDatosCentro = new JPanel();
		panelDatosCentro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDatosCentro.setBackground(new Color(255, 255, 255));
		panelDatosCentro.setBounds(487, 194, 447, 212);
		contentPane.add(panelDatosCentro);
		panelDatosCentro.setLayout(null);
		
		JLabel lblDatosDelCentro = new JLabel("Datos del Centro");
		lblDatosDelCentro.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblDatosDelCentro.setBounds(149, 11, 159, 22);
		panelDatosCentro.add(lblDatosDelCentro);
		
		JLabel lblCantidaDeEstudiantes = new JLabel("Cantida de Estudiantes Registrados : ");
		lblCantidaDeEstudiantes.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblCantidaDeEstudiantes.setBounds(37, 61, 282, 22);
		panelDatosCentro.add(lblCantidaDeEstudiantes);
		
		JLabel lblCantidadDePrismas = new JLabel("Cantidad de Prismas Registrados :");
		lblCantidadDePrismas.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblCantidadDePrismas.setBounds(55, 111, 258, 22);
		panelDatosCentro.add(lblCantidadDePrismas);
		
		JLabel lblCantidadDePrismas_1 = new JLabel("Cantidad de Prismas Creados :");
		lblCantidadDePrismas_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblCantidadDePrismas_1.setBounds(81, 157, 232, 22);
		panelDatosCentro.add(lblCantidadDePrismas_1);
		
		txtCantEst = new JTextField();
		txtCantEst.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtCantEst.setEditable(false);
		txtCantEst.setBounds(329, 59, 80, 28);
		panelDatosCentro.add(txtCantEst);
		txtCantEst.setColumns(10);
		
		txtPrismSalvado = new JTextField();
		txtPrismSalvado.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtPrismSalvado.setEditable(false);
		txtPrismSalvado.setColumns(10);
		txtPrismSalvado.setBounds(329, 109, 80, 28);
		panelDatosCentro.add(txtPrismSalvado);
		
		txtPrismCreados = new JTextField();
		txtPrismCreados.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtPrismCreados.setEditable(false);
		txtPrismCreados.setColumns(10);
		txtPrismCreados.setBounds(329, 155, 80, 28);
		panelDatosCentro.add(txtPrismCreados);
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
		this.setResizable(false);
	}
}
