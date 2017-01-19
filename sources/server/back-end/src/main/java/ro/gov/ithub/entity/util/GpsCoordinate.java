package ro.gov.ithub.entity.util;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GpsCoordinate {

    private static final String COLUMN_STOP_LATITUDE = "STOP_LAT";
    private static final String COLUMN_STOP_LONGITUDE = "STOP_LONG";

    @Column(name = COLUMN_STOP_LATITUDE, nullable = false)
    private Double latitude;

    @Column(name = COLUMN_STOP_LONGITUDE, nullable = false)
    private Double longitude;
}
