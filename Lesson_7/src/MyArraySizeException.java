public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "The array size must be 4x4";
    }
}