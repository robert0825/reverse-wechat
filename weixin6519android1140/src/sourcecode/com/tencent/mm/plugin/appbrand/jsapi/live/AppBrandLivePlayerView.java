package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class AppBrandLivePlayerView
  extends TXCloudVideoView
{
  l ifu;
  a ifv;
  b ifw;
  int ifx;
  boolean ify;
  
  public AppBrandLivePlayerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20728720130048L, 154441);
    init(paramContext);
    GMTrace.o(20728720130048L, 154441);
  }
  
  public AppBrandLivePlayerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20728854347776L, 154442);
    init(paramContext);
    GMTrace.o(20728854347776L, 154442);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20729122783232L, 154444);
    this.ifu = new l(paramContext);
    setBackgroundColor(-16777216);
    GMTrace.o(20729122783232L, 154444);
  }
  
  final void cg(boolean paramBoolean)
  {
    GMTrace.i(20728988565504L, 154443);
    if ((this.ify) && (this.ifw != null)) {
      this.ifw.d(paramBoolean, this.ifx);
    }
    GMTrace.o(20728988565504L, 154443);
  }
  
  public final void ow()
  {
    GMTrace.i(21061043224576L, 156917);
    Object localObject = this.ifu;
    if (!((l)localObject).fVS) {}
    for (localObject = new j(-3, "uninited livePlayer");; localObject = new j())
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "onDestroy code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
      GMTrace.o(21061043224576L, 156917);
      return;
      ((l)localObject).ifO.stopPlay(true);
      ((l)localObject).ifO.setPlayListener(null);
    }
  }
  
  public static abstract interface a
  {
    public abstract void WT();
    
    public abstract void iE(int paramInt);
    
    public abstract boolean isFullScreen();
  }
  
  public static abstract interface b
  {
    public abstract void d(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\AppBrandLivePlayerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */