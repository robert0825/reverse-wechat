package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.g.b;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;

public class EmojiStoreV2SingleRecommendView
  extends ChatFooterPanel.RecommendView
  implements View.OnClickListener, g.b
{
  private ViewGroup iwt;
  private String klj;
  private com.tencent.mm.plugin.emoji.f.g kmT;
  protected final int knp;
  private final int knq;
  private final int knr;
  private final String kns;
  private final String knt;
  private final String knu;
  private ImageView kpM;
  private String kqf;
  private ae krX;
  private ImageView kuB;
  private TextView kuC;
  private TextView kuD;
  private Button kuE;
  private ProgressBar kuF;
  private EmojiGroupInfo kuG;
  private boolean kuH;
  private c kuI;
  
  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11475481526272L, 85499);
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.kuH = true;
    this.krX = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11507291127808L, 85736);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11507291127808L, 85736);
          return;
          GMTrace.o(11507291127808L, 85736);
          return;
          int i = paramAnonymousMessage.getData().getInt("progress");
          if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
          {
            w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
            GMTrace.o(11507291127808L, 85736);
            return;
          }
          if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
            EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
          }
          if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
          {
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(i);
            GMTrace.o(11507291127808L, 85736);
            return;
            paramAnonymousMessage.getData().getInt("status");
            if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
            {
              w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
              GMTrace.o(11507291127808L, 85736);
              return;
            }
            if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
              EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            }
            if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
            {
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(0);
            }
          }
        }
      }
    };
    this.kuI = new c() {};
    init();
    GMTrace.o(11475481526272L, 85499);
  }
  
  @TargetApi(11)
  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11475615744000L, 85500);
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.kuH = true;
    this.krX = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11507291127808L, 85736);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11507291127808L, 85736);
          return;
          GMTrace.o(11507291127808L, 85736);
          return;
          int i = paramAnonymousMessage.getData().getInt("progress");
          if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
          {
            w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
            GMTrace.o(11507291127808L, 85736);
            return;
          }
          if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
            EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
          }
          if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
          {
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(i);
            GMTrace.o(11507291127808L, 85736);
            return;
            paramAnonymousMessage.getData().getInt("status");
            if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
            {
              w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
              GMTrace.o(11507291127808L, 85736);
              return;
            }
            if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
              EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            }
            if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
            {
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(0);
            }
          }
        }
      }
    };
    this.kuI = new c() {};
    init();
    GMTrace.o(11475615744000L, 85500);
  }
  
  public EmojiStoreV2SingleRecommendView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(11475347308544L, 85498);
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.kuH = true;
    this.krX = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11507291127808L, 85736);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11507291127808L, 85736);
          return;
          GMTrace.o(11507291127808L, 85736);
          return;
          int i = paramAnonymousMessage.getData().getInt("progress");
          if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
          {
            w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
            GMTrace.o(11507291127808L, 85736);
            return;
          }
          if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
            EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
          }
          if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
          {
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(i);
            GMTrace.o(11507291127808L, 85736);
            return;
            paramAnonymousMessage.getData().getInt("status");
            if (bg.nm(paramAnonymousMessage.getData().getString("product_id")))
            {
              w.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
              GMTrace.o(11507291127808L, 85736);
              return;
            }
            if (EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this) != null) {
              EmojiStoreV2SingleRecommendView.a(EmojiStoreV2SingleRecommendView.this).setVisibility(0);
            }
            if (EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this) != null)
            {
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setVisibility(8);
              EmojiStoreV2SingleRecommendView.b(EmojiStoreV2SingleRecommendView.this).setProgress(0);
            }
          }
        }
      }
    };
    this.kuI = new c() {};
    this.kuH = paramBoolean;
    init();
    GMTrace.o(11475347308544L, 85498);
  }
  
  private void c(rh paramrh)
  {
    GMTrace.i(11476555268096L, 85507);
    Intent localIntent = new Intent();
    localIntent.setClass(getContext(), EmojiStoreDetailUI.class);
    localIntent.putExtra("extra_id", paramrh.tRS);
    localIntent.putExtra("extra_name", paramrh.uhe);
    localIntent.putExtra("extra_copyright", paramrh.uho);
    localIntent.putExtra("extra_coverurl", paramrh.uhm);
    localIntent.putExtra("extra_description", paramrh.uhf);
    localIntent.putExtra("extra_price", paramrh.uhh);
    localIntent.putExtra("extra_type", paramrh.uhi);
    localIntent.putExtra("extra_flag", paramrh.uhj);
    localIntent.putExtra("extra_price_num", paramrh.uhp);
    localIntent.putExtra("extra_price_type", paramrh.uhq);
    localIntent.putExtra("preceding_scence", 108);
    localIntent.putExtra("call_by", 1);
    localIntent.putExtra("download_entrance_scene", 8);
    localIntent.putExtra("check_clickflag", false);
    getContext().startActivity(localIntent);
    GMTrace.o(11476555268096L, 85507);
  }
  
  private void init()
  {
    GMTrace.i(11476018397184L, 85503);
    if (this.kuH) {}
    for (this.iwt = ((ViewGroup)v.fb(getContext()).inflate(R.i.cvb, this));; this.iwt = ((ViewGroup)v.fb(getContext()).inflate(R.i.cvc, this)))
    {
      this.kpM = ((ImageView)this.iwt.findViewById(R.h.bvH));
      this.kuB = ((ImageView)this.iwt.findViewById(R.h.bvS));
      this.kuC = ((TextView)this.iwt.findViewById(R.h.bws));
      this.kuD = ((TextView)this.iwt.findViewById(R.h.bwu));
      this.kuE = ((Button)this.iwt.findViewById(R.h.aWf));
      this.kuF = ((ProgressBar)this.iwt.findViewById(R.h.bvO));
      GMTrace.o(11476018397184L, 85503);
      return;
    }
  }
  
  public final void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11476152614912L, 85504);
    paramString1 = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    at.wS().a(paramString1, 0);
    GMTrace.o(11476152614912L, 85504);
  }
  
  public final void ard()
  {
    GMTrace.i(11476286832640L, 85505);
    GMTrace.o(11476286832640L, 85505);
  }
  
  public final void i(Message paramMessage)
  {
    GMTrace.i(11476421050368L, 85506);
    if (this.krX != null) {
      this.krX.sendMessage(paramMessage);
    }
    GMTrace.o(11476421050368L, 85506);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(11475749961728L, 85501);
    super.onAttachedToWindow();
    w.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onAttachedToWindow");
    com.tencent.mm.sdk.b.a.vgX.b(this.kuI);
    GMTrace.o(11475749961728L, 85501);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(11476689485824L, 85508);
    if (paramView == this.kpM)
    {
      h.arl().kjz.UG(this.klj);
      com.tencent.mm.plugin.report.service.g.ork.i(12068, new Object[] { Integer.valueOf(2), this.klj, Integer.valueOf(this.kuG.field_recommandType) });
      GMTrace.o(11476689485824L, 85508);
      return;
    }
    if (paramView == this.iwt)
    {
      c(this.kuG.bUt());
      com.tencent.mm.plugin.report.service.g.ork.i(12068, new Object[] { Integer.valueOf(4), this.klj, Integer.valueOf(this.kuG.field_recommandType) });
      GMTrace.o(11476689485824L, 85508);
      return;
    }
    if (paramView == this.kuE)
    {
      if (this.kuG.field_buttonType == 1)
      {
        this.kmT = new com.tencent.mm.plugin.emoji.f.g(this.klj);
        at.wS().a(this.kmT, 0);
        com.tencent.mm.plugin.report.service.g.ork.i(12068, new Object[] { Integer.valueOf(3), this.klj, Integer.valueOf(this.kuG.field_recommandType) });
        com.tencent.mm.plugin.report.service.g.ork.i(12066, new Object[] { Integer.valueOf(0), Integer.valueOf(8), "", this.klj });
        GMTrace.o(11476689485824L, 85508);
        return;
      }
      if (this.kuG.field_buttonType == 2)
      {
        c(this.kuG.bUt());
        com.tencent.mm.plugin.report.service.g.ork.i(12068, new Object[] { Integer.valueOf(4), this.klj, Integer.valueOf(this.kuG.field_recommandType) });
        GMTrace.o(11476689485824L, 85508);
        return;
      }
      w.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
      GMTrace.o(11476689485824L, 85508);
      return;
    }
    w.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "do nothing");
    GMTrace.o(11476689485824L, 85508);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(11475884179456L, 85502);
    super.onDetachedFromWindow();
    w.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onDetachedFromWindow");
    com.tencent.mm.sdk.b.a.vgX.c(this.kuI);
    GMTrace.o(11475884179456L, 85502);
  }
  
  public final void wA(String paramString)
  {
    GMTrace.i(19269370773504L, 143568);
    this.klj = paramString;
    if (bg.nm(this.klj))
    {
      this.iwt.setVisibility(8);
      GMTrace.o(19269370773504L, 143568);
      return;
    }
    this.kuG = h.arl().kjz.aW(this.klj, false);
    this.kpM.setOnClickListener(this);
    this.kuE.setOnClickListener(this);
    this.iwt.setOnClickListener(this);
    paramString = this.kuG;
    if (this.kuE != null) {}
    switch (paramString.field_buttonType)
    {
    default: 
      this.kuE.setVisibility(8);
      if (!bg.nm(paramString.field_packName)) {
        this.kuC.setText(paramString.field_packName);
      }
      if (this.kuD != null)
      {
        if (bg.nm(paramString.field_recommandWord)) {
          break label286;
        }
        this.kuD.setVisibility(0);
        this.kuD.setText(paramString.field_recommandWord);
      }
      break;
    }
    for (;;)
    {
      this.kuF.setVisibility(8);
      com.tencent.mm.ao.n.Jd().a(this.kuG.field_BigIconUrl, this.kuB, f.c(this.klj, this.kuG.field_BigIconUrl, new Object[0]));
      GMTrace.o(19269370773504L, 143568);
      return;
      this.kuE.setVisibility(0);
      this.kuE.setText(R.l.doD);
      break;
      this.kuE.setVisibility(0);
      this.kuE.setText(R.l.dID);
      break;
      label286:
      this.kuD.setVisibility(8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2SingleRecommendView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */