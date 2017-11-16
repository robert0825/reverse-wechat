package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hg;
import com.tencent.mm.g.a.hg.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckBioEnrollment
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 344;
  public static final String NAME = "checkIsSoterEnrolledInDevice";
  private GetIsEnrolledTask icQ;
  
  public JsApiCheckBioEnrollment()
  {
    GMTrace.i(19833487884288L, 147771);
    this.icQ = null;
    GMTrace.o(19833487884288L, 147771);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19833622102016L, 147772);
    w.i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
    this.icQ = new GetIsEnrolledTask(paramj, paramInt, a.qq(paramJSONObject.optString("checkAuthMode")), this);
    d.aR(this.icQ);
    AppBrandMainProcessService.a(this.icQ);
    GMTrace.o(19833622102016L, 147772);
  }
  
  private static class GetIsEnrolledTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsEnrolledTask> CREATOR;
    private int hXU;
    private j hyI;
    private JsApiCheckBioEnrollment icR;
    private int icS;
    private int icT;
    
    static
    {
      GMTrace.i(19834695843840L, 147780);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19834695843840L, 147780);
    }
    
    protected GetIsEnrolledTask(Parcel paramParcel)
    {
      GMTrace.i(19834427408384L, 147778);
      this.hyI = null;
      this.hXU = -1;
      this.icS = -1;
      this.icT = -1;
      f(paramParcel);
      GMTrace.o(19834427408384L, 147778);
    }
    
    public GetIsEnrolledTask(j paramj, int paramInt1, int paramInt2, JsApiCheckBioEnrollment paramJsApiCheckBioEnrollment)
    {
      GMTrace.i(19834024755200L, 147775);
      this.hyI = null;
      this.hXU = -1;
      this.icS = -1;
      this.icT = -1;
      this.hyI = paramj;
      this.hXU = paramInt1;
      this.icR = paramJsApiCheckBioEnrollment;
      this.icS = paramInt2;
      GMTrace.o(19834024755200L, 147775);
    }
    
    public final void RY()
    {
      GMTrace.i(19833890537472L, 147774);
      hg localhg = new hg();
      localhg.eKw.eKy = this.icS;
      com.tencent.mm.sdk.b.a.vgX.m(localhg);
      this.icT = localhg.eKx.eKz;
      w.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", new Object[] { Integer.valueOf(this.icT) });
      VL();
      GMTrace.o(19833890537472L, 147774);
    }
    
    public final void VK()
    {
      boolean bool = false;
      GMTrace.i(19833756319744L, 147773);
      super.VK();
      w.d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", new Object[] { Integer.valueOf(this.icT) });
      HashMap localHashMap = new HashMap(2);
      if (this.icT == 1) {
        bool = true;
      }
      localHashMap.put("isEnrolled", Boolean.valueOf(bool));
      if (this.icT == 0) {
        this.hyI.v(this.hXU, this.icR.d("ok", localHashMap));
      }
      for (;;)
      {
        d.aS(this);
        GMTrace.o(19833756319744L, 147773);
        return;
        if (this.icT == -1) {
          this.hyI.v(this.hXU, this.icR.d("fail not support", localHashMap));
        } else if (this.icT == 1) {
          this.hyI.v(this.hXU, this.icR.d("ok", localHashMap));
        } else {
          this.hyI.v(this.hXU, this.icR.d("fail unknown error", localHashMap));
        }
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(19834158972928L, 147776);
      GMTrace.o(19834158972928L, 147776);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19834561626112L, 147779);
      super.f(paramParcel);
      this.icT = paramParcel.readInt();
      this.icS = paramParcel.readInt();
      GMTrace.o(19834561626112L, 147779);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19834293190656L, 147777);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.icT);
      paramParcel.writeInt(this.icS);
      GMTrace.o(19834293190656L, 147777);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bio\soter\JsApiCheckBioEnrollment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */