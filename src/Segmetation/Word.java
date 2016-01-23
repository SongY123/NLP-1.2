package Segmetation;
public class Word {
	public String content;
	public String []explain;

	public void print(){
		System.out.println(content);
		for(int i = 0;i<explain.length;i++)
			System.out.println(explain[i]);
	}
}
