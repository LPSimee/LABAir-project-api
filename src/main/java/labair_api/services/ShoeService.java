package labair_api.services;

import labair_api.models.Shoe;
import labair_api.repositories.ShoeRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeService {
    private final ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) { this.shoeRepository = shoeRepository; }

    public List<Shoe> getAllShoes() {
        return shoeRepository.findAll();
    }

    public Shoe getShoeById(Long id){
        return shoeRepository.findById(id).orElse(null); // Mettere Exception
    }

    public Shoe saveNewShoe(Shoe shoe) {
        return shoeRepository.save(shoe);
    }

    public void deleteShoeById(Long id){
        shoeRepository.deleteById(id);
    }

    public List<Shoe> getShoeByFilters(String category, String sortBy) {
        Sort sortedShoes = Sort.unsorted();

        if(!sortBy.isEmpty()){
            sortedShoes = switch (sortBy) {
                case "newest" -> Sort.by("nuoviArrivi").descending();
                case "priceAsc" -> Sort.by("prezzo").ascending();
                case "priceDesc" -> Sort.by("prezzo").descending();
                default -> Sort.unsorted();
            };
        }

        return category.isEmpty() ? shoeRepository.findAll(sortedShoes) : shoeRepository.getShoesByCategoria(category, sortedShoes);
    }

    public Shoe findShoeByNome(String nome) {
        return shoeRepository.getShoeByNome(nome);
    }
}
