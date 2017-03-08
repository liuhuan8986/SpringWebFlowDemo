package liuhuan.flow;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import liuhuan.model.CashOrCheckPayment;
import liuhuan.model.CreditCardPayment;
import liuhuan.model.Customer;
import liuhuan.model.Order;
import liuhuan.model.Payment;
import liuhuan.model.PaymentDetails;
import liuhuan.service.CustomerNotFoundException;
import liuhuan.service.CustomerService;
import static liuhuan.model.PaymentType.CREDIT_CARD;
@Component
public class PizzaFlowActions {
  //private static final Logger LOGGER = getLogger(PizzaFlowActions.class);
  
   public Customer lookupCustomer(String phoneNumber) 
         throws CustomerNotFoundException {     
      Customer customer = customerService.lookupCustomer(phoneNumber);
      if(customer != null) {        
        return customer;
      } else {
        throw new CustomerNotFoundException();
      }
   }
   
   public void addCustomer(Customer customer) {
      System.out.println("TODO: Flesh out the addCustomer() method.");
   }

   public Payment verifyPayment(PaymentDetails paymentDetails) {
     Payment payment = null;
     if(paymentDetails.getPaymentType() == CREDIT_CARD) {
       payment = new CreditCardPayment();
     } else {
       payment = new CashOrCheckPayment();
     }
     
     return payment;
   }
   
   public void saveOrder(Order order) {
      System.out.println("TODO: Flesh out the saveOrder() method.");
   }
   
   public boolean checkDeliveryArea(String zipCode) {
     System.out.println("TODO: Flesh out the checkDeliveryArea() method.");
     return "75075".equals(zipCode);
   }

   @Autowired
   CustomerService customerService;
}
