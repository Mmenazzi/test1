package handson5;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadXML {
	public static void main(String[] args){
		
		try{
		
			File XmlFile = new File ("C:\\Users\\Matteo\\workspace\\Project1\\src\\handson5\\opencim3sub.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(XmlFile);
			
			// normalize CIM XML file
			doc.getDocumentElement().normalize();
			
			NodeList subList = doc.getElementsByTagName("cim:Substation");
			NodeList volList = doc.getElementsByTagName("cim:VoltageLevel");
			NodeList genList = doc.getElementsByTagName("cim:SynchronousMachine");
			// … read other required CIM objects
			
			// … cycle through each list to extract required data
			for (int i = 0; i < subList.getLength(); i++) {
				Node node = subList.item(i); 
				extractNode(node);
			}
			for (int i = 0; i < volList.getLength(); i++) {
				Node node = volList.item(i);
				extractNode(node);
			}
			for (int i = 0; i < genList.getLength(); i++) {
				Node node = genList.item(i);
				extractNode(node);
			}
			}
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void extractNode (Node node){
		// … remember to convert node to element in order to search for the data inside it.
		Element element = (Element) node;
		String rfdID = element.getAttribute("rdf:ID");
		String name = element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent();
		// can be used to read specific attribute of XML node.
		System.out.println("rdfID: " + rfdID + "\n" + "Objectname: " + name + "\n");
		}

}
