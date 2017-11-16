package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;

public class JsApiChattingTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiChattingTask> CREATOR;
  public String eCQ;
  public Runnable hYr;
  public String sessionFrom;
  public String username;
  
  static
  {
    GMTrace.i(18208648069120L, 135665);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18208648069120L, 135665);
  }
  
  public JsApiChattingTask()
  {
    GMTrace.i(18207842762752L, 135659);
    GMTrace.o(18207842762752L, 135659);
  }
  
  public JsApiChattingTask(Parcel paramParcel)
  {
    GMTrace.i(18207976980480L, 135660);
    f(paramParcel);
    GMTrace.o(18207976980480L, 135660);
  }
  
  public final void RY()
  {
    GMTrace.i(18208111198208L, 135661);
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.username);
    w.d("MicroMsg.JsApiChattingTask", "sessionFrom:%s,username:%s,nickname:%s", new Object[] { this.sessionFrom, this.username, this.eCQ });
    if ((localx == null) || ((int)localx.fTq == 0))
    {
      localx = new x(this.username);
      localx.setType(0);
      localx.cl(this.eCQ);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().R(localx);
      w.i("MicroMsg.JsApiChattingTask", "%s save to contact_table", new Object[] { this.username });
    }
    ((b)com.tencent.mm.kernel.h.h(b.class)).po(this.username);
    VL();
    GMTrace.o(18208111198208L, 135661);
  }
  
  public final void VK()
  {
    GMTrace.i(18208245415936L, 135662);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(18208245415936L, 135662);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(18208379633664L, 135663);
    this.sessionFrom = paramParcel.readString();
    this.username = paramParcel.readString();
    this.eCQ = paramParcel.readString();
    GMTrace.o(18208379633664L, 135663);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18208513851392L, 135664);
    paramParcel.writeString(this.sessionFrom);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.eCQ);
    GMTrace.o(18208513851392L, 135664);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\JsApiChattingTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */