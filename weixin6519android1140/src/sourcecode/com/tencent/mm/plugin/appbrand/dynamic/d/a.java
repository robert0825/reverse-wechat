package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.g;
import com.tencent.mm.y.u.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public a(int paramInt)
  {
    super("drawCanvas", paramInt);
    GMTrace.i(19928379817984L, 148478);
    GMTrace.o(19928379817984L, 148478);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    GMTrace.i(20776098988032L, 154794);
    com.tencent.mm.plugin.appbrand.collector.c.aM(com.tencent.mm.plugin.appbrand.dynamic.g.d.g(paramJSONObject), "before_jsapi_invoke");
    u.b localb = parama.wr();
    String str1 = localb.getString("__page_view_id", null);
    String str2 = localb.getString("__process_name", ab.vM());
    if (com.tencent.mm.plugin.appbrand.dynamic.d.UO().pG(str1) == null)
    {
      w.w("MicroMsg.JsApiFunc_DrawCanvas", "get view by viewId(%s) return null.", new Object[] { str1 });
      parama1.ap(a(false, "got 'null' when get view by the given viewId", null));
      GMTrace.o(20776098988032L, 154794);
      return;
    }
    for (;;)
    {
      try
      {
        long l2 = System.currentTimeMillis();
        parama = pM("lastTime");
        if (TextUtils.isEmpty(parama)) {
          break label310;
        }
        parama = localb.gmH.get(parama);
        if (!(parama instanceof Long)) {
          break label310;
        }
        l1 = ((Long)parama).longValue();
        l1 = l2 - l1;
        a locala = (a)localb.get(pM("DrawCanvasRunnable"), null);
        parama = locala;
        if (locala == null)
        {
          parama = new a();
          localb.o(pM("DrawCanvasRunnable"), parama);
        }
        parama.process = str2;
        parama.hTy = str1;
        parama.hTz = paramJSONObject;
        parama.hTA = this;
        parama.hTB = parama1;
        parama.hTC = localb;
        com.tencent.mm.plugin.appbrand.dynamic.b.UM().removeCallbacks(parama);
        if (l1 < 16L)
        {
          w.v("MicroMsg.JsApiFunc_DrawCanvas", "postDelayed(%s)", new Object[] { Long.valueOf(l1) });
          com.tencent.mm.plugin.appbrand.dynamic.b.UM().postDelayed(parama, l1);
          GMTrace.o(20776098988032L, 154794);
          return;
        }
      }
      finally {}
      parama.run();
      GMTrace.o(20776098988032L, 154794);
      return;
      label310:
      long l1 = 0L;
    }
  }
  
  public final String pM(String paramString)
  {
    GMTrace.i(17754186842112L, 132279);
    paramString = this.name + "#" + paramString;
    GMTrace.o(17754186842112L, 132279);
    return paramString;
  }
  
  private static final class a
    implements Runnable
  {
    a hTA;
    b.a hTB;
    u.b hTC;
    String hTy;
    JSONObject hTz;
    String process;
    
    public a()
    {
      GMTrace.i(17753113100288L, 132271);
      GMTrace.o(17753113100288L, 132271);
    }
    
    public final void run()
    {
      GMTrace.i(17753247318016L, 132272);
      synchronized (this.hTC)
      {
        this.hTC.o(this.hTA.pM("lastTime"), Long.valueOf(System.currentTimeMillis()));
        ??? = new Bundle();
        ((Bundle)???).putString("viewId", this.hTy);
        ((Bundle)???).putString("jsApiInvokeData", this.hTz.toString());
        String str = com.tencent.mm.plugin.appbrand.dynamic.g.d.g(this.hTz);
        CollectSession localCollectSession = com.tencent.mm.plugin.appbrand.collector.c.aM(str, "after_jsapi_invoke");
        ((Bundle)???).putString("__session_id", str);
        ((Bundle)???).putParcelable("__cost_time_session", localCollectSession);
        com.tencent.mm.ipcinvoker.e.a(this.process, (Bundle)???, a.b.class, new com.tencent.mm.ipcinvoker.c()
        {
          public final void k(Bundle paramAnonymousBundle)
          {
            GMTrace.i(17754992148480L, 132285);
            a.a.this.hTB.ap(a.a.this.hTA.a(paramAnonymousBundle.getBoolean("ret"), paramAnonymousBundle.getString("reason", ""), null));
            GMTrace.o(17754992148480L, 132285);
          }
        });
        GMTrace.o(17753247318016L, 132272);
        return;
      }
    }
  }
  
  private static class b
    implements com.tencent.mm.ipcinvoker.a
  {
    private b()
    {
      GMTrace.i(17754589495296L, 132282);
      GMTrace.o(17754589495296L, 132282);
    }
    
    public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18330651983872L, 136574);
      Object localObject1 = paramBundle.getString("__session_id");
      com.tencent.mm.plugin.appbrand.collector.c.a((CollectSession)paramBundle.getParcelable("__cost_time_session"));
      com.tencent.mm.plugin.appbrand.collector.c.aM((String)localObject1, "after_cross_process_invoke");
      Bundle localBundle = new Bundle();
      Object localObject2 = paramBundle.getString("viewId");
      View localView = com.tencent.mm.plugin.appbrand.dynamic.e.UP().pH((String)localObject2);
      if (!(localView instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
      {
        w.i("MicroMsg.JsApiFunc_DrawCanvas", "drawCanvas failed, view is not a instance of DrawableView.(%s)", new Object[] { localObject2 });
        localBundle.putBoolean("ret", false);
        localBundle.putString("reason", "view is not a instance of DrawableView");
        paramc.k(localBundle);
        GMTrace.o(18330651983872L, 136574);
        return;
      }
      for (;;)
      {
        try
        {
          localObject2 = g.eC(paramBundle.getString("jsApiInvokeData"));
          paramBundle = ((JSONObject)localObject2).optJSONArray("actions");
          boolean bool = ((JSONObject)localObject2).optBoolean("reserve");
          com.tencent.mm.plugin.appbrand.collector.c.aM((String)localObject1, "after_cp_parse_json_end");
          if ((localView instanceof com.tencent.mm.plugin.appbrand.collector.d))
          {
            com.tencent.mm.plugin.appbrand.collector.d locald = (com.tencent.mm.plugin.appbrand.collector.d)localView;
            locald.oJ((String)localObject1);
            locald.setStartTime(((JSONObject)localObject2).optLong("__invoke_jsapi_timestamp"));
          }
          localObject1 = (com.tencent.mm.plugin.appbrand.canvas.widget.a)localView;
          if (bool)
          {
            ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).b(paramBundle, null);
            ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).TM();
            localBundle.putBoolean("ret", true);
            paramc.k(localBundle);
            GMTrace.o(18330651983872L, 136574);
            return;
          }
        }
        catch (JSONException paramBundle)
        {
          w.e("MicroMsg.JsApiFunc_DrawCanvas", "drawCanvas failed, IPC parse JSONObject error : %s", new Object[] { paramBundle });
          localBundle.putBoolean("ret", false);
          localBundle.putString("reason", "parse json data error");
          paramc.k(localBundle);
          GMTrace.o(18330651983872L, 136574);
          return;
        }
        ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject1).a(paramBundle, null);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */