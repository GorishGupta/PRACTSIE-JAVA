package OOPS;

public class OOPS {
    private String UserName;
    private String Password;

    public String getUserName(boolean key){
        if(key){
            return UserName;
        }
        else{
            return "GO TrY AgAin";
        }
    }
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    public String getPassword(boolean key){
        if(key){
            return Password;
        }
        else{
            return "ABey chale ja";
        }
    }

    public void setPassword(String Password){
            this.Password = Password;
    }
}
