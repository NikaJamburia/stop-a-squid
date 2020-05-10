package model.helmet;

import lombok.Data;
import model.BaseModel;
import model.MotorcycleGear;
import model.helmet.size.HelmetSizeChart;
import model.helmet.structure.HelmetStructure;
import model.manufacturer.Manufacturer;
import model.safety.SafetyStandard;
import model.size.GearSize;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Helmet extends BaseModel implements MotorcycleGear {
    @OneToMany
    private Manufacturer manufacturer;
    private String model;
    private LocalDate manufactureDate;
    @OneToMany
    private List<SafetyStandard> safetyStandards;
    @OneToOne
    private HelmetSizeChart helmetSizeChart;
    private GearSize size;
    @OneToOne
    private HelmetDesign design;
    private BigDecimal marketPrice;
    private BigDecimal manufacturerPrice;
    private BigDecimal tax;
    @Embedded
    private HelmetStructure structure;
    private HelmetType type;

}
