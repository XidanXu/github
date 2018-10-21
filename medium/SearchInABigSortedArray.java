package leetcode.medium;

public class SearchInABigSortedArray {
//lintcode #447
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int start = 0;
        int end = 2;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(reader.get(mid) >= target){
                end = mid;
            }
            else if(reader.get(mid) < target){
                end = end * 2;
                start = mid;
            }

        }
        if(reader.get(start) == target){
            return start;
        }
        if(reader.get(end) == target){
            return end;
        }
        return -1;
    }
}
