package bLayer;

import java.util.ArrayList;
import java.util.HashMap;

public interface IRestaurantProcessing {
	public void deleteProduct(MenuItem item);
	 public void addProduct(MenuItem item);
	 public void returntabelhash(HashMap<Order,ArrayList<MenuItem>> comanda);
	 public void productTable(ArrayList<MenuItem> meniu);
	 public boolean isEmptyMenu();

}
