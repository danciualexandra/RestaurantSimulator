package bLayer;

public class BaseProduct extends MenuItem{
	public BaseProduct(int idProduct,String nameProduct,int priceProduct) {
		super(idProduct,nameProduct,priceProduct);
	}
public int computePrice() {
	int pret= this.price;
	return pret;
}
public String toString() {
	return super.toString();
}
}
