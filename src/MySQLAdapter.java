/**
 * MySQLAdapter is an Adapter that adapts the DatabaseAdapter interface to work with MySQLDatabase.
 * It provides specific implementations for connecting to MySQL and executing MySQL queries.
 */
public class MySQLAdapter implements Database{
    private MySQLDatabase mysql;

    /**
     * Constructs a MySQLAdapter with the specified MySQLDatabase.
     *
     * @param mysql The MySQL database to be adapted.
     */
    public MySQLAdapter(MySQLDatabase mysql) {
        this.mysql = mysql;
    }

    @Override
    public void connect() {
        mysql.connectMySQL();
    }

    @Override
    public void query(String query) {
        mysql.queryMySQL(query);
    }
}
