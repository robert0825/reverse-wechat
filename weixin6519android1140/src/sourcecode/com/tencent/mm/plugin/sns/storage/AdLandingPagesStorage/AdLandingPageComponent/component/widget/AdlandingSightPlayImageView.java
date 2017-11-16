package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.ui.QPictureView;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class AdlandingSightPlayImageView
  extends QPictureView
{
  private int oTi;
  private int oTj;
  private int oTk;
  private int oTl;
  public f.a oTm;
  public boolean oTn;
  private boolean oTo;
  private boolean oTp;
  a pJO;
  
  public AdlandingSightPlayImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(15265253294080L, 113735);
    GMTrace.o(15265253294080L, 113735);
  }
  
  public AdlandingSightPlayImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15265119076352L, 113734);
    this.oTn = true;
    this.oTo = false;
    this.oTp = false;
    this.pJO = new a(this);
    w.i("MicroMsg.SightPlayImageView", "mController %s", new Object[] { new ah().toString() });
    GMTrace.o(15265119076352L, 113734);
  }
  
  public final String NE()
  {
    GMTrace.i(15265521729536L, 113737);
    String str = this.pJO.oRS;
    GMTrace.o(15265521729536L, 113737);
    return str;
  }
  
  public final void a(a.f paramf)
  {
    GMTrace.i(15266729689088L, 113746);
    this.pJO.pJG = paramf;
    GMTrace.o(15266729689088L, 113746);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(15266058600448L, 113741);
    a locala = this.pJO;
    w.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", new Object[] { Integer.valueOf(locala.hashCode()), paramString, locala.oRS, Boolean.valueOf(paramBoolean), Integer.valueOf(locala.oRU), Boolean.valueOf(locala.oSw), Boolean.valueOf(locala.oSn) });
    if (locala.oSw)
    {
      locala.hs(false);
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    if (locala.bgs())
    {
      w.e("MicroMsg.SightPlayController", "is bad fps, do nothing when set video path");
      locala.clear();
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    if (!locala.oSn)
    {
      locala.clear();
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    if (paramBoolean)
    {
      locala.oRT = paramString;
      locala.hs(false);
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    if (locala.oRS.equals(paramString))
    {
      locala.oRT = "ERROR#PATH";
      locala.hs(false);
      locala.restart();
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    locala.clear();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    locala.oRS = str;
    if (bg.nm(locala.oRS))
    {
      w.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
      locala.blf();
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    if (!a.GC(locala.oRS))
    {
      w.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
      locala.clear();
      GMTrace.o(15266058600448L, 113741);
      return;
    }
    locala.pJx = new a.h(locala);
    o.d(locala.pJx, 0L);
    GMTrace.o(15266058600448L, 113741);
  }
  
  public int getDuration()
  {
    GMTrace.i(15267266560000L, 113750);
    if (this.pJO == null)
    {
      GMTrace.o(15267266560000L, 113750);
      return 0;
    }
    a locala = this.pJO;
    if (locala.oRU == -1) {}
    for (double d = 0.0D;; d = SightVideoJNI.getVideoDuration(locala.oRU))
    {
      int i = (int)d;
      GMTrace.o(15267266560000L, 113750);
      return i;
    }
  }
  
  public final void ht(boolean paramBoolean)
  {
    GMTrace.i(15266863906816L, 113747);
    a locala = this.pJO;
    w.i("MicroMsg.SightPlayController", "configure: need sound %B", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (locala.pJz == null)
      {
        locala.pJz = new a.i(locala);
        GMTrace.o(15266863906816L, 113747);
      }
    }
    else
    {
      if (locala.pJz != null)
      {
        locala.pJz.type = 0;
        o.d(locala.pJz, 0L);
      }
      locala.pJz = null;
    }
    GMTrace.o(15266863906816L, 113747);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(15266327035904L, 113743);
    w.d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.vgX.b(this.pJO.bgv());
    GMTrace.o(15266327035904L, 113743);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(15266192818176L, 113742);
    super.onDetachedFromWindow();
    w.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.pJO.clear();
    com.tencent.mm.sdk.b.a.vgX.c(this.pJO.bgv());
    GMTrace.o(15266192818176L, 113742);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(15267400777728L, 113751);
    super.onDraw(paramCanvas);
    GMTrace.o(15267400777728L, 113751);
  }
  
  public final void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(15265655947264L, 113738);
    super.setImageBitmap(paramBitmap);
    if (this.oTp)
    {
      GMTrace.o(15265655947264L, 113738);
      return;
    }
    int i;
    int j;
    if (paramBitmap == null) {
      if (this.oTj == 0)
      {
        i = 240;
        if (paramBitmap != null) {
          break label154;
        }
        if (this.oTi != 0) {
          break label145;
        }
        j = 320;
      }
    }
    for (;;)
    {
      paramBitmap = getLayoutParams();
      if (paramBitmap.height != this.oTi * i / j)
      {
        paramBitmap.width = this.oTi;
        float f = this.oTi;
        paramBitmap.height = ((int)(i * f / j));
        setLayoutParams(paramBitmap);
      }
      GMTrace.o(15265655947264L, 113738);
      return;
      i = this.oTj;
      break;
      i = paramBitmap.getHeight();
      break;
      label145:
      j = this.oTi;
      continue;
      label154:
      j = paramBitmap.getWidth();
    }
  }
  
  public final void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(15265790164992L, 113739);
    super.setImageDrawable(paramDrawable);
    if (this.oTp)
    {
      GMTrace.o(15265790164992L, 113739);
      return;
    }
    int i;
    int j;
    if (paramDrawable == null) {
      if (this.oTj == 0)
      {
        i = 240;
        if (paramDrawable != null) {
          break label164;
        }
        if (this.oTi != 0) {
          break label155;
        }
        j = 320;
      }
    }
    for (;;)
    {
      if ((i != 0) && (j != 0))
      {
        paramDrawable = getLayoutParams();
        if (paramDrawable.height != this.oTi * i / j)
        {
          paramDrawable.width = this.oTi;
          float f = this.oTi;
          paramDrawable.height = ((int)(i * f / j));
          setLayoutParams(paramDrawable);
        }
      }
      GMTrace.o(15265790164992L, 113739);
      return;
      i = this.oTj;
      break;
      i = paramDrawable.getIntrinsicHeight();
      break;
      label155:
      j = this.oTi;
      continue;
      label164:
      j = paramDrawable.getIntrinsicWidth();
    }
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(15266461253632L, 113744);
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
    GMTrace.o(15266461253632L, 113744);
  }
  
  private static final class a
    extends a
  {
    private WeakReference<AdlandingSightPlayImageView> oTh;
    
    public a(AdlandingSightPlayImageView paramAdlandingSightPlayImageView)
    {
      super(paramAdlandingSightPlayImageView);
      GMTrace.i(15272635269120L, 113790);
      this.oTh = new WeakReference(paramAdlandingSightPlayImageView);
      GMTrace.o(15272635269120L, 113790);
    }
    
    public final void F(Bitmap paramBitmap)
    {
      GMTrace.i(15272903704576L, 113792);
      AdlandingSightPlayImageView localAdlandingSightPlayImageView = (AdlandingSightPlayImageView)this.oTh.get();
      if (localAdlandingSightPlayImageView == null)
      {
        w.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
        clear();
        GMTrace.o(15272903704576L, 113792);
        return;
      }
      localAdlandingSightPlayImageView.setImageBitmap(paramBitmap);
      GMTrace.o(15272903704576L, 113792);
    }
    
    protected final int bgq()
    {
      GMTrace.i(15272501051392L, 113789);
      int i = i.a.aLY;
      GMTrace.o(15272501051392L, 113789);
      return i;
    }
    
    public final void bs(int paramInt1, int paramInt2)
    {
      GMTrace.i(15272769486848L, 113791);
      final AdlandingSightPlayImageView localAdlandingSightPlayImageView = (AdlandingSightPlayImageView)this.oTh.get();
      if (localAdlandingSightPlayImageView == null)
      {
        w.e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
        clear();
        GMTrace.o(15272769486848L, 113791);
        return;
      }
      if (AdlandingSightPlayImageView.a(localAdlandingSightPlayImageView))
      {
        GMTrace.o(15272769486848L, 113791);
        return;
      }
      AdlandingSightPlayImageView.a(localAdlandingSightPlayImageView, paramInt1);
      AdlandingSightPlayImageView.b(localAdlandingSightPlayImageView, paramInt2);
      if (localAdlandingSightPlayImageView.oTm != null) {
        localAdlandingSightPlayImageView.oTm.bs(paramInt1, paramInt2);
      }
      if (AdlandingSightPlayImageView.b(localAdlandingSightPlayImageView))
      {
        if (AdlandingSightPlayImageView.c(localAdlandingSightPlayImageView) < AdlandingSightPlayImageView.d(localAdlandingSightPlayImageView)) {
          break label280;
        }
        AdlandingSightPlayImageView.c(localAdlandingSightPlayImageView, com.tencent.mm.br.a.fromDPToPix(localAdlandingSightPlayImageView.getContext(), 150));
      }
      for (;;)
      {
        if (AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView) > 0)
        {
          final ViewGroup.LayoutParams localLayoutParams = localAdlandingSightPlayImageView.getLayoutParams();
          if ((localLayoutParams.width != AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView)) || (localLayoutParams.height != AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView) * paramInt2 / paramInt1))
          {
            localLayoutParams.width = AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView);
            localLayoutParams.height = (AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView) * paramInt2 / paramInt1);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(15261629415424L, 113708);
                localAdlandingSightPlayImageView.setLayoutParams(localLayoutParams);
                GMTrace.o(15261629415424L, 113708);
              }
            });
            localAdlandingSightPlayImageView.postInvalidate();
          }
          w.i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
        }
        w.i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", new Object[] { Integer.valueOf(AdlandingSightPlayImageView.e(localAdlandingSightPlayImageView)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        GMTrace.o(15272769486848L, 113791);
        return;
        label280:
        AdlandingSightPlayImageView.c(localAdlandingSightPlayImageView, com.tencent.mm.br.a.fromDPToPix(localAdlandingSightPlayImageView.getContext(), 85));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\AdlandingSightPlayImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */