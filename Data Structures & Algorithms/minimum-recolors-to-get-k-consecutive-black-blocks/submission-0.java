class Solution {
    public int minimumRecolors(String blocks, int k) {
        int recolour=0;
        int j=0;
        int count=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)!='B') recolour++;

            while(i-j+1>k){
                if(blocks.charAt(j)=='W') recolour--;

                j++;
            }
            if(i-j+1==k) count=Math.min(count,recolour);
        }
        return count;
    }
}