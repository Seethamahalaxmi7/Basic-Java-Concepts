// This is a single-line comment in Java.

/*
 This is a multi-line comment.
 It is used to explain code in more detail.
 It spans multiple lines.
 */

/**
 * This is a documentation comment (docstring).
 * It is used to describe the purpose of a class, method, or variable.
 * It can be used to generate documentation using Javadoc.
 */
public class CommentExample {
    
    /**
     * This method adds two numbers and returns the sum.
     * @param a The first number
     * @param b The second number
     * @return The sum of a and b
     */
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the addNumbers method
        int result = addNumbers(5, 3);
        System.out.println("Sum: " + result);
    }
}