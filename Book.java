
/**
 * Book 책의 정보를 담은 책 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.11.04)
 */
public class Book
{
    private String title;
    private String author;
    private String bookID;

    private Loan loanData;
    /**
     * Book 클래스의 객체 생성자
     * 
     * @param 제목, 저자, 책 등록번호
     */
    public Book(String title, String author, String bookID)
    {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        this.loanData  = null;
        System.out.println("Book 객체가 생성되었습니다.");
    }

    /**
     * attachLoan() : 책(Book)을 대출(Loan)에 연결시키는 메소드
     *
     * @param  대출객체
     */
    public void attachLoan(Loan loanData)
    {
        this.loanData = loanData; 
    }

    /**
     * getID() - 책의 등록번호(bookID)를 반환하는 메소드
     *
     * @return 책의 등록번호
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * isOnLoan() - 대출여부를 출력하는 메소드(대출 true, 미대출 false)
     *
     * @return    책이 대출 되었다. 라는 물음에 대한 true, false
     */
    public boolean isOnLoan()
    {
        if(loanData == null){
            return false;
        }else{
            return true;
        }
    }

    /**
     * getLoan() - 책과 연결된 대출 객체를 반환한다.
     *
     * @return    책과 연결된 대출객체(loanData)
     */
    public Loan getLoan()
    {
        return loanData;
    }

    /**
     * removeLoan() - 책과 대출객체의 연결을 없애는 메소드
     *
     *@parm   대출 객체
     */
    public void removeLoan(Loan loan)
    {
        loanData = null;
    }
}