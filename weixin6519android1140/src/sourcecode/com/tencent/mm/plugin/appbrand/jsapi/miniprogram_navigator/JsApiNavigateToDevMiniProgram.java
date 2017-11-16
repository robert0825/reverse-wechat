package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class JsApiNavigateToDevMiniProgram
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 351;
  private static final String NAME = "navigateToDevMiniProgram";
  
  public JsApiNavigateToDevMiniProgram()
  {
    GMTrace.i(19828521828352L, 147734);
    GMTrace.o(19828521828352L, 147734);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19828656046080L, 147735);
    String str1 = paramJSONObject.optString("appId");
    String str2 = paramJSONObject.optString("downloadURL");
    String str3 = paramJSONObject.optString("checkSumMd5");
    a locala = a.a(paramJSONObject.optString("envVersion"), a.iiq);
    String str4 = paramJSONObject.optString("relativeURL");
    paramJSONObject = paramJSONObject.optJSONObject("extraData");
    if (bg.nm(str1))
    {
      paramj.v(paramInt, d("fail invalid appId", null));
      GMTrace.o(19828656046080L, 147735);
      return;
    }
    if ((a.iiq == locala) && ((bg.nm(str2)) || (bg.nm(str3))))
    {
      paramj.v(paramInt, d("fail invalid downloadURL & checkSumMd5", null));
      GMTrace.o(19828656046080L, 147735);
      return;
    }
    if (a.iiq == locala)
    {
      DevPkgInfo localDevPkgInfo = new DevPkgInfo();
      localDevPkgInfo.appId = str1;
      localDevPkgInfo.eIP = str2;
      localDevPkgInfo.eVd = str3;
      XIPCInvoker.a("com.tencent.mm", localDevPkgInfo, a.class);
    }
    d.a(paramj, str1, locala.hZb, str4, paramJSONObject, new d.a()
    {
      public final void ch(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19826776997888L, 147721);
        j localj = paramj;
        int i = paramInt;
        JsApiNavigateToDevMiniProgram localJsApiNavigateToDevMiniProgram = JsApiNavigateToDevMiniProgram.this;
        if (paramAnonymousBoolean) {}
        for (String str = "ok";; str = "fail")
        {
          localj.v(i, localJsApiNavigateToDevMiniProgram.d(str, null));
          GMTrace.o(19826776997888L, 147721);
          return;
        }
      }
    });
    GMTrace.o(19828656046080L, 147735);
  }
  
  private static final class DevPkgInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DevPkgInfo> CREATOR;
    String appId;
    String eIP;
    String eVd;
    
    static
    {
      GMTrace.i(19832279924736L, 147762);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19832279924736L, 147762);
    }
    
    DevPkgInfo()
    {
      GMTrace.i(19832011489280L, 147760);
      GMTrace.o(19832011489280L, 147760);
    }
    
    DevPkgInfo(Parcel paramParcel)
    {
      GMTrace.i(19832145707008L, 147761);
      this.appId = paramParcel.readString();
      this.eIP = paramParcel.readString();
      this.eVd = paramParcel.readString();
      GMTrace.o(19832145707008L, 147761);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19831743053824L, 147758);
      GMTrace.o(19831743053824L, 147758);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19831877271552L, 147759);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eIP);
      paramParcel.writeString(this.eVd);
      GMTrace.o(19831877271552L, 147759);
    }
  }
  
  private static final class a
    implements i<JsApiNavigateToDevMiniProgram.DevPkgInfo, IPCVoid>
  {
    private a()
    {
      GMTrace.i(19828790263808L, 147736);
      GMTrace.o(19828790263808L, 147736);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\miniprogram_navigator\JsApiNavigateToDevMiniProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */