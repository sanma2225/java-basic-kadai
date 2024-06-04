package kadai_017;

abstract public class Kato_Chapter17 {
	public String familyName = "加藤";
	public String givenName = ""; 
    public String address = "東京都中野区○×";
	

	public void commonIntroduce() {
		System.out.println(familyName);
	}
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		
	}
}
