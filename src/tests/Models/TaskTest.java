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

}