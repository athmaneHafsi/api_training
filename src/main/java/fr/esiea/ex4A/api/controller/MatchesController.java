package fr.esiea.ex4A.api.controller;

import fr.esiea.ex4A.api.repository.MatchesRepository;
import fr.esiea.ex4A.api.service.MatchService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
class MatchesController {

    private final MatchesRepository matchesRepository;
    private final MatchService matchService;

    MatchesController(MatchesRepository matchesRepository, MatchService matchService) {
        this.matchesRepository = matchesRepository;
        this.matchService = matchService;
    }

    @GetMapping(path = "/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> matches(@RequestParam @NonNull String userName, @RequestParam @NonNull String userCountry) {
        //matchService.getMatches(userName, userCountry);
        return ResponseEntity.ok(matchService.getMatches(userName, userCountry));
    }
}
