package ±í´ïÊ½¼ÆËã;

import java.util.*;

public class PolynomialaArithmetic {

	public static void main(String[] args) {
<<<<<<< HEAD
=======

>>>>>>> C4
		Scanner lalala = new Scanner(System.in);
		String Input ;
		int la=0;
		Expression a=new Expression();
		System.out.println("Welcome to the PolynomialaArithmetic monitor.\nServer version: 1.0.9\nCopyright (c) 2016¡£\nType '!h' for help. Type '!q' for exit.\n ");
		while(true){
			Input = lalala.nextLine();
			try{
			if(Input.length()>0&&Input.charAt(0)=='!')
			{
				if(Input.equals("!q")){
					System.out.println("end");
					break;
				}
				else if (Input.equals("!h"))
					System.out.println("输入表达式\n!化简!simplify a=1  !d/dx \n±ØÐëÑÏ¸ñ°´ÕÕ¹æÔòÊäÈë£¡");

				else if(Input.substring(0,4).equals("!d/d")||Input.substring(0,9).equals("!simplify"))
				{
					if(la==0)
						//乱码了。。。
						System.out.println("ÉÐÎ´ÊäÈëÈÎºÎ±í´ïÊ½£¬ÎÞ·¨Ö´ÐÐÃüÁî¡£\n");
					else 
						a.Command(Input);
				}
			}
			else 
			{
				la=1;
				a.Set(Input);
				a.printout();
				System.out.print("\n");
			}
		}
			catch(Exception e)
			{
				System.out.println("ÊäÈë²»ºÏ·¨£¡\n"+e);
			}
		}
		lalala.close();
	}
}
