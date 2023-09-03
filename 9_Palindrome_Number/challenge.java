class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        boolean isPal = true;
        String[] intIntoList = String.valueOf(x).split("");
        int j = intIntoList.length -1;
        for (int i = 0; i < intIntoList.length; i++){
            if (!intIntoList[i].equals(intIntoList[j])){
                isPal = false;
            }
        }
        return isPal;
    }
}