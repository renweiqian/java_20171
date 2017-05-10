package Data;

/**
 * Created by 任纹乾 on
 * 2017/5/9.
 */
/*
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        Elements elements = document.select("li[class=clear]");
        System.out.println(elements.size());
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").first().text();
            String totalPrice = element.select("div[class=totalPrice]").first().text();
            System.out.println("小区：" + region + "；总价：" + totalPrice);
        }
    }
}
*/
