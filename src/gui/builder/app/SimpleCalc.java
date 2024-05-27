package gui.builder.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import org.w3c.dom.DocumentFragment;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalc {

	private JFrame frame;
	private JTextField tfX;
	private JTextField tfY;
	private JLabel lblY;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc window = new SimpleCalc();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("간단 계산기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X = ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(21, 48, 50, 15);
		frame.getContentPane().add(lblNewLabel);
		
		tfX = new JTextField();
		tfX.setHorizontalAlignment(SwingConstants.CENTER);
		tfX.setBounds(62, 41, 114, 34);
		frame.getContentPane().add(tfX);
		tfX.setColumns(10);
		
		tfY = new JTextField();
		tfY.setHorizontalAlignment(SwingConstants.CENTER);
		tfY.setColumns(10);
		tfY.setBounds(266, 41, 114, 34);
		frame.getContentPane().add(tfY);
		
		lblY = new JLabel("Y = ");
		lblY.setFont(new Font("굴림", Font.PLAIN, 20));
		lblY.setBounds(227, 48, 50, 15);
		frame.getContentPane().add(lblY);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calc('+');
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(57, 98, 69, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calc('-');
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(183, 98, 69, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfX.setText("");
				tfY.setText("");
				tfResult.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(309, 98, 69, 59);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblRseuet = new JLabel("Result :");
		lblRseuet.setFont(new Font("굴림", Font.PLAIN, 20));
		lblRseuet.setBounds(80, 180, 96, 27);
		frame.getContentPane().add(lblRseuet);
		
		tfResult = new JTextField();
		tfResult.setEnabled(false);
		tfResult.setHorizontalAlignment(SwingConstants.CENTER);
		tfResult.setColumns(10);
		tfResult.setBounds(172, 173, 155, 34);
		frame.getContentPane().add(tfResult);
	}
	
	private void Calc(char op) {
		
		String strX = tfX.getText();
		String strY = tfY.getText();
		
		if(!strX.equals("") && !strY.equals("")) {
			if(isNumberic(strX) && isNumberic(strY)) {
		
				int x = Integer.parseInt(strX);
				int y = Integer.parseInt(strY);
				int result = x + y;
				
				switch(op) {
			      case '+':
			      result = x + y;
			      break;
			      case '-':
			         result = x - y;
			         break;
			      }
			
		      
				 tfResult.setText(result+"");
	         } else {
	            JOptionPane.showMessageDialog(frame, "내용 중에 숫자가 아닌 경우가 있습니다.",
	                  "입력 확인",JOptionPane.ERROR_MESSAGE);
	            }
	         }
	      else{
	         JOptionPane.showMessageDialog(frame, "내용이 입력되지 않은 경우가 있습니다.",
	               "입력 확인",JOptionPane.ERROR_MESSAGE);
	      }
	   }
	   public static boolean isNumberic(String str) {
	        return str.matches("[+-]?\\d*(\\.\\d+)?");
	      }
	}