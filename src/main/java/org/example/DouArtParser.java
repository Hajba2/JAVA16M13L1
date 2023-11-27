package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DouArtParser {

    public static void main(String[] args) throws IOException {
        //<ul class="navList" id="allclasses_navbar_top">
        Document doc = Jsoup.connect("https://dou.ua/lenta/").get();

        //Element allclassesNavbarTop = doc.getElementById("m-hide");
        //System.out.println("allclassesNavbarTop.text() = " + allclassesNavbarTop.text());

        Element topArticlesDiv = doc.getElementsByClass("b-lenta").first();
        Elements articles = topArticlesDiv.getElementsByTag("article");

        for (Element art: articles) {
            DouArticleParser douArticleParser = new DouArticleParser(art);
            System.out.println("douArticleParser.getTitle() = " + douArticleParser.getTitle());
            System.out.println("douArticleParser.getViews() = " + douArticleParser.getViews());
            System.out.println("##################################################################");
        }

    }
}
