/**
 * MySQLDatabase is an Adaptee representing a MySQL database. It contains methods to connect to
 * MySQL and execute MySQL queries.
 */
public class MySQLDatabase {

    /**
     * Connect to the MySQL database.
     */
    public void connectMySQL() {
        System.out.println("Connecting to MySQL Database...");
    }

    /**
     * Execute a MySQL query.
     *
     * @param query The MySQL query to execute.
     */
    public void queryMySQL(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
