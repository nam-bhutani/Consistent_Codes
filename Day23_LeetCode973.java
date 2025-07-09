class Solution {
    public class Pointer implements Comparable<Pointer> {
        int idx;
        double dist;
        Pointer(int idx, double dist) {
            this.idx = idx;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pointer p2) {
            return Double.compare(this.dist, p2.dist);
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pointer> pq = new PriorityQueue<>();

        for (int i = 0; i < points.length; i++) {
            double dist = Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2);
            pq.add(new Pointer(i, dist));
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = points[pq.remove().idx];
        }
        return res;
    }
}
