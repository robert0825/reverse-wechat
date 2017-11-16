package org.a.f;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.a.g.c;

public final class a
  implements b
{
  public final String ap(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      org.a.g.d.fP(paramString1, "Base string cant be null or empty string");
      org.a.g.d.fP(paramString2, "Api secret cant be null or empty string");
      paramString2 = new SecretKeySpec((c.encode(paramString2) + '&' + c.encode(paramString3)).getBytes("UTF-8"), "HmacSHA1");
      paramString3 = Mac.getInstance("HmacSHA1");
      paramString3.init(paramString2);
      paramString2 = new String(org.a.g.a.cb(paramString3.doFinal(paramString1.getBytes("UTF-8")))).replace("\r\n", "");
      return paramString2;
    }
    catch (Exception paramString2)
    {
      throw new org.a.b.d(paramString1, paramString2);
    }
  }
  
  public final String ctG()
  {
    return "HMAC-SHA1";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */