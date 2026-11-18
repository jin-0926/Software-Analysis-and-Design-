import java.util.* ; 
import java.time.* ; 
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
    private ReturnDB returnDB ; 

    /**
     * NewLibMS 생성자 1 : 도서관 이름을 기본으로 지정해줌. 
     * 
     */
    public NewLibMS()
    {
        this.libraryName = "New Library" ;  
        this.borrowerDB = new BorrowerDB() ;
        this.loanDB = new LoanDB() ;
        this.bookDB =new BookDB() ;
        this.returnDB = new ReturnDB() ; 
    }

    /**
     * NewLibMS 생성자 2 : 사용자가 도서관 이름을 세팅할 수 있게끔 함.  
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
    public void borrowBook(String borrowerID , String bookID)
    {
        // 이용자, 책이 시스템에 존재하는지 찾기 
        Borrower borrower = borrowerDB.findBorrower(borrowerID) ; 
        Book book = bookDB.findBook(bookID) ;

        if (borrower == null) {
            System.out.println("등록되지 않은 이용자입니다. 대출이 불가능합니다. ") ;         
        } 

        if(book == null) {
            System.out.println("등록되지 않은 책입니다. 대출이 불가능합니다.") ; 
        }

        if(borrower!=null && book!=null){
            System.out.println("[확인] 책과 이용자가 등록되어 있음. ") ;

            // 책의 대출 가능 여부 확인 
            boolean onLoan = book.isOnLoan() ; 

            if (onLoan == false) {
                System.out.println("대출 불가 : 책이 이미 대출중입니다.") ; 
            }

            if(onLoan==true) {
                System.out.println("[확인] 책이 대출중이 아님") ; 

                // 이용자의 대출 가능 여부 확인
                boolean result = borrower.isUnderLoanLimit() ; 

                if (result == false){
                    System.out.println("대출 불가 : 이용자의 대출 가능 권수가 0권입니다. ") ; 
                } 
                if (result == true) {
                    System.out.println("[확인] 이용자의 대출 가능 권수가 1권 이상임.") ; 

                    // 대출 객체 생성 (대출 ---> 이용자, 책)
                    Loan loan = new Loan(borrower,book) ; 

                    // 양방향 연결 ! (이용자,책 ----> 대출)
                    borrower.attachLoan(loan) ; 
                    book.attachLoan(loan) ; 

                    // 대출 DB에 저장
                    loanDB.saveLoan(loan) ; 

                    System.out.println("대출이 성공적으로 완료되었습니다 ! ") ; 
                }
            }
        }
    }

    /**
     * registerBook() : 신규 책 등록 후 그 내용을 고지하는 메소드.  
     *
     * @param     책 제목(title), 저자(author), 책 등록번호(bookId)
     * @return    책 객체(Book)
     */
    public void registerBook(String title , String author, String bookID)
    {
        Book registeredBook = bookDB.findBook(bookID) ;   // 향후 getID() 추가 예정 

        if (registeredBook != null) { // 이미 등록된 책일 경우 
            System.out.println("이미 등록된 책이어서 신규 등록이 불가합니다") ;   //  seq dgm과 동일하게 작성
        }

        Book book = new Book(title,author,bookID) ; 
        bookDB.saveBook(book) ;   // 책DB에 저장 
        System.out.println("신규 책 등록이 완료됨 !") ;  
    }

    /**
     * registerBorrower() : 신규 이용자 등록 후 그 내용을 고지하는 메소드 . 
     *
     * @param    책 등록 번호 (bookID)
     * @return   책 객체 (Book)
     */
    public void registerBorrower(String name, String borrowerID) 
    {
        Borrower registeredBorrower = borrowerDB.findBorrower(borrowerID) ;  // 향후 getID() 추가 예정 

        if (registeredBorrower != null) { // 이미 등록된 이용자일 경우 오류 메시지 
            System.out.println("이미 등록된 이용자여서 신규 등록이 불가합니다") ;  // seq dgm과 동일하게 작성
        }

        System.out.println("신규 이용자 등록이 가능합니다 ! "); 
        Borrower borrower = new Borrower(name, borrowerID) ; 
        borrowerDB.saveBorrower(borrower) ; 
    }

    /**
     * returnBook() : 대출한 책 1권을 반납하는 메소드 . 
     *
     * @param     책의 등록 번호
     */
    public void returnBook(String bookID)
    {
        Book book = bookDB.findBook(bookID) ; 
        
        if (book == null){
            System.out.println("등록되지 않은 책입니다. 책 반납이 불가능합니다.") ; 
        } else {
            System.out.println("등록된 책입니다. 책 반납이 가능합니다.") ;
            
            boolean onLoan = book.isOnLoan() ; 
            
            if (onLoan == false) {
                System.out.println("대출중인 책이 아닙니다. 책 반납이 불가능합니다.") ; 
            } else  {
                System.out.println("대출중인 책입니다. 책 반납이 가능합니다.") ; 
                
                // 대출 객체 찾기 
                Loan loan = book.getLoan() ; 
                
                // 이용자, 대출일 찾기 
                Borrower borrower = loan.getBorrower() ; 
                LocalDate loanDate = loan.getLoanDate() ; 
                
                // 반납 객체 생성 
                ReturnObject returnObject = new ReturnObject(borrower.getID(), bookID,loanDate) ; 
                
                returnDB.saveReturnObject(returnObject) ; 
                
                
                // 링크 끊기 (이용자, 책 --/---> 대출)
                borrower.removeLoan(loan) ; //
                book.removeLoan(loan) ; 
                
                // 링크 끊기 (대출 --/---> 이용자, 책)
                loanDB.deleteLoan(loan) ; 
                
                System.out.println("[반납 완료] 반납이 성공적으로 완료되었습니다 ! ") ; 
            }
        }
    }

}