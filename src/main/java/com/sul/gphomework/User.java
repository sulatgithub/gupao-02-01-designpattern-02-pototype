package com.sul.gphomework;

public class User {
    private String id;
    private String name;
    private String deptId;

    public User() {

    }

    public User(String id,String name,String deptId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
