package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) throws IOException {
		//https://www.tiffany.kr/jewelry/shop/rings/
		//18k����  27���� �� ��ҹ��� ����
		
		
		URL url = new URL("http://liebli.com/goods/goods_list.php?cateCd=001002"); // 100��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		int cnt =0;
		String data = null;
		while((data = br.readLine()) !=null) {
			int i=0;
			while((i=data.indexOf(i))!=-1) {
				i = i+"14k".length();
				if(data.toUpperCase().indexOf("14k"))) {
					cnt++;
				}
//				if(data.indexOf("14k".toUpperCase())>-1) {
//					cnt++;
//				}
			}
			
		}
		br.close();
		System.out.println("14k ���� "+cnt+"��");
		
	
	}
}