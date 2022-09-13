import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
     List<Block> blocks = new ArrayList<>();

    //Założyłem że powinienem zwrócić Optional jednej cegły
    @Override
    public Optional findBlockByColor(String color) {
        Optional<Block> optionalBlock = blocks.stream().filter(block -> block.getColor().equals(color)).findFirst();
        return optionalBlock;
    }

    @Override
    public List findBlocksByMaterial(String material) {
        List<Block> blockList = blocks.stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
        return blockList;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
