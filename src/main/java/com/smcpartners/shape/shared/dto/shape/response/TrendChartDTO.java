package com.smcpartners.shape.shared.dto.shape.response;

import java.util.List;

/**
 * Responsible:</br>
 * 1.  DTO</br>
 * <p>
 * Created by johndestefano on 3/15/16.
 * </p>
 * <p>
 * Changes:</br>
 * 1. </br>
 * </p>
 */
public class TrendChartDTO {
    private String name;
    private String description;
    private String numeratorDescription;
    private String denominatorDescription;
    private List<List<Object>> trendChart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumeratorDescription() {
        return numeratorDescription;
    }

    public void setNumeratorDescription(String numeratorDescription) {
        this.numeratorDescription = numeratorDescription;
    }

    public String getDenominatorDescription() {
        return denominatorDescription;
    }

    public void setDenominatorDescription(String denominatorDescription) {
        this.denominatorDescription = denominatorDescription;
    }

    public List<List<Object>> getTrendChart() {
        return trendChart;
    }

    public void setTrendChart(List<List<Object>> trendChart) {
        this.trendChart = trendChart;
    }
}
