public class ListsConcatenation{
	public static void main(String[] gloria){
		int[] firstList = {'a', 'b', 'c'};
		
		int[] secondList = {1, 2, 3};

		concatenateListsOf(firstList, secondList);
		
	}
	
	public static void concatenateListsOf(int[] firstList, int[] secondList){
		int newListLength = firstList.length + secondList.length;
		int[] newList = new int[newListLength];
		for (int index = 0; index < firstList.length; index++){
			newList[index] = firstList[index];
		System.out.println(newList[index]);
		}
		
	}
}