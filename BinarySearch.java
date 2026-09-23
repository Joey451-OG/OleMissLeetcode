public class BinarySearch {
    public static void main(String[] args){
	System.out.println(bs());
    }
    public static boolean bs() {
	int[] a = {1, 2, 3, 4, 5, 6};
	int r = a.length - 1;
	int l = 0;

	int target = 8;

	while (l <= r) {
	    int mid = (r + l) / 2;

	    if (a[mid] == target)
		return true;
	    if (a[mid] < target) 
		l = mid + 1;
	    if (a[mid] > target)
		r = mid - 1;
	}

	return false;	
    }
}
