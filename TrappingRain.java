public class TrappingRain {
    public static int TrapRain(int arr[])
    {    int n=arr.length;
    	// left Max array
        
    	int leftMax[]=new int[arr.length];
    	leftMax[0]=arr[0];
    	for(int i=1;i<n;i++)
    	{
    		leftMax[i]=Math.max(arr[i],leftMax[i-1]);	
    	}
    	//Right Max array
    	int rightMax[]=new int[n];
    	rightMax[n-1]=arr[n-1];
    	for(int i=n-2;i>=0;i--)
    	{
    		rightMax[i]=Math.max(arr[i],rightMax[i+1]);
    	}
    	int TrapRainwater=0;
    	for(int i=0;i<n;i++)
    	{
    	 int waterLevel=Math.min(leftMax[i], rightMax[i]);
    	 TrapRainwater+=waterLevel-arr[i];
    	}
    	return TrapRainwater;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,2,0,6,3,2,5};
    System.out.println(TrapRain(arr));
	}

}
