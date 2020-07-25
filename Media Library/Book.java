/**
 * This class encapsulates the data required to represent a book in electronic format
 * in a collection of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a book are: 
 *       number of pages and font size.
 **/
 public class Book extends MediaItem {

  private int numPages;
  private double fontSize;
 
  /* TODO: Implement this method:
   * Constructor.
  */ 
  public Book(String title, String author, String genre, 
                   int numPages, double fontSize){
      super(title,author,genre);
      this.numPages = numPages;
      this.fontSize = fontSize;



  }
  
  // get method for the number of pages
  public int getNumPages(){
     return numPages;
  }
  
  // get method for the font size
  public double getFontSize(){
     return fontSize;
  }
  
  /* TODO: Implement this method:
   * Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Book: [title], [author], [genre], [numPages], [fontSize]
   * For example:
   *   "Book: Snow Crash, Neil Stephenson, sci fi, 480, 3.5"
   */
  public String toString(){
     return "Book: " + getTitle() + ", " + getAuthor() + ", " + getGenre() + ", " + numPages + ", " + fontSize;
  }
}