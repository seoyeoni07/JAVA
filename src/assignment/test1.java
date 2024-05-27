package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.FlowLayout;

public class test1 {

	private JFrame frmMouselistenerMousemotionlistener;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
					window.frmMouselistenerMousemotionlistener.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMouselistenerMousemotionlistener = new JFrame();
		frmMouselistenerMousemotionlistener.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel.setText("MouseMoved(" + e.getX() + "," + e.getY() + ")");
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				lblNewLabel.setText("MouseDragged(" + e.getX() + "," + e.getY() + ")");
			}
		});
		frmMouselistenerMousemotionlistener.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Component comp = (Component)e.getSource();
				comp.setBackground(Color.CYAN);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel.setText("MousePresed(" + e.getX() + "," + e.getY() + ")");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Component comp = (Component)e.getSource();
				comp.setBackground(Color.YELLOW);
			}
		});
		frmMouselistenerMousemotionlistener.setTitle("MouseListener와 MouseMotionListener");
		frmMouselistenerMousemotionlistener.setBounds(100, 100, 450, 300);
		frmMouselistenerMousemotionlistener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMouselistenerMousemotionlistener.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel();
		lblNewLabel.setText("No mouse Event");
		frmMouselistenerMousemotionlistener.getContentPane().add(lblNewLabel);
	}

}
