class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String[] sArr = String.valueOf(num).split("");
        
        for(int i = 0; i < sArr.length; i++) {
            if(Integer.parseInt(sArr[i]) == k) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}