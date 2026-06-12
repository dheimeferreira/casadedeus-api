package com.casadedeus.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/membros")
@CrossOrigin(origins = "*") // Importante: Permite que o Vercel fale com o Render!
public class MembroController {

    @Autowired
    private MembroRepository repository;

    @GetMapping
    public List<Membro> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Membro salvar(@RequestBody Membro membro) {
        return repository.save(membro);
    }
}