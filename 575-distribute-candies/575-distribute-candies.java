class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        int n=candyType.length/2;
        int size=set.size();
        return n>size?size:n;
    }
}