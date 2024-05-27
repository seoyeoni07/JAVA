package gui.builder.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;

public class JTextFieldJTextArea {

	private JFrame frmMyChat;
	private JTextField TFInput;
	private JTextArea TA;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldJTextArea window = new JTextFieldJTextArea();
					window.frmMyChat.setLocationRelativeTo(null);
					window.frmMyChat.setVisible(true);
					window.TFInput.requestFocus();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTextFieldJTextArea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyChat = new JFrame();
		frmMyChat.setTitle("My Chat");
		frmMyChat.setBounds(100, 100, 384, 598);
		frmMyChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyChat.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(12, 10, 346, 417);
		frmMyChat.getContentPane().add(scrollPane);
		
		TA = new JTextArea();
		TA.setEditable(false);
		TA.setLineWrap(true);
		scrollPane.setViewportView(TA);
		
		TFInput = new JTextField();
		TFInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendMsg();
			}
			
		});
		TFInput.setBounds(12, 437, 227, 65);
		frmMyChat.getContentPane().add(TFInput);
		TFInput.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendMsg();
			}
		});
		btnSend.setBounds(251, 437, 107, 65);
		frmMyChat.getContentPane().add(btnSend);
		
		JRadioButton rdbtnYoung = new JRadioButton("영희");
		rdbtnYoung.setBounds(48, 519, 113, 23);
		frmMyChat.getContentPane().add(rdbtnYoung);
		
		JRadioButton rdbtnChar = new JRadioButton("철수");
		rdbtnChar.setBounds(209, 519, 113, 23);
		frmMyChat.getContentPane().add(rdbtnChar);
	}
	private void SendMsg() {
		String msg = TFInput.getText();
		TA.append("[클라이언트] : " + msg + "\n");
		TFInput.setText("");
		TFInput.requestFocus();
	}
}
