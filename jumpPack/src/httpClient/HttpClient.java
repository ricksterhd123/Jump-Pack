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
 * Simple HttpClient connection with support for both basic and JWT auth headers.
 * @author nicekor
 */
public class HttpClient {
    private OkHttpClient.Builder client;
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
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
                System.out.println(response.message());
                //if (response.code() == 401){ throw new IOException(); }
                String credential = Credentials.basic(username, password);
                System.out.println(credential);
                return response.request().newBuilder().header("authorization", credential).build();
            }
        });
    }
    
    /**
     * Set the authentication header with a Bearer token followed by a JWT
     * @param JWTEncodedString - The JWT string.
     */
    public void setJWTAuth(String JWTEncodedString){
        // todo
        client.authenticator(new Authenticator() {
            @Override
            public Request authenticate(Route route, Response response) throws IOException {
                System.out.println(response.message());
                //if (response.code() == 401){ throw new IOException(); }
                String credential = "Bearer " + JWTEncodedString;
                return response.request().newBuilder().header("authorization", credential).build();
            }
        });
    }
    
    /**
     * HTTP POST JSON and get String response
     * @param url
     * @param json
     * @return String response
     * @throws IOException 
     */
    public String postJSONGetString(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        OkHttpClient c = this.client.build();
        try (Response response = c.newCall(request).execute()) {
            return response.body().string();
        }
    }
    
     /**
     * HTTP POST JSON and get JSON response data 
     * @param url
     * @param json
     * @return String response
     * @throws IOException 
     */
    public JSONArray postJSONGetJSON(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        OkHttpClient c = this.client.build();
        try (Response response = c.newCall(request).execute()) {
            // JSON must start and end with '[' and ']'
            JSONArray jsonArr = new JSONArray("[" + response.body().string() + "]");
            return jsonArr;
        }
    }
    /**
     * GET HTTP response string from URL
     * @param url
     * @return String response
     * @throws IOException 
     */
    public String getString(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        
        OkHttpClient c = this.client.build();
        try (Response response = c.newCall(request).execute()) {
            System.out.println(response.code());
            if (response.code() == 401){ throw new IOException(); }
            return response.body().string();
        }
    }
    
    /**
     * GET HTTP response as JSONArray
     * @param url
     * @return JSONArray response
     * @throws IOException 
     */
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
