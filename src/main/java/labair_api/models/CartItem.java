package labair_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_carrello")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int quantita;
  private int taglia;

  @ManyToOne()
  @JoinColumn(name = "scarpa_id")
  private Shoe scarpa;

  @ManyToOne()
  @JoinColumn(name = "utente_id")
  private User utente;
}
