public class NameComparator {
    public static int compare(String name1, String name2) {
        int minLength = Math.min(name1.length(), name2.length());

        for (int k = 0; k < minLength; k++) {
            char char1 = name1.charAt(k);
            char char2 = name2.charAt(k);

            if (char1 != char2) {
                return (char1 - char2);
            }
        }

        return name1.length() - name2.length();
    }

}
