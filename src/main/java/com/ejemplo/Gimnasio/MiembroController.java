package com.ejemplo.Gimnasio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/miembros")
public class MiembroController {

    @GetMapping
    public List<Miembro> listarMiembros() {
        return List.of(
            new Miembro("Juan", 24),
            new MiembroPremium("Jessica", 28, "Pedro"),
            new MiembroEstudiante("Nathalia", 30, "Universidad Nacional")
        );
    }

    @GetMapping("/premium")
    public MiembroPremium miembroPremium() {
        return new MiembroPremium("Jessica", 28, "Juan");
    }

    @GetMapping("/estudiante")
    public MiembroEstudiante miembroEstudiante() {
        return new MiembroEstudiante(
            "Diego", 24, "Universidad Pedagogica"
        );
    }
}
