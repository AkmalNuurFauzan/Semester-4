/**
 *
 * @author Akmal N.F
 */
class Propagate {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a string")); // Calls reverse method
        } catch (Exception e) {
            System.out.println("The String was blank");
        } finally {
            System.out.println("All done");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s.length() == 0) { // Check if string is empty
            throw new Exception(); // Throws an exception if string is empty
        }
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i); // Reverses the string
        }
        return reverseStr; // Returns the reversed string
    }
}

