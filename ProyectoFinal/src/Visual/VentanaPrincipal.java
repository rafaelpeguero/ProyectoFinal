package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("unused")
public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/Imagenes/casa.png")));
		setTitle("Men\u00FA Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 365);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEditor = new JMenu("Editor");
		menuBar.add(mnEditor);
		
		JMenuItem mntmNuevo = new JMenuItem("+ Nuevo ");
		mnEditor.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("+ Abrir");
		mnEditor.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("+ Salvar");
		mnEditor.add(mntmSalvar);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		menuBar.add(mnEstudiante);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro");
		mnEstudiante.add(mntmRegistro);
		
		JMenuItem mntmListado = new JMenuItem("Listado ");
		mnEstudiante.add(mntmListado);
		
		JMenu mnFunciones = new JMenu("Reporte");
		menuBar.add(mnFunciones);
		
		JMenu mnReporte = new JMenu("Aplicaciones");
		menuBar.add(mnReporte);
		
		JMenu mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/images.png")));
		label.setBounds(10, 70, 400, 135);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/cuadros-en-lienzo-fondo-geometrico-suave-en-colores-pastel-abstracto-con-degradados-vector.jpg")));
		label_1.setBounds(115, -33, 591, 355);
		contentPane.add(label_1);
	}
}
