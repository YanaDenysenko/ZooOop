Problems of the previous model:
1. Animals cannot be animals and food at the same time.
2. Animals cannot eat other animals.


Alternative model(Model.jpg is a visual representation of the model):
1. Created the main abstract class "Food", 
   from which classes "Animal" and "Plant" inherit 
   -> In this way, both animals and plants can be food.

2. Classes Lion, Goat and Cow extend Animal class. 
   Class Grass extends Plant class.

3. "Animal" class contains void eat(Food food) method   
   -> so, animals can eat plants and others animals.

4. Method "eat" has condition, that check if class of "this" animal equals class of the food. 
   If animal eat other animal which has the same type - we have message that it's impossible. 
   Otherwise, we have message that animal eat something food.