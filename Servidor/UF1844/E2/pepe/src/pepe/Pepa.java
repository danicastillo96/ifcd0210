package pepe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Pepa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNomnre;
	private JTextField textField_1;
	private JLabel lblApellidos;
	private JTextField textField_2;
	private JLabel lblEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pepa frame = new Pepa();
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
	public Pepa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setBounds(10, 211, 46, 14);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(88, 208, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 236, 66, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 233, 86, 20);
		contentPane.add(passwordField);
		
		lblNomnre = new JLabel("Nomnre");
		lblNomnre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNomnre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 8, 121, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 36, 46, 14);
		contentPane.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(63, 39, 111, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 77, 46, 14);
		contentPane.add(lblEdad);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(18), new Integer(18), null, new Integer(1)));
		spinner.setBounds(61, 74, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 106, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnH = new JRadioButton("H");
		rdbtnH.setBounds(53, 102, 109, 23);
		contentPane.add(rdbtnH);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(53, 127, 109, 23);
		contentPane.add(rdbtnM);
		
		JRadioButton rdbtnNoBinario = new JRadioButton("no binario");
		rdbtnNoBinario.setBounds(53, 147, 109, 23);
		contentPane.add(rdbtnNoBinario);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(195, 207, 89, 23);
		contentPane.add(btnValidar);
		
		JTextArea txtrDefinete = new JTextArea();
		txtrDefinete.setText("Definete");
		txtrDefinete.setBounds(250, 49, 148, 82);
		contentPane.add(txtrDefinete);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(335, 232, 89, 23);
		contentPane.add(btnEnviar);
	}
}
