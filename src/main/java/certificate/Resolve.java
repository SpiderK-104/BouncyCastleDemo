package certificate;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class Resolve {
    public static X500Name createCertDn(String certDn) {
        // 解析字符串形式的 X.500 名称并构建 X500Name 对象
        X500NameBuilder builder = new X500NameBuilder(BCStyle.INSTANCE);
        // 以，分割字符串，每个字段为一个RDN
        String[] fields = certDn.split(",");
        // 遍历每个字段，解析出属性和值
        for (String field : fields) {
            String[] keyValue = field.split("=");
            // 判断字段个数是否为2，保证每个字段key和value都有值
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                builder.addRDN(BCStyle.INSTANCE.attrNameToOID(key), value);
            }
        }
        return builder.build();
    }

    public static void main(String[] args) {
        String certDn = "CN=张三+OU=测试, O=PQC\n";
        // 标准解析方式
        X500Name x500Name = new X500Name(certDn);
        System.out.println("解析结果：");
        System.out.println(x500Name);
    }
}
