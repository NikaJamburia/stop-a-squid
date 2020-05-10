package model.helmet.size;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class HeadSizeRange {
    private final Integer minHeadSize;
    private final Integer maxHeadSize;
}
