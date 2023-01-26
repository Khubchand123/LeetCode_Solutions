class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(!queue.contains(s.charAt(i))){
                queue.add(s.charAt(i));
                    if(queue.size()>max){
                        max=queue.size();
                    }
                
            }
            else{
                while(queue.peek()!=s.charAt(i)){
                    queue.poll();
                }
                queue.poll();
            queue.add(s.charAt(i));
            }
        }
        return max;
    }
}