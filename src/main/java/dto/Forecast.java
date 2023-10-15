package dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Forecast {

    @JsonSetter("time")
    private List<String> time;

    @JsonSetter("temperature_2m")
    private List<Double> temperature;

    @JsonSetter("relativehumidity_2m")
    private List<Integer> humidity;

    @JsonSetter("precipitation_probability")
    private List<Integer> precipitationProbability;

    public Forecast() {
    }

    public Forecast(List<String> time, List<Double> temperature, List<Integer> humidity, List<Integer> precipitationProbability) {
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitationProbability = precipitationProbability;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<Double> temperature) {
        this.temperature = temperature;
    }

    public List<Integer> getHumidity() {
        return humidity;
    }

    public void setHumidity(List<Integer> humidity) {
        this.humidity = humidity;
    }

    public List<Integer> getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(List<Integer> precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "time=" + time +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", precipitationProbability=" + precipitationProbability +
                '}';
    }
}
