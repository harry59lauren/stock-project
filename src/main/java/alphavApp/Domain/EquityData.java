package alphavApp.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EquityData {


    @JsonProperty("1. open")
    public float open;

    @JsonProperty("4. close")
    public float close;

    @JsonProperty("2. high")
    public float high;

    @JsonProperty("3. low")
    public float low;

    public EquityData(){

    }

    @JsonProperty("5. volume")
    public float volume;

    public EquityData(float open, float close, float high, float low, float volume) {
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "EquityData{" +
                "open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", volume=" + volume +
                '}';
    }
}
