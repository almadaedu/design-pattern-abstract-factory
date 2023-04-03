public class Strogonoff implements Food{
    @Override
    public String cookFood() {
        return "The food is cooked and ready to eat";
    }

    @Override
    public String eatFood() {
        return "the food was eaten";
    }

    @Override
    public String recipeFood() {
        return "Strogonoff can be made with chicken or meat";
    }
}
