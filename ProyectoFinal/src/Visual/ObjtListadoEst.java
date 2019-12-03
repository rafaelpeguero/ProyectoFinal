package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class ObjtListadoEst extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ObjtListadoEst dialog = new ObjtListadoEst();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ObjtListadoEst() {
		setTitle("Listado de Estudiante");
		setBounds(100, 100, 1366, 768);
		Dimensionador();
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 240, 240));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnEliminar.setActionCommand("Eliminar EST");
				buttonPane.add(btnEliminar);
				getRootPane().setDefaultButton(btnEliminar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
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
