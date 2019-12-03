package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

@SuppressWarnings("unused")
public class ObjEstudiante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtId;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjEstudiante frame = new ObjEstudiante();
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
	public ObjEstudiante() {
		setTitle("Registro de Estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		Dimensionador();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 287, 133);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre : ");
		lblNombre.setBounds(10, 11, 48, 14);
		panel_1.add(lblNombre);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(10, 43, 48, 14);
		panel_1.add(lblId);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(10, 79, 48, 14);
		panel_1.add(lblSexo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(68, 8, 205, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBounds(68, 40, 96, 20);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		@SuppressWarnings("rawtypes")
		JComboBox cbxSexo = new JComboBox();
		cbxSexo.setBounds(68, 75, 96, 18);
		panel_1.add(cbxSexo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 149, 569, 110);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 549, 88);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 261, 569, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(373, 11, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(472, 11, 89, 23);
		panel.add(btnCancelar);
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
