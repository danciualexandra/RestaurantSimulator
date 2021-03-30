package dataLayer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import bLayer.MenuItem;
import bLayer.Order;

public class TxtFile{
	public void compute( HashMap<Order,ArrayList<MenuItem>> comanda) {
		try {
			
		      FileWriter myWriter = new FileWriter("filename.txt");
		      java.util.Iterator<Entry<Order, ArrayList<MenuItem>>> iterator = comanda.entrySet().iterator();
		      while (iterator.hasNext()) {
			    	String s="";
			  	  	int total=0;
			        HashMap.Entry pair = (HashMap.Entry)iterator.next();
			        System.out.println("Compozitia chitantei:");
			      System.out.println(pair.getKey() + " = " + pair.getValue()); 
			        Order order=(Order) pair.getKey();
			        myWriter.write("Id-ul comenzii este:"+order.getOrderId()+"\n");
			        myWriter.write("Data comenzii: "+order.getDate()+"\n");
			        myWriter.write("Numarul mesei: "+order.getTable()+"\n");
			        myWriter.write("Pret: 20");
			       
			        
			       
			    }
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		

}
	public String showDetails(HashMap<Order,ArrayList<MenuItem>> comanda) {
		java.util.Iterator<Entry<Order, ArrayList<MenuItem>>> it = comanda.entrySet().iterator();
	      while (it.hasNext()) {
		    	String s="";
		    	String [] text=null;
		  	  	int total=0;
		        HashMap.Entry pair = (HashMap.Entry)it.next();
		        System.out.println("Notificare comanda !\n");
		      System.out.println(pair.getKey() + " = " + pair.getValue()); 
		        Order order=(Order) pair.getKey();
		      String t1=String.valueOf(order.getOrderId());
		      String t2=String.valueOf(order.getDate());
		      String t3=String.valueOf(order.getTable());
		       return "Id-ul comenzii este:"+t1+" \n"+"Data comenzii: "+t2+"\n"+"Numarul mesei: "+t3+"\n";
		     
		       
		     
		     }
		return null;
		    
		       
	      }
		
		
	}

