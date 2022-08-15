package com.example.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.todolist.database.AppDatabase;
import com.example.todolist.database.Todo;

public class AddTodoViewModel extends ViewModel {

    private final LiveData<Todo> todo;

    public AddTodoViewModel(AppDatabase database, int todoId){
        todo = database.todoDao().loadTodoById(todoId);
    }

    public LiveData<Todo> getTodo() {
        return todo;
    }


}
