package com.alexandrSinko.ModuleTwo.Solution;

import org.jdom2.JDOMException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, JDOMException {
        createXML();
        parsXML();
    }

    public static void parsXML() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Profitsoft_ex\\src\\main\\resources\\input.xml"), "UTF-8"));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("C:\\Profitsoft_ex\\src\\main\\resources\\output.xml"), "UTF-8"));

        String line = null;

        while ((line = reader.readLine()) != null) {

            writer.write(line);

            writer.newLine();

        }

        // Close to unlock.
        reader.close();
        // Close to unlock and flush to disk.
        writer.close();
    }


    public static void createXML() {

        final String xmlFilePath = "C:\\Profitsoft_ex\\src\\main\\resources\\output.xml";

        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
