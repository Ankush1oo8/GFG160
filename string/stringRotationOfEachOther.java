public class stringRotationOfEachOther {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        // Your code here
        s1 = s1 + s1;
        return s1.lastIndexOf(s2) >= 0;
    }
}
