package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class SightPlayAutoSizeImageView
  extends ImageView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  private b oTg;
  
  public SightPlayAutoSizeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9254580781056L, 68952);
    GMTrace.o(9254580781056L, 68952);
  }
  
  public SightPlayAutoSizeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9254446563328L, 68951);
    this.oTg = new a(this);
    GMTrace.o(9254446563328L, 68951);
  }
  
  public final void D(Bitmap paramBitmap)
  {
    GMTrace.i(9255788740608L, 68961);
    setImageBitmap(paramBitmap);
    GMTrace.o(9255788740608L, 68961);
  }
  
  public final String NE()
  {
    GMTrace.i(9254714998784L, 68953);
    String str = this.oTg.oRS;
    GMTrace.o(9254714998784L, 68953);
    return str;
  }
  
  public final void a(b.e parame)
  {
    GMTrace.i(9256862482432L, 68969);
    this.oTg.oSy = parame;
    GMTrace.o(9256862482432L, 68969);
  }
  
  public final void a(b.f paramf)
  {
    GMTrace.i(9257399353344L, 68973);
    this.oTg.oSz = paramf;
    GMTrace.o(9257399353344L, 68973);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(9254983434240L, 68955);
    this.oTg.ar(paramString, paramBoolean);
    GMTrace.o(9254983434240L, 68955);
  }
  
  public final void bgj()
  {
    GMTrace.i(9256057176064L, 68963);
    GMTrace.o(9256057176064L, 68963);
  }
  
  public final void bgk()
  {
    GMTrace.i(9255922958336L, 68962);
    setImageBitmap(null);
    setImageResource(R.g.aYv);
    GMTrace.o(9255922958336L, 68962);
  }
  
  public final Object bgl()
  {
    GMTrace.i(9256325611520L, 68965);
    Object localObject = getTag();
    GMTrace.o(9256325611520L, 68965);
    return localObject;
  }
  
  public final Context bgm()
  {
    GMTrace.i(9256459829248L, 68966);
    Context localContext = getContext();
    GMTrace.o(9256459829248L, 68966);
    return localContext;
  }
  
  public final boolean bgn()
  {
    GMTrace.i(9255117651968L, 68956);
    boolean bool = this.oTg.bgs();
    GMTrace.o(9255117651968L, 68956);
    return bool;
  }
  
  public final void bgo()
  {
    GMTrace.i(9257265135616L, 68972);
    this.oTg.oSw = false;
    GMTrace.o(9257265135616L, 68972);
  }
  
  public final void bgp()
  {
    GMTrace.i(9256996700160L, 68970);
    GMTrace.o(9256996700160L, 68970);
  }
  
  public final void bo(Object paramObject)
  {
    GMTrace.i(9256191393792L, 68964);
    setTag(paramObject);
    GMTrace.o(9256191393792L, 68964);
  }
  
  public final void cV(int paramInt1, int paramInt2)
  {
    GMTrace.i(9256594046976L, 68967);
    GMTrace.o(9256594046976L, 68967);
  }
  
  public final void clear()
  {
    GMTrace.i(9254849216512L, 68954);
    this.oTg.clear();
    GMTrace.o(9254849216512L, 68954);
  }
  
  public final void h(TextView paramTextView)
  {
    GMTrace.i(9257130917888L, 68971);
    this.oTg.h(paramTextView);
    GMTrace.o(9257130917888L, 68971);
  }
  
  public final void hr(boolean paramBoolean)
  {
    GMTrace.i(9256728264704L, 68968);
    this.oTg.oSn = paramBoolean;
    GMTrace.o(9256728264704L, 68968);
  }
  
  public final void lx(int paramInt)
  {
    GMTrace.i(9255251869696L, 68957);
    this.oTg.position = paramInt;
    GMTrace.o(9255251869696L, 68957);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(9255520305152L, 68959);
    w.d("MicroMsg.SightPlayAutoSizeImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.vgX.b(this.oTg.bgv());
    GMTrace.o(9255520305152L, 68959);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(9255386087424L, 68958);
    super.onDetachedFromWindow();
    w.i("MicroMsg.SightPlayAutoSizeImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.oTg.clear();
    com.tencent.mm.sdk.b.a.vgX.c(this.oTg.bgv());
    GMTrace.o(9255386087424L, 68958);
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(9255654522880L, 68960);
    GMTrace.o(9255654522880L, 68960);
  }
  
  private static final class a
    extends b
  {
    private WeakReference<SightPlayAutoSizeImageView> oTh;
    
    public a(SightPlayAutoSizeImageView paramSightPlayAutoSizeImageView)
    {
      super(paramSightPlayAutoSizeImageView);
      GMTrace.i(9240890572800L, 68850);
      this.oTh = new WeakReference(paramSightPlayAutoSizeImageView);
      GMTrace.o(9240890572800L, 68850);
    }
    
    public final void F(Bitmap paramBitmap)
    {
      GMTrace.i(9241159008256L, 68852);
      SightPlayAutoSizeImageView localSightPlayAutoSizeImageView = (SightPlayAutoSizeImageView)this.oTh.get();
      if (localSightPlayAutoSizeImageView == null)
      {
        w.e("MicroMsg.SightPlayAutoSizeImageView", "onGetFrameBmp, imageView is null, do clear");
        clear();
        GMTrace.o(9241159008256L, 68852);
        return;
      }
      localSightPlayAutoSizeImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localSightPlayAutoSizeImageView.setImageBitmap(paramBitmap);
      GMTrace.o(9241159008256L, 68852);
    }
    
    protected final int bgq()
    {
      GMTrace.i(9240756355072L, 68849);
      int i = R.a.aLY;
      GMTrace.o(9240756355072L, 68849);
      return i;
    }
    
    public final void bs(int paramInt1, int paramInt2)
    {
      GMTrace.i(9241024790528L, 68851);
      GMTrace.o(9241024790528L, 68851);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\SightPlayAutoSizeImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */