package bLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	public int orderId;
	public int table;//numarul mesei 
	public Date date;//data comenzii
	//LocalDate date;
	//constructor default
	public Order() {
		
	}
	///constructor
	public Order(int ID,int t) {
	  orderId=ID;
	  table=t;
	  this.date=new Date();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public String getDate() {
		 Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      
		return ft.format(dNow);
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", table=" + table + ", date=" + date + "]";
	}
	public int hashCode() {
		int id;
		id=this.getOrderId();
		return id;
	}
}
