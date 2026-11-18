package TeamProject.DataBase;
import TeamProject.DB_Elements.*;
import java.util.* ; 
/**
 * ReturnDB : 반납 DB
 *
 * @author (2025957072 강서윤, 2025320018 진시원)
 * @version (2026-11-18)
 */
public class ReturnDB
{
    public HashMap<String,ArrayList<ReturnObject>> returnElements ; 

    /**
     * ReturnDB 클래스의 객체 생성자
     */
    public ReturnDB()
    {
        this.returnElements = new HashMap<String,ArrayList<ReturnObject>> () ; 
        System.out.println("반납 DB가 생성되었습니다.") ;
    }

    /**
     * saveReturnObject() 
     *
     * @param  반납 객체 
     */
    public void saveReturnObject(ReturnObject returnObject)
    {
        // 학번 찾기 (returnElements의 key)
        String borrowerID = returnObject.getBorrowerID() ; 

        
        ArrayList<ReturnObject> al ; 

        if (returnElements.containsKey(borrowerID)==false){ // 이용자가 반납을 처음 하는 경우 --> ArrayList 생성 필요 
            al = new ArrayList<ReturnObject> () ; 
            al.add(returnObject) ;
        } else {                                            // 이용자가 반납이 처음이 아닌 경우 ---> ArrayList 이미 존재 
            al = returnElements.get(borrowerID) ;
            al.add(returnObject) ; 
        }
        
        System.out.println("반납 객체를 반납DB에 저장했습니다") ; 
    }
}