package $4httprequest.$3jsonresponse;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    /**
     * Processing JSON Data in a Response
     */

    public static void main(String[] args) {
        BufferedReader read;
        String text;
        StringBuffer content = new StringBuffer();

        try {
//            URL url = new URL("https://reqres.in/api/users");
            URL url = new URL("https://reqres.in/api/users?page=2");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int statusCode = conn.getResponseCode();
            System.out.println("The status is: " + statusCode);

            System.out.println("The Response body: ");

            if (statusCode >= 200 && statusCode <= 299) {
                read = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((text = read.readLine()) != null) {
                    content.append(text);
                }
                read.close();

                String responseText = content.toString();

                if(conn.getHeaderField("Content-Type").contains("json")) {
                    JSONObject jsonObj = new JSONObject(responseText);
                    System.out.println("JSON:\n" + jsonObj.toString(4));
                } else {
                    System.out.println(responseText);
                }

            } else {
                System.out.println("The request failed: " + conn.getResponseMessage());
            }

            conn.disconnect();
        } catch (MalformedURLException murlx) {
            murlx.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
