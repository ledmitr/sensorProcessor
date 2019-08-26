package ru.test.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Sensor {
    private Long id;
    private List<SensorMeasurement> measurements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SensorMeasurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<SensorMeasurement> measurements) {
        this.measurements = measurements;
    }
}
