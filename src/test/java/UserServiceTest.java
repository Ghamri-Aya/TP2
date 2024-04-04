import org.example.Utilisateur;
import org.example.UserService;
import org.example.ServiceException;
import org.example.UtilisateurApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import org.mockito.*;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Captor
    private ArgumentCaptor<Utilisateur> utilisateurCaptor;

    @InjectMocks
    private UserService userService;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        /* 1ére partie

        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Ghamri", "Aya", "GhamriAya@email.com");

        // Configuration du comportement du mock
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'appel à l'API
        verify(utilisateurApiMock, times(1)).creerUtilisateur(utilisateur);

*/



/* 2éme partie
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur2 = new Utilisateur("Ghamri", "Amine", "GhamriAmine@email.com");

        // Simulation d'une exception de validation
        doThrow(new ServiceException("Echec de la création de l'utilisateur")).when(utilisateurApiMock).creerUtilisateur(utilisateur2);

        // Vérification que la méthode de l'API utilisateur n'a pas été appelée
        verify(utilisateurApiMock, never()).creerUtilisateur(utilisateur2);

*/






        // Création d'un nouvel utilisateur
        Utilisateur utilisateur3 = new Utilisateur("Ghamri", "Badis", "GhamriBadis@email.com");

        // Simulation de la création réussie de l'utilisateur avec un identifiant unique
        //when(utilisateurApiMock.creerUtilisateur(utilisateur3)).thenReturn(true);

        // Définition d'un ID fictif
        int idUtilisateur = 123;

        // Création d'un mock pour l'utilisateur
        Utilisateur utilisateurMock = mock(Utilisateur.class);

        // Configuration du comportement du mock pour la méthode getId()
        when(utilisateurMock.getId()).thenReturn(idUtilisateur);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur3);

        // Vérification de l'ID de l'utilisateur sur le mock
        verify(utilisateurMock, times(1)).setId(anyInt());







/* 4éme partie
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Ghamri", "Aya", "GhamriAya@email.com");

        // Configuration du comportement du mock
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'appel à l'API avec les bons arguments
        verify(utilisateurApiMock, times(1)).creerUtilisateur(utilisateurCaptor.capture());
        Utilisateur utilisateurCaptured = utilisateurCaptor.getValue();
        assertEquals("Ghamri", utilisateurCaptured.getNom());
        assertEquals("Aya", utilisateurCaptured.getPrenom());
        assertEquals("GhamriAya@email.com", utilisateurCaptured.getEmail());

 */
    }
}
