/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_xpath;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
     目标：XPath检索XML中的信息啊。(了解)

     引入：
     Dom4J可以用于解析整个XML的数据。
     但是如果要检索XML中的某些信息，建议使用XPath.（Xpath依赖Dom4j技术）
     Dom4J用于解析数据，Xpath用于检索数据。

     XPath使用步骤：
     1.导入dom4j框架。（XPath依赖于Dom4j技术,必须先导入dom4j框架！）
     2.导入XPath独有的框架包。jaxen-1.1.2.jar

     XPath常用API:
     List<Node> selectNodes(String var1):检索出一批节点集合。
     Node selectSingleNode(String var1)：检索出一个节点返回。

     XPath提供的四种检索数据的写法：
     1.绝对路径。
     2.相对路径。
     3.全文搜索。
     4.属性查找。


     小结：
     1.绝对路径： /根元素/子元素/子元素。

     2.相对路径： ./子元素/子元素。 (.代表了当前元素)

     3.全文搜索：
     //元素  在全文找这个元素
     //元素1/元素2  在全文找元素1下面的一级元素2
     //元素1//元素2  在全文找元素1下面的全部元素2

     4.属性查找。
     //@属性名称  在全文检索属性对象。
     //元素[@属性名称]  在全文检索包含该属性的元素对象。
     //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
 */
public class XPathDemo {

    /**
     1.绝对路径: /根元素/子元素/子元素。 （推荐使用）
     */
    @Test
    public void parse01() throws Exception {
        // 1. 创建解析器对象
        SAXReader saxReader = new SAXReader();
        // 2. 把XML加载成Document文档对象
        Document document =
                saxReader.read(XPathDemo.class.getResourceAsStream("/Contacts2.xml"));
        // 3. 检索全部的名称
        List<Node> nameNodes = document.selectNodes("/contactList/contact/name");

        for (Node nameNode : nameNodes) {
            Element name = (Element) nameNode;  // 已经知道nameNode本质为元素节点，所以可以进行强转
            System.out.println(name.getTextTrim());
        }
    }

    /**
     2.相对路径： ./子元素/子元素。 (.代表了当前元素)  （不推荐使用）
     */
    @Test
    public void parse02() throws Exception {
        // 1. 创建解析器
        SAXReader saxReader = new SAXReader();
        // 2. 创建Document对象
        Document document = saxReader.read(XPathDemo.class.getResourceAsStream("/Contacts2.xml"));
        // 3. 得到根元素
        Element root = document.getRootElement();
        // 4. 检索全部名称
        List<Node> nameNodes = root.selectNodes("./contact/name");
        for (Node nameNode : nameNodes) {
            Element name = (Element) nameNode;  // 已经知道nameNode本质为元素节点，所以可以进行强转
            System.out.println(name.getTextTrim());
        }
    }

    /**
     3.全文搜索：  （推荐使用）
     //元素  在全文找这个元素
     //元素1/元素2  在全文找元素1下面的一级元素2
     //元素1//元素2  在全文找元素1下面的全部元素2
     */
    @Test
    public void parse03() throws Exception {
        // 1. 创建解析器对象
        SAXReader saxReader = new SAXReader();
        // 2. 创建Document对象
        Document document = saxReader.read(XPathDemo.class.getResourceAsStream("/Contacts2.xml"));
        // 3. 检索全部名称
        System.out.println("-------------//元素  在全文找这个元素------------");
        List<Node> nameNodes = document.selectNodes("//name");// 在全文找这个元素
        for (Node nameNode : nameNodes) {
            Element name = (Element) nameNode;  // 已经知道genderNode本质为元素节点，所以可以进行强转
            System.out.println(name.getTextTrim()); // [潘金莲, 武松, 武大狼, 我是西门庆]
        }

        System.out.println("-------------//元素1/元素2  在全文找元素1下面的一级元素2，元素2必须在元素1的下一级位置------------");
        List<Node> nodes = document.selectNodes("//contact/name");
        for (Node node : nodes) {
            Element element = (Element) node;
            System.out.println(element.getTextTrim());  // // [潘金莲, 武松, 武大狼] ,此时我是西门庆不会被打印出来
        }

        System.out.println("-------------//元素1//元素2  在全文找元素1下面的全部元素2,此时的元素2不一定在元素1的下一级，也有可能是下下下一级等位置------------");
        List<Node> nodes1 = document.selectNodes("//contact//name");
        for (Node node : nodes1) {
           Element element = (Element) node;
            System.out.println(element.getTextTrim());  // [潘金莲, 武松, 武大狼, 我是西门庆]， 此时我是西门庆也会被打印出来
        }
    }

    /**
     4.属性查找。  (推荐使用)
     //@属性名称  在全文检索属性对象。
     //元素[@属性名称]  在全文检索包含该属性的元素对象。
     //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
     */
    @Test
    public void parse04() throws Exception {
        // 1. 创建解析器对象
        SAXReader sAxReader = new SAXReader();
        // 2. 创建Document对象
        Document document = sAxReader.read(XPathDemo.class.getResourceAsStream("/Contacts2.xml"));
        // 3. 检索全部名称
        System.out.println("-------------//@属性名称  在全文检索属性对象。------------");
        List<Node> nodes = document.selectNodes("//@id");
        for (Node node : nodes) {
            Attribute attribute = (Attribute) node;
            System.out.println(attribute.getName() + "--->" + attribute.getValue());
        }

        System.out.println("-------------//元素[@属性名称]  在全文检索包含该属性的元素对象.------------");
        // 在全文检索包含id属性的name元素对象
        Node node = document.selectSingleNode("//name[@id]");
        Element node1 = (Element) node;
        System.out.println(node1.getTextTrim());  // 我是西门庆

        System.out.println("-------------//元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。------------");
        // 在全文检索包含id属性的元素且属性值为888的元素对象
        Node node2 = document.selectSingleNode("//name[@id=888]");
        Element node21 = (Element) node2;
        System.out.println(node21.getTextTrim());  // 我是西门庆

    }
}
