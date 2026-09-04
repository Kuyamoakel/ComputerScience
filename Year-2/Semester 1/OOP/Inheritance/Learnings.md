# Learnings and Realizations - `9/4/2026`

1. The concept `Encapsulation` is more than making instance variable `private` it is also by adding invariants to the `constructor`, `getters`, and `setters`. i realized that if you have private fields but still your `private double balance` can still be `-100` that is a hole.

2. Your `private field variables` are useless if the main class is nested to your class not a seperate `top-level class`. the `Main` should be its own top-level class in its own file

3. `return` in constructor does not prevent the creation of the object. instead use `throw new IllegalArugmentException` by using these it will stop the creation of the object.