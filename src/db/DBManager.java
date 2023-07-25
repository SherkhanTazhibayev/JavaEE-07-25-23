package db;

import models.Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Connection connection;

    static {
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "root"
            );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Item> getItems(){
        List<Item> items = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from items");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item();
//                item.getId(resultSet.getLong("id"));
//                item.getName(resultSet.getString());
//                item.getDescription(resultSet.getString());
//                item.getPrice(resultSet.getInt());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }

}
