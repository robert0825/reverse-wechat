package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.List;

public final class a
  implements IDiffDevOAuth
{
  public List<OAuthListener> c;
  public d d;
  private OAuthListener e;
  public Handler handler;
  
  public a()
  {
    GMTrace.i(4026531840L, 30);
    this.handler = null;
    this.c = new ArrayList();
    this.e = new b(this);
    GMTrace.o(4026531840L, 30);
  }
  
  public final void addListener(OAuthListener paramOAuthListener)
  {
    GMTrace.i(4429185024L, 33);
    if (!this.c.contains(paramOAuthListener)) {
      this.c.add(paramOAuthListener);
    }
    GMTrace.o(4429185024L, 33);
  }
  
  public final boolean auth(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, OAuthListener paramOAuthListener)
  {
    GMTrace.i(4160749568L, 31);
    Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + paramString1);
    if ((paramString1 == null) || (paramString1.length() <= 0) || (paramString2 == null) || (paramString2.length() <= 0))
    {
      Log.d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", new Object[] { paramString1, paramString2 }));
      GMTrace.o(4160749568L, 31);
      return false;
    }
    if (this.handler == null) {
      this.handler = new Handler(Looper.getMainLooper());
    }
    addListener(paramOAuthListener);
    if (this.d != null)
    {
      Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
      GMTrace.o(4160749568L, 31);
      return true;
    }
    this.d = new d(paramString1, paramString2, paramString3, paramString4, paramString5, this.e);
    paramString1 = this.d;
    if (Build.VERSION.SDK_INT >= 11) {
      paramString1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
    for (;;)
    {
      GMTrace.o(4160749568L, 31);
      return true;
      paramString1.execute(new Void[0]);
    }
  }
  
  public final void detach()
  {
    GMTrace.i(4831838208L, 36);
    Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
    this.c.clear();
    stopAuth();
    GMTrace.o(4831838208L, 36);
  }
  
  public final void removeAllListeners()
  {
    GMTrace.i(4697620480L, 35);
    this.c.clear();
    GMTrace.o(4697620480L, 35);
  }
  
  public final void removeListener(OAuthListener paramOAuthListener)
  {
    GMTrace.i(4563402752L, 34);
    this.c.remove(paramOAuthListener);
    GMTrace.o(4563402752L, 34);
  }
  
  public final boolean stopAuth()
  {
    GMTrace.i(4294967296L, 32);
    Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
    for (;;)
    {
      try
      {
        d locald = this.d;
        if (locald != null) {
          continue;
        }
        bool = true;
      }
      catch (Exception localException)
      {
        Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + localException.getMessage());
        boolean bool = false;
        continue;
      }
      this.d = null;
      GMTrace.o(4294967296L, 32);
      return bool;
      bool = this.d.a();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */