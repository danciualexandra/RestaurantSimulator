package dataLayer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import bLayer.CompositeProduct;
import bLayer.MenuItem;
import bLayer.Restaurant;

public class RestaurantSerialization implements Serializable{
	ArrayList<MenuItem> lista=new ArrayList<MenuItem>();
	public RestaurantSerialization(ArrayList<MenuItem> list) {
		lista=list;
		
	}
	public RestaurantSerialization() {
		
	}
	
	 public void serializare(ArrayList<MenuItem> lista)
	  {
		  try {
			  FileOutputStream fileout=new FileOutputStream("Data.txt");
			  ObjectOutputStream out =new ObjectOutputStream(fileout);
			  System.out.println("Elemente lista"+lista);
			  out.writeObject(lista);
			  out.close();
			   fileout.close();
		  }
		  catch (IOException e) {
		         e.printStackTrace();
		      }
	  }
	  
	  public ArrayList<MenuItem> deserializare()
	  {
		  try {
		  FileInputStream filein = new FileInputStream("Data.txt");
		  ObjectInputStream in=new ObjectInputStream(filein);
		  ArrayList<MenuItem> datefisier= (ArrayList<MenuItem>)in.readObject();
		 
		  for (int i=0;i<datefisier.size();i++) {
		    	
		    	System.out.println(datefisier.get(i).getIdItem()+" "+datefisier.get(i).getNameItem()+" "+datefisier.get(i).getPrice()); 
		    	}
		  in.close();
		  filein.close();
		  return datefisier;
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
		  catch (ClassNotFoundException c) {
		         System.out.println("Date indisponibile");
		         c.printStackTrace();
		      }
		return null;
		 
	  }
	  public static void main(String[]args) {
		  ArrayList<MenuItem> lista =new ArrayList<MenuItem>();
		
	
		 RestaurantSerialization  r=new RestaurantSerialization(lista);
		  lista.add(new MenuItem(4,"mozzarella",5));
		  lista.add(new MenuItem(5,"ciuperci",3));
		  lista.add(new MenuItem(6,"rosii",6));
		  CompositeProduct comp=new CompositeProduct(1,"pizza",20,lista);
		  lista.add(comp);
		  lista.add(new MenuItem(1,"zmeura",6));

		
	
		 r.serializare(lista);
		// re.serializare(l);
	
		// r.deserializare();
		 r.deserializare();
		 
		
		 
		  
	  }
	  public void del(MenuItem item) {
		  ArrayList<MenuItem> lista =new ArrayList<MenuItem>();
			 RestaurantSerialization r=new RestaurantSerialization();
			 
			 lista.add(new MenuItem(4,"mozzarella",5));
			  lista.add(new MenuItem(5,"ciuperci",3));
			  lista.add(new MenuItem(6,"rosii",6));
			  CompositeProduct comp=new CompositeProduct(1,"pizza",20,lista);
			  lista.add(comp);
			  lista.add(new MenuItem(1,"zmeura",6));
			
			  for(int j = 0; j < lista.size(); j++)
			  {
			      MenuItem obj = lista.get(j);

			      if(obj.getIdItem()==item.getIdItem() && obj.getNameItem().contentEquals(item.nameItem) && obj.getPrice()==item.getPrice()){
			         //found, delete.
			          lista.remove(j);
			          break;
			      }

			  }
			  r.serializare(lista);
			  r.deserializare();
		
	  }
	  public void delete(MenuItem item) {
		  ArrayList<MenuItem> lista =new ArrayList<MenuItem>();
			 RestaurantSerialization r=new RestaurantSerialization();
			 
			 lista.add(new MenuItem(4,"mozzarella",5));
			  lista.add(new MenuItem(5,"ciuperci",3));
			  lista.add(new MenuItem(6,"rosii",6));
			  CompositeProduct comp=new CompositeProduct(1,"pizza",20,lista);
			  lista.add(comp);
			  lista.add(new MenuItem(1,"zmeura",6));
			
			  for(int j = 0; j < lista.size(); j++)
			  {
			      MenuItem obj = lista.get(j);

			      if(obj.getNameItem().contentEquals(item.nameItem)){
			         //found, delete.
			          lista.remove(j);
			          break;
			      }

			  }
			  r.serializare(lista);
			  r.deserializare();
		
	  }
	  
	  
	}
	
		
	
