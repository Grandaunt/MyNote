package com.bcm.havoc.mynote.Entity;

public class UserEntity {

    public UserEntity() {

    }

    public UserEntity(String name, String nickname, String icon, String greetings, String age) {
        this.name = name;
        this.nickname = nickname;
        this.icon = icon;
        this.greetings = greetings;
        this.age = age;
    }

    private String name;
    private String nickname;
    private String icon;
    private String greetings;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", icon='" + icon + '\'' +
                ", greetings='" + greetings + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
