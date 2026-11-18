
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-11-18)
 */
public class MyApp
{
    public static void main(String[] args) {
        NewLibMS libMS = new NewLibMS();
        libMS.registerBorrower("노트","1234567890ABCDEG");
        libMS.registerBook("소분설","황석형","1234567891235");
        libMS.registerBook("응용","황석형","1234567891234");
        libMS.borrowBook("1234567890ABCDEG","1234567891235");
        libMS.borrowBook("1234567890ABCDEG","1234567891234");
        libMS.returnBook("1234567891235");
    }
}