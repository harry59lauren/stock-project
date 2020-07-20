package alphavApp.Domain;

public enum  TemporalResolution {
    TIME_SERIES_INTRADAY("TIME_SERIES_INTRADAY"),
    TIME_SERIES_DAILY("TIME_SERIES_DAILY"),
    TIME_SERIES_WEEKLY("TIME_SERIES_WEEKLY"),
    TIME_SERIES_MONTHLY("TIME_SERIES_MONTHLY");

 
    private String tempResolution;

    TemporalResolution(String resolution){
        this.tempResolution = resolution;
    }
}
