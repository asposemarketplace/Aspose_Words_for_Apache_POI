package asposefeatures.workingwithtext.extractcomments.java;

import java.util.ArrayList;

import com.aspose.words.Comment;
import com.aspose.words.Document;
import com.aspose.words.NodeCollection;
import com.aspose.words.NodeType;
import com.aspose.words.SaveFormat;

public class AsposeExtractComments
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithtext/extractcomments/data/";

	Document doc = new Document(dataPath + "AsposeComments.docx");

	ArrayList collectedComments = new ArrayList();
	
	// Collect all comments in the document
	NodeCollection comments = doc.getChildNodes(NodeType.COMMENT, true);
	
	// Look through all comments and gather information about them.
	for (Comment comment : (Iterable<Comment>) comments)
	{
	    System.out.println(comment.getAuthor() + " - " + comment.getDateTime() + " - "
		    + comment.toString(SaveFormat.TEXT));
	}
	System.out.println("Done.");
    }
}
