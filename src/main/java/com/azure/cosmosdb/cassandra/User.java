package com.azure.cosmosdb.cassandra;


public class User {

    private int user_id;
    private String user_name;
    private String user_bcity;
    private Long user_count;


    public User() {

    }

    public User(int user_id, String user_name, String user_bcity) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_bcity = user_bcity;
        this.user_count = user_count;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_bcity() {
        return user_bcity;
    }

    public void setUser_bcity(String user_bcity) {
        this.user_bcity = user_bcity;
    }

    public Long getUser_count() {
        return user_count;
    }

    public void setUser_count(Long user_count) {
        this.user_count = user_count;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_bcity='" + user_bcity + '\'' +
                ", user_count=" + user_count +
                '}';
    }
}
