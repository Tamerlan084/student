import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;

public class StudentsSAXBuilder {
    private Set<Student> students;
    private StudentHandler studentHandler;
    private XMLReader reader;

    public StudentsSAXBuilder() {
        studentHandler = new StudentHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(studentHandler);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        }
    }
    public Set<Student> getStudents(){
        return students;
    }
    public void buildSetStudents(String fileName){
        try{
            reader.parse(fileName);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        students=studentHandler.getStudents();
    }
}
