package shoppingKartusingarray;

public class OrderDetails {
        int orderId;
		String productname,brand;
		int quntity;
		double totalamount;
		public OrderDetails(int orderId,int i, String productname, String brand, int quntity, double totalamount) {
			super();
			this.orderId = orderId;
			this.productname = productname;
			this.brand = brand;
			this.quntity = quntity;
			this.totalamount = totalamount;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getQuntity() {
			return quntity;
		}
		public void setQuntity(int quntity) {
			this.quntity = quntity;
		}
		public double getTotalamount() {
			return totalamount;
		}
		public void setTotalamount(double totalamount) {
			this.totalamount = totalamount;
		}
		
		 

}
