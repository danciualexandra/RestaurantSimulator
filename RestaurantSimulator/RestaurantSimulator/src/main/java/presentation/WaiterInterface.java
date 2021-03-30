package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import bLayer.MenuItem;
import bLayer.Order;
import bLayer.Restaurant;
import dataLayer.TxtFile;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class WaiterInterface {

	private JFrame frmWaiter;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaiterInterface window = new WaiterInterface();
					window.frmWaiter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaiterInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaiter = new JFrame();
		frmWaiter.getContentPane().setBackground(new Color(204, 204, 255));
		frmWaiter.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWaiter.setVisible(false);
				///butonul back inchide frame-ul
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(441, 520, 144, 46);
		frmWaiter.getContentPane().add(btnNewButton);
		
		JButton vizualizareCom = new JButton("Vizualizare Comenzi");
		vizualizareCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurant r=new Restaurant();
				//r.returntabelhash();
				/////
				
			}
		});
		vizualizareCom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		vizualizareCom.setBounds(441, 35, 144, 53);
		frmWaiter.getContentPane().add(vizualizareCom);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=textField.getText();
				String[] words = value.split("\\W+");
				int idComanda=0;
				String continut="";
				int nrMasa=0;
				for(int i=0;i<words.length;i++) {
					idComanda=Integer.parseInt(words[i]);
					//name=words[i+1];
					nrMasa=Integer.parseInt(words[i+1]);
					continut=words[i+2];
					break;
					
					
				}
		 ArrayList<MenuItem> order=new ArrayList<MenuItem>();
		 HashMap<Order,ArrayList<MenuItem>> comanda = new HashMap<Order,ArrayList<MenuItem>>();
		//System.out.println(idComanda+" "+nrMasa);
				 order.add(new MenuItem(1,continut,5));
				 comanda.put(new Order(idComanda,nrMasa), order);
				System.out.println(order.toString());
				System.out.println(comanda);
				Restaurant r=new Restaurant();
				TxtFile t=new TxtFile();
				//
				//t.showDetails(comanda);
				ChefInterface chef=new ChefInterface(t.showDetails(comanda)); ;
				chef.Min(null,t.showDetails(comanda));
			
				t.compute(comanda);
				t.showDetails(comanda);
				
				
				r.returntabelhash(comanda);
				
				
				
				
				
			}
				
			});
		textField.setBounds(35, 106, 195, 19);
		frmWaiter.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("idOrder,nrMasa,Continut");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(35, 86, 214, 13);
		frmWaiter.getContentPane().add(lblNewLabel);
		
		JButton tiparire = new JButton("Tiparire chitanta");
		tiparire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Successfully wrote the bill");
				
				
			}
		});
		tiparire.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		tiparire.setBounds(441, 140, 144, 46);
		frmWaiter.getContentPane().add(tiparire);
		frmWaiter.setTitle("Waiter");
		frmWaiter.setBounds(100, 100, 629, 613);
		//frmWaiter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
