// write your class here
class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = java.util.Arrays.copyOf(authors, authors.length);
        }
    }
}