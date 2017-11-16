package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.protocal.c.bly;
import com.tencent.mm.protocal.c.blz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bv;
import org.json.JSONObject;

public class JsApiUploadWeRunData
  extends a
{
  public static final int CTRL_INDEX = 323;
  public static final String NAME = "uploadWeRunData";
  private UploadMiniAppStepTask hZB;
  
  public JsApiUploadWeRunData()
  {
    GMTrace.i(19802886242304L, 147543);
    GMTrace.o(19802886242304L, 147543);
  }
  
  public void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19803020460032L, 147544);
    w.d("MicroMsg.JsApiUploadWeRunData", "JsApiUploadWeRunData!");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiUploadWeRunData", "data is null");
      GMTrace.o(19803020460032L, 147544);
      return;
    }
    a(this, paramj, paramInt, paramJSONObject.optInt("step"), false);
    GMTrace.o(19803020460032L, 147544);
  }
  
  public final void a(d paramd, j paramj, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(19803154677760L, 147545);
    if (paramInt2 <= 0)
    {
      paramj.v(paramInt1, paramd.d("fail:step invalid", null));
      GMTrace.o(19803154677760L, 147545);
      return;
    }
    this.hZB = new UploadMiniAppStepTask(paramd, paramj, paramInt1, paramInt2, paramBoolean);
    this.hZB.VM();
    AppBrandMainProcessService.a(this.hZB);
    GMTrace.o(19803154677760L, 147545);
  }
  
  private static class UploadMiniAppStepTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<UploadMiniAppStepTask> CREATOR;
    private String appId;
    public boolean eEu;
    private d hYJ;
    private j hYK;
    private int hYL;
    private int hZC;
    private boolean hZD;
    
    static
    {
      GMTrace.i(19771747729408L, 147311);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19771747729408L, 147311);
    }
    
    public UploadMiniAppStepTask(Parcel paramParcel)
    {
      GMTrace.i(19770942423040L, 147305);
      f(paramParcel);
      GMTrace.o(19770942423040L, 147305);
    }
    
    public UploadMiniAppStepTask(d paramd, j paramj, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(19770808205312L, 147304);
      w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask");
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt1;
      this.hZC = paramInt2;
      this.hZD = paramBoolean;
      this.appId = paramj.hyD;
      GMTrace.o(19770808205312L, 147304);
    }
    
    public final void RY()
    {
      GMTrace.i(19771076640768L, 147306);
      long l2 = bv.BT();
      w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask currentTime %d", new Object[] { Long.valueOf(l2 / 1000L) });
      long l1 = l2;
      if (l2 == 0L) {
        l1 = System.currentTimeMillis();
      }
      b.a locala = new b.a();
      bly localbly = new bly();
      locala.gtF = localbly;
      locala.gtG = new blz();
      locala.uri = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
      locala.gtE = 1949;
      locala.gtH = 0;
      locala.gtI = 0;
      localbly.lQa = this.appId;
      localbly.jhZ = this.hZC;
      localbly.uVQ = this.hZD;
      localbly.lQE = ((int)(l1 / 1000L));
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(19803423113216L, 147547);
          if (paramAnonymousk.getType() != 1949)
          {
            GMTrace.o(19803423113216L, 147547);
            return 0;
          }
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            JsApiUploadWeRunData.UploadMiniAppStepTask.this.eEu = true;
            w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask ok.");
          }
          for (;;)
          {
            JsApiUploadWeRunData.UploadMiniAppStepTask.a(JsApiUploadWeRunData.UploadMiniAppStepTask.this);
            GMTrace.o(19803423113216L, 147547);
            return 0;
            JsApiUploadWeRunData.UploadMiniAppStepTask.this.eEu = false;
            w.i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          }
        }
      }, true);
      GMTrace.o(19771076640768L, 147306);
    }
    
    public final void VK()
    {
      GMTrace.i(19771210858496L, 147307);
      if (this.eEu) {
        this.hYK.v(this.hYL, this.hYJ.d("ok", null));
      }
      for (;;)
      {
        VN();
        GMTrace.o(19771210858496L, 147307);
        return;
        this.hYK.v(this.hYL, this.hYJ.d("fail", null));
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19771345076224L, 147308);
      this.hZC = paramParcel.readInt();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.hZD = bool1;
        if (paramParcel.readByte() == 0) {
          break label68;
        }
      }
      label68:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.eEu = bool1;
        this.appId = paramParcel.readString();
        GMTrace.o(19771345076224L, 147308);
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19771479293952L, 147309);
      paramParcel.writeInt(this.hZC);
      if (this.hZD)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.eEu) {
          break label70;
        }
      }
      label70:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        paramParcel.writeString(this.appId);
        GMTrace.o(19771479293952L, 147309);
        return;
        b1 = 0;
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiUploadWeRunData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */