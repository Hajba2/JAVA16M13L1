package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DouJsoupParser {

    public static void main(String[] args) throws IOException {
        String url = "https://dou.ua/lenta/articles/interview-questions-java-developer/";

        Document doc = Jsoup.connect(url).get();

        Element body = doc.body();
        String text = doc.text();

        Element article = doc.getElementsByTag("article").first();
        Element h1 = article.getElementsByTag("h1").first();
        Element first = article.getElementsByClass("b-typo b-typo_post").first();

        Element element = doc.selectFirst("span.likely__counter");
        System.out.println("element.text() = " + element.text());

        System.out.println("first.text() = " + first.text());
        System.out.println("h1 = " + h1.text());

        Elements h2s = article.getElementsByTag("h2");
        for(Element h2 : h2s) {
            System.out.println("h2.text() = " + h2.text());
        }
    }
}
