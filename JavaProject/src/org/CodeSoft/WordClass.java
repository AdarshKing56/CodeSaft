package org.CodeSoft;

public class WordClass {
  public static void main(String[]args) {
	  int count=0;
	  String name="My name is Braj Bhushan kumar";
	  char[] ch=name.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		 if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
			 count++;
		 }		
	  }
	  System.out.println(count);
	 



  }
}
