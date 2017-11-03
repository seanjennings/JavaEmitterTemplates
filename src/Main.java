
import java.util.ArrayList;
import java.util.List;

import hello.GreetingTemplate;
import hello.HelloWorldTemplate;
import hello.XMLDemoTemplate;

/**
 * @author Sean Jennings
 * @see <a href=
 *      "https://www.eclipse.org/articles/Article-JET/jet_tutorial1.html">https://www.eclipse.org/articles/Article-JET/jet_tutorial1.html</a>
 */
public class Main {

	public static void main(String[] args) {
		helloWorld();
		greeting();
		xmlDemo();
		jspDemo();
	}

	/**
	 * Simple hello world example.
	 */
	static void helloWorld() {
		HelloWorldTemplate helloworld = new HelloWorldTemplate();
		String result = helloworld.generate(null);
		System.out.println(result);
	}

	/**
	 * Tokenising example.
	 */
	static void greeting() {
		GreetingTemplate sayHello = new GreetingTemplate();
		String result = sayHello.generate("Sean");
		System.out.println(result);
	}

	/**
	 * XML generation example.
	 */
	static void xmlDemo() {
		List<String> data = new ArrayList<String>();
		data.add("first");
		data.add("second");
		data.add("third");

		XMLDemoTemplate generateXml = new XMLDemoTemplate();
		String result = generateXml.generate(data);
		System.out.println(result);
	}

	/**
	 * JSP generation example.
	 */
	static void jspDemo() {
		System.out.println(new tags.demo.JspTemplate().generate("button"));
	}
}
