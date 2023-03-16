package org.example;

public class DbConfig {

  private static final String NAME = "root";
  private static final String PASSWORD = "1402200Ii.";
  private static final String URL = "jdbc:mysql://localhost:3306/JKU";
  private Connection connection;

  // singleton Паттерн
  public Connection getConnection() {
    return connection;
  }

  public void mySQL() {
    try {
      Driver driver = new FabricMySQLDriver();
      DriverManager.registerDriver(driver);

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void connect() throws SQLException {
    try {
      connection = DriverManager.getConnection(URL, NAME, PASSWORD);
      if (!connection.isClosed()){
        System.out.println("Подключено");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  // not connection
}
