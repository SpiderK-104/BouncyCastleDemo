package init;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

public class Register {
    static {
        // 注册BouncyCastle 提供程序
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }
    public static void init() {
        System.out.println("初始化BouncyProvider...");
    }
}
