package com.tencent.mm.plugin.favorite.ui.post;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.j.a;
import com.tencent.mm.plugin.favorite.b.m;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.v;
import java.io.File;
import java.util.LinkedList;

public class FavPostVoiceUI
  extends MMBaseActivity
{
  private static final int[] jsp;
  private static final int[] jsq;
  private long duration;
  private boolean jsG;
  private boolean jsH;
  private final aj jsM;
  private final aj jsN;
  private final ae jsP;
  private int jsi;
  private long jst;
  private Toast jsu;
  private ImageView jsy;
  private View lkA;
  private View lkB;
  private View lkC;
  private View lkD;
  private TextView lkE;
  private View lkF;
  private com.tencent.mm.e.b.j lkG;
  boolean lkH;
  private Button lky;
  private long lkz;
  private String path;
  
  static
  {
    GMTrace.i(6347290574848L, 47291);
    jsp = new int[] { 0, 15, 30, 45, 60, 75, 90, 100 };
    jsq = new int[] { R.g.aTs, R.g.aTt, R.g.aTu, R.g.aTv, R.g.aTw, R.g.aTx, R.g.aTy };
    GMTrace.o(6347290574848L, 47291);
  }
  
  public FavPostVoiceUI()
  {
    GMTrace.i(6342592954368L, 47256);
    this.jst = -1L;
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        int j = 0;
        GMTrace.i(6356417380352L, 47359);
        com.tencent.mm.e.b.j localj = FavPostVoiceUI.a(FavPostVoiceUI.this);
        int i;
        if (localj.status == 1)
        {
          i = localj.ezk.getMaxAmplitude();
          if (i > com.tencent.mm.e.b.j.ezm) {
            com.tencent.mm.e.b.j.ezm = i;
          }
          i = i * 100 / com.tencent.mm.e.b.j.ezm;
        }
        for (;;)
        {
          if (j < FavPostVoiceUI.azo().length)
          {
            if ((i >= FavPostVoiceUI.azp()[j]) && (i < FavPostVoiceUI.azp()[(j + 1)])) {
              FavPostVoiceUI.b(FavPostVoiceUI.this).setBackgroundResource(FavPostVoiceUI.azo()[j]);
            }
          }
          else
          {
            GMTrace.o(6356417380352L, 47359);
            return true;
            i = 0;
            continue;
          }
          j += 1;
        }
      }
    }, true);
    this.jsP = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6356685815808L, 47361);
        super.handleMessage(paramAnonymousMessage);
        FavPostVoiceUI.this.azl();
        FavPostVoiceUI.g(FavPostVoiceUI.this).setBackgroundResource(R.g.aZy);
        FavPostVoiceUI.g(FavPostVoiceUI.this).setEnabled(true);
        GMTrace.o(6356685815808L, 47361);
      }
    };
    this.jsN = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6355075203072L, 47349);
        if (FavPostVoiceUI.q(FavPostVoiceUI.this) == -1L) {
          FavPostVoiceUI.a(FavPostVoiceUI.this, bg.Pw());
        }
        long l = bg.aI(FavPostVoiceUI.q(FavPostVoiceUI.this));
        if ((l >= 3590000L) && (l <= 3600000L))
        {
          if (FavPostVoiceUI.r(FavPostVoiceUI.this) != null) {
            break label166;
          }
          FavPostVoiceUI.a(FavPostVoiceUI.this, Toast.makeText(FavPostVoiceUI.this, FavPostVoiceUI.this.getString(R.l.cIg, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }), 0));
        }
        for (;;)
        {
          FavPostVoiceUI.r(FavPostVoiceUI.this).show();
          if (l < 3600000L) {
            break;
          }
          w.v("MicroMsg.FavPostVoiceUI", "record stop on countdown");
          FavPostVoiceUI.s(FavPostVoiceUI.this);
          FavPostVoiceUI.p(FavPostVoiceUI.this);
          GMTrace.o(6355075203072L, 47349);
          return false;
          label166:
          FavPostVoiceUI.r(FavPostVoiceUI.this).setText(FavPostVoiceUI.this.getString(R.l.cIg, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }));
        }
        GMTrace.o(6355075203072L, 47349);
        return true;
      }
    }, true);
    this.lkH = false;
    GMTrace.o(6342592954368L, 47256);
  }
  
  private com.tencent.mm.e.b.j azj()
  {
    GMTrace.i(6342861389824L, 47258);
    Object localObject = b.a.fML;
    localObject = new com.tencent.mm.e.b.j();
    ((com.tencent.mm.e.b.j)localObject).ezl = new j.a()
    {
      public final void onError()
      {
        GMTrace.i(6347827445760L, 47295);
        FavPostVoiceUI.e(FavPostVoiceUI.this).stopTimer();
        FavPostVoiceUI.f(FavPostVoiceUI.this).stopTimer();
        GMTrace.o(6347827445760L, 47295);
      }
    };
    GMTrace.o(6342861389824L, 47258);
    return (com.tencent.mm.e.b.j)localObject;
  }
  
  private void azk()
  {
    long l = 0L;
    GMTrace.i(6342995607552L, 47259);
    if (!this.jsG)
    {
      GMTrace.o(6342995607552L, 47259);
      return;
    }
    this.lky.setKeepScreenOn(true);
    this.lky.setBackgroundResource(R.g.aZx);
    this.lky.setText(R.l.duo);
    this.lkG.qn();
    int i;
    label89:
    String str;
    if (this.lkz == 0L)
    {
      this.duration = l;
      if (this.duration >= 800L) {
        break label174;
      }
      i = 1;
      this.jsM.stopTimer();
      this.jsN.stopTimer();
      if (i != 0) {
        break label306;
      }
      str = this.path;
      i = (int)this.duration;
      if (!bg.nm(str)) {
        break label179;
      }
      w.e("MicroMsg.FavPostLogic", "postVoice path null");
      label134:
      setResult(-1);
      finish();
      overridePendingTransition(0, 0);
    }
    for (;;)
    {
      this.jsG = false;
      GMTrace.o(6342995607552L, 47259);
      return;
      l = bg.aI(this.lkz);
      break;
      label174:
      i = 0;
      break label89;
      label179:
      com.tencent.mm.plugin.favorite.b.j localj = new com.tencent.mm.plugin.favorite.b.j();
      localj.field_type = 3;
      localj.field_sourceType = 6;
      m.f(localj);
      th localth = new th();
      localth.Qu(str);
      localth.zQ(i);
      localth.kx(true);
      localth.zR(localj.field_type);
      localth.Qq("amr");
      localj.field_favProto.ulB.add(localth);
      a.z(localj);
      g.ork.i(10648, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      break label134;
      label306:
      azm();
      this.lky.setEnabled(false);
      this.lky.setBackgroundResource(R.g.aZw);
      this.lkB.setVisibility(0);
      this.lkA.setVisibility(8);
      this.jsP.sendEmptyMessageDelayed(0, 500L);
    }
  }
  
  private void azm()
  {
    GMTrace.i(6343264043008L, 47261);
    File localFile = new File(this.path);
    if (localFile.exists()) {
      localFile.delete();
    }
    GMTrace.o(6343264043008L, 47261);
  }
  
  private void azn()
  {
    GMTrace.i(6343935131648L, 47266);
    if (this.lkH)
    {
      GMTrace.o(6343935131648L, 47266);
      return;
    }
    this.lkH = true;
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
    localTranslateAnimation.setDuration(300L);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(300L);
    localTranslateAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(6342190301184L, 47253);
        FavPostVoiceUI.l(FavPostVoiceUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6348632752128L, 47301);
            FavPostVoiceUI.this.setResult(0);
            FavPostVoiceUI.this.finish();
            FavPostVoiceUI.this.overridePendingTransition(0, 0);
            GMTrace.o(6348632752128L, 47301);
          }
        });
        GMTrace.o(6342190301184L, 47253);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(6342056083456L, 47252);
        GMTrace.o(6342056083456L, 47252);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(6341921865728L, 47251);
        GMTrace.o(6341921865728L, 47251);
      }
    });
    findViewById(R.h.clG).setVisibility(8);
    findViewById(R.h.bzl).setVisibility(8);
    this.lkF.setVisibility(8);
    this.lkF.startAnimation(localAlphaAnimation);
    findViewById(R.h.clG).startAnimation(localAlphaAnimation);
    findViewById(R.h.bzl).startAnimation(localTranslateAnimation);
    GMTrace.o(6343935131648L, 47266);
  }
  
  public final void azl()
  {
    GMTrace.i(6343129825280L, 47260);
    this.lkA.setVisibility(0);
    this.lkB.setVisibility(8);
    this.lkD.setVisibility(8);
    this.lkC.setVisibility(0);
    this.lkE.setText(R.l.dOz);
    this.lky.setBackgroundResource(R.g.aZy);
    this.lky.setText(R.l.duo);
    this.jsy.setVisibility(4);
    this.jsG = false;
    GMTrace.o(6343129825280L, 47260);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6342727172096L, 47257);
    super.onCreate(paramBundle);
    setContentView(v.fb(this).inflate(R.i.cwE, null));
    this.jsy = ((ImageView)findViewById(R.h.clH));
    this.lkC = findViewById(R.h.clI);
    this.lkD = findViewById(R.h.clK);
    this.lkA = findViewById(R.h.clO);
    this.lkB = findViewById(R.h.clP);
    this.lkE = ((TextView)findViewById(R.h.clQ));
    this.lkF = findViewById(R.h.clJ);
    findViewById(R.h.clG).setVisibility(8);
    this.lkF.setVisibility(8);
    findViewById(R.h.clG).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6355343638528L, 47351);
        FavPostVoiceUI.c(FavPostVoiceUI.this);
        GMTrace.o(6355343638528L, 47351);
        return false;
      }
    });
    findViewById(R.h.bzl).setVisibility(8);
    this.lkG = azj();
    this.lky = ((Button)findViewById(R.h.bzk));
    this.lky.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6349974929408L, 47311);
        if (paramAnonymousView != FavPostVoiceUI.g(FavPostVoiceUI.this))
        {
          GMTrace.o(6349974929408L, 47311);
          return false;
        }
        int i = (int)paramAnonymousMotionEvent.getRawY();
        paramAnonymousView = new int[2];
        FavPostVoiceUI.a(FavPostVoiceUI.this, FavPostVoiceUI.this.getResources().getDisplayMetrics().heightPixels);
        FavPostVoiceUI.g(FavPostVoiceUI.this).getLocationOnScreen(paramAnonymousView);
        int j = paramAnonymousView[1];
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(6349974929408L, 47311);
          return false;
          if (!FavPostVoiceUI.h(FavPostVoiceUI.this))
          {
            FavPostVoiceUI.i(FavPostVoiceUI.this);
            FavPostVoiceUI.j(FavPostVoiceUI.this);
            continue;
            int k = BackwardSupportUtil.b.a(FavPostVoiceUI.this, 60.0F);
            if ((i <= FavPostVoiceUI.k(FavPostVoiceUI.this) - k) && (i < j))
            {
              FavPostVoiceUI.l(FavPostVoiceUI.this).setVisibility(8);
              FavPostVoiceUI.m(FavPostVoiceUI.this).setVisibility(0);
            }
            else
            {
              FavPostVoiceUI.l(FavPostVoiceUI.this).setVisibility(0);
              FavPostVoiceUI.m(FavPostVoiceUI.this).setVisibility(8);
              continue;
              if (!FavPostVoiceUI.h(FavPostVoiceUI.this))
              {
                GMTrace.o(6349974929408L, 47311);
                return false;
              }
              if (FavPostVoiceUI.m(FavPostVoiceUI.this).getVisibility() == 0)
              {
                w.w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
                FavPostVoiceUI.n(FavPostVoiceUI.this);
              }
              else if (!FavPostVoiceUI.o(FavPostVoiceUI.this))
              {
                FavPostVoiceUI.p(FavPostVoiceUI.this);
                continue;
                w.w("MicroMsg.FavPostVoiceUI", "action cancel");
                FavPostVoiceUI.n(FavPostVoiceUI.this);
              }
            }
          }
        }
      }
    });
    azl();
    paramBundle = x.axZ();
    Object localObject = new File(paramBundle);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    do
    {
      localObject = paramBundle + "/" + System.currentTimeMillis();
    } while (new File((String)localObject).exists());
    this.path = ((String)localObject);
    this.lkE.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6357222686720L, 47365);
        FavPostVoiceUI.this.findViewById(R.h.clG).setVisibility(0);
        FavPostVoiceUI.d(FavPostVoiceUI.this).setVisibility(0);
        FavPostVoiceUI.this.findViewById(R.h.bzl).setVisibility(0);
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setDuration(300L);
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        localTranslateAnimation.setDuration(300L);
        FavPostVoiceUI.d(FavPostVoiceUI.this).startAnimation(localAlphaAnimation);
        FavPostVoiceUI.this.findViewById(R.h.clG).startAnimation(localAlphaAnimation);
        FavPostVoiceUI.this.findViewById(R.h.bzl).startAnimation(localTranslateAnimation);
        GMTrace.o(6357222686720L, 47365);
      }
    });
    GMTrace.o(6342727172096L, 47257);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6343398260736L, 47262);
    super.onDestroy();
    GMTrace.o(6343398260736L, 47262);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6343800913920L, 47265);
    if (4 == paramInt)
    {
      azn();
      GMTrace.o(6343800913920L, 47265);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6343800913920L, 47265);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(6343666696192L, 47264);
    super.onPause();
    azk();
    GMTrace.o(6343666696192L, 47264);
  }
  
  protected void onResume()
  {
    GMTrace.i(6343532478464L, 47263);
    super.onResume();
    GMTrace.o(6343532478464L, 47263);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\post\FavPostVoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */