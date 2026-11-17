import java.util.*;
import java.time.*;
/**
 * Loan 이용자 객체와 책 객체를 입력받아 대출객체를 만드는 class
 *
 * @author (2025320018 진시원)
 * @version (2026.11.16)
 */
public class Loan
{
    private Borrower borrower;
    private Book book;
    private LocalDate loanDate;
    private LocalDate dueDate;
    /**
     * Loan 클래스의 객체 생성자
     * 
     * @param 이용자 객체, 책 객체
     */
    public Loan(Borrower borrower, Book book)
    {
        this.borrower = borrower;
        this.book = book;

        borrower.attachLoan(this);
        book.attachLoan(this) ; 

        this.loanDate = LocalDate.now();
        this.dueDate = this.loanDate.plusDays(15);

        System.out.println("Loan 객체가 생성되었습니다.");
    }

    /**
     * getBorrower() - 대출한 이용자를 반환하는 메소드 
     *
     *@return  이용자
     */
    public Borrower getBorrower()
    {
        return borrower;
    }

    /**
     * getLoanDate() - 대출일을 반환하는 메소드 
     *
     * @return   대출일
     */
    public LocalDate getLoanDate() 
    {
        return loanDate ; 
    }

}