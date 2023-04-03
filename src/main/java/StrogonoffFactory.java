public class StrogonoffFactory implements AbstractFoodFactory{
    @Override
    public Food createFood() {
        return new Strogonoff();
    }
}
