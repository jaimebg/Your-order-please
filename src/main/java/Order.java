import static java.lang.Character.isDigit;

class Order {
    static String order(String words) {
        if (words.isEmpty()) return "";
        String[] wordsSplit = words.split(" ");
        String[] wordsSplitOrdered = new String[wordsSplit.length];

        for (String s : wordsSplit) {
            wordsSplitOrdered[getNumber(s) - 1] = s + " ";
        }

        return toProperString(wordsSplitOrdered);
    }

    private static String toProperString(String[] wordsSplitOrdered) {
        StringBuilder res = new StringBuilder();
        for (String s :
                wordsSplitOrdered) {
            res.append(s);
        }
        return res.substring(0, res.length()-1);
    }

    private static int getNumber(String args) {
        char[] chars = args.toCharArray();
        for (char c : chars) {
            if (isDigit(c)) return Character.getNumericValue(c);
        }
        return 0;
    }
}
