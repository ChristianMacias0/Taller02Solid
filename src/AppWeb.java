public class AppWeb {
    private LogIn logIn;
    private LogInAdmin logInAdmin;
    private Database database;

    public AppWeb(LogIn logIn, Database database) {
        this.logIn = logIn;
        this.database = database;
        connectToDatabase();
    }

    public AppWeb(LogInAdmin logInAdmin, Database database) {
        this.logInAdmin = logInAdmin;
        this.database = database;
        connectToDatabase();
    }

    private void connectToDatabase() {
        // Conexión a la base de datos (si es necesario)
        System.out.println("Connected to the database");
    }
}

