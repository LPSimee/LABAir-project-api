package labair_api.models;

import jakarta.persistence.*;
import lombok.*;

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
  private int[] taglieDisponibili;
  private String descrizione;
  private String immagine;

  // Mettere la relazione con le altre tabelle
}
