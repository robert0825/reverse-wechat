package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;

class JsApiGetContactMessageCountTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetContactMessageCountTask> CREATOR;
  public int eAs;
  public Runnable hYr;
  public String username;
  
  static
  {
    GMTrace.i(18206769020928L, 135651);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18206769020928L, 135651);
  }
  
  public JsApiGetContactMessageCountTask()
  {
    GMTrace.i(18205963714560L, 135645);
    GMTrace.o(18205963714560L, 135645);
  }
  
  public JsApiGetContactMessageCountTask(Parcel paramParcel)
  {
    GMTrace.i(18206097932288L, 135646);
    f(paramParcel);
    GMTrace.o(18206097932288L, 135646);
  }
  
  public final void RY()
  {
    GMTrace.i(18206232150016L, 135647);
    ae localae = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(this.username);
    if (localae == null)
    {
      this.eAs = -1;
      VL();
      GMTrace.o(18206232150016L, 135647);
      return;
    }
    this.eAs = localae.field_unReadCount;
    VL();
    GMTrace.o(18206232150016L, 135647);
  }
  
  public final void VK()
  {
    GMTrace.i(18206366367744L, 135648);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(18206366367744L, 135648);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(18206500585472L, 135649);
    this.username = paramParcel.readString();
    this.eAs = paramParcel.readInt();
    GMTrace.o(18206500585472L, 135649);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18206634803200L, 135650);
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.eAs);
    GMTrace.o(18206634803200L, 135650);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\JsApiGetContactMessageCountTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */