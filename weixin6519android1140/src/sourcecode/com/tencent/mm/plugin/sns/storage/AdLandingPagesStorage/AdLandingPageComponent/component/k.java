package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class k
  extends j
{
  RelativeLayout mzW;
  Button pGX;
  
  public k(Context paramContext, l paraml, ViewGroup paramViewGroup)
  {
    super(paramContext, paraml, paramViewGroup);
    GMTrace.i(8252242788352L, 61484);
    GMTrace.o(8252242788352L, 61484);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8252511223808L, 61486);
    int i = i.g.pff;
    GMTrace.o(8252511223808L, 61486);
    return i;
  }
  
  @TargetApi(17)
  public final View bkC()
  {
    GMTrace.i(8253048094720L, 61490);
    View localView = this.hqF;
    this.mzW = ((RelativeLayout)localView.findViewById(i.f.pcj));
    this.pGX = ((Button)localView.findViewById(i.f.pci));
    GMTrace.o(8253048094720L, 61490);
    return localView;
  }
  
  @TargetApi(17)
  protected final void bkI()
  {
    int j = 1;
    GMTrace.i(8252645441536L, 61487);
    this.pGG = 0;
    int k = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth();
    this.mzW.setBackgroundColor(this.backgroundColor);
    if (!bg.nm(((l)this.pGS).pEi)) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((l)this.pGS).pEi, false, 0, 0, new d.a()
      {
        @TargetApi(16)
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8256806191104L, 61518);
          try
          {
            paramAnonymousString = Drawable.createFromPath(paramAnonymousString);
            k.this.pGX.setBackground(paramAnonymousString);
            if ((paramAnonymousString != null) && (k.this.bkQ().height > 0.0F) && (paramAnonymousString.getIntrinsicHeight() > 0))
            {
              float f = k.this.bkQ().height * paramAnonymousString.getIntrinsicWidth() / paramAnonymousString.getIntrinsicHeight();
              k.this.pGX.setLayoutParams(new RelativeLayout.LayoutParams((int)f, (int)k.this.bkQ().height));
            }
            GMTrace.o(8256806191104L, 61518);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the backgroundCoverUrl is set error ,because " + paramAnonymousString.toString());
            GMTrace.o(8256806191104L, 61518);
          }
        }
        
        public final void bkK()
        {
          GMTrace.i(8256537755648L, 61516);
          GMTrace.o(8256537755648L, 61516);
        }
        
        public final void bkL()
        {
          GMTrace.i(8256671973376L, 61517);
          GMTrace.o(8256671973376L, 61517);
        }
      });
    }
    for (;;)
    {
      this.pGX.setText(((l)this.pGS).title);
      d(this.pGX);
      this.pGX.setTextSize(0, ((l)this.pGS).pEe);
      int i;
      if ((((l)this.pGS).pEd != null) && (((l)this.pGS).pEd.length() > 0))
      {
        i = Color.parseColor(((l)this.pGS).pEd);
        this.pGX.setTextColor(i);
      }
      try
      {
        this.pGX.setTextAlignment(4);
        this.pGX.setLayoutParams(new RelativeLayout.LayoutParams(k - (int)((l)this.pGS).pED - (int)((l)this.pGS).pEE, this.pGX.getLayoutParams().height));
        GMTrace.o(8252645441536L, 61487);
        return;
        GradientDrawable localGradientDrawable = new GradientDrawable();
        localGradientDrawable.setShape(0);
        if ((!bg.nm(((l)this.pGS).pEh)) && (((l)this.pGS).pEf > 0.0F)) {
          try
          {
            i = Color.parseColor(((l)this.pGS).pEh);
            localGradientDrawable.setStroke((int)((l)this.pGS).pEf, i);
            i = 1;
            if (bg.nm(((l)this.pGS).pEg)) {}
          }
          catch (Exception localException2)
          {
            try
            {
              i = Color.parseColor(((l)this.pGS).pEg);
              localGradientDrawable.setColor(i);
              i = j;
              if (i == 0) {
                continue;
              }
              this.pGX.setBackgroundDrawable(localGradientDrawable);
              continue;
              localException2 = localException2;
              w.e("MicroMsg.Sns.AdLandingPageBtnComponent", bg.f(localException2));
              i = 0;
            }
            catch (Exception localException3)
            {
              for (;;)
              {
                w.e("MicroMsg.Sns.AdLandingPageBtnComponent", bg.f(localException3));
                i = 0;
              }
            }
          }
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
          continue;
          continue;
          i = 0;
        }
      }
    }
  }
  
  protected final l bkQ()
  {
    GMTrace.i(8252377006080L, 61485);
    l locall = (l)this.pGS;
    GMTrace.o(8252377006080L, 61485);
    return locall;
  }
  
  protected final void bkR()
  {
    GMTrace.i(8252913876992L, 61489);
    Object localObject3 = (l)this.pGS;
    Object localObject1;
    if (((l)localObject3).eCt == 4)
    {
      localObject1 = (f)localObject3;
      w.i("MicroMsg.Sns.AdLandingPageBtnComponent", "ext is " + ((f)localObject1).jzp);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("key_card_id", ((f)localObject1).jyz);
      ((Intent)localObject2).putExtra("key_card_ext", ((f)localObject1).jzp);
      ((Intent)localObject2).putExtra("key_from_scene", 21);
      ((Intent)localObject2).putExtra("key_stastic_scene", 15);
      com.tencent.mm.bj.d.b(this.context, "card", ".ui.CardDetailUI", (Intent)localObject2);
      GMTrace.o(8252913876992L, 61489);
      return;
    }
    if (((l)localObject3).eCt == 8) {
      if (((l)this.pGS instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j))
      {
        if (!(this.context instanceof Activity)) {
          break label940;
        }
        localObject1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
      }
    }
    for (Object localObject2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");; localObject2 = "")
    {
      localObject1 = String.format("%s:%s:%s:%s", new Object[] { localObject1, localObject2, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j)(l)this.pGS).pEz, String.valueOf(System.currentTimeMillis() / 1000L) });
      localObject2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j)this.pGS;
      AdLandingPagesProxy.getInstance().doOpenAppBrand(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j)localObject2).username, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j)localObject2).eVa, (String)localObject1);
      GMTrace.o(8252913876992L, 61489);
      return;
      if (((l)localObject3).eCt == 9)
      {
        localObject1 = (g)localObject3;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("map_view_type", 1);
        ((Intent)localObject2).putExtra("kwebmap_slat", ((g)localObject1).pDX.mwH);
        ((Intent)localObject2).putExtra("kwebmap_lng", ((g)localObject1).pDX.mwI);
        ((Intent)localObject2).putExtra("kwebmap_scale", ((g)localObject1).pDX.eMn);
        ((Intent)localObject2).putExtra("kPoiName", ((g)localObject1).pDX.eQm);
        ((Intent)localObject2).putExtra("Kwebmap_locaion", ((g)localObject1).pDX.mwJ);
        w.i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + ((g)localObject1).pDX.mwH + ", slong " + ((g)localObject1).pDX.mwI + ", " + ((g)localObject1).pDX.eQm);
        com.tencent.mm.bj.d.b(this.context, "location", ".ui.RedirectUI", (Intent)localObject2, 2);
        GMTrace.o(8252913876992L, 61489);
        return;
      }
      if (((l)localObject3).eCt == 10)
      {
        if (c.a.tDL == null)
        {
          GMTrace.o(8252913876992L, 61489);
          return;
        }
        localObject1 = (i)localObject3;
        if (((i)localObject1).pDV.size() > 1)
        {
          c.a.tDL.a(this.context, ((i)localObject1).pDV, new DialogInterface.OnDismissListener()
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20836228530176L, 155242);
              ab.dg(k.this.context);
              GMTrace.o(20836228530176L, 155242);
            }
          });
          GMTrace.o(8252913876992L, 61489);
          return;
        }
        if (((i)localObject1).pDV.size() > 0) {
          AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)this.context, (String)((i)localObject1).pDV.get(0));
        }
        GMTrace.o(8252913876992L, 61489);
        return;
      }
      localObject2 = new Intent();
      localObject1 = ((l)localObject3).pEb;
      if ((!TextUtils.isEmpty(((l)localObject3).pCq)) && (!TextUtils.isEmpty(((l)localObject3).pCr))) {
        localObject1 = ab.k((String)localObject1, new String[] { "traceid=" + ((l)localObject3).pCq + "&aid=" + ((l)localObject3).pCr });
      }
      for (;;)
      {
        w.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open url %s", new Object[] { localObject1 });
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
        ((Intent)localObject2).putExtra("useJs", true);
        ((Intent)localObject2).putExtra("type", 65281);
        ((Intent)localObject2).putExtra("geta8key_scene", 2);
        long l;
        if ((this.context instanceof Activity))
        {
          localObject3 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
          localObject1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
          if (!bg.nm((String)localObject3))
          {
            l = System.currentTimeMillis() / 1000L;
            if (bg.nm((String)localObject1)) {
              break label930;
            }
          }
        }
        for (;;)
        {
          localObject1 = String.format("official_mall_%s_%s_%s_%s", new Object[] { localObject1, localObject3, ((l)this.pGS).pEz, String.valueOf(l) });
          ((Intent)localObject2).putExtra("prePublishId", (String)localObject1);
          ((Intent)localObject2).putExtra("KPublisherId", (String)localObject1);
          ((Intent)localObject2).putExtra("pay_channel", 47);
          com.tencent.mm.bj.d.b(this.context, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
          GMTrace.o(8252913876992L, 61489);
          return;
          label930:
          localObject1 = "";
        }
      }
      label940:
      localObject1 = "";
    }
  }
  
  protected void d(Button paramButton)
  {
    GMTrace.i(8252779659264L, 61488);
    paramButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8259222110208L, 61536);
        k.this.bkP();
        k.this.bkR();
        GMTrace.o(8259222110208L, 61536);
      }
    });
    GMTrace.o(8252779659264L, 61488);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */