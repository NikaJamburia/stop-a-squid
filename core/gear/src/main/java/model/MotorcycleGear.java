package model;

import model.manufacturer.Manufacturer;
import model.safety.SafetyStandard;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface MotorcycleGear{
    BigDecimal getMarketPrice();
    BigDecimal getManufacturerPrice();
    BigDecimal getTax();
    Manufacturer getManufacturer();
    String getModel();
    LocalDate getManufactureDate();
    List<SafetyStandard> getSafetyStandards();
}
