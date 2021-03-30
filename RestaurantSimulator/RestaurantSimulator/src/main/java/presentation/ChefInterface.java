package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import bLayer.Order;
import dataLayer.TxtFile;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;

public class ChefInterface implements Observer{

	protected static final String String = null;
	private JFrame frmChef;
	private JTextArea textArea = new JTextArea();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefInterface window = new ChefInterface();
					window.frmChef.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void Min(String[] args,final String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefInterface window = new ChefInterface(string);
					window.frmChef.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ChefInterface() {
		
		initialize( );
	}
	public ChefInterface(String string) {
		initialize(string);
	}

	void initialize() {
		frmChef = new JFrame();
		frmChef.getContentPane().setBackground(new Color(204, 204, 255));
		frmChef.setTitle("Chef");
		frmChef.setBounds(100, 100, 632, 567);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(442, 474, 166, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmChef.setVisible(false);
				///butonul back inchide frame-ul
			}
		});
		frmChef.getContentPane().setLayout(null);
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		frmChef.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		/////
		textArea.append("Notificare comanda noua!");
		
		
		textArea.setBounds(32, 25, 387, 365);
		frmChef.getContentPane().add(textArea);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(63, 53, 107, 270);
		frmChef.getContentPane().add(editorPane);
	}
	void initialize(String string) {
		frmChef = new JFrame();
		frmChef.getContentPane().setBackground(new Color(204, 204, 255));
		frmChef.setTitle("Chef");
		frmChef.setBounds(100, 100, 632, 567);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(442, 474, 166, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmChef.setVisible(false);
				///butonul back inchide frame-ul
			}
		});
		frmChef.getContentPane().setLayout(null);
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		frmChef.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();

		textArea.append("Notificare noua");
		textArea.append(string);
		
		
		
		textArea.setBounds(32, 25, 387, 365);
		frmChef.getContentPane().add(textArea);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(63, 53, 107, 270);
		frmChef.getContentPane().add(editorPane);
	}
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		textArea.append("O noua comanda a fost plasata!\n");
		
	
	}
		
	}

