package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class y
  extends a
{
  private Runnable hdZ;
  public TextView huP;
  
  public y(Context paramContext, u paramu, ViewGroup paramViewGroup)
  {
    super(paramContext, paramu, paramViewGroup);
    GMTrace.i(8247142514688L, 61446);
    GMTrace.o(8247142514688L, 61446);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8247276732416L, 61447);
    int i = i.g.pfn;
    GMTrace.o(8247276732416L, 61447);
    return i;
  }
  
  @TargetApi(17)
  public final View bkC()
  {
    GMTrace.i(8247679385600L, 61450);
    View localView = this.hqF;
    localView.setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.pcc).setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.pcd).setBackgroundColor(this.backgroundColor);
    this.huP = ((TextView)localView.findViewById(i.f.pcd));
    GMTrace.o(8247679385600L, 61450);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8247545167872L, 61449);
    final Object localObject;
    if (((u)this.pGS).eCt == 1)
    {
      if (!bg.nm(((u)this.pGS).pES))
      {
        localObject = ((u)this.pGS).pES.replace("<icon", "<img");
        e.remove(this.hdZ);
        this.hdZ = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8279891640320L, 61690);
            af.t(new Runnable()
            {
              public final Drawable getDrawable(String paramAnonymous2String)
              {
                GMTrace.i(8236136660992L, 61364);
                String str = d.dL("adId", paramAnonymous2String);
                int i;
                int j;
                if ((!bg.nm(str)) && (FileOp.aZ(str)))
                {
                  paramAnonymous2String = Drawable.createFromPath(str);
                  if (paramAnonymous2String == null) {
                    break label152;
                  }
                  if (paramAnonymous2String.getIntrinsicHeight() != 0)
                  {
                    i = paramAnonymous2String.getIntrinsicWidth() * (int)y.this.ble().gbV / paramAnonymous2String.getIntrinsicHeight();
                    if (paramAnonymous2String.getIntrinsicHeight() == 0) {
                      break label122;
                    }
                    j = (int)y.this.ble().gbV;
                    label96:
                    paramAnonymous2String.setBounds(0, 0, i, j);
                  }
                }
                label122:
                label152:
                for (;;)
                {
                  GMTrace.o(8236136660992L, 61364);
                  return paramAnonymous2String;
                  i = paramAnonymous2String.getIntrinsicWidth();
                  break;
                  j = paramAnonymous2String.getIntrinsicHeight();
                  break label96;
                  d.a("adId", paramAnonymous2String, false, 0, 0, new d.a()
                  {
                    public final void Ih(String paramAnonymous3String)
                    {
                      GMTrace.i(8255329796096L, 61507);
                      try
                      {
                        af.t(new Runnable()
                        {
                          public final Drawable getDrawable(String paramAnonymous4String)
                          {
                            GMTrace.i(8256269320192L, 61514);
                            Object localObject = null;
                            String str = d.dL("adId", paramAnonymous4String);
                            paramAnonymous4String = (String)localObject;
                            int i;
                            if (!bg.nm(str))
                            {
                              paramAnonymous4String = (String)localObject;
                              if (FileOp.aZ(str))
                              {
                                paramAnonymous4String = Drawable.createFromPath(str);
                                if (paramAnonymous4String != null)
                                {
                                  if (paramAnonymous4String.getIntrinsicHeight() == 0) {
                                    break label135;
                                  }
                                  i = paramAnonymous4String.getIntrinsicWidth() * (int)y.this.ble().gbV / paramAnonymous4String.getIntrinsicHeight();
                                  if (paramAnonymous4String.getIntrinsicHeight() == 0) {
                                    break label143;
                                  }
                                }
                              }
                            }
                            label135:
                            label143:
                            for (int j = (int)y.this.ble().gbV;; j = paramAnonymous4String.getIntrinsicHeight())
                            {
                              paramAnonymous4String.setBounds(0, 0, i, j);
                              GMTrace.o(8256269320192L, 61514);
                              return paramAnonymous4String;
                              i = paramAnonymous4String.getIntrinsicWidth();
                              break;
                            }
                          }
                        }
                        {
                          public final void run()
                          {
                            GMTrace.i(8267140956160L, 61595);
                            y.this.huP.setText(this.pJc);
                            GMTrace.o(8267140956160L, 61595);
                          }
                        });
                        GMTrace.o(8255329796096L, 61507);
                        return;
                      }
                      catch (Exception paramAnonymous3String)
                      {
                        w.e("MicroMsg.Sns.AdLandingPageTextComponent", "the backgroundCoverUrl is set error ,because " + paramAnonymous3String.toString());
                        GMTrace.o(8255329796096L, 61507);
                      }
                    }
                    
                    public final void bkK()
                    {
                      GMTrace.i(8255061360640L, 61505);
                      GMTrace.o(8255061360640L, 61505);
                    }
                    
                    public final void bkL()
                    {
                      GMTrace.i(8255195578368L, 61506);
                      GMTrace.o(8255195578368L, 61506);
                    }
                  });
                  paramAnonymous2String = null;
                }
              }
            }
            {
              public final void run()
              {
                GMTrace.i(8245531901952L, 61434);
                y.this.huP.setText(this.pJc);
                GMTrace.o(8245531901952L, 61434);
              }
            });
            GMTrace.o(8279891640320L, 61690);
          }
        };
        e.post(this.hdZ, "");
      }
      if (((u)this.pGS).textAlignment != 0) {
        break label313;
      }
      this.huP.setGravity(3);
      label107:
      if ((((u)this.pGS).pET == null) || (((u)this.pGS).pET.length() <= 0)) {
        break label398;
      }
    }
    for (;;)
    {
      try
      {
        i = Color.parseColor(((u)this.pGS).pET);
        this.huP.setTextColor(i);
        if (((u)this.pGS).gbV > 0.0F) {
          this.huP.setTextSize(0, ((u)this.pGS).gbV);
        }
        localObject = this.huP.getPaint();
        if (((u)this.pGS).pEU) {
          ((TextPaint)localObject).setFakeBoldText(true);
        }
        if (((u)this.pGS).pEV) {
          ((TextPaint)localObject).setTextSkewX(-0.25F);
        }
        if (((u)this.pGS).pEW) {
          ((TextPaint)localObject).setUnderlineText(true);
        }
        if (((u)this.pGS).maxLines > 0) {
          this.huP.setMaxLines(((u)this.pGS).maxLines);
        }
        GMTrace.o(8247545167872L, 61449);
        return;
        this.huP.setText(((u)this.pGS).pES);
        break;
        label313:
        if (((u)this.pGS).textAlignment == 1)
        {
          this.huP.setGravity(17);
          break label107;
        }
        if (((u)this.pGS).textAlignment != 2) {
          break label107;
        }
        this.huP.setGravity(5);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + ((u)this.pGS).pET);
        continue;
      }
      label398:
      int i = Color.parseColor("#FFFFFF");
      this.huP.setTextColor(i);
    }
  }
  
  public final void bkl()
  {
    GMTrace.i(8247410950144L, 61448);
    super.bkl();
    if (!e.remove(this.hdZ)) {
      e.L(this.hdZ);
    }
    GMTrace.o(8247410950144L, 61448);
  }
  
  public final void bkm()
  {
    GMTrace.i(8247813603328L, 61451);
    super.bkm();
    GMTrace.o(8247813603328L, 61451);
  }
  
  public final void bkn()
  {
    GMTrace.i(8247947821056L, 61452);
    super.bkn();
    GMTrace.o(8247947821056L, 61452);
  }
  
  public final u ble()
  {
    GMTrace.i(16043045027840L, 119530);
    u localu = (u)this.pGS;
    GMTrace.o(16043045027840L, 119530);
    return localu;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */