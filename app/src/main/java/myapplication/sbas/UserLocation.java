package myapplication.sbas;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
public class UserLocation implements Serializable {
    Double longitude;
    Double lattitude;
    Long timestamp;

    public UserLocation() {
    }

    public UserLocation(Double longitude, Double lattitude, Long timestamp) {
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.timestamp = timestamp;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}



