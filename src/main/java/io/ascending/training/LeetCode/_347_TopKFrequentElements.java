package io.ascending.training.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class _347_TopKFrequentElements {
    public List<Integer> topKFrequent2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer>[] bucket = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        List<Integer> res = new ArrayList<>();

        int i = bucket.length - 1;
        int cnt = 0;

        while (cnt < k) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
                cnt += bucket[i].size();
            }

            i--;
        }

        return res;
    }

    public static void main(String[] args) {
//        _347_TopKFrequentElements method = new _347_TopKFrequentElements();
//
//        method.topKFrequent2(new int[]{-1, -1}, 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (a - b));
        pq.offer(4);
        pq.offer(3);
        pq.offer(5);
        pq.offer(8);
        pq.offer(7);
        pq.offer(9);
        System.out.println(pq);
    }
}
