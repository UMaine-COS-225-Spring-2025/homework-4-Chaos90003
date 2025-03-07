import java.util.ArrayList;
public class BookShelf{
    char firstLetter;
    ArrayList<Book> bList = new ArrayList<Book>(8);
    public BookShelf(char firstLetter){
        this.bList = new ArrayList<>(8);
        this.firstLetter = firstLetter;
    }
    public char getfirstLetter(){
        return firstLetter;
    }

    public ArrayList<Book> getbList(){
        return bList;
    }

    public void setfirstLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public void setbList(ArrayList<Book> bList){
        this.bList = bList;
    }

    public void addBook(String title, String genre){
        if(firstLetter == title.charAt(0)){
             bList.add(new Book(title, genre));
            }
        }
    public void removeBook(Book book){
        bList.remove(book);
    }

    @Override
    public String toString(){
        String result = "";
        if (bList.isEmpty()){
            result += "Empty";
        }
        else{
            for(int i = 0; i < bList.size(); i++){
                result += bList.get(i).title;
                if(i < bList.size()-1){
                    result += "   ";
                }
            }
        }
        return result;
    }
}
