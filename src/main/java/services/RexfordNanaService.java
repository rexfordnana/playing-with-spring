package services;

import com.sun.deploy.net.HttpResponse;
import dbo.Rexfordnana;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rexfordnana on 9/13/18.
 */
public class RexfordNanaService {
    HttpEntity httpEntity;
    HttpResponse httpResponse;
    RestTemplate restTemplate = new RestTemplate();
    String uri = "https://48cbf55a-d89f-48fd-85e9-e4008c2ac4db.mock.pstmn.io/rexfordnana/sayHi";
    Rexfordnana response;

    public Rexfordnana sayHi(){
        response = restTemplate.getForObject(uri, Rexfordnana.class);
        return response;
    }
}
