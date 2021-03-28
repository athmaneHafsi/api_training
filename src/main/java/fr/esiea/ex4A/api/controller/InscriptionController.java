package fr.esiea.ex4A.api.controller;

import fr.esiea.ex4A.api.model.UserData;
import fr.esiea.ex4A.api.repository.UserRepository;
import fr.esiea.ex4A.api.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
class InscriptionController {

    private final UserRepository userRepository;
    private final MatchService matchService;

    InscriptionController(UserRepository userRepository, MatchService matchService) {
        this.userRepository = userRepository;
        this.matchService = matchService;
    }

    @PostMapping(path = "/inscription", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> inscription(@RequestBody UserData user) throws IOException {
        //Etant donnée que user provient d'une entrée du client on fait toutes les
        //verifications necessaires avant de sauvegarder les informations.
        UserData currentUser = matchService.getUserAge(user);
        if (!userRepository.userExist(currentUser)) {
            userRepository.addUser(currentUser);
            return ResponseEntity.ok(currentUser);
        }
        return ResponseEntity.ok("Utilisateur deja existant");
    }
}
