package labair_api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "scarpe")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private int prezzo;

    @Column(name = "taglie_disponibili")
    private int[] taglieDisponibili; // Modificare
    private List<String> coloriDisponibili; // Modificare
    private String descrizione;
    private String immagine;
}
