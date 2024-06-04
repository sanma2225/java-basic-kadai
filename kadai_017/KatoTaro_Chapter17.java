package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	String taroIntroduce="";
	public void setGivenName(String name) {
		givenName = "太郎";
	}
	public void execIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
		eachIntroduce();
		System.out.println(taroIntroduce);
	}
	public void eachIntroduce() {
		System.out.println("javaが得意です");
	}
}
