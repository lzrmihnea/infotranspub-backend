package ro.gov.ithub.entity.util;

import ro.gov.ithub.entity.Stop;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GpsCoordinate {

    @Column(name = Stop.COLUMN_STOP_LATITUDE, nullable = false)
    private Double latitude;

    @Column(name = Stop.COLUMN_STOP_LONGITUDE, nullable = false)
    private Double longitude;
}
