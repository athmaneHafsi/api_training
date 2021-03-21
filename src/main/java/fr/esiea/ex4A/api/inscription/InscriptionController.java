package fr.esiea.ex4A.api.inscription;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
class InscriptionController {

    private final UserRepository userRepository;

    InscriptionController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/inscription", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> inscription(@RequestBody UserData user) {
        if (userRepository.userExist(user)) {
            return ResponseEntity.ok("Utilisateur déja existant");
        }
        userRepository.addUser(user);
        return ResponseEntity.ok("Utilisateur ajouté avec succes");
    }
}
