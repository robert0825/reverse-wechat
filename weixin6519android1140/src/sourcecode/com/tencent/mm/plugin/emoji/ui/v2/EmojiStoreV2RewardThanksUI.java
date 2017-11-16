package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.protocal.c.rg;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class EmojiStoreV2RewardThanksUI
  extends MMActivity
{
  private String klj;
  private aae kpA;
  private EmojiStoreV2RewardBannerView ktg;
  private View kth;
  private MMCopiableTextView kti;
  private TextView ktj;
  private TextView ktk;
  private AnimationDrawable ktl;
  private ae mHandler;
  
  public EmojiStoreV2RewardThanksUI()
  {
    GMTrace.i(11509841264640L, 85755);
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11486755815424L, 85583);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11486755815424L, 85583);
          return;
          paramAnonymousMessage = (String)paramAnonymousMessage.obj;
          if ((!bg.nm(paramAnonymousMessage)) && (e.aZ(paramAnonymousMessage)))
          {
            EmojiStoreV2RewardThanksUI.a(EmojiStoreV2RewardThanksUI.this).cz(paramAnonymousMessage, null);
            EmojiStoreV2RewardThanksUI.a(EmojiStoreV2RewardThanksUI.this).setScaleType(ImageView.ScaleType.FIT_XY);
            if ((EmojiStoreV2RewardThanksUI.b(EmojiStoreV2RewardThanksUI.this) != null) && (EmojiStoreV2RewardThanksUI.b(EmojiStoreV2RewardThanksUI.this).isRunning()))
            {
              EmojiStoreV2RewardThanksUI.b(EmojiStoreV2RewardThanksUI.this).stop();
              GMTrace.o(11486755815424L, 85583);
            }
          }
          else
          {
            w.i("MicroMsg.emoji.EmojiStoreV2RewardThanksUI", "path is null or file no exists");
          }
        }
      }
    };
    GMTrace.o(11509841264640L, 85755);
  }
  
  protected final void MP()
  {
    GMTrace.i(11510378135552L, 85759);
    oM(R.l.dpa);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11496285274112L, 85654);
        EmojiStoreV2RewardThanksUI.this.finish();
        GMTrace.o(11496285274112L, 85654);
        return false;
      }
    });
    this.ktg = ((EmojiStoreV2RewardBannerView)findViewById(R.h.cgW));
    this.ktg.fy = 1.0F;
    this.kth = findViewById(R.h.bLF);
    this.kti = ((MMCopiableTextView)findViewById(R.h.bLH));
    this.ktj = ((TextView)findViewById(R.h.bLE));
    this.ktk = ((TextView)findViewById(R.h.bLG));
    this.ktl = ((AnimationDrawable)getResources().getDrawable(R.g.aWe));
    GMTrace.o(11510378135552L, 85759);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11510512353280L, 85760);
    GMTrace.o(11510512353280L, 85760);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11509975482368L, 85756);
    int i = R.i.cuW;
    GMTrace.o(11509975482368L, 85756);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(11510109700096L, 85757);
    super.onCreate(paramBundle);
    this.klj = getIntent().getStringExtra("extra_id");
    MP();
    this.kpA = h.arl().kjD.UQ(this.klj);
    final String str;
    if (this.kpA != null) {
      if ((this.kpA.uqV != null) && (!bg.nm(this.kpA.uqV.uhF)))
      {
        paramBundle = this.kpA.uqV.uhG;
        at.AR();
        str = EmojiLogic.F(c.zb(), this.klj, paramBundle);
        if (e.aZ(str))
        {
          this.ktg.cz(str, null);
          this.ktg.setScaleType(ImageView.ScaleType.FIT_XY);
          if ((this.ktl != null) && (this.ktl.isRunning())) {
            this.ktl.stop();
          }
        }
      }
    }
    while ((this.kpA != null) && (this.kpA.uqV != null))
    {
      this.kth.setVisibility(0);
      bg.nm(this.kpA.uqV.uhI);
      this.kti.setVisibility(0);
      this.kti.setText(R.l.dpb);
      this.ktj.setVisibility(8);
      this.ktk.setVisibility(8);
      GMTrace.o(11510109700096L, 85757);
      return;
      n.Jd().a(paramBundle, this.ktg, f.g(this.klj, paramBundle, new Object[0]), new i()
      {
        public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(11512257183744L, 85773);
          if ((!bg.nm(paramAnonymousString)) && (paramAnonymousString.equalsIgnoreCase(paramBundle)))
          {
            paramAnonymousString = new Message();
            paramAnonymousString.what = 1001;
            paramAnonymousString.obj = str;
            EmojiStoreV2RewardThanksUI.c(EmojiStoreV2RewardThanksUI.this).sendMessage(paramAnonymousString);
          }
          GMTrace.o(11512257183744L, 85773);
        }
      });
      this.ktg.setBackgroundDrawable(getResources().getDrawable(R.g.aWn));
      this.ktg.setImageDrawable(this.ktl);
      this.ktg.setScaleType(ImageView.ScaleType.CENTER);
      this.ktl.start();
      continue;
      this.ktg.setBackgroundDrawable(getResources().getDrawable(R.g.aWn));
      this.ktg.setImageDrawable(this.ktl);
      this.ktg.setScaleType(ImageView.ScaleType.CENTER);
      this.ktl.start();
      continue;
      this.ktg.setBackgroundDrawable(getResources().getDrawable(R.g.aWn));
      this.ktg.setImageDrawable(this.ktl);
      this.ktg.setScaleType(ImageView.ScaleType.CENTER);
      this.ktl.start();
    }
    this.kth.setVisibility(8);
    GMTrace.o(11510109700096L, 85757);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11510243917824L, 85758);
    if ((this.ktl != null) && (this.ktl.isRunning())) {
      this.ktl.stop();
    }
    super.onDestroy();
    GMTrace.o(11510243917824L, 85758);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2RewardThanksUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */