package com.tencent.mm.plugin.hp.tinker;

import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.modelmulti.n;
import com.tencent.mm.modelmulti.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public class TinkerPatchResultService
  extends DefaultTinkerResultService
{
  public TinkerPatchResultService()
  {
    GMTrace.i(5756061483008L, 42886);
    GMTrace.o(5756061483008L, 42886);
  }
  
  public final void a(com.tencent.tinker.lib.service.a parama)
  {
    int j = 1;
    GMTrace.i(5756195700736L, 42887);
    if (parama == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchResultService", "TinkerPatchResultService received null result!!!!", new Object[0]);
      GMTrace.o(5756195700736L, 42887);
      return;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", new Object[] { parama.toString() });
    new ae(Looper.getMainLooper()).postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5755390394368L, 42881);
        com.tencent.tinker.lib.e.a.w("Tinker.TinkerPatchResultService", "actually kill tinker patch service!", new Object[0]);
        com.tencent.tinker.lib.e.b.hR(TinkerPatchResultService.this.getApplicationContext());
        GMTrace.o(5755390394368L, 42881);
      }
    }, 10000L);
    if (parama.eFN)
    {
      Object localObject = MMApplicationLike.getTinkerApplicationLike();
      int i = j;
      if (com.tencent.tinker.lib.d.b.b((ApplicationLike)localObject))
      {
        localObject = com.tencent.tinker.lib.d.b.c((ApplicationLike)localObject);
        i = j;
        if (!ShareTinkerInternals.nm((String)localObject))
        {
          i = j;
          if (parama.ygl != null)
          {
            i = j;
            if (parama.ygl.equals(localObject)) {
              i = 0;
            }
          }
        }
      }
      if (i != 0)
      {
        new n(ab.getContext(), new n.a()
        {
          public final void bx(boolean paramAnonymousBoolean)
          {
            GMTrace.i(5751766515712L, 42854);
            if (!paramAnonymousBoolean)
            {
              com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchResultService", "app is background now, i can kill quietly", new Object[0]);
              w.bPN();
              BaseEvent.onDestroy();
              Process.killProcess(Process.myPid());
            }
            GMTrace.o(5751766515712L, 42854);
          }
        });
        GMTrace.o(5756195700736L, 42887);
        return;
      }
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!", new Object[0]);
    }
    GMTrace.o(5756195700736L, 42887);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\TinkerPatchResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */