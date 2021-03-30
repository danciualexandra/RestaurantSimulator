package bLayer;

import java.io.Serializable;

public class MenuItem implements Serializable {
	
	public int idItem;//id produs din meniu
	public String nameItem;//nume produs din meniu
	public int price;//pret afisat in meniu
	public MenuItem() {
		
	}
	public MenuItem(int id,String name,int priceProduct) {
		idItem=id;
		nameItem=name;
		price=priceProduct;
		
		
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getNameItem() {
		return nameItem;
	}
	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItem [idItem=" + idItem + ", nameItem=" + nameItem + ", price=" + price + "]";
	}
	
	
	

}
