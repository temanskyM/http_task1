import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Fact;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static final String REMOTE_SERVICE_URL = "https://cat-fact.herokuapp.com/facts";
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        List<Fact> factList = new ArrayList<>();

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("My agent")
                .setDefaultRequestConfig(RequestConfig.DEFAULT)
                .build();
        HttpGet request = new HttpGet(REMOTE_SERVICE_URL);
        try {
            CloseableHttpResponse response = httpClient.execute(request);
            factList = getFacts(response);
            List<Fact> fileredFacts = filter(factList);
            fileredFacts.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static  List<Fact> getFacts(CloseableHttpResponse response) throws IOException {
        return mapper.readValue(response.getEntity().getContent(), new TypeReference<List<Fact>>() {});
    }
    private static  List<Fact> filter(List<Fact> input){
        return input.stream().filter(value -> value.getUsed()!= false).collect(Collectors.toList());
    }
}
