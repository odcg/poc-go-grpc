package com.capgemini.event.nantes.devfest2019.gojava;

public class Prime {

    private final long id;
    private final String content;

    public Prime(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}