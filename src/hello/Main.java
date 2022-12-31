package hello;
 
public class Main {

	public static void main (String [] args) {
		// Your code goes here
		String str ="ababac";
		char ch ='b';
		
        int le=str.length();
        String res="";
          for(int i=0;i<le;i++)
        {
          //  if( i<le-1 && str.charAt(i)==str.charAt(i+1))
          if(str.charAt(i)==ch)
            {
                continue;
            }
            else
            {
                res=res+str.charAt(i);
            }
        }
        System.out.print(res);
	}

}
