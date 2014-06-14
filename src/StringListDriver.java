/**
 * User: RS
 * Date: 14/05/14
 * Time: 21:45
 */
public class StringListDriver {
    public static void main(String[] args) {
        CharNode node1= new CharNode('b',3,null);
        CharNode node2= new CharNode('a',2,node1);
        System.out.println("The value of node1 is: " + node1.getValue());
        node1.setValue(4);
        System.out.println("The data of node2 is: " + node2.getData());
        node2.setData('c');
        CharNode node3 = node2;
        node3=node3.getNext();
        node2.setNext(null); 
        System.out.println("The data of node3 is: " + node3.getData());


        StringList s = new StringList("abcde");
   
        StringList s1 = new StringList("a");
 

        System.out.println("The length of s is: " + s.length());

        System.out.println("char At string s at place 1 is: " + s.  charAt(1));

        System.out.println("the concat of string s and string s1 is: " + s.concat(s1));

        System.out.println("index Of 'a' in string s is: " + s.indexOf('a'));
      
        System.out.println("index Of 'a' in string s from index 2 is: " + s.indexOf('a',2));
      
        System.out.println("is the first string equal to the second string? " + s.equals(s1));

        System.out.println("compare s To s1=> equal (0), s<s1 (<0), s>s1 (>0) is: " + s.compareTo(s1));

        System.out.println("sub string s form place 2 to the end of the string is: " + s.substring(2));

        System.out.println("sub string s from place 1 to place 3 is: " + s.substring(1,3));

   }
}

