package GoCart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 2681531852204068105L;;

    @Id
    private String emailId;

    private String password;

    private boolean enabled;    // soft delete

    @OneToOne(mappedBy = "user")
    private Customer customer;

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
