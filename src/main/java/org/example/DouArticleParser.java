package org.example;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DouArticleParser {

    private Element article;

    public DouArticleParser(Element article) {
        this.article = article;
    }

    public String getTitle() {
        return article.select("h2.title").text();
    }

    public int getViews() {
        //return Integer.valueOf(article.select("span.pageviews").text());
        Elements spans = article.getElementsByTag("span");
        Element pageviews = article.getElementsByClass("pageviews").first();

        return Integer.valueOf(pageviews.text());
    }

}
