package model;

import java.math.BigDecimal;

public class Sys {
    private Integer type;
    private Integer id;
    private BigDecimal message;
    private String country;
    private Integer sunrise;
    private Integer sunset;

    public Integer getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getMessage() {
        return message;
    }

    public String getCountry() {
        return country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }
}
