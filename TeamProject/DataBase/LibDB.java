package TeamProject.DataBase;
import TeamProject.DB_Elements.*;
import java.util.*;

/**
 * LibDB 클래스의 설명을 작성하세요.
 *
 * @author (2025320018 진시원)
 * @version (2026.11.18)
 */
public class LibDB<E extends Element>
{
    private TreeSet<E> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        this.db = new TreeSet<E>();
    }

    /**
     * E findElement(String ID) - 고유번호로 객체를 찾아 반환하는 메소드
     *
     * @param  고유 번호(예시: 학번, 책 등록번호)
     * @return 고유번호를 가진 객체, 없다면 null
     */
    public E findElement(String ID)
    {
        for (E element : db){
            if(element.getID().equals(ID)){
                return element;
            }
        }
        return null;
    }

    /**
     * void saveElement(E element) - 데이터 베이스에 데이터를 저장하는 메소드
     *
     * @param  저장할 객체
     */
    public void saveElement(E element)
    {
        if (element != null){
            db.add(element);
        }
        else{
            System.out.println("해당 객체는 존재하지 않습니다.");
        }
    }
}