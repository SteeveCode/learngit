package com.designpatterns;

import java.util.List;

public class Robot implements Cloneable{
    private int Id;
    private List<String> features;
    private Components components;

    public Robot(int Id, List<String> features, Components components){
        this.Id = Id;
        this.features = features;
        this.components = components;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public List<String> getFeatures() {
        return features;
    }
    public void setFeatures(List<String> features) {
        this.features = features;
    }
    public Components getComponents() {
        return components;
    }
    public void setComponents(Components components) {
        this.components = components;
    }
    public Robot clone(){
        try{
            return (Robot) super.clone(); // typecast the super class execution of clone method to Robot object.
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
