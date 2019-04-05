/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpClient;

import java.io.IOException;
import okhttp3.*;
import java.lang.Object;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;

/**
 *
 * @author nicekor
 */
public class HttpClient {
    private OkHttpClient.Builder client;
    
    public HttpClient() {
        this.client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS);
    }
    
    /**
     * Set the authenticator header with username and password
     * @param username - The username in the Authorization header
     * @param password - The password in the Authorization header
     */
    public void setBasicAuth(String username, String password){
        client.authenticator(new Authenticator() {
            @Override
            public Request authenticate(Route route, Response response) throws IOException {
                System.out.println(response.code());
                if (response.code() == 401){ throw new IOException(); }
                String credential = Credentials.basic(username, password);
                return response.request().newBuilder().header("Authorization", credential).build();
            }
        });
    }
    
    public void setJWTAuth(String JWTEncodedString){
        // todo
    }
    
    public String getString(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        
        OkHttpClient c = this.client.build();
        try (Response response = c.newCall(request).execute()) {
            return response.body().string();
        }
    }
    public JSONArray getArray(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        
        // Build it into an OkHttpClient
        OkHttpClient c = this.client.build();
        try (Response response = c.newCall(request).execute()) {
            JSONArray jsonArr = new JSONArray(response.body().string());
            return jsonArr;
        }
    }
}
