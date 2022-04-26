package $4httprequest.$5postrequest;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    /**
     * HttpURLConnection and POST Request
     *  - POST request: In order to store data or create a new resource on that remote server. The data
     *    which needs to be stored will be transmitted from the client application.
     *
     */

    public static void main(String[] args) {
        String text;
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL("https://reqres.in/api/users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");

            conn.setDoOutput(true);

            String postData = "{'email':'alice@gmail.com'," +
                    "'firstName':'Alice','lastName':'Alison'}";

            try(OutputStream outputStream = conn.getOutputStream()) {
                byte[] postBytes = postData.getBytes(StandardCharsets.UTF_8);
                outputStream.write(postBytes, 0, postBytes.length);
            }

            System.out.println("Response code: " + conn.getResponseCode());
            System.out.println("Response message: " + conn.getResponseMessage());

            try(BufferedReader read = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"))) {
                StringBuilder responseText = new StringBuilder();
                while((text = read.readLine()) != null) {
                    responseText.append(text.trim());
                }
                if(conn.getHeaderField("Content-Type").contains("json")) {
                    JSONObject jsonObject = new JSONObject(responseText.toString());
                    System.out.println("JSON:\n" + jsonObject.toString(4));
                } else {
                    System.out.println(responseText.toString());
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
