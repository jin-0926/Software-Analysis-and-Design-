
/**
 * BookDB 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class BookDB
{
    private ArrayList<Book> bookDB ; 

    /**
     * findBook() : 책 객체를 생성한 후 책DB에서 해당 책을 찾아내 반환하는 메소드 
     *
     * @param     책 등록 번호 (bookID)
     * @return    책 객체 (Book)
     */
    public Book findBook(String bookID)
    {
        Iterator<Book> it = bookDB.iterator() ; 

        while(it.hasNext()) {
            realBook = null ; 
            realBook = it.next() ;  // bookDB 내 책 객체를 하나씩 읽어옴 .  
            if (bookID.equals(realbook))  // getID() 추가 예정 (클래스 다이어그램) 
            {
                break ; 
            }
        }
        return realBook ; 
    }

    /**
     *  saveBook() : 책 객체(Book)를 책 DB에 추가한다.  
     *
     * @param    책 객체 (Book)
     */
    public void saveBook(Book book)
    {
        bookDB.add(book) ; 
    }

}