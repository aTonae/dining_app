package mis.oblabs.com.takeorder.pojo;

/**
 * Created by ato on 05/03/18.
 */

public class ObjectLogin {

        String username,password , status;

    public ObjectLogin(String username, String password, String status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
