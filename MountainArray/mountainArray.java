class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        else {
            int temp = arr[0];
            int longestIndex = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                if (temp < arr[i]) {
                    temp = arr[i];
                    longestIndex = i;
                }
                if (longestIndex == 0 || longestIndex == arr.length - 1)
                    return false;
            }
            for (int i = 1; i <= longestIndex; i++) {
                if (arr[i - 1] >= arr[i])
                    return false;
            }
            for (int i = longestIndex; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1])
                    return false;
            }


        }
        return true;
    }
}