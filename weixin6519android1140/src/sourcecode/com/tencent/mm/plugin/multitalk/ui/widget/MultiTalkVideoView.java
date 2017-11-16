package com.tencent.mm.plugin.multitalk.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.multitalk.a.l;
import com.tencent.mm.plugin.multitalk.a.l.a;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;
import java.util.Map;

public class MultiTalkVideoView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static final int[] npl;
  private int hwT;
  private int hwU;
  int index;
  private SurfaceTexture npm;
  private Paint npn;
  private a npo;
  public int position;
  public String username;
  
  static
  {
    GMTrace.i(4778687987712L, 35604);
    npl = new int[] { 452984831, 369098751, 268435455, 369098751, 268435455, 184549375, 268435455, 184549375, 100663295 };
    GMTrace.o(4778687987712L, 35604);
  }
  
  public MultiTalkVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4776540504064L, 35588);
    this.npo = a.nps;
    MP();
    GMTrace.o(4776540504064L, 35588);
  }
  
  public MultiTalkVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4776674721792L, 35589);
    this.npo = a.nps;
    MP();
    GMTrace.o(4776674721792L, 35589);
  }
  
  private void MP()
  {
    GMTrace.i(4776808939520L, 35590);
    this.npn = new Paint();
    this.npn.setColor(-16777216);
    this.npn.setFilterBitmap(false);
    this.npn.setTextSize(40.0F);
    setSurfaceTextureListener(this);
    GMTrace.o(4776808939520L, 35590);
  }
  
  private void aSe()
  {
    GMTrace.i(4777614245888L, 35596);
    if ((this.npm == null) || (this.hwT == 0) || (this.hwU == 0))
    {
      GMTrace.o(4777614245888L, 35596);
      return;
    }
    Canvas localCanvas = lockCanvas(null);
    if (localCanvas == null)
    {
      w.e("MicroMsg.MT.MultiTalkVideoView", "getCanvasError canvas is null");
      GMTrace.o(4777614245888L, 35596);
      return;
    }
    localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    localCanvas.drawColor(-14737113);
    localCanvas.drawColor(npl[this.index]);
    try
    {
      unlockCanvasAndPost(localCanvas);
      GMTrace.o(4777614245888L, 35596);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MT.MultiTalkVideoView", localException, "drawNone unlockCanvasAndPost crash", new Object[0]);
      GMTrace.o(4777614245888L, 35596);
    }
  }
  
  private boolean aSf()
  {
    GMTrace.i(4777882681344L, 35598);
    if (this.npo == a.npq)
    {
      GMTrace.o(4777882681344L, 35598);
      return true;
    }
    GMTrace.o(4777882681344L, 35598);
    return false;
  }
  
  public final void Di(String paramString)
  {
    GMTrace.i(20506724007936L, 152787);
    w.i("MicroMsg.MT.MultiTalkVideoView", "changeUser from %s to %s", new Object[] { this.username, paramString });
    this.username = paramString;
    GMTrace.o(20506724007936L, 152787);
  }
  
  public final void a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i;
      int j;
      try
      {
        GMTrace.i(4777077374976L, 35592);
        if ((paramBitmap == null) || (paramBitmap.isRecycled()))
        {
          w.e("MicroMsg.MT.MultiTalkVideoView", "DrawBitmap, bitmap is null or recycled");
          GMTrace.o(4777077374976L, 35592);
          return;
        }
        i = paramBitmap.getWidth();
        j = paramBitmap.getHeight();
        if ((this.npm == null) || (this.hwT == 0) || (this.hwU == 0))
        {
          GMTrace.o(4777077374976L, 35592);
          continue;
        }
        localCanvas = lockCanvas(null);
      }
      finally {}
      Canvas localCanvas;
      if (localCanvas == null)
      {
        w.e("MicroMsg.MT.MultiTalkVideoView", "%s getCanvasError", new Object[] { this.username });
        GMTrace.o(4777077374976L, 35592);
      }
      else
      {
        Matrix localMatrix = new Matrix();
        if (paramInt1 == OpenGlRender.qPr) {
          localMatrix.setRotate(270.0F, i / 2, j / 2);
        }
        for (;;)
        {
          if (paramInt2 == OpenGlRender.qPs)
          {
            localMatrix.postScale(-1.0F, 1.0F);
            localMatrix.postTranslate(i, 0.0F);
          }
          localMatrix.postScale(localCanvas.getWidth() / j, localCanvas.getHeight() / i);
          localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
          if (!paramBitmap.isRecycled()) {
            localCanvas.drawBitmap(paramBitmap, localMatrix, this.npn);
          }
          try
          {
            unlockCanvasAndPost(localCanvas);
            GMTrace.o(4777077374976L, 35592);
          }
          catch (Exception paramBitmap)
          {
            w.printErrStackTrace("MicroMsg.MT.MultiTalkVideoView", paramBitmap, "drawBitmap unlockCanvasAndPost crash", new Object[0]);
            GMTrace.o(4777077374976L, 35592);
          }
          if (paramInt1 == OpenGlRender.qPq) {
            localMatrix.setRotate(90.0F, i / 2, j / 2);
          }
        }
      }
    }
  }
  
  /* Error */
  public final void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 233
    //   5: ldc -21
    //   7: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: invokevirtual 238	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:aSg	()Z
    //   14: ifne +14 -> 28
    //   17: ldc2_w 233
    //   20: ldc -21
    //   22: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: invokestatic 244	com/tencent/mm/plugin/multitalk/a/o:aRS	()Lcom/tencent/mm/plugin/multitalk/a/l;
    //   31: aload_0
    //   32: aload_1
    //   33: iload_2
    //   34: iload_3
    //   35: iload 4
    //   37: iload 5
    //   39: invokevirtual 249	com/tencent/mm/plugin/multitalk/a/l:a	(Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;[IIIII)Z
    //   42: pop
    //   43: ldc2_w 233
    //   46: ldc -21
    //   48: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: goto -26 -> 25
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	MultiTalkVideoView
    //   0	59	1	paramArrayOfInt	int[]
    //   0	59	2	paramInt1	int
    //   0	59	3	paramInt2	int
    //   0	59	4	paramInt3	int
    //   0	59	5	paramInt4	int
    // Exception table:
    //   from	to	target	type
    //   2	25	54	finally
    //   28	51	54	finally
  }
  
  public final void aSa()
  {
    GMTrace.i(4777211592704L, 35593);
    if (aSf()) {
      o.aRS().a(this, true);
    }
    GMTrace.o(4777211592704L, 35593);
  }
  
  public final void aSb()
  {
    GMTrace.i(4777345810432L, 35594);
    if (bg.nm(this.username))
    {
      GMTrace.o(4777345810432L, 35594);
      return;
    }
    w.i("MicroMsg.MT.MultiTalkVideoView", "changeToAvatar %s from %s", new Object[] { this.username, this.npo.name() });
    this.npo = a.npq;
    aSa();
    GMTrace.o(4777345810432L, 35594);
  }
  
  public final void aSc()
  {
    GMTrace.i(4777480028160L, 35595);
    w.i("MicroMsg.MT.MultiTalkVideoView", "changeToVideo %s from %s", new Object[] { this.username, this.npo.name() });
    this.npo = a.npr;
    GMTrace.o(4777480028160L, 35595);
  }
  
  public final void aSd()
  {
    GMTrace.i(20506589790208L, 152786);
    w.i("MicroMsg.MT.MultiTalkVideoView", "changeToNone %s from %s", new Object[] { this.username, this.npo.name() });
    this.npo = a.nps;
    this.username = null;
    aSe();
    GMTrace.o(20506589790208L, 152786);
  }
  
  public final boolean aSg()
  {
    GMTrace.i(4778016899072L, 35599);
    if (this.npo == a.npr)
    {
      GMTrace.o(4778016899072L, 35599);
      return true;
    }
    GMTrace.o(4778016899072L, 35599);
    return false;
  }
  
  public final void anc()
  {
    GMTrace.i(4777748463616L, 35597);
    if (aSf())
    {
      o.aRS().a(this, false);
      GMTrace.o(4777748463616L, 35597);
      return;
    }
    if (aSg())
    {
      l.a locala = (l.a)o.aRS().nnu.get(this.username);
      if (locala != null) {}
      for (Bitmap localBitmap = locala.nnx;; localBitmap = null)
      {
        if (localBitmap != null) {
          a(localBitmap, locala.angle, locala.nnf);
        }
        GMTrace.o(4777748463616L, 35597);
        return;
      }
    }
    aSe();
    GMTrace.o(4777748463616L, 35597);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(4778151116800L, 35600);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureAvailable %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.npm = paramSurfaceTexture;
    this.hwT = paramInt1;
    this.hwU = paramInt2;
    cau();
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4774124584960L, 35570);
        MultiTalkVideoView.this.anc();
        GMTrace.o(4774124584960L, 35570);
      }
    }, "onSurfaceTextureAvailable_refreshView");
    GMTrace.o(4778151116800L, 35600);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(4778419552256L, 35602);
    String str = this.username;
    if (paramSurfaceTexture != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureDestroyed %s %b", new Object[] { str, Boolean.valueOf(bool) });
      this.npm = null;
      this.hwU = 0;
      this.hwT = 0;
      GMTrace.o(4778419552256L, 35602);
      return false;
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(4778285334528L, 35601);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.i("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureSizeChanged %s %b %d %d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.hwT = paramInt1;
    this.hwU = paramInt2;
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4780701253632L, 35619);
        MultiTalkVideoView.this.anc();
        GMTrace.o(4780701253632L, 35619);
      }
    }, "onSurfaceTextureSizeChanged_refreshView");
    GMTrace.o(4778285334528L, 35601);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = false;
    GMTrace.i(4778553769984L, 35603);
    String str = this.username;
    if (paramSurfaceTexture != null) {
      bool = true;
    }
    w.v("MicroMsg.MT.MultiTalkVideoView", "onSurfaceTextureUpdated %s %b", new Object[] { str, Boolean.valueOf(bool) });
    GMTrace.o(4778553769984L, 35603);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(4780030164992L, 35614);
      npq = new a("Avatar", 0);
      npr = new a("Video", 1);
      nps = new a("None", 2);
      npt = new a[] { npq, npr, nps };
      GMTrace.o(4780030164992L, 35614);
    }
    
    private a()
    {
      GMTrace.i(4779895947264L, 35613);
      GMTrace.o(4779895947264L, 35613);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\MultiTalkVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */