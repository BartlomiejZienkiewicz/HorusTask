import java.util.List;

public class CompositeBlockImpl implements CompositeBlock{

     String color;
     String material;


    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    //nie rozumiem dlaczego metoda getBlock() znalazła się w interfejsie CompositeBlock skoro zwraca List które zwykle
    //przechowuje się w repozytorium
    @Override
    public List getBlocks() {
        return null;
    }
}
