package hello.service.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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
}

