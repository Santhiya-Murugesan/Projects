import java.util.*;
class TestJavaCollection1{
public static void main(String args[]){
ArrayListw<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}

