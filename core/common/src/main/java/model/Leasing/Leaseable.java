package model.Leasing;

import java.math.BigDecimal;
import java.time.Period;

public interface Leaseable {
    BigDecimal getInitialPayment();
    BigDecimal getInterestRate();
    Period getMaximumLeasingPeriod();
}
