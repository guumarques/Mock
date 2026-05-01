import moon.santuario.lunar.User;
import moon.santuario.lunar.UserRepository;
import moon.santuario.lunar.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserTest
{
    @Mock
    private UserRepository repository; //dependência

    @InjectMocks
    private UserService service; //coisa a ser testada

    @Test
    public void retornaUsuario()
    {
        //arrange - define o comportamento do mock(pensando no retorno da funcionalidade)
        when(repository.findbyId(1)).thenReturn(new User("Gustavo"));

        //act
        String servico = service.buscaUsuario(1);

        //assert
        assertEquals("Gustavo", servico);
    }
}
