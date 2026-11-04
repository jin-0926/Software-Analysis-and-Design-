
/**
 * Loan 이용자 객체와 책 객체를 입력받아 대출객체를 만드는 class
 *
 * @author (2025320018 진시원)
 * @version (2026.11.04)
 */
public class Loan
{
    private Borrower borrower;
    private Book book;

    /**
     * Loan 클래스의 객체 생성자
     * 
     * @param 이용자 객체, 책 객체
     */
    public Loan(Borrower borrower, Book book)
    {
        System.out.println("Loan 객체가 생성되었습니다.");
    }
}