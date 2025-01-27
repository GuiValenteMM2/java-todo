package org.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;
    private String category;

    public Todo(String name, String desc, String category) {

        setName(name);
        setDesc(desc);
        setCategory(category);

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    @Override
    public String toString() {
        return "Todo name: " + this.getName() + "// description: " + this.getDesc() + "// category: " + this.getCategory() + "\n";
    }
}
