import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr.length==0 || k==0 || k>arr.length) return null;
        ArrayList<Integer> numbersNeed = new ArrayList<Integer>();
        int nRight=0;
        while (nRight< arr.length && arr[nRight]<x){ nRight++; };
        int nLeft=nRight-1;
        int cnt=0;
        while (cnt<k){
            if (nLeft<0){
                for (int i = cnt; i < k; i++) {
                    numbersNeed.add(arr[i]);
                }
                Collections.sort(numbersNeed);
                return numbersNeed;
            }
            if (nRight>=arr.length){
                for (int i = nLeft; i > nLeft-(k-cnt); i--) {
                    numbersNeed.add(arr[i]);
                }
                Collections.sort(numbersNeed);
                return numbersNeed;
            }
            if (Math.abs(arr[nLeft]-x)<=Math.abs(arr[nRight]-x)){
                numbersNeed.add(arr[nLeft--]);
            } else{
                numbersNeed.add(arr[nRight++]);
            }
            cnt++;
        }
        Collections.sort(numbersNeed);
        return numbersNeed;

    }
}