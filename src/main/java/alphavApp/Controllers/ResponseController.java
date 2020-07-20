package alphavApp.Controllers;

import java.text.MessageFormat;

import alphavApp.Domain.*;
import alphavApp.Services.RequestHandlerServiceImplementation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;


@RestController
public class ResponseController {


    private RequestHandlerServiceImplementation requestHandler = new RequestHandlerServiceImplementation() ;

   @RequestMapping(value = "/getIntraday/", method = RequestMethod.POST)
    public Response intraDayResponse(@RequestBody IntradayRequest request){

       return requestHandler.getIntraDayTimeSeries(request);

    }

    @RequestMapping(value = "/getDaily/", method = RequestMethod.POST)
    public DailyResponse response(@RequestBody DailyRequest request){

        return requestHandler.getDailyTimeSeries(request);

    }





}
