package co.scastillos.ucentral.quiz.operaciones;

import co.scastillos.ucentral.quiz.entidades.ElementoTecnologico;

import java.util.List;

public interface OperacionesTecnologia {

    void crear(ElementoTecnologico tecnologia);

    List<ElementoTecnologico>  listarTecnologias();
}
