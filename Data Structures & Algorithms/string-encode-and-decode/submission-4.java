class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);   // e.g. "3#ab1"
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);                      // end of the length
            int len = Integer.parseInt(str.substring(i, j));  // works for 1, 12, 300...
            decoded.add(str.substring(j + 1, j + 1 + len));   // the string itself
            i = j + 1 + len;                                  // jump to the next length
        }
        return decoded;
    }
}