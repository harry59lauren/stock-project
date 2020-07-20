package alphavApp.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

    @JsonProperty("\\d\\. Information")
    private String information;

    @JsonProperty("2. Symbol")
    private String symbol;

    /*@JsonProperty("4. Interval")
    private String interval;*/

    @JsonProperty("3. Last Refreshed")
    private String lastRefreshed;

    @JsonProperty("4. Output Size")
    private String outputSize;

    @JsonProperty("5. Time Zone")
    private String timeZone;

    public MetaData(){

    }

    public MetaData(String information, String symbol, String interval, String lastRefreshed, String outputSize, String timeZone) {
        this.information = information;
        this.symbol = symbol;
        //this.interval = interval;
        this.lastRefreshed = lastRefreshed;
        this.outputSize = outputSize;
        this.timeZone = timeZone;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

//    public String getInterval() {
//        return interval;
//    }
//
//    public void setInterval(String interval) {
//        this.interval = interval;
//    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

   /* @Override
    public String toString() {
        return "MetaData{" +
                "information='" + information + '\'' +
                ", symbol='" + symbol + '\'' +
                ", interval='" + interval + '\'' +
                ", lastRefreshed='" + lastRefreshed + '\'' +
                ", outputSize='" + outputSize + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }*/
}
