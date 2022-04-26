package $4httprequest.$1simplegetreq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleGETRequest {

    /**
     * Sending a Simple GET Request:
     *  -
     */

    public static void main(String[] args) {

        BufferedReader read;
        String text;
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Olivier_Martinez");
            /* connection setup */
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            /* type of request */
            conn.setRequestMethod("GET");

            int statusCode = conn.getResponseCode();
            System.out.println("The status is: " + statusCode);

            /* response headers */
            System.out.println("Returned headers: \n" + conn.getHeaderFields());
            System.out.println("Content size: " + conn.getHeaderField("Content-Length"));
            System.out.println("Content type: " + conn.getHeaderField("Content-Type"));

            System.out.println("The Response body: ");

            if(statusCode >= 200 && statusCode <= 299) {
                read = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while( (text = read.readLine())  != null) {
                    content.append(text);
                }
                read.close();

                System.out.println(content.toString());
            } else {
                System.out.println("The request failed: " + conn.getResponseMessage());
            }

            conn.disconnect();
        } catch (MalformedURLException murlx) {
            murlx.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
