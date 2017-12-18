package org.hp;

import java.util.Iterator;
import java.util.List;

public class Question {
	
 private int id;
 private String name;
 private List<String> answer;
 
 	public Question(int id,String name,List<String> answers){
 		super();
 		this.id=id;
 		this.name=name;
 		this.answer=answers;
 	}
 	
 	public void showInfo()
 	{
 		System.out.println(id+" "+name);
 		System.out.println("Answers are ...");
 		
 		Iterator<String> itr=answer.listIterator();
 		while(itr.hasNext())
 		{
 			System.out.println(itr.next());
 		}
 	}
 
}
