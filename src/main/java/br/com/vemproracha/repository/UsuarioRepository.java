package br.com.vemproracha.repository;

import br.com.vemproracha.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //essa parte eh responsavel pelo comando SQL aqui ela faz o select from usuario where email
    Optional<Usuario> findByEmail(String email);


    // Consulta no banco de dados se existe alguma linha com o mesmo email
    boolean existsByEmail(String email);
}
