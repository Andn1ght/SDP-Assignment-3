public class MySQLAdapter implements Database{
    private MySQLDatabase mysql;

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
