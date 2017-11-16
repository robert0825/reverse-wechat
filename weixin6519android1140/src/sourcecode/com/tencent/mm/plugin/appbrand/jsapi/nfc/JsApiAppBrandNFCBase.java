package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.g.a.hy.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class JsApiAppBrandNFCBase
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  a ijd;
  
  public JsApiAppBrandNFCBase()
  {
    GMTrace.i(20716640534528L, 154351);
    this.ijd = null;
    GMTrace.o(20716640534528L, 154351);
  }
  
  protected final void a(a parama)
  {
    GMTrace.i(20716774752256L, 154352);
    this.ijd = parama;
    parama = new CheckIsSupportHCETask(this);
    d.aR(parama);
    AppBrandMainProcessService.a(parama);
    GMTrace.o(20716774752256L, 154352);
  }
  
  private static class CheckIsSupportHCETask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<CheckIsSupportHCETask> CREATOR;
    private String eAR;
    private int errCode;
    private JsApiAppBrandNFCBase ije;
    
    static
    {
      GMTrace.i(20712614002688L, 154321);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20712614002688L, 154321);
    }
    
    public CheckIsSupportHCETask(Parcel paramParcel)
    {
      GMTrace.i(20711808696320L, 154315);
      this.ije = null;
      f(paramParcel);
      GMTrace.o(20711808696320L, 154315);
    }
    
    public CheckIsSupportHCETask(JsApiAppBrandNFCBase paramJsApiAppBrandNFCBase)
    {
      GMTrace.i(20711674478592L, 154314);
      this.ije = null;
      this.ije = paramJsApiAppBrandNFCBase;
      GMTrace.o(20711674478592L, 154314);
    }
    
    public final void RY()
    {
      GMTrace.i(20711942914048L, 154316);
      hy localhy = new hy();
      com.tencent.mm.sdk.b.a.vgX.m(localhy);
      this.errCode = localhy.eLs.errCode;
      this.eAR = localhy.eLs.eAR;
      VL();
      GMTrace.o(20711942914048L, 154316);
    }
    
    public final void VK()
    {
      GMTrace.i(20712077131776L, 154317);
      super.VK();
      d.aS(this);
      if (this.ije != null)
      {
        JsApiAppBrandNFCBase localJsApiAppBrandNFCBase = this.ije;
        int i = this.errCode;
        String str2 = this.eAR;
        w.i("MicroMsg.JsApiAppBrandNFCBase", "alvinluo checkIsSupport resultCallback errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), str2 });
        if (i == 0)
        {
          if (localJsApiAppBrandNFCBase.ijd != null)
          {
            localJsApiAppBrandNFCBase.ijd.z(i, str2);
            GMTrace.o(20712077131776L, 154317);
          }
        }
        else
        {
          String str1 = str2;
          if (bg.nm(str2)) {
            str1 = "unknown error";
          }
          if (localJsApiAppBrandNFCBase.ijd != null) {
            localJsApiAppBrandNFCBase.ijd.z(i, str1);
          }
        }
      }
      GMTrace.o(20712077131776L, 154317);
    }
    
    public int describeContents()
    {
      GMTrace.i(20712211349504L, 154318);
      int i = super.describeContents();
      GMTrace.o(20712211349504L, 154318);
      return i;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(20712479784960L, 154320);
      super.f(paramParcel);
      this.errCode = paramParcel.readInt();
      this.eAR = paramParcel.readString();
      GMTrace.o(20712479784960L, 154320);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20712345567232L, 154319);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.errCode);
      paramParcel.writeString(this.eAR);
      GMTrace.o(20712345567232L, 154319);
    }
  }
  
  public static abstract interface a
  {
    public abstract void z(int paramInt, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\JsApiAppBrandNFCBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */