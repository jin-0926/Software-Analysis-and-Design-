import java.util.* ; 
/**
 * BorrowerDB 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-04)
 */
public class BorrowerDB
{
    private ArrayList<Borrower> borrowerDB; 

    
    /**
     * NewLibMS 클래스의 객체 생성자
     */
    public BorrowerDB()
    {
          borrowerDB = new ArrayList<Borrower> () ; 
        
    }
    
    /**
     * findBorrower() : 이용자 아이디(userID)를 토대로 이용자 DB 내 이용자를 찾아내어 이용자 객체를 반환하는 메소드
     *
     * @param     이용자 등록 번호(borrowerID)
     * @return    이용자 객체 (Borrower)
     */
    public Borrower findBorrower(String borrowerID)
    {
        Borrower borower = new Borrower(borrowerID) ; // 향후 getID() 를 추가할 예정 
        
        Iterator<Borrower> it = bookDB.iterator() ; 
        
        while(it.hasNext()) {
            Borrower borrower = it.next() ; 
            if (borrower == null) { // 이용자가 시스템에 등록되어 있지 않은 경우 , 
                System.out.println("등록되지 않은 이용자입니다. 대출이 불가능합니다.") ; 
                return null ; 
            }
            else {
                System.out.println("이용자가 등록되어 있어 대출이 가능합니다. ") ; 
            }
        }
        return borrower ; 
    }

    /**
     * saveBorrower() : 이용자 객체를 이용자 DB에 저장하는 메소드
     *
     * @param     이용자 객체 (borrower)
     */
    public void saveBorrower(Borrower borrower)
    {
        borrowerDB.saveBorrower(borrower) ; 
        
        System.out.pritnln("test : saveBorower 메소드 정상 작동")
    }
}