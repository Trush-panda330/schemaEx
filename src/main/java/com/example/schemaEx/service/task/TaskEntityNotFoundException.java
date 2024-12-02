package com.example.schemaEx.service.task;

public class TaskEntityNotFoundExcption extends RuntimeException {

    private long taskId;

    public TaskEntityNotFoundExcption(long taskId) {
        super("TaskEntity (id =" + taskId + ") is not found");
        this.taskId = taskId;
    }
}
