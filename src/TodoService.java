/*
* File: Kliens.java
* Author: Grünhut Gábor
* Copyright: 2024, Grünhut Gábor
* Group: Szoft II/E
* Date: 2024-01-16
* Github: https://github.com/GaborGrunhut/
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodoTitles() {
        String result = client.get(url);
        return result;
    }
}
