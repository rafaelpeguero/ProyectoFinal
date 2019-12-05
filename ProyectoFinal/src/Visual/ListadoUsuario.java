package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Logico.Centro;
import Logico.Usuario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class ListadoUsuario extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static JTable table1;
	private static Object[] fila;
	private static DefaultTableModel model;
	private static Object[] row;
	private static DefaultTableModel tableModel;
	private static Centro centro;
	private static JButton btnEliminar;
	private static JButton btnModificar;
	private String idusu = "";
	private int code;
	JComboBox cmbbusqueda;
	private JButton btnEliminar_1;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	//	try {
	//		ListadoUsuario dialog = new ListadoUsuario();
	//		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	//		dialog.setVisible(true);
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
	//}

	/**
	 * Create the dialog.
	 */
	public ListadoUsuario(Centro centro) {
		this.centro = centro;
		setBounds(100, 100, 450, 430);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		
			JPanel panel = new JPanel();
			panel.setFont(new Font("Segoe UI", Font.BOLD, 12));
			panel.setBorder(new TitledBorder(null, "B\u00FAsqueda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 414, 300);
			contentPanel.add(panel);
			panel.setLayout(null);
			
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 61, 394, 228);
				panel.add(scrollPane);
				
					table1 = new JTable();
					//scrollPane.setColumnHeaderView(table1);
				
				
				table1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						 
					/*String country;
						int delivery;*/
						if(table1.getSelectedRow()>-1){
							int index = table1.getSelectedRow();
							btnEliminar.setEnabled(true);
							btnModificar.setEnabled(true);
							code = (int)table1.getModel().getValueAt(index, 0);
							idusu = String.valueOf(table1.getValueAt(index, 0));
							/*country = (String)tableSupply.getModel().getValueAt(index, 1);
							delivery = (Integer)tableSupply.getModel().getValueAt(index, 2);
							textFldSupplyName.setText(name);
							spnDelivery.getModel().setValue(Integer.valueOf(delivery));
							cbCountry.getModel().setSelectedItem(new String(country));*/
						}
					}
				});
				tableModel = new DefaultTableModel();
				String[] columnNames = {"Nombre","Tipo", "Contraseña"};
				tableModel.setColumnIdentifiers(columnNames);
				loadSportMans(0);
				scrollPane.setViewportView(table1);
				
				JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
				lblTipoDeUsuario.setFont(new Font("Segoe UI", Font.BOLD, 13));
				lblTipoDeUsuario.setBounds(67, 33, 102, 14);
				panel.add(lblTipoDeUsuario);
				
				JComboBox cmbbusqueda = new JComboBox();
				cmbbusqueda.setFont(new Font("Segoe UI", Font.BOLD, 13));
				cmbbusqueda.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int selection = cmbbusqueda.getSelectedIndex();
						loadSportMans(selection);
					}
				});
				cmbbusqueda.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Administrador", "Estudiante"}));
				cmbbusqueda.setBounds(179, 30, 157, 20);
				panel.add(cmbbusqueda);
				
			
			
			
			
			
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				btnEliminar_1 = new JButton("Eliminar");
				btnEliminar_1.setEnabled(false);
				btnEliminar_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!idusu.equals("")){
							   String aux = centro.BuscarEstudianteporID(idusu);
							   int option = JOptionPane.showConfirmDialog(null, "Está seguro que desea eliminar el Suministrador: " + aux,"Información",JOptionPane.WARNING_MESSAGE);
								  if(option == JOptionPane.OK_OPTION){
								
									centro.EliminarUsuario(idusu);
									loadUsuarios();
									btnEliminar.setEnabled(false);
									btnModificar.setEnabled(false);	
								
								  }
							 						 
							}
					}
				});
				btnEliminar_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
				buttonPane.add(btnEliminar_1);
			
			
				JButton btnModificar = new JButton("Modificar");
				btnModificar.setFont(new Font("Segoe UI", Font.BOLD, 12));
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!idusu.equals("")){
							   String aux = centro.BuscarEstudianteporID(idusu);
							   RegistrarUsuario regusu = new RegistrarUsuario(centro);
							   regusu.setModal(true);
							   regusu.setVisible(true);
						}	
					}
				});
				btnModificar.setActionCommand("OK");
				buttonPane.add(btnModificar);
				getRootPane().setDefaultButton(btnModificar);
			
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						VentanaPrincipal vent = new VentanaPrincipal(centro);
						vent.setVisible(true);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
		}
	}
	public static void loadSportMans(int selection) {
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
		switch (selection) {
		case 0:
			for (Usuario aux : Centro.getInstance().getUser()) {
				fila[0] = aux.getNombreUsuario();
				fila[1] = aux.getTipo();
				fila[2] = aux.getContrasena();
				tableModel.addRow(fila);
			}
			break;
		case 1:
			for (Usuario aux : Centro.getInstance().getUser()) {
				if(aux.getTipo()=="Administrador"){
					fila[0] = aux.getNombreUsuario();
					fila[1] = aux.getTipo();
					fila[2] = aux.getContrasena();
					tableModel.addRow(fila);
				}
			}
			break;	
		case 2:
			for (Usuario aux : Centro.getInstance().getUser()) {
				if(aux.getTipo()=="Estudiante"){
					fila[0] = aux.getNombreUsuario();
					fila[1] = aux.getTipo();
					fila[2] = aux.getContrasena();
					tableModel.addRow(fila);
				}
			}
			break;	
		}
		
		table1.setModel(tableModel);
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table1.getTableHeader().setReorderingAllowed(false);
		TableColumnModel columnModel = table1.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(60);
		columnModel.getColumn(1).setPreferredWidth(180);
		columnModel.getColumn(2).setPreferredWidth(150);
	}
	public static void loadUsuarios() {
		model.setRowCount(0);
		row = new Object[model.getColumnCount()];
		for (Usuario aux : Centro.getInstance().getUser()) {
			fila[0] = aux.getNombreUsuario();
			fila[1] = aux.getTipo();
			fila[2] = aux.getContrasena();
			tableModel.addRow(fila);
		}
		
	}
	
}
