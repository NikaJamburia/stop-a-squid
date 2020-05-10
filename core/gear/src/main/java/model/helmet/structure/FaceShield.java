package model.helmet.structure;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class FaceShield {
    private OuterShellMaterial material;
    private Boolean pinLockReady;
}
