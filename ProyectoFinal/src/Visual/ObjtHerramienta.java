package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class ObjtHerramienta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVAi;
	private JTextField txtVAii;
	private JTextField txtVBi;
	private JTextField txtVBii;
	private JTextField txtVCi;
	private JTextField txtVCii;
	private JTextField txtVDi;
	private JTextField txtVDii;
	private JTextField txtVbase;
	private JTextField txtVLprisma;
	private JTextField txtALprisma;
	private JTextField txtATprisma;
	
	
	
	//DECLARACIONES EXTRA
	private JComboBox<String> cbxPrismas;
	

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
		setResizable(false);
		setTitle("Herramienta Geometrica 3D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.setBounds(10, 19, 250, 185);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(10, 19, 31, 14);
		panelDatos.add(lblTipo);
		
		 cbxPrismas = new JComboBox<String>();
		cbxPrismas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxPrismas.getSelectedIndex()==1) { //CUADRADO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					
					txtVAi.setText(null);
					txtVAii.setText(null);
					txtVBi.setText(null);
					txtVBii.setText(null);
					
				}if(cbxPrismas.getSelectedIndex()==2) { //ROMBO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					txtVDi.setEnabled(true);
					txtVDii.setEnabled(true);
					
				}if(cbxPrismas.getSelectedIndex()==3) {//RECTANGULO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					
				}if(cbxPrismas.getSelectedIndex()==4) {//TRIANGULO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					
				}if(cbxPrismas.getSelectedIndex()==5) {//TRAPECIO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					txtVDi.setEnabled(true);
					txtVDii.setEnabled(true);
					
				}
				
				
			}
		});
		cbxPrismas.setModel(new DefaultComboBoxModel<String>(new String[] {"< Seleccione > ", "Cuadrado", "Rombo", "Rectangulo", "Triangulo", "Trapecio"}));
		cbxPrismas.setBounds(80, 13, 150, 22);
		panelDatos.add(cbxPrismas);
		
		JLabel lblVerticeA = new JLabel("Vertice A :");
		lblVerticeA.setBounds(10, 52, 62, 14);
		panelDatos.add(lblVerticeA);
		
		JLabel lblVericeB = new JLabel("Verice B : ");
		lblVericeB.setBounds(10, 85, 62, 14);
		panelDatos.add(lblVericeB);
		
		JLabel lblVerticeC = new JLabel("Vertice C :");
		lblVerticeC.setBounds(10, 118, 62, 14);
		panelDatos.add(lblVerticeC);
		
		JLabel lblVerticeD = new JLabel("Vertice D :");
		lblVerticeD.setBounds(10, 151, 62, 14);
		panelDatos.add(lblVerticeD);
		
		JLabel label = new JLabel(",");
		label.setBounds(114, 61, 5, 14);
		panelDatos.add(label);
		
		JLabel label_1 = new JLabel(",");
		label_1.setBounds(114, 89, 5, 14);
		panelDatos.add(label_1);
		
		JLabel label_2 = new JLabel(",");
		label_2.setBounds(114, 124, 5, 14);
		panelDatos.add(label_2);
		
		JLabel label_3 = new JLabel(",");
		label_3.setBounds(114, 157, 5, 14);
		panelDatos.add(label_3);
		
		txtVAi = new JTextField();
		txtVAi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar(); //captura
				if( (caracter < '0') || (caracter > '9') ) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Formato incorecto, solo se permiten numeros", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		});
		txtVAi.setText("x1");
		txtVAi.setEnabled(false);
		txtVAi.setBounds(80, 48, 31, 20);
		panelDatos.add(txtVAi);
		txtVAi.setColumns(10);
		
		txtVAii = new JTextField();
		txtVAii.setText("y1\r\n");
		txtVAii.setEnabled(false);
		txtVAii.setBounds(121, 48, 34, 20);
		panelDatos.add(txtVAii);
		txtVAii.setColumns(10);
		
		txtVBi = new JTextField();
		txtVBi.setText("x2");
		txtVBi.setEnabled(false);
		txtVBi.setBounds(80, 81, 31, 20);
		panelDatos.add(txtVBi);
		txtVBi.setColumns(10);
		
		txtVBii = new JTextField();
		txtVBii.setText("y2");
		txtVBii.setEnabled(false);
		txtVBii.setBounds(124, 81, 31, 20);
		panelDatos.add(txtVBii);
		txtVBii.setColumns(10);
		
		txtVCi = new JTextField();
		txtVCi.setText("x3");
		txtVCi.setEnabled(false);
		txtVCi.setBounds(80, 114, 31, 20);
		panelDatos.add(txtVCi);
		txtVCi.setColumns(10);
		
		txtVCii = new JTextField();
		txtVCii.setText("y3");
		txtVCii.setEnabled(false);
		txtVCii.setBounds(124, 114, 31, 20);
		panelDatos.add(txtVCii);
		txtVCii.setColumns(10);
		
		txtVDi = new JTextField();
		txtVDi.setText("x4");
		txtVDi.setEnabled(false);
		txtVDi.setBounds(80, 147, 31, 20);
		panelDatos.add(txtVDi);
		txtVDi.setColumns(10);
		
		txtVDii = new JTextField();
		txtVDii.setText("y4\r\n");
		txtVDii.setEnabled(false);
		txtVDii.setBounds(124, 147, 31, 20);
		panelDatos.add(txtVDii);
		txtVDii.setColumns(10);
		
		JPanel panelFigura = new JPanel();
		panelFigura.setBorder(new TitledBorder(null, "Figura 3D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFigura.setBounds(270, 19, 335, 384);
		contentPane.add(panelFigura);
		
		JPanel panelResultados = new JPanel();
		panelResultados.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelResultados.setBounds(10, 215, 250, 188);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);
		
		JLabel lblVolumenPrisma = new JLabel("Volumen Prisma : ");
		lblVolumenPrisma.setBounds(22, 66, 124, 14);
		panelResultados.add(lblVolumenPrisma);
		
		JLabel lblVolumenBase = new JLabel("Volumen Base : ");
		lblVolumenBase.setBounds(22, 26, 124, 14);
		panelResultados.add(lblVolumenBase);
		
		JLabel lblAreaLateralPrisma = new JLabel("Area Lateral Prisma :");
		lblAreaLateralPrisma.setBounds(22, 106, 124, 14);
		panelResultados.add(lblAreaLateralPrisma);
		
		JLabel lblAreraTotalPrisma = new JLabel("Arera Total Prisma :");
		lblAreraTotalPrisma.setBounds(22, 146, 124, 14);
		panelResultados.add(lblAreraTotalPrisma);
		
		txtVbase = new JTextField();
		txtVbase.setEditable(false);
		txtVbase.setEnabled(false);
		txtVbase.setBounds(147, 23, 70, 20);
		panelResultados.add(txtVbase);
		txtVbase.setColumns(10);
		
		txtVLprisma = new JTextField();
		txtVLprisma.setEditable(false);
		txtVLprisma.setEnabled(false);
		txtVLprisma.setBounds(147, 63, 70, 20);
		panelResultados.add(txtVLprisma);
		txtVLprisma.setColumns(10);
		
		txtALprisma = new JTextField();
		txtALprisma.setEditable(false);
		txtALprisma.setEnabled(false);
		txtALprisma.setBounds(147, 103, 70, 20);
		panelResultados.add(txtALprisma);
		txtALprisma.setColumns(10);
		
		txtATprisma = new JTextField();
		txtATprisma.setEditable(false);
		txtATprisma.setEnabled(false);
		txtATprisma.setBounds(147, 143, 70, 20);
		panelResultados.add(txtATprisma);
		txtATprisma.setColumns(10);
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBounds(10, 414, 595, 46);
		contentPane.add(panelBtns);
		panelBtns.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(525, 11, 60, 23);
		panelBtns.add(btnSalir);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(327, 11, 89, 23);
		panelBtns.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(426, 11, 89, 23);
		panelBtns.add(btnLimpiar);
	}
}
