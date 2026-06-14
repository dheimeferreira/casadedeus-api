package com.casadedeus.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // NOVA ROTA BLINDADA: Deleta com verificação de segurança
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMembro(@PathVariable Long id) {
        // Primeiro, o cozinheiro olha se a pessoa realmente existe na despensa
        if (!repository.existsById(id)) {
            // Se não achar, avisa que não encontrou (Erro 404 - Not Found)
            return ResponseEntity.notFound().build();
        }

        // Se achar, ele apaga de verdade e avisa que deu tudo certo (Sucesso 204 - No Content)
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}