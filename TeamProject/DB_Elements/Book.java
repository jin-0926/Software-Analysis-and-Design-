package TeamProject.DB_Elements;

/**
 * Book 책의 정보를 담은 책 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.11.04)
 */
public class Book extends Element
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

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  자바 내 객체
     * @return "두 책은 동일하다" 라는 명제의 true, false
     */
    public boolean equals(Object obj)
    {
        Book book = (Book)obj;
        return bookID.equals(book.getID());
    }

    /**
     * String toString() - 이용자의 이름과 학번을로 문자열 반환한다.
     *
     * @return    책의제목 작가 책등록번호
     */
    public String toString()
    {
        return title + " " + author + " " + bookID;
    }

    /**
     * int compareTo(Borrower borrower) - 두 객체의 학번을 비교하여 사전순으로
     * 크면 양수 작으면 음수 동일하다면 0을 반환하는 메소드
     *
     * @param  이용자 객체
     * @return 두개의 이용자 객체 간의 비교 결과(양수, 0, 음수)
     */
    public int compareTo(Book book)
    {
        return bookID.compareTo(book.getID());
    }
}