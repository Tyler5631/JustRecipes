package com.example.JustRecipes.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(ProfileController.URI)
public class ProfileController {
    public static final String URI = "/api/profiles";

    @Autowired
    ProfileRepository profileRepository;

    @PostMapping
    public @ResponseBody
    Profile create(@Valid @RequestBody ProfileJSON profileJSON) {
        Profile profile = new Profile(
                profileJSON.getUsername(),
                profileJSON.getPassword()
        );
        return this.profileRepository.save(profile);
    }

    @GetMapping
    public @ResponseBody
    Iterable<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }
}
