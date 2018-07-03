package task2;

import java.util.ListResourceBundle;

public class ClassBundle_en extends ListResourceBundle {
    private Object[][] contents = {
            {"1 question", "answer to 1 question"},
            {"2 question", "answer to 2 question"},
            {"3 question", "answer to 3 question"},
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
