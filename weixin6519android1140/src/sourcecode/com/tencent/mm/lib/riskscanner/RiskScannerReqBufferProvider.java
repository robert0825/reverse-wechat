package com.tencent.mm.lib.riskscanner;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.c.a.c;
import com.tencent.c.a.c.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class RiskScannerReqBufferProvider
  extends ContentProvider
{
  public static final Uri CONTENT_URI;
  
  static
  {
    GMTrace.i(17533398679552L, 130634);
    CONTENT_URI = Uri.parse("content://com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider");
    GMTrace.o(17533398679552L, 130634);
  }
  
  public RiskScannerReqBufferProvider()
  {
    GMTrace.i(17532190720000L, 130625);
    GMTrace.o(17532190720000L, 130625);
  }
  
  private Bundle aU(Context paramContext)
  {
    GMTrace.i(17532593373184L, 130628);
    final Bundle[] arrayOfBundle = new Bundle[1];
    arrayOfBundle[0] = null;
    try
    {
      a.ya();
      c.a(paramContext, new c.a()
      {
        public final void e(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(17533667115008L, 130636);
          a.fm(paramAnonymousInt);
          Bundle[] arrayOfBundle = arrayOfBundle;
          Bundle localBundle = new Bundle();
          arrayOfBundle[0] = localBundle;
          if ((paramAnonymousInt == 0) && (paramAnonymousArrayOfByte != null))
          {
            localBundle.putInt("errCode", paramAnonymousInt);
            localBundle.putByteArray("reqBufferBase64", paramAnonymousArrayOfByte);
          }
          GMTrace.o(17533667115008L, 130636);
        }
      });
      paramContext = arrayOfBundle[0];
      GMTrace.o(17532593373184L, 130628);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        a.c(paramContext);
      }
    }
  }
  
  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    GMTrace.i(17532459155456L, 130627);
    if ("prepareReqBuffer".equals(paramString1))
    {
      w.i("MicroMsg.RiskScannerReqBufferProvider", "invoke method: %s, with arg: %s, extras: %s", new Object[] { paramString1, paramString2, paramBundle });
      paramString1 = aU(getContext());
      GMTrace.o(17532459155456L, 130627);
      return paramString1;
    }
    w.w("MicroMsg.RiskScannerReqBufferProvider", "unknown method: %s", new Object[] { paramString1 });
    paramString1 = new Bundle[] { null }[0];
    GMTrace.o(17532459155456L, 130627);
    return paramString1;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(17533130244096L, 130632);
    GMTrace.o(17533130244096L, 130632);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(17532861808640L, 130630);
    GMTrace.o(17532861808640L, 130630);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(17532996026368L, 130631);
    GMTrace.o(17532996026368L, 130631);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(17532324937728L, 130626);
    w.i("MicroMsg.RiskScannerReqBufferProvider", "onCreate called.");
    GMTrace.o(17532324937728L, 130626);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(17532727590912L, 130629);
    GMTrace.o(17532727590912L, 130629);
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(17533264461824L, 130633);
    GMTrace.o(17533264461824L, 130633);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\lib\riskscanner\RiskScannerReqBufferProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */