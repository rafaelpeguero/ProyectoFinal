package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class ObjtHerramienta extends JFrame {

	private JPanel contentPane;
	private JTextField txtVAi;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjtHerramienta frame = new ObjtHerramienta();
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
	public ObjtHerramienta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 250, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(10, 19, 31, 14);
		panel.add(lblTipo);
		
		JComboBox cbxPrismas = new JComboBox();
		cbxPrismas.setModel(new DefaultComboBoxModel(new String[] {"< Seleccione > ", "Cuadrado", "Rombo", "Rectangulo", "Triangulo", "Trapecio"}));
		cbxPrismas.setBounds(80, 13, 150, 22);
		panel.add(cbxPrismas);
		
		JLabel lblVerticeA = new JLabel("Vertice A :");
		lblVerticeA.setBounds(10, 52, 62, 14);
		panel.add(lblVerticeA);
		
		JLabel lblVericeB = new JLabel("Verice B : ");
		lblVericeB.setBounds(10, 85, 62, 14);
		panel.add(lblVericeB);
		
		JLabel lblVerticeC = new JLabel("Vertice C :");
		lblVerticeC.setBounds(10, 118, 62, 14);
		panel.add(lblVerticeC);
		
		JLabel lblVerticeD = new JLabel("Vertice D :");
		lblVerticeD.setBounds(10, 151, 62, 14);
		panel.add(lblVerticeD);
		
		txtVAi = new JTextField();
		txtVAi.setEnabled(false);
		txtVAi.setBounds(80, 48, 31, 20);
		panel.add(txtVAi);
		txtVAi.setColumns(10);
		
		JLabel label = new JLabel(",");
		label.setBounds(114, 61, 5, 14);
		panel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(121, 48, 34, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(80, 81, 31, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(124, 81, 31, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(80, 114, 31, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setBounds(124, 114, 31, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setBounds(80, 147, 31, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setBounds(124, 147, 31, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_1 = new JLabel(",");
		label_1.setBounds(114, 89, 5, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(",");
		label_2.setBounds(114, 124, 5, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(",");
		label_3.setBounds(114, 157, 5, 14);
		panel.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Figura 3D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(270, 11, 335, 382);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 205, 250, 188);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblVolumenPrisma = new JLabel("Volumen Prisma : ");
		lblVolumenPrisma.setBounds(22, 66, 89, 14);
		panel_2.add(lblVolumenPrisma);
		
		JLabel lblVolumenBase = new JLabel("Volumen Base : ");
		lblVolumenBase.setBounds(22, 26, 79, 14);
		panel_2.add(lblVolumenBase);
		
		JLabel lblAreaLateralPrisma = new JLabel("Area Lateral Prisma :");
		lblAreaLateralPrisma.setBounds(22, 106, 103, 14);
		panel_2.add(lblAreaLateralPrisma);
		
		JLabel lblAreraTotalPrisma = new JLabel("Arera Total Prisma :");
		lblAreraTotalPrisma.setBounds(22, 146, 98, 14);
		panel_2.add(lblAreraTotalPrisma);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setEnabled(false);
		textField_8.setBounds(140, 21, 70, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setEnabled(false);
		textField_9.setBounds(140, 62, 70, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setEnabled(false);
		textField_10.setBounds(140, 103, 70, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setEnabled(false);
		textField_11.setBounds(140, 144, 70, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 404, 595, 46);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(530, 11, 55, 23);
		panel_3.add(btnSalir);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(332, 11, 89, 23);
		panel_3.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(431, 11, 89, 23);
		panel_3.add(btnLimpiar);
	}
}
