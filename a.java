static void sort(int []A){
	n = A.length;
	boolean swapped = false;
	while(!swapped)
	{
		for(int i = 1; i < n-1; i++)
		{
			if(A[i-1] > A[i])
			{
				int temp = A[i-1];
				A[i-1] = A[i];
				A[i] = temp;
				swapped = true;
			}
		}
	}
			
}