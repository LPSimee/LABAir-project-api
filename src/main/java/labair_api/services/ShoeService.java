package labair_api.services;

import labair_api.repositories.ShoeRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoeService {
    private final ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) { this.shoeRepository = shoeRepository;}
}
