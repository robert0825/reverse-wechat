package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public f()
  {
    super("makePhoneCall", 327);
    GMTrace.i(19928648253440L, 148480);
    GMTrace.o(19928648253440L, 148480);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a<JSONObject> parama1)
  {
    GMTrace.i(20776233205760L, 154795);
    parama = parama.wr();
    a locala = new a();
    locala.id = parama.getString("__page_view_id", "");
    locala.eVq = paramJSONObject.optString("phoneNumber", "");
    XIPCInvoker.a(parama.getString("__process_name", ab.vM()), locala, b.class, new h() {});
    GMTrace.o(20776233205760L, 154795);
  }
  
  private static final class a
    implements com.tencent.mm.ipcinvoker.extension.f
  {
    String eVq;
    String id;
    
    public a()
    {
      GMTrace.i(19939519889408L, 148561);
      GMTrace.o(19939519889408L, 148561);
    }
    
    public final void e(Parcel paramParcel)
    {
      GMTrace.i(19939654107136L, 148562);
      paramParcel.writeString(this.id);
      paramParcel.writeString(this.eVq);
      GMTrace.o(19939654107136L, 148562);
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      GMTrace.i(19939788324864L, 148563);
      this.id = paramParcel.readString();
      this.eVq = paramParcel.readString();
      GMTrace.o(19939788324864L, 148563);
    }
  }
  
  private static class b
    implements g<f.a, Bundle>
  {
    private b()
    {
      GMTrace.i(19939251453952L, 148559);
      GMTrace.o(19939251453952L, 148559);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */