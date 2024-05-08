package co.scastillos.ucentral.quiz.servicios;

import co.scastillos.ucentral.quiz.entidades.ElementoTecnologico;
import co.scastillos.ucentral.quiz.operaciones.OperacionesTecnologia;
import co.scastillos.ucentral.quiz.repositorios.RepoTecnologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioTecnologia implements OperacionesTecnologia {

    @Autowired
    RepoTecnologia repoTecnologia;

    @Override
    public void crear(ElementoTecnologico tecnologia) {
       repoTecnologia.save(tecnologia);
    }

    @Override
    public List<ElementoTecnologico> listarTecnologias() {
        return repoTecnologia.findAll();
    }
}
