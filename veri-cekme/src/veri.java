import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class veri {

	public static void main(String[] args) {
		try{
			String url="http://www.goal.com/tr/people/norway/78076/martin-linnes?ICID=TP_TST_6"; //veri çekeceğimiz url yi yazıyoruz.
			Response response=Jsoup.connect(url).timeout(3000).execute();
			Document doc=response.parse();
			Elements elements=doc.select("td.playerName");//Sayfa kaynağını görüntülede html i inceleyerek çekme istediğimiz verinin başlığını buraya giriyoruz.
			Elements elements1=doc.select("td.playerStatValue");
			System.out.println("Rating:"+elements1.first().text());
			System.out.println("OyuncuAdı:"+elements.text());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
