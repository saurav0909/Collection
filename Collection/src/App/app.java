package App;

import model.DeliveryRoute;
import model.OrderList;

public class app {
	
	public static void main(String[] args) {
		
		OrderList<String> orderlist=new OrderList<>(5);
		
		orderlist.add("mobile");
		orderlist.add("laptop");
		orderlist.add("mosue");
		orderlist.add("headphone");
		orderlist.add("keyboard");
		System.out.println(orderlist);
		
		System.out.println("Retrieve orders by index= "+orderlist.get(0));
		
		System.out.println("Add new order");
		orderlist.add("charger");
		System.out.println("After new order added"+orderlist);
		orderlist.remove(2);
		System.out.println("After remove new element "+orderlist);
		
		DeliveryRoute<String> deliveryroute=new DeliveryRoute<>();
		
		deliveryroute.add("pune");
		deliveryroute.add("mumbai");
		deliveryroute.add("nashik");
		deliveryroute.add("delhi");
		
		System.out.println(deliveryroute);
		deliveryroute.add("satra");
		System.out.println("After Add new delivery points "+deliveryroute);
		
		deliveryroute.remove(3);
		System.out.println("After remove delivery points "+deliveryroute);
		
		
	}

}
