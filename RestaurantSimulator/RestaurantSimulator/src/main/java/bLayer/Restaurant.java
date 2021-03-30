package bLayer;
import bLayer.Order;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dataLayer.RestaurantSerialization;

public class Restaurant implements IRestaurantProcessing{
	
	 public  HashMap<Order,ArrayList<MenuItem>> comanda;
	 public ArrayList<MenuItem> meniu = new ArrayList<MenuItem>();
	 public ArrayList<MenuItem> order=new ArrayList<MenuItem>();
	
	 public Restaurant() {
		 RestaurantSerialization res=new RestaurantSerialization();
		res.serializare(meniu);
		meniu=res.deserializare();
		
		 
		 
	 }
	 public boolean isEmptyMenu() {
		 if(meniu.size()==0) {
		    return true;
		 }else return false;
	 }
	 public void productTable(ArrayList<MenuItem> meniu) {
		// RestaurantSerialization res =new RestaurantSerialization();
		Restaurant rez=new Restaurant();	
			  JFrame f = new JFrame(); 
			  
		        // Frame Title 
		        f.setTitle("Produse Meniu");
			
			String[] captabel= {"Id produs","Denumire produs","Pret produs","Compozitie"};
			 Object[][] date=new Object[meniu.size()][4];
			 int i=0;
			 while(i<meniu.size()) {
			 
		      date[i][0]=meniu.get(i).getIdItem();
		      date[i][1]=meniu.get(i).getNameItem();
		      date[i][2]=meniu.get(i).getPrice();
		       if (meniu.get(i) instanceof BaseProduct)
		    	   date[i][3]=meniu.get(i).getNameItem();	 
		        if (meniu.get(i) instanceof CompositeProduct)
		        {
		        	CompositeProduct produs=new CompositeProduct();
		        	 ArrayList<MenuItem> produse=((CompositeProduct) meniu.get(i)).getProducts();
		        	 String s="";
		        	 for (int k=0;k<produse.size();k++)
		        	 {
		        		s=s+produse.get(k).getNameItem()+" ";
		        	 }
		        	  date[i][3]=s;
		        }
		        i=i+1;
			 }
			  JTable tabel=new JTable(date,captabel);
			  
			  tabel.setBounds(30, 40, 200, 300); 
			  
		        // adding it to JScrollPane 
		        JScrollPane sp = new JScrollPane(tabel); 
		        f.add(sp); 
		        // Frame Size 
		        f.setSize(500, 200); 
		        // Frame Visible = true 
		        f.setVisible(true); 
	 }
	 
	 
	 
	 public void returntabelhash(HashMap<Order,ArrayList<MenuItem>> comanda) {
		// Restaurant rez=new Restaurant();	
		  JFrame f = new JFrame(); 
		  
		
	        // Frame Title 
	        f.setTitle("Comenzi");
		  String[] top= {"ID order","Data comenzii","Masa","Continut comanda"};
		  Object[][] tabell=new Object[comanda.size()][4];
		  System.out.println("Comanda -"+comanda.size());
		  java.util.Iterator<Entry<Order, ArrayList<MenuItem>>> it = comanda.entrySet().iterator();
		  int i=0;
		    while (it.hasNext()) {
		    	String s="";
		        HashMap.Entry pair = (HashMap.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        Order order=(Order) pair.getKey();
		        tabell[i][0]=order.getOrderId();
		        tabell[i][1]=order.getDate();
		        tabell[i][2]=order.getTable();
		        ArrayList<MenuItem> produse=new ArrayList<MenuItem>();
		        produse=(ArrayList<MenuItem>) pair.getValue();
		    	 for (int k=0;k<produse.size();k++)
	        	 {
	        		s+=produse.get(k).getNameItem()+" ";
	        	 }
		      tabell[i][3]=s;
		        i=i+1;
		        it.remove(); 
		    }
		   JTable tabel=new JTable(tabell,top);
		   tabel.setBounds(30, 40, 200, 300); 
			  
	        // adding it to JScrollPane 
	        JScrollPane sp = new JScrollPane(tabel); 
	        f.add(sp); 
	        // Frame Size 
	        f.setSize(500, 200); 
	        // Frame Visible = true 
	        f.setVisible(true); 
	   }
	 public void deleteProduct(MenuItem item)
	 {
		 for(MenuItem i:meniu) {
			 if(i.equals(item)) {
				 meniu.remove(item);
			 }
		 }
	 }
	 public void addProduct(MenuItem item) {
	     meniu.add(item);
	 }

		 
 }
	 
	 

