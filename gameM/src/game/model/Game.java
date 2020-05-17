package game.model;

public class Game {
    private int id;
    private String name;
    private String age;
    private String genre;
    private double price;
    private String console;
    private String game;
    private String location;

    public Game() {
    }

    public Game(int id, String name, String age, String genre, double price, String console, String game, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.price = price;
        this.console = console;
        this.game = game;
        this.location = location;
    }

    public Game(String name, String age, String genre, double price, String console, String game, String location) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.price = price;
        this.console = console;
        this.game = game;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", console='" + console + '\'' +
                ", game='" + game + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
