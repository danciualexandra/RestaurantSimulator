package bLayer;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CompositeProduct extends MenuItem {
	public ArrayList<MenuItem> products=new ArrayList<MenuItem>();
	public CompositeProduct() {
		}
	public CompositeProduct(int id, String name, int pret) {
		
		super(id, name, pret);
	}
	

	public CompositeProduct(int id, String name, int pret,ArrayList<MenuItem> product) {
		super(id, name, pret);
		this.products=product;
	}
	
	 public ArrayList<MenuItem> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<MenuItem> products) {
		this.products = products;
	}
	public void addProduct(MenuItem item) {
		
			products.add(item);
		
	}
	public String toString()
	   {
		 return "ID: "+this.idItem+" nume:"+this.nameItem+" pret:"+this.price;
	   }
	
   public void deleteProduct(MenuItem item) {
	   products.remove(item);
   }
   public int computePrice() {
	   int computePrice=0;
	   for(MenuItem item:products) {
		   computePrice=computePrice+item.getPrice();
	   }
	   return computePrice;
	   
   }
   /*public static void main(String[]args) {
	   ArrayList<MenuItem> items=new ArrayList<MenuItem>();
	   items.add(new MenuItem(1,"banane",8));
	   items.add(new MenuItem(2,"mere",5));
	   
	   CompositeProduct com=new CompositeProduct(1,"lista",6,items);
	   System.out.println(com.computePrice());
	   
	
   }*/
}
