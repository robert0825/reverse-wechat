package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class AppBrandLivePusherView
  extends TXCloudVideoView
{
  m ifz;
  
  public AppBrandLivePusherView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20723217203200L, 154400);
    init(paramContext);
    GMTrace.o(20723217203200L, 154400);
  }
  
  public AppBrandLivePusherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20723351420928L, 154401);
    init(paramContext);
    GMTrace.o(20723351420928L, 154401);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20723619856384L, 154403);
    this.ifz = new m(paramContext);
    setBackgroundColor(-16777216);
    GMTrace.o(20723619856384L, 154403);
  }
  
  public final void ow()
  {
    GMTrace.i(21059164176384L, 156903);
    Object localObject = this.ifz;
    if (!((m)localObject).fVS) {}
    for (localObject = new j(-3, "uninited livePusher");; localObject = new j())
    {
      w.i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
      GMTrace.o(21059164176384L, 156903);
      return;
      ((TelephonyManager)((m)localObject).mContext.getSystemService("phone")).listen((PhoneStateListener)localObject, 0);
      ((m)localObject).ifZ.stopCameraPreview(true);
      ((m)localObject).ifZ.stopPusher();
      ((m)localObject).ifZ.setPushListener(null);
    }
  }
  
  public final void w(Bundle paramBundle)
  {
    GMTrace.i(20723485638656L, 154402);
    m localm = this.ifz;
    if (paramBundle == null) {
      paramBundle = new j(-1, "invalid params");
    }
    for (;;)
    {
      w.i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(paramBundle.errorCode), paramBundle.errorInfo });
      GMTrace.o(20723485638656L, 154402);
      return;
      m.b("updateLivePusher", paramBundle);
      if (!localm.fVS)
      {
        paramBundle = new j(-3, "uninited livePusher");
      }
      else
      {
        localm.c(paramBundle, false);
        String str = paramBundle.getString("pushUrl", localm.igb);
        if ((str != null) && (!str.isEmpty()) && (localm.igb != null) && (!localm.igb.equalsIgnoreCase(str)) && (localm.ifZ.isPushing()))
        {
          w.i("TXLivePusherJSAdapter", "updateLivePusher: stopPusher");
          localm.ifZ.stopCameraPreview(true);
          localm.ifZ.stopPusher();
        }
        localm.igb = str;
        if ((paramBundle.getBoolean("autopush", false)) && (localm.igb != null) && (!localm.igb.isEmpty()) && (!localm.ifZ.isPushing()))
        {
          w.i("TXLivePusherJSAdapter", "updateLivePusher: startPusher");
          localm.ifM.setVisibility(0);
          localm.ifZ.startCameraPreview(localm.ifM);
          localm.ifZ.startPusher(localm.igb);
        }
        paramBundle = new j();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\AppBrandLivePusherView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */