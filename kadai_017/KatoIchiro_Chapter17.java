package kadai_017;

public class KatoIchiro_Chapter17 extends  Kato_Chapter17 {
	String ichiroIntroduce="";

	public void setGivenName(String name) {
		givenName = "一郎";
	}
	public void execIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
		eachIntroduce();
		System.out.println(ichiroIntroduce);
	}
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
