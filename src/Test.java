
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Person kana = new Person();
		kana.name = "猿渡香菜";
		kana.age = 23;
		
		System.out.println(kana.name);
		System.out.println(kana.age);
	}
}
