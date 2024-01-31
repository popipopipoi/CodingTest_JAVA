class Solution {
    public int[] solution(int[] num_list) {
        
        int last = num_list[num_list.length - 1];
        int befor = num_list[num_list.length - 2];
        
        int result = last > befor ? last - befor : last * 2;
        
       
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0 , answer, 0, num_list.length);
        answer[num_list.length] = result;   
        
        return answer;
    
    }
}