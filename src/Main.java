
import java.util.ArrayList;
import java.util.List;

import hello.GreetingTemplate;
import hello.HelloWorldTemplate;
import hello.XMLDemoTemplate;

/**
 * @author I326488
 * @see <a href=
 *      "https://www.eclipse.org/articles/Article-JET/jet_tutorial1.html">https://www.eclipse.org/articles/Article-JET/jet_tutorial1.html</a>
 */
public class Main {

	public static void main(String[] args) {
		jspDemo();
	}

	static void helloWorld() {
		HelloWorldTemplate helloworld = new HelloWorldTemplate();
		String result = helloworld.generate(null);
		System.out.println(result);
	}

	static void greeting() {
		GreetingTemplate sayHello = new GreetingTemplate();
		String result = sayHello.generate("Tutorial Reader");
		System.out.println(result);
	}

	static void xmlDemo() {
		List<String> data = new ArrayList<String>();
		data.add("first");
		data.add("second");
		data.add("third");

		XMLDemoTemplate generateXml = new XMLDemoTemplate();
		String result = generateXml.generate(data);
		System.out.println(result);
	}

	static void jspDemo() {
		System.out.println(new tags.demo.JspTemplate().generate("button"));
	}
}
