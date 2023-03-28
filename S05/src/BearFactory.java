public class BearFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bear();
    }
}
