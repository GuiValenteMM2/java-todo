package org.practice.model;

public class Todo {

    private int id;
    private String name;
    private String desc;
    private String category;

    public Todo(int id, String name, String desc, String category) {

        setId(id);
        setName(name);
        setDesc(desc);
        setCategory(category);

    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
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
