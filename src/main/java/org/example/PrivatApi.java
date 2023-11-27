package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class PrivatApi {

    public static void main(String[] args) throws IOException {
        String url = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";

        String text = Jsoup.connect(url)
                //.header("Content-Type", "application/json")
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        System.out.println(text);
    }
}
