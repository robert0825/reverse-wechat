package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.voiceprint.model.f;
import com.tencent.mm.plugin.voiceprint.model.l;
import com.tencent.mm.plugin.voiceprint.model.l.a;
import com.tencent.mm.plugin.voiceprint.model.m;
import com.tencent.mm.plugin.voiceprint.model.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public class VoiceCreateUI
  extends BaseVoicePrintUI
  implements l.a
{
  private l qCW;
  private o qCX;
  private View qCY;
  private NoiseDetectMaskView qCZ;
  private int qCh;
  private View qDa;
  private Button qDb;
  private int qDc;
  private c qDd;
  
  public VoiceCreateUI()
  {
    GMTrace.i(12508152725504L, 93193);
    this.qCX = null;
    this.qDa = null;
    this.qDb = null;
    this.qCh = 1;
    this.qDc = 0;
    this.qDd = new c() {};
    GMTrace.o(12508152725504L, 93193);
  }
  
  private void btp()
  {
    GMTrace.i(12509226467328L, 93201);
    Intent localIntent = new Intent();
    localIntent.putExtra("KIsCreateSuccess", false);
    setResult(-1, localIntent);
    GMTrace.o(12509226467328L, 93201);
  }
  
  private void start()
  {
    GMTrace.i(12508555378688L, 93196);
    w.d("MicroMsg.VoiceCreateUI", "start create");
    this.qCX.reset();
    Object localObject = this.qCZ;
    if (((NoiseDetectMaskView)localObject).ktM != null) {
      ((NoiseDetectMaskView)localObject).ktM.setVisibility(0);
    }
    ((NoiseDetectMaskView)localObject).qCP.setText(R.l.egS);
    ((NoiseDetectMaskView)localObject).qCQ.setVisibility(8);
    w.d("MicroMsg.VoiceCreateUI", "start noise detect");
    this.qDa.setVisibility(4);
    this.qCY.setVisibility(4);
    this.qCB.setVisibility(4);
    this.qCZ.setVisibility(0);
    localObject = this.qCX;
    w.d("MicroMsg.VoicePrintNoiseDetector", "start detect noise");
    ((o)localObject).reset();
    String str = m.aA("voice_pt_voice_print_noise_detect.rec", true);
    if (!((o)localObject).qCn.bR(str))
    {
      ((o)localObject).qCn.qn();
      ((o)localObject).reset();
      w.d("MicroMsg.VoicePrintNoiseDetector", "start record fail");
    }
    for (;;)
    {
      ((o)localObject).qCo.z(100L, 100L);
      GMTrace.o(12508555378688L, 93196);
      return;
      w.d("MicroMsg.VoicePrintNoiseDetector", "start record");
    }
  }
  
  public final void JK(String paramString)
  {
    GMTrace.i(12508689596416L, 93197);
    w.d("MicroMsg.VoiceCreateUI", "onGetFirstText");
    btg();
    this.qCi = paramString;
    this.qCD.btt();
    this.qCD.btu();
    this.qCD.JN(paramString);
    this.qCA.setEnabled(true);
    GMTrace.o(12508689596416L, 93197);
  }
  
  public final void JL(String paramString)
  {
    GMTrace.i(12508823814144L, 93198);
    w.d("MicroMsg.VoiceCreateUI", "onGetSecondText");
    this.qCi = paramString;
    this.qCD.btt();
    this.qCD.btu();
    this.qCD.JN(paramString);
    this.qCA.setEnabled(true);
    GMTrace.o(12508823814144L, 93198);
  }
  
  protected final void aLn()
  {
    GMTrace.i(12508421160960L, 93195);
    this.qCW = new l(this);
    findViewById(R.h.bYP).setVisibility(8);
    this.qCD.wb(R.l.egV);
    this.qCD.btv();
    this.qCA.setEnabled(false);
    this.qCX = new o();
    this.qCY = findViewById(R.h.cli);
    this.qCZ = ((NoiseDetectMaskView)findViewById(R.h.mask));
    this.qDa = findViewById(R.h.bJU);
    this.qDb = ((Button)findViewById(R.h.bYP));
    this.qDb.setVisibility(8);
    this.qDb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12530432868352L, 93359);
        VoiceCreateUI.this.bth();
        a.a(VoiceCreateUI.this.qCD, new a.a()
        {
          public final void btk()
          {
            GMTrace.i(12510837080064L, 93213);
            VoiceCreateUI.c(VoiceCreateUI.this).setVisibility(8);
            VoiceCreateUI.this.qCD.wb(R.l.egV);
            VoiceCreateUI.this.qCD.qDi.setVisibility(0);
            VoiceCreateUI.this.qCA.setEnabled(true);
            VoiceCreateUI.this.qCA.setVisibility(0);
            GMTrace.o(12510837080064L, 93213);
          }
          
          public final void btl()
          {
            GMTrace.i(12510971297792L, 93214);
            GMTrace.o(12510971297792L, 93214);
          }
        });
        GMTrace.o(12530432868352L, 93359);
      }
    });
    this.qCZ.qCR = new NoiseDetectMaskView.b()
    {
      public final void btn()
      {
        GMTrace.i(12532177698816L, 93372);
        g.ork.i(11390, new Object[] { Integer.valueOf(5) });
        VoiceCreateUI.d(VoiceCreateUI.this);
        GMTrace.o(12532177698816L, 93372);
      }
    };
    this.qCZ.qCS = new NoiseDetectMaskView.a()
    {
      public final void btm()
      {
        GMTrace.i(12537009537024L, 93408);
        VoiceCreateUI.e(VoiceCreateUI.this);
        o localo = VoiceCreateUI.f(VoiceCreateUI.this);
        w.d("MicroMsg.VoicePrintNoiseDetector", "stopDetect");
        localo.qCn.qn();
        localo.qCo.stopTimer();
        VoiceCreateUI.this.finish();
        GMTrace.o(12537009537024L, 93408);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.b(this.qDd);
    this.qDa.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12532446134272L, 93374);
        VoiceCreateUI.e(VoiceCreateUI.this);
        VoiceCreateUI.this.finish();
        GMTrace.o(12532446134272L, 93374);
      }
    });
    start();
    GMTrace.o(12508421160960L, 93195);
  }
  
  public final void btc()
  {
    GMTrace.i(12509092249600L, 93200);
    bti();
    btp();
    GMTrace.o(12509092249600L, 93200);
  }
  
  protected final void btj()
  {
    GMTrace.i(12508286943232L, 93194);
    w.d("MicroMsg.VoiceCreateUI", "sendVoice, filename:%s", new Object[] { this.qCF });
    if (!bg.nm(this.qCF))
    {
      this.qCA.setEnabled(false);
      this.qCD.bts();
      l locall;
      f localf;
      if (this.qCh == 1)
      {
        locall = this.qCW;
        localf = new f(this.qCF, 71, locall.qCj, 0);
        localf.qBP = true;
        at.wS().a(localf, 0);
        locall.qCh = 71;
        GMTrace.o(12508286943232L, 93194);
        return;
      }
      if (this.qCh == 2)
      {
        locall = this.qCW;
        localf = new f(this.qCF, 72, locall.qCj, locall.qBS);
        localf.qBP = true;
        at.wS().a(localf, 0);
        locall.qCh = 72;
      }
    }
    GMTrace.o(12508286943232L, 93194);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(12509494902784L, 93203);
    super.onBackPressed();
    btp();
    GMTrace.o(12509494902784L, 93203);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12509360685056L, 93202);
    super.onDestroy();
    l locall = this.qCW;
    at.wS().b(611, locall);
    at.wS().b(612, locall);
    locall.qCk = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.qDd);
    GMTrace.o(12509360685056L, 93202);
  }
  
  public final void s(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(12508958031872L, 93199);
    w.d("MicroMsg.VoiceCreateUI", "onCreate, result:%b, step:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      switch (paramInt)
      {
      }
      for (;;)
      {
        GMTrace.o(12508958031872L, 93199);
        return;
        w.d("MicroMsg.VoiceCreateUI", "finish create step 1");
        this.qCA.setEnabled(false);
        this.qCh = 2;
        bth();
        a.a(this.qCD, new a.a()
        {
          public final void btk()
          {
            GMTrace.i(12532714569728L, 93376);
            VoiceCreateUI.this.qCD.reset();
            VoiceCreateUI.this.qCD.btu();
            VoiceCreateUI.this.qCD.btv();
            VoiceCreateUI.this.qCA.setVisibility(4);
            VoiceCreateUI.this.qCD.wb(R.l.egT);
            VoiceCreateUI.c(VoiceCreateUI.this).setVisibility(0);
            VoiceCreateUI.this.qCD.btt();
            GMTrace.o(12532714569728L, 93376);
          }
          
          public final void btl()
          {
            GMTrace.i(12532848787456L, 93377);
            GMTrace.o(12532848787456L, 93377);
          }
        });
        GMTrace.o(12508958031872L, 93199);
        return;
        this.qDc = 0;
        w.d("MicroMsg.VoiceCreateUI", "finish create step 2");
        Intent localIntent = new Intent();
        localIntent.putExtra("KIsCreateSuccess", true);
        setResult(-1, localIntent);
        localIntent = new Intent();
        localIntent.setClass(this, VoicePrintFinishUI.class);
        localIntent.putExtra("kscene_type", 72);
        startActivity(localIntent);
        finish();
      }
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12508958031872L, 93199);
      return;
      GMTrace.o(12508958031872L, 93199);
      return;
      btp();
      this.qDc += 1;
      if (this.qDc >= 2)
      {
        w.d("MicroMsg.VoiceCreateUI", "in second step, verify two times failed");
        this.qDc = 0;
        startActivity(new Intent(this, VoiceReCreatePromptUI.class));
        overridePendingTransition(R.a.aMb, R.a.aMa);
        finish();
        GMTrace.o(12508958031872L, 93199);
        return;
      }
      this.qCA.setEnabled(true);
      this.qCD.btt();
      this.qCD.wc(R.l.egX);
      this.qCD.btw();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceCreateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */