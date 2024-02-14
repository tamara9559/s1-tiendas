import DTO.ToysDTO;
import model.Toys;

public class mappers {
    public static Toys mapFrom(ToysDTO dto){
        return new Toys(dto.name(),dto., dto.type());
    }
    public static ToysDTO mapFrom(Toys toy){
        return new ToysDTO(toy.getAmount(),toy.getType(),toy.getPrice());
    }
}
