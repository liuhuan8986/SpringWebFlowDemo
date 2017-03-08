package liuhuan.service;





import liuhuan.model.Order;

public class OrderServiceImpl {
  
  public OrderServiceImpl() {}
  
  public void saveOrder(Order order) {
	  System.out.println();
    System.out.println("SAVING ORDER:  " );
    System.out.println("   Customer:  " + order.getCustomer().getName());
    System.out.println("   # of Pizzas:  " + order.getPizzas().size());
    System.out.println("   Payment:  " + order.getPayment());
  }
}
