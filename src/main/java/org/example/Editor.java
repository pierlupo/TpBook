package org.example;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Editor)) return false;
        Editor editor = (Editor) o;
        return id == editor.id && Objects.equals(editorName, editor.editorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, editorName);
    }
}
