package io.ascending.training.LeetCode;

import java.util.PriorityQueue;

public class _313_SuperUglyNumber {
    public class UglyNum {
        int val;
        int idx;
        int prime;

        UglyNum (int val, int idx, int prime) {
            this.val = val;
            this.idx = idx;
            this.prime = prime;
        }
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<UglyNum> pq = new PriorityQueue<>((a, b) -> (a.val - b.val));
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 0; i < primes.length; i++) {
            pq.offer(new UglyNum(primes[i], 1, primes[i]));
        }

        for (int i = 1; i < n; i++) {
            res[i] = pq.peek().val;

            while (pq.peek().val == res[i]) {
                UglyNum next = pq.poll();
                pq.offer(new UglyNum(next.prime * res[next.idx], next.idx + 1, next.prime));
            }
        }

        return res[n - 1];
    }

    public static void main(String[] args) {
        _313_SuperUglyNumber tmp = new _313_SuperUglyNumber();
        tmp.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19});

    }
}
