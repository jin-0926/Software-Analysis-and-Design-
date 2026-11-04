
/**
 * Book 책의 정보를 담은 책 객체를 생성하는 클래스
 *
 * @author (2025320018 진시원)
 * @version (2026.11.04)
 */
public class Book
{
    private String title;
    private String athor;
    private String bookID;
    private String status;
    /**
     * Book 클래스의 객체 생성자
     * 
     * @param 제목, 저자, 책 등록번호
     */
    public Book(String title, String author, String bookID)
    {
        System.out.println("Book 객체가 생성되었습니다.");
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param 책의 대출여부
     */
    public void setStatus(String status)
    {
        System.out.println("Book 객체가 생성되었습니다.");
    }
}