
/**
 * BorrowerDB 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class BorrowerDB
{
    private ArrayList<Borrower> bookDB ; 

    
    // 클래스 다이어그램에 반영되지 않은 부분
    // 생성자 
    // public BorrowerDB() {
    //    this.bookDB = new ArrayList<Borrower> ; 
    //}
    
    /**
     * findBorrower()
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public Borrower findBorrower(String stID)
    {
        Borrower borower = new Borrower(stID) ;
        
        
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void saveBorrower(Borrower borrower)
    {
        // bookDB.add(borrower) ; 
    }


}