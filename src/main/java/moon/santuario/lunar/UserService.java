package moon.santuario.lunar;

public class UserService
{
   final private UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public String buscaUsuario(int id)
    {
        User user = userRepository.findbyId(1);
        return user.getNome();
    }
}
