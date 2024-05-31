package kadai_017;

abstract public class Kato_Chapter17 {
	//姓を表すフィールド
	public String familyName;
	//名を表すフィールド
	public String givenName;
	//住所を表すフィールド
	public String address;
	
	public void commonIntroduce() {
		familyName="加藤";
		address="住所は東京都中野区〇×です";
	}
	abstract public void eachIntroduce();
	
	public void exeIntroduce() {
		commonIntroduce();
		setGivenName();
		eachIntroduce();
	}
	public abstract void setGivenName();

	}
