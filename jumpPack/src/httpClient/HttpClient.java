/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpClient;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;

/**
 *
 * @author nicekor
 */
public class HttpClient {
    
    public HttpClient() {
        
    }
    
    public JSONArray getArray(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            JSONArray jsonArr = new JSONArray(response.body().string());
            return jsonArr;
        }
    }
}
