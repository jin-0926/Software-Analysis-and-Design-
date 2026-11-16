import java.time.*;

/**
 * ReturnObject 책의 반납 기록을 저장하는 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.11.16)
 */
public class ReturnObject
{
    private String borrowerID;
    private String bookID;
    private LocalDate loanDate;
    private LocalDate returnDate;
    /**
     * ReturnObject 클래스의 객체 생성자
     */
    public ReturnObject(String borrowerID, String bookID, LocalDate loanDate)
    {
        this.borrowerID = borrowerID;
        this.bookID = bookID;
        this.loanDate = loanDate;
        this.returnDate = LocalDate.now();
    }

    /**
     * getBorrowerID() - 반납한 이용자의 학번을 반환하는 메소드
     *
     * @return  반납한 이용자의 학번
     */
    public String getBorrowerID()
    {
        return borrowerID;
    }
}