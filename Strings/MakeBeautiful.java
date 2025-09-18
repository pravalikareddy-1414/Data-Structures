public class MakeBeautiful {
    public static int makeBeautiful(String str) {
        int count1 = 0; // flips for pattern 0 1 0 1...
        int count2 = 0; // flips for pattern 1 0 1 0...

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i % 2 == 0) { // even index
                if (c != '0') count1++;
                if (c != '1') count2++;
            } else { // odd index
                if (c != '1') count1++;
                if (c != '0') count2++;
            }
        }
        return Math.min(count1, count2);
    }

    public static void main(String[] args) {
        String str = "0010";
        System.out.println(makeBeautiful(str)); // Output: 1
    }
}