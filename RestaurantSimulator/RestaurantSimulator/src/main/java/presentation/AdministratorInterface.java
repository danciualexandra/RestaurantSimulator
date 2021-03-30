package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import bLayer.CompositeProduct;
import bLayer.MenuItem;
import bLayer.Restaurant;
import dataLayer.RestaurantSerialization;


import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AdministratorInterface {

	private JFrame frame;
	public ArrayList<MenuItem> meniu=new ArrayList<MenuItem>();
	private JTextField textField;
	private JTextField textField_1;
	 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorInterface window = new AdministratorInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AdministratorInterface() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.getContentPane().setLayout(null);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		back.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		back.setBounds(459, 359, 171, 42);
		frame.getContentPane().add(back);
		
		JButton vizProduse = new JButton("Vizualizare Produse");
		vizProduse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantSerialization res=new RestaurantSerialization();
				res.main(null);
				//res.serializare(meniu);
			
				
			meniu=res.deserializare();
			
			Restaurant r=new Restaurant();
			r.productTable(meniu);
				
				
				
				
				
				
			}
		});
		vizProduse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		vizProduse.setBounds(459, 25, 171, 36);
		frame.getContentPane().add(vizProduse);
		
		JButton addProduct = new JButton("Adaugare Produs");
		addProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Successfully added the product.");
			}
		});
		addProduct.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		addProduct.setBounds(23, 25, 178, 36);
		frame.getContentPane().add(addProduct);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=textField.getText();
				String[] words = value.split("\\W+");
				int id=0;
				String name="";
				int price=0;
				for(int i=0;i<words.length;i++) {
					id=Integer.parseInt(words[i]);
					name=words[i+1];
					price=Integer.parseInt(words[i+2]);
					break;
					
					
				}
				//System.out.println("id="+id+",name="+name+",price="+price);
				RestaurantSerialization res=new RestaurantSerialization();
				
				res.main(null);
				//res.serializare(meniu);
			
			
				
			meniu=res.deserializare();
			meniu.add(new MenuItem(id,name,price));
			Restaurant r=new Restaurant();
		
			
			r.productTable(meniu);
			///?res.serializare(meniu);
				
			}
		});
		textField.setBounds(23, 100, 178, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Format: id,numeProdus,pret");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(23, 87, 178, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JButton deleteProd = new JButton("Stergere Produs");
		deleteProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Deleted the product.");
			}
		});
		deleteProd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		deleteProd.setBounds(26, 139, 175, 36);
		frame.getContentPane().add(deleteProd);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=textField_1.getText();
				String[] words = value.split("\\W+");
				int id=0;
				String name="";
				int price=0;
				for(int i=0;i<words.length;i++) {
					id=Integer.parseInt(words[i]);
					name=words[i+1];
					price=Integer.parseInt(words[i+2]);
					break;
					
					
				}
				//System.out.println("id="+id+",name="+name+",price="+price);
                 RestaurantSerialization res=new RestaurantSerialization();
				
				res.main(null);
				res.del(new MenuItem(id,name,price));
				
			
			
				
				meniu=res.deserializare();
				
				
				   
			
			Restaurant r=new Restaurant();
			
	
			
			r.productTable(meniu);
			//res.serializare(arrayListClone);
				
			}
		});
		textField_1.setBounds(23, 209, 178, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Format: id,numeProdus,pret");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(23, 196, 178, 13);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 669, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
