package model.save;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FileWriterUtils {

	public static void write(ArrayList<Integer> scores) {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.newDocument();

			Element root = document.createElement("score");
			document.appendChild(root);

			Element easy = document.createElement("Easy");
			easy.appendChild(document.createTextNode(String.valueOf(scores.get(1))));
			root.appendChild(easy);

			Element medium = document.createElement("Medium");
			medium.appendChild(document.createTextNode(String.valueOf(scores.get(2))));
			root.appendChild(medium);

			Element hard = document.createElement("Hard");
			hard.appendChild(document.createTextNode(String.valueOf(scores.get(3))));
			root.appendChild(hard);

			Element arcade = document.createElement("Arcade");
			arcade.appendChild(document.createTextNode(String.valueOf(scores.get(4))));
			root.appendChild(arcade);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File("score.xml"));

			transformer.transform(domSource, streamResult);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}

	}
}
