
/**
 * Element Book과 Borrower 객체에 공통된 사항을 기입한 추상클래스
 *
 * @author (2025320018 진시원)
 * @version (2026-11-18)
 */
public abstract class Element
{
    /**
     * attatchLoan(Loan loan) - 대출객체와 책 또는 이용자를 연결한다.
     *
     * @param  대출객체(Loan)
     */
    public abstract void attatchLoan(Loan loan);

    /**
     * getID() - 학번 또는 책 등록번호를 반환한다.
     *
     * @return  학번 또는 책 등록번호
     */
    public abstract String getID();

    /**
     * removeLoan(Loan loan) - 대출객체와 책 또는 이용자 연결을 끊는다. 
     *
     * @param  대출객체(Loan)
     */
    public abstract void removeLoan(Loan loan);
}