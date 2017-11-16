package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class AppBrandLaunchErrorActionAlert
  extends AppBrandLaunchErrorAction
{
  final String ipl;
  final String ipm;
  
  @android.support.a.a
  AppBrandLaunchErrorActionAlert(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(17330595692544L, 129123);
    this.ipl = paramParcel.readString();
    this.ipm = paramParcel.readString();
    GMTrace.o(17330595692544L, 129123);
  }
  
  AppBrandLaunchErrorActionAlert(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    super(paramString1, paramInt);
    GMTrace.i(17330461474816L, 129122);
    this.ipl = paramString2;
    this.ipm = paramString3;
    GMTrace.o(17330461474816L, 129122);
  }
  
  final void bO(Context paramContext)
  {
    GMTrace.i(17330864128000L, 129125);
    String str1 = this.ipm;
    String str2 = this.ipl;
    if (!(paramContext instanceof Activity))
    {
      com.tencent.mm.plugin.appbrand.ipc.a.a(null, str1, str2, ab.getResources().getString(o.i.cTM), "");
      GMTrace.o(17330864128000L, 129125);
      return;
    }
    h.a(paramContext, str1, str2, false, null);
    GMTrace.o(17330864128000L, 129125);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17330729910272L, 129124);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.ipl);
    paramParcel.writeString(this.ipm);
    GMTrace.o(17330729910272L, 129124);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\AppBrandLaunchErrorActionAlert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */