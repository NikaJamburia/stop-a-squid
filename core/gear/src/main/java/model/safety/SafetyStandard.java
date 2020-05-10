package model.safety;

import lombok.Data;
import model.BaseModel;
import model.MotorcycleGear;
import model.size.GearSize;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class SafetyStandard extends BaseModel {
    @ManyToOne
    private MotorcycleGear motorcycleGear;
    @Embedded
    private SafetyCertificationAgency certificationAgency ;
    private LocalDate acquiredAt;
    private Set<GearSize> approvedSizes;
}
