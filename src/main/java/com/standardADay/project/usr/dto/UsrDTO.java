package com.standardADay.project.usr.dto;

public class UsrDTO {
    private String usrName;
    private String usrEmail;
    private String usrId;
    private String usrPwd;
    private int age;

    public UsrDTO(){}

    public UsrDTO(String usrName, String usrEmail, String usrId, String usrPwd, int age) {
        this.usrName = usrName;
        this.usrEmail = usrEmail;
        this.usrId = usrId;
        this.usrPwd = usrPwd;
        this.age = age;
    }

    public UsrDTO(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
