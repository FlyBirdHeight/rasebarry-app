package adsion.bean;

public class All {
    public String status;
    public Token token;
    public UserInfo userInfo;

    @Override
    public String toString() {
        return "All{" +
                "status='" + status + '\'' +
                ", token=" + token +
                ", userInfo=" + userInfo +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
