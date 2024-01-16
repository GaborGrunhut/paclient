/*
* File: Kliens.java
* Author: Grünhut Gábor
* Copyright: 2024, Grünhut Gábor
* Group: Szoft II/E
* Date: 2024-01-16
* Github: https://github.com/GaborGrunhut/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class TeendokApp {
    public TeendokApp() {
        TodoService todoService = new TodoService();
        String todoTitles = todoService.getTodoTitles();

        ArrayList<Teendok> todoList = Convert.toListObject(todoTitles, Teendok.class);
        for (Teendok todo : todoList) {
            System.out.println(todo.title);
        }
    }
}
