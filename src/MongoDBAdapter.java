/**
 * MongoDBAdapter is an Adapter that adapts the DatabaseAdapter interface to work with MongoDBDatabase.
 * It provides specific implementations for connecting to MongoDB and executing MongoDB queries.
 */
public class MongoDBAdapter implements Database{
    private MongoDBDatabase mongodb;

    /**
     * Constructs a MongoDBAdapter with the specified MongoDBDatabase.
     *
     * @param mongodb The MongoDB database to be adapted.
     */
    public MongoDBAdapter(MongoDBDatabase mongodb) {
        this.mongodb = mongodb;
    }

    @Override
    public void connect() {
        mongodb.connectMongoDB();
    }

    @Override
    public void query(String query) {
        mongodb.queryMongoDB(query);
    }
}
