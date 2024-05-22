packticket com.example.Adminka.model;

public class User {
    private int id;
    private String userusername;
    private int ticket;

    public User(int id, String username, int ticket) {
        this.id = id;
        this.username = username;
        this.ticket = ticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String buyer) {
        this.username = username;
    }

    public int getTicket() { return ticket; }

    public void setTicket(int ticket) { this.ticket = ticket; }
}
