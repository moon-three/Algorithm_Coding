class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] sArr = rsp.split("");
        
        for(int i = 0; i < sArr.length; i++) {
            String data = sArr[i];
            
            switch (data) {
                case "0": 
                    answer += "5";
                    break;
                case "2":
                    answer += "0";
                    break;
                case "5":
                    answer += "2";
                    break;
            }            
        }        
        return answer;
    }
}