public class LogIn {
    private UserRepository userRepository;

    public LogIn(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void log(User user) {
        System.out.println("Has access to the website");
        userRepository.insertUser (user);
        // Otras lógicas de inicio de sesión
    }
}

