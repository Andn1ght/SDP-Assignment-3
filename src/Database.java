/**
 * Database represents the target interface for connecting to and querying a database.
 * Implementing classes should provide database-specific implementations of these methods.
 */
public interface Database {

    /**
     * Connect to the database.
     */
    void connect();

    /**
     * Execute a query on the database.
     *
     * @param query The SQL query to execute.
     */
    void query(String query);
}
