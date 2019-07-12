public class Student {
    private String login;
    private String faculty;
    private String name;
    private int telephone;
    private Address address;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }
}
