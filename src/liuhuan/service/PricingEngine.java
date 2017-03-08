package liuhuan.service;

import liuhuan.model.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
