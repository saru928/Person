
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "010-1234-5678";
		taro.address = "taro.20@test.com";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "020-3456-7890";
		jiro.address = "jiro.18@test.com";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "030-2345-6789";
		hanako.address = "hanako.16@test.com";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		
		Person kana = new Person();
		kana.name = "猿渡香菜";
		kana.age = 23;
		kana.phoneNumber = "040-8765-4321";
		kana.address = "kana.23@test.com";
		
		System.out.println(kana.name);
		System.out.println(kana.age);
		System.out.println(kana.phoneNumber);
		System.out.println(kana.address);
		kana.talk();
		kana.walk();
		kana.run();
		
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		System.out.println(aibo.name);
		aibo.talk();
		
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		System.out.println(asimo.name);
		asimo.walk();
		
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		System.out.println(pepper.name);
		pepper.run();
	}
}
