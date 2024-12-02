package com.example.schemaEx.service.task;

import com.example.schemaEx.repository.task.TaskRepository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskEntity find() {
         return taskRepository.select()
                .map(record -> new TaskEntity(record.getId(), record.getTitle()))
                .orElseThrow(() -> new IllegalStateException("todo"));
    }
}


