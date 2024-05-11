class GfG
{
/*method prints the given pattern in a single line */
	void printPattern(String s)
	{
	    //Your code here
	    String temp = "";
      for(int i=s.length()/2;i<s.length();i++){
          System.out.print(s.substring(s.length()/2,i+1)+"$ ");
          temp = s.substring(s.length()/2,i+1);
      }  
      for(int i=0;i<s.length()/2;i++){
          System.out.print(temp+s.substring(0,i+1)+"$");
          if(i!=s.length()/2)
          System.out.print(" ");
    }
}
}

