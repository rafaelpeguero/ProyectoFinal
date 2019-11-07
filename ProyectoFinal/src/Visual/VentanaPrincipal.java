package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Manejador Matematico de Prisma");
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
		
		JMenu mnFunciones = new JMenu("Funciones");
		menuBar.add(mnFunciones);
		
		JMenu mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		JMenu mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
