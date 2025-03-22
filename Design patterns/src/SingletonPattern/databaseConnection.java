package SingletonPattern;

class databaseConnection {

    private static databaseConnection instance;

    private databaseConnection(){}

    public static databaseConnection getInstance(){
        if(instance == null){
            instance = new databaseConnection();
        }
        return instance;
    }

    public void connect(String message){
        System.out.println("Your "+message +" db is connected");
    }

}
class Main {
    public static void main(String[] args) {
        databaseConnection database1 = databaseConnection.getInstance();
        database1.connect("database1");

        databaseConnection database2 = databaseConnection.getInstance();
        database1.connect("database2");

        System.out.println(database1==database2);
    }
}