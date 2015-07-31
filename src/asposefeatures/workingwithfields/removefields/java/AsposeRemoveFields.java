package asposefeatures.workingwithfields.removefields.java;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.Field;

public class AsposeRemoveFields
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithfields/removefields/data/";

	Document doc = new Document();
	
	DocumentBuilder builder = new DocumentBuilder(doc);
	
	Field field = builder.insertField("PAGE");
	
	// Calling this method completely removes the field from the document.
	field.remove();
	
	doc.save(dataPath + "AsposeFieldsRemoved.docx");
	System.out.println("Aspose Fields Removed...");
    }
}
