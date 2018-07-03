package task2;

import java.util.ListResourceBundle;

public class ClassBundle_ru extends ListResourceBundle {
    private Object[][] contents = {
            {"1 вопрос", "ответ на 1 вопрос"},
            {"2 вопрос", "ответ на 2 вопрос"},
            {"3 вопрос", "ответ на 3 вопрос"},
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
