class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
         for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!map2.containsKey(nums1[i])){
                    set1.add(nums1[i]);
            }
        }
        List<Integer> inList = new ArrayList<>(set1);
        list.add(inList);
        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        List<Integer> inList2 = new ArrayList<>(set2);
        list.add(inList2);

        return list;
    }
}