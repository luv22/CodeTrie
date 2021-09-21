import java.io.*;
import java.util.*;


public class code {

    public static void main(String[] args) throws Exception{
        	trie trie = new trie();
        	String s= "amagi";
        	trie.insert(s);
    }

 

}

class trie{

	Node root;

	public trie(){
		root= new Node();
	}

	public void insert(String c){

			insert(c,0,root);
	}

	private void insert(String s,int idx,Node iterate){

		if(idx==s.length()-1){
				// reached last character of string
			int index= s.charAt(idx)-'a';
			if(iterate.n[index]==null){
				iterate.n[index]=new Node();
				
			}
			iterate.end=true;
			return;
		}
		//getting current character index
		int index= s.charAt(idx)-'a';

		// checking if current char index is null or not
		if(iterate.n[index]==null){
			iterate.n[index]= new Node();
		}

		insert(s,idx+1,iterate.n[index]);

	}


}


class Node{

	Node n[] ;
	boolean end;

	public Node(){
		n = new Node[26];
		end=false;
	}
}
