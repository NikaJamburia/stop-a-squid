package model.helmet.size;

import lombok.Data;
import model.size.GearSizeChart;
import model.size.SizeUnit;

import javax.persistence.*;
import java.util.Optional;

@Data
@Embeddable
public class HelmetSizeChart implements GearSizeChart<HeadSizeRange> {
    private SizeUnit sizeUnit;
    private String description;
    @MapKeyEnumerated(EnumType.STRING)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "xs_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "xs_max_size"))
    })
    private Optional<HeadSizeRange> xsSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "s_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "s_max_size"))
    })
    private Optional<HeadSizeRange> sSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "m_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "m_max_size"))
    })
    private Optional<HeadSizeRange> mSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "l_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "l_max_size"))
    })
    private Optional<HeadSizeRange> lSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "xl_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "xl_max_size"))
    })
    private Optional<HeadSizeRange> xlSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "xxl_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "xxl_max_size"))
    })
    private Optional<HeadSizeRange> xxlSize;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "minHeadSize", column = @Column(name = "xxxl_min_size")),
            @AttributeOverride( name = "maxHeadSize", column = @Column(name = "xxxl_max_size"))
    })
    private Optional<HeadSizeRange> xxxlSize;
}
