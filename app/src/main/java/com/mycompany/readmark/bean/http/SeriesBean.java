package com.mycompany.readmark.bean.http;

import java.io.Serializable;

/**
 * Created by Lenovo.
 */

public class SeriesBean implements Serializable {
    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}