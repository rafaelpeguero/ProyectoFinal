package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	public static void main(String[] args) {
		try {
			RegistrarUsuario dialog = new RegistrarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarUsuario.class.getResource("/Images/Users.png")));
		setTitle("Registro de Usuario");
		setName("RegistrarUsuario");
		setBounds(100, 100, 355, 272);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		JLabel lblNewLabel = new JLabel("Nombre Usuario:");
		lblNewLabel.setBounds(56, 41, 105, 14);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_1.setBounds(88, 112, 73, 14);
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setBounds(129, 76, 32, 14);
			lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a:");
			lblConfirmarContrasea.setBounds(22, 144, 139, 14);
			lblConfirmarContrasea.setFont(new Font("Segoe UI", Font.BOLD, 13));
			contentPanel.add(lblConfirmarContrasea);
		}
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 37, 130, 22);
		textField_1.setToolTipText("");
		textField_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		textField_1.setColumns(10);
		contentPanel.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(171, 108, 130, 22);
		textField.setToolTipText("");
		textField.setFont(new Font("Segoe UI", Font.BOLD, 12));
		textField.setColumns(10);
		contentPanel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(171, 140, 130, 22);
		textField_2.setToolTipText("");
		textField_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		textField_2.setColumns(10);
		contentPanel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Administrador", "Estudiante"}));
		comboBox.setBounds(171, 74, 130, 20);
		contentPanel.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setBounds(-85, 0, 424, 241);
		label.setIcon(new ImageIcon(RegistrarUsuario.class.getResource("/Images/fod.png")));
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(112, 128, 144));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ObjLogin login = new ObjLogin();
						login.setVisible(true);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
