public class Main {

    private static void useDatabase(Database adapter) {
        adapter.connect();
        adapter.query("SELECT * FROM users");
    }

    public static void main(String[] args) {
        Database mysqlAdapter = new MySQLAdapter(new MySQLDatabase());
        Database mongodbAdapter = new MongoDBAdapter(new MongoDBDatabase());

        useDatabase(mysqlAdapter);
        useDatabase(mongodbAdapter);
    }
}