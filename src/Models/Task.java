package Models;

public class Task {

    private String title;

    public Task(String title) {
        if (title.equals("")) throw new IllegalArgumentException();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
