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
	JComboBox<String> cbxColor;
	private boolean instanciaSalvada = false; 
	
	private JPanel panelCuadrado,panelRectangulo,panelTriangulo,panelTrapecio,panelRombo,panelDefault;
	private JTextField txtAlturaPrism;
	private JTextField txtLongAltura;
	private JPanel pn_btnCalcular;
	private JPanel panel_1;
	private JPanel pnbtnsSecundario;
	

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
		panelDatos.setBounds(30, 11, 383, 331);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(30, 35, 60, 14);
		panelDatos.add(lblTipo);
		
		 cbxPrismas = new JComboBox<String>();
		cbxPrismas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defaultVertice();
				
				
				if(cbxPrismas.getSelectedIndex()!=0){
					txtAlturaPrism.setText(null);
					cbxColor.setEnabled(true);
					txtAlturaPrism.setEnabled(true);
				}
				
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
					
					txtVAi.setText(null);
					txtVAii.setText(null);
					txtVBi.setText(null);
					txtVBii.setText(null);
					txtVCi.setText(null);
					txtVCii.setText(null);
					txtVDi.setText(null);
					txtVDii.setText(null);
					
					
				}if(cbxPrismas.getSelectedIndex()==3) {//RECTANGULO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					
					txtVAi.setText(null);
					txtVAii.setText(null);
					txtVBi.setText(null);
					txtVBii.setText(null);
					txtVCi.setText(null);
					txtVCii.setText(null);
					
				}if(cbxPrismas.getSelectedIndex()==4) {//TRIANGULO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					
					txtVAi.setText(null);
					txtVAii.setText(null);
					txtVBi.setText(null);
					txtVBii.setText(null);
					txtVCi.setText(null);
					txtVCii.setText(null);
					
				}if(cbxPrismas.getSelectedIndex()==5) {//TRAPECIO
					txtVAi.setEnabled(true);
					txtVAii.setEnabled(true);
					txtVBi.setEnabled(true);
					txtVBii.setEnabled(true);
					txtVCi.setEnabled(true);
					txtVCii.setEnabled(true);
					txtVDi.setEnabled(true);
					txtVDii.setEnabled(true);
					txtLongAltura.setEnabled(true);
					
					txtVAi.setText(null);
					txtVAii.setText(null);
					txtVBi.setText(null);
					txtVBii.setText(null);
					txtVCi.setText(null);
					txtVCii.setText(null);
					txtVDi.setText(null);
					txtVDii.setText(null);
					txtLongAltura.setText(null);
					
				}
				
				
			}
		});
		cbxPrismas.setModel(new DefaultComboBoxModel(new String[] {"       < Seleccione > ", "Cuadrado", "Rombo", "Rectangulo", "Triangulo", "Trapecio"}));
		cbxPrismas.setBounds(100, 29, 150, 22);
		panelDatos.add(cbxPrismas);
		
		JLabel lblVerticeA = new JLabel("Vertice A :");
		lblVerticeA.setBounds(30, 133, 62, 14);
		panelDatos.add(lblVerticeA);
		
		JLabel lblVericeB = new JLabel("Verice B : ");
		lblVericeB.setBounds(188, 133, 62, 14);
		panelDatos.add(lblVericeB);
		
		JLabel lblVerticeC = new JLabel("Vertice C :");
		lblVerticeC.setBounds(30, 182, 62, 14);
		panelDatos.add(lblVerticeC);
		
		JLabel lblVerticeD = new JLabel("Vertice D :");
		lblVerticeD.setBounds(188, 182, 62, 14);
		panelDatos.add(lblVerticeD);
		
		txtVAi = new JTextField();
		txtVAi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVAi.setText("   x1\r\n");
		txtVAi.setEnabled(false);
		txtVAi.setBounds(100, 131, 31, 20);
		panelDatos.add(txtVAi);
		txtVAi.setColumns(10);
		
		txtVAii = new JTextField();
		txtVAii.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVAii.setText("  y1\r\n");
		txtVAii.setEnabled(false);
		txtVAii.setBounds(141, 131, 31, 20);
		panelDatos.add(txtVAii);
		txtVAii.setColumns(10);
		
		txtVBi = new JTextField();
		txtVBi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVBi.setText("  x2");
		txtVBi.setEnabled(false);
		txtVBi.setBounds(248, 130, 31, 20);
		panelDatos.add(txtVBi);
		txtVBi.setColumns(10);
		
		txtVBii = new JTextField();
		txtVBii.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVBii.setText("  y2\r\n");
		txtVBii.setEnabled(false);
		txtVBii.setBounds(289, 130, 31, 20);
		panelDatos.add(txtVBii);
		txtVBii.setColumns(10);
		
		txtVCi = new JTextField();
		txtVCi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVCi.setText("  x3\r\n");
		txtVCi.setEnabled(false);
		txtVCi.setBounds(100, 180, 31, 20);
		panelDatos.add(txtVCi);
		txtVCi.setColumns(10);
		
		txtVCii = new JTextField();
		txtVCii.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVCii.setText("  y3\r\n");
		txtVCii.setEnabled(false);
		txtVCii.setBounds(141, 180, 31, 20);
		panelDatos.add(txtVCii);
		txtVCii.setColumns(10);
		
		txtVDi = new JTextField();
		txtVDi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVDi.setText("  x4\r\n");
		txtVDi.setEnabled(false);
		txtVDi.setBounds(248, 179, 31, 20);
		panelDatos.add(txtVDi);
		txtVDi.setColumns(10);
		
		txtVDii = new JTextField();
		txtVDii.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				msgFormatoErroneo(e);
			}
		});
		txtVDii.setText("  y4\r\n");
		txtVDii.setEnabled(false);
		txtVDii.setBounds(289, 179, 31, 20);
		panelDatos.add(txtVDii);
		txtVDii.setColumns(10);
		
		JLabel labelColor = new JLabel("Color : ");
		labelColor.setBounds(30, 84, 60, 14);
		panelDatos.add(labelColor);
		
		cbxColor = new JComboBox<String>();
		cbxColor.setEnabled(false);
		cbxColor.setModel(new DefaultComboBoxModel(new String[] {"       < Seleccione >", "Blanco", "Azul", "Rojo", "Amarillo", "Verde", "Magenta", "Gris Claro", "Gris Ocuro"}));
		cbxColor.setBounds(100, 80, 150, 22);
		panelDatos.add(cbxColor);
		
		JLabel lblAlturaPrisma = new JLabel("Altura Prisma (cm)    :");
		lblAlturaPrisma.setBounds(30, 280, 125, 14);
		panelDatos.add(lblAlturaPrisma);
		
		txtAlturaPrism = new JTextField();
		txtAlturaPrism.setText("  Altura prisma");
		txtAlturaPrism.setEnabled(false);
		txtAlturaPrism.setBounds(165, 277, 85, 20);
		panelDatos.add(txtAlturaPrism);
		txtAlturaPrism.setColumns(10);
		
		JLabel lblLongitudalturacm = new JLabel("Longitud Altura (cm) : ");
		lblLongitudalturacm.setBounds(30, 231, 142, 14);
		panelDatos.add(lblLongitudalturacm);
		
		txtLongAltura = new JTextField();
		txtLongAltura.setText("  Altura base");
		txtLongAltura.setEnabled(false);
		txtLongAltura.setBounds(165, 228, 85, 20);
		panelDatos.add(txtLongAltura);
		txtLongAltura.setColumns(10);
		
		JPanel panelFigura = new JPanel();
		panelFigura.setBorder(new TitledBorder(null, "Figura 3D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFigura.setBounds(471, 11, 841, 660);
		contentPane.add(panelFigura);
		panelFigura.setLayout(new CardLayout(0, 0));
		
		 panelDefault = new JPanel();
		 panelDefault.setVisible(false);
		panelFigura.add(panelDefault, "name_8865522179300");
		
		Canvas canvas = new Canvas();
		panelDefault.add(canvas);
		
		 panelRombo = new JPanel();
		 panelRombo.setVisible(false);
		panelFigura.add(panelRombo, "name_8808900515500");
		
		 panelTriangulo = new JPanel();
		 panelTriangulo.setVisible(false);
		panelFigura.add(panelTriangulo, "name_8683263111800");
		
		 panelRectangulo = new JPanel();
		 panelRectangulo.setVisible(false);
		panelFigura.add(panelRectangulo, "name_8592131252200");
		
		 panelTrapecio = new JPanel();
		 panelTrapecio.setVisible(false);
		panelFigura.add(panelTrapecio, "name_8769815758700");
		
		 panelCuadrado = new JPanel();
		 panelCuadrado.setVisible(false);
		panelFigura.add(panelCuadrado, "name_8624770761000");
		
		JPanel panelResultados = new JPanel();
		panelResultados.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelResultados.setBounds(30, 353, 383, 245);
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
		txtVbase.setEnabled(false);
		txtVbase.setBounds(231, 36, 85, 20);
		panelResultados.add(txtVbase);
		txtVbase.setColumns(10);
		
		txtVLprisma = new JTextField();
		txtVLprisma.setEditable(false);
		txtVLprisma.setEnabled(false);
		txtVLprisma.setBounds(231, 89, 85, 20);
		panelResultados.add(txtVLprisma);
		txtVLprisma.setColumns(10);
		
		txtALprisma = new JTextField();
		txtALprisma.setEditable(false);
		txtALprisma.setEnabled(false);
		txtALprisma.setBounds(231, 142, 85, 20);
		panelResultados.add(txtALprisma);
		txtALprisma.setColumns(10);
		
		txtATprisma = new JTextField();
		txtATprisma.setEditable(false);
		txtATprisma.setEnabled(false);
		txtATprisma.setBounds(231, 195, 85, 20);
		panelResultados.add(txtATprisma);
		txtATprisma.setColumns(10);
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBounds(1092, 682, 220, 46);
		contentPane.add(panelBtns);
		panelBtns.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 0, 89, 46);
		panelBtns.add(btnSalir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(121, 0, 89, 46);
		panelBtns.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					msgSalvar(e);
			}
		});
		
		pnbtnsSecundario = new JPanel();
		pnbtnsSecundario.setBounds(30, 598, 383, 107);
		contentPane.add(pnbtnsSecundario);
		pnbtnsSecundario.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(220, 11, 129, 31);
		pnbtnsSecundario.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo ;//= "Cuadrado"; //Prueba;
				tipo = String.valueOf(cbxPrismas.getSelectedItem()) ;			
			
						//INCLUIR El Validador antes de graficar
				Graficar(tipo);

			}
		});
		btnGraficar.setLocation(132, 0);
		panel_2.add(btnGraficar, "name_1079070842300");
		
		panel_1 = new JPanel();
		panel_1.setBounds(132, 53, 129, 31);
		pnbtnsSecundario.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setSize(129, 31);
		btnLimpiar.setLocation(0, 0);
		panel_1.add(btnLimpiar);
		
		pn_btnCalcular = new JPanel();
		pn_btnCalcular.setBounds(28, 11, 149, 31);
		pnbtnsSecundario.add(pn_btnCalcular);
		pn_btnCalcular.setLayout(new CardLayout(0, 0));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setLocation(132, 0);
		pn_btnCalcular.add(btnCalcular, "name_1279219772400");
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
				txtVAi.setText(null);
				txtVAii.setText(null);
				txtVBi.setText(null);
				txtVBii.setText(null);
				txtVCi.setText(null);
				txtVCii.setText(null);
				txtVDi.setText(null);
				txtVDii.setText(null);
				
				txtVbase.setText(null);
				txtVLprisma.setText(null);
				txtVbase.setText(null);
				txtALprisma.setText(null);
				txtATprisma.setText(null);
				
				cbxPrismas.setSelectedIndex(0);
				cbxPrismas.setEnabled(true);
				defaultVertice();
				
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
		switch (tipo) {
		
		case("Cuadrado")  :{ 				
			panelCuadrado.setVisible(true);
			
			break;}
		
		case("Rectangulo"):{ 	
			panelRectangulo.setVisible(true);
			
			
			break;}
		
		case("Rombo") 	  :{		
			panelRombo.setVisible(true);
			
			
			break;}
		
		case("Triangulo") :{ 				
			panelTriangulo.setVisible(true);
			
			
			break;}
		
		case("Trapecio")  :{				
			panelTrapecio.setVisible(true);
			
			
			break;}
	
		
		default: msgError("Graficar");	 break;
		
		}
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
		
		double x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0;
		
		//Vertices Recicidos en los TxtField del Panel de Datos
		switch (tipo) {
		
		case "Cuadrado" : {
			 x1 = Double.valueOf(txtVAi.getText());
			 x2 = Double.valueOf(txtVBi.getText());
			 y1 = Double.valueOf(txtVAii.getText());
			 y2 =Double.valueOf(txtVBii.getText());
			break;
		}
		case "Rombo" :{
			 x1 = Double.valueOf(txtVAi.getText());
			 x2 = Double.valueOf(txtVBi.getText());
			 x3 = Double.valueOf(txtVCi.getText());
			 x4 = Double.valueOf(txtVDi.getText());
			
			 y1 = Double.valueOf(txtVAii.getText());
			 y2 =Double.valueOf(txtVBii.getText());
			 y3 =Double.valueOf(txtVCii.getText());
			 y4 =Double.valueOf(txtVDii.getText());
			break;
		}
		case "Rectangulo" :	{
			 x1 = Double.valueOf(txtVAi.getText());
			 x2 = Double.valueOf(txtVBi.getText());
			 x3 = Double.valueOf(txtVCi.getText());
			
			 y1 = Double.valueOf(txtVAii.getText());
			 y2 =Double.valueOf(txtVBii.getText());
			 y3 =Double.valueOf(txtVCii.getText());
			
			break;
		}
		case "Triangulo" :{
			 x1 = Double.valueOf(txtVAi.getText());
			 x2 = Double.valueOf(txtVBi.getText());
			 x3 = Double.valueOf(txtVCi.getText());
			
			 y1 = Double.valueOf(txtVAii.getText());
			 y2 =Double.valueOf(txtVBii.getText());
			 y3 =Double.valueOf(txtVCii.getText());
			
			break;
		}
		case "Trapecio" :{
			 x1 = Double.valueOf(txtVAi.getText());
			 x2 = Double.valueOf(txtVBi.getText());
			 x3 = Double.valueOf(txtVCi.getText());
			 x4 = Double.valueOf(txtVDi.getText());
			
			 y1 = Double.valueOf(txtVAii.getText());
			 y2 =Double.valueOf(txtVBii.getText());
			 y3 =Double.valueOf(txtVCii.getText());
			 y4 =Double.valueOf(txtVDii.getText());
			
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

	/*
	 * Nombre 	  : defaultVertice
	 * Funcion	  : Limpiar y poner en estado por defecto los txtVertice
	 * Argumentos : Ninguno
	 * Retorno	  : Ninguno
	 */
	public void defaultVertice() {
		txtVAi.setEnabled(false);
		txtVAi.setText("  x1 ");
		
		txtVAii.setEnabled(false);
		txtVAii.setText("  y1 ");
		
		txtVBi.setEnabled(false);
		txtVBi.setText("  x2  ");
		
		txtVBii.setEnabled(false);
		txtVBii.setText("  y2 ");
		
		txtVCi.setEnabled(false);
		txtVCi.setText("  x3  ");
		
		txtVCii.setEnabled(false);
		txtVCii.setText("  y3 ");
		
		txtVDi.setEnabled(false);
		txtVDi.setText("  x4  ");
		
		txtVDii.setEnabled(false);
		txtVDii.setText("  y4 ");
		
		txtLongAltura.setEnabled(false);
		txtLongAltura.setText(" Altura base");
		
		txtAlturaPrism.setEnabled(false);
		txtAlturaPrism.setText(" Altura prisma");
		
		cbxColor.setEnabled(false);
		panelCuadrado.setVisible(false);
		panelTriangulo.setVisible(false);
		panelRombo.setVisible(false);
		panelRectangulo.setVisible(false);
		panelTrapecio.setVisible(false);
		
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
	
	
	public void msgFormatoErroneo(KeyEvent e) {
		char caracter = e.getKeyChar(); //captura
		if( (caracter < '0') || (caracter > '9') ) {
			e.consume();
			JOptionPane.showMessageDialog(null, "Formato incorecto, solo se permiten numeros", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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


