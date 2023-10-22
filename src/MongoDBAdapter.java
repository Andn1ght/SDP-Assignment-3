public class MongoDBAdapter implements Database{
    private MongoDBDatabase mongodb;

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
