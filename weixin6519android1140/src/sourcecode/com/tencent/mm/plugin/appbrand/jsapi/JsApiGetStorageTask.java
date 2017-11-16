package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.b.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;

class JsApiGetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageTask> CREATOR;
  public String amf;
  public String appId;
  private boolean hYA;
  private int hYB;
  private int hYC;
  private int hYD;
  public Runnable hYr;
  public String type;
  public String value;
  
  static
  {
    GMTrace.i(10385230921728L, 77376);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10385230921728L, 77376);
  }
  
  public JsApiGetStorageTask()
  {
    GMTrace.i(10384559833088L, 77371);
    GMTrace.o(10384559833088L, 77371);
  }
  
  public final void RY()
  {
    GMTrace.i(10384694050816L, 77372);
    Object localObject1 = e.Sd();
    if (localObject1 == null)
    {
      VL();
      GMTrace.o(10384694050816L, 77372);
      return;
    }
    Object localObject2 = ((b)localObject1).aC(this.appId, this.amf);
    if ((b.a)localObject2[0] == b.a.hLs)
    {
      localObject1 = (String)localObject2[1];
      localObject2 = (String)localObject2[2];
      if (bx.h(new String[] { localObject1, localObject2 }) <= 102400) {
        break label170;
      }
      this.hYC = bx.h(new String[] { localObject1 });
      this.hYD = bx.h(new String[] { localObject2 });
    }
    for (;;)
    {
      try
      {
        bx.f(this.hXm, new String[] { localObject1, localObject2 });
        this.hYA = true;
        VL();
        GMTrace.o(10384694050816L, 77372);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        continue;
      }
      label170:
      this.hYA = false;
      this.value = localException;
      this.type = ((String)localObject2);
    }
  }
  
  public final void VK()
  {
    GMTrace.i(10384828268544L, 77373);
    if (this.hYA) {}
    try
    {
      String str = bx.qk(this.hXm);
      if (str.length() == this.hYC + this.hYD)
      {
        this.value = str.substring(0, this.hYC);
        this.type = str.substring(this.hYC, this.hYC + this.hYD);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        bx.ql(this.hXm);
      }
    }
    finally
    {
      bx.ql(this.hXm);
    }
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(10384828268544L, 77373);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10384962486272L, 77374);
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.hYA = bool;
      this.hYB = paramParcel.readInt();
      this.hYC = paramParcel.readInt();
      this.hYD = paramParcel.readInt();
      this.amf = paramParcel.readString();
      this.value = paramParcel.readString();
      this.type = paramParcel.readString();
      GMTrace.o(10384962486272L, 77374);
      return;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10385096704000L, 77375);
    paramParcel.writeString(this.appId);
    if (this.hYA) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.hYB);
      paramParcel.writeInt(this.hYC);
      paramParcel.writeInt(this.hYD);
      paramParcel.writeString(this.amf);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.type);
      GMTrace.o(10385096704000L, 77375);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiGetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */