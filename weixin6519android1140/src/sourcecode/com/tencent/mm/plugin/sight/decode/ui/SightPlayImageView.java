package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.ui.QPictureView;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.ag.a.a;
import com.tencent.mm.plugin.ag.a.d;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.a.b.i;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class SightPlayImageView
  extends QPictureView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  public b oTg;
  private int oTi;
  private int oTj;
  private int oTk;
  private int oTl;
  public f.a oTm;
  public boolean oTn;
  private boolean oTo;
  public boolean oTp;
  
  public SightPlayImageView(Context paramContext)
  {
    this(paramContext, null, 0);
    GMTrace.i(9242366967808L, 68861);
    GMTrace.o(9242366967808L, 68861);
  }
  
  public SightPlayImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9242232750080L, 68860);
    GMTrace.o(9242232750080L, 68860);
  }
  
  public SightPlayImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9242098532352L, 68859);
    this.oTn = true;
    this.oTo = false;
    this.oTp = false;
    this.oTg = new a(this);
    w.i("MicroMsg.SightPlayImageView", "mController %s", new Object[] { new ah().toString() });
    GMTrace.o(9242098532352L, 68859);
  }
  
  public final void D(Bitmap paramBitmap)
  {
    GMTrace.i(9243977580544L, 68873);
    setImageBitmap(paramBitmap);
    GMTrace.o(9243977580544L, 68873);
  }
  
  public final void G(Bitmap paramBitmap)
  {
    GMTrace.i(9242903838720L, 68865);
    super.setImageBitmap(paramBitmap);
    GMTrace.o(9242903838720L, 68865);
  }
  
  public final String NE()
  {
    GMTrace.i(9242501185536L, 68862);
    String str = this.oTg.oRS;
    GMTrace.o(9242501185536L, 68862);
    return str;
  }
  
  public final void a(b.e parame)
  {
    GMTrace.i(9245051322368L, 68881);
    this.oTg.oSy = parame;
    GMTrace.o(9245051322368L, 68881);
  }
  
  public final void a(b.f paramf)
  {
    GMTrace.i(9245319757824L, 68883);
    this.oTg.oSz = paramf;
    GMTrace.o(9245319757824L, 68883);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(9243172274176L, 68867);
    this.oTg.ar(paramString, paramBoolean);
    GMTrace.o(9243172274176L, 68867);
  }
  
  public final void bgj()
  {
    GMTrace.i(9244246016000L, 68875);
    this.oTo = true;
    if ((this.oTl > 0) && (this.oTk > 0)) {
      if (this.oTk < this.oTl) {
        break label127;
      }
    }
    label127:
    for (this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 150);; this.oTi = com.tencent.mm.br.a.fromDPToPix(getContext(), 85))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      this.oTj = (this.oTi * this.oTl / this.oTk);
      if ((localLayoutParams.width != this.oTi) || (localLayoutParams.height != this.oTj))
      {
        localLayoutParams.width = this.oTi;
        localLayoutParams.height = this.oTj;
        setLayoutParams(localLayoutParams);
      }
      GMTrace.o(9244246016000L, 68875);
      return;
    }
  }
  
  public final void bgk()
  {
    GMTrace.i(9244111798272L, 68874);
    setImageBitmap(null);
    setImageResource(a.d.aYv);
    GMTrace.o(9244111798272L, 68874);
  }
  
  public final Object bgl()
  {
    GMTrace.i(9244514451456L, 68877);
    Object localObject = getTag();
    GMTrace.o(9244514451456L, 68877);
    return localObject;
  }
  
  public final Context bgm()
  {
    GMTrace.i(9244648669184L, 68878);
    Context localContext = getContext();
    GMTrace.o(9244648669184L, 68878);
    return localContext;
  }
  
  public final boolean bgn()
  {
    GMTrace.i(9243306491904L, 68868);
    boolean bool = this.oTg.bgs();
    GMTrace.o(9243306491904L, 68868);
    return bool;
  }
  
  public final void bgo()
  {
    GMTrace.i(9245856628736L, 68887);
    GMTrace.o(9245856628736L, 68887);
  }
  
  public final void bgp()
  {
    GMTrace.i(9245185540096L, 68882);
    this.oTg.oSA = null;
    GMTrace.o(9245185540096L, 68882);
  }
  
  public final void bo(Object paramObject)
  {
    GMTrace.i(9244380233728L, 68876);
    setTag(paramObject);
    GMTrace.o(9244380233728L, 68876);
  }
  
  public void cV(int paramInt1, int paramInt2)
  {
    GMTrace.i(9244782886912L, 68879);
    this.oTn = false;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    this.oTi = paramInt1;
    this.oTj = (this.oTi * paramInt2 / paramInt1);
    localLayoutParams.width = this.oTi;
    localLayoutParams.height = this.oTj;
    setLayoutParams(localLayoutParams);
    postInvalidate();
    GMTrace.o(9244782886912L, 68879);
  }
  
  public final void clear()
  {
    GMTrace.i(9243038056448L, 68866);
    this.oTg.clear();
    GMTrace.o(9243038056448L, 68866);
  }
  
  public int getDuration()
  {
    GMTrace.i(9246125064192L, 68889);
    if (this.oTg == null)
    {
      GMTrace.o(9246125064192L, 68889);
      return 0;
    }
    int i = (int)this.oTg.bgw();
    GMTrace.o(9246125064192L, 68889);
    return i;
  }
  
  public final void h(TextView paramTextView)
  {
    GMTrace.i(9245453975552L, 68884);
    this.oTg.h(paramTextView);
    GMTrace.o(9245453975552L, 68884);
  }
  
  public final void hr(boolean paramBoolean)
  {
    GMTrace.i(9244917104640L, 68880);
    this.oTg.oSn = paramBoolean;
    GMTrace.o(9244917104640L, 68880);
  }
  
  public final void ht(boolean paramBoolean)
  {
    GMTrace.i(9245588193280L, 68885);
    b localb = this.oTg;
    w.i("MicroMsg.SightPlayController", "configure: need sound %B", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (localb.oSh == null)
      {
        localb.oSh = new b.i(localb);
        GMTrace.o(9245588193280L, 68885);
      }
    }
    else
    {
      if (localb.oSh != null)
      {
        localb.oSh.type = 0;
        o.d(localb.oSh, 0L);
      }
      localb.oSh = null;
    }
    GMTrace.o(9245588193280L, 68885);
  }
  
  public final void lx(int paramInt)
  {
    GMTrace.i(9243440709632L, 68869);
    this.oTg.position = paramInt;
    GMTrace.o(9243440709632L, 68869);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(9243709145088L, 68871);
    w.d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.vgX.b(this.oTg.bgv());
    GMTrace.o(9243709145088L, 68871);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(9243574927360L, 68870);
    super.onDetachedFromWindow();
    w.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.oTg.clear();
    com.tencent.mm.sdk.b.a.vgX.c(this.oTg.bgv());
    GMTrace.o(9243574927360L, 68870);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9246259281920L, 68890);
    super.onDraw(paramCanvas);
    GMTrace.o(9246259281920L, 68890);
  }
  
  public final void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(9242635403264L, 68863);
    super.setImageBitmap(paramBitmap);
    if (this.oTp)
    {
      GMTrace.o(9242635403264L, 68863);
      return;
    }
    int i;
    int j;
    if (paramBitmap == null) {
      if (this.oTj == 0)
      {
        i = 240;
        if (paramBitmap != null) {
          break label153;
        }
        if (this.oTi != 0) {
          break label144;
        }
        j = 320;
      }
    }
    for (;;)
    {
      paramBitmap = getLayoutParams();
      if (paramBitmap.height != (int)(this.oTi * i / j))
      {
        paramBitmap.width = this.oTi;
        float f = this.oTi;
        paramBitmap.height = ((int)(i * f / j));
        setLayoutParams(paramBitmap);
      }
      GMTrace.o(9242635403264L, 68863);
      return;
      i = this.oTj;
      break;
      i = paramBitmap.getHeight();
      break;
      label144:
      j = this.oTi;
      continue;
      label153:
      j = paramBitmap.getWidth();
    }
  }
  
  public final void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(9242769620992L, 68864);
    super.setImageDrawable(paramDrawable);
    if (this.oTp)
    {
      GMTrace.o(9242769620992L, 68864);
      return;
    }
    int i;
    int j;
    if (paramDrawable == null) {
      if (this.oTj == 0)
      {
        i = 240;
        if (paramDrawable != null) {
          break label163;
        }
        if (this.oTi != 0) {
          break label154;
        }
        j = 320;
      }
    }
    for (;;)
    {
      if ((i != 0) && (j != 0))
      {
        paramDrawable = getLayoutParams();
        if (paramDrawable.height != (int)(this.oTi * i / j))
        {
          paramDrawable.width = this.oTi;
          float f = this.oTi;
          paramDrawable.height = ((int)(i * f / j));
          setLayoutParams(paramDrawable);
        }
      }
      GMTrace.o(9242769620992L, 68864);
      return;
      i = this.oTj;
      break;
      i = paramDrawable.getIntrinsicHeight();
      break;
      label154:
      j = this.oTi;
      continue;
      label163:
      j = paramDrawable.getIntrinsicWidth();
    }
  }
  
  public void tW(int paramInt)
  {
    GMTrace.i(9243843362816L, 68872);
    this.oTn = false;
    this.oTi = paramInt;
    if ((this.oTk > 0) && (this.oTl > 0))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      this.oTj = (this.oTi * this.oTl / this.oTk);
      if ((localLayoutParams.width != this.oTi) || (localLayoutParams.height != this.oTj))
      {
        localLayoutParams.width = this.oTi;
        localLayoutParams.height = this.oTj;
        setLayoutParams(localLayoutParams);
      }
    }
    GMTrace.o(9243843362816L, 68872);
  }
  
  private static final class a
    extends b
  {
    private WeakReference<SightPlayImageView> oTh;
    
    public a(SightPlayImageView paramSightPlayImageView)
    {
      super(paramSightPlayImageView);
      GMTrace.i(9248138330112L, 68904);
      this.oTh = new WeakReference(paramSightPlayImageView);
      GMTrace.o(9248138330112L, 68904);
    }
    
    public final void F(Bitmap paramBitmap)
    {
      GMTrace.i(9248406765568L, 68906);
      SightPlayImageView localSightPlayImageView = (SightPlayImageView)this.oTh.get();
      if (localSightPlayImageView == null)
      {
        w.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
        clear();
        GMTrace.o(9248406765568L, 68906);
        return;
      }
      localSightPlayImageView.setImageBitmap(paramBitmap);
      GMTrace.o(9248406765568L, 68906);
    }
    
    protected final int bgq()
    {
      GMTrace.i(9248004112384L, 68903);
      int i = a.a.aLY;
      GMTrace.o(9248004112384L, 68903);
      return i;
    }
    
    public final void bs(int paramInt1, int paramInt2)
    {
      GMTrace.i(9248272547840L, 68905);
      final SightPlayImageView localSightPlayImageView = (SightPlayImageView)this.oTh.get();
      if (localSightPlayImageView == null)
      {
        w.e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
        clear();
        GMTrace.o(9248272547840L, 68905);
        return;
      }
      if (SightPlayImageView.a(localSightPlayImageView))
      {
        GMTrace.o(9248272547840L, 68905);
        return;
      }
      SightPlayImageView.a(localSightPlayImageView, paramInt1);
      SightPlayImageView.b(localSightPlayImageView, paramInt2);
      if (localSightPlayImageView.oTm != null) {
        localSightPlayImageView.oTm.bs(paramInt1, paramInt2);
      }
      if (SightPlayImageView.b(localSightPlayImageView))
      {
        if (SightPlayImageView.c(localSightPlayImageView) < SightPlayImageView.d(localSightPlayImageView)) {
          break label280;
        }
        SightPlayImageView.c(localSightPlayImageView, com.tencent.mm.br.a.fromDPToPix(localSightPlayImageView.getContext(), 150));
      }
      for (;;)
      {
        if (SightPlayImageView.e(localSightPlayImageView) > 0)
        {
          final ViewGroup.LayoutParams localLayoutParams = localSightPlayImageView.getLayoutParams();
          if ((localLayoutParams.width != SightPlayImageView.e(localSightPlayImageView)) || (localLayoutParams.height != SightPlayImageView.e(localSightPlayImageView) * paramInt2 / paramInt1))
          {
            localLayoutParams.width = SightPlayImageView.e(localSightPlayImageView);
            localLayoutParams.height = (SightPlayImageView.e(localSightPlayImageView) * paramInt2 / paramInt1);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9241695879168L, 68856);
                localSightPlayImageView.setLayoutParams(localLayoutParams);
                GMTrace.o(9241695879168L, 68856);
              }
            });
            localSightPlayImageView.postInvalidate();
          }
          w.i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
        }
        w.i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", new Object[] { Integer.valueOf(SightPlayImageView.e(localSightPlayImageView)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        GMTrace.o(9248272547840L, 68905);
        return;
        label280:
        SightPlayImageView.c(localSightPlayImageView, com.tencent.mm.br.a.fromDPToPix(localSightPlayImageView.getContext(), 85));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\SightPlayImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */