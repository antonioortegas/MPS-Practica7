package org.mps.authentication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@Tag("Fase1")
public class IntegracionFaseUnoTest {
    /*Solo está disponible la implementación de la clase UserRegistration.*/

    @Test
    public void test() {
        assertTrue(true);
    }

    @Test
    public void constructorTest() {
        CredentialValidator validator = Mockito.mock(CredentialValidator.class);
        CredentialStore store = Mockito.mock(CredentialStore.class);

        UserRegistration userRegistration = new UserRegistration(validator, store);

        assertNotNull(userRegistration);
    }

    @Test
    public void registerTest() {
        CredentialValidator validator = Mockito.mock(CredentialValidator.class);
        CredentialStore store = Mockito.mock(CredentialStore.class);

        UserRegistration userRegistration = new UserRegistration(validator, store);

        Email email = Mockito.mock(Email.class);
        PasswordString passwordString = Mockito.mock(PasswordString.class);


    }
}
