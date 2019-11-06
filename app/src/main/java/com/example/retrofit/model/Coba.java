package com.example.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class Coba {
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private Integer age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'';
    }

    @SerializedName("city")
    private String city;

    public Coba(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
