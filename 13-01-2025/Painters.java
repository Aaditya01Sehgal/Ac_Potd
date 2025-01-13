class Painters {
    public int minTime(int[] arr, int k) {
        // code here
        int start = max(arr);
        int end = sum(arr);
        
        while ( start <= end){
            int mid = start + (end - start)/2;
            
            if (canPaint(arr,k,mid)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
        
    }
    static int max(int[] arr){
        int maxi = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    static int sum (int[] arr){
        int sum = 0;
        for (int i =0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    private boolean canPaint(int[] arr, int k, int maxTime) { 
        int painters = 1;
        int time = 0;
        for (int num : arr) {
            if (time + num > maxTime) {
                painters++;
                time = num;
                if (painters > k) {
                    return false;
                    }
              } 
        else {
        time += num; 
        } 
      } return true; 
    }
}
