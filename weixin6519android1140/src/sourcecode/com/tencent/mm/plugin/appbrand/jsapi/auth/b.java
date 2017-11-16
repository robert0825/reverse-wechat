package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Queue;
import org.json.JSONObject;

abstract class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  b()
  {
    GMTrace.i(18223143583744L, 135773);
    GMTrace.o(18223143583744L, 135773);
  }
  
  protected final MMActivity a(j paramj)
  {
    GMTrace.i(18223680454656L, 135777);
    paramj = super.a(paramj);
    GMTrace.o(18223680454656L, 135777);
    return paramj;
  }
  
  final void a(j paramj, int paramInt, String paramString)
  {
    GMTrace.i(18223546236928L, 135776);
    paramj.v(paramInt, d(paramString, null));
    GMTrace.o(18223546236928L, 135776);
  }
  
  public void a(j arg1, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18223412019200L, 135775);
    final a locala = a.i(???.hzM);
    paramJSONObject = new a.a()
    {
      public final void Wg()
      {
        GMTrace.i(18228512292864L, 135813);
        w.i("MicroMsg.AppBrand.BaseAuthJsApi", "about to call AuthInvoke, api[%s]", new Object[] { b.this.getName() });
        b.this.a(paramj, paramJSONObject, paramInt, locala);
        GMTrace.o(18228512292864L, 135813);
      }
      
      public final String toString()
      {
        GMTrace.i(18228646510592L, 135814);
        String str = hashCode() + "|" + b.this.getName();
        GMTrace.o(18228646510592L, 135814);
        return str;
      }
    };
    if (!locala.Wf()) {}
    synchronized (locala.iGz)
    {
      locala.iGz.offer(paramJSONObject);
      locala.An(1);
      GMTrace.o(18223412019200L, 135775);
      return;
    }
  }
  
  protected abstract void a(j paramj, JSONObject paramJSONObject, int paramInt, a parama);
  
  static abstract interface a
  {
    public abstract void Wd();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\auth\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */