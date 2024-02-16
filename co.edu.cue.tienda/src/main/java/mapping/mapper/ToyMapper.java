package mapping.mapper;

import mapping.dtos.ToyDTO;
import model.Toy;

public class ToyMapper {
    public static Toy mapFrom(ToyDTO dto){
        return new Toy(dto.name(),dto.type(), dto.amount(),dto.price());
    }
    public static ToyDTO mapFrom(Toy toy){
        return new ToyDTO(toy.getName(),toy.getType(), toy.getAmount(),toy.getPrice());
    }
}
