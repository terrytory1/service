package hello.service.domain;

import lombok.Getter;

@Getter
public class Item {

    private Long id;
    private String title;
    private String text;

    public Item() {
    }

    public Item(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}

