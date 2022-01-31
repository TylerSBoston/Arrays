import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//test cases in main
		int[] testArray = new int[] {5,4,5,9, 22, 10, 10 ,10, 4, 3};
		int[][] firstArray = new int[][] {{4,5,6},{5,10,2}};
		int[][] secondArray = new int[][] {{9,1},{0,3},{0,2}};
		int[][] firstAddingArray = new int[][] {{4,5,6},{5,10,2},{1,2,3}};
		int[][] secondAddingArray = new int[][] {{9,1,3},{0,3,1},{0,2,2}};
		
		int[][] irrigularArray = new int[][] {{1,2},{3,5,2,4},{1},{9,90,9,9,9,9}};
		
		printDuplicateArrayValues(testArray);
		
		int[][] addedArray = matrixAddition(firstAddingArray,secondAddingArray);
		System.out.println(Arrays.deepToString(addedArray));
		int[][] mutlipliedArray = matrixMultiplication(firstArray,secondArray);
		System.out.println(Arrays.deepToString(mutlipliedArray));
		System.out.println(Arrays.deepToString(irrigularArray));
		
	}
	
	
	public static void printDuplicateArrayValues(int[] inputArray)
	{
		HashMap<Integer, Integer> repeatCounter = new HashMap<Integer, Integer>();	
		for(int i = 0; i<inputArray.length; i++)
		{
			if(repeatCounter.get(inputArray[i]) == null)
			{
				repeatCounter.put(inputArray[i],1);
			}
			else
			{
				repeatCounter.put(inputArray[i],1 + repeatCounter.get(inputArray[i]));
			}
		}
		for(Map.Entry<Integer,Integer> set : repeatCounter.entrySet())
		{
			System.out.println(set.getKey() + " appears " + set.getValue() + " times");
		}	
	}
	
	public static int[][] matrixAddition(int[][]  firstArray, int[][] secondArray)
	{
		
		
		if(firstArray.length == secondArray.length && firstArray[0].length == secondArray[0].length)
		{
			int[][] returnArray = new int[firstArray.length][firstArray[0].length];
			for(int i = 0; i<firstArray.length; i++)
			{
				for(int j = -0; j<firstArray[0].length;j++)
				{
					returnArray[i][j] = firstArray[i][j] + secondArray[i][j];
				}
			}
			
			return returnArray;
		}
		else
		{
			System.out.println("arrays are different sizes");
			return null;
		}
	}
	
	public static int[][] matrixMultiplication(int[][]  firstArray, int[][] secondArray)
	{
		if(firstArray.length == secondArray[0].length && firstArray[0].length == secondArray.length)
		{
			int[][] returnArray = new int[secondArray[0].length][firstArray.length];
			
			for(int i = 0; i<firstArray.length; i++)
			{
				for(int j = 0; j<secondArray[0].length; j++)
				{
					for(int k = 0; k<firstArray[0].length; k++)
					{
						returnArray[i][j] += (firstArray[i][k] * secondArray[k][j]);
					}
				}
			}
			return returnArray;
		}
		else
		{
			System.out.println("incompatable arrays");
			return null;
		}
	}
	
	
}
