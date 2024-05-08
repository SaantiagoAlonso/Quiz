package co.scastillos.ucentral.quiz.entidades;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ElementoTecnologico")
@Getter
@ToString
@Entity
public class ElementoTecnologico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long codigo;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private int numReferencia;

    @Column
    private int precio;

}
