package ʵ����;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


class CalTest {		
	    public void random() {
		CalTest test = new CalTest();
		
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        //���������
		char [] instruction = {'+','-','*','/'};
		Random random = new Random();
		//������ɵ���ʽ
		List<String> equations=new ArrayList<String>();
				
        for(int i=0;i<20;i++)
        {
        	
        	int ins=random.nextInt(3)+3;//3~5����ʽ����ins���ո���
        	int e=(int) (Math.random()*100+1);
        	StringBuilder equation= new StringBuilder();//��̬�ַ�����������������ʽ
        	equation.append(e);
        	int left=e;
            //ѭ��������ʽ
            for(int j=0;j<ins;j++)
            {
            	
            	char c=instruction[random.nextInt(4)];
            	int right=(int) (Math.random()*100+1);
            	if(c=='+') 
            	{
            		e=e+right;
            		//left=right;
            	}
            	if(c=='-')
            	{
            		//
            		if(left-right<0)
            		{
            			right=(int) (Math.random()*e+1);
            			
            		}
            		e=e-right;
            		//left=right;
            	}
            	if(c=='*')
            	{
            		e=e*right; 
            		//left=right;
            	}
            	if(c=='/')
            	{
            		do {
            			right=(int) (Math.random()*e+1);
            		}while(left%right!=0);
            		e=e/right;
            	}
            	left=right;
        		equation.append(c);
        		equation.append(right);
        		//System.out.println(right);������ɵ���
            
        }//�����
        	String ex=equation.toString();
        	equations.add(ex);
	}//for(��Ŀ��)
        
        //ʹ����ǿforѭ���ķ�������
        try {  
	        FileWriter fw = new FileWriter("suanshi.txt");  
	        BufferedWriter bw = new BufferedWriter(fw);  
	        bw.newLine();
	        for(String e:equations) {
	     	   e=e+"="+se.eval(e.toString());
	     	   bw.write(e.toString()); 
	     	   bw.newLine();
	         }
	         bw.close();  
	 	       fw.close(); 
	    } catch (Exception ee) {  
	        ee.printStackTrace();  
	    }  
        
}
}
