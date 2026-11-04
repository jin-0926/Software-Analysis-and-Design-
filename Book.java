
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
    private String status;
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
        System.out.println("Book 객체가 생성되었습니다.");
    }

    /**
     * setStatus 대출 여부를 설정하는 메소드
     *
     * @param 책의 대출여부
     */
    public void setStatus(String status)
    {
        System.out.println("Book의 대출 여부가 설정되었습니다.");
    }
}