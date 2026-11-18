import java.util.* ; 
/**
 * Borrower 책을 빌리는 이용자 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.11.16)
 */
public class Borrower
{
    private String name;
    private String borrowerID;
    
    private LinkedList<Loan> loanData;
    /**
     * Borrower 클래스의 객체 생성자
     * 
     * @param 이용자의 이름, 이용자의 학번
     */
    public Borrower(String name, String borrowerID)
    {
        this.name = name;
        this.borrowerID = borrowerID;
        this.loanData = new LinkedList<Loan>() ; 
        System.out.println("Borrower 객체가 생성되었습니다.");
    }

    /**
     * attachLoan() : 이용자(Borrower)을 대출(Loan)에 연결시키는 메소드 ! 
     *
     * @param   대출 객체 (Loan)
     */
    public void attachLoan(Loan loan)
    {
        this.loanData.add(loan) ; 
    }

    /**
     * getID() - 이용자(borrower)의 학번(borrowID)을 반환하는 메소드
     *
     * @return    이용자의 학번
     */
    public String getID()
    {
        return borrowerID;
    }

    /**
     * isUnderLimit() : 이용자의 대출 가능 권수에 따라 대출 가능 여부를 반환하는 메소드 
     *
     * @return    대출 가능 권수에 따른 대출 가능 여부 
     */
    public boolean isUnderLoanLimit()
    {
        int loanLimit = 3 ; 
        boolean returnValue = false ; 
        if (loanData.size()< loanLimit){
            returnValue = true ; 
        }
        
        if (loanData.size() >= loanLimit){
            returnValue = false ; 
        }
        
        System.out.println("getLoanCount를 실행했습니다..");
        return returnValue ; 
    }

    /**
     * removeLoan(Loan loan) 이용자와 loan 객체의 연결을 끓고 해당 자리를 
     * null로 만드는 메소드
     *
     * @param  책을 반납하는 과정에서 연결된 대출 객체
     */
    public void removeLoan(Loan loan)
    {
        String bookID = loan.getBook().getID() ; 
        
        // LoanData 순회 
        for (Loan loan2 :loanData){
            String bookID2= loan2.getBook().getID() ; 
            if (bookID.equals(bookID2)){
                loanData.remove(loan2) ; 
            }
        }
    }
}