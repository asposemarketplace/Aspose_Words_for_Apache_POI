package asposefeatures.workingwithtext.removecomments.java;

import com.aspose.words.Comment;
import com.aspose.words.Document;
import com.aspose.words.NodeCollection;
import com.aspose.words.NodeType;

public class AsposeRemoveComments
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithtext/removecomments/data/";

	Document doc = new Document(dataPath + "AsposeComments.docx");
	
	// Collect all comments in the document
	NodeCollection comments = doc.getChildNodes(NodeType.COMMENT, true);
	// Look through all comments and remove those written by the authorName author.
	for (int i = comments.getCount() - 1; i >= 0; i--)
	{
	    Comment comment = (Comment) comments.get(i);
	    if (comment.getAuthor().equalsIgnoreCase("Aspose"))
		System.out.println("Aspose comment removed");
		comment.remove();
	}
	
	doc.save(dataPath + "AsposeCommentsRemoved.docx");
	System.out.println("Done...");
    }
}