package Crawl_list_song;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.*;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/electronicadance-moi.html");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern p = Pattern.compile("class=\"name_song\" title=\"(.*?)\" onclick=\"(.*?)\">(.*?)</a>");
            Matcher m = p.matcher(content);
            int n = 1;
            while (m.find() && n <= 5) {
//            while (n <= 5) {
                System.out.println(m.group(1));
                n++;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

