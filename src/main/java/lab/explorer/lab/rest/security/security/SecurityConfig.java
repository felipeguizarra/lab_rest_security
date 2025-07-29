package lab.explorer.lab.rest.security.security;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    private static final Dotenv dotenv = Dotenv.load(); // Carrega o .env

    public void setPrefix(String prefix){
        PREFIX = prefix;
    }
    public void setKey(String key){
        KEY = dotenv.get("SECRET_KEY");

        if (KEY == null || KEY.length() < 32) {
            throw new IllegalArgumentException("A variável SECRET_KEY não está definida ou possui menos de 32 caracteres.");
        }
    }
    public void setExpiration(Long expiration){
        EXPIRATION = expiration;
    }

}
