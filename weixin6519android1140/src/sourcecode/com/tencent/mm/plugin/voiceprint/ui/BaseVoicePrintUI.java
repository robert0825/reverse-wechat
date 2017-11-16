package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.voiceprint.model.m;
import com.tencent.mm.plugin.voiceprint.model.p.1;
import com.tencent.mm.plugin.voiceprint.model.p.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.aq.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import java.io.File;

public abstract class BaseVoicePrintUI
  extends MMActivity
{
  private boolean mAK;
  private final aj mAT;
  Button qCA;
  View qCB;
  VoicePrintVolumeMeter qCC;
  VoiceTipInfoView qCD;
  com.tencent.mm.plugin.voiceprint.model.p qCE;
  String qCF;
  private boolean qCG;
  private View qCH;
  private boolean qCI;
  private final p.a qCJ;
  aj qCK;
  private ae qCL;
  String qCi;
  
  public BaseVoicePrintUI()
  {
    GMTrace.i(12516608442368L, 93256);
    this.qCE = null;
    this.mAK = false;
    this.qCF = null;
    this.qCi = null;
    this.qCG = false;
    this.qCI = false;
    this.qCJ = new p.a()
    {
      public final void btf()
      {
        GMTrace.i(12506542112768L, 93181);
        com.tencent.mm.plugin.voiceprint.model.p localp = BaseVoicePrintUI.a(BaseVoicePrintUI.this);
        if (localp.euT != null)
        {
          localp.euT.qn();
          w.e("MicroMsg.VoicePrintRecoder", "Reset recorder.stopReocrd");
        }
        localp.euR = "";
        localp.qCs = null;
        localp.qsy = 0;
        localp.lkz = 0L;
        if (localp.hez != null) {
          localp.hez.tx();
        }
        w.e("MicroMsg.BaseVoicePrintUI", "record stop on error");
        BaseVoicePrintUI.a(BaseVoicePrintUI.this, null);
        BaseVoicePrintUI.b(BaseVoicePrintUI.this);
        GMTrace.o(12506542112768L, 93181);
      }
    };
    this.mAT = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12527077425152L, 93334);
        if (BaseVoicePrintUI.a(BaseVoicePrintUI.this) == null)
        {
          GMTrace.o(12527077425152L, 93334);
          return true;
        }
        com.tencent.mm.plugin.voiceprint.model.p localp = BaseVoicePrintUI.a(BaseVoicePrintUI.this);
        if (localp.euT != null)
        {
          i = localp.euT.getMaxAmplitude();
          if (i > com.tencent.mm.plugin.voiceprint.model.p.ezm) {
            com.tencent.mm.plugin.voiceprint.model.p.ezm = i;
          }
          w.d("MicroMsg.VoicePrintRecoder", " map: " + i + " max:" + com.tencent.mm.plugin.voiceprint.model.p.ezm + " per:" + i * 100 / com.tencent.mm.plugin.voiceprint.model.p.ezm);
        }
        for (int i = i * 100 / com.tencent.mm.plugin.voiceprint.model.p.ezm;; i = 0)
        {
          BaseVoicePrintUI.a(BaseVoicePrintUI.this, i);
          GMTrace.o(12527077425152L, 93334);
          return true;
        }
      }
    }, true);
    this.qCK = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12504797282304L, 93168);
        Object localObject2 = BaseVoicePrintUI.c(BaseVoicePrintUI.this);
        if (((VoiceTipInfoView)localObject2).qDi.getAnimation() == null)
        {
          TextView localTextView = ((VoiceTipInfoView)localObject2).qDi;
          Object localObject1 = ((VoiceTipInfoView)localObject2).getContext();
          localObject2 = new VoiceTipInfoView.1((VoiceTipInfoView)localObject2);
          float f = localTextView.getWidth();
          w.d("MicroMsg.VoiceViewAnimationHelper", "target " + f);
          int[] arrayOfInt = new int[2];
          localTextView.getLocationInWindow(arrayOfInt);
          int i = (int)(f + arrayOfInt[0]);
          w.d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(i) });
          localObject1 = AnimationUtils.loadAnimation((Context)localObject1, R.a.aMe);
          ((Animation)localObject1).setDuration(200L);
          ((Animation)localObject1).setStartOffset(0L);
          ((Animation)localObject1).setRepeatCount(0);
          ((Animation)localObject1).setFillAfter(true);
          ((Animation)localObject1).setAnimationListener(new a.1((a.a)localObject2));
          localTextView.startAnimation((Animation)localObject1);
        }
        GMTrace.o(12504797282304L, 93168);
        return false;
      }
    }, true);
    this.qCL = new ae(Looper.getMainLooper(), new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12523990417408L, 93311);
        if (paramAnonymousMessage.what == 1)
        {
          w.d("MicroMsg.BaseVoicePrintUI", "start record");
          aq.b(ab.getContext(), R.l.eej, new aq.a()
          {
            public final void onCompletion()
            {
              GMTrace.i(12534459400192L, 93389);
              w.i("MicroMsg.BaseVoicePrintUI", "play press sound end");
              GMTrace.o(12534459400192L, 93389);
            }
          });
          BaseVoicePrintUI.a(BaseVoicePrintUI.this, "voice_pt_voice_print_record.rec");
          paramAnonymousMessage = BaseVoicePrintUI.a(BaseVoicePrintUI.this);
          Object localObject = BaseVoicePrintUI.d(BaseVoicePrintUI.this);
          BaseVoicePrintUI localBaseVoicePrintUI = BaseVoicePrintUI.this;
          paramAnonymousMessage.euR = ((String)localObject);
          w.d("MicroMsg.VoicePrintRecoder", "start filename %s", new Object[] { paramAnonymousMessage.euR });
          at.AS().a(paramAnonymousMessage);
          int i = at.AS().sf();
          paramAnonymousMessage.qsv = false;
          paramAnonymousMessage.hez = new b(localBaseVoicePrintUI);
          if (i != 0)
          {
            paramAnonymousMessage.dc(100);
            BaseVoicePrintUI.e(BaseVoicePrintUI.this).z(100L, 100L);
            paramAnonymousMessage = BaseVoicePrintUI.this;
            paramAnonymousMessage.qCD.btx();
            localObject = paramAnonymousMessage.qCD;
            w.d("MicroMsg.VoiceTipInfoView", "hideTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", new Object[] { Integer.valueOf(((VoiceTipInfoView)localObject).izE.getVisibility()), Boolean.valueOf(((VoiceTipInfoView)localObject).qDI) });
            if ((((VoiceTipInfoView)localObject).izE.getVisibility() != 0) || (((VoiceTipInfoView)localObject).qDI)) {
              break label368;
            }
            ((VoiceTipInfoView)localObject).izE.clearAnimation();
            ((VoiceTipInfoView)localObject).qDI = true;
            a.a(((VoiceTipInfoView)localObject).izE, ((VoiceTipInfoView)localObject).getContext(), new VoiceTipInfoView.3((VoiceTipInfoView)localObject));
          }
          for (;;)
          {
            paramAnonymousMessage.qCD.JN(paramAnonymousMessage.qCi);
            paramAnonymousMessage.qCK.stopTimer();
            paramAnonymousMessage.qCK.z(500L, 500L);
            paramAnonymousMessage.qCB.setVisibility(0);
            paramAnonymousMessage = paramAnonymousMessage.qCC;
            paramAnonymousMessage.reset();
            paramAnonymousMessage.mIsPlaying = true;
            localObject = paramAnonymousMessage.qDq;
            long l = VoicePrintVolumeMeter.mBM;
            ((aj)localObject).z(l, l);
            paramAnonymousMessage.btq();
            GMTrace.o(12523990417408L, 93311);
            return true;
            new p.1(paramAnonymousMessage).sendEmptyMessageDelayed(0, 50L);
            break;
            label368:
            w.d("MicroMsg.VoiceTipInfoView", "hideTitle, directly set to INVISIBLE");
            ((VoiceTipInfoView)localObject).izE.clearAnimation();
            ((VoiceTipInfoView)localObject).izE.setVisibility(4);
            ((VoiceTipInfoView)localObject).izE.invalidate();
          }
        }
        GMTrace.o(12523990417408L, 93311);
        return false;
      }
    });
    GMTrace.o(12516608442368L, 93256);
  }
  
  protected abstract void aLn();
  
  protected final void btg()
  {
    GMTrace.i(12516876877824L, 93258);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12524795723776L, 93317);
        if (!BaseVoicePrintUI.h(BaseVoicePrintUI.this)) {
          BaseVoicePrintUI.i(BaseVoicePrintUI.this);
        }
        GMTrace.o(12524795723776L, 93317);
      }
    }, 1300L);
    GMTrace.o(12516876877824L, 93258);
  }
  
  protected final void bth()
  {
    GMTrace.i(12517011095552L, 93259);
    if ((this.qCH.getVisibility() == 4) || (this.qCH.getVisibility() == 8))
    {
      GMTrace.o(12517011095552L, 93259);
      return;
    }
    if (this.qCI)
    {
      this.qCH.setVisibility(4);
      GMTrace.o(12517011095552L, 93259);
      return;
    }
    this.qCI = true;
    a.a(this.qCH, this, new a.a()
    {
      public final void btk()
      {
        GMTrace.i(12511239733248L, 93216);
        GMTrace.o(12511239733248L, 93216);
      }
      
      public final void btl()
      {
        GMTrace.i(12511373950976L, 93217);
        BaseVoicePrintUI.j(BaseVoicePrintUI.this).setVisibility(4);
        BaseVoicePrintUI.k(BaseVoicePrintUI.this);
        GMTrace.o(12511373950976L, 93217);
      }
    });
    GMTrace.o(12517011095552L, 93259);
  }
  
  protected final void bti()
  {
    GMTrace.i(12517413748736L, 93262);
    wa(R.l.egR);
    GMTrace.o(12517413748736L, 93262);
  }
  
  protected abstract void btj();
  
  protected final int getLayoutId()
  {
    GMTrace.i(12517145313280L, 93260);
    int i = R.i.cHx;
    GMTrace.o(12517145313280L, 93260);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12516742660096L, 93257);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.qCD = ((VoiceTipInfoView)findViewById(R.h.cht));
    this.qCA = ((Button)findViewById(R.h.bXq));
    this.qCB = findViewById(R.h.cns);
    this.qCC = ((VoicePrintVolumeMeter)findViewById(R.h.cnt));
    this.qCH = findViewById(R.h.biI);
    this.qCD.btx();
    this.qCC.mBA = this.qCA;
    this.qCE = new com.tencent.mm.plugin.voiceprint.model.p();
    this.qCE.qCv = this.qCJ;
    this.qCA.setOnTouchListener(new View.OnTouchListener()
    {
      private long mBs;
      private boolean qCO;
      
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12530701303808L, 93361);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(12530701303808L, 93361);
          return false;
          BaseVoicePrintUI.a(BaseVoicePrintUI.this, false);
          if (!bg.nm(BaseVoicePrintUI.this.qCi))
          {
            this.mBs = System.currentTimeMillis();
            BaseVoicePrintUI.f(BaseVoicePrintUI.this).setPressed(true);
            BaseVoicePrintUI.l(BaseVoicePrintUI.this);
            BaseVoicePrintUI.this.bth();
            BaseVoicePrintUI.m(BaseVoicePrintUI.this).sendEmptyMessageDelayed(1, 300L);
            w.i("MicroMsg.BaseVoicePrintUI", "mic press down");
            continue;
            BaseVoicePrintUI.f(BaseVoicePrintUI.this).setPressed(false);
            BaseVoicePrintUI.m(BaseVoicePrintUI.this).removeMessages(1);
            if (System.currentTimeMillis() - this.mBs < 300L)
            {
              w.d("MicroMsg.BaseVoicePrintUI", "just little touch the button, set touchDown to false");
              BaseVoicePrintUI.a(BaseVoicePrintUI.this, false);
            }
            for (;;)
            {
              w.i("MicroMsg.BaseVoicePrintUI", "mic press up %d, hasTouchDown:%b", new Object[] { Integer.valueOf(paramAnonymousMotionEvent.getAction()), Boolean.valueOf(BaseVoicePrintUI.n(BaseVoicePrintUI.this)) });
              BaseVoicePrintUI.g(BaseVoicePrintUI.this).stop();
              BaseVoicePrintUI.e(BaseVoicePrintUI.this).stopTimer();
              BaseVoicePrintUI.a(BaseVoicePrintUI.this).qt();
              if (BaseVoicePrintUI.n(BaseVoicePrintUI.this)) {
                break label300;
              }
              BaseVoicePrintUI.c(BaseVoicePrintUI.this).wc(R.l.egO);
              BaseVoicePrintUI.c(BaseVoicePrintUI.this).btw();
              break;
              BaseVoicePrintUI.a(BaseVoicePrintUI.this, true);
            }
            label300:
            paramAnonymousView = BaseVoicePrintUI.this;
            w.d("MicroMsg.BaseVoicePrintUI", "releaseMic");
            if (!paramAnonymousView.qCE.qCu)
            {
              paramAnonymousView.qCK.stopTimer();
              paramAnonymousView.qCD.wc(R.l.egO);
              paramAnonymousView.qCD.btw();
              paramAnonymousView.qCF = null;
            }
            paramAnonymousView.qCB.setVisibility(8);
            paramAnonymousView.qCD.btu();
            paramAnonymousView.qCD.JN(paramAnonymousView.qCi);
            w.d("MicroMsg.BaseVoicePrintUI", "localMsgFileName %s", new Object[] { BaseVoicePrintUI.d(BaseVoicePrintUI.this) });
            if (!bg.nm(BaseVoicePrintUI.d(BaseVoicePrintUI.this))) {
              BaseVoicePrintUI.this.btj();
            }
            this.mBs = 0L;
            this.qCO = false;
            BaseVoicePrintUI.a(BaseVoicePrintUI.this, false);
          }
        }
      }
    });
    findViewById(R.h.bJU).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12537546407936L, 93412);
        BaseVoicePrintUI.this.finish();
        GMTrace.o(12537546407936L, 93412);
      }
    });
    aLn();
    GMTrace.o(12516742660096L, 93257);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12517279531008L, 93261);
    super.onDestroy();
    Object localObject = this.qCC;
    ((VoicePrintVolumeMeter)localObject).qDq.stopTimer();
    ((VoicePrintVolumeMeter)localObject).qDp.ngv.getLooper().quit();
    w.d("MicroMsg.VoicePrintVolumeMeter", "destroy, quit factor thread");
    w.d("MicroMsg.VoicePrintLogic", "delete voiceprint voice file");
    localObject = new File(m.aA("voice_pt_voice_print_record.rec", false));
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    localObject = new File(m.aA("voice_pt_voice_print_noise_detect.rec", false));
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    GMTrace.o(12517279531008L, 93261);
  }
  
  protected final void wa(int paramInt)
  {
    GMTrace.i(12517547966464L, 93263);
    this.qCD.btt();
    this.qCD.wc(paramInt);
    this.qCD.btw();
    GMTrace.o(12517547966464L, 93263);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\BaseVoicePrintUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */