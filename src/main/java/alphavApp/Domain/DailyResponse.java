package alphavApp.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;


public class DailyResponse extends Response{

    @JsonProperty("Time Series (Daily)")
    private HashMap<String, EquityData> timeSeries = new HashMap<String, EquityData>();


    public HashMap<String, EquityData> getData() {
        return timeSeries;
    }

    public void setData(HashMap<String, EquityData> data) {
        this.timeSeries = data;
    }

    @Override
    public String toString() {
        return "Response{" +
               // "metaData=" + super.getMetaData() +
                ", timeSeries=" + timeSeries +
                '}';
    }


}
