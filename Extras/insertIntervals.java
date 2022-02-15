class insertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> list = new ArrayList<>();

        int idx = 0;
        while (idx < intervals.length) {

            if (intervals[idx][0] < newInterval[0]) {
                list.add(intervals[idx]);
                idx++;
            } else {
                break;
            }

        }

        if (list.size() == 0 || (newInterval[0] > list.get(list.size() - 1)[1])) {
            list.add(newInterval);
        } else {

            int[] prevInterval = list.get(list.size() - 1);

            prevInterval[1] = Math.max(newInterval[1], prevInterval[1]);

        }

        while (idx < intervals.length) {

            int[] prevInterval = list.get(list.size() - 1);
            if (prevInterval[1] >= intervals[idx][0]) {
                prevInterval[1] = Math.max(prevInterval[1], intervals[idx][1]);
                idx++;
            } else {
                list.add(intervals[idx]);
            }

        }

        return list.toArray(new int[list.size()][]);
    }
}
