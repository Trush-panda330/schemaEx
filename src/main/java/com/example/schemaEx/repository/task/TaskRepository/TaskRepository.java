package com.example.schemaEx.repository.task.TaskRepository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface TaskRepository {

    @Select("select id, title from tasks where id = #{taskId}")
    Optional<TaskRecord> select(long taskId);
}
