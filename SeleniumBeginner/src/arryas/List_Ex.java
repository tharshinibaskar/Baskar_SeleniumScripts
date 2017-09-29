package arryas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Ex {

	public static void main(String[] args) {
		List<String> oList = new ArrayList<String>();
		oList.add("Mathan");
		oList.add("Jaya");
		oList.add("Varsha");
		oList.add("Mathan");
		oList.add("Pradeep");
		oList.add("Sathya");
		
		System.out.println(oList);
		oList.add(4, "Vijay");
		oList.add(2, "Karthick");
		oList.add(3, "Karthick");
		System.out.println(oList);
		oList.remove("Pradeep");
		System.out.println(oList);
		
		List<String> oList1 = new ArrayList<>();
		oList1.add("Saro");
		oList1.add("Senthil");
		oList1.add("Pooja");
		
		oList.addAll(oList1);
		System.out.println(oList);
		System.out.println("Contains Method : "+oList.contains("Pooja"));
		System.out.println("Size Method : "+oList.size());
		System.out.println("Get Method : "+oList.get(6));
		
		System.out.println("=============Legacy For Loop=================");
		for(int i=0;i<oList.size();i++){
			System.out.println(oList.get(i));
		}
		
		System.out.println("=============Enchanced For Loop=================");
		for(String s:oList){
			System.out.println(s);
			if(s.equals("Varsha")){
				System.out.println("Value is Match : "+s);
				break;
			}else{
				System.out.println("Value is Not Match : "+s);
			}
		}
		
		System.out.println("=============While Loop=================");
		int iCount = 0;
		while (iCount<oList.size()) {
			System.out.println(oList.get(iCount));
			iCount++;
		}
		
		System.out.println("=============Iterator=================");
		Iterator<String> oIt = oList.iterator();
				while (oIt.hasNext()) {
			System.out.println(oIt.next());
			
		}


	}

}
