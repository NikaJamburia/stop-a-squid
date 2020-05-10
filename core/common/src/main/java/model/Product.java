package model;

import java.math.BigDecimal;

public interface Product {
    BigDecimal getMarketPrice();
    BigDecimal getManufacturerPrice();
    BigDecimal getTax();
}
