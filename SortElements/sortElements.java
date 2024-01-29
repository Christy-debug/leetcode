class SortElements {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1], t;
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                t = max;
                max = arr[i];
                arr[i] = t;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}