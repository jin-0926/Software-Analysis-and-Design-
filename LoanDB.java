import java.util.* ; 
/**
 * LoanDB 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class LoanDB
{
    private ArrayList<Loan> loanDB ; 
    
    /**
     * Loan 클래스의 객체 생성자
     */
    public LoanDB()
    {
        loanDB = new ArrayList<Loan> () ;   
        
    }
    
    /**
     * saveLoan() : 대출 DB에 대출 객체(Loan)를 추가/저장하는 메소드 
     *
     * @param  : 대출 객체 (loan)
     */
    public void saveLoan(Loan loan) 
    {
        loanDB.add(loan) ;  
        System.out.println("대출이 성공적으로 완료하였습니다") ; 
    }
}