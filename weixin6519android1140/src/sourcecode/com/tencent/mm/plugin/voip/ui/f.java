package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.voip.b.b;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.r;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public final class f
  extends d
{
  public boolean mIsMute;
  private Timer mTimer;
  private TextView muc;
  public int qHl;
  private Button qLX;
  private boolean qMB;
  private View.OnClickListener qMM;
  private View.OnClickListener qMN;
  private Runnable qMS;
  private View qMZ;
  private boolean qMz;
  private ImageView qNa;
  private TextView qNb;
  public TextView qNc;
  public TextView qNd;
  public TextView qNe;
  public View qNf;
  private RelativeLayout qNg;
  public MMCheckBox qNh;
  private TextView qNi;
  private RelativeLayout qNj;
  public MMCheckBox qNk;
  private TextView qNl;
  public TextView qNm;
  private TextView qNn;
  public VoipBigIconButton qNo;
  public VoipBigIconButton qNp;
  public VoipBigIconButton qNq;
  public VoipBigIconButton qNr;
  private VoipSmallIconButton qNs;
  private View.OnClickListener qNt;
  private View.OnClickListener qNu;
  private View.OnClickListener qNv;
  private View.OnClickListener qNw;
  private View.OnClickListener qNx;
  private View.OnClickListener qNy;
  
  public f()
  {
    GMTrace.i(5343476187136L, 39812);
    this.qHl = 1;
    this.mIsMute = false;
    this.qMz = false;
    this.qMB = false;
    this.qMM = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5341462921216L, 39797);
        g.ork.i(11618, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null)) {
          ((c)f.this.qKZ.get()).ix(true);
        }
        if (f.this.qLq != null) {
          f.this.qLq.x(false, true);
        }
        GMTrace.o(5341462921216L, 39797);
      }
    };
    this.qMN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5333678292992L, 39739);
        g.ork.i(11619, new Object[] { Integer.valueOf(3) });
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null)) {
          ((c)f.this.qKZ.get()).buz();
        }
        GMTrace.o(5333678292992L, 39739);
      }
    };
    this.qNt = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5372332998656L, 40027);
        boolean bool = f.this.qNh.isChecked();
        w.i("MicroMsg.VoipVoiceFragment", "onSpeakerClick, status: %b", new Object[] { Boolean.valueOf(bool) });
        f.this.qNh.setEnabled(false);
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null)) {
          ((c)f.this.qKZ.get()).iw(bool);
        }
        paramAnonymousView = f.this;
        if (bool) {}
        for (int i = 1;; i = 2)
        {
          paramAnonymousView.qHl = i;
          f.this.qNh.setEnabled(true);
          GMTrace.o(5372332998656L, 40027);
          return;
        }
      }
    };
    this.qNu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5343073533952L, 39809);
        boolean bool = f.this.qNk.isChecked();
        w.i("MicroMsg.VoipVoiceFragment", "onMicClick, status: %b", new Object[] { Boolean.valueOf(bool) });
        f.this.qNk.setEnabled(false);
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null)) {
          ((c)f.this.qKZ.get()).gg(bool);
        }
        f.this.mIsMute = bool;
        f.this.qNk.setEnabled(true);
        GMTrace.o(5343073533952L, 39809);
      }
    };
    this.qNv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5355555782656L, 39902);
        w.i("MicroMsg.VoipVoiceFragment", "click accept voice invite button");
        g.ork.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buK()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buL()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buM()), Integer.valueOf(2) });
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null) && (((c)f.this.qKZ.get()).buj()))
        {
          f.this.qNo.setEnabled(false);
          f.this.qNd.setText(R.l.ejp);
          f.this.qLr.a(f.this.qNe, d.qLl);
          f.this.qNf.setVisibility(0);
          f.this.qNc.setVisibility(8);
          f.this.qNo.setVisibility(8);
          f.this.qNp.setVisibility(8);
          f.this.qNq.setVisibility(0);
        }
        GMTrace.o(5355555782656L, 39902);
      }
    };
    this.qNw = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5372064563200L, 40025);
        w.i("MicroMsg.VoipVoiceFragment", "click reject voice invite button");
        g.ork.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buK()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buL()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buM()), Integer.valueOf(5) });
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null) && (((c)f.this.qKZ.get()).bui()))
        {
          f.this.qNp.setEnabled(false);
          f.this.qNo.setEnabled(false);
          f.this.ca(f.this.getString(R.l.eiU), -1);
          if (f.this.qLq != null) {
            f.this.qLq.x(true, false);
          }
        }
        GMTrace.o(5372064563200L, 40025);
      }
    };
    this.qNx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5366427418624L, 39983);
        w.i("MicroMsg.VoipVoiceFragment", "click hangup voice talking button");
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null) && (((c)f.this.qKZ.get()).bue())) {
          f.this.ca(f.this.getString(R.l.eiv), -1);
        }
        GMTrace.o(5366427418624L, 39983);
      }
    };
    this.qNy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5363340410880L, 39960);
        w.i("MicroMsg.VoipVoiceFragment", "click cancel voice invite button");
        if ((f.this.qKZ != null) && (f.this.qKZ.get() != null) && (((c)f.this.qKZ.get()).bul()))
        {
          f.this.ca(f.this.getString(R.l.ehH), -1);
          f.this.qNr.setEnabled(false);
        }
        GMTrace.o(5363340410880L, 39960);
      }
    };
    this.qMS = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5358911225856L, 39927);
        if ((f.this.aG() == null) || (f.this.aG().isFinishing()))
        {
          GMTrace.o(5358911225856L, 39927);
          return;
        }
        f.this.qNm.setVisibility(8);
        GMTrace.o(5358911225856L, 39927);
      }
    };
    GMTrace.o(5343476187136L, 39812);
  }
  
  private void bvF()
  {
    boolean bool = false;
    GMTrace.i(5345355235328L, 39826);
    if ((this.qNh == null) || (this.qNi == null))
    {
      w.e("MicroMsg.VoipVoiceFragment", "speaker is null");
      GMTrace.o(5345355235328L, 39826);
      return;
    }
    if ((4 == this.qHl) || (3 == this.qHl))
    {
      this.qNh.setEnabled(false);
      this.qNi.setTextColor(1728053247);
      this.qNh.setBackgroundResource(R.g.bbR);
      GMTrace.o(5345355235328L, 39826);
      return;
    }
    if (this.qHl == 1) {
      bool = true;
    }
    this.qNh.setBackgroundResource(R.g.bbT);
    this.qNh.setEnabled(true);
    this.qNi.setTextColor(-1);
    this.qNh.setChecked(bool);
    GMTrace.o(5345355235328L, 39826);
  }
  
  protected final void JP(String paramString)
  {
    GMTrace.i(14695499038720L, 109490);
    if (this.qNn != null)
    {
      this.qNn.setVisibility(0);
      this.qNn.setText(paramString);
    }
    GMTrace.o(14695499038720L, 109490);
  }
  
  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5344952582144L, 39823);
    GMTrace.o(5344952582144L, 39823);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(5344818364416L, 39822);
    GMTrace.o(5344818364416L, 39822);
  }
  
  public final void b(CaptureView paramCaptureView)
  {
    GMTrace.i(5344013058048L, 39816);
    GMTrace.o(5344013058048L, 39816);
  }
  
  public final void buu()
  {
    GMTrace.i(5345086799872L, 39824);
    GMTrace.o(5345086799872L, 39824);
  }
  
  protected final void bvw()
  {
    GMTrace.i(5344415711232L, 39819);
    if (this.muc != null)
    {
      this.muc.clearAnimation();
      this.muc.setVisibility(0);
    }
    GMTrace.o(5344415711232L, 39819);
  }
  
  protected final void bvx()
  {
    GMTrace.i(5344549928960L, 39820);
    if (this.muc != null)
    {
      this.muc.clearAnimation();
      this.muc.setVisibility(8);
    }
    GMTrace.o(5344549928960L, 39820);
  }
  
  protected final void ca(String paramString, int paramInt)
  {
    GMTrace.i(5344281493504L, 39818);
    if (this.qNm == null)
    {
      GMTrace.o(5344281493504L, 39818);
      return;
    }
    this.qNm.setText(bg.nl(paramString));
    this.qNm.setVisibility(0);
    this.qNm.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.qNm.setBackgroundResource(R.g.bbU);
    this.qNm.setCompoundDrawables(null, null, null, null);
    this.qNm.setCompoundDrawablePadding(0);
    this.iAX.removeCallbacks(this.qMS);
    if (-1 != paramInt) {
      this.iAX.postDelayed(this.qMS, paramInt);
    }
    GMTrace.o(5344281493504L, 39818);
  }
  
  public final void dq(int paramInt1, int paramInt2)
  {
    GMTrace.i(5343878840320L, 39815);
    super.dq(paramInt1, paramInt2);
    w.i("MicroMsg.VoipVoiceFragment", "newState: " + b.wy(paramInt2));
    if (this.qLm == null)
    {
      w.i("MicroMsg.VoipVoiceFragment", "fragment no create, return first, onCreateView will call it again");
      GMTrace.o(5343878840320L, 39815);
      return;
    }
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qMZ.setVisibility(0);
      this.qNc.setVisibility(8);
      this.qNd.setText(R.l.eiS);
      this.qLr.a(this.qNe, qLl);
      this.qNf.setVisibility(0);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNq.setVisibility(8);
      this.qNr.setVisibility(0);
      this.qNs.setVisibility(8);
      this.qNj.setVisibility(0);
      this.qNk.setEnabled(false);
      this.qNk.setBackgroundResource(R.g.bbX);
      this.qNl.setTextColor(1728053247);
      this.qNn.setVisibility(8);
      if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
      {
        this.qNn.setVisibility(0);
        this.qNn.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
      }
      bvF();
      this.qNk.setChecked(this.mIsMute);
      this.qNg.setVisibility(0);
      if (2 == this.qHl) {
        ca(getString(R.l.eho), 10000);
      }
      bvy();
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qMZ.setVisibility(0);
      this.qNc.setVisibility(8);
      this.qNd.setText(R.l.eiH);
      this.qLr.a(this.qNe, qLl);
      this.qNf.setVisibility(0);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNq.setVisibility(8);
      this.qNr.setVisibility(0);
      this.qNs.setVisibility(8);
      this.qNj.setVisibility(0);
      this.qNk.setEnabled(false);
      this.qNk.setBackgroundResource(R.g.bbX);
      this.qNl.setTextColor(1728053247);
      bvF();
      this.qNk.setChecked(this.mIsMute);
      this.qNg.setVisibility(0);
      if ((paramInt1 != 4097) && (2 == this.qHl)) {
        ca(getString(R.l.eho), 10000);
      }
      bvy();
      this.qNn.setVisibility(8);
      if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
      {
        this.qNn.setVisibility(0);
        this.qNn.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
      }
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qNd.setText(R.l.ejp);
      this.qLr.a(this.qNe, qLl);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNq.setVisibility(0);
      this.qNr.setVisibility(8);
      this.qNs.setVisibility(8);
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qNr.setVisibility(8);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNs.setVisibility(8);
      this.qNf.setVisibility(8);
      this.qLr.bvA();
      this.qNq.setVisibility(0);
      this.qNc.setVisibility(0);
      this.qNj.setVisibility(0);
      this.qNg.setVisibility(0);
      this.qMZ.setVisibility(0);
      this.qLX.setVisibility(0);
      this.qNk.setEnabled(true);
      this.qNk.setBackgroundResource(R.g.bbS);
      this.qNl.setTextColor(-1);
      bvF();
      this.qNk.setChecked(this.mIsMute);
      if (2 == this.qHl) {
        ca(getString(R.l.eho), 10000);
      }
      bvy();
      if ((this.mTimer == null) || (this.qMz)) {}
      for (;;)
      {
        this.qNn.setVisibility(8);
        if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
        {
          this.qNn.setVisibility(0);
          this.qNn.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
        }
        GMTrace.o(5343878840320L, 39815);
        return;
        if (-1L == this.qLb) {
          this.qLb = bg.Pu();
        }
        this.qMz = true;
        TimerTask local2 = new TimerTask()
        {
          public final void run()
          {
            GMTrace.i(5358374354944L, 39923);
            f.this.iAX.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5359179661312L, 39929);
                String str = f.ax(bg.aG(f.this.qLb));
                f.this.qNc.setText(str);
                GMTrace.o(5359179661312L, 39929);
              }
            });
            GMTrace.o(5358374354944L, 39923);
          }
        };
        this.mTimer.schedule(local2, 50L, 1000L);
      }
      this.qLr.bvA();
      this.qNq.setEnabled(false);
      this.qNr.setEnabled(false);
      this.qNo.setEnabled(false);
      this.qNp.setEnabled(false);
      this.qNs.setEnabled(false);
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qMZ.setVisibility(0);
      this.qNf.setVisibility(0);
      this.qNd.setText(R.l.eiI);
      this.qLr.a(this.qNe, qLl);
      bvF();
      this.qNo.setVisibility(0);
      this.qNp.setVisibility(0);
      this.qNq.setVisibility(8);
      this.qNr.setVisibility(8);
      if (this.qMB) {
        this.qNs.setVisibility(0);
      }
      ca(getString(R.l.ehp), 10000);
      bvy();
      this.qNn.setVisibility(8);
      if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
      {
        this.qNn.setVisibility(0);
        this.qNn.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
      }
      GMTrace.o(5343878840320L, 39815);
      return;
      this.qMZ.setVisibility(0);
      this.qNf.setVisibility(0);
      this.qNd.setText(R.l.ejp);
      this.qLr.a(this.qNe, qLl);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNq.setVisibility(0);
      this.qNr.setVisibility(8);
      this.qNs.setVisibility(8);
      ca(getString(R.l.ehp), 10000);
      bvy();
    }
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(5343744622592L, 39814);
    paramBundle = new DisplayMetrics();
    ((WindowManager)paramLayoutInflater.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(paramBundle);
    w.i("MicroMsg.VoipVoiceFragment", "dpi: " + paramBundle.heightPixels / paramBundle.density);
    if (paramBundle.heightPixels / paramBundle.density <= 540.0F)
    {
      this.qLm = ((RelativeLayout)paramLayoutInflater.inflate(R.i.cHI, paramViewGroup, false));
      this.qLn = ((ImageView)this.qLm.findViewById(R.h.cmi));
      this.qMZ = this.qLm.findViewById(R.h.cmZ);
      this.qNa = ((ImageView)this.qLm.findViewById(R.h.cnl));
      a.b.a(this.qNa, this.fKP, 0.0375F, true);
      this.qNb = ((TextView)this.qLm.findViewById(R.h.cnm));
      this.qNb.setText(h.b(aG(), r.fs(this.fKP), this.qNb.getTextSize()));
      this.qNc = ((TextView)this.qLm.findViewById(R.h.cnr));
      this.qNd = ((TextView)this.qLm.findViewById(R.h.cnd));
      this.qNe = ((TextView)this.qLm.findViewById(R.h.cnf));
      this.qNf = this.qLm.findViewById(R.h.cne);
      this.qNm = ((TextView)this.qLm.findViewById(R.h.cna));
      this.qNn = ((TextView)this.qLm.findViewById(R.h.cnn));
      this.muc = ((TextView)this.qLm.findViewById(R.h.cmC));
      b(this.qNe, getResources().getString(R.l.eja));
      this.qNj = ((RelativeLayout)this.qLm.findViewById(R.h.cnh));
      this.qNk = ((MMCheckBox)this.qLm.findViewById(R.h.cng));
      this.qNk.setChecked(this.mIsMute);
      this.qNl = ((TextView)this.qLm.findViewById(R.h.cni));
      this.qNl.setText(R.l.eiK);
      this.qNg = ((RelativeLayout)this.qLm.findViewById(R.h.cnp));
      this.qNh = ((MMCheckBox)this.qLm.findViewById(R.h.cno));
      this.qNi = ((TextView)this.qLm.findViewById(R.h.cnq));
      this.qNi.setText(R.l.eiY);
      bvF();
      this.qNo = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmY));
      this.qNo.setOnClickListener(this.qNv);
      this.qNp = ((VoipBigIconButton)this.qLm.findViewById(R.h.cnk));
      this.qNp.setOnClickListener(this.qNw);
      this.qNq = ((VoipBigIconButton)this.qLm.findViewById(R.h.cnc));
      this.qNq.setOnClickListener(this.qNx);
      this.qNr = ((VoipBigIconButton)this.qLm.findViewById(R.h.cnb));
      this.qNr.setOnClickListener(this.qNy);
      if (com.tencent.mm.plugin.voip.b.d.na("VOIPBlockIgnoreButton") != 0) {
        break label875;
      }
    }
    label875:
    for (boolean bool = true;; bool = false)
    {
      this.qMB = bool;
      this.qNs = ((VoipSmallIconButton)this.qLm.findViewById(R.h.cmA));
      this.qNs.setOnClickListener(this.qMN);
      if (!this.qMB) {
        this.qNs.setVisibility(8);
      }
      this.qNh.setOnClickListener(this.qNt);
      this.qNk.setOnClickListener(this.qNu);
      this.qLX = ((Button)this.qLm.findViewById(R.h.biE));
      this.qLX.setOnClickListener(this.qMM);
      int i = u.fq(aG());
      w.d("MicroMsg.VoipVoiceFragment", "statusHeight: " + i);
      E(this.qLX, i);
      if ((this.qHg) && (2 == this.qHl)) {
        ca(getString(R.l.eho), 10000);
      }
      this.mTimer = new Timer();
      dq(this.qLp, this.mStatus);
      paramLayoutInflater = this.qLm;
      GMTrace.o(5343744622592L, 39814);
      return paramLayoutInflater;
      this.qLm = ((RelativeLayout)paramLayoutInflater.inflate(R.i.cHH, paramViewGroup, false));
      if (!Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
        break;
      }
      ((RelativeLayout)this.qLm.findViewById(R.h.bYU)).setPadding(0, 0, 0, BackwardSupportUtil.b.a(aG(), 40.0F));
      break;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5343610404864L, 39813);
    this.qMz = false;
    super.onDestroy();
    GMTrace.o(5343610404864L, 39813);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(5344684146688L, 39821);
    this.mIsMute = paramBoolean;
    if ((this.qNk != null) && (this.qNl != null)) {
      this.qNk.setChecked(paramBoolean);
    }
    GMTrace.o(5344684146688L, 39821);
  }
  
  public final void uninit()
  {
    GMTrace.i(5344147275776L, 39817);
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    super.uninit();
    GMTrace.o(5344147275776L, 39817);
  }
  
  public final void wu(int paramInt)
  {
    GMTrace.i(5345221017600L, 39825);
    this.qHl = paramInt;
    bvF();
    GMTrace.o(5345221017600L, 39825);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */