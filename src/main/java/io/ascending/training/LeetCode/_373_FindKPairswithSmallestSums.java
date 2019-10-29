package io.ascending.training.LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class _373_FindKPairswithSmallestSums{
//    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        List<int[]> res = new ArrayList<>();
//
//        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
//            return res;
//        }
//
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] + a[1] - b[0] - b[1]));
//
//        for (int i = 0; i < nums1.length && i < k; i++) {
//            pq.offer(new int[]{nums1[i], nums2[0], 0});
//        }
//
//        while (!pq.isEmpty() && k-- > 0) {
//            int[] cur = pq.poll();
//
//            res.add(new int[]{cur[0], cur[1]});
//
//            if (cur[2] == nums2.length - 1) {
//                continue;
//            }
//
//            pq.offer(new int[]{cur[0], nums2[cur[2] + 1], cur[2] + 1});
//        }
//
//        return res;
//    }

    public class Triplet {
        int val1;
        int val2;
        int idx;

        Triplet (int val1, int val2, int idx) {
            this.val1 = val1;
            this.val2 = val2;
            this.idx = idx;
        }
    }


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new LinkedList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return res;
        }

        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>((a, b) -> (a.val1 + a.val2 - b.val1 - b.val2));

        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.offer(new Triplet(nums1[i], nums2[0], 0));
        }

        while (!pq.isEmpty() && k-- > 0) {
            Triplet cur = pq.poll();

            res.add(new LinkedList<Integer>(){{
                add(cur.val1);
                add(cur.val2);
            }});

            if (cur.idx == nums2.length - 1) {
                continue;
            }

            pq.offer(new Triplet(cur.val1, nums2[cur.idx + 1], cur.idx + 1));
        }

        return res;
    }

    public static void main(String[] args) {
        _373_FindKPairswithSmallestSums tmp = new _373_FindKPairswithSmallestSums();
        tmp.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 5);


    }
}
