import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scores.length; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      
      double smallest = 10000;
      
	  // STUDENT TODO: Implement your logic here
	  
		// runs through the rows
		for (int i = 0; i < scoresSize; i++)
		{
			// is it the lowest value at this element?
			if (scores == null)
			{
				smallest = 0;
				break;
			}
			else if (scores[i] < smallest)
			{
				smallest = scores[i];
			}
		}
      
      return smallest;
   }
   
   /**
    * This method will return the score size of this gradebook.
    * @return the scoresSize.
    */
   
   public int getScoresSize()
   {
	   return scoresSize;
   }
   
   /**
    * This will return a string with each score in scores separated by a space
    * @return str that is a string of each score in scores separated by a space
    */
   
	public String toString() 
	{
		String str = "";
		
		// runs through the rows
		for (int i = 0; i < scoresSize; i++)
		{
			str += scores[i] + " ";
		}
				
		return str;
	}

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
}

