import java.util.* ; 
/**
 * NewLibMS 클래스 : 책 대출, 신규 이용자 등록, 신규 책 등록 기능을 
 * 제공하는 도서관 관리 시스템의 클래스 .  
 *
 * @author (2025957072 강서윤, 2025320018 진시원)
 * @version (2026-11-04)
 */
public class NewLibMS
{
    private String libraryName ;
    private BorrowerDB borrowerDB ; 
    private LoanDB loanDB ; 
    private BookDB bookDB ; 
    
    
    /**
     * NewLibMS 클래스의 객체 생성자
     * 
     * @param 도서관의 이름
     */
    public NewLibMS(String libraryName)
    {
        this.libraryName = libraryName ; 
        this.borrowerDB = new BorrowerDB() ;
        this.loanDB = new LoanDB() ;
        this.bookDB =new BookDB() ;
    }
    
    /**
     * borrowBook() : 학번과 책 등록 번호를 토대로 대출 객체를 
     * 생성하는 메소드 
     *
     * @param     학번 (studentId) , 책 등록 번호 (bookID)
     * @return    대출 객체 (Loan)
     */
    public String borrowBook(String borrowerID , String bookID)
    {
        borrowerDB.findBorrower(borrowerID) ; 
        bookDB.findBorrower(bookID) ; 
    }

    /**
     * registerBook() : 신규 책 등록 후 그 내용을 고지하는 메소드.  
     *
     * @param     책 제목(title), 저자(author), 책 등록번호(bookId)
     * @return    책 객체(Book)
     */
    public String registerBoook(String title , String author, String bookID)
    {
        Book registeredBook = bookDB.findBook(bookID) ;   // 향후 getID() 추가 예정 
        
        if (registeredBook != null) { // 이미 등록된 책일 경우 
            String errorMessage = "이미 등록된 책이어서 신규 등록이 불가합니다" ;   //  seq dgm과 동일하게 작성
            return errorMessage ;  
        }
        
        Book book = new Book(title,author,bookID) ; 
        bookDB.saveBook(book) ;   // 책DB에 저장 
        String message = "신규 책 등록이 완료됨 !" ;  
        return message ; 
    }

    /**
     * registerBorrower() : 신규 이용자 등록 후 그 내용을 고지하는 메소드 . 
     *
     * @param    책 등록 번호 (bookID)
     * @return   책 객체 (Book)
     */
    public String registerBorrower(String name, String borrowerID) 
    {
        Borrower registeredBorrower = borrowerDB.findBorrower(borrowerID) ;  // 향후 getID() 추가 예정 
        
        if (registeredBorrower != null) { // 이미 등록된 이용자일 경우 오류 메시지 
            String errorMessage = "이미 등록된 이용자여서 신규 등록이 불가합니다" ;  // seq dgm과 동일하게 작성
            return errorMessage ; 
        }
        
        String message = "신규 이용자 등록이 가능합니다 ! " ; 
        Borrower borrower = new Borrower(name, borrowerID) ; 
        borrrowerDB.saveBook(borrower) ; 
        return message ; 
    }
}