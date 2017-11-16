package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.s.b;
import com.tencent.mm.plugin.s.c;
import com.tencent.mm.plugin.s.g;
import com.tencent.mm.plugin.s.i;
import com.tencent.mm.plugin.s.j;
import com.tencent.mm.plugin.s.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;

public class VideoPlayerTextureView
  extends MMTextureView
  implements f
{
  private boolean GI;
  private boolean jGN;
  public Surface mSurface;
  public b mVG;
  private int mVideoHeight;
  private int mVideoWidth;
  private boolean mVy;
  private boolean mVz;
  public f.a oTm;
  private String path;
  public i tHj;
  private int tHk;
  private boolean tHl;
  private long tHm;
  private boolean tHn;
  public boolean tHo;
  public f.e tHp;
  private f.c tHq;
  private f.d tHr;
  private boolean tHs;
  private boolean tHt;
  public boolean tHu;
  private c tHv;
  private TextureView.SurfaceTextureListener tHw;
  public o tHx;
  
  public VideoPlayerTextureView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1095887749120L, 8165);
    GMTrace.o(1095887749120L, 8165);
  }
  
  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1096021966848L, 8166);
    GMTrace.o(1096021966848L, 8166);
  }
  
  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1096156184576L, 8167);
    this.mVideoHeight = 0;
    this.mVideoWidth = 0;
    this.tHk = 0;
    this.GI = false;
    this.tHl = true;
    this.tHm = 0L;
    this.tHn = false;
    this.tHo = false;
    this.mVy = false;
    this.mVz = false;
    this.tHs = false;
    this.tHt = false;
    this.tHu = false;
    this.tHv = new c()
    {
      public final void F(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1118570545152L, 8334);
        w.i("MicroMsg.VideoPlayerTextureView", "video size changed size[%d, %d] degrees[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
        VideoPlayerTextureView.h(VideoPlayerTextureView.this).reset();
        VideoPlayerTextureView.a(VideoPlayerTextureView.this, paramAnonymousInt3);
        VideoPlayerTextureView.b(VideoPlayerTextureView.this, paramAnonymousInt1);
        VideoPlayerTextureView.c(VideoPlayerTextureView.this, paramAnonymousInt2);
        VideoPlayerTextureView.i(VideoPlayerTextureView.this);
        if (VideoPlayerTextureView.c(VideoPlayerTextureView.this) != null) {
          VideoPlayerTextureView.c(VideoPlayerTextureView.this).bs(VideoPlayerTextureView.j(VideoPlayerTextureView.this), VideoPlayerTextureView.k(VideoPlayerTextureView.this));
        }
        GMTrace.o(1118570545152L, 8334);
      }
      
      public final void Xq()
      {
        GMTrace.i(1118033674240L, 8330);
        VideoPlayerTextureView.a(VideoPlayerTextureView.this);
        VideoPlayerTextureView.this.setMute(VideoPlayerTextureView.b(VideoPlayerTextureView.this));
        if (VideoPlayerTextureView.c(VideoPlayerTextureView.this) != null) {
          VideoPlayerTextureView.c(VideoPlayerTextureView.this).Xq();
        }
        VideoPlayerTextureView.this.requestLayout();
        GMTrace.o(1118033674240L, 8330);
      }
      
      public final void aOx()
      {
        GMTrace.i(1118436327424L, 8333);
        if (VideoPlayerTextureView.d(VideoPlayerTextureView.this) != null) {
          VideoPlayerTextureView.d(VideoPlayerTextureView.this).bE(VideoPlayerTextureView.e(VideoPlayerTextureView.this));
        }
        if (!VideoPlayerTextureView.e(VideoPlayerTextureView.this))
        {
          w.d("MicroMsg.VideoPlayerTextureView", "player seek done, but don't play now.");
          VideoPlayerTextureView.f(VideoPlayerTextureView.this);
          GMTrace.o(1118436327424L, 8333);
          return;
        }
        if (VideoPlayerTextureView.g(VideoPlayerTextureView.this) != null)
        {
          w.d("MicroMsg.VideoPlayerTextureView", "%s player seek done", new Object[] { VideoPlayerTextureView.g(VideoPlayerTextureView.this).aiJ() });
          VideoPlayerTextureView.g(VideoPlayerTextureView.this).start();
        }
        GMTrace.o(1118436327424L, 8333);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(1118167891968L, 8331);
        if (VideoPlayerTextureView.c(VideoPlayerTextureView.this) != null) {
          VideoPlayerTextureView.c(VideoPlayerTextureView.this).onCompletion();
        }
        GMTrace.o(1118167891968L, 8331);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1118302109696L, 8332);
        if (VideoPlayerTextureView.c(VideoPlayerTextureView.this) != null) {
          VideoPlayerTextureView.c(VideoPlayerTextureView.this).onError(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(1118302109696L, 8332);
      }
    };
    this.tHw = new TextureView.SurfaceTextureListener()
    {
      public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1084747677696L, 8082);
        w.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Boolean.valueOf(VideoPlayerTextureView.l(VideoPlayerTextureView.this)) });
        for (;;)
        {
          try
          {
            VideoPlayerTextureView.this.cau();
            VideoPlayerTextureView.a(VideoPlayerTextureView.this, new Surface(paramAnonymousSurfaceTexture));
            if ((VideoPlayerTextureView.g(VideoPlayerTextureView.this) == null) || (!VideoPlayerTextureView.m(VideoPlayerTextureView.this)))
            {
              VideoPlayerTextureView.n(VideoPlayerTextureView.this);
              VideoPlayerTextureView.i(VideoPlayerTextureView.this);
              if (VideoPlayerTextureView.p(VideoPlayerTextureView.this) != null) {
                VideoPlayerTextureView.p(VideoPlayerTextureView.this).MV();
              }
              GMTrace.o(1084747677696L, 8082);
              return;
            }
            Object localObject = VideoPlayerTextureView.g(VideoPlayerTextureView.this);
            paramAnonymousSurfaceTexture = VideoPlayerTextureView.o(VideoPlayerTextureView.this);
            if (paramAnonymousSurfaceTexture != null)
            {
              localObject = ((i)localObject).mWb;
              w.i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", new Object[] { ((j)localObject).mVD.aiJ(), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()) });
              localObject = ((j)localObject).mWk;
              w.i("MicroMsg.VideoTrackDataSource", "%s set out put surface", new Object[] { ((k)localObject).aiJ() });
              ((k)localObject).mWr = paramAnonymousSurfaceTexture;
              if (d.et(23)) {
                ((k)localObject).aOL();
              }
            }
            else
            {
              if (!VideoPlayerTextureView.l(VideoPlayerTextureView.this)) {
                break label315;
              }
              VideoPlayerTextureView.g(VideoPlayerTextureView.this).start();
              VideoPlayerTextureView.b(VideoPlayerTextureView.this, false);
              continue;
            }
            ((k)localObject).aOM();
          }
          catch (Exception paramAnonymousSurfaceTexture)
          {
            GMTrace.o(1084747677696L, 8082);
            return;
          }
          continue;
          label315:
          VideoPlayerTextureView.a(VideoPlayerTextureView.this, true);
          VideoPlayerTextureView.a(VideoPlayerTextureView.this, 0L);
          VideoPlayerTextureView.g(VideoPlayerTextureView.this).setMute(true);
          VideoPlayerTextureView.g(VideoPlayerTextureView.this).start();
        }
      }
      
      public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(1085016113152L, 8084);
        w.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] destroyed", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()) });
        VideoPlayerTextureView.a(VideoPlayerTextureView.this, null);
        VideoPlayerTextureView.b(VideoPlayerTextureView.this, false);
        VideoPlayerTextureView.a(VideoPlayerTextureView.this, false);
        if (VideoPlayerTextureView.g(VideoPlayerTextureView.this) != null) {
          if (VideoPlayerTextureView.this.isPlaying())
          {
            VideoPlayerTextureView.b(VideoPlayerTextureView.this, true);
            VideoPlayerTextureView.g(VideoPlayerTextureView.this).pause();
          }
        }
        for (;;)
        {
          GMTrace.o(1085016113152L, 8084);
          return false;
          VideoPlayerTextureView.b(VideoPlayerTextureView.this, false);
        }
      }
      
      public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1084881895424L, 8083);
        w.d("MicroMsg.VideoPlayerTextureView", "surface[%d] size changed [%d, %d]", new Object[] { Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoPlayerTextureView.i(VideoPlayerTextureView.this);
        GMTrace.o(1084881895424L, 8083);
      }
      
      public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(1085150330880L, 8085);
        if ((VideoPlayerTextureView.q(VideoPlayerTextureView.this)) && (VideoPlayerTextureView.r(VideoPlayerTextureView.this) > 0L))
        {
          VideoPlayerTextureView.g(VideoPlayerTextureView.this).pause();
          VideoPlayerTextureView.g(VideoPlayerTextureView.this).setMute(VideoPlayerTextureView.b(VideoPlayerTextureView.this));
          VideoPlayerTextureView.a(VideoPlayerTextureView.this, false);
        }
        if ((VideoPlayerTextureView.r(VideoPlayerTextureView.this) > 0L) && (VideoPlayerTextureView.s(VideoPlayerTextureView.this) != null))
        {
          w.i("MicroMsg.VideoPlayerTextureView", "%d notify surface update", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()) });
          VideoPlayerTextureView.s(VideoPlayerTextureView.this).aQG();
          VideoPlayerTextureView.t(VideoPlayerTextureView.this);
        }
        VideoPlayerTextureView.a(VideoPlayerTextureView.this, System.currentTimeMillis());
        GMTrace.o(1085150330880L, 8085);
      }
    };
    this.tHx = new o();
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    setSurfaceTextureListener(this.tHw);
    setFocusable(true);
    setFocusableInTouchMode(true);
    GMTrace.o(1096156184576L, 8167);
  }
  
  private void aze()
  {
    GMTrace.i(1098974756864L, 8188);
    w.i("MicroMsg.VideoPlayerTextureView", "%d open video [%s]", new Object[] { Integer.valueOf(hashCode()), this.path });
    if (this.tHj != null)
    {
      this.tHj.mWc = null;
      this.tHj.mWb.stop();
      this.tHj.release();
      this.tHj = null;
    }
    if ((bg.nm(this.path)) || (this.mSurface == null))
    {
      w.w("MicroMsg.VideoPlayerTextureView", "%d open video but path is null or mSurface is null", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(1098974756864L, 8188);
      return;
    }
    try
    {
      this.GI = false;
      this.tHj = new i(Looper.getMainLooper());
      this.tHj.setPath(this.path);
      i locali = this.tHj;
      b localb = this.mVG;
      if ((localb != null) && (locali.mWb != null)) {
        locali.mWb.mWk.mVG = localb;
      }
      this.tHj.fT(this.mVy);
      this.tHj.fU(this.mVz);
      this.tHj.mWc = this.tHv;
      this.tHj.setSurface(this.mSurface);
      locali = this.tHj;
      boolean bool = this.tHs;
      locali.mWb.mWk.mWu = bool;
      if (this.mSurface != null)
      {
        this.tHj.aOG();
        GMTrace.o(1098974756864L, 8188);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.VideoPlayerTextureView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
      if (this.oTm != null) {
        this.oTm.onError(-1, -1);
      }
      GMTrace.o(1098974756864L, 8188);
      return;
    }
    if (this.tHo) {
      this.tHj.aOG();
    }
    GMTrace.o(1098974756864L, 8188);
  }
  
  public final String NE()
  {
    GMTrace.i(1096827273216L, 8172);
    String str = this.path;
    GMTrace.o(1096827273216L, 8172);
    return str;
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(1097766797312L, 8179);
    this.oTm = parama;
    GMTrace.o(1097766797312L, 8179);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16400466837504L, 122193);
    GMTrace.o(16400466837504L, 122193);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16400332619776L, 122192);
    this.tHq = paramc;
    GMTrace.o(16400332619776L, 122192);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17470853218304L, 130168);
    this.tHr = paramd;
    GMTrace.o(17470853218304L, 130168);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(1096290402304L, 8168);
    this.tHp = parame;
    GMTrace.o(1096290402304L, 8168);
  }
  
  public final void aOJ()
  {
    GMTrace.i(17471121653760L, 130170);
    if ((this.tHj != null) && (this.GI) && (this.mSurface != null))
    {
      w.i("MicroMsg.VideoPlayerTextureView", "%d flush surface start ", new Object[] { Integer.valueOf(hashCode()) });
      i locali = this.tHj;
      if (locali.mWb != null) {
        locali.mWb.aOJ();
      }
    }
    GMTrace.o(17471121653760L, 130170);
  }
  
  public final void bNq()
  {
    GMTrace.i(20206881603584L, 150553);
    this.tHn = true;
    this.tHx.tHn = this.tHn;
    GMTrace.o(20206881603584L, 150553);
  }
  
  public final double bgO()
  {
    GMTrace.i(1098169450496L, 8182);
    GMTrace.o(1098169450496L, 8182);
    return 0.0D;
  }
  
  public final long bgP()
  {
    GMTrace.i(1098706321408L, 8186);
    long l = this.tHm;
    GMTrace.o(1098706321408L, 8186);
    return l;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(1098437885952L, 8184);
    this.tHl = paramBoolean;
    o(paramDouble);
    GMTrace.o(1098437885952L, 8184);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(1097632579584L, 8178);
    GMTrace.o(1097632579584L, 8178);
  }
  
  public final void fT(boolean paramBoolean)
  {
    GMTrace.i(1096424620032L, 8169);
    this.mVy = paramBoolean;
    if (this.tHj != null) {
      this.tHj.fT(paramBoolean);
    }
    GMTrace.o(1096424620032L, 8169);
  }
  
  public final void fU(boolean paramBoolean)
  {
    GMTrace.i(18681765560320L, 139190);
    this.mVz = paramBoolean;
    if (this.tHj != null) {
      this.tHj.fU(paramBoolean);
    }
    GMTrace.o(18681765560320L, 139190);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(1097901015040L, 8180);
    if (this.tHj != null)
    {
      int i = this.tHj.aOH();
      GMTrace.o(1097901015040L, 8180);
      return i;
    }
    GMTrace.o(1097901015040L, 8180);
    return 0;
  }
  
  public final int getDuration()
  {
    GMTrace.i(1098035232768L, 8181);
    if (this.tHj != null)
    {
      int i = (int)this.tHj.mWb.mVK;
      GMTrace.o(1098035232768L, 8181);
      return i;
    }
    GMTrace.o(1098035232768L, 8181);
    return 0;
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(1098572103680L, 8185);
    GMTrace.o(1098572103680L, 8185);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(1096558837760L, 8170);
    if (this.tHj != null)
    {
      boolean bool = this.tHj.isPlaying();
      GMTrace.o(1096558837760L, 8170);
      return bool;
    }
    GMTrace.o(1096558837760L, 8170);
    return false;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(1097095708672L, 8174);
    paramBoolean = start();
    GMTrace.o(1097095708672L, 8174);
    return paramBoolean;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(1098303668224L, 8183);
    if (this.tHj != null) {
      this.tHj.qz((int)paramDouble);
    }
    GMTrace.o(1098303668224L, 8183);
  }
  
  public final void onDetach()
  {
    GMTrace.i(1097498361856L, 8177);
    GMTrace.o(1097498361856L, 8177);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1099108974592L, 8189);
    if ((this.mVideoWidth == 0) || (this.mVideoHeight == 0))
    {
      setMeasuredDimension(1, 1);
      GMTrace.o(1099108974592L, 8189);
      return;
    }
    paramInt1 = getDefaultSize(1, paramInt1);
    paramInt2 = getDefaultSize(1, paramInt2);
    int i = this.mVideoWidth;
    int j = this.mVideoHeight;
    this.tHx.s(paramInt1, paramInt2, i, j);
    paramInt1 = this.tHx.tHX;
    paramInt2 = this.tHx.tHY;
    if ((this.tHk == 90) || (this.tHk == 270))
    {
      Matrix localMatrix = new Matrix();
      localMatrix.set(getMatrix());
      float f1 = paramInt1 / 2.0F;
      float f2 = paramInt2 / 2.0F;
      float f3 = paramInt2 / paramInt1;
      if ((getScaleX() != 1.0F) || (getScaleY() != 1.0F)) {
        localMatrix.setScale(getScaleX(), getScaleY(), f1, f2);
      }
      localMatrix.postRotate(this.tHk, f1, f2);
      localMatrix.postScale(1.0F / f3, f3, f1, f2);
      setTransform(localMatrix);
    }
    setMeasuredDimension(paramInt1, paramInt2);
    GMTrace.o(1099108974592L, 8189);
  }
  
  public final void pause()
  {
    GMTrace.i(1097364144128L, 8176);
    if ((this.tHj != null) && (this.tHj.isPlaying())) {
      this.tHj.pause();
    }
    this.tHt = false;
    GMTrace.o(1097364144128L, 8176);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(1098840539136L, 8187);
    this.jGN = paramBoolean;
    if (this.tHj != null)
    {
      w.i("MicroMsg.VideoPlayerTextureView", "%d set mute [%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
      this.tHj.setMute(paramBoolean);
    }
    GMTrace.o(1098840539136L, 8187);
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(1096693055488L, 8171);
    w.i("MicroMsg.VideoPlayerTextureView", "%d set video path [%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    this.path = paramString;
    aze();
    requestLayout();
    GMTrace.o(1096693055488L, 8171);
  }
  
  public final boolean start()
  {
    GMTrace.i(1096961490944L, 8173);
    if ((this.tHj != null) && (this.GI))
    {
      i = hashCode();
      boolean bool2 = this.tHu;
      boolean bool3 = this.tHt;
      if (this.mSurface != null) {}
      for (bool1 = true;; bool1 = false)
      {
        w.i("MicroMsg.VideoPlayerTextureView", "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        if (this.mSurface != null) {
          break;
        }
        this.tHt = true;
        GMTrace.o(1096961490944L, 8173);
        return true;
      }
      if (this.tHu)
      {
        this.tHt = true;
        this.tHu = false;
        setMute(this.jGN);
        GMTrace.o(1096961490944L, 8173);
        return true;
      }
      this.tHj.start();
      GMTrace.o(1096961490944L, 8173);
      return true;
    }
    int i = hashCode();
    if (this.tHj == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      w.w("MicroMsg.VideoPlayerTextureView", "%d player is null[%b] or it prepared [%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(this.GI) });
      GMTrace.o(1096961490944L, 8173);
      return false;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(1097229926400L, 8175);
    w.i("MicroMsg.VideoPlayerTextureView", "%d player stop", new Object[] { Integer.valueOf(hashCode()) });
    if (this.tHj != null)
    {
      this.tHj.mWc = null;
      this.tHj.mWb.stop();
      this.tHj.release();
      this.tHj = null;
    }
    this.tHk = 0;
    this.mVideoHeight = 0;
    this.mVideoWidth = 0;
    this.tHx.reset();
    this.GI = false;
    this.path = null;
    this.tHm = 0L;
    GMTrace.o(1097229926400L, 8175);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoPlayerTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */