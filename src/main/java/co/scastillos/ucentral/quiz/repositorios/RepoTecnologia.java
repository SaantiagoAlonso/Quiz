package co.scastillos.ucentral.quiz.repositorios;

import co.scastillos.ucentral.quiz.entidades.ElementoTecnologico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoTecnologia extends JpaRepository<ElementoTecnologico,Long> {
}
