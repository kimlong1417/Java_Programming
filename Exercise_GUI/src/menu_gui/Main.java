package menu_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame implements ActionListener {
	
	JMenuBar mb;
	JMenu menuLb, menuBg;
	JMenuItem redLb, greenLb, yellowLb, 
			redBg, greenBg, yellowBg;
	
	JLabel label;
	
	public Main(String title) {
		initGUI(title);
	}
	
	private void initGUI(String title) {
		setTitle(title);
		setBounds(500, 80, 500, 400);
		setLayout(null);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		mb = new JMenuBar();
		menuLb = new JMenu("Mau chu");
		menuBg = new JMenu("Mau nen");
		redLb = new JMenuItem("Red");
		greenLb = new JMenuItem("Green");
		yellowLb = new JMenuItem("Yellow");
		redBg = new JMenuItem("Red");
		greenBg = new JMenuItem("Green");
		yellowBg = new JMenuItem("Yellow");
		
		label = new JLabel("Hello Java!");
		label.setFont(new Font("Verdana", Font.BOLD, 30));
		label.setBounds(150, 65, 200, 200);
		
		menuLb.add(redLb);
		menuLb.add(greenLb);
		menuLb.add(yellowLb);
		menuBg.add(redBg);
		menuBg.add(greenBg);
		menuBg.add(yellowBg);
		
		redLb.addActionListener(this);
		greenLb.addActionListener(this);
		yellowLb.addActionListener(this);
		redBg.addActionListener(this);
		greenBg.addActionListener(this);
		yellowBg.addActionListener(this);
		
		mb.add(menuBg); mb.add(menuLb);
		
		add(label);
		
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main("NgU");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == redLb) {
			label.setForeground(Color.RED);
		}
		if(e.getSource() == greenLb) {
			label.setForeground(Color.GREEN);
		}
		if(e.getSource() == yellowLb) {
			label.setForeground(Color.YELLOW);
		}
		if(e.getSource() == redBg) {
			getContentPane().setBackground(Color.RED);
		}
		if(e.getSource() == greenBg) {
			getContentPane().setBackground(Color.GREEN);
		}
		if(e.getSource() == yellowBg) {
			getContentPane().setBackground(Color.YELLOW);
		}
		
	}

}
