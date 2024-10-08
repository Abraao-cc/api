package br.ind.cmil.api.service;

import br.ind.cmil.api.persistence.model.User;
import br.ind.cmil.api.dto.RegisterUserDTO;
import br.ind.cmil.api.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Administrativo
 */
public interface UserService {

    ResponseDTO save(RegisterUserDTO dto);

    public static boolean isPasswordCorret(String newPassword, String oldPassword) {
        return new BCryptPasswordEncoder().matches(newPassword, oldPassword);
    }

    void editPassword(User user, String password1);

    // void resetPassword(String email) throws MessagingException;
    void activate(String code);

    ResponseDTO findByEmail(String login);

    boolean checkCode(String verificationCode);

}
