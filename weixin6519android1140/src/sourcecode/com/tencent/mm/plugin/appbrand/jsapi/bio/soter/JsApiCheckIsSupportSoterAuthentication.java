package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckIsSupportSoterAuthentication
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 276;
  public static final String NAME = "checkIsSupportSoterAuthentication";
  private GetIsSupportSoterTask icU;
  
  public JsApiCheckIsSupportSoterAuthentication()
  {
    GMTrace.i(16540590145536L, 123237);
    this.icU = null;
    GMTrace.o(16540590145536L, 123237);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16540724363264L, 123238);
    w.i("MicroMsg.JsApiCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
    this.icU = new GetIsSupportSoterTask(paramj, paramInt, this);
    d.aR(this.icU);
    AppBrandMainProcessService.a(this.icU);
    GMTrace.o(16540724363264L, 123238);
  }
  
  private static class GetIsSupportSoterTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsSupportSoterTask> CREATOR;
    private int hXU;
    private j hyI;
    private JsApiCheckIsSupportSoterAuthentication icV;
    private int icW;
    
    static
    {
      GMTrace.i(16541798105088L, 123246);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(16541798105088L, 123246);
    }
    
    protected GetIsSupportSoterTask(Parcel paramParcel)
    {
      GMTrace.i(16541529669632L, 123244);
      this.hyI = null;
      this.hXU = -1;
      this.icW = 0;
      f(paramParcel);
      GMTrace.o(16541529669632L, 123244);
    }
    
    public GetIsSupportSoterTask(j paramj, int paramInt, JsApiCheckIsSupportSoterAuthentication paramJsApiCheckIsSupportSoterAuthentication)
    {
      GMTrace.i(16541127016448L, 123241);
      this.hyI = null;
      this.hXU = -1;
      this.icW = 0;
      this.hyI = paramj;
      this.hXU = paramInt;
      this.icV = paramJsApiCheckIsSupportSoterAuthentication;
      GMTrace.o(16541127016448L, 123241);
    }
    
    public final void RY()
    {
      GMTrace.i(16540992798720L, 123240);
      this.icW = ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).TY();
      w.i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", new Object[] { Integer.valueOf(this.icW) });
      VL();
      GMTrace.o(16540992798720L, 123240);
    }
    
    public final void VK()
    {
      GMTrace.i(16540858580992L, 123239);
      super.VK();
      w.d("MicroMsg.GetIsSupportSoterTask", "hy: callback. supportMode: %d", new Object[] { Integer.valueOf(this.icW) });
      HashMap localHashMap = new HashMap(2);
      localHashMap.put("supportMode", a.iC(this.icW));
      this.hyI.v(this.hXU, this.icV.d("ok", localHashMap));
      d.aS(this);
      GMTrace.o(16540858580992L, 123239);
    }
    
    public int describeContents()
    {
      GMTrace.i(16541261234176L, 123242);
      GMTrace.o(16541261234176L, 123242);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(16541663887360L, 123245);
      super.f(paramParcel);
      this.icW = paramParcel.readInt();
      GMTrace.o(16541663887360L, 123245);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(16541395451904L, 123243);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.icW);
      GMTrace.o(16541395451904L, 123243);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bio\soter\JsApiCheckIsSupportSoterAuthentication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */