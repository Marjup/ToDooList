package tests;


import Models.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTest {

    @Test
    public void addNewTask_addsTitle() {
        String taskName = "Hello World!";
        Task task = new Task(taskName);

        assertEquals(task.getTitle(), taskName);
    }

}


