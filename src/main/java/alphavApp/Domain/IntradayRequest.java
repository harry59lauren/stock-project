package alphavApp.Domain;

import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalTime;
import java.util.Calendar;

public class IntradayRequest  extends Request{

    private LocalTime startTime;
    private LocalTime endTime;

    public IntradayRequest(){

    }

    public IntradayRequest(TemporalResolution temporalResolution, Calendar date, String date2, String symbol, LocalTime startTime, LocalTime endTime) {
        super(temporalResolution, date, date2, symbol);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
