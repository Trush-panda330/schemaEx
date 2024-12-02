package com.example.schemaEx.service.task;

import com.example.schemaEx.repository.task.TaskRepository.TaskRecord;
import com.example.schemaEx.repository.task.TaskRepository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskEntity find(long taskId) {
         return taskRepository.select(taskId)
                .map(record -> new TaskEntity(record.getId(), record.getTitle()))
                .orElseThrow(() -> new TaskEntityNotFoundException(taskId));
    }

    public TaskEntity create(String title) {
        var record = new TaskRecord(null,title);
        taskRepository.insert(record);
        return new TaskEntity(record.getId(), record.getTitle());
    }
}


