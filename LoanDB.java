import java.util.* ; 
/**
 * LoanDB : 대출 DB
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class LoanDB
{
    private ArrayList<Loan> loanElements; 

    /**
     * Loan 클래스의 객체 생성자
     */
    public LoanDB()
    {
        this.loanElements = new ArrayList<Loan> () ;   
        System.out.println("대출 DB가 생성되었습니다 !") ; 
    }

    /**
     * saveLoan() : 대출 DB에 대출 객체(Loan)를 추가/저장하는 메소드 
     *
     * @param  : 대출 객체 (loan)
     */
    public void saveLoan(Loan loan) 
    {
        loanElements.add(loan) ;  
        System.out.println("대출이 성공적으로 완료하였습니다") ; 
    }

    /**
     * deleteLoan() : 대출DB 내 대출 객체를 삭제하는 메소드
     *
     * @param    : 대출 객체 (loan)
     */
    public void deleteLoan(Loan loan)
    {
        loanElements.remove(loan) ; 
    }

}