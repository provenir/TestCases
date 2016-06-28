package com.provenir.automation.framework.utility;

import java.io.FileReader;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xml.sax.SAXException;

import com.provenir.automation.framework.utility.TestDataReader;

public class TestDataReader {

	private Document doc;
	private final static Logger log = Logger.getLogger(TestDataReader.class);

	// reading value from JSON

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void readValue(HashMap<String, Map<String, String>> hashMap,
			String str) {
		try {

			System.out.println(str);
			JSONObject jsonObject = (JSONObject) new JSONParser()
					.parse(new FileReader(str));
			Iterator iter = jsonObject.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, Map<String, String>> entryMap = (Entry<String, Map<String, String>>) iter
						.next();
				HashMap<String, String> properties = new HashMap<String, String>();
				String key = entryMap.getKey();
				Map<String, String> valueMap = entryMap.getValue();
				Iterator propIter = valueMap.entrySet().iterator();

				while (propIter.hasNext()) {
					Map.Entry<String, String> propertyEntry = (Entry<String, String>) propIter
							.next();
					properties.put(propertyEntry.getKey(),
							propertyEntry.getValue());
				}

				hashMap.put(key, properties);
			}
		} catch (Exception e) {
			// e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}

	}

	// updating value into JSON from Hashmap

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void updateValue(
			HashMap<String, Map<String, String>> hashMap, String str,
			String value, String value1) {
		try {
			System.out.println(str);
			JSONObject jsonObject = (JSONObject) new JSONParser()
					.parse(new FileReader(str));
			Iterator iter = jsonObject.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, Map<String, String>> entryMap = (Entry<String, Map<String, String>>) iter
						.next();
				HashMap<String, String> properties = new HashMap<String, String>();
				String key = entryMap.getKey();
				Map<String, String> valueMap = entryMap.getValue();
				Iterator propIter = valueMap.entrySet().iterator();

				while (propIter.hasNext()) {
					Map.Entry<String, String> propertyEntry = (Entry<String, String>) propIter
							.next();
					properties.put(propertyEntry.getKey(),
							propertyEntry.getValue());

					propertyEntry.setValue(value1);

				}

				hashMap.put(key, properties);
			}
		} catch (Exception e) {

			log.error(e.getLocalizedMessage());
		}
	}
	
	public void init(String xmlFilePath) {
		try {
			DocumentBuilderFactory domFactory = DocumentBuilderFactory
					.newInstance();
			domFactory.setNamespaceAware(true);

			doc = domFactory.newDocumentBuilder().parse(xmlFilePath);

		} catch (ParserConfigurationException p) {
			log.error(p.getLocalizedMessage());
		} catch (SAXException sax) {
			log.error(sax.getLocalizedMessage());
		} catch (IOException ioe) {
			log.error(ioe.getLocalizedMessage());
		}
	}

	public String readNodeValue(String xPath) {
		try {
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile(xPath);
			return (String) expr.evaluate(doc, XPathConstants.STRING);

		} catch (XPathExpressionException x) {
			log.error(x.getLocalizedMessage());
		}
		return null;
	}
	
	public void updateNodeValue(String xPathOfNode, String value) {
		try {
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile(xPathOfNode);
			Node rootFolder = (Node) expr.evaluate(doc, XPathConstants.NODE);
			rootFolder.getFirstChild().setNodeValue(value);
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(doc.getDocumentURI());
			transformer.transform(source, result);
		} catch (Exception ex) {
			log.error(ex.getLocalizedMessage());
		}
	}

}
