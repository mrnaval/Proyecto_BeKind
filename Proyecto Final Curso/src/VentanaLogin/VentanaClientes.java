package VentanaLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaClientes extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaClientes frame = new VentanaClientes();
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
	public VentanaClientes() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 635, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Peticiones Aceptadas");
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPeticionesAceptadas VPA1 = new VentanaPeticionesAceptadas();
				VPA1.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaClientes VC1 = new VentanaClientes();
				VC1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		JButton btnNewButton_2 = new JButton("Ayuda");
		btnNewButton_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		JButton btnNewButton_3 = new JButton("Nueva Peticion");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPeticion VP1 = new VentanaPeticion();
				VP1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		JButton btnNewButton_4 = new JButton("Volver a la seleccion de rol");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio VI1 = new VentanaInicio();
				VI1.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_3)
							.addGap(18)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(436, Short.MAX_VALUE)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 579, 177);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
