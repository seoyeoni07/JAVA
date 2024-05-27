package gui.builder.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class JCheckBoxJRadioButton {

	private JFrame frame;
	private int sum = 0;
	private JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxJRadioButton window = new JCheckBoxJRadioButton();
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
	public JCheckBoxJRadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("체크박스와 라디오 버튼");
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사과 100원, 배 500원 체리 1000원");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 412, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("사과");
		chckbxNewCheckBox.setBorderPainted(true);
		chckbxNewCheckBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if(i == ItemEvent.SELECTED) {
					sum += 100;
				} else {
					sum -= 100;
				}
				
				lblResult.setText("현재 " + sum + "원입니다.");
			}
		});
		chckbxNewCheckBox.setBounds(22, 48, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("배");
		chckbxNewCheckBox_1.setBorderPainted(true);
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if(i == ItemEvent.SELECTED) {
					sum += 500;
				} else {
					sum -= 500;
				}
				
				lblResult.setText("현재 " + sum + "원입니다.");
			}
		});
		chckbxNewCheckBox_1.setBounds(169, 48, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("체리");
		chckbxNewCheckBox_2.setBorderPainted(true);
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if(i == ItemEvent.SELECTED) {
					sum += 1000;
				} else {
					sum -= 1000;
				}
				
				lblResult.setText("현재 " + sum + "원입니다.");
			}
		});
		chckbxNewCheckBox_2.setBounds(316, 48, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		lblResult = new JLabel("현재 0원입니다.");
		lblResult.setOpaque(true);
		lblResult.setBackground(new Color(255, 255, 0));
		lblResult.setForeground(new Color(255, 0, 0));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(0, 81, 412, 32);
		frame.getContentPane().add(lblResult);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("남자");
		rdbtnNewRadioButton.setBorderPainted(true);
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(107, 126, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("여자");
		rdbtnNewRadioButton_1.setBorderPainted(true);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(271, 126, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		lblImage = new JLabel("");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("사과");
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblImage.setIcon(new ImageIcon(JCheckBoxJRadioButton.class.getResource("/gui/builder/images/apple.jpg")));
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(66, 190, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("배");
		rdbtnNewRadioButton_2_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblImage.setIcon(new ImageIcon(JCheckBoxJRadioButton.class.getResource("/gui/builder/images/pear.jpg")));
				
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_2_1);
		rdbtnNewRadioButton_2_1.setBounds(189, 190, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("체리");
		rdbtnNewRadioButton_2_1_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblImage.setIcon(new ImageIcon(JCheckBoxJRadioButton.class.getResource("/gui/builder/images/cherry.jpg")));
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_2_1_1);
		rdbtnNewRadioButton_2_1_1.setBounds(312, 190, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2_1_1);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(JCheckBoxJRadioButton.class.getResource("/gui/builder/images/apple.jpg")));
		lblImage.setBounds(156, 250, 124, 167);
		frame.getContentPane().add(lblImage);
	}
}
