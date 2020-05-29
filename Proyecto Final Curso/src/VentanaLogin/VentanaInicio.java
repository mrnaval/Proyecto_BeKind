package VentanaLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setTitle("Elige una opcion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnCliente.setBounds(80, 124, 104, 59);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaClientes VC1 = new VentanaClientes();
				VC1.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCliente);
		
		JButton btnAyudante = new JButton("Ayudante");
		btnAyudante.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnAyudante.setBounds(244, 124, 104, 59);
		contentPane.add(btnAyudante);
		
		JLabel lblEscogeTuRol = new JLabel("Escoge tu rol:");
		lblEscogeTuRol.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		lblEscogeTuRol.setBounds(146, 35, 138, 65);
		contentPane.add(lblEscogeTuRol);
		
		JButton btnNewButton = new JButton("Cerrar Sesion\r\n");
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(286, 212, 138, 35);
		contentPane.add(btnNewButton);
	}
}
