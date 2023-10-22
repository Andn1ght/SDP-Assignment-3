public interface Database {
    void connect();

    void query(String query);
}
