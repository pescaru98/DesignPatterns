package structural.facade.models;

public class Address {
    private int id;
    private String streeName;
    private String city;

    public Address() {
    }

    public Address(int id, String streeName, String city) {
        this.id = id;
        this.streeName = streeName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreeName() {
        return streeName;
    }

    public void setStreeName(String streeName) {
        this.streeName = streeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
