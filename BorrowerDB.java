import java.util.* ; 
/**
 * BorrowerDB : 이용자 정보들을 저장하는 데이터 베이스를 수현하는 클래스. 
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
        Iterator<Borrower> it = borrowerDB.iterator() ; 
        
        Borrower borrower = null ; 
        while(it.hasNext()) {
            borrower = it.next() ; 
            if (borrower == null) { // 이용자가 시스템에 등록되어 있지 않은 경우 , 
                System.out.println("이미 등록된 이용자여서 신규 등록이 불가합니다") ; // Seq Dgm 대로 작성 
                return null ; 
            }
            else {
                System.out.println("신규 이용자 등록이 가능합니다. ") ; 
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
        borrowerDB.add(borrower) ; 
        
        System.out.println("test : saveBorower 메소드 정상 작동 - 신규 이용자 등록 ! ") ; 
    }
}