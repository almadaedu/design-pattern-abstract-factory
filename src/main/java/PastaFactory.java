public class PastaFactory implements AbstractFoodFactory {
    @Override
    public Food createFood() {
        return new Pasta();
    }
}
