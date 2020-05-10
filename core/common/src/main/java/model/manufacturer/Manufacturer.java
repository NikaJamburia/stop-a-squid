package model.manufacturer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.BaseModel;
import model.Product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Manufacturer extends BaseModel {
    @ManyToOne
    private List<Product> products;
    private String name;
    private String phone;
    private String country;
    private String email;
}
