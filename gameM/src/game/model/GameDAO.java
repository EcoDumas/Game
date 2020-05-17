package game.model;

import java.sql.*;

public class GameDAO {

    final static String URL = "jdbc:mysql://localhost:3306/game";
    public String add(Game game){
        String query = "insert into game (name , age, genre, price, console, game, location)" +
                "values (?,?,?,?,?,?,?)";
        try {
            Connection connection = DriverManager.getConnection(URL, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, game.getName());
            preparedStatement.setString(2, game.getAge());
            preparedStatement.setString(3, game.getGenre());
            preparedStatement.setDouble(4, game.getPrice());
            preparedStatement.setString(5, game.getConsole());
            preparedStatement.setString(6, game.getGame());
            preparedStatement.setString(7, game.getLocation());
            preparedStatement.executeUpdate();

            return "Successfully created new entry";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Failure creating new entry";
        }
    }

    public ResultSet searchByTeamName(String name){
        String query2 = "";
        if (name.equals("")) {//User didnt entered any team_name - displaying all entries
            query2 = "SELECT * FROM game";
        } else {// User entered team_name displaying specific entries
            query2 = "SELECT * FROM game WHERE name LIKE '" + name + "'";
        }

        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(URL, "root", "");
            preparedStatement = connection.prepareStatement(query2);
            resultSet = preparedStatement.executeQuery(query2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public void editById(Game game){
        String query = "update game set name =?, age=?, genre=?, price=?, console=?, game=?, location=? " +
                " where id=?";
        try {
            Connection connection = DriverManager.getConnection(URL, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, game.getName());
            preparedStatement.setString(2, game.getAge());
            preparedStatement.setString(3, game.getGenre());
            preparedStatement.setDouble(4, game.getPrice());
            preparedStatement.setString(5, game.getConsole());
            preparedStatement.setString(6, game.getGame());
            preparedStatement.setString(7, game.getLocation());
            preparedStatement.setInt(8, game.getId());
            preparedStatement.executeUpdate();

            System.out.println("Pavyko paredaguoti esama irasa");
        } catch (SQLException e) {
            System.out.println("Ivyko klaida redaguojant esama irasa");
            e.printStackTrace();
        }
    }
    public void deleteById(int id){
        String query = "delete from game where id=?";
        try {
            Connection connection = DriverManager.getConnection(URL, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            System.out.println("Pavyko istrinti esama irasa");
        } catch (SQLException e) {
            System.out.println("Ivyko klaida istrinant esama irasa");
            e.printStackTrace();
        }
    }
}
