package com.tencent.mm.plugin.voip_cs.ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;

public class VoipCSVideoView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static final int[] npl;
  private int hwT;
  private int hwU;
  private SurfaceTexture npm;
  private Paint npn;
  private int qSW;
  private String username;
  
  static
  {
    GMTrace.i(11273752281088L, 83996);
    npl = new int[] { 452984831, 369098751, 268435455, 369098751, 268435455, 184549375, 268435455, 184549375, 100663295 };
    GMTrace.o(11273752281088L, 83996);
  }
  
  public VoipCSVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11272812756992L, 83989);
    this.qSW = a.qSZ;
    MP();
    GMTrace.o(11272812756992L, 83989);
  }
  
  public VoipCSVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11272946974720L, 83990);
    this.qSW = a.qSZ;
    MP();
    GMTrace.o(11272946974720L, 83990);
  }
  
  private void MP()
  {
    GMTrace.i(11273081192448L, 83991);
    this.npn = new Paint();
    this.npn.setColor(-16777216);
    this.npn.setFilterBitmap(true);
    this.npn.setTextSize(40.0F);
    setSurfaceTextureListener(this);
    if (isAvailable()) {
      onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
    }
    GMTrace.o(11273081192448L, 83991);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(11273215410176L, 83992);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureAvailable %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(11273215410176L, 83992);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(11273483845632L, 83994);
    String str = this.username;
    if (paramSurfaceTexture != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureDestroyed %s %b", new Object[] { str, Boolean.valueOf(bool) });
      this.npm = null;
      this.hwU = 0;
      this.hwT = 0;
      GMTrace.o(11273483845632L, 83994);
      return false;
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(11273349627904L, 83993);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureSizeChanged %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(11273349627904L, 83993);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = false;
    GMTrace.i(11273618063360L, 83995);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.v("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureUpdated %s %b", new Object[] { str, Boolean.valueOf(bool) });
    GMTrace.o(11273618063360L, 83995);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(11272678539264L, 83988);
      qSX = 1;
      qSY = 2;
      qSZ = 3;
      qTa = new int[] { qSX, qSY, qSZ };
      GMTrace.o(11272678539264L, 83988);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\ui\widget\VoipCSVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */