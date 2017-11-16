package c.t.m.g;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public final class al
  extends ap
{
  private Object a;
  private ap.a b;
  
  public final boolean a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean, Object paramObject, ap.a parama)
  {
    long l = SystemClock.elapsedRealtime();
    this.b = parama;
    this.a = paramObject;
    if (ce.a(paramArrayOfByte))
    {
      this.b.a(false, this.a);
      return false;
    }
    parama = new HashMap();
    parama.put("B-Length", String.valueOf(paramInt));
    if (paramBoolean) {}
    for (paramObject = "realtime_speed";; paramObject = "hllog")
    {
      parama.put("HLReportCmd", paramObject);
      paramArrayOfByte = new af("https://up-hl.3g.qq.com/upreport", parama, paramArrayOfByte, 20000, ce.d(), true, null);
      paramArrayOfByte.l = false;
      paramArrayOfByte.m = "event";
      paramArrayOfByte = new am(this, paramArrayOfByte, l);
      try
      {
        w.a.a.a.execute(paramArrayOfByte);
        return true;
      }
      catch (Throwable paramArrayOfByte)
      {
        this.b.a(false, this.a);
      }
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */