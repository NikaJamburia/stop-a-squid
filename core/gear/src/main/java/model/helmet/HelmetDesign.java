package model.helmet;

import lombok.Data;
import model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Data
@Entity
public class HelmetDesign extends BaseModel{
    @OneToMany
    private Helmet helmet;
    private String name;
    private String photo;
}
