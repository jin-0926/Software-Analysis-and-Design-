
/**
 * NewLibMS 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class NewLibMS
{
    // 속성 
    private ArrayList<Borrower> userDB ; 
    private ArrayList<Loan> loanDB ; 
    private ArrayList<Book> bookDB ; 
    
    
    // NewLibMS 생성자가 클래스 다이어그램에 반영되지 않아 작성하지 않음 . 
    
    /**
     * borrowBook() : 학번과 책 등록 번호를 토대로 대출 객체를 생성하는 메소드 
     *
     * @param     학번 (studentId) , 책 등록 번호 (bookID)
     * @return    대출 객체 (Loan)
     */
    public Loan borrowBook(String studentID , String bookID)
    {
        Loan loan = new Loan(studentID, bookID) ; 
        return laon ; 
    }

    /**
     * registerBook() : 신규 책을 생성 후 책 DB 등록하고 책을 반환하는 메소드 ..? 
     *
     * @param     책 제목(title), 저자(author), 책 등록번호(bookId)
     * @return    책 객체(Book)
     */
    public Book registerBook(String title , String author, String bookId)
    {
        Book book = new Book(title,author,bookId) ; 

    }

    /**
     * findBook() : 책 등록 번호를 통해 책DB에서 책 객체를 찾아 반환하는 메소드. 
     *
     * @param    책 등록 번호 (bookID)
     * @return   책 객체 (Book)
     */
    public Book findBook(String bookId) 
    {
        Book finededBook = bookDB.findBook(bookId) ;
        return findedBook ; 
    }


}