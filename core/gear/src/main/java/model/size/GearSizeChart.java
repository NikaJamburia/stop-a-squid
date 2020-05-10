package model.size;

public interface GearSizeChart<S> {
    SizeUnit getSizeUnit();
    String getDescription();
    S getXsSize();
    S getSSize();
    S getMSize();
    S getLSize();
    S getXlSize();
    S getXxlSize();
    S getXxxlSize();
}
