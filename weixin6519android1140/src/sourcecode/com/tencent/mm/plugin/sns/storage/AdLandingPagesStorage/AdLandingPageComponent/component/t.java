package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends i
{
  public TextView huP;
  private RelativeLayout pIh;
  public ImageView pIi;
  
  public t(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t paramt, ViewGroup paramViewGroup)
  {
    super(paramContext, paramt, paramViewGroup);
    GMTrace.i(8257477279744L, 61523);
    this.pGS = paramt;
    GMTrace.o(8257477279744L, 61523);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8257611497472L, 61524);
    int i = i.g.pfk;
    GMTrace.o(8257611497472L, 61524);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8258014150656L, 61527);
    View localView = this.hqF;
    localView.setBackgroundColor(this.backgroundColor);
    this.huP = ((TextView)localView.findViewById(i.f.pcb));
    this.pIh = ((RelativeLayout)localView.findViewById(i.f.pbZ));
    this.pIi = ((ImageView)localView.findViewById(i.f.pca));
    GMTrace.o(8258014150656L, 61527);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8257879932928L, 61526);
    this.huP.setText(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).label);
    this.huP.setTextSize(0, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).pEe);
    if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).hPK != null) && (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).hPK.length() > 0))
    {
      int i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).hPK);
      this.pIh.setBackgroundColor(i);
    }
    d.a(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).pEO, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS).pEA, new d.a()
    {
      public final void Ih(String paramAnonymousString)
      {
        GMTrace.i(8283918172160L, 61720);
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          t.this.pIi.setImageBitmap(paramAnonymousString);
          paramAnonymousString = t.this.huP;
          Paint localPaint = new Paint();
          String str = paramAnonymousString.getText().toString();
          localPaint.setTextSize(paramAnonymousString.getTextSize());
          float f = localPaint.measureText(str, 0, str.length());
          f = t.this.pGS.pEF - f - TypedValue.applyDimension(1, 3.0F, t.this.context.getResources().getDisplayMetrics());
          int i = (int)(f - t.this.bkW().value * f);
          paramAnonymousString = (RelativeLayout.LayoutParams)t.this.pIi.getLayoutParams();
          paramAnonymousString.setMargins(paramAnonymousString.leftMargin, paramAnonymousString.topMargin, i, paramAnonymousString.leftMargin);
          t.this.pIi.setLayoutParams(paramAnonymousString);
          GMTrace.o(8283918172160L, 61720);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.Sns.AdLandingPageProcessBarComponent", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8283918172160L, 61720);
        }
      }
      
      public final void bkK()
      {
        GMTrace.i(8283649736704L, 61718);
        GMTrace.o(8283649736704L, 61718);
      }
      
      public final void bkL()
      {
        GMTrace.i(8283783954432L, 61719);
        GMTrace.o(8283783954432L, 61719);
      }
    });
    GMTrace.o(8257879932928L, 61526);
  }
  
  public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t bkW()
  {
    GMTrace.i(16043313463296L, 119532);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t localt = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)this.pGS;
    GMTrace.o(16043313463296L, 119532);
    return localt;
  }
  
  public final void bkl()
  {
    GMTrace.i(8257745715200L, 61525);
    super.bkl();
    GMTrace.o(8257745715200L, 61525);
  }
  
  public final void bkm()
  {
    GMTrace.i(8258148368384L, 61528);
    super.bkm();
    GMTrace.o(8258148368384L, 61528);
  }
  
  public final void bkn()
  {
    GMTrace.i(8258282586112L, 61529);
    super.bkn();
    GMTrace.o(8258282586112L, 61529);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */