package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.extension.f;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public g()
  {
    super("onTapCallback", 327);
    GMTrace.i(19927977164800L, 148475);
    GMTrace.o(19927977164800L, 148475);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a<JSONObject> parama1)
  {
    GMTrace.i(20775830552576L, 154792);
    parama = parama.wr();
    b localb = new b();
    localb.id = parama.getString("__page_view_id", "");
    localb.eVH = paramJSONObject.optString("eventId", "");
    localb.hTK = paramJSONObject.optBoolean("hasHandler");
    localb.hTL = paramJSONObject.optBoolean("res");
    XIPCInvoker.a(parama.getString("__process_name", ab.vM()), localb, a.class, new h() {});
    GMTrace.o(20775830552576L, 154792);
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.g<g.b, Bundle>
  {
    private a()
    {
      GMTrace.i(19927708729344L, 148473);
      GMTrace.o(19927708729344L, 148473);
    }
  }
  
  public static final class b
    implements f
  {
    String eVH;
    boolean hTK;
    boolean hTL;
    String id;
    
    public b()
    {
      GMTrace.i(19930929954816L, 148497);
      GMTrace.o(19930929954816L, 148497);
    }
    
    public final void e(Parcel paramParcel)
    {
      int j = 1;
      GMTrace.i(19931064172544L, 148498);
      paramParcel.writeString(this.id);
      if (this.hTK)
      {
        i = 1;
        paramParcel.writeInt(i);
        paramParcel.writeString(this.eVH);
        if (!this.hTL) {
          break label68;
        }
      }
      label68:
      for (int i = j;; i = 0)
      {
        paramParcel.writeInt(i);
        GMTrace.o(19931064172544L, 148498);
        return;
        i = 0;
        break;
      }
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19931198390272L, 148499);
      this.id = paramParcel.readString();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.hTK = bool1;
        this.eVH = paramParcel.readString();
        if (paramParcel.readInt() != 1) {
          break label70;
        }
      }
      label70:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.hTL = bool1;
        GMTrace.o(19931198390272L, 148499);
        return;
        bool1 = false;
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */