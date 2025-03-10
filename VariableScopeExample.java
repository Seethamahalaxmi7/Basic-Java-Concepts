public class VariableScopeExample {
    // Global (Instance) variable
    int number = 100;  

    public void display() {
        // Local variable with the same name as the global variable
        int number = 50;  

        // Printing the local variable (shadows the global variable inside this method)
        System.out.println("Local variable value: " + number);

        // Printing the global variable using 'this' keyword
        System.out.println("Global variable value: " + this.number);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables and methods
        VariableScopeExample obj = new VariableScopeExample();
        
        // Calling the display method
        obj.display();
    }
}