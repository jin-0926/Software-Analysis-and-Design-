
/**
 * Borrower 책을 빌리는 이용자 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.10.04)
 */
public class Borrower
{
    private String name;
    private String borrowID;
    private int loanCount;
    private Loan loanData;
    /**
     * Borrower 클래스의 객체 생성자
     * 
     * @param 이용자의 이름, 이용자의 학번
     */
    public Borrower(String name, String borrowID)
    {
        this.name = name;
        this.borrowID = borrowID;
        this.loanCount = 0;
        System.out.println("Borrower 객체가 생성되었습니다.");
    }

    /**
     * getLoanCount() 이용자의 현재 대여 수를 반환한다.
     *
     * @return    이용자의 현재 대여 수  
     */
    public int getLoanCount()
    {
        System.out.println("getLoanCount를 실행했습니다..");
        return this.loanCount;
    }

    /**
     * increaseLoanCount() 이용자의 현재 대여 수를 1만큼 증가시킨다.
     *
     */
    public void increaseLoanCount()
    {
        this.loanCount +=1 ; 
        System.out.println("이용자의 현재 대여 수가 1 증가했습니다.");
    }
}