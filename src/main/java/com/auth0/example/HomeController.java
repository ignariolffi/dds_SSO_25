package com.auth0.example;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OidcUser principal) {
        // Si ya está autenticado, redirige a /profile
        if (principal != null) {
            return "redirect:/profile";
        }
        return "index"; // Página principal para usuarios no autenticados
    }

    @GetMapping("/logout")
    public String logout() {
        // Implementa tu lógica de cierre de sesión si es necesario
        return "redirect:/index";
    }
}
