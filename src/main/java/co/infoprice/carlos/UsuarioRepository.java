package co.infoprice.carlos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM usuario u WHERE u.githubUser = ?1")
    Optional<Usuario> findByGithubUser(String githubUser);
}

