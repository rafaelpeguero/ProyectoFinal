package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.StdDraw3D;
import Logico.FiguraPlana;
import Logico.Cuadrado;
import Logico.Rectangulo;
import Logico.Rombo;
import Logico.Trapecio;
import Logico.Triangulo;

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
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class ObjtHerramienta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVbase;
	private JTextField txtVLprisma;
	private JTextField txtALprisma;
	private JTextField txtATprisma;
	
	
	
	//DECLARACIONES EXTRA
	private JButton btnGraficar, btnCalcular,btnLimpiar; 
	private boolean instanciaSalvada = false; 
	
	private JPanel panelCuadrado,panelTriangulo,panelTrapecio,panelRombo;
	private JPanel pn_btnCalcular;
	private JPanel panel_1;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField txtVAxCuad;
	private JTextField txtVAyCuad; 
	private JTextField txtVBxCuad;
	private JTextField txtVByCuad;
	private JComboBox<String> cbxPrismas;
	private JLabel label;
	private JLabel label_5;
	private JComboBox<String> cbxColor;
	private JLabel label_7;
	private JTextField txtLongAlturaTrap;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JTextField txtVAxTrap;
	private JTextField txtVAyTrap;
	private JTextField txtVBxTrap;
	private JTextField txtVByTrap;
	private JTextField txtVCxTrap;
	private JTextField txtVCyTrap;
	private JTextField txtVDxTrap;
	private JTextField txtVDyTrap;
	private JLabel label_13;
	private JTextField txtVAxRomb;
	private JTextField txtVAyRomb;
	private JPanel panelRectangulo;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_18;
	private JTextField txtVAxRect;
	private JTextField txtVAyRect;
	private JTextField txtVBxRect;
	private JTextField txtVByRect;
	private JTextField txtVCxRect;
	private JTextField txtVCyRect;
	private JLabel label_12;
	private JLabel label_6;
	private JTextField txtVCxTria;
	private JTextField txtVCyTria;
	private JLabel label_19;
	private JLabel lblVericeM;
	private JTextField txtVAxTria;
	private JTextField txtVAyTria;
	private JTextField txtVMxTria;
	private JTextField txtVMyTria;
	private JTextField txtDiametroVert;
	private JTextField txtDiametroHoriz;
	
	private JTextField txtAlturaPrism;
	

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjtHerramienta.class.getResource("/Images/Cube.png")));
		setResizable(false);
		setTitle("Herramienta Geometrica 3D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		Dimensionador(); //Extra
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.setBounds(699, 132, 383, 221);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		  
		   panelTriangulo = new JPanel();
		   panelTriangulo.setVisible(false);
		   panelTriangulo.setBorder(new TitledBorder(null, "Parametros de un Triangulo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		   panelTriangulo.setBounds(0, 0, 383, 221);
		   panelDatos.add(panelTriangulo);
		   panelTriangulo.setLayout(null);
		   
		   label_6 = new JLabel("Vertice C :");
		   label_6.setBounds(89, 99, 62, 21);
		   panelTriangulo.add(label_6);
		   
		   label_19 = new JLabel("Vertice A :");
		   label_19.setBounds(89, 39, 62, 21);
		   panelTriangulo.add(label_19);
		   
		   lblVericeM = new JLabel("Vertice M : ");
		   lblVericeM.setBounds(89, 160, 73, 21);
		   panelTriangulo.add(lblVericeM);
		   
		   txtVAxTria = new JTextField();
		   txtVAxTria.setEnabled(false);
		   txtVAxTria.setText("   x1\r\n");
		   txtVAxTria.setColumns(10);
		   txtVAxTria.setBounds(159, 40, 31, 20);
		   panelTriangulo.add(txtVAxTria);
		   
		   txtVAyTria = new JTextField();
		   txtVAyTria.setEnabled(false);
		   txtVAyTria.setText("  y1\r\n");
		   txtVAyTria.setColumns(10);
		   txtVAyTria.setBounds(200, 40, 31, 20);
		   panelTriangulo.add(txtVAyTria);
		   
		   txtVCxTria = new JTextField();
		   txtVCxTria.setEnabled(false);
		   txtVCxTria.setText("  x3\r\n");
		   txtVCxTria.setColumns(10);
		   txtVCxTria.setBounds(161, 100, 31, 20);
		   panelTriangulo.add(txtVCxTria);
		   
		   txtVCyTria = new JTextField();
		   txtVCyTria.setEnabled(false);
		   txtVCyTria.setText("  y3\r\n");
		   txtVCyTria.setColumns(10);
		   txtVCyTria.setBounds(202, 100, 31, 20);
		   panelTriangulo.add(txtVCyTria);
		   
		   txtVMxTria = new JTextField();
		   txtVMxTria.setEnabled(false);
		   txtVMxTria.setText("  x2");
		   txtVMxTria.setColumns(10);
		   txtVMxTria.setBounds(161, 160, 31, 20);
		   panelTriangulo.add(txtVMxTria);
		   
		   txtVMyTria = new JTextField();
		   txtVMyTria.setEnabled(false);
		   txtVMyTria.setText("  y2\r\n");
		   txtVMyTria.setColumns(10);
		   txtVMyTria.setBounds(202, 160, 31, 20);
		   panelTriangulo.add(txtVMyTria);
		   
		    panelRombo = new JPanel();
		    panelRombo.setBounds(0, 0, 383, 221);
		    panelDatos.add(panelRombo);
		    panelRombo.setVisible(false);
		    panelRombo.setBorder(new TitledBorder(null, "Parametros de un Rombo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		    panelRombo.setLayout(null);
		    
		    label_13 = new JLabel("Vertice A :");
		    label_13.setBounds(43, 39, 62, 21);
		    panelRombo.add(label_13);
		    
		    txtVAxRomb = new JTextField();
		    txtVAxRomb.setEnabled(false);
		    txtVAxRomb.setText("   x1\r\n");
		    txtVAxRomb.setColumns(10);
		    txtVAxRomb.setBounds(113, 39, 31, 21);
		    panelRombo.add(txtVAxRomb);
		    
		    txtVAyRomb = new JTextField();
		    txtVAyRomb.setEnabled(false);
		    txtVAyRomb.setText("  y1\r\n");
		    txtVAyRomb.setColumns(10);
		    txtVAyRomb.setBounds(154, 39, 31, 21);
		    panelRombo.add(txtVAyRomb);
		    
		    JLabel lblDiametroVertical = new JLabel("Diametro Vertical :");
		    lblDiametroVertical.setBounds(43, 99, 142, 21);
		    panelRombo.add(lblDiametroVertical);
		    
		    JLabel lblDiametroHorizonatal = new JLabel("Diametro Horizonatal :");
		    lblDiametroHorizonatal.setBounds(43, 159, 142, 21);
		    panelRombo.add(lblDiametroHorizonatal);
		    
		    txtDiametroVert = new JTextField();
		    txtDiametroVert.setEnabled(false);
		    txtDiametroVert.setText("  D");
		    txtDiametroVert.setBounds(154, 98, 31, 21);
		    panelRombo.add(txtDiametroVert);
		    txtDiametroVert.setColumns(10);
		    
		    txtDiametroHoriz = new JTextField();
		    txtDiametroHoriz.setEnabled(false);
		    txtDiametroHoriz.setText(" d");
		    txtDiametroHoriz.setBounds(176, 159, 31, 21);
		    panelRombo.add(txtDiametroHoriz);
		    txtDiametroHoriz.setColumns(10);
		    
		     panelTrapecio = new JPanel();
		     panelTrapecio.setBounds(0, 0, 383, 219);
		     panelDatos.add(panelTrapecio);
		     panelTrapecio.setVisible(false);
		     panelTrapecio.setBorder(new TitledBorder(null, "Parametros de un Trapecio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		     panelTrapecio.setLayout(null);
		     
		     label_7 = new JLabel("Longitud Altura (cm) : ");
		     label_7.setBounds(10, 158, 142, 20);
		     panelTrapecio.add(label_7);
		     
		     txtLongAlturaTrap = new JTextField();
		     txtLongAlturaTrap.setEnabled(false);
		     txtLongAlturaTrap.setText("  Altura base");
		     txtLongAlturaTrap.setColumns(10);
		     txtLongAlturaTrap.setBounds(135, 158, 85, 21);
		     panelTrapecio.add(txtLongAlturaTrap);
		     
		     label_8 = new JLabel("Vertice A :");
		     label_8.setBounds(46, 39, 62, 20);
		     panelTrapecio.add(label_8);
		     
		     label_9 = new JLabel("Verice B : ");
		     label_9.setBounds(200, 39, 62, 20);
		     panelTrapecio.add(label_9);
		     
		     label_10 = new JLabel("Vertice C :");
		     label_10.setBounds(46, 98, 62, 21);
		     panelTrapecio.add(label_10);
		     
		     label_11 = new JLabel("Vertice D :");
		     label_11.setBounds(200, 98, 62, 20);
		     panelTrapecio.add(label_11);
		     
		     txtVAxTrap = new JTextField();
		     txtVAxTrap.setEnabled(false);
		     txtVAxTrap.setText("   x1\r\n");
		     txtVAxTrap.setColumns(10);
		     txtVAxTrap.setBounds(112, 39, 31, 21);
		     panelTrapecio.add(txtVAxTrap);
		     
		     txtVAyTrap = new JTextField();
		     txtVAyTrap.setEnabled(false);
		     txtVAyTrap.setText("  y1\r\n");
		     txtVAyTrap.setColumns(10);
		     txtVAyTrap.setBounds(153, 39, 31, 21);
		     panelTrapecio.add(txtVAyTrap);
		     
		     txtVBxTrap = new JTextField();
		     txtVBxTrap.setEnabled(false);
		     txtVBxTrap.setText("  x2");
		     txtVBxTrap.setColumns(10);
		     txtVBxTrap.setBounds(272, 39, 31, 21);
		     panelTrapecio.add(txtVBxTrap);
		     
		     txtVByTrap = new JTextField();
		     txtVByTrap.setEnabled(false);
		     txtVByTrap.setText("  y2\r\n");
		     txtVByTrap.setColumns(10);
		     txtVByTrap.setBounds(313, 39, 31, 21);
		     panelTrapecio.add(txtVByTrap);
		     
		     txtVCxTrap = new JTextField();
		     txtVCxTrap.setEnabled(false);
		     txtVCxTrap.setText("  x3\r\n");
		     txtVCxTrap.setColumns(10);
		     txtVCxTrap.setBounds(112, 99, 31, 21);
		     panelTrapecio.add(txtVCxTrap);
		     
		     txtVCyTrap = new JTextField();
		     txtVCyTrap.setEnabled(false);
		     txtVCyTrap.setText("  y3\r\n");
		     txtVCyTrap.setColumns(10);
		     txtVCyTrap.setBounds(153, 99, 31, 21);
		     panelTrapecio.add(txtVCyTrap);
		     
		     txtVDxTrap = new JTextField();
		     txtVDxTrap.setEnabled(false);
		     txtVDxTrap.setText("  x4\r\n");
		     txtVDxTrap.setColumns(10);
		     txtVDxTrap.setBounds(272, 99, 31, 21);
		     panelTrapecio.add(txtVDxTrap);
		     
		     txtVDyTrap = new JTextField();
		     txtVDyTrap.setEnabled(false);
		     txtVDyTrap.setText("  y4\r\n");
		     txtVDyTrap.setColumns(10);
		     txtVDyTrap.setBounds(313, 99, 31, 21);
		     panelTrapecio.add(txtVDyTrap);
		     
		      panelCuadrado = new JPanel();
		      panelCuadrado.setBounds(0, 0, 383, 219);
		      panelDatos.add(panelCuadrado);
		      panelCuadrado.setVisible(false);
		      panelCuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parametros de un Cuadrado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		      panelCuadrado.setLayout(null);
		      
		      label_1 = new JLabel("Vertice A :");
		      label_1.setBounds(122, 63, 62, 14);
		      panelCuadrado.add(label_1);
		      
		      label_2 = new JLabel("Verice B : ");
		      label_2.setBounds(132, 140, 62, 14);
		      panelCuadrado.add(label_2);
		      
		      txtVAxCuad = new JTextField();
		      txtVAxCuad.setEnabled(false);
		      txtVAxCuad.setText("   x1\r\n");
		      txtVAxCuad.setColumns(10);
		      txtVAxCuad.setBounds(192, 59, 31, 20);
		      panelCuadrado.add(txtVAxCuad);
		      
		      txtVAyCuad = new JTextField();
		      txtVAyCuad.setEnabled(false);
		      txtVAyCuad.setText("  y1\r\n");
		      txtVAyCuad.setColumns(10);
		      txtVAyCuad.setBounds(233, 59, 31, 20);
		      panelCuadrado.add(txtVAyCuad);
		      
		      txtVBxCuad = new JTextField();
		      txtVBxCuad.setEnabled(false);
		      txtVBxCuad.setText("  x2");
		      txtVBxCuad.setColumns(10);
		      txtVBxCuad.setBounds(192, 138, 31, 20);
		      panelCuadrado.add(txtVBxCuad);
		      
		      txtVByCuad = new JTextField();
		      txtVByCuad.setEnabled(false);
		      txtVByCuad.setText("  y2\r\n");
		      txtVByCuad.setColumns(10);
		      txtVByCuad.setBounds(233, 138, 31, 20);
		      panelCuadrado.add(txtVByCuad);
		      
		      panelRectangulo = new JPanel();
		      panelRectangulo.setBounds(0, 0, 383, 221);
		      panelDatos.add(panelRectangulo);
		      panelRectangulo.setVisible(false);
		      panelRectangulo.setBorder(new TitledBorder(null, "Parametros de un Rectangulo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		      panelRectangulo.setLayout(null);
		      
		      label_3 = new JLabel("Vertice A :");
		      label_3.setBounds(120, 44, 62, 14);
		      panelRectangulo.add(label_3);
		      
		      label_4 = new JLabel("Verice B : ");
		      label_4.setBounds(120, 102, 62, 14);
		      panelRectangulo.add(label_4);
		      
		      label_18 = new JLabel("Vertice C :");
		      label_18.setBounds(120, 160, 62, 14);
		      panelRectangulo.add(label_18);
		      
		      txtVAxRect = new JTextField();
		      txtVAxRect.setEnabled(false);
		      txtVAxRect.setText("   x1\r\n");
		      txtVAxRect.setColumns(10);
		      txtVAxRect.setBounds(190, 40, 31, 20);
		      panelRectangulo.add(txtVAxRect);
		      
		      txtVAyRect = new JTextField();
		      txtVAyRect.setEnabled(false);
		      txtVAyRect.setText("  y1\r\n");
		      txtVAyRect.setColumns(10);
		      txtVAyRect.setBounds(231, 40, 31, 20);
		      panelRectangulo.add(txtVAyRect);
		      
		      txtVBxRect = new JTextField();
		      txtVBxRect.setEnabled(false);
		      txtVBxRect.setText("  x2");
		      txtVBxRect.setColumns(10);
		      txtVBxRect.setBounds(190, 100, 31, 20);
		      panelRectangulo.add(txtVBxRect);
		      
		      txtVByRect = new JTextField();
		      txtVByRect.setEnabled(false);
		      txtVByRect.setText("  y2\r\n");
		      txtVByRect.setColumns(10);
		      txtVByRect.setBounds(231, 100, 31, 20);
		      panelRectangulo.add(txtVByRect);
		      
		      txtVCxRect = new JTextField();
		      txtVCxRect.setEnabled(false);
		      txtVCxRect.setText("  x3\r\n");
		      txtVCxRect.setColumns(10);
		      txtVCxRect.setBounds(190, 160, 31, 20);
		      panelRectangulo.add(txtVCxRect);
		      
		      txtVCyRect = new JTextField();
		      txtVCyRect.setEnabled(false);
		      txtVCyRect.setText("  y3\r\n");
		      txtVCyRect.setColumns(10);
		      txtVCyRect.setBounds(231, 160, 31, 20);
		      panelRectangulo.add(txtVCyRect);
		
		JPanel panelResultados = new JPanel();
		panelResultados.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelResultados.setBounds(699, 364, 383, 245);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);
		
		JLabel lblVolumenPrisma = new JLabel("Volumen Prisma (cm^3): ");
		lblVolumenPrisma.setBounds(61, 89, 160, 20);
		panelResultados.add(lblVolumenPrisma);
		
		JLabel lblVolumenBase = new JLabel("Volumen Base (cm^3 ) : ");
		lblVolumenBase.setBounds(61, 36, 160, 20);
		panelResultados.add(lblVolumenBase);
		
		JLabel lblAreaLateralPrisma = new JLabel("Area Lateral Prisma (cm^2):");
		lblAreaLateralPrisma.setBounds(61, 142, 160, 20);
		panelResultados.add(lblAreaLateralPrisma);
		
		JLabel lblAreraTotalPrisma = new JLabel("Arera Total Prisma (cm^2):");
		lblAreraTotalPrisma.setBounds(61, 195, 160, 20);
		panelResultados.add(lblAreraTotalPrisma);
		
		txtVbase = new JTextField();
		txtVbase.setEditable(false);
		txtVbase.setBounds(231, 36, 85, 20);
		panelResultados.add(txtVbase);
		txtVbase.setColumns(10);
		
		txtVLprisma = new JTextField();
		txtVLprisma.setEditable(false);
		txtVLprisma.setBounds(231, 89, 85, 20);
		panelResultados.add(txtVLprisma);
		txtVLprisma.setColumns(10);
		
		txtALprisma = new JTextField();
		txtALprisma.setEditable(false);
		txtALprisma.setBounds(231, 142, 85, 20);
		panelResultados.add(txtALprisma);
		txtALprisma.setColumns(10);
		
		txtATprisma = new JTextField();
		txtATprisma.setEditable(false);
		txtATprisma.setBounds(231, 195, 85, 20);
		panelResultados.add(txtATprisma);
		txtATprisma.setColumns(10);
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBounds(1168, 682, 144, 46);
		contentPane.add(panelBtns);
		panelBtns.setLayout(new CardLayout(0, 0));
		
		JButton btnSalir = new JButton("Salir");
		panelBtns.add(btnSalir, "name_64091033486400");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					msgSalvar(e);
			}
		});
		 
		 JPanel panelTipoPrisma = new JPanel();
		 panelTipoPrisma.setBorder(new TitledBorder(null, "Parametros del Prisma 3D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		 panelTipoPrisma.setBounds(699, 11, 383, 115);
		 contentPane.add(panelTipoPrisma);
		 panelTipoPrisma.setLayout(null);
		 
		 cbxPrismas = new JComboBox<String>();
		 cbxPrismas.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 			//defaultVertice(String.valueOf(cbxPrismas.getSelectedItem()));
		 			defaultPanel();
		 		
		 		/*if(cbxPrismas.getSelectedIndex()!=0) {
		 			cbxColor.setEnabled(true);
		 			txtAlturaPrism.setEnabled(true);
		 			btnLimpiar.setEnabled(true);
		 		}
		 		if(cbxPrismas.getSelectedIndex()==1) {
		 			panelCuadrado.setVisible(true);
		 		}
		 		if(cbxPrismas.getSelectedIndex()==2) {
		 			panelRectangulo.setVisible(true);
		 		}
		 		if(cbxPrismas.getSelectedIndex()==3) {
		 			panelRombo.setVisible(true);	
		 		}
		 		if(cbxPrismas.getSelectedIndex()==4) {
		 			panelTriangulo.setVisible(true);
		 		}
		 		if(cbxPrismas.getSelectedIndex()==5) {
		 			panelTrapecio.setVisible(true);
		 		}*/
		 		
		 		if(cbxPrismas.getSelectedIndex()!=0) {
		 			
		 			cbxColor.setEnabled(true);
		 			btnLimpiar.setEnabled(true);
		 			btnCalcular.setEnabled(true);
		 			btnGraficar.setEnabled(true);
		 			
		 			
		 			
		 			String opc = String.valueOf(cbxPrismas.getSelectedItem());
			 		
			 		switch(opc){
			 			case ("Cuadrado"): 		panelCuadrado.setVisible(true);			break;
			 			case ("Rectangulo"): 	panelRectangulo.setVisible(true);		break;
			 			case ("Rombo"): 		panelRombo.setVisible(true);			break;
			 			case ("Triangulo"): 	panelTriangulo.setVisible(true);		break;
			 			case ("Trapecio"): 		panelTrapecio.setVisible(true);			break;
			 			
			 			default : msgError(null);		break; //defaultPanel();
			 		}
		 		}
		 	}
		 });
		 cbxPrismas.setModel(new DefaultComboBoxModel<String>(new String[] {"< Seleccione >", "Triangulo", "Rombo", "Cuadrado", "Rectangulo", "Trapecio"}));
		 cbxPrismas.setBounds(100, 16, 150, 22);
		 panelTipoPrisma.add(cbxPrismas);
		 
		 cbxColor = new JComboBox<String>();
		 cbxColor.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		txtAlturaPrism.setEnabled(true);
		 		txtAlturaPrism.setText(null);
		 		
		 		txtVAxCuad.setText(null);
		 		txtVAxCuad.setEnabled(true);
		 		txtVAyCuad.setText(null);
		 		txtVAyCuad.setEnabled(true);
				txtVBxCuad.setText(null);
				txtVBxCuad.setEnabled(true);
				txtVByCuad.setText(null);
				txtVByCuad.setEnabled(true);
				
				txtVAxTria.setText(null);
				txtVAxTria.setEnabled(true);
				txtVAyTria.setText(null);
				txtVAyTria.setEnabled(true);
				txtVCxTria.setText(null);
				txtVCxTria.setEnabled(true);
				txtVCyTria.setText(null);
				txtVCyTria.setEnabled(true);
				txtVMxTria.setText(null);
				txtVMxTria.setEnabled(true);
				txtVMyTria.setText(null);
				txtVMyTria.setEnabled(true);
				
				txtVAxRect.setText(null);
				txtVAxRect.setEnabled(true);
				txtVAyRect.setText(null);
				txtVAyRect.setEnabled(true);
				txtVBxRect.setText(null);
				txtVBxRect.setEnabled(true);
				txtVByRect.setText(null);
				txtVByRect.setEnabled(true);
				txtVCxRect.setText(null);
				txtVCxRect.setEnabled(true);
				txtVCyRect.setText(null);
				txtVCyRect.setEnabled(true);
				
				
				txtVAxRomb.setText(null);
				txtVAxRomb.setEnabled(true);
				txtVAyRomb.setText(null);
				txtVAyRomb.setEnabled(true);
				txtDiametroVert.setText(null);
				txtDiametroVert.setEnabled(true);
				txtDiametroHoriz.setText(null);
				txtDiametroHoriz.setEnabled(true);
				
				txtVAxTrap.setText(null);
				txtVAxTrap.setEnabled(true);
				txtVAyTrap.setText(null);
				txtVAyTrap.setEnabled(true);
				txtVBxTrap.setText(null);
				txtVBxTrap.setEnabled(true);
				txtVByTrap.setText(null);
				txtVByTrap.setEnabled(true);
				txtVCxTrap.setText(null);
				txtVCxTrap.setEnabled(true);
				txtVCyTrap.setText(null);
				txtVCyTrap.setEnabled(true);
				txtVDxTrap.setText(null);
				txtVDxTrap.setEnabled(true);
				txtVDyTrap.setText(null);
				txtVDyTrap.setEnabled(true);
				
				txtVbase.setText(null);
				txtVLprisma.setText(null);
				txtVbase.setText(null);
				txtALprisma.setText(null);
				txtATprisma.setText(null);
				txtLongAlturaTrap.setText(null);
		 	}
		 });
		 cbxColor.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnCalcular.setEnabled(true);
	 			btnGraficar.setEnabled(true);
		 	}
		 });
		 cbxColor.setModel(new DefaultComboBoxModel(new String[] {"< Seleccione >", "Blanco", "Azul", "Rojo", "Amarillo", "Verde", "Gris claro"}));
		 cbxColor.setEnabled(false);
		 cbxColor.setBounds(100, 54, 150, 22);
		 panelTipoPrisma.add(cbxColor);
		 
		 label_5 = new JLabel("Color : ");
		 label_5.setBounds(34, 56, 60, 20);
		 panelTipoPrisma.add(label_5);
		 
		 label = new JLabel("Tipo : ");
		 label.setBounds(34, 16, 60, 22);
		 panelTipoPrisma.add(label);
		 
		 label_12 = new JLabel("Altura Prisma (cm)    :");
		 label_12.setBounds(34, 90, 125, 14);
		 panelTipoPrisma.add(label_12);
		 
		 txtAlturaPrism = new JTextField();
		 txtAlturaPrism.setText("  Altura prisma");
		 txtAlturaPrism.setEnabled(false);
		 txtAlturaPrism.setColumns(10);
		 txtAlturaPrism.setBounds(165, 87, 85, 20);
		 panelTipoPrisma.add(txtAlturaPrism);
		 
		 JPanel panel_2 = new JPanel();
		 panel_2.setBounds(1153, 167, 144, 46);
		 contentPane.add(panel_2);
		 panel_2.setLayout(new CardLayout(0, 0));
		 
		 btnGraficar = new JButton("Graficar");
		 btnGraficar.setEnabled(false);
		 btnGraficar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String tipo ;
		 		tipo = String.valueOf(cbxPrismas.getSelectedItem()) ;			
		 	
		 				//INCLUIR El Validador antes de graficar
		 		Graficar(tipo);

		 	}
		 });
		 btnGraficar.setLocation(132, 0);
		 panel_2.add(btnGraficar, "name_1079070842300");
		 
		 panel_1 = new JPanel();
		 panel_1.setBounds(1153, 212, 144, 46);
		 contentPane.add(panel_1);
		 panel_1.setLayout(new CardLayout(0, 0));
		 
		 btnLimpiar = new JButton("Limpiar");
		 btnLimpiar.setEnabled(false);
		 panel_1.add(btnLimpiar, "name_63570059247400");
		 
		 pn_btnCalcular = new JPanel();
		 pn_btnCalcular.setBounds(1153, 257, 144, 46);
		 contentPane.add(pn_btnCalcular);
		 pn_btnCalcular.setLayout(new CardLayout(0, 0));
		 
		 btnCalcular = new JButton("Calcular");
		 btnCalcular.setEnabled(false);
		 btnCalcular.setLocation(132, 0);
		 pn_btnCalcular.add(btnCalcular, "name_1279219772400");
		 
		 JPanel panel = new JPanel();
		 panel.setBounds(1153, 302, 144, 46);
		 contentPane.add(panel);
		 panel.setLayout(new CardLayout(0, 0));
		 
		 JButton btnSalvar = new JButton("Salvar");
		 panel.add(btnSalvar, "name_64044228698400");
		 btnSalvar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		 btnCalcular.addActionListener(new ActionListener() {
		 	
		 	public void actionPerformed(ActionEvent e) {
		 	
		 		String tipo ;//= "Cuadrado"; //Prueba;
		 		tipo = String.valueOf(cbxPrismas.getSelectedItem()) ;			
//				tipo = cbxPrismas.getItemAt( cbxPrismas.getSelectedItem() );
		 		//INCLUIR El Validador antes de graficar
		 		Calcular(tipo);
		 	
		 		//Graficar(tipo);
		 		
		 	}
		 });
		 btnLimpiar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		defaultPanel();
		 		cbxPrismas.setSelectedIndex(0);
		 		cbxPrismas.setEnabled(true);
		 		cbxColor.setSelectedIndex(0);
		 		cbxColor.setEnabled(false);
		 		
		 		txtVAxCuad.setText(null);
		 		txtVAyCuad.setText(null);
		 		txtVBxCuad.setText(null);
		 		txtVByCuad.setText(null);
		 		
		 		txtVAxTria.setText(null);
		 		txtVAyTria.setText(null);
		 		txtVCxTria.setText(null);
		 		txtVCyTria.setText(null);
		 		txtVMxTria.setText(null);
		 		txtVMyTria.setText(null);
		 		
		 		txtVAxRect.setText(null);
		 		txtVAyRect.setText(null);
		 		txtVBxRect.setText(null);
		 		txtVByRect.setText(null);
		 		txtVCxRect.setText(null);
		 		txtVCyRect.setText(null);
		 		
		 		txtVAxRomb.setText(null);
		 		txtVAyRomb.setText(null);
		 		txtDiametroVert.setText(null);
		 		txtDiametroHoriz.setText(null);
		 		
		 		txtVAxTrap.setText(null);
		 		txtVAyTrap.setText(null);
		 		txtVBxTrap.setText(null);
		 		txtVByTrap.setText(null);
		 		txtVCxTrap.setText(null);
		 		txtVCyTrap.setText(null);
		 		txtVDxTrap.setText(null);
		 		txtVDyTrap.setText(null);
		 		
		 		txtVbase.setText(null);
		 		txtVLprisma.setText(null);
		 		txtVbase.setText(null);
		 		txtALprisma.setText(null);
		 		txtATprisma.setText(null);
		 		txtLongAlturaTrap.setText(null);
		 
		 		
		 	}
		 });
	}
	
	
	/*
	 * Nombre 	  : Graficar
	 * Funcion	  : Construir Objeto StdDraw3D de los diferentes tipos de Prismas en 3D
	 * Argumentos : String tipo; tipo = tipo de base del prisma
	 * Retorno	  : Ninguno
	 */
	public void Graficar(String tipo) {
		
		Color color = SetColor(cbxColor.getSelectedItem().toString()); //Asigna un color
		
		double x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0,dV=0,dH=0,longAlturabase=0;
		//Vertices Recicidos en los TxtField del Panel de Datos
		switch (tipo) {
		
		case "Cuadrado" : {
			 x1 = Double.valueOf(txtVAxCuad.getText());
			 x2 = Double.valueOf(txtVBxCuad.getText());
			 y1 = Double.valueOf(txtVAyCuad.getText());
			 y2 = Double.valueOf(txtVByCuad.getText());
			break;
		}
		case "Rombo" :{
			 x1 = Double.valueOf(txtVAxRomb.getText());
			 x2 = Double.valueOf(txtVAyRomb.getText());
			 dV = Double.valueOf(txtDiametroVert.getText());
			 dH = Double.valueOf(txtDiametroHoriz.getText());
			
			break;
		}
		case "Rectangulo" :	{
			 x1 = Double.valueOf(txtVAxRect.getText());
			 x2 = Double.valueOf(txtVBxRect.getText());
			 x3 = Double.valueOf(txtVCxRect.getText());
			
			 y1 = Double.valueOf(txtVAyRect.getText());
			 y2 =Double.valueOf(txtVByRect.getText());
			 y3 =Double.valueOf(txtVCyRect.getText());
			
			break;
		}
		case "Triangulo" :{
			 x1 = Double.valueOf(txtVAxTria.getText());
			 x2 = Double.valueOf(txtVCxTria.getText());
			 x3 = Double.valueOf(txtVMxTria.getText());
			
			 y1 = Double.valueOf(txtVAyTria.getText());
			 y2 =Double.valueOf(txtVCyTria.getText());
			 y3 =Double.valueOf(txtVMyTria.getText());
			
			break;
		}
		case "Trapecio" :{
			 x1 = Double.valueOf(txtVAxTrap.getText());
			 x2 = Double.valueOf(txtVBxTrap.getText());
			 x3 = Double.valueOf(txtVCxTrap.getText());
			 x4 = Double.valueOf(txtVDxTrap.getText());
			
			 y1 = Double.valueOf(txtVAyTrap.getText());
			 y2 = Double.valueOf(txtVByTrap.getText());
			 y3 = Double.valueOf(txtVCyTrap.getText());
			 y4 = Double.valueOf(txtVDyTrap.getText());
			 
			 longAlturabase = Double.valueOf(txtLongAlturaTrap.getText());
			
			break;
		}
		}
		double altura = Double.valueOf(txtAlturaPrism.getText());
		
		//double yC1 = y1, yC2 = y2; //Mejorar
		
	/*
	 * Contrucion de Vertices:
	 * (1) Contruir los vertices en los (x,y,z) para las diferentes caras de la figura 3D
	 * 
	 * (2) Vertices Simetricos:
	 *  - Los Vertices de La Cara Delantera y Trasera seran iguales
	 *  - El Vertice de la Cara Izquierda debe de ser mayor o igual a la Cara Trasera; En el Caso 
	 * 	Trapecio con Pendiente a la derecha Cara Frontal sera igual a Cara Fondo
	 *  - El Vertice de la Cara Superior debe de ser mayor o igual a la Cara Izquierda; En el Caso 
	 * 	Trapecio con Pendiente a la derecha Cara Izquierda es igual a Cara Superior
	 * 
	 */

		switch (tipo) {
		
		case("Cuadrado")  :{ 			
			
			double lado = x2-x1;  //Diferencia de Vertices me da la longitud
			if (lado<0) {
				lado = lado*(-1); // Validando que la long. sea positiva
			}
			//panelCuadrado.setVisible(true);
			
			//Contruccion de Figura3D mediante la clase StdDraw3D
			StdDraw3D.setCameraOrientation(0, 0, 0); // Angulos en x,y,z
			StdDraw3D.clearOverlay(); 
			StdDraw3D.clear(StdDraw3D.BLACK);
			StdDraw3D.setScale(-10,10); 	//Estacala minima a maxima para x,y,z
			StdDraw3D.clear3D();			// Limpiando para siguiente
			StdDraw3D.setPenColor(color);
			//Se llama Overlay a la publicidad que se superpone como una capa superior sobre los vídeos en reproducción para mostrar información de empresas que pueden interesar a la clase de usuarios que ven esos vídeos en concreto.
					//////////////Vertices Cara Frontal\\\\\\\\\\\\\\\\\\
			double vXCf [] = new double [] {0,0,lado,lado};
			double vYCf [] = new double [] {0,lado,lado,0};
			double vZCf [] = new double [] {0,0,0,0}; // Coordenadas Nulas en el eje Z(imaginario)
					
			//////////////Vertices cara Fondo\\\\\\\\\\\\\\\\\\
			double vXCff [] = new double [] {0,0,lado,lado};
			double vYCff [] = new double [] {0,lado,lado,0};
			double vZCff [] = new double [] {altura,altura,altura,altura}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Izquierda\\\\\\\\\\\\\\\\\\
			double vXCi [] = new double [] {0,0,0,0};
			double vYCi [] = new double [] {0,lado,lado,0};
			double vZCi [] = new double [] {0,0,altura,altura}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Derecha\\\\\\\\\\\\\\\\\\
			double vXCd [] = new double [] {lado,lado,lado,lado};
			double vYCd [] = new double [] {0,lado,lado,0};
			double vZCd [] = new double [] {altura,altura,0,0}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Superior\\\\\\\\\\\\\\\\\\
			double vXCs [] = new double [] {0,0,lado,lado};
			double vYCs [] = new double [] {lado,lado,lado,lado};
			double vZCs [] = new double [] {0,altura,altura,0}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////	//////////Vertices Cara Inferior\\\\\\\\\\\\\\\\\\
			double vXCif [] = new double [] {0,0,lado,lado};
			double vYCif [] = new double [] {0,0,0,0};
			double vZCif [] = new double [] {0,altura,altura,0}; // Coordenadas Nulas en el eje Z(imaginario)			
	
			//C. Frontal
			PoligonoRotado(vXCf, vYCf, vZCff);
			//C. Fondo
			PoligonoRotado(vXCff, vYCff, vZCff);
			//C. Izquierda
			PoligonoRotado(vXCi, vYCi, vZCi);
			//C. Derecha
			PoligonoRotado(vXCd, vYCd, vZCd);
			//C. Superior
			PoligonoRotado(vXCs, vYCs, vZCs);
			//C.Inferior
			PoligonoRotado(vXCif, vYCif, vZCif);
			
			//Adds Grafica
			StdDraw3D.setPenColor(StdDraw3D.WHITE);
			StdDraw3D.overlayText(0, -8, "Use el mouse para mover la figura");
			
			//Fase Final, Mostrando el Objeto de StdDraw3D
			StdDraw3D.show();
			
			break;
			}
		
		case("Rectangulo"):{ 	
			panelRectangulo.setVisible(true);
			//Contruccion de Figura3D mediante la clase StdDraw3D
			StdDraw3D.setCameraOrientation(0, 0, 0); // Angulos en x,y,z
			StdDraw3D.clearOverlay(); 
			StdDraw3D.clear(StdDraw3D.BLACK);
			StdDraw3D.setScale(-10,10); 	//Estacala minima a maxima para x,y,z
			StdDraw3D.clear3D();			// Limpiando para siguiente
			StdDraw3D.setPenColor(color);
			
			double largo=0,anchura=0;
			largo = x2-x1; anchura = y2-y1;
			
			if(x2-x1 == 0) 
				largo = Math.abs(x3-x1); //Buscando el largo
			if(y2-y1 == 0)
				anchura = Math.abs(y3-y1);
			
					//////////////Vertices Rombo\\\\\\\\\\\\\\\\\\
			//double x2Rombo = x1 - (d2/2), x3Rombo = x1, x4Rombo = x1+(d2/2); 
			//double y2Rombo = y1- (d/2), y3Rombo = y1-d, y4Rombo = y2;
			//////////////Vertices Cara Frontal\\\\\\\\\\\\\\\\\\
			double vXCf [] = new double [] {0,0,largo,largo};
			double vYCf [] = new double [] {0,anchura,anchura,0};
			double vZCf [] = new double [] {0,0,0,0}; // Coordenadas Nulas en el eje Z(imaginario)
					
			//////////////Vertices cara Fondo\\\\\\\\\\\\\\\\\\
			double vXCff [] = new double [] {0,0,largo,largo};
			double vYCff [] = new double [] {0,anchura,anchura,0};
			double vZCff [] = new double [] {altura,altura,altura,altura}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Izquierda\\\\\\\\\\\\\\\\\\
			double vXCi [] = new double [] {0,0,0,0};
			double vYCi [] = new double [] {0,anchura,anchura,0};
			double vZCi [] = new double [] {0,0,altura,altura}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Derecha\\\\\\\\\\\\\\\\\\
			double vXCd [] = new double [] {largo,largo,largo,largo};
			double vYCd [] = new double [] {0,anchura,anchura,0};
			double vZCd [] = new double [] {altura,altura,0,0}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////			//////////Vertices Cara Superior\\\\\\\\\\\\\\\\\\
			double vXCs [] = new double [] {0,0,largo,largo};
			double vYCs [] = new double [] {anchura,anchura,anchura,anchura};
			double vZCs [] = new double [] {0,altura,altura,0}; // Coordenadas Nulas en el eje Z(imaginario)		
		
			////	//////////Vertices Cara Inferior\\\\\\\\\\\\\\\\\\
			double vXCif [] = new double [] {0,0,largo,largo};
			double vYCif [] = new double [] {0,0,0,0};
			double vZCif [] = new double [] {0,altura,altura,0}; // Coordenadas Nulas en el eje Z(imaginario)			
	
			//C. Frontal
			PoligonoRotado(vXCf, vYCf, vZCff);
			//C. Fondo
			PoligonoRotado(vXCff, vYCff, vZCff);
			//C. Izquierda
			PoligonoRotado(vXCi, vYCi, vZCi);
			//C. Derecha
			PoligonoRotado(vXCd, vYCd, vZCd);
			//C. Superior
			PoligonoRotado(vXCs, vYCs, vZCs);
			//C.Inferior
			PoligonoRotado(vXCif, vYCif, vZCif);
			
			//Adds Grafica
			StdDraw3D.setPenColor(StdDraw3D.WHITE);
			StdDraw3D.overlayText(0, -8, "Use el mouse para mover la figura");
			
			//Fase Final, Mostrando el Objeto de StdDraw3D
			StdDraw3D.show();
			
			
			break;}
		
		case("Rombo") 	  :{		
			panelRombo.setVisible(true);
			//Contruccion de Figura3D mediante la clase StdDraw3D
			StdDraw3D.setCameraOrientation(0, 0, 0); // Angulos en x,y,z
			StdDraw3D.clearOverlay(); 
			StdDraw3D.clear(StdDraw3D.BLACK);
			StdDraw3D.setScale(-10,10); 	//Estacala minima a maxima para x,y,z
			StdDraw3D.clear3D();			// Limpiando para siguiente
			StdDraw3D.setPenColor(color);
			
			
			break;
			
			}
		
		case("Triangulo") :{ 				
			panelTriangulo.setVisible(true);
			//Contruccion de Figura3D mediante la clase StdDraw3D
			StdDraw3D.setCameraOrientation(0, 0, 0); // Angulos en x,y,z
			StdDraw3D.clearOverlay(); 
			StdDraw3D.clear(StdDraw3D.BLACK);
			StdDraw3D.setScale(-10,10); 	//Estacala minima a maxima para x,y,z
			StdDraw3D.clear3D();			// Limpiando para siguiente
			StdDraw3D.setPenColor(color);
			
			
			break;}
		
		case("Trapecio")  :{				
			panelTrapecio.setVisible(true);
			//Contruccion de Figura3D mediante la clase StdDraw3D
			StdDraw3D.setCameraOrientation(0, 0, 0); // Angulos en x,y,z
			StdDraw3D.clearOverlay(); 
			StdDraw3D.clear(StdDraw3D.BLACK);
			StdDraw3D.setScale(-10,10); 	//Estacala minima a maxima para x,y,z
			StdDraw3D.clear3D();			// Limpiando para siguiente
			StdDraw3D.setPenColor(color);
			
			
			break;}
	
		
		default: msgError("Graficar");	 break;
		
		}
	}
			
	/*
	 * Nombre 	  : PoligonoRotado
	 * Funcion	  : Crear y Rotar un Objeto StdDraw3D tipo Poligono2D a unos angulos por defecto en x,y,z
	 * Argumentos : double x [],double y [], double z []; Vertices (x,y,z)
	 * Retorno	  : Ninguno
	 */
	public void PoligonoRotado(double x [],double y [], double z []) {
		StdDraw3D.polygon(x, y, z).rotate(5, 10, 2);
	}
	/*
	 * Nombre 	  : Calcular
	 * Funcion	  : Calcular  { A_base, V_base, V.L_prisma, V.T_prisma, A.L_prisma, A.T_prisma}
	 * Argumentos : String tipo; tipo = tipo de base del prisma
	 * Retorno	  : Ninguno
	 */
	public void Calcular(String tipo ) {
		
		txtVbase.setEnabled(true);
		txtVLprisma.setEnabled(true);
		txtALprisma.setEnabled(true);
		txtATprisma.setEnabled(true);
		
		double x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0,dV=0,dH=0,longAlturabase=0;
		
		//Vertices Recicidos en los TxtField del Panel de Datos
		switch (tipo) {
		
		case "Cuadrado" : {
			 x1 = Double.valueOf(txtVAxCuad.getText());
			 x2 = Double.valueOf(txtVBxCuad.getText());
			 y1 = Double.valueOf(txtVAyCuad.getText());
			 y2 = Double.valueOf(txtVByCuad.getText());
			break;
		}
		case "Rombo" :{
			 x1 = Double.valueOf(txtVAxRomb.getText());
			 x2 = Double.valueOf(txtVAyRomb.getText());
			 dV = Double.valueOf(txtDiametroVert.getText());
			 dH = Double.valueOf(txtDiametroHoriz.getText());
			
			break;
		}
		case "Rectangulo" :	{
			 x1 = Double.valueOf(txtVAxRect.getText());
			 x2 = Double.valueOf(txtVBxRect.getText());
			 x3 = Double.valueOf(txtVCxRect.getText());
			
			 y1 = Double.valueOf(txtVAyRect.getText());
			 y2 =Double.valueOf(txtVByRect.getText());
			 y3 =Double.valueOf(txtVCyRect.getText());
			
			break;
		}
		case "Triangulo" :{
			 x1 = Double.valueOf(txtVAxTria.getText());
			 x2 = Double.valueOf(txtVCxTria.getText());
			 x3 = Double.valueOf(txtVMxTria.getText());
			
			 y1 = Double.valueOf(txtVAyTria.getText());
			 y2 =Double.valueOf(txtVCyTria.getText());
			 y3 =Double.valueOf(txtVMyTria.getText());
			
			break;
		}
		case "Trapecio" :{
			 x1 = Double.valueOf(txtVAxTrap.getText());
			 x2 = Double.valueOf(txtVBxTrap.getText());
			 x3 = Double.valueOf(txtVCxTrap.getText());
			 x4 = Double.valueOf(txtVDxTrap.getText());
			
			 y1 = Double.valueOf(txtVAyTrap.getText());
			 y2 = Double.valueOf(txtVByTrap.getText());
			 y3 = Double.valueOf(txtVCyTrap.getText());
			 y4 = Double.valueOf(txtVDyTrap.getText());
			 
			 longAlturabase = Double.valueOf(txtLongAlturaTrap.getText());
			
			break;
		}
		}
		double altura = Double.valueOf(txtAlturaPrism.getText());
		
		
		switch (tipo) {
		
		case "Cuadrado" :{
			Cuadrado aux = new Cuadrado(altura, tipo, x1, x2, y1, y2);//Creo un Objeto con los vertices recicidos
			
			double Abase = aux.Areabase();
			double Vbase = aux.Volumen();
			double VLprisma = 0;
			double VTprisma = 0;
			double ALprisma = 0;
			double ATprisma = 0;
			
				
			txtVbase.setText( String.valueOf(Vbase));
			txtVLprisma.setText(String.valueOf(VLprisma));
			txtALprisma.setText(String.valueOf(ALprisma));
			txtATprisma.setText(String.valueOf(ATprisma));
			
			break;
				
		}
		case "Rombo" :{
			Rombo aux = new Rombo(altura,tipo,x1,x2,y1,y2);
			
			double Abase = aux.Areabase();
			double Vbase = aux.Volumen();
			double VLprisma = 0;
			double VTprisma = 0;
			double ALprisma = 0;
			double ATprisma = 3;
			
				
			txtVbase.setText( String.valueOf(Vbase));
			txtVLprisma.setText(String.valueOf(VLprisma));
			txtALprisma.setText(String.valueOf(ALprisma));
			txtATprisma.setText(String.valueOf(ATprisma));
			
			break;
		}
		case "Rectangulo" :{
			double Abase = 0;
			double Vbase = 0;
			double VLprisma = 0;
			double VTprisma = 0;
			double ALprisma = 4;
			double ATprisma = 0;
			
				
			txtVbase.setText( String.valueOf(Vbase));
			txtVLprisma.setText(String.valueOf(VLprisma));
			txtALprisma.setText(String.valueOf(ALprisma));
			txtATprisma.setText(String.valueOf(ATprisma));
			
			break;
		}
		case "Triangulo" :{
			Triangulo aux = new Triangulo(altura,tipo,x1,x2,x3,y1,y2,y3);
			double Abase = aux.Areabase();
			double Vbase = 0;
			double VLprisma = 5;
			double VTprisma = 0;
			double ALprisma = 0;
			double ATprisma = 0;
			
				
			txtVbase.setText( String.valueOf(Vbase));
			txtVLprisma.setText(String.valueOf(VLprisma));
			txtALprisma.setText(String.valueOf(ALprisma));
			txtATprisma.setText(String.valueOf(ATprisma));
			
			break;
		}
		case "Trapecio" :{
			Trapecio aux = new Trapecio(altura,tipo,x1,x2,x3,x4,y1,y2,y3,y4,0);
			
			double Abase = 0;
			double Vbase = 0;
			double VLprisma = 6;
			double VTprisma = 0;
			double ALprisma = 0;
			double ATprisma = 0;
			
				
			txtVbase.setText( String.valueOf(Vbase));
			txtVLprisma.setText(String.valueOf(VLprisma));
			txtALprisma.setText(String.valueOf(ALprisma));
			txtATprisma.setText(String.valueOf(ATprisma));
			
			break;
		}
		
		default : msgError("Calcular"); break;
		
		}
		
		
	}

	
	public void defaultPanel() {
		panelCuadrado.setVisible(false);
		panelTriangulo.setVisible(false);
		panelRombo.setVisible(false);
		panelRectangulo.setVisible(false);
		panelTrapecio.setVisible(false);
	}
	/*
	 * Nombre 	  : defaultVertice
	 * Funcion	  : Limpiar y poner en estado por defecto los txtVertice
	 * Argumentos : Ninguno
	 * Retorno	  : Ninguno
	 */
	public void defaultVertice(String tipo) {
		
		cbxPrismas.setEnabled(true);
		cbxColor.setEnabled(false);
		btnGraficar.setEnabled(false);
		btnCalcular.setEnabled(false);
		btnLimpiar.setEnabled(false);
		
		txtVbase.setText(null);
		txtVLprisma.setText(null);
		txtVbase.setText(null);
		txtALprisma.setText(null);
		txtATprisma.setText(null);
		
		cbxColor.setSelectedIndex(0);
		cbxPrismas.setSelectedIndex(0);
		
		
		txtLongAlturaTrap.setEnabled(false);
		txtLongAlturaTrap.setText(" Altura base");
		
		txtAlturaPrism.setEnabled(false);
		txtAlturaPrism.setText(" Altura prisma");
		
		switch(tipo){
		case("Rectangulo"):{
			txtVAxRect.setText(" x1 ");
			txtVAyRect.setText(" y1 ");
			txtVBxRect.setText(" x2 ");
			txtVByRect.setText(" y2 ");
			txtVCxRect.setText(" x3 ");
			txtVCyRect.setText(" y3 ");
			
			break;
		}
		case("Triangulo"):{
			txtVAxTria.setText(" x1 ");
			txtVAyTria.setText(" y1 ");
			txtVCxTria.setText(" x2 ");
			txtVCyTria.setText(" y2" );
			txtVMxTria.setText(" x3 ");
			txtVMyTria.setText(" y3 ");
			
			break;
		}
		case("Rombo"):{
			txtVAxRomb.setText(" x1 ");
			txtVAyRomb.setText(" y1 ");
			txtDiametroVert.setText(" D ");
			txtDiametroHoriz.setText(" d ");
			break;
		}
		case("Trapecio"):{
			txtVAxTrap.setText(" x1 ");
			txtVAyTrap.setText(" y1 ");
			txtVBxTrap.setText(" x2 ");
			txtVByTrap.setText(" y2" );
			txtVCxTrap.setText(" x3 ");
			txtVCyTrap.setText(" y3 ");
			txtVDxTrap.setText(" x4 ");
			txtVDyTrap.setText(" y4 ");
			txtLongAlturaTrap.setText("Altura base");
			break;
		}
		case("Cuadrado"):{
			txtVAxCuad.setText(" x1 ");
			txtVAyCuad.setText(" y1 ");
			txtVBxCuad.setText(" x2 ");
			txtVByCuad.setText(" y2 ");
			
			break;
		}
		default : msgError(null);
		}
	
	}
	
	/*
	 * Nombre 	  : SalvarInstancia
	 * Funcion	  : Salvar la intancia del usuario en el Servidor del Centro
	 * Argumentos : Ninguno
	 * Retorno	  : Ninguno
	 */
	
	public void SalvarInstancia(){
		
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
	/* Nombre 	  : SetColor
	 * Funcion 	  : Crear atributo Color
	 * Argumentos : String opc; opc = Color Solicitado
	 * Retorno	  : Retorna un atributo de tipo Color 
	 */
	
	public Color SetColor(String opc) {
		
		Color color = null;
		
		switch(opc) {
		case("Blanco") : color = StdDraw3D.WHITE; 			break;
		case("Azul") : color = StdDraw3D.BLUE;				break;
		case("Rojo") : color = StdDraw3D.RED;				break;
		case("Amarillo") : color = StdDraw3D.YELLOW;		break;
		case("Verde") : color = StdDraw3D.GREEN; 			break;
		case("Magenta") : color = StdDraw3D.MAGENTA; 		break;
		case("Naranja") : color = StdDraw3D.ORANGE;			break;
		case("Rosado") : color = StdDraw3D.PINK;			break;
		case("Gris oscuro") : color = StdDraw3D.DARK_GRAY;	break;
		case("Gris Claro") : color = StdDraw3D.LIGHT_GRAY;	break;
		case("Cyan") : color = StdDraw3D.CYAN; 				break;
		
		default : color  = StdDraw3D.WHITE;					break;
		}
		return color;
}

	public void msgError(String opc) {
		
		switch(opc) {
			case ("Calcular"): JOptionPane.showMessageDialog(null, "Error Calculado el prisma", "Error", JOptionPane.ERROR_MESSAGE); break;
			case ("Graficar"): JOptionPane.showMessageDialog(null, "Error Graficando el prisma", "Error", JOptionPane.ERROR_MESSAGE); break;
			
			default : JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE); break;
		}
		
	}

	public void msgSalvar(ActionEvent e) {
		if(instanciaSalvada == false) {
			//e.consume();
			int dialogResult = JOptionPane.showConfirmDialog (null, "Desea salvar el trabajo antes de salir ? ");
			
			if(dialogResult == JOptionPane.YES_OPTION)
				SalvarInstancia();
			if(dialogResult == JOptionPane.NO_OPTION)
				dispose();
			if(dialogResult == JOptionPane.CANCEL_OPTION)
				System.out.close();
			
			}else dispose(); 	
		}
}


