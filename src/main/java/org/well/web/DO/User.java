package org.well.web.DO;

public class User {
    private String uname;
    private String passwd;
    private Integer age;

    public User() {}

    public User(String uname, String passwd, Integer age) {
        this.uname = uname;
        this.passwd = passwd;
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                '}';
    }
}
