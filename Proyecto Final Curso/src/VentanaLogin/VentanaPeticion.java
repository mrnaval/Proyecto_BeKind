package VentanaLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPeticion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPeticion frame = new VentanaPeticion();
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
	public VentanaPeticion() {
		setTitle("Nueva Peticion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 609, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaClientes VC1 = new VentanaClientes();
				VC1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton.setBounds(21, 11, 89, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ayuda");
		btnNewButton_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton_1.setBounds(127, 11, 89, 59);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(21, 119, 352, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre cliente");
		lblNewLabel.setBounds(21, 98, 160, 20);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 269, 352, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTipoDeServicio = new JLabel("Tipo de Servicio");
		lblTipoDeServicio.setBounds(21, 167, 130, 20);
		contentPane.add(lblTipoDeServicio);
		
		JLabel lblNewLabel_1 = new JLabel("Punto recogida");
		lblNewLabel_1.setBounds(21, 252, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 189, 352, 22);
		contentPane.add(comboBox);
		comboBox.addItem("Transporte");
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 352, 352, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Destino");
		lblNewLabel_2.setBounds(21, 331, 89, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora");
		lblNewLabel_3.setBounds(21, 410, 63, 20);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(21, 435, 352, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Crear Peticion");
		btnNewButton_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton_2.setBounds(440, 469, 143, 36);
		contentPane.add(btnNewButton_2);
	}
}
