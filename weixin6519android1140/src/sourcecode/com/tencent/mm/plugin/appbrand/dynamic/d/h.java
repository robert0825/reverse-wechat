package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.extension.f;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public h()
  {
    super("openApp", 326);
    GMTrace.i(19931601043456L, 148502);
    GMTrace.o(19931601043456L, 148502);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a<JSONObject> parama1)
  {
    GMTrace.i(20776904294400L, 154800);
    parama = parama.wr();
    b localb = new b();
    localb.id = parama.getString("__page_view_id", "");
    localb.url = paramJSONObject.optString("url", "");
    XIPCInvoker.a(parama.getString("__process_name", ab.vM()), localb, a.class, new com.tencent.mm.ipcinvoker.h() {});
    GMTrace.o(20776904294400L, 154800);
  }
  
  private static class a
    implements g<h.b, Bundle>
  {
    private a()
    {
      GMTrace.i(19927440293888L, 148471);
      GMTrace.o(19927440293888L, 148471);
    }
  }
  
  public static final class b
    implements f
  {
    String id;
    String url;
    
    public b()
    {
      GMTrace.i(19928916688896L, 148482);
      GMTrace.o(19928916688896L, 148482);
    }
    
    public final void e(Parcel paramParcel)
    {
      GMTrace.i(19929050906624L, 148483);
      paramParcel.writeString(this.id);
      paramParcel.writeString(this.url);
      GMTrace.o(19929050906624L, 148483);
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      GMTrace.i(19929185124352L, 148484);
      this.id = paramParcel.readString();
      this.url = paramParcel.readString();
      GMTrace.o(19929185124352L, 148484);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */