package com.example.schemaEx.service.task;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    public TaskEntity find() {
        return new TaskEntity(2,"from Service");
    }
}


