package productv5;

public class ProductDB {

    public static Product getProduct(String productCode){

       Product myProduct=null;

       //Book DB
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");

            myProduct=myBook;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");

            myProduct=myBook;

        } else if (productCode.equalsIgnoreCase("mysql")) {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct=myBook;

        }

        //Software DB
        if (productCode.equalsIgnoreCase("studios")) {
             Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct=mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct=mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
           Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct=mySoftware;
        }

        //TV DB
        if (productCode.equalsIgnoreCase("Samsung")) {
           Tv myTV= new Tv();
            myTV.setCode(productCode);
           myTV.setDescription("Samsung Tv ");
            myTV.setPrice(249.99);
            myTV.setManufacture("Samsung");
            myTV.setSize("55");
            myProduct=myTV;
        } else  if (productCode.equalsIgnoreCase("Sony")) {
            Tv myTV= new Tv();
            myTV.setCode(productCode);
            myTV.setDescription("Sony Tv ");
            myTV.setPrice(349.99);
            myTV.setManufacture("Sony");
            myTV.setSize("100");
            myProduct=myTV;
        } else  if (productCode.equalsIgnoreCase("LG")){
            Tv myTV= new Tv();
            myTV.setCode(productCode);
            myTV.setDescription("LG Tv ");
            myTV.setPrice(249.99);
            myTV.setManufacture("LG");
            myTV.setSize("60");
            myProduct=myTV;
        }

        //Music DB
        if (productCode.equalsIgnoreCase("Brazil")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Music");
            myMusic.setPrice(5.00);
            myMusic.setArtist("Declan McKenna");
            myMusic.setLabel("Columbia records");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("Can't Stop ")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Music");
            myMusic.setPrice(10.00);
            myMusic.setArtist("Red Hot Chilli Peppers");
            myMusic.setLabel("Warner Records");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("Sweet Emotion")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Music");
            myMusic.setPrice(7.50);
            myMusic.setArtist("AeroSmith");
            myMusic.setLabel("Geffen Records");
            myProduct=myMusic;
        }

        return myProduct;
    }

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

