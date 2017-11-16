package com.tencent.mm.plugin.gcm.modelgcm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public class a
  implements com.tencent.mm.ad.e
{
  private static a meQ;
  public Context context;
  public int meO;
  private int meP;
  public com.google.android.gms.gcm.a meR;
  
  private a(Context paramContext)
  {
    GMTrace.i(8013737885696L, 59707);
    this.meO = 3;
    this.meP = 0;
    this.context = paramContext;
    GMTrace.o(8013737885696L, 59707);
  }
  
  public static a aGV()
  {
    GMTrace.i(8013872103424L, 59708);
    w.i("GcmRegister", "GCM getInstance");
    if (meQ != null)
    {
      localObject = meQ;
      GMTrace.o(8013872103424L, 59708);
      return (a)localObject;
    }
    Object localObject = ab.getContext();
    if (localObject == null)
    {
      w.e("GcmRegister", "GCM appcontext null");
      GMTrace.o(8013872103424L, 59708);
      return null;
    }
    localObject = new a((Context)localObject);
    meQ = (a)localObject;
    GMTrace.o(8013872103424L, 59708);
    return (a)localObject;
  }
  
  private SharedPreferences aGY()
  {
    GMTrace.i(8014274756608L, 59711);
    SharedPreferences localSharedPreferences = this.context.getSharedPreferences(a.class.getSimpleName(), 0);
    GMTrace.o(8014274756608L, 59711);
    return localSharedPreferences;
  }
  
  private static int cE(Context paramContext)
  {
    int i = 0;
    GMTrace.i(8014408974336L, 59712);
    try
    {
      int j = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      i = j;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        w.e("GcmRegister", "Could not get package name.");
      }
    }
    GMTrace.o(8014408974336L, 59712);
    return i;
  }
  
  static boolean cF(Context paramContext)
  {
    GMTrace.i(8015214280704L, 59718);
    try
    {
      int i = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
      if (i < 8)
      {
        GMTrace.o(8015214280704L, 59718);
        return false;
      }
      i = com.google.android.gms.common.e.x(paramContext);
      if (i != 0)
      {
        w.w("GcmRegister", "device not support GCM reason = " + i);
        GMTrace.o(8015214280704L, 59718);
        return false;
      }
    }
    catch (Throwable paramContext)
    {
      w.e("GcmRegister", paramContext.toString());
      GMTrace.o(8015214280704L, 59718);
      return false;
    }
    GMTrace.o(8015214280704L, 59718);
    return true;
  }
  
  private void fc(boolean paramBoolean)
  {
    GMTrace.i(8014945845248L, 59716);
    Object localObject = aGY();
    w.i("GcmRegister", "Saving regSvrResult: " + paramBoolean);
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putBoolean("isRegToSvr", paramBoolean);
    ((SharedPreferences.Editor)localObject).commit();
    if (paramBoolean)
    {
      this.meP = aa.OY().hgw.ww();
      GMTrace.o(8014945845248L, 59716);
      return;
    }
    this.meP = 0;
    GMTrace.o(8014945845248L, 59716);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8015348498432L, 59719);
    w.i("GcmRegister", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    paramk.guc = true;
    if (paramk == null)
    {
      GMTrace.o(8015348498432L, 59719);
      return;
    }
    if ((paramk instanceof e))
    {
      boolean bool = false;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bool = true;
        w.i("GcmRegister", "NetScenePushReg success.");
        d.oqe.a(452L, 16L, 1L, false);
      }
      for (;;)
      {
        fc(bool);
        GMTrace.o(8015348498432L, 59719);
        return;
        w.i("GcmRegister", "NetScenePushReg faild.");
        d.oqe.a(452L, 17L, 1L, false);
      }
    }
    if ((paramk instanceof f))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label200;
      }
      w.i("GcmRegister", "NetScenePushUnReg success.");
      d.oqe.a(452L, 23L, 1L, false);
    }
    for (;;)
    {
      fc(false);
      GMTrace.o(8015348498432L, 59719);
      return;
      label200:
      w.e("GcmRegister", "NetScenePushUnReg faild.");
      d.oqe.a(452L, 24L, 1L, false);
    }
  }
  
  public final void aGW()
  {
    GMTrace.i(8014006321152L, 59709);
    w.i("GcmRegister", "checkregister");
    aa.OW().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8018167070720L, 59740);
        w.e("GcmRegister", "onCreate~~~threadID:" + Thread.currentThread());
        a locala = a.aGV();
        if (locala != null)
        {
          w.i("GcmRegister", "doRegist~~~");
          String str = locala.aGX();
          w.i("GcmRegister", "regid = " + str);
          if (a.cF(locala.context))
          {
            locala.meR = com.google.android.gms.gcm.a.E(locala.context);
            if ((str == null) || (str.length() == 0))
            {
              new a.a(locala).execute(new Void[] { null, null, null });
              GMTrace.o(8018167070720L, 59740);
              return;
            }
            locala.aGZ();
            GMTrace.o(8018167070720L, 59740);
            return;
          }
          w.i("GcmRegister", "Google Play Services Unavailable.");
          g.ork.A(11250, "2,0");
          d.oqe.a(452L, 0L, 1L, false);
          if (locala.aHb())
          {
            locala.aGX();
            locala.aHa();
          }
        }
        GMTrace.o(8018167070720L, 59740);
      }
    }, 5000L);
    GMTrace.o(8014006321152L, 59709);
  }
  
  @SuppressLint({"NewApi"})
  public final String aGX()
  {
    GMTrace.i(8014140538880L, 59710);
    SharedPreferences localSharedPreferences = aGY();
    String str = localSharedPreferences.getString("registration_id", "");
    if (str.length() == 0)
    {
      w.i("GcmRegister", "Registration not found.");
      d.oqe.a(452L, 1L, 1L, false);
      GMTrace.o(8014140538880L, 59710);
      return "";
    }
    if (localSharedPreferences.getInt("appVersion", Integer.MIN_VALUE) != cE(this.context))
    {
      w.i("GcmRegister", "App version changed.");
      d.oqe.a(452L, 2L, 1L, false);
      GMTrace.o(8014140538880L, 59710);
      return "";
    }
    if (bg.aG(localSharedPreferences.getLong("regtime", 0L)) > 259200L)
    {
      w.i("GcmRegister", "gcm regid timeout");
      d.oqe.a(452L, 3L, 1L, false);
      GMTrace.o(8014140538880L, 59710);
      return "";
    }
    d.oqe.a(452L, 4L, 1L, false);
    GMTrace.o(8014140538880L, 59710);
    return str;
  }
  
  public final void aGZ()
  {
    GMTrace.i(8014543192064L, 59713);
    d.oqe.a(452L, 11L, 1L, false);
    int i = aa.OY().hgw.ww();
    if ((this.meP != 0) && (i == this.meP))
    {
      w.i("GcmRegister", "uin already reg to weixin svr:" + this.meP);
      d.oqe.a(452L, 12L, 1L, false);
      GMTrace.o(8014543192064L, 59713);
      return;
    }
    String str = aGX();
    if ((str == null) || (str.length() == 0))
    {
      w.i("GcmRegister", "sendRegistrationIdToBackend regid is empty.");
      d.oqe.a(452L, 13L, 1L, false);
      GMTrace.o(8014543192064L, 59713);
      return;
    }
    w.i("GcmRegister", "regToWeixinServer.");
    try
    {
      new e(str, i).a(aa.OY(), this);
      d.oqe.a(452L, 14L, 1L, false);
      GMTrace.o(8014543192064L, 59713);
      return;
    }
    catch (Throwable localThrowable)
    {
      d.oqe.a(452L, 15L, 1L, false);
      w.e("GcmRegister", "NetScenePushReg doScene error:" + localThrowable.toString());
      GMTrace.o(8014543192064L, 59713);
    }
  }
  
  public final void aHa()
  {
    GMTrace.i(8014677409792L, 59714);
    w.i("GcmRegister", "unregToWeixinServer");
    d.oqe.a(452L, 18L, 1L, false);
    String str = aGX();
    if ((str == null) || (str.length() == 0))
    {
      w.e("GcmRegister", "unregToWeixinServer regid is empty.");
      d.oqe.a(452L, 19L, 1L, false);
      GMTrace.o(8014677409792L, 59714);
      return;
    }
    if (!aHb())
    {
      w.e("GcmRegister", "is not reg to Svr. no need unreg.");
      d.oqe.a(452L, 20L, 1L, false);
      GMTrace.o(8014677409792L, 59714);
      return;
    }
    fc(false);
    try
    {
      new f(str, aa.OY().hgw.ww()).a(aa.OY(), this);
      d.oqe.a(452L, 21L, 1L, false);
      GMTrace.o(8014677409792L, 59714);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.e("GcmRegister", "NetScenePushUnReg doScene error:" + localThrowable.toString());
      d.oqe.a(452L, 22L, 1L, false);
      GMTrace.o(8014677409792L, 59714);
    }
  }
  
  public final boolean aHb()
  {
    GMTrace.i(8015080062976L, 59717);
    boolean bool = aGY().getBoolean("isRegToSvr", false);
    GMTrace.o(8015080062976L, 59717);
    return bool;
  }
  
  public final void ad(Context paramContext, String paramString)
  {
    GMTrace.i(8014811627520L, 59715);
    SharedPreferences localSharedPreferences = aGY();
    int i = cE(paramContext);
    w.i("GcmRegister", "Saving regId on app version " + i);
    paramContext = localSharedPreferences.edit();
    paramContext.putString("registration_id", paramString);
    paramContext.putInt("appVersion", i);
    paramContext.putLong("regtime", bg.Pu());
    paramContext.commit();
    GMTrace.o(8014811627520L, 59715);
  }
  
  final class a
    extends AsyncTask<Void, Void, String>
  {
    a()
    {
      GMTrace.i(8012395708416L, 59697);
      GMTrace.o(8012395708416L, 59697);
    }
    
    private String aHc()
    {
      GMTrace.i(8012529926144L, 59698);
      int n = 0;
      int i1 = 0;
      int m = 0;
      d.oqe.a(452L, 5L, 1L, false);
      i = m;
      j = n;
      k = i1;
      for (;;)
      {
        try
        {
          w.i("GcmRegister", "RegisterAsyncTask doInBackground.");
          i = m;
          j = n;
          k = i1;
          if (a.this.meR == null)
          {
            i = m;
            j = n;
            k = i1;
            a.this.meR = com.google.android.gms.gcm.a.E(a.this.context);
          }
          i = m;
          j = n;
          k = i1;
          String str2 = a.this.meR.b(new String[] { "546136561403" });
          i = m;
          j = n;
          k = i1;
          str1 = "Device registered, registration ID=" + str2;
          if (str2 == null) {
            continue;
          }
          i = m;
          j = n;
          k = i1;
          if (str2.length() <= 0) {
            continue;
          }
          i = m;
          j = n;
          k = i1;
          a.this.ad(a.this.context, str2);
          i = m;
          j = n;
          k = i1;
          a.this.aGZ();
          j = 1;
          k = 1;
          i = 1;
          d.oqe.a(452L, 6L, 1L, false);
          i = 1;
        }
        catch (IOException localIOException)
        {
          str1 = "Device register Error :" + localIOException.getMessage();
          w.printErrStackTrace("GcmRegister", localIOException, "", new Object[0]);
          g.ork.A(11250, "2,1");
          d.oqe.a(452L, 8L, 1L, false);
          continue;
        }
        catch (SecurityException localSecurityException)
        {
          a.this.meO = 0;
          str1 = "Device register Error :" + localSecurityException.getMessage();
          w.printErrStackTrace("GcmRegister", localSecurityException, "", new Object[0]);
          g.ork.A(11250, "2,1");
          d.oqe.a(452L, 9L, 1L, false);
          i = j;
          continue;
        }
        catch (Exception localException)
        {
          String str1 = "Device register Error :" + localException.getMessage();
          w.printErrStackTrace("GcmRegister", localException, "", new Object[0]);
          g.ork.A(11250, "2,1");
          d.oqe.a(452L, 10L, 1L, false);
          i = k;
          continue;
        }
        w.i("GcmRegister", str1);
        if ((i == 0) && (a.this.meO > 0))
        {
          a.this.meO -= 1;
          a.this.aGW();
        }
        GMTrace.o(8012529926144L, 59698);
        return str1;
        i = m;
        j = n;
        k = i1;
        g.ork.A(11250, "2,1");
        i = m;
        j = n;
        k = i1;
        d.oqe.a(452L, 7L, 1L, false);
        i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */