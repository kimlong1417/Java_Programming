package table_gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame implements ActionListener {
	
	JDialog dialog;
	JLabel LbName, LbPhone;
	JTextField TfName, TfPhone;
	JButton btnSub;
	
	JPanel pn1, pn2, pn3;
	JLabel title_label;
	JButton btnAdd, btnDel;
	DefaultTableModel model = new DefaultTableModel();
	JTable tb = new JTable(model);
	
	public Main(String title) {
		initGUI(title);
	}
	
	private void initGUI(String title) {
		setTitle(title);
		setLayout(new FlowLayout());
		
		initComponents();
		
		setBounds(500,80,500,400);
		setVisible(true);
	}
	
	private void initComponents() {
		title_label = new JLabel("Phonebook");
		title_label.setFont(new Font("Verdana", Font.BOLD, 30));
		
		pn1 = new JPanel();
		pn2 = new JPanel();
		pn3 = new JPanel();
		
		btnAdd = new JButton("Add Contact");
		btnAdd.addActionListener(this);
		btnDel = new JButton("Delete Contact");
		btnDel.addActionListener(this);
		
		tb.setPreferredScrollableViewportSize(new Dimension(400,200));
		tb.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				
			}
		});
		model.addColumn("Name");
		model.addColumn("Phone no");
		
		JScrollPane sp = new JScrollPane(tb);
		
		pn1.add(title_label);
		pn2.add(sp);
		pn3.add(btnAdd);
		pn3.add(btnDel);
		
		add(pn1);
		add(pn2);
		add(pn3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main("NGU");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnAdd) {
			String name = JOptionPane.showInputDialog(this, "Input Name");
			String phoneNo = JOptionPane.showInputDialog(this, "Input Phone no");
			
			model.addRow(new Object [] {
					name,phoneNo
			});
		}
		
		if(e.getSource() == btnDel) {
			int i = tb.getSelectedRow();
			if(i>=0) {
				model.removeRow(i);
			}
		}
	}
}
