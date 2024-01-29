class SqaureSortArray {
    public int[] sortedSquares(int[] A) {
        List<Integer> squareList = new ArrayList<Integer>();
        for (int num : A) {
            squareList.add(num * num);
        }
        Collections.sort(squareList);
        int[] res = new int[squareList.size()];
        for (int i = 0; i < squareList.size(); i++) {
            res[i] = squareList.get(i).intValue();
        }

        return res;
    }
}