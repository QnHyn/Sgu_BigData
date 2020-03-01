package com.hynqn.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.hynqn.Students;

public class Dom4jtest {
	public static void main(String[] args) throws DocumentException {
		//1.创建解析器对象。
		SAXReader saxReader = new SAXReader();
		//2.解析xml文件获取document对象。
		Document document = saxReader.read("students.xml");
		//3.得到根元素
		Element rootElement = document.getRootElement();
		//4.获取所有的student标签
		List<Element> stus = rootElement.elements("student");
		//System.out.println(stus.size());
		// 5. 遍历得到所有标签
		for(Element stu : stus) {
			// 获取id
			String id = stu.attributeValue("id");
			System.out.println(id);
			// 获取name 标签中的值
			Element nameEle = stu.element("name");
			String name = nameEle.getText();
			System.out.println(name);
			// 获取gender标签中的值
			Element genderEle = stu.element("gender");
			String gender = genderEle.getText();
			System.out.println(gender);
			// 获取age 标签中的值
			Element ageEle = stu.element("age");
			String age = ageEle.getText();
			System.out.println(age);
			// 获取address标签中的值
			Element addressEle = stu.element("address");
			String address = nameEle.getText();
			System.out.println(address);
			// 封装Students对象
			Students student = new Students(id, name, gender, age, address);
			System.out.println(student);
		}
	}
}
