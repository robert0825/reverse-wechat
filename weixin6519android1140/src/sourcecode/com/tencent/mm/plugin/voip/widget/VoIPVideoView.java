package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;

public class VoIPVideoView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static final int[] npl;
  private int hwT;
  private int hwU;
  private SurfaceTexture npm;
  private Paint npn;
  private float qQD;
  private int qQE;
  private int qQF;
  private int qQG;
  private float qQH;
  
  static
  {
    GMTrace.i(20668993241088L, 153996);
    npl = new int[] { 452984831, 369098751, 268435455, 369098751, 268435455, 184549375, 268435455, 184549375, 100663295 };
    GMTrace.o(20668993241088L, 153996);
  }
  
  public VoIPVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20668053716992L, 153989);
    this.qQD = 0.4F;
    this.qQE = 30;
    this.qQF = 30;
    this.qQG = 15;
    this.qQH = 0.02F;
    MP();
    GMTrace.o(20668053716992L, 153989);
  }
  
  public VoIPVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20668187934720L, 153990);
    this.qQD = 0.4F;
    this.qQE = 30;
    this.qQF = 30;
    this.qQG = 15;
    this.qQH = 0.02F;
    MP();
    GMTrace.o(20668187934720L, 153990);
  }
  
  private void MP()
  {
    GMTrace.i(20668322152448L, 153991);
    this.npn = new Paint();
    this.npn.setColor(-16777216);
    this.npn.setFilterBitmap(true);
    this.npn.setTextSize(40.0F);
    setSurfaceTextureListener(this);
    GMTrace.o(20668322152448L, 153991);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(20668456370176L, 153992);
    if (paramSurfaceTexture != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureAvailable %b %d %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.npm = paramSurfaceTexture;
      this.hwT = paramInt1;
      this.hwU = paramInt2;
      cau();
      GMTrace.o(20668456370176L, 153992);
      return;
    }
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    GMTrace.i(20668724805632L, 153994);
    if (paramSurfaceTexture != null) {}
    for (;;)
    {
      w.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureDestroyed %b", new Object[] { Boolean.valueOf(bool) });
      this.npm = null;
      this.hwU = 0;
      this.hwT = 0;
      GMTrace.o(20668724805632L, 153994);
      return false;
      bool = false;
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(20668590587904L, 153993);
    if (paramSurfaceTexture != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureSizeChanged %b %d %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.hwT = paramInt1;
      this.hwU = paramInt2;
      GMTrace.o(20668590587904L, 153993);
      return;
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    GMTrace.i(20668859023360L, 153995);
    if (paramSurfaceTexture != null) {}
    for (;;)
    {
      w.v("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureUpdated %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(20668859023360L, 153995);
      return;
      bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\widget\VoIPVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */