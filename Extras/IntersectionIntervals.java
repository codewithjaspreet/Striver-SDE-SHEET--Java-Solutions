class IntersectionIntervals {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> ans = new ArrayList<>();

        if (secondList.length == 0 || firstList.length == 0) {

            return ans.toArray(new int[ans.size()][]);
        }

        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {

            int csp = Math.max(firstList[i][0], secondList[j][0]);
            int ep = Math.min(firstList[i][1], secondList[j][1]);

            if (csp <= ep) {
                int[] a = new int[2];
                a[0] = csp;
                a[1] = ep;
                ans.add(a);

            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }

}
