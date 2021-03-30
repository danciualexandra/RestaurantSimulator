package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainInterface {

	private JFrame frmRestaurant;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frmRestaurant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainInterface() {
		initialize();
	}

	
	private void initialize() {
		frmRestaurant = new JFrame();
		frmRestaurant.setTitle("Restaurant");
		frmRestaurant.getContentPane().setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		frmRestaurant.setBounds(100, 100, 701, 379);
		frmRestaurant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurant.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Administrator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			///se deschide noua fereastra pentru admin
				AdministratorInterface adm=new AdministratorInterface();
				adm.main(null);
				
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(20, 100, 200, 70);
		frmRestaurant.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Waiter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//butonul waiter deschide noua fereastra pt ospatar
				WaiterInterface waiter=new WaiterInterface();
				waiter.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setBounds(243, 100, 200, 70);
		frmRestaurant.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Chef");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//butonul Chef deschide noua fereastra pt chef
				ChefInterface chef=new ChefInterface();
				chef.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setBackground(new Color(204, 204, 255));
		btnNewButton_2.setBounds(477, 100, 200, 70);
		frmRestaurant.getContentPane().add(btnNewButton_2);
		
	}
}
