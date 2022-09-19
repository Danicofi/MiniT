package com.example.minitwitter;

public class User {
    public String name;
    public String last_name_f;
    public String last_name_m;
    public String date_born;
    public String email;
    public String password;
    public String verify_password;
    public String token;
    public String code;
    public String status;
    public String new_password;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getLast_name_f(){return last_name_f;}
    public void setLast_name_f(String last_name_f){this.last_name_f = last_name_f;}

    public String getLast_name_m(){return last_name_m;}
    public void setLast_name_m(String last_name_m){this.last_name_m = last_name_m;}

    public String getDate_born(){return date_born;}
    public void setDate_born(String date_born){this.date_born = date_born;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public String getVerify_password(){return verify_password;}
    public void setVerify_password(String verify_password){this.verify_password = verify_password;}

    public String getToken(){return token;}
    public void setToken(String token){this.token = token;}

    public String getCode(){return code;}
    public void setCode(String code){this.code = code;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}

    public String getNew_password(){return new_password;}
    public void setNew_password(String new_password){this.new_password = new_password;}

    public User(String name, String last_name_f, String last_name_m, String date_born, String email, String password, String verify_password, String token, String code, String status, String new_password){
        this.name = name;
        this.last_name_f = last_name_f;
        this.last_name_m = last_name_m;
        this.date_born = date_born;
        this.email = email;
        this.password = password;
        this.verify_password = verify_password;
        this.token = token;
        this.code = code;
        this. status = status;
        this.new_password = new_password;
    }
}


