
public class Diamond {

	Diamond(int x)
	{
		print(x);
	}
	
	
	void print(int x)
	{
		int blank=0, kBlank = 1, kStar = 2, colu=1;
		
		if(x%2 == 0)
			{
			
	        blank = x/2;			//starting amount of blanks 
	        
			for(int row = 1; row <= x; row++)
			{
				if(row == x/2+1)
				{
					colu -= 2;
					blank += 1;
					kBlank*=-1;
					kStar*=-1;
				}
				
				for(int col = 1; col <= blank; col++)
					System.out.print(" ");				//print blanks
				for(int col = 1; col <= colu; col++)
					System.out.print("*");				//print stars
				
				if(blank==0)			//blank is equal to 0, start adding 
			    {
					kBlank*=-1;			//blanks and start reducing stars
					kStar*=-1;			
			    }
			    blank -= kBlank; 		//add blank
			    colu += kStar; 			//add star
			    
			    System.out.println("");	//NewLine
			}
		
		}
		
		else{
	        blank = (x-1)/2;		//starting amount of blanks 
	        
	        for(int row = 1; row <= x; row++)
			{
				for(int col = 1; col <= blank; col++)
					System.out.print(" ");				//print blanks
				for(int col = 1; col <= colu; col++)
					System.out.print("*");				//print stars
				
				if(blank==0)		//blank is equal to 0, start adding 
			    {
					kBlank*=-1;		//blanks and start reducing stars
					kStar*=-1;
			    }
				
			    blank -= kBlank; 		//add blank
			    colu += kStar; 			//add star
			    
			    System.out.println("");	//NewLine
			}
		
		}
	}
}