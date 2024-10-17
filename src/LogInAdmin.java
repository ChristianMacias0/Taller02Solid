public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;

    public LogInAdmin(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public void log(User user) {
        this.userIsAdmin = verifyIfTheUser IsAdmin(user);
        if (!userIsAdmin) {
            System.out.println("Access denied: Not an admin");
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Lógica adicional para admins
    }

    private boolean verifyIfTheUser IsAdmin(User user) {
        // Lógica para verificar si el usuario es administrador
        return true; // Suponiendo que todos son administradores para este ejemplo
    }
}

