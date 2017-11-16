package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.b.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;

class JsApiSetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiSetStorageTask> CREATOR;
  private String amf;
  public String appId;
  private boolean hYA;
  private int hYB;
  private int hYC;
  private int hYD;
  public Runnable hYr;
  public String result;
  private String type;
  private String value;
  
  static
  {
    GMTrace.i(10297184092160L, 76720);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10297184092160L, 76720);
  }
  
  JsApiSetStorageTask()
  {
    GMTrace.i(10296244568064L, 76713);
    GMTrace.o(10296244568064L, 76713);
  }
  
  private void VX()
  {
    GMTrace.i(10296513003520L, 76715);
    this.amf = null;
    this.value = null;
    this.type = null;
    GMTrace.o(10296513003520L, 76715);
  }
  
  public final void RY()
  {
    GMTrace.i(10296781438976L, 76717);
    if (this.hYA) {}
    try
    {
      localObject1 = bx.qk(this.hXm);
      if (((String)localObject1).length() == this.hYB + this.hYC + this.hYD)
      {
        this.amf = ((String)localObject1).substring(0, this.hYB);
        this.value = ((String)localObject1).substring(this.hYB, this.hYB + this.hYC);
        this.type = ((String)localObject1).substring(this.hYB + this.hYC, this.hYB + this.hYC + this.hYD);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        w.e("MicroMsg.JsApiSetStorageTask", localException.getMessage());
        bx.ql(this.hXm);
      }
    }
    finally
    {
      bx.ql(this.hXm);
    }
    localObject1 = e.Sd();
    if (localObject1 == null)
    {
      this.result = "fail";
      VX();
      VL();
      GMTrace.o(10296781438976L, 76717);
      return;
    }
    b.a locala = ((b)localObject2).e(this.appId, this.amf, this.value, this.type);
    if (locala == b.a.hLs) {
      this.result = "ok";
    }
    for (;;)
    {
      VX();
      VL();
      GMTrace.o(10296781438976L, 76717);
      return;
      if (locala == b.a.hLw) {
        this.result = "fail:quota reached";
      } else {
        this.result = "fail";
      }
    }
  }
  
  public final void VK()
  {
    GMTrace.i(10296647221248L, 76716);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(10296647221248L, 76716);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10296915656704L, 76718);
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
      this.result = paramParcel.readString();
      GMTrace.o(10296915656704L, 76718);
      return;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10297049874432L, 76719);
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
      paramParcel.writeString(this.result);
      GMTrace.o(10297049874432L, 76719);
      return;
    }
  }
  
  public final void x(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10296378785792L, 76714);
    if (bx.h(new String[] { paramString1, paramString2, paramString3 }) > 102400)
    {
      this.hYB = bx.h(new String[] { paramString1 });
      this.hYC = bx.h(new String[] { paramString2 });
      this.hYD = bx.h(new String[] { paramString3 });
      try
      {
        bx.f(this.hXm, new String[] { paramString1, paramString2, paramString3 });
        this.hYA = true;
        GMTrace.o(10296378785792L, 76714);
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiSetStorageTask", paramString1.getMessage());
        }
      }
    }
    this.hYA = false;
    this.amf = paramString1;
    this.value = paramString2;
    this.type = paramString3;
    GMTrace.o(10296378785792L, 76714);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiSetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */