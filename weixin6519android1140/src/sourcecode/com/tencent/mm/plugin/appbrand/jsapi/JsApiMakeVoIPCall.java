package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiMakeVoIPCall
  extends a
{
  public static final int CTRL_INDEX = 154;
  public static final String NAME = "makeVoIPCall";
  private int hXU;
  private j hyI;
  
  public JsApiMakeVoIPCall()
  {
    GMTrace.i(10307653074944L, 76798);
    GMTrace.o(10307653074944L, 76798);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10307787292672L, 76799);
    this.hyI = paramj;
    this.hXU = paramInt;
    String str1 = paramJSONObject.optString("context");
    String str2 = paramJSONObject.optString("avatarUrl");
    boolean bool1 = paramJSONObject.optBoolean("showOther");
    boolean bool2 = paramJSONObject.optBoolean("allowBackCamera");
    Object localObject = paramJSONObject.optString("toUserName");
    String str3 = bg.nl(paramJSONObject.optString("scene"));
    String str4 = bg.nl(paramJSONObject.optString("type"));
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    paramJSONObject = (JSONObject)localObject;
    if (bg.nm((String)localObject))
    {
      paramJSONObject = (JSONObject)localObject;
      if (localAppBrandSysConfig != null) {
        paramJSONObject = localAppBrandSysConfig.eAr;
      }
    }
    if ((bg.nm(paramj.hyD)) || (bg.nm(paramJSONObject)))
    {
      w.e("MicroMsg.JsApiMakeVoIPCall", "appId or toUserName invalid!");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10307787292672L, 76799);
      return;
    }
    w.d("MicroMsg.JsApiMakeVoIPCall", "allowBackCamera: %s, showOther: %s, avatarUrl: %s, context: %s, toUserName: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), str2, str1, paramJSONObject });
    localObject = new StartVoIPCall(this, paramj, paramInt);
    ((StartVoIPCall)localObject).VM();
    AppBrandMainProcessService.a((MainProcessTask)localObject);
    localObject = new Intent();
    ((Intent)localObject).putExtra("voipCSBizId", paramJSONObject);
    ((Intent)localObject).putExtra("voipCSAppId", paramj.hyD);
    if (bool2)
    {
      paramJSONObject = "1";
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", paramJSONObject);
      if (!bool1) {
        break label394;
      }
    }
    label394:
    for (paramJSONObject = "1";; paramJSONObject = "0")
    {
      ((Intent)localObject).putExtra("voipCSShowOther", paramJSONObject);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", str2);
      ((Intent)localObject).putExtra("voipCSContext", str1);
      ((Intent)localObject).putExtra("voipCSScene", str3);
      ((Intent)localObject).putExtra("voipCSType", str4);
      ((Intent)localObject).putExtra("launch_from_appbrand", true);
      ((Intent)localObject).setClassName(paramj.mContext, paramj.mContext.getPackageName() + ".plugin.voip_cs.ui.VoipCSMainUI");
      AppBrandProcessProxyUI.l(paramj.mContext, (Intent)localObject);
      GMTrace.o(10307787292672L, 76799);
      return;
      paramJSONObject = "0";
      break;
    }
  }
  
  private static class StartVoIPCall
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartVoIPCall> CREATOR;
    private d hYJ;
    private j hYK;
    private int hYL;
    public c hYM;
    public int status;
    
    static
    {
      GMTrace.i(10414624604160L, 77595);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10414624604160L, 77595);
    }
    
    public StartVoIPCall(Parcel paramParcel)
    {
      GMTrace.i(10413685080064L, 77588);
      this.hYM = new c() {};
      f(paramParcel);
      GMTrace.o(10413685080064L, 77588);
    }
    
    public StartVoIPCall(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(10413550862336L, 77587);
      this.hYM = new c() {};
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(10413550862336L, 77587);
    }
    
    public final void RY()
    {
      GMTrace.i(10413819297792L, 77589);
      com.tencent.mm.sdk.b.a.vgX.b(this.hYM);
      GMTrace.o(10413819297792L, 77589);
    }
    
    public final void VK()
    {
      GMTrace.i(10413953515520L, 77590);
      VN();
      w.i("MicroMsg.JsApiMakeVoIPCall", "makeVoIPCall = %d", new Object[] { Integer.valueOf(this.status) });
      if (this.status == 1)
      {
        this.hYK.v(this.hYL, this.hYJ.d("cancel", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 2)
      {
        this.hYK.v(this.hYL, this.hYJ.d("ok", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 3)
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail:network error", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 4)
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail:param not match", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      this.hYK.v(this.hYL, this.hYJ.d("fail:unknow", null));
      GMTrace.o(10413953515520L, 77590);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10414087733248L, 77591);
      this.status = paramParcel.readInt();
      GMTrace.o(10414087733248L, 77591);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10414221950976L, 77592);
      paramParcel.writeInt(this.status);
      GMTrace.o(10414221950976L, 77592);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiMakeVoIPCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */