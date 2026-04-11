package labair_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dettagli_ordine")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "prezzo_unitario")
  private Double prezzoUnitario;
  private Integer quantita;
  private String taglia;
  private String colore;

  @ManyToOne
  @JoinColumn(name = "ordine_id")
  private Order ordine;

  @ManyToOne
  @JoinColumn(name = "scarpa_id")
  private Shoe scarpa;
}
