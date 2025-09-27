class FoodRatings {
    // consider the arrs like relations
    Map<String, String> foodToCuisine;
    Map<String, Integer> foodToRating;
    Map<String, TreeSet<String>> cuisineToFoods;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating  = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for(int i=0; i<foods.length; i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToFoods.putIfAbsent(cuisine, new TreeSet<> (
                (a, b) -> {
                    int rtComp = Integer.compare(foodToRating.get(b), foodToRating.get(a));
                    return rtComp==0 ? a.compareTo(b) : rtComp;
                }
            ));

            cuisineToFoods.get(cuisine).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        TreeSet set = cuisineToFoods.get(cuisine);
        
        set.remove(food);

        foodToRating.put(food, newRating);

        set.add(food);
    }
    
    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */