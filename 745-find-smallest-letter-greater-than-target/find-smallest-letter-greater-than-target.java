class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int target_ascii=(int)target;
        for(int i=0;i<letters.length;i++){

            int letter_ascii=(int)letters[i];
            if(letter_ascii>target_ascii){
                return (char)letter_ascii;
            }

        }
        return letters[0];
    }
}