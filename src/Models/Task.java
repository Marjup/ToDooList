package Models;

import org.apache.commons.lang3.StringUtils;

public class Task {

    private String title;

    public Task(String title) {
        if (StringUtils.isBlank(title)) throw new IllegalArgumentException();
        title = StringUtils.strip(title);

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
