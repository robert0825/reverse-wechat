package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.card.b.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class CardGiftVideoUI
  extends MMActivity
  implements a.a, f.a
{
  int duration;
  private CardGiftInfo jFE;
  private ImageView jFF;
  private ProgressBar jFI;
  private ae jFJ;
  private Bundle jFK;
  private boolean jFL;
  private g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private boolean jGN;
  private RelativeLayout jGO;
  private f jGP;
  private RelativeLayout jGQ;
  private ImageView jGR;
  TextView jGS;
  private MMPinProgressBtn jGT;
  private TextView jGU;
  private l jGV;
  private aj jGW;
  private String videoPath;
  
  public CardGiftVideoUI()
  {
    GMTrace.i(4931964633088L, 36746);
    this.jFJ = new ae(Looper.getMainLooper());
    this.jFL = false;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.jGW = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4975585394688L, 37071);
        if (CardGiftVideoUI.e(CardGiftVideoUI.this).isPlaying())
        {
          CardGiftVideoUI localCardGiftVideoUI = CardGiftVideoUI.this;
          int i = CardGiftVideoUI.e(CardGiftVideoUI.this).getCurrentPosition() / 1000;
          if ((localCardGiftVideoUI.jGS != null) && (localCardGiftVideoUI.duration > 0))
          {
            int j = localCardGiftVideoUI.duration - i;
            i = j;
            if (j < 0) {
              i = 0;
            }
            localCardGiftVideoUI.jGS.setText(i + "\"");
          }
        }
        GMTrace.o(4975585394688L, 37071);
        return true;
      }
    }, true);
    this.duration = 0;
    GMTrace.o(4931964633088L, 36746);
  }
  
  private void alN()
  {
    GMTrace.i(4932367286272L, 36749);
    if (this.jGV == null) {
      this.jGV = new l(this.vKB.vKW);
    }
    if (bg.nm(this.videoPath))
    {
      w.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
      GMTrace.o(4932367286272L, 36749);
      return;
    }
    this.jGV.a((VideoTextureView)this.jGP, new View.OnCreateContextMenuListener()new p.d
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(4937601777664L, 36788);
        paramAnonymousContextMenu.add(0, 0, 0, CardGiftVideoUI.this.getString(R.l.dgn));
        GMTrace.o(4937601777664L, 36788);
      }
    }, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(4955855388672L, 36924);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(4955855388672L, 36924);
          return;
          paramAnonymousMenuItem = t.mx(CardGiftVideoUI.a(CardGiftVideoUI.this));
          if (bg.nm(paramAnonymousMenuItem))
          {
            Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(R.l.egt), 1).show();
            GMTrace.o(4955855388672L, 36924);
            return;
          }
          Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(R.l.egu, new Object[] { paramAnonymousMenuItem }), 1).show();
          k.b(paramAnonymousMenuItem, CardGiftVideoUI.this);
        }
      }
    });
    GMTrace.o(4932367286272L, 36749);
  }
  
  private void ur(String paramString)
  {
    GMTrace.i(4932233068544L, 36748);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
      setResult(0);
      finish();
      GMTrace.o(4932233068544L, 36748);
      return;
    }
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      w.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", new Object[] { paramString });
      setResult(0);
      finish();
      GMTrace.o(4932233068544L, 36748);
      return;
    }
    this.jGP.setVideoPath(paramString);
    GMTrace.o(4932233068544L, 36748);
  }
  
  protected final void MP()
  {
    GMTrace.i(4932501504000L, 36750);
    this.jGO = ((RelativeLayout)findViewById(R.h.ckK));
    this.jGQ = ((RelativeLayout)findViewById(R.h.ckF));
    this.jGR = ((ImageView)findViewById(R.h.ckG));
    this.jGS = ((TextView)findViewById(R.h.ckk));
    this.jGT = ((MMPinProgressBtn)findViewById(R.h.ckv));
    this.jFI = ((ProgressBar)findViewById(R.h.ckq));
    this.jGU = ((TextView)findViewById(R.h.ckI));
    this.jGP = new VideoTextureView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(13);
    this.jGP.setMute(this.jGN);
    this.jGP.a(this);
    this.jGQ.addView((View)this.jGP, localLayoutParams);
    this.jFF = ((ImageView)findViewById(R.h.bCu));
    this.jFF.setLayerType(2, null);
    this.jGO.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5008334520320L, 37315);
        CardGiftVideoUI.this.alL();
        GMTrace.o(5008334520320L, 37315);
        return true;
      }
    });
    ((View)this.jGP).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4927401230336L, 36712);
        CardGiftVideoUI.this.alL();
        GMTrace.o(4927401230336L, 36712);
      }
    });
    this.jFM = new g(this);
    GMTrace.o(4932501504000L, 36750);
  }
  
  public final void Xq()
  {
    GMTrace.i(4933709463552L, 36759);
    setResult(-1);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5001623633920L, 37265);
        w.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", new Object[] { Integer.valueOf(CardGiftVideoUI.this.hashCode()), Boolean.valueOf(this.jGZ) });
        if (this.jGZ)
        {
          ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(0);
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          GMTrace.o(5001623633920L, 37265);
          return;
        }
        ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(8);
        CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(0);
        GMTrace.o(5001623633920L, 37265);
      }
    });
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5010750439424L, 37333);
        w.d("MicroMsg.CardGiftVideoUI", "hide loading.");
        if ((CardGiftVideoUI.g(CardGiftVideoUI.this) != null) && (CardGiftVideoUI.g(CardGiftVideoUI.this).getVisibility() != 8)) {
          CardGiftVideoUI.g(CardGiftVideoUI.this).setVisibility(8);
        }
        if ((CardGiftVideoUI.h(CardGiftVideoUI.this) != null) && (CardGiftVideoUI.h(CardGiftVideoUI.this).getVisibility() != 8)) {
          CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(8);
        }
        GMTrace.o(5010750439424L, 37333);
      }
    });
    this.jGP.start();
    this.duration = (this.jGP.getDuration() / 1000);
    this.jGW.z(500L, 500L);
    w.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", new Object[] { Integer.valueOf(this.duration) });
    GMTrace.o(4933709463552L, 36759);
  }
  
  public final void aH(String paramString, final int paramInt)
  {
    GMTrace.i(4934246334464L, 36763);
    if (paramString.equals(this.jFE.jyb)) {
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4939346608128L, 36801);
          if (CardGiftVideoUI.h(CardGiftVideoUI.this) != null)
          {
            if (this.gIC == 0)
            {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(8);
              GMTrace.o(4939346608128L, 36801);
              return;
            }
            if (CardGiftVideoUI.h(CardGiftVideoUI.this).getVisibility() != 0) {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(0);
            }
            w.i("MicroMsg.CardGiftVideoUI", "update progress %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.gIC) });
            if ((CardGiftVideoUI.h(CardGiftVideoUI.this).xqu != this.gIC) && (this.gIC > 0)) {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setMax(this.gIC);
            }
            CardGiftVideoUI.h(CardGiftVideoUI.this).setProgress(paramInt);
          }
          GMTrace.o(4939346608128L, 36801);
        }
      });
    }
    GMTrace.o(4934246334464L, 36763);
  }
  
  public final void alL()
  {
    GMTrace.i(4933306810368L, 36756);
    this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
    this.jFM.a(this.jGO, this.jFF, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(4988470296576L, 37167);
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5031822622720L, 37490);
            CardGiftVideoUI.this.finish();
            CardGiftVideoUI.this.overridePendingTransition(0, 0);
            GMTrace.o(5031822622720L, 37490);
          }
        });
        GMTrace.o(4988470296576L, 37167);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(4988336078848L, 37166);
        GMTrace.o(4988336078848L, 37166);
      }
    }, null);
    GMTrace.o(4933306810368L, 36756);
  }
  
  public final void bF(String paramString1, final String paramString2)
  {
    GMTrace.i(4934380552192L, 36764);
    if (paramString1.equals(this.jFE.jyb))
    {
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4956392259584L, 36928);
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          CardGiftVideoUI.a(CardGiftVideoUI.this, paramString2);
          CardGiftVideoUI.b(CardGiftVideoUI.this, CardGiftVideoUI.a(CardGiftVideoUI.this));
          CardGiftVideoUI.i(CardGiftVideoUI.this);
          GMTrace.o(4956392259584L, 36928);
        }
      });
      GMTrace.o(4934380552192L, 36764);
      return;
    }
    if (paramString1.equals(this.jFE.jyc))
    {
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4936125382656L, 36777);
          if (bg.nm(CardGiftVideoUI.a(CardGiftVideoUI.this)))
          {
            CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(0);
            Object localObject = new c.a();
            ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
            n.Je();
            ((c.a)localObject).gKX = null;
            ((c.a)localObject).gKE = m.tZ(paramString2);
            ((c.a)localObject).gKH = 1;
            ((c.a)localObject).gKC = true;
            ((c.a)localObject).gKA = true;
            localObject = ((c.a)localObject).Jn();
            n.Jd().a(paramString2, CardGiftVideoUI.f(CardGiftVideoUI.this), (c)localObject);
          }
          GMTrace.o(4936125382656L, 36777);
        }
      });
      GMTrace.o(4934380552192L, 36764);
      return;
    }
    w.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", new Object[] { paramString1 });
    GMTrace.o(4934380552192L, 36764);
  }
  
  public final int bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(4933977899008L, 36761);
    GMTrace.o(4933977899008L, 36761);
    return 0;
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(4934112116736L, 36762);
    GMTrace.o(4934112116736L, 36762);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(4933172592640L, 36755);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.CardGiftVideoUI", "dispatchKeyEvent");
      alL();
      GMTrace.o(4933172592640L, 36755);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(4933172592640L, 36755);
    return bool;
  }
  
  public final void fail(String paramString)
  {
    GMTrace.i(17260936691712L, 128604);
    GMTrace.o(17260936691712L, 128604);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4933441028096L, 36757);
    int i = R.i.cra;
    GMTrace.o(4933441028096L, 36757);
    return i;
  }
  
  public final void onCompletion()
  {
    GMTrace.i(4933843681280L, 36760);
    w.i("MicroMsg.CardGiftVideoUI", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    this.jGP.o(0.0D);
    GMTrace.o(4933843681280L, 36760);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4932098850816L, 36747);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.jFK = paramBundle;
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    if (at.pD() != null) {
      at.pD().ri();
    }
    this.jFE = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    this.videoPath = getIntent().getStringExtra("key_video_path");
    this.jGN = getIntent().getBooleanExtra("key_is_mute", false);
    if (this.jFE == null) {}
    for (paramBundle = "null";; paramBundle = this.jFE.toString())
    {
      w.d("MicroMsg.CardGiftVideoUI", "cardGiftInfo %s", new Object[] { paramBundle });
      w.d("MicroMsg.CardGiftVideoUI", "videoPath:%s, isMute:%b", new Object[] { this.videoPath, Boolean.valueOf(this.jGN) });
      MP();
      com.tencent.mm.plugin.card.b.a.a(this);
      alN();
      if (this.jFE != null) {
        break;
      }
      w.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
      GMTrace.o(4932098850816L, 36747);
      return;
    }
    if (!bg.nm(this.jFE.jyb))
    {
      com.tencent.mm.plugin.card.b.a.f(this.jFE.jyc, this.jFE.jyf, this.jFE.jyo, 2);
      com.tencent.mm.plugin.card.b.a.f(this.jFE.jyb, this.jFE.jye, this.jFE.jyn, 1);
      GMTrace.o(4932098850816L, 36747);
      return;
    }
    w.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
    GMTrace.o(4932098850816L, 36747);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4933038374912L, 36754);
    this.jGP.stop();
    this.jGW.stopTimer();
    com.tencent.mm.plugin.card.b.a.b(this);
    super.onDestroy();
    GMTrace.o(4933038374912L, 36754);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(4933575245824L, 36758);
    setResult(0);
    this.jGP.stop();
    w.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(4933575245824L, 36758);
  }
  
  protected void onPause()
  {
    GMTrace.i(4932904157184L, 36753);
    this.jGP.pause();
    super.onPause();
    GMTrace.o(4932904157184L, 36753);
  }
  
  protected void onResume()
  {
    GMTrace.i(4932769939456L, 36752);
    if (!bg.nm(this.videoPath)) {
      ur(this.videoPath);
    }
    super.onResume();
    GMTrace.o(4932769939456L, 36752);
  }
  
  public void onStart()
  {
    GMTrace.i(4932635721728L, 36751);
    Bundle localBundle = this.jFK;
    if (!this.jFL)
    {
      this.jFL = true;
      if (Build.VERSION.SDK_INT >= 12) {
        break label69;
      }
      w.e("MicroMsg.CardGiftVideoUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    for (;;)
    {
      super.onStart();
      GMTrace.o(4932635721728L, 36751);
      return;
      label69:
      this.jFN = getIntent().getIntExtra("img_top", 0);
      this.jFO = getIntent().getIntExtra("img_left", 0);
      this.jFP = getIntent().getIntExtra("img_width", 0);
      this.jFQ = getIntent().getIntExtra("img_height", 0);
      this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
      if (localBundle == null) {
        this.jGO.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(4989275602944L, 37173);
            CardGiftVideoUI.b(CardGiftVideoUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
            CardGiftVideoUI.d(CardGiftVideoUI.this).a(CardGiftVideoUI.b(CardGiftVideoUI.this), CardGiftVideoUI.c(CardGiftVideoUI.this), null);
            GMTrace.o(4989275602944L, 37173);
            return true;
          }
        });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardGiftVideoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */