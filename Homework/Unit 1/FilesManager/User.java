
package managefiles;

public class User {
    private String name;
    private String lastname;
    private String adress;
    private String email;

    public User(String name, String lastname, String adress, String email) {
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
