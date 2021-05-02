package GoCart.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="authorities")
public class Authorities implements Serializable {
    private static final long serialVersionUID = 8734140534986494039L;

    @Id
    private String emailId;
    private String authorities;

    public Authorities() {
    }

    public Authorities(String emailId, String authorities) {
        this.emailId = emailId;
        this.authorities = authorities;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAuthorities() {
        return authorities;
    }
}
