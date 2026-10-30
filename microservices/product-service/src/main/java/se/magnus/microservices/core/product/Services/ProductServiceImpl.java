package se.magnus.microservices.core.product.services;

import org.springframework.web.bind.annotation.RestController;
import se.magnus.api.core.product.ProductService;
import se.magnus.util.http.ServiceUtil;
import se.magnus.api.core.product.Product;

@RestController
public class ProductServiceImpl implements ProductService {

  private final ServiceUtil serviceUtil;

  public ProductServiceImpl(ServiceUtil serviceUtil) {
    this.serviceUtil = serviceUtil;
  }

  @Override 
  public Product getProduct(int productId) {
    return new Product(productId, "name-" + productId, 123,
        serviceUtil.getServiceAddress());
  }
}