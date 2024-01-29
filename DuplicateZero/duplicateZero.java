class DuplicateZero {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] == 0) {
                count++;
                for (int j = arr.length - 2; j >= n; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[n] = 0;
                n = n + 1;

            }
        }
    }
}