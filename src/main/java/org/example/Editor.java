package org.example;

public class Editor {

    int id;
    String editorName;

    public Editor(int id, String editorName) {
        this.id = id;
        this.editorName = editorName;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", editorName='" + editorName + '\'' +
                '}';
    }
}
