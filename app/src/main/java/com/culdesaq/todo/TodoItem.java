package com.culdesaq.todo;

import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by cameronjackson on 1/5/17.
 */

public final class TodoItem {

    private String task;

    @Nullable
    private static ArrayList<TodoItem> entries;

    public TodoItem(String task) {
        super();
        this.task = task;
    }

    public static ArrayList<TodoItem> allEntries() {
        return entries;
    }

    public static void addEntryToDb(TodoItem item) {
        if (entries == null) {
            entries = new ArrayList();
        }

        entries.add(item);
    }

}
