class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

******************************************************

class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n:nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int x=0,y=0,z=0;
        if (map.containsKey(0)) x=map.get(0);
        if (map.containsKey(1)) y=map.get(1);
        if (map.containsKey(2)) z=map.get(2);
        for (int i=0;i<nums.length;i++) {
            if (x>0 && i<map.get(0)) nums[i]=0;
            else if (y>0 && i<x+y) nums[i]=1;
            else if (z>0) nums[i]=2;
        }
    }
}

*****************************************************

class Solution {
    public void sortColors(int[] nums) {
        int[] help=new int[3];
        for (int n:nums) {
            help[n]++;
        }
        for (int i=0;i<nums.length;i++) {
            if (i<help[0]) nums[i]=0;
            else if (i<help[0]+help[1]) nums[i]=1;
            else if (help[2]>0) nums[i]=2;
        }
    }
}
