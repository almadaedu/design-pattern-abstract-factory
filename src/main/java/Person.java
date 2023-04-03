public class Person {
    private Food food;

    public Person(AbstractFoodFactory factory){
        this.food = factory.createFood();
    }


    public String cookFood(){
        return this.food.cookFood();
    }

    public String eatFood(){
        return this.food.eatFood();
    }

    public String recipeFood() {
        return this.food.recipeFood();
    }
}
