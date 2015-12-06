import com.pineone.url.parser.manager.UrlParserManager;
import org.junit.Test;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class UrlPaserTest {


    UrlParserManager urlparserManager = new UrlParserManager();


    @Test
    public void ParserTest() throws Exception {

        String Host = "http://c.pineone.net:48080/hello";

        urlparserManager.executeURLParser(Host);

        System.out.println("==================================");

    }

    @Test
    public void exceptProtocolAndPortAndSubProject() throws Exception {

        String host = "www.naver.com";

        urlparserManager.executeURLParser(host);

        System.out.println("==================================");

    }

    @Test
    public void exceptonlyPortNum() throws Exception {

        String host = "http://www.naver.com/helloproject";

        urlparserManager.executeURLParser(host);

        System.out.println("==================================");

    }



}
