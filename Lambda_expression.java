import java.util.*;
public class Lambda_expression {
    
    // public static void main(String[] args){
    //     ArrayList<Integer> arr=new ArrayList<>();

    //     arr.add(1);
    //     arr.add(2);
    //     arr.add(3);
    //     arr.add(4);
    //     arr.add(5);

    //     //Using lambda expression to print all elements 

    //     arr.forEach(n -> System.out.print(n+ " "));

    //     // Finding even number 
    //     System.out.println();
    //     arr.forEach(n -> { if (n%2==0) System.out.print(n+" ");});

        
    // }

    public static Vector<String> frequentWords(Vector<String> vec,int k)
	{
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<vec.size();i++){
			if(!map.containsKey(vec.get(i))){
				map.put(vec.get(i),1);
			}
			else{
				map.put(vec.get(i),map.get(vec.get(i)) +1);
			}
		}

		Vector<String> disword= new Vector(map.keySet());
		Collections.sort(disword,(word1,word2) ->{
			int comparision=map.get(word2).compareTo(map.get(word1));
			if (comparision==0){
				return(word1.compareTo(word2));
			}
			return(comparision);
		});
		return(disword);
		
	}


	// Recent Lambda learn 

	public static void main(String[] args){
		//Normal way to access display method
		MyLambda m =new My();
		m.display();

		//Lambda way without parameter 
		MyLambda M=()->{System.out.println("Hello World");};
		M.display();

		// With String parameter 
		MyLambda2 param=(s)->{System.out.println(s);};
		param.display("Yes param works");

		//Adding number using lambda 
		MyLambda3 add=(a,b)->{return a+b;};

					//or 

		MyLambda3 add2=(a,b)->a+b;
		
		System.out.println(add.addition(10,20));
		System.out.println(add2.addition(10,20));
	}



    
}


// Lambda expression 

@FunctionalInterface
interface MyLambda{
	abstract public void display();
}

@FunctionalInterface
interface MyLambda2{
	abstract public void display(String s);
}

@FunctionalInterface
interface MyLambda3{
	abstract public int addition(int a,int b);
}

class My implements MyLambda{
	public void display(){
		System.out.println("Hello World");
	}
}


