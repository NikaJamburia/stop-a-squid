package model.helmet.structure;

import lombok.Data;

import javax.persistence.*;

@Data
@Embeddable
public class HelmetStructure {
    private HelmetShape shape;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "material", column = @Column(name = "face_shield_material"))
    })
    private FaceShield faceShield;
    private OuterShellMaterial outerShellMaterial;
    private AbsorbingLinerMaterial linerMaterial;
    private HelmetPadding padding;
    private HelmetRetentionSystem retentionSystem;
}
