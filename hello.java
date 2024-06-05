import java.io.*;
import java.util.*;
public class hello {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] str = new String[n];
    int n = scan.nextInt();
    for(int i = 0; i < n ; i++){
      str[i] = scan.next();
    }
  i = 0;
  int k = 0;
  while(i < n){
      final char[] ch = str[i].toCharArray();
      k = ch.length;
      if(ch.length > 10 ){
        System.out.println(ch[0] + k - 2 + ch[k - 1]);
      }
      else{
        System.out.println(str[i]);
      }
      i++;
    }
  }
}


