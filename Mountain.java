public class Mountain {
	
	public static int getPeakIndex(int[] array){
		if (array.length<3) {
			return -1;
		}
		for (int i=1; i<array.length-1; i++) {
			if (array[i-1]<array[i] && array[i+1]<array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isMountain(int[] array){
		int peak = this.getPeakIndex(array);
		if (peak==-1) {
			return false;
		}
		if (this.isIncreasing(array,peak)&& this.isDecreasing(array,peak)) {
			return true;
		}
		return false;
	}
}