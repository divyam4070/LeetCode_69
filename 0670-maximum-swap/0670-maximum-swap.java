class Solution {
    public int maximumSwap(int num) {
        // Convert the integer to a character array (digits)
        char[] numChars = Integer.toString(num).toCharArray();

        char maxDigit = '0'; // Initialize the maximum digit found so far
        int maxIndex = -1; // To store the index of the maximum digit
        int swapIndex1 = -1; // To store the index of the digit to be swapped
        int swapIndex2 = -1; // To store the index of the maximum digit

        // Traverse the character array in reverse order
        for (int i = numChars.length - 1; i >= 0; i--) {
            // If we find a digit greater than the current maxDigit
            if (numChars[i] > maxDigit) {
                maxDigit = numChars[i]; // Update maxDigit
                maxIndex = i; // Update the index of the maximum digit
            }

            // If the current digit is less than the maximum digit found
            if (numChars[i] < maxDigit) {
                swapIndex1 = i; // This is the digit to swap
                swapIndex2 = maxIndex; // This is the maximum digit's index
            }
        }

        // If a valid pair of indices was found, perform the swap
        if (swapIndex1 != -1) {
            char temp = numChars[swapIndex1];
            numChars[swapIndex1] = numChars[swapIndex2];
            numChars[swapIndex2] = temp;
        }

        // Convert the character array back to an integer
        return Integer.parseInt(new String(numChars));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 2736;
        int result = solution.maximumSwap(num);
        System.out.println(result); // Output: 7236
    }
}