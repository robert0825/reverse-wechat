package com.tencent.mm.plugin.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;

public class ObservableTextureView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  protected SurfaceTexture npm;
  protected b qBC;
  private boolean qBD;
  
  public ObservableTextureView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12485604147200L, 93025);
    this.qBD = false;
    init();
    GMTrace.o(12485604147200L, 93025);
  }
  
  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12485738364928L, 93026);
    this.qBD = false;
    init();
    GMTrace.o(12485738364928L, 93026);
  }
  
  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12485872582656L, 93027);
    this.qBD = false;
    GMTrace.o(12485872582656L, 93027);
  }
  
  private void init()
  {
    GMTrace.i(12486006800384L, 93028);
    setSurfaceTextureListener(this);
    this.npm = getSurfaceTexture();
    GMTrace.o(12486006800384L, 93028);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(12486275235840L, 93030);
    this.qBC = paramb;
    GMTrace.o(12486275235840L, 93030);
  }
  
  public boolean isAvailable()
  {
    GMTrace.i(12486141018112L, 93029);
    boolean bool = this.qBD;
    GMTrace.o(12486141018112L, 93029);
    return bool;
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(12486409453568L, 93031);
    w.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
    cau();
    this.qBD = true;
    if (this.qBC != null) {
      this.qBC.a(paramSurfaceTexture);
    }
    GMTrace.o(12486409453568L, 93031);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(12486677889024L, 93033);
    w.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
    this.qBD = false;
    GMTrace.o(12486677889024L, 93033);
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(12486543671296L, 93032);
    w.d("MicroMsg.ObservableTextureView", "onSurfaceTextureSizeChanged");
    GMTrace.o(12486543671296L, 93032);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(12486812106752L, 93034);
    GMTrace.o(12486812106752L, 93034);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\video\ObservableTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */