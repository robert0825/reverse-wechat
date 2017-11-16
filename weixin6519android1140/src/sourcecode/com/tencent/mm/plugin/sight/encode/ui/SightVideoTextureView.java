package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.y.at;

@TargetApi(14)
public class SightVideoTextureView
  extends SightCameraView
{
  private boolean mMute;
  private TextureView mTextureView;
  private String oRS;
  private MediaPlayer oWu;
  SurfaceTexture oWv;
  private Surface oWw;
  private boolean oWx;
  
  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9340480126976L, 69592);
    GMTrace.o(9340480126976L, 69592);
  }
  
  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9340345909248L, 69591);
    this.mTextureView = null;
    this.oWv = null;
    this.oWw = null;
    this.mTextureView = ((TextureView)findViewById(R.h.cgf));
    this.mTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
    {
      public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9353230811136L, 69687);
        w.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureAvailable, [%d, %d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        SightVideoTextureView.this.oWh = SightCameraView.a.oWq;
        SightVideoTextureView.a(SightVideoTextureView.this, paramAnonymousSurfaceTexture);
        ((MMTextureView)SightVideoTextureView.a(SightVideoTextureView.this)).cau();
        w.i("MicroMsg.SightVideoTextureView", "available texture %s, wantPlay %B", new Object[] { paramAnonymousSurfaceTexture, Boolean.valueOf(SightVideoTextureView.b(SightVideoTextureView.this)) });
        if (SightVideoTextureView.b(SightVideoTextureView.this)) {
          SightVideoTextureView.this.as(SightVideoTextureView.c(SightVideoTextureView.this), SightVideoTextureView.d(SightVideoTextureView.this));
        }
        GMTrace.o(9353230811136L, 69687);
      }
      
      public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(9353499246592L, 69689);
        w.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureDestroyed");
        SightVideoTextureView.this.oWh = SightCameraView.a.oWs;
        SightVideoTextureView.a(SightVideoTextureView.this, null);
        SightVideoTextureView.this.oWj = false;
        w.i("MicroMsg.SightVideoTextureView", "destroyed texture %s", new Object[] { paramAnonymousSurfaceTexture });
        GMTrace.o(9353499246592L, 69689);
        return true;
      }
      
      public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9353365028864L, 69688);
        w.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureSizeChanged, [%d, %d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        SightVideoTextureView.this.oWh = SightCameraView.a.oWr;
        w.i("MicroMsg.SightVideoTextureView", "changed texture %s", new Object[] { paramAnonymousSurfaceTexture });
        GMTrace.o(9353365028864L, 69688);
      }
      
      public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(9353633464320L, 69690);
        GMTrace.o(9353633464320L, 69690);
      }
    });
    GMTrace.o(9340345909248L, 69591);
  }
  
  public final void an(float paramFloat)
  {
    GMTrace.i(9341822304256L, 69602);
    Object localObject1 = this.mTextureView.getLayoutParams();
    Object localObject2 = getResources().getDisplayMetrics();
    w.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate [%f], dm[%d, %d]", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(((DisplayMetrics)localObject2).widthPixels), Integer.valueOf(((DisplayMetrics)localObject2).heightPixels) });
    ((ViewGroup.LayoutParams)localObject1).width = ((DisplayMetrics)localObject2).widthPixels;
    ((ViewGroup.LayoutParams)localObject1).height = ((int)(((DisplayMetrics)localObject2).widthPixels / paramFloat));
    w.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate width:%d, height:%d", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject1).width), Integer.valueOf(((ViewGroup.LayoutParams)localObject1).height) });
    this.mTextureView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject1 = getResources().getDisplayMetrics();
    localObject2 = getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).width = ((DisplayMetrics)localObject1).widthPixels;
    ((ViewGroup.LayoutParams)localObject2).height = ((int)(((DisplayMetrics)localObject1).widthPixels / paramFloat));
    w.i("MicroMsg.SightCameraView", "resizeLayout width:%d, height:%d, previewRate %f", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject2).width), Integer.valueOf(((ViewGroup.LayoutParams)localObject2).height), Float.valueOf(paramFloat) });
    postInvalidate();
    GMTrace.o(9341822304256L, 69602);
  }
  
  public final void as(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(9341016997888L, 69596);
    w.i("MicroMsg.SightVideoTextureView", "start play video, path %s, mute %B, wantPlay %B", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(this.oWx) });
    this.oRS = paramString;
    this.mMute = paramBoolean;
    if (this.oWv == null)
    {
      w.w("MicroMsg.SightVideoTextureView", "play video fail, texture is null");
      this.oWx = true;
      GMTrace.o(9341016997888L, 69596);
      return;
    }
    this.oWx = false;
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9297396236288L, 69271);
        if (SightVideoTextureView.e(SightVideoTextureView.this) != null) {}
        try
        {
          SightVideoTextureView.e(SightVideoTextureView.this).stop();
          SightVideoTextureView.e(SightVideoTextureView.this).release();
        }
        catch (Exception localException1)
        {
          try
          {
            SightVideoTextureView.a(SightVideoTextureView.this, new i());
            SightVideoTextureView.e(SightVideoTextureView.this).setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
              public final void onCompletion(MediaPlayer paramAnonymous2MediaPlayer)
              {
                GMTrace.i(9297127800832L, 69269);
                w.i("MicroMsg.SightVideoTextureView", "complete playing %s ", new Object[] { SightVideoTextureView.2.this.oWz });
                SightVideoTextureView.this.bhw();
                GMTrace.o(9297127800832L, 69269);
              }
            });
            SightVideoTextureView.e(SightVideoTextureView.this).setOnErrorListener(new MediaPlayer.OnErrorListener()
            {
              public final boolean onError(MediaPlayer paramAnonymous2MediaPlayer, int paramAnonymous2Int1, int paramAnonymous2Int2)
              {
                GMTrace.i(9299677937664L, 69288);
                w.i("MicroMsg.SightVideoTextureView", "play %s error", new Object[] { SightVideoTextureView.2.this.oWz });
                GMTrace.o(9299677937664L, 69288);
                return false;
              }
            });
            SightVideoTextureView.e(SightVideoTextureView.this).setDataSource(paramString);
            SightVideoTextureView localSightVideoTextureView = SightVideoTextureView.this;
            Object localObject1 = SightVideoTextureView.this;
            if (((SightVideoTextureView)localObject1).oWv != null)
            {
              localObject1 = new Surface(((SightVideoTextureView)localObject1).oWv);
              label132:
              SightVideoTextureView.a(localSightVideoTextureView, (Surface)localObject1);
              SightVideoTextureView.e(SightVideoTextureView.this).setSurface(SightVideoTextureView.f(SightVideoTextureView.this));
              SightVideoTextureView.e(SightVideoTextureView.this).setAudioStreamType(3);
              if (!paramBoolean) {
                break label264;
              }
              SightVideoTextureView.e(SightVideoTextureView.this).setVolume(0.0F, 0.0F);
            }
            for (;;)
            {
              SightVideoTextureView.e(SightVideoTextureView.this).setScreenOnWhilePlaying(true);
              SightVideoTextureView.e(SightVideoTextureView.this).setLooping(true);
              SightVideoTextureView.e(SightVideoTextureView.this).prepare();
              SightVideoTextureView.e(SightVideoTextureView.this).start();
              GMTrace.o(9297396236288L, 69271);
              return;
              localException1 = localException1;
              w.printErrStackTrace("MicroMsg.SightVideoTextureView", localException1, "", new Object[0]);
              w.w("MicroMsg.SightVideoTextureView", "try to release mediaplayer error");
              break;
              Object localObject2 = null;
              break label132;
              label264:
              SightVideoTextureView.this.bhv();
            }
            return;
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.SightVideoTextureView", "play %s, error: %s, %s", new Object[] { paramString, localException2.getMessage(), bg.f(localException2) });
            GMTrace.o(9297396236288L, 69271);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(9297530454016L, 69272);
        String str = super.toString() + "|playVideo";
        GMTrace.o(9297530454016L, 69272);
        return str;
      }
    });
    GMTrace.o(9341016997888L, 69596);
  }
  
  public final void bhr()
  {
    GMTrace.i(9341285433344L, 69598);
    w.i("MicroMsg.SightVideoTextureView", "stop play video, wantPlay %B", new Object[] { Boolean.valueOf(this.oWx) });
    if ((this.oWu == null) && (!this.oWx))
    {
      w.w("MicroMsg.SightVideoTextureView", "mediaplayer is null, do nothing when stop play video");
      GMTrace.o(9341285433344L, 69598);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9324776652800L, 69475);
        try
        {
          SightVideoTextureView.this.bhw();
          SightVideoTextureView.e(SightVideoTextureView.this).stop();
          SightVideoTextureView.e(SightVideoTextureView.this).release();
          if ((SightVideoTextureView.f(SightVideoTextureView.this) != null) && (SightVideoTextureView.f(SightVideoTextureView.this).isValid()))
          {
            SightVideoTextureView.f(SightVideoTextureView.this).release();
            SightVideoTextureView.a(SightVideoTextureView.this, null);
          }
          SightVideoTextureView.a(SightVideoTextureView.this, null);
          GMTrace.o(9324776652800L, 69475);
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.w("MicroMsg.SightVideoTextureView", "stop play video error: %s, %s", new Object[] { localException.getMessage(), bg.f(localException) });
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(9324910870528L, 69476);
        String str = super.toString() + "|stopPlayVideo";
        GMTrace.o(9324910870528L, 69476);
        return str;
      }
    });
    GMTrace.o(9341285433344L, 69598);
  }
  
  protected final int bhs()
  {
    GMTrace.i(9341553868800L, 69600);
    if (this.mTextureView != null)
    {
      int i = this.mTextureView.getWidth();
      GMTrace.o(9341553868800L, 69600);
      return i;
    }
    GMTrace.o(9341553868800L, 69600);
    return 0;
  }
  
  protected final int bht()
  {
    GMTrace.i(9341688086528L, 69601);
    if (this.mTextureView != null)
    {
      int i = this.mTextureView.getHeight();
      GMTrace.o(9341688086528L, 69601);
      return i;
    }
    GMTrace.o(9341688086528L, 69601);
    return 0;
  }
  
  protected final void hz(boolean paramBoolean)
  {
    GMTrace.i(9340882780160L, 69595);
    if (this.oWu == null)
    {
      GMTrace.o(9340882780160L, 69595);
      return;
    }
    try
    {
      boolean bool = this.oWu.isPlaying();
      if (!bool)
      {
        GMTrace.o(9340882780160L, 69595);
        return;
      }
    }
    catch (Exception localException1)
    {
      w.w("MicroMsg.SightVideoTextureView", "setIsMute %B, check MediaPlayer playing Fail: %s", new Object[] { Boolean.valueOf(paramBoolean), localException1.getMessage() });
      GMTrace.o(9340882780160L, 69595);
      return;
    }
    if (paramBoolean) {
      try
      {
        this.oWu.setVolume(0.0F, 0.0F);
        GMTrace.o(9340882780160L, 69595);
        return;
      }
      catch (Exception localException2)
      {
        w.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 0, 0 Fail: %s", new Object[] { localException2.getMessage() });
        GMTrace.o(9340882780160L, 69595);
        return;
      }
    }
    bhv();
    try
    {
      this.oWu.setVolume(1.0F, 1.0F);
      GMTrace.o(9340882780160L, 69595);
      return;
    }
    catch (Exception localException3)
    {
      w.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 1, 1 Fail: %s", new Object[] { localException3.getMessage() });
      GMTrace.o(9340882780160L, 69595);
    }
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(9341151215616L, 69597);
    try
    {
      if (this.oWu == null)
      {
        GMTrace.o(9341151215616L, 69597);
        return false;
      }
      boolean bool = this.oWu.isPlaying();
      GMTrace.o(9341151215616L, 69597);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SightVideoTextureView", localException, "", new Object[0]);
      GMTrace.o(9341151215616L, 69597);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\SightVideoTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */