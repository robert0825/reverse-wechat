package c.t.m.g;

import android.text.TextUtils;
import java.util.concurrent.ThreadPoolExecutor;

public final class g
  implements d
{
  private static g a = new g();
  
  public static g a()
  {
    return a;
  }
  
  public final e a(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("url is empty");
    }
    return new i(paramString, paramArrayOfByte);
  }
  
  public final f a(e parame)
  {
    int i = 0;
    if (parame == null) {
      throw new RuntimeException("execute...IHttpRequest is null");
    }
    if (!(parame instanceof i)) {
      throw new RuntimeException("execute...IHttpRequest should be create by API:createRequest");
    }
    i locali = (i)parame;
    locali.k = ce.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss");
    u.a("app_http_use_proxy", 0, 1, 0);
    parame = new k(locali);
    if (locali.g <= 0)
    {
      locali.a(parame.a());
      parame = locali.d();
      if (i != 0) {
        locali.j = true;
      }
      if (parame != null) {
        break label169;
      }
      parame = new ah(-14, "force return timeout:" + locali.g);
    }
    label169:
    for (;;)
    {
      return new f(parame);
      w.a.a.a.execute(new h(parame, locali));
      if (locali.c()) {
        break;
      }
      i = 1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */