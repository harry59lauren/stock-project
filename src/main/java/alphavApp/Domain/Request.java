package alphavApp.Domain;

import java.util.Calendar;

public class Request {

    private TemporalResolution temporalResolution;
    private Calendar date;
    private String date2;
    private String symbol;

    public Request(){

    }

    public Request(TemporalResolution temporalResolution, Calendar date, String date2, String symbol) {
        this.temporalResolution = temporalResolution;
        this.date = date;
        this.date2 = date2;
        this.symbol = symbol;
    }

    public TemporalResolution getTemporalResolution() {
        return temporalResolution;
    }

    public void setTemporalResolution(TemporalResolution temporalResolution) {
        this.temporalResolution = temporalResolution;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

