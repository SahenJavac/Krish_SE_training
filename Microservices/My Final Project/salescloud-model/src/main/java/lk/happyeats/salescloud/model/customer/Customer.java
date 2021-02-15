package lk.happyeats.salescloud.model.customer;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;
    private String lastName;
    private String telNumber;
    private String zipcode;

    @OneToMany(mappedBy = "customer")
    private List<Loyality> loyalities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Loyality> getLoyalities() {
        return loyalities;
    }

    public void setLoyalities(List<Loyality> loyalities) {
        this.loyalities = loyalities;
    }


}
