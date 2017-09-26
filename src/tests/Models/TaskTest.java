package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void addNewTask_addsTitle() {
        String taskName = "Hello World!";
        Task task = new Task(taskName);

        assertEquals(task.getTitle(), taskName);
    }

    @Test
    public void addTaskWithEmptyTitle_throwsIllegalArgumentException() {
        String taskName = "";

        assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task(taskName);
        });
    }

    @Test
    public void addTaskWithTitleOnlySpaces_throwsIllegalArgumentException() {
        String taskName = "    ";

        assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task(taskName);
        });
    }

    @Test
    public void addTaskWithNullTitle_throwsIllegalArgumentException() {
        String taskName = null;

        assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task(taskName);
        });
    }

    @Test
    public void addTaskWithTitleWithLeadingWhitespace_removesLeadingWhitespace() {
        String taskName = "  Hello world!";
        Task task = new Task(taskName);

        assertEquals(task.getTitle(), "Hello world!");
    }

    @Test
    public void addTaskWithTitleWithEndingWhitespace_removesEndingWhitespace() {
        String taskName = "Hello world!   ";
        Task task = new Task(taskName);

        assertEquals(task.getTitle(), "Hello world!");
    }

    @Test
    public void addTaskWithTitleWithWhitespaceAtStartAtEnd_removesWhitespaceAtStartAtEnd() {
        String taskName = "   Hello world!   ";
        Task task = new Task(taskName);

        assertEquals(task.getTitle(), "Hello world!");
    }

}