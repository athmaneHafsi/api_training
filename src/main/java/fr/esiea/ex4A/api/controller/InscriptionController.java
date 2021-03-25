package fr.esiea.ex4A.api.controller;

import fr.esiea.ex4A.api.model.UserData;
import fr.esiea.ex4A.api.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        //Etant donnée que user provient d'une entrée du client on fait toutes les
        //verifications necessaires avant de sauvegarder les informations.
        if ( !userRepository.userExist(user) ) {
            userRepository.addUser(user);
            return ResponseEntity.ok("Utilisateur ajoute avec succes");
        }
        return ResponseEntity.ok("Utilisateur deja existant");
    }
}
