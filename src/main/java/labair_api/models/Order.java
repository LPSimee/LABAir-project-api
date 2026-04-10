package labair_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "ordini")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataOrdine;
    // private PaymentData pagamento;
    // private CartItem[] prodotti; mettere la relazione
    private Double totale;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private User utente;


    // Mettere la relazione con CartItem
}
