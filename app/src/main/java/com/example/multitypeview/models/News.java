package com.example.multitypeview.models;

public class News {
    private String newsTittle, news;

    public News(String newsTittle, String news) {
        this.newsTittle = newsTittle;
        this.news = news;

    }

    public String getNewsTittle() {
        return newsTittle;
    }

    public String getNews() {
        return news;
    }
}
