package model.safety;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class SafetyCertificationAgency {
    private final String name;
    private final String country;
    private final String link;
}
