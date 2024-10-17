public class UserRepository {
    private MySQL mySQL;

    public UserRepository(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    public void insertUser (User user) {
        // Lógica para insertar el usuario en la base de datos
        mySQL.insert("INSERT INTO users (nickname, password) VALUES ('" + user.getNickname() + "', '" + user.getPassword() + "')");
    }
    
    // Otros métodos para manejar usuarios
}
