package com.tencent.mm.plugin.sight.decode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

@TargetApi(14)
public class SightPlayTextureView
  extends MMTextureView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  private Surface mSurface;
  private b oTg;
  private int oTi;
  private boolean oTo;
  private int oTt;
  private int videoHeight;
  private int videoWidth;
  
  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9265452417024L, 69033);
    GMTrace.o(9265452417024L, 69033);
  }
  
  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9265318199296L, 69032);
    this.oTo = false;
    setOpaque(false);
    this.oTg = new b(this);
    setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
    {
      public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9270552690688L, 69071);
        w.i("MicroMsg.SightPlayTextureView", "on surface texture available, width %d height %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        SightPlayTextureView.a locala = new SightPlayTextureView.a();
        locala.oTv = SightPlayTextureView.e(SightPlayTextureView.this);
        o.d(locala, 0L);
        SightPlayTextureView.a(SightPlayTextureView.this, new Surface(paramAnonymousSurfaceTexture));
        SightPlayTextureView.d(SightPlayTextureView.this).a(SightPlayTextureView.e(SightPlayTextureView.this));
        SightPlayTextureView.this.cau();
        GMTrace.o(9270552690688L, 69071);
      }
      
      public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(9270418472960L, 69070);
        w.i("MicroMsg.SightPlayTextureView", "on surface texture destroyed");
        SightPlayTextureView.d(SightPlayTextureView.this).a(null);
        SightPlayTextureView.d(SightPlayTextureView.this).clear();
        paramAnonymousSurfaceTexture = new SightPlayTextureView.a();
        paramAnonymousSurfaceTexture.oTv = SightPlayTextureView.e(SightPlayTextureView.this);
        o.d(paramAnonymousSurfaceTexture, 0L);
        SightPlayTextureView.a(SightPlayTextureView.this, null);
        GMTrace.o(9270418472960L, 69070);
        return false;
      }
      
      public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9270284255232L, 69069);
        w.i("MicroMsg.SightPlayTextureView", "on surface texture size changed, width " + paramAnonymousInt1 + " height " + paramAnonymousInt2);
        GMTrace.o(9270284255232L, 69069);
      }
      
      public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(9270150037504L, 69068);
        GMTrace.o(9270150037504L, 69068);
      }
    });
    GMTrace.o(9265318199296L, 69032);
  }
  
  private void n(double paramDouble)
  {
    GMTrace.i(9266660376576L, 69042);
    final ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if (localLayoutParams.height != (int)(this.oTi * paramDouble))
    {
      localLayoutParams.width = this.oTi;
      localLayoutParams.height = ((int)(this.oTi * paramDouble));
      if ((this.oTo) && (localLayoutParams.height < com.tencent.mm.br.a.fromDPToPix(getContext(), 50))) {
        localLayoutParams.height = com.tencent.mm.br.a.fromDPToPix(getContext(), 50);
      }
      w.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
      if (af.isMainThread())
      {
        setLayoutParams(localLayoutParams);
        GMTrace.o(9266660376576L, 69042);
        return;
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9249212071936L, 68912);
          SightPlayTextureView.this.setLayoutParams(localLayoutParams);
          GMTrace.o(9249212071936L, 68912);
        }
      });
    }
    GMTrace.o(9266660376576L, 69042);
  }
  
  public final void D(Bitmap paramBitmap)
  {
    GMTrace.i(9266794594304L, 69043);
    boolean bool1;
    boolean bool2;
    if (paramBitmap == null)
    {
      bool1 = true;
      if (this.mSurface != null) {
        break label186;
      }
      bool2 = true;
      label23:
      w.d("MicroMsg.SightPlayTextureView", "thumb is null? %B, surface is null? %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (paramBitmap == null) {
        break label207;
      }
      w.d("MicroMsg.SightPlayTextureView", "thumb size [%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()) });
      if (this.oTo) {
        if (paramBitmap.getWidth() < paramBitmap.getHeight()) {
          break label191;
        }
      }
    }
    label186:
    label191:
    for (this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 150);; this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 85))
    {
      Bitmap localBitmap = b.a(getContext(), this.oTt, this.oTi, paramBitmap.getWidth(), paramBitmap.getHeight());
      n(paramBitmap.getHeight() / paramBitmap.getWidth());
      this.oTg.oRX = localBitmap;
      this.oTg.E(paramBitmap);
      GMTrace.o(9266794594304L, 69043);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label23;
    }
    label207:
    this.oTg.E(null);
    GMTrace.o(9266794594304L, 69043);
  }
  
  public final String NE()
  {
    GMTrace.i(9265586634752L, 69034);
    String str = this.oTg.oRS;
    GMTrace.o(9265586634752L, 69034);
    return str;
  }
  
  public final void a(b.e parame)
  {
    GMTrace.i(9267868336128L, 69051);
    this.oTg.oSy = parame;
    GMTrace.o(9267868336128L, 69051);
  }
  
  public final void a(b.f paramf)
  {
    GMTrace.i(9268405207040L, 69055);
    this.oTg.oSz = paramf;
    GMTrace.o(9268405207040L, 69055);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(9265855070208L, 69036);
    this.oTg.ar(paramString, paramBoolean);
    GMTrace.o(9265855070208L, 69036);
  }
  
  public final void bgj()
  {
    GMTrace.i(9267063029760L, 69045);
    this.oTo = true;
    if ((this.videoHeight > 0) && (this.videoWidth > 0)) {
      if (this.videoWidth < this.videoHeight) {
        break label68;
      }
    }
    label68:
    for (this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 150);; this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 85))
    {
      n(0.75D);
      GMTrace.o(9267063029760L, 69045);
      return;
    }
  }
  
  public final void bgk()
  {
    GMTrace.i(9266928812032L, 69044);
    Bitmap localBitmap1 = b.a(getContext(), R.g.aYv, this.oTi, 320, 240);
    Bitmap localBitmap2 = b.a(getContext(), this.oTt, this.oTi, 320, 240);
    SightVideoJNI.drawSurfaceThumb(this.mSurface, localBitmap1, localBitmap2);
    GMTrace.o(9266928812032L, 69044);
  }
  
  public final Object bgl()
  {
    GMTrace.i(9267331465216L, 69047);
    Object localObject = getTag();
    GMTrace.o(9267331465216L, 69047);
    return localObject;
  }
  
  public final Context bgm()
  {
    GMTrace.i(9267465682944L, 69048);
    Context localContext = getContext();
    GMTrace.o(9267465682944L, 69048);
    return localContext;
  }
  
  public final boolean bgn()
  {
    GMTrace.i(9265989287936L, 69037);
    boolean bool = this.oTg.bgs();
    GMTrace.o(9265989287936L, 69037);
    return bool;
  }
  
  public final void bgo()
  {
    GMTrace.i(9268270989312L, 69054);
    GMTrace.o(9268270989312L, 69054);
  }
  
  public final void bgp()
  {
    GMTrace.i(9268002553856L, 69052);
    GMTrace.o(9268002553856L, 69052);
  }
  
  public final void bo(Object paramObject)
  {
    GMTrace.i(9267197247488L, 69046);
    setTag(paramObject);
    GMTrace.o(9267197247488L, 69046);
  }
  
  public final void cV(int paramInt1, int paramInt2)
  {
    GMTrace.i(9267599900672L, 69049);
    final ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    this.oTi = paramInt1;
    localLayoutParams.width = this.oTi;
    localLayoutParams.height = (this.oTi * paramInt2 / paramInt1);
    w.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
    if (af.isMainThread())
    {
      setLayoutParams(localLayoutParams);
      GMTrace.o(9267599900672L, 69049);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9247869894656L, 68902);
        SightPlayTextureView.this.setLayoutParams(localLayoutParams);
        GMTrace.o(9247869894656L, 68902);
      }
    });
    GMTrace.o(9267599900672L, 69049);
  }
  
  public final void clear()
  {
    GMTrace.i(9265720852480L, 69035);
    this.oTg.clear();
    GMTrace.o(9265720852480L, 69035);
  }
  
  public final void h(TextView paramTextView)
  {
    GMTrace.i(9268136771584L, 69053);
    this.oTg.h(paramTextView);
    GMTrace.o(9268136771584L, 69053);
  }
  
  public final void hr(boolean paramBoolean)
  {
    GMTrace.i(9267734118400L, 69050);
    this.oTg.oSn = paramBoolean;
    GMTrace.o(9267734118400L, 69050);
  }
  
  public final void lx(int paramInt)
  {
    GMTrace.i(9266123505664L, 69038);
    this.oTg.position = paramInt;
    GMTrace.o(9266123505664L, 69038);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(9266391941120L, 69040);
    w.d("MicroMsg.SightPlayTextureView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.vgX.b(this.oTg.bgv());
    GMTrace.o(9266391941120L, 69040);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(9266257723392L, 69039);
    super.onDetachedFromWindow();
    w.i("MicroMsg.SightPlayTextureView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.oTg.clear();
    com.tencent.mm.sdk.b.a.vgX.c(this.oTg.bgv());
    GMTrace.o(9266257723392L, 69039);
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(9266526158848L, 69041);
    this.oTi = paramInt;
    n(0.75D);
    GMTrace.o(9266526158848L, 69041);
  }
  
  private static final class a
    implements Runnable
  {
    Surface oTv;
    
    public a()
    {
      GMTrace.i(9253507039232L, 68944);
      this.oTv = null;
      GMTrace.o(9253507039232L, 68944);
    }
    
    public final void run()
    {
      GMTrace.i(9253641256960L, 68945);
      if (this.oTv == null)
      {
        GMTrace.o(9253641256960L, 68945);
        return;
      }
      this.oTv.release();
      GMTrace.o(9253641256960L, 68945);
    }
  }
  
  private static final class b
    extends b
  {
    public WeakReference<SightPlayTextureView> oTw;
    
    public b(SightPlayTextureView paramSightPlayTextureView)
    {
      super(paramSightPlayTextureView);
      GMTrace.i(9239279960064L, 68838);
      this.oTw = new WeakReference(paramSightPlayTextureView);
      GMTrace.o(9239279960064L, 68838);
    }
    
    public final void F(Bitmap paramBitmap)
    {
      GMTrace.i(9239548395520L, 68840);
      GMTrace.o(9239548395520L, 68840);
    }
    
    protected final int bgq()
    {
      GMTrace.i(9239145742336L, 68837);
      int i = R.a.aLY;
      GMTrace.o(9239145742336L, 68837);
      return i;
    }
    
    public final void bs(int paramInt1, int paramInt2)
    {
      GMTrace.i(9239414177792L, 68839);
      if (this.oTw.get() == null)
      {
        w.e("MicroMsg.SightPlayTextureView", "onGetVideoSizeEnd, textureView is null, do clear");
        clear();
        GMTrace.o(9239414177792L, 68839);
        return;
      }
      SightPlayTextureView.a((SightPlayTextureView)this.oTw.get(), paramInt1);
      SightPlayTextureView.b((SightPlayTextureView)this.oTw.get(), paramInt2);
      w.d("MicroMsg.SightPlayTextureView", "on get video size %d*%d, needAutoResizeChatting: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(SightPlayTextureView.a((SightPlayTextureView)this.oTw.get())) });
      final ViewGroup.LayoutParams localLayoutParams = ((SightPlayTextureView)this.oTw.get()).getLayoutParams();
      if ((SightPlayTextureView.a((SightPlayTextureView)this.oTw.get())) && (paramInt1 > 0) && (paramInt2 > 0))
      {
        if (paramInt1 >= paramInt2) {
          SightPlayTextureView.c((SightPlayTextureView)this.oTw.get(), com.tencent.mm.br.a.fromDPToPix(((SightPlayTextureView)this.oTw.get()).getContext(), 150));
        }
      }
      else if (localLayoutParams.height != SightPlayTextureView.b((SightPlayTextureView)this.oTw.get()) * paramInt2 / paramInt1)
      {
        localLayoutParams.width = SightPlayTextureView.b((SightPlayTextureView)this.oTw.get());
        localLayoutParams.height = (SightPlayTextureView.b((SightPlayTextureView)this.oTw.get()) * paramInt2 / paramInt1);
        if ((SightPlayTextureView.a((SightPlayTextureView)this.oTw.get())) && (localLayoutParams.height < com.tencent.mm.br.a.fromDPToPix(((SightPlayTextureView)this.oTw.get()).getContext(), 50))) {
          localLayoutParams.height = com.tencent.mm.br.a.fromDPToPix(((SightPlayTextureView)this.oTw.get()).getContext(), 50);
        }
        w.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
        if (!af.isMainThread()) {
          break label456;
        }
        ((SightPlayTextureView)this.oTw.get()).setLayoutParams(localLayoutParams);
      }
      for (;;)
      {
        this.oRX = b.a(((SightPlayTextureView)this.oTw.get()).getContext(), SightPlayTextureView.c((SightPlayTextureView)this.oTw.get()), SightPlayTextureView.b((SightPlayTextureView)this.oTw.get()), paramInt1, paramInt2);
        GMTrace.o(9239414177792L, 68839);
        return;
        SightPlayTextureView.c((SightPlayTextureView)this.oTw.get(), com.tencent.mm.br.a.fromDPToPix(((SightPlayTextureView)this.oTw.get()).getContext(), 85));
        break;
        label456:
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9248943636480L, 68910);
            ((SightPlayTextureView)SightPlayTextureView.b.this.oTw.get()).setLayoutParams(localLayoutParams);
            GMTrace.o(9248943636480L, 68910);
          }
        });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\SightPlayTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */