package alphavApp.Services;

import alphavApp.Domain.*;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

public class RequestHandlerServiceImplementation {

     private final static String intraDayTimeSeries= "https://www.alphavantage.co/query?function={0}&symbol={1}&interval=1min&outputsize=full&datatype=json&apikey=79B3FTWLLJFPN6DE";
     private final static String dailyTimeSeries = "https://www.alphavantage.co/query?function={0}&symbol={1}&outputsize=full&datatype=json&apikey=79B3FTWLLJFPN6DE";

     private RestTemplate alphavantageAPIConnection = new RestTemplate();

     public Response getIntraDayTimeSeries(IntradayRequest request){

         String resolution = request.getTemporalResolution().toString();
         String symbol = request.getSymbol();
         String apiURL = MessageFormat.format(intraDayTimeSeries, resolution,symbol);
         System.out.println(apiURL);
         Response data = alphavantageAPIConnection.getForObject(apiURL, Response.class);
         System.out.println(data.getMetaData().getTimeZone());
         //System.out.println(data);
         return data;
     }

    public DailyResponse getDailyTimeSeries(DailyRequest request){

        String resolution = request.getTemporalResolution().toString();
        String symbol = request.getSymbol();
        String apiURL = MessageFormat.format(dailyTimeSeries, resolution,symbol);
        System.out.println(apiURL);
        DailyResponse api_data = alphavantageAPIConnection.getForObject(apiURL, DailyResponse.class);
        System.out.println(api_data.getMetaData().getTimeZone());
        //System.out.println(data);
        return api_data;
    }

}
