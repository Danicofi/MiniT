package retrofit.request;

public class RequestLogin {
    String email, password;

    public RequestLogin(){

    }

    public RequestLogin(String email, String password){
        super();
        this.email = email;
        this.password = password;
    }
}
