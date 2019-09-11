package com.multilevelview.models;


import java.util.List;

public abstract class RecyclerViewItem {

    Long id;
    String text="";
    String secondText = "";
    String formname;
    boolean is_parent;

    private List<RecyclerViewItem> children;

    private int level;

    private int position;

    private boolean expanded=false;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    protected RecyclerViewItem(int level){
        this.level = level;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    public List<RecyclerViewItem> getChildren() {
        return children;
    }

    public void addChildren(List<RecyclerViewItem> children) {
        this.children = children;
    }

    public boolean hasChildren(){
        if(children !=null && children.size() > 0){
            return true;
        }else{
            return false;
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname;
    }

    public boolean isIs_parent() {
        return is_parent;
    }

    public void setIs_parent(boolean is_parent) {
        this.is_parent = is_parent;
    }
}
