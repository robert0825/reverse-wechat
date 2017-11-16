package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends a
{
  CircularImageView pGZ;
  
  public l(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
    GMTrace.i(8273180753920L, 61640);
    GMTrace.o(8273180753920L, 61640);
  }
  
  public final View bkC()
  {
    GMTrace.i(8273449189376L, 61642);
    this.pGZ = ((CircularImageView)this.hqF);
    View localView = this.hqF;
    GMTrace.o(8273449189376L, 61642);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8273583407104L, 61643);
    if ((this.hqF == null) || (this.pGZ == null))
    {
      GMTrace.o(8273583407104L, 61643);
      return;
    }
    p localp = (p)this.pGS;
    if (localp == null)
    {
      GMTrace.o(8273583407104L, 61643);
      return;
    }
    d.a(localp.pEn, localp.pEA, new d.a()
    {
      public final void Ih(String paramAnonymousString)
      {
        GMTrace.i(8225399242752L, 61284);
        l locall;
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          locall = l.this;
          if (paramAnonymousString == null)
          {
            w.e("AdLandingPageCircleImgComp", "when set image the bmp is null!");
            GMTrace.o(8225399242752L, 61284);
            return;
          }
          if (locall.pGZ == null)
          {
            w.e("AdLandingPageCircleImgComp", "when set image the img is null!");
            GMTrace.o(8225399242752L, 61284);
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          w.e("AdLandingPageCircleImgComp", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8225399242752L, 61284);
          return;
        }
        if (paramAnonymousString.getWidth() == 0)
        {
          w.e("AdLandingPageCircleImgComp", "when set image the bmp.getWidth is 0!");
          GMTrace.o(8225399242752L, 61284);
          return;
        }
        locall.pGZ.setImageBitmap(paramAnonymousString);
        GMTrace.o(8225399242752L, 61284);
      }
      
      public final void bkK()
      {
        GMTrace.i(8225130807296L, 61282);
        GMTrace.o(8225130807296L, 61282);
      }
      
      public final void bkL()
      {
        GMTrace.i(8225265025024L, 61283);
        GMTrace.o(8225265025024L, 61283);
      }
    });
    GMTrace.o(8273583407104L, 61643);
  }
  
  protected final View bkJ()
  {
    GMTrace.i(8273314971648L, 61641);
    CircularImageView localCircularImageView = new CircularImageView(this.context);
    GMTrace.o(8273314971648L, 61641);
    return localCircularImageView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */