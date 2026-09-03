class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        int count = 0;
        for (int i = 0; i<strs.size();i++){
            count = strs.get(i).length();
            encoded_string += count + "#" + strs.get(i);
        }
        System.out.println(encoded_string);
        return encoded_string;
    }   

    public List<String> decode(String str) {
        List<String> decode_strs = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        // Find the '#'
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // Get the length
        int length = Integer.parseInt(str.substring(i, j));

        // Start of the actual string
        int start = j + 1;

        // Extract the string
        String word = str.substring(start, start + length);

        decode_strs.add(word);

        // Move to the next encoded string
        i = start + length;
    }

    return decode_strs;
    }
}
