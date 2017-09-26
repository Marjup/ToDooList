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

}