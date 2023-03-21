public class Pasta implements Food{
    @Override
    public String cookFood() {
        return "Cooked the Pasta";
    }

    @Override
    public String eatFood() {
        return "Eat the pasta";
    }

    @Override
    public String recipeFood() {
        return "Recipe for the pasta";
    }
}
