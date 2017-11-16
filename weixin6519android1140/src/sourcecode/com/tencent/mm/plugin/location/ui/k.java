package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.n;
import com.tencent.mm.pluginsdk.p.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.aq.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.LinkedList;
import java.util.List;

public final class k
  implements com.tencent.mm.ad.e, p.o
{
  private Activity activity;
  private List<String> eNC;
  public Button mAD;
  public VolumeMeter mAE;
  public RelativeLayout mAF;
  private boolean mAG;
  private String mAH;
  public String mAI;
  private String mAJ;
  public boolean mAK;
  public int mAL;
  private long mAM;
  public long mAN;
  public aj mAO;
  public aj mAP;
  private aj mAQ;
  public p.n mAR;
  public a mAS;
  public final aj mAT;
  private boolean mAU;
  
  public k(Activity paramActivity, Button paramButton)
  {
    GMTrace.i(9719242555392L, 72414);
    this.mAG = true;
    this.eNC = new LinkedList();
    this.mAK = false;
    this.mAL = 0;
    this.mAM = 500L;
    this.mAN = 0L;
    this.mAO = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9667702947840L, 72030);
        w.i("MicroMsg.TalkMgr", "onSeizeMicSuccess expired to execute");
        k.this.aKT();
        GMTrace.o(9667702947840L, 72030);
        return false;
      }
    }, false);
    this.mAP = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9650791514112L, 71904);
        w.i("MicroMsg.TalkMgr", "seizeMicTimer reach");
        k.this.aKU();
        GMTrace.o(9650791514112L, 71904);
        return false;
      }
    }, false);
    this.mAQ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9660320972800L, 71975);
        k.this.aKV();
        GMTrace.o(9660320972800L, 71975);
        return false;
      }
    }, false);
    this.mAT = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9656026005504L, 71943);
        if (k.this.mAL == 3) {}
        for (int i = k.this.mAR.bsy();; i = k.this.mAR.bsz())
        {
          k localk = k.this;
          float f2 = i;
          float f1 = f2;
          if (f2 < 10.0F) {
            f1 = 10.0F;
          }
          f2 = f1;
          if (f1 > 100.0F) {
            f2 = 100.0F;
          }
          VolumeMeter localVolumeMeter = localk.mAE;
          f1 = f2 / 100.0F;
          localVolumeMeter.mBE = localVolumeMeter.mBF;
          localVolumeMeter.mBF = f1;
          localk.mAE.invalidate();
          GMTrace.o(9656026005504L, 71943);
          return true;
          if (bg.nm(k.this.mAI))
          {
            GMTrace.o(9656026005504L, 71943);
            return false;
          }
        }
      }
    }, true);
    this.mAU = true;
    this.activity = paramActivity;
    this.mAD = paramButton;
    this.mAF = ((RelativeLayout)this.activity.findViewById(R.h.cns));
    this.mAF.setVisibility(8);
    this.mAE = ((VolumeMeter)this.mAF.findViewById(R.h.cnt));
    this.mAE.mBA = this.mAD;
    paramActivity = this.mAE;
    if (paramActivity.mBD == null) {
      com.tencent.mm.sdk.f.e.d(new VolumeMeter.1(paramActivity), "VolumeMeter_handler", 1).start();
    }
    this.mAR = p.a.tlW;
    if (this.mAR == null) {
      w.e("MicroMsg.TalkMgr", "cannot get talkroom server");
    }
    GMTrace.o(9719242555392L, 72414);
  }
  
  public static void aKW()
  {
    GMTrace.i(9719779426304L, 72418);
    rb localrb = new rb();
    localrb.eVS.eVV = true;
    a.vgX.m(localrb);
    com.tencent.mm.compatible.b.e.sd().setMode(0);
    GMTrace.o(9719779426304L, 72418);
  }
  
  public final void Bt(String paramString)
  {
    GMTrace.i(9720450514944L, 72423);
    w.d("MicroMsg.TalkMgr", "onCurMember change %s", new Object[] { paramString });
    this.mAI = paramString;
    aKV();
    if (!bg.nm(paramString))
    {
      aq.C(ab.getContext(), R.l.eei);
      this.mAT.z(100L, 100L);
      GMTrace.o(9720450514944L, 72423);
      return;
    }
    this.mAT.stopTimer();
    GMTrace.o(9720450514944L, 72423);
  }
  
  public final void H(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(9720047861760L, 72420);
    w.f("MicroMsg.TalkMgr", "onInitFailed %s", new Object[] { paramString });
    l.aKn().pI(3);
    this.activity.finish();
    GMTrace.o(9720047861760L, 72420);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9721390039040L, 72430);
    GMTrace.o(9721390039040L, 72430);
  }
  
  public final void aKS()
  {
    GMTrace.i(9719376773120L, 72415);
    this.mAJ = this.activity.getIntent().getStringExtra("map_talker_name");
    this.mAR.a(this);
    w.d("MicroMsg.TalkMgr", "talkRoomName %s ", new Object[] { this.mAJ });
    final String str = this.mAJ;
    this.mAH = str;
    List localList;
    if (!bg.nm(this.mAH))
    {
      if (!s.eb(str)) {
        break label159;
      }
      localList = m.fi(str);
      if (localList != null) {
        break label151;
      }
      ak.a.gmX.K(str, "");
    }
    for (;;)
    {
      new ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9662334238720L, 71990);
          k.this.mAR.bX(str, 1);
          GMTrace.o(9662334238720L, 71990);
        }
      });
      this.mAD.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(9653341650944L, 71923);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(9653341650944L, 71923);
            return false;
            k.this.mAK = true;
            k.this.mAF.setVisibility(0);
            k.this.mAE.reset();
            paramAnonymousView = k.this.mAE;
            if (!paramAnonymousView.mBz)
            {
              paramAnonymousView.mBy = true;
              paramAnonymousView.aLi();
            }
            k.this.mAD.setPressed(true);
            if (k.this.mAK)
            {
              aq.b(ab.getContext(), R.l.eej, new aq.a()
              {
                public final void onCompletion()
                {
                  GMTrace.i(9655220699136L, 71937);
                  w.i("MicroMsg.TalkMgr", "play press sound end");
                  GMTrace.o(9655220699136L, 71937);
                }
              });
              k.this.mAL = 1;
              w.i("MicroMsg.TalkMgr", "micBtn pressed down");
              k.this.mAN = bg.Pw();
              k.this.mAR.bss();
              k.this.aKV();
              continue;
              if (k.this.mAK)
              {
                continue;
                k.this.mAD.setPressed(false);
                k.this.mAF.setVisibility(8);
                k.this.mAE.reset();
                k.this.mAE.mBy = false;
                if (k.this.mAK)
                {
                  k.this.mAK = false;
                  if (k.this.mAL == 5)
                  {
                    w.i("MicroMsg.TalkMgr", "cancel during seize-success prepare time");
                    k.this.mAO.stopTimer();
                    k.this.mAP.stopTimer();
                  }
                  k.this.mAL = 0;
                  k.this.mAT.stopTimer();
                  k.this.mAR.bst();
                  aq.C(ab.getContext(), R.l.eel);
                  k.this.aKV();
                  if (k.this.mAS != null) {
                    k.this.mAS.aKO();
                  }
                }
              }
            }
          }
        }
      });
      GMTrace.o(9719376773120L, 72415);
      return;
      label151:
      this.eNC = localList;
      continue;
      label159:
      this.eNC.clear();
      this.eNC.add(str);
      this.eNC.add(q.zE());
    }
  }
  
  public final void aKT()
  {
    GMTrace.i(9719510990848L, 72416);
    if (this.mAL != 5)
    {
      GMTrace.o(9719510990848L, 72416);
      return;
    }
    this.mAO.stopTimer();
    aKV();
    aq.b(ab.getContext(), R.l.eeh, new aq.a()
    {
      public final void onCompletion()
      {
        GMTrace.i(9651999473664L, 71913);
        k.this.mAP.stopTimer();
        k.this.aKU();
        GMTrace.o(9651999473664L, 71913);
      }
    });
    this.mAP.z(1000L, 1000L);
    GMTrace.o(9719510990848L, 72416);
  }
  
  public final void aKU()
  {
    GMTrace.i(16051769180160L, 119595);
    if (this.mAL != 5)
    {
      GMTrace.o(16051769180160L, 119595);
      return;
    }
    this.mAL = 3;
    this.mAR.bsb();
    this.mAT.z(100L, 100L);
    GMTrace.o(16051769180160L, 119595);
  }
  
  public final void aKV()
  {
    GMTrace.i(9719645208576L, 72417);
    if (this.mAG)
    {
      GMTrace.o(9719645208576L, 72417);
      return;
    }
    if (p.a.tlW.bsA())
    {
      w.d("MicroMsg.TalkMgr", "talkRoomServer pausing");
      if (this.mAS != null)
      {
        this.mAS.Br(null);
        this.mAS.aKO();
      }
    }
    switch (this.mAL)
    {
    }
    for (;;)
    {
      GMTrace.o(9719645208576L, 72417);
      return;
      w.d("MicroMsg.TalkMgr", "seize, state_idle, curUsername = %s", new Object[] { this.mAI });
      if (this.mAS != null)
      {
        if (!bg.nm(this.mAI))
        {
          this.mAS.Br(this.mAI);
          GMTrace.o(9719645208576L, 72417);
          return;
        }
        this.mAS.Br(null);
        GMTrace.o(9719645208576L, 72417);
        return;
        w.d("MicroMsg.TalkMgr", "seize, state seizing");
        if (this.mAS != null)
        {
          this.mAS.aKP();
          GMTrace.o(9719645208576L, 72417);
          return;
          w.d("MicroMsg.TalkMgr", "seize, state success or prepare");
          if (this.mAS != null)
          {
            this.mAS.aKN();
            GMTrace.o(9719645208576L, 72417);
            return;
            w.d("MicroMsg.TalkMgr", "seize error, curUsername = %s", new Object[] { this.mAI });
            if ((this.mAS != null) && (!bg.nm(this.mAI)))
            {
              this.mAS.Bs(this.mAI);
              GMTrace.o(9719645208576L, 72417);
              return;
              w.d("MicroMsg.TalkMgr", "seize time out");
            }
          }
        }
      }
    }
  }
  
  public final void aKX()
  {
    GMTrace.i(9719913644032L, 72419);
    this.mAG = false;
    this.mAD.setEnabled(true);
    aKV();
    GMTrace.o(9719913644032L, 72419);
  }
  
  public final void aKY()
  {
    GMTrace.i(9720182079488L, 72421);
    if (this.mAL != 1)
    {
      GMTrace.o(9720182079488L, 72421);
      return;
    }
    this.mAL = 5;
    if (bg.aI(this.mAN) < this.mAM)
    {
      w.i("MicroMsg.TalkMgr", "onSeizeMicSuccess waiting to execute");
      aj localaj = this.mAO;
      long l = this.mAM - bg.aI(this.mAN);
      localaj.z(l, l);
      GMTrace.o(9720182079488L, 72421);
      return;
    }
    aKT();
    GMTrace.o(9720182079488L, 72421);
  }
  
  public final void aKZ()
  {
    GMTrace.i(9720853168128L, 72426);
    GMTrace.o(9720853168128L, 72426);
  }
  
  public final void aLa()
  {
    GMTrace.i(9720987385856L, 72427);
    aKV();
    GMTrace.o(9720987385856L, 72427);
  }
  
  public final void aLb()
  {
    GMTrace.i(9721121603584L, 72428);
    aKV();
    GMTrace.o(9721121603584L, 72428);
  }
  
  public final void aLc()
  {
    GMTrace.i(9721255821312L, 72429);
    GMTrace.o(9721255821312L, 72429);
  }
  
  public final void cN(String paramString1, String paramString2)
  {
    GMTrace.i(9720584732672L, 72424);
    w.i("MicroMsg.TalkMgr", "add %s,  del %s", new Object[] { paramString1, paramString2 });
    if (this.mAG)
    {
      GMTrace.o(9720584732672L, 72424);
      return;
    }
    GMTrace.o(9720584732672L, 72424);
  }
  
  public final void l(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(9720718950400L, 72425);
    GMTrace.o(9720718950400L, 72425);
  }
  
  public final void pJ(int paramInt)
  {
    GMTrace.i(9720316297216L, 72422);
    w.i("MicroMsg.TalkMgr", "onSeizeMicFailed");
    if (paramInt == 340) {
      if (this.mAL != 3)
      {
        GMTrace.o(9720316297216L, 72422);
        return;
      }
    }
    for (this.mAL = 4;; this.mAL = 2)
    {
      aKV();
      aq.a(ab.getContext(), R.l.eek, null);
      GMTrace.o(9720316297216L, 72422);
      return;
      if (this.mAL != 1)
      {
        GMTrace.o(9720316297216L, 72422);
        return;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void Br(String paramString);
    
    public abstract void Bs(String paramString);
    
    public abstract void aKN();
    
    public abstract void aKO();
    
    public abstract void aKP();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */