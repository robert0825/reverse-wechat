package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hh;
import com.tencent.mm.g.a.hh.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckIsSupportFaceDetect
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 214;
  public static final String NAME = "checkIsSupportFacialRecognition";
  private GetIsSupportFaceTask icM;
  
  public JsApiCheckIsSupportFaceDetect()
  {
    GMTrace.i(14565442060288L, 108521);
    this.icM = null;
    GMTrace.o(14565442060288L, 108521);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14565576278016L, 108522);
    w.i("MicroMsg.JsApiCheckIsSupportFaceDetect", "hy: subapp start do check is support face detect");
    this.icM = new GetIsSupportFaceTask(paramj, paramInt, this);
    d.aR(this.icM);
    AppBrandMainProcessService.a(this.icM);
    GMTrace.o(14565576278016L, 108522);
  }
  
  private static class GetIsSupportFaceTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsSupportFaceTask> CREATOR;
    private String eAR;
    private boolean eVF;
    private int errCode;
    private int hXU;
    private j hyI;
    private JsApiCheckIsSupportFaceDetect icN;
    private int icO;
    
    static
    {
      GMTrace.i(14566650019840L, 108530);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(14566650019840L, 108530);
    }
    
    protected GetIsSupportFaceTask(Parcel paramParcel)
    {
      GMTrace.i(14566381584384L, 108528);
      this.hyI = null;
      this.hXU = -1;
      this.eVF = false;
      this.errCode = -1;
      this.eAR = "not returned";
      this.icO = -1;
      f(paramParcel);
      GMTrace.o(14566381584384L, 108528);
    }
    
    public GetIsSupportFaceTask(j paramj, int paramInt, JsApiCheckIsSupportFaceDetect paramJsApiCheckIsSupportFaceDetect)
    {
      GMTrace.i(14566247366656L, 108527);
      this.hyI = null;
      this.hXU = -1;
      this.eVF = false;
      this.errCode = -1;
      this.eAR = "not returned";
      this.icO = -1;
      this.hyI = paramj;
      this.hXU = paramInt;
      this.icN = paramJsApiCheckIsSupportFaceDetect;
      GMTrace.o(14566247366656L, 108527);
    }
    
    public final void RY()
    {
      GMTrace.i(14565844713472L, 108524);
      hh localhh = new hh();
      com.tencent.mm.sdk.b.a.vgX.m(localhh);
      this.eVF = localhh.eKA.eKB;
      this.errCode = localhh.eKA.eKC;
      this.eAR = localhh.eKA.eKD;
      this.icO = localhh.eKA.eKE;
      w.i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", new Object[] { Boolean.valueOf(this.eVF), Integer.valueOf(this.errCode), this.eAR, Integer.valueOf(this.icO) });
      VL();
      GMTrace.o(14565844713472L, 108524);
    }
    
    public final void VK()
    {
      GMTrace.i(14565710495744L, 108523);
      super.VK();
      w.d("MicroMsg.GetIsSupportFaceTask", "hy: callback. isSupport: %b, errCode: %d, errMsg: %s, libVersion: %d", new Object[] { Boolean.valueOf(this.eVF), Integer.valueOf(this.errCode), this.eAR, Integer.valueOf(this.icO) });
      HashMap localHashMap = new HashMap(3);
      localHashMap.put("errCode", Integer.valueOf(this.errCode));
      localHashMap.put("libVersionCode", Integer.valueOf(this.icO));
      if (this.errCode == 0) {
        this.hyI.v(this.hXU, this.icN.d("ok", localHashMap));
      }
      for (;;)
      {
        d.aS(this);
        GMTrace.o(14565710495744L, 108523);
        return;
        this.hyI.v(this.hXU, this.icN.d("fail " + this.eAR, localHashMap));
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(14565978931200L, 108525);
      GMTrace.o(14565978931200L, 108525);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(14566515802112L, 108529);
      super.f(paramParcel);
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.eVF = bool;
        this.errCode = paramParcel.readInt();
        this.eAR = paramParcel.readString();
        this.icO = paramParcel.readInt();
        GMTrace.o(14566515802112L, 108529);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(14566113148928L, 108526);
      super.writeToParcel(paramParcel, paramInt);
      if (this.eVF) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.errCode);
        paramParcel.writeString(this.eAR);
        paramParcel.writeInt(this.icO);
        GMTrace.o(14566113148928L, 108526);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bio\face\JsApiCheckIsSupportFaceDetect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */