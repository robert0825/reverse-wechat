package com.tencent.mm.u;

import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class g
{
  public static volatile int fXN;
  private static volatile boolean fXO;
  
  static
  {
    GMTrace.i(20794889469952L, 154934);
    fXN = 0;
    fXO = false;
    GMTrace.o(20794889469952L, 154934);
  }
  
  public static JSONObject eC(String paramString)
  {
    GMTrace.i(20794084163584L, 154928);
    if (!fXO) {
      initialize();
    }
    if (fXN == 2)
    {
      paramString = new h(paramString);
      GMTrace.o(20794084163584L, 154928);
      return paramString;
    }
    paramString = new JSONObject(paramString);
    GMTrace.o(20794084163584L, 154928);
    return paramString;
  }
  
  public static c eD(String paramString)
  {
    GMTrace.i(20794352599040L, 154930);
    if (fXN == 2)
    {
      paramString = new k(paramString);
      GMTrace.o(20794352599040L, 154930);
      return paramString;
    }
    paramString = new d(paramString);
    GMTrace.o(20794352599040L, 154930);
    return paramString;
  }
  
  public static void fd(int paramInt)
  {
    GMTrace.i(20794621034496L, 154932);
    fXN = paramInt;
    fXO = true;
    GMTrace.o(20794621034496L, 154932);
  }
  
  public static void initialize()
  {
    GMTrace.i(20793949945856L, 154927);
    com.tencent.mm.bv.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20806700630016L, 155022);
        Object localObject = a.b.fVY;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.er("100295");
        if (localObject == null)
        {
          w.i("MicroMsg.JSONFactory", "JSON lib type ABTest item is null.");
          GMTrace.o(20806700630016L, 155022);
          return;
        }
        if (!((com.tencent.mm.storage.c)localObject).isValid())
        {
          g.fd(2);
          GMTrace.o(20806700630016L, 155022);
          return;
        }
        try
        {
          g.fd(bg.getInt((String)((com.tencent.mm.storage.c)localObject).bSg().get("jsonLibType"), 2));
          w.i("MicroMsg.JSONFactory", "current jsonLibType is : %d", new Object[] { Integer.valueOf(g.fXN) });
          GMTrace.o(20806700630016L, 155022);
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.JSONFactory", "parse jsonLibType error : %s", new Object[] { Log.getStackTraceString(localException) });
          GMTrace.o(20806700630016L, 155022);
        }
      }
    });
    GMTrace.o(20793949945856L, 154927);
  }
  
  public static c wt()
  {
    GMTrace.i(20794218381312L, 154929);
    if (fXN == 2)
    {
      localObject = new k();
      GMTrace.o(20794218381312L, 154929);
      return (c)localObject;
    }
    Object localObject = new d();
    GMTrace.o(20794218381312L, 154929);
    return (c)localObject;
  }
  
  public static a wu()
  {
    GMTrace.i(20794486816768L, 154931);
    if (fXN == 2)
    {
      localObject = new j();
      GMTrace.o(20794486816768L, 154931);
      return (a)localObject;
    }
    Object localObject = new b();
    GMTrace.o(20794486816768L, 154931);
    return (a)localObject;
  }
  
  public static int wv()
  {
    GMTrace.i(20794755252224L, 154933);
    int i = fXN;
    GMTrace.o(20794755252224L, 154933);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */