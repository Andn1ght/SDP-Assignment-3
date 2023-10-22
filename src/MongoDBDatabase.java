/**
 * MongoDBDatabase is an Adaptee representing a MongoDB database. It contains methods to connect to
 * MongoDB and execute MongoDB queries.
 */
public class MongoDBDatabase {

    /**
     * Connect to the MongoDB database.
     */
    public void connectMongoDB() {
        System.out.println("Connecting to MongoDB Database");
    }

    /**
     * Execute a MongoDB query.
     *
     * @param query The MongoDB query to execute.
     */
    public void queryMongoDB(String query) {
        System.out.println("Executing MongoDB query: " + query);
    }
}
