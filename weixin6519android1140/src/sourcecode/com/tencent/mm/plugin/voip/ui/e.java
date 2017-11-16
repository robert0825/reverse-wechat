package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.voip.b.b;
import com.tencent.mm.plugin.voip.model.l;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.n;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.MovableVideoView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.plugin.voip.widget.VoIPVideoView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public final class e
  extends d
{
  private Timer mTimer;
  private TextView muc;
  int[] nng;
  Bitmap nnx;
  private CaptureView qHb;
  private OpenGlView qLJ;
  public OpenGlView qLK;
  private OpenGlRender qLL;
  private OpenGlRender qLM;
  private View qLN;
  private ImageView qLO;
  private TextView qLP;
  public TextView qLQ;
  public TextView qLR;
  private View qLS;
  public TextView qLT;
  public TextView qLU;
  private TextView qLV;
  private RelativeLayout qLW;
  public Button qLX;
  private VoipSmallIconButton qLY;
  private VoipSmallIconButton qLZ;
  private boolean qMA;
  private boolean qMB;
  public long qMC;
  public Bitmap qMD;
  public a qME;
  private View.OnClickListener qMF;
  private View.OnClickListener qMG;
  private View.OnClickListener qMH;
  private View.OnClickListener qMI;
  private View.OnClickListener qMJ;
  private View.OnClickListener qMK;
  private View.OnClickListener qML;
  private View.OnClickListener qMM;
  private View.OnClickListener qMN;
  private View.OnClickListener qMO;
  private View.OnClickListener qMP;
  private View.OnClickListener qMQ;
  private Runnable qMR;
  private Runnable qMS;
  int qMT;
  private VoipSmallIconButton qMa;
  public VoipBigIconButton qMb;
  private VoipBigIconButton qMc;
  private VoipBigIconButton qMd;
  public VoipBigIconButton qMe;
  public VoipBigIconButton qMf;
  public VoipBigIconButton qMg;
  public TextView qMh;
  public TextView qMi;
  public TextView qMj;
  public TextView qMk;
  public TextView qMl;
  public TextView qMm;
  private VoIPVideoView qMn;
  public com.tencent.mm.plugin.voip.video.e qMo;
  private Button qMp;
  private Button qMq;
  public boolean qMr;
  int qMs;
  int qMt;
  int qMu;
  int qMv;
  int qMw;
  public int qMx;
  public boolean qMy;
  private boolean qMz;
  
  public e()
  {
    GMTrace.i(5334349381632L, 39744);
    this.qMo = null;
    this.qMp = null;
    this.qMq = null;
    this.qMr = false;
    this.qMx = 0;
    this.qMy = false;
    this.qMz = false;
    this.qMA = false;
    this.qMC = 0L;
    this.qMD = null;
    this.qMF = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5363877281792L, 39964);
        w.i("MicroMsg.Voip.VoipVideoFragment", "hangup video talking");
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null) && (((c)e.this.qKZ.get()).bue()))
        {
          e.this.qMf.setEnabled(false);
          e.this.qMe.setEnabled(false);
          e.this.ca(e.this.getString(R.l.eiv), -1);
        }
        GMTrace.o(5363877281792L, 39964);
      }
    };
    this.qMG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5355824218112L, 39904);
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
          ((c)e.this.qKZ.get()).bun();
        }
        GMTrace.o(5355824218112L, 39904);
      }
    };
    this.qMH = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5362803539968L, 39956);
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
          ((c)e.this.qKZ.get()).bun();
        }
        GMTrace.o(5362803539968L, 39956);
      }
    };
    this.qMI = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5354750476288L, 39896);
        w.i("MicroMsg.Voip.VoipVideoFragment", "click accept video invite use voice button");
        if ((am.isWifi(e.this.aG())) || (l.buG()))
        {
          e.this.bvB();
          GMTrace.o(5354750476288L, 39896);
          return;
        }
        com.tencent.mm.ui.base.h.a(e.this.aG(), R.l.eiP, R.l.eiQ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5356092653568L, 39906);
            l.buF();
            e.this.bvB();
            GMTrace.o(5356092653568L, 39906);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5355018911744L, 39898);
            e.this.bvC();
            GMTrace.o(5355018911744L, 39898);
          }
        });
        GMTrace.o(5354750476288L, 39896);
      }
    };
    this.qMJ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5327504277504L, 39693);
        w.i("MicroMsg.Voip.VoipVideoFragment", "click accept video invite button");
        if ((am.isWifi(e.this.aG())) || ((l.buG()) && (!am.is2G(e.this.aG()))))
        {
          e.this.bvD();
          GMTrace.o(5327504277504L, 39693);
          return;
        }
        com.tencent.mm.ui.base.h.a(e.this.aG(), R.l.eiP, R.l.eiQ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5327772712960L, 39695);
            if (!am.is2G(e.this.aG())) {
              l.buF();
            }
            e.this.bvD();
            GMTrace.o(5327772712960L, 39695);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5341731356672L, 39799);
            e.this.bvC();
            GMTrace.o(5341731356672L, 39799);
          }
        });
        GMTrace.o(5327504277504L, 39693);
      }
    };
    this.qMK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5347368501248L, 39841);
        w.i("MicroMsg.Voip.VoipVideoFragment", "click reject video invite button");
        e.this.bvC();
        GMTrace.o(5347368501248L, 39841);
      }
    };
    this.qML = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5347905372160L, 39845);
        w.i("MicroMsg.Voip.VoipVideoFragment", "click cancel video invite button");
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null) && (((c)e.this.qKZ.get()).buk()))
        {
          e.this.qMf.setEnabled(false);
          e.this.qMb.setEnabled(false);
          e.this.qLU.setVisibility(0);
          e.this.qLU.setText(R.l.ehH);
        }
        GMTrace.o(5347905372160L, 39845);
      }
    };
    this.qMM = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5343341969408L, 39811);
        com.tencent.mm.plugin.report.service.g.ork.i(11618, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
          ((c)e.this.qKZ.get()).ix(true);
        }
        if (e.this.qLq != null) {
          e.this.qLq.x(false, true);
        }
        GMTrace.o(5343341969408L, 39811);
      }
    };
    this.qMN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5362535104512L, 39954);
        com.tencent.mm.plugin.report.service.g.ork.i(11619, new Object[] { Integer.valueOf(2) });
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
          ((c)e.this.qKZ.get()).buz();
        }
        GMTrace.o(5362535104512L, 39954);
      }
    };
    this.qMO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5348173807616L, 39847);
        paramAnonymousView = e.this;
        if (!e.this.qMr) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.qMr = bool;
          if (!e.this.qMr) {
            e.this.qMo.setVisibility(8);
          }
          Toast.makeText(e.this.aG(), String.format("mIsShowFaceRect:%b", new Object[] { Boolean.valueOf(e.this.qMr) }), 0).show();
          GMTrace.o(5348173807616L, 39847);
          return;
        }
      }
    };
    this.qMP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5372869869568L, 40031);
        boolean bool2 = bg.a((Boolean)paramAnonymousView.getTag(), false);
        boolean bool1;
        if (!bool2)
        {
          bool1 = true;
          paramAnonymousView.setTag(Boolean.valueOf(bool1));
          if (!bool2) {
            break label121;
          }
          e.this.qMo.setVisibility(8);
          Toast.makeText(e.this.aG(), "stop face detect", 0).show();
        }
        for (;;)
        {
          if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
            ((c)e.this.qKZ.get()).buA();
          }
          GMTrace.o(5372869869568L, 40031);
          return;
          bool1 = false;
          break;
          label121:
          Toast.makeText(e.this.aG(), "start face detect", 0).show();
        }
      }
    };
    this.qMQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5363071975424L, 39958);
        w.i("MicroMsg.Voip.VoipVideoFragment", "switch camera");
        e.this.qMg.setEnabled(false);
        e.this.bvE();
        e.this.qMg.setEnabled(true);
        if ((e.this.qKZ != null) && (e.this.qKZ.get() != null)) {
          ((c)e.this.qKZ.get()).bum();
        }
        GMTrace.o(5363071975424L, 39958);
      }
    };
    this.qMR = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5356361089024L, 39908);
        w.i("MicroMsg.Voip.VoipVideoFragment", "dismiss bar");
        e locale = e.this;
        locale.qMx -= 1;
        if ((e.this.aG() == null) || (e.this.aG().isFinishing()))
        {
          GMTrace.o(5356361089024L, 39908);
          return;
        }
        if (e.this.qMx > 0)
        {
          GMTrace.o(5356361089024L, 39908);
          return;
        }
        e.this.qMg.setVisibility(8);
        e.this.qLX.setVisibility(8);
        e.this.qLT.setVisibility(8);
        e.this.qMf.setVisibility(8);
        e.this.qMe.setVisibility(8);
        e.this.iC(false);
        GMTrace.o(5356361089024L, 39908);
      }
    };
    this.qMS = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5348442243072L, 39849);
        if ((e.this.aG() == null) || (e.this.aG().isFinishing()))
        {
          GMTrace.o(5348442243072L, 39849);
          return;
        }
        e.this.qLU.setVisibility(8);
        GMTrace.o(5348442243072L, 39849);
      }
    };
    this.nng = null;
    this.qMT = 0;
    this.nnx = null;
    GMTrace.o(5334349381632L, 39744);
  }
  
  private void c(CaptureView paramCaptureView)
  {
    GMTrace.i(5336496865280L, 39760);
    if ((this.qLm == null) || (paramCaptureView == null))
    {
      GMTrace.o(5336496865280L, 39760);
      return;
    }
    this.qLm.removeView(this.qHb);
    this.qHb = null;
    this.qHb = paramCaptureView;
    this.qLm.addView(paramCaptureView, new RelativeLayout.LayoutParams(1, 1));
    this.qHb.setVisibility(0);
    w.d("MicroMsg.Voip.VoipVideoFragment", "CaptureView added");
    GMTrace.o(5336496865280L, 39760);
  }
  
  protected final void JP(String paramString)
  {
    GMTrace.i(14695364820992L, 109489);
    if (this.qLV != null)
    {
      this.qLV.setVisibility(0);
      this.qLV.setText(paramString);
    }
    GMTrace.o(14695364820992L, 109489);
  }
  
  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5336228429824L, 39758);
    if (!this.qMA)
    {
      GMTrace.o(5336228429824L, 39758);
      return;
    }
    this.qMu += 1;
    if (OpenGlRender.qPE == 1)
    {
      if (this.qMy)
      {
        this.qLM.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPl + OpenGlRender.qPq);
        GMTrace.o(5336228429824L, 39758);
        return;
      }
      this.qLL.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPl + OpenGlRender.qPq);
      GMTrace.o(5336228429824L, 39758);
      return;
    }
    if (this.qMy)
    {
      this.qLM.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPn + OpenGlRender.qPq);
      GMTrace.o(5336228429824L, 39758);
      return;
    }
    this.qLL.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPn + OpenGlRender.qPq);
    GMTrace.o(5336228429824L, 39758);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(5336094212096L, 39757);
    if (!this.qMA)
    {
      GMTrace.o(5336094212096L, 39757);
      return;
    }
    if (OpenGlRender.qPE == 1)
    {
      if (this.qMT < paramInt1 * paramInt2) {
        this.nng = null;
      }
      if (this.nng == null)
      {
        this.qMT = (paramInt1 * paramInt2);
        this.nng = new int[this.qMT];
      }
      if ((com.tencent.mm.plugin.voip.model.d.btG().a(paramArrayOfByte, (int)paramLong, paramInt3 & 0x1F, paramInt1, paramInt2, this.nng, true) < 0) || (this.nng == null))
      {
        GMTrace.o(5336094212096L, 39757);
        return;
      }
      if (this.qMy) {
        this.qLL.a(this.nng, paramInt1, paramInt2, OpenGlRender.qPl + paramInt4 + paramInt5);
      }
    }
    for (;;)
    {
      this.qMt += 1;
      if (paramInt6 > 0) {
        this.qMs += 1;
      }
      paramArrayOfByte = this.qMo;
      paramArrayOfByte.qOC = paramInt1;
      paramArrayOfByte.qOD = paramInt2;
      paramArrayOfByte = this.qMo;
      paramInt1 = this.qLm.getWidth();
      paramInt2 = this.qLm.getHeight();
      paramArrayOfByte.qOB = paramInt1;
      paramArrayOfByte.ev = paramInt2;
      GMTrace.o(5336094212096L, 39757);
      return;
      this.qLM.a(this.nng, paramInt1, paramInt2, OpenGlRender.qPl + paramInt4 + paramInt5);
      continue;
      if (OpenGlRender.qPE == 2) {
        if (this.qMy) {
          this.qLL.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.qPp + paramInt4 + paramInt5);
        } else {
          this.qLM.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.qPp + paramInt4 + paramInt5);
        }
      }
    }
  }
  
  public final void b(CaptureView paramCaptureView)
  {
    GMTrace.i(5335020470272L, 39749);
    this.qHb = paramCaptureView;
    c(this.qHb);
    GMTrace.o(5335020470272L, 39749);
  }
  
  public final void buu()
  {
    GMTrace.i(5336362647552L, 39759);
    if (!this.qMA)
    {
      GMTrace.o(5336362647552L, 39759);
      return;
    }
    this.qLM.bwa();
    this.qLL.bwa();
    GMTrace.o(5336362647552L, 39759);
  }
  
  public final void bvB()
  {
    GMTrace.i(16026536247296L, 119407);
    w.i("MicroMsg.Voip.VoipVideoFragment", "accept video invite use voice");
    com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buK()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buL()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buM()), Integer.valueOf(3) });
    if ((this.qKZ != null) && (this.qKZ.get() != null) && (((c)this.qKZ.get()).buf()))
    {
      this.qMa.setEnabled(false);
      this.qMd.setEnabled(false);
      this.qMc.setEnabled(false);
      this.qLQ.setText(R.l.ejp);
      this.qLr.a(this.qLR, qLl);
    }
    GMTrace.o(16026536247296L, 119407);
  }
  
  public final void bvC()
  {
    GMTrace.i(16026670465024L, 119408);
    w.i("MicroMsg.Voip.VoipVideoFragment", "reject video invite");
    com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buK()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buL()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buM()), Integer.valueOf(4) });
    if ((this.qKZ != null) && (this.qKZ.get() != null) && (((c)this.qKZ.get()).bug()))
    {
      ca(getString(R.l.eiU), -1);
      this.qMc.setEnabled(false);
      this.qMd.setEnabled(false);
      this.qMa.setEnabled(false);
    }
    GMTrace.o(16026670465024L, 119408);
  }
  
  public final void bvD()
  {
    GMTrace.i(16026804682752L, 119409);
    w.i("MicroMsg.Voip.VoipVideoFragment", "accept video invite");
    com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buK()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buL()), Long.valueOf(com.tencent.mm.plugin.voip.model.d.btG().buM()), Integer.valueOf(1) });
    if ((this.qKZ != null) && (this.qKZ.get() != null) && (((c)this.qKZ.get()).buh()))
    {
      this.qMd.setEnabled(false);
      this.qMc.setEnabled(false);
      this.qMa.setEnabled(false);
      this.qMb.setVisibility(8);
    }
    GMTrace.o(16026804682752L, 119409);
  }
  
  public final void bvE()
  {
    GMTrace.i(5334752034816L, 39747);
    w.i("MicroMsg.Voip.VoipVideoFragment", "trigger dismiss bar");
    this.qMx += 1;
    this.iAX.postDelayed(this.qMR, 10000L);
    GMTrace.o(5334752034816L, 39747);
  }
  
  protected final void bvw()
  {
    GMTrace.i(5335825776640L, 39755);
    if (this.muc != null)
    {
      this.muc.clearAnimation();
      this.muc.setVisibility(0);
    }
    GMTrace.o(5335825776640L, 39755);
  }
  
  protected final void bvx()
  {
    GMTrace.i(5335959994368L, 39756);
    if (this.muc != null)
    {
      this.muc.clearAnimation();
      this.muc.setVisibility(8);
    }
    GMTrace.o(5335959994368L, 39756);
  }
  
  protected final void ca(String paramString, int paramInt)
  {
    GMTrace.i(5335691558912L, 39754);
    if (this.qLU == null)
    {
      GMTrace.o(5335691558912L, 39754);
      return;
    }
    this.qLU.setText(bg.nl(paramString));
    this.qLU.setVisibility(0);
    this.qLU.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.qLU.setBackgroundResource(R.g.bbU);
    this.qLU.setCompoundDrawables(null, null, null, null);
    this.qLU.setCompoundDrawablePadding(0);
    this.iAX.removeCallbacks(this.qMS);
    if (-1 != paramInt) {
      this.iAX.postDelayed(this.qMS, paramInt);
    }
    GMTrace.o(5335691558912L, 39754);
  }
  
  public final void dq(int paramInt1, int paramInt2)
  {
    GMTrace.i(5334886252544L, 39748);
    super.dq(paramInt1, paramInt2);
    w.i("MicroMsg.Voip.VoipVideoFragment", "newState: " + b.wy(paramInt2));
    if (this.qLm == null)
    {
      w.i("MicroMsg.Voip.VoipVideoFragment", "fragment no create, return first, onCreateView will call it again");
      GMTrace.o(5334886252544L, 39748);
      return;
    }
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(5334886252544L, 39748);
      return;
      this.qLS.setVisibility(0);
      this.qLW.setVisibility(0);
      this.qLJ.setVisibility(0);
      this.qLQ.setText(R.l.eiH);
      this.qLn.setVisibility(8);
      this.qLU.setVisibility(8);
      this.qLV.setVisibility(8);
      if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
      {
        this.qLV.setVisibility(0);
        this.qLV.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
      }
      this.qLr.a(this.qLR, qLl);
      this.qMg.setVisibility(8);
      this.qMf.setVisibility(8);
      this.qMb.setVisibility(0);
      this.qMe.setVisibility(8);
      this.qMd.setVisibility(8);
      this.qMa.setVisibility(8);
      this.qMc.setVisibility(8);
      this.qLZ.setVisibility(0);
      this.qLY.setVisibility(8);
      GMTrace.o(5334886252544L, 39748);
      return;
      this.qLJ.setVisibility(0);
      this.qLW.setVisibility(0);
      if (this.qLo != null) {
        bvz();
      }
      this.qLN.setVisibility(0);
      this.qLP.setVisibility(0);
      this.qLQ.setText(R.l.eiJ);
      this.qLS.setVisibility(0);
      this.qLO.setVisibility(0);
      this.qLr.a(this.qLR, qLl);
      this.qMg.setVisibility(8);
      this.qMf.setVisibility(8);
      this.qMb.setVisibility(8);
      this.qMe.setVisibility(8);
      this.qMd.setVisibility(0);
      this.qMa.setVisibility(0);
      this.qMc.setVisibility(0);
      this.qLZ.setVisibility(8);
      if (this.qMB) {
        this.qLY.setVisibility(0);
      }
      this.qLV.setVisibility(8);
      if (com.tencent.mm.plugin.voip.model.d.btG().qHD != null)
      {
        this.qLV.setVisibility(0);
        this.qLV.setText(com.tencent.mm.plugin.voip.model.d.btG().qHD);
      }
      GMTrace.o(5334886252544L, 39748);
      return;
      Object localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool = false;
          GMTrace.i(5366158983168L, 39981);
          com.tencent.mm.plugin.report.service.g.ork.i(11079, new Object[] { Integer.valueOf(4) });
          if ((!e.this.qMy) && (e.this.qKZ.get() != null)) {
            e.this.qMg.getVisibility();
          }
          int i;
          if (e.this.qMg.getVisibility() == 0)
          {
            i = 4;
            if (i != 0) {
              break label256;
            }
          }
          label256:
          for (int j = 0;; j = 8)
          {
            e.this.qMg.setVisibility(j);
            e.this.qLX.setVisibility(j);
            e.this.qLT.setVisibility(j);
            e.this.qMe.setVisibility(j);
            e.this.qMf.setVisibility(j);
            paramAnonymousView = e.this;
            if (j == 0) {
              bool = true;
            }
            paramAnonymousView.iC(bool);
            if (com.tencent.mm.platformtools.r.hkW)
            {
              e.this.qMh.setVisibility(j);
              e.this.qMi.setVisibility(j);
              e.this.qMj.setVisibility(j);
              e.this.qMk.setVisibility(j);
              e.this.qMl.setVisibility(j);
              e.this.qMm.setVisibility(j);
            }
            if (i == 0) {
              e.this.bvE();
            }
            GMTrace.o(5366158983168L, 39981);
            return;
            i = 0;
            break;
          }
        }
      };
      this.qLm.setOnClickListener((View.OnClickListener)localObject);
      if (this.qLo != null) {
        this.qLo.setVisibility(8);
      }
      boolean bool;
      if (this.qLK.getVisibility() != 0)
      {
        if (!this.qHg) {
          break label957;
        }
        if (this.qMy) {
          break label947;
        }
        bool = true;
        this.qMy = bool;
        if (this.qMy) {
          break label952;
        }
        bool = true;
        label647:
        localObject = iD(bool);
        this.qLK.dt(((Point)localObject).x, ((Point)localObject).y);
        if (com.tencent.mm.platformtools.r.hkW)
        {
          this.qMh.setVisibility(0);
          this.qMi.setVisibility(0);
          this.qMj.setVisibility(0);
          this.qMk.setVisibility(0);
          this.qMl.setVisibility(0);
          this.qMm.setVisibility(0);
        }
        this.qLN.setVisibility(8);
        this.qLJ.setVisibility(0);
        this.qLK.setVisibility(0);
        this.qLT.setVisibility(0);
        this.qLX.setVisibility(0);
        this.qLW.setVisibility(0);
        this.qMg.setVisibility(0);
        this.qMf.setVisibility(0);
        this.qMb.setVisibility(8);
        this.qMe.setVisibility(0);
        this.qMd.setVisibility(8);
        this.qMa.setVisibility(8);
        this.qMc.setVisibility(8);
        this.qLZ.setVisibility(8);
        this.qLY.setVisibility(8);
        if (this.qMy) {
          break label988;
        }
        bool = true;
        label861:
        localObject = iD(bool);
        ((MovableVideoView)this.qLK).dr(((Point)localObject).x, ((Point)localObject).y);
        if ((this.mTimer != null) && (!this.qMz)) {
          break label993;
        }
      }
      for (;;)
      {
        if (ab.bPV().getBoolean("voipfaceDebug", false))
        {
          this.qMp.setVisibility(0);
          this.qMq.setVisibility(0);
        }
        bvE();
        GMTrace.o(5334886252544L, 39748);
        return;
        label947:
        bool = false;
        break;
        label952:
        bool = false;
        break label647;
        label957:
        if (!this.qMy) {}
        for (bool = true;; bool = false)
        {
          this.qMy = bool;
          this.qMn.setVisibility(8);
          break;
        }
        label988:
        bool = false;
        break label861;
        label993:
        if (-1L == this.qLb) {
          this.qLb = bg.Pu();
        }
        this.qMC = this.qLb;
        this.qMz = true;
        localObject = new TimerTask()
        {
          public final void run()
          {
            GMTrace.i(5364682588160L, 39970);
            e.this.iAX.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5362266669056L, 39952);
                Object localObject1 = e.ax(bg.aG(e.this.qLb));
                e.this.qLT.setText((CharSequence)localObject1);
                localObject1 = e.this;
                Object localObject2 = com.tencent.mm.plugin.voip.model.d.btG();
                int i = ((e)localObject1).qMt;
                localObject2 = ((m)localObject2).qIe.qDX.qFt;
                ((com.tencent.mm.plugin.voip.model.g)localObject2).qDX.qFr.qKq = i;
                ((com.tencent.mm.plugin.voip.model.g)localObject2).qDX.qFr.qKr = 0;
                long l;
                if (com.tencent.mm.platformtools.r.hkW)
                {
                  l = bg.Pu();
                  i = (int)(l - ((e)localObject1).qMC);
                  if (i <= 1) {
                    break label484;
                  }
                }
                for (;;)
                {
                  localObject2 = String.format(Locale.US, "Cap Fps: %d", new Object[] { Integer.valueOf(((e)localObject1).qMt) });
                  String str1 = String.format(Locale.US, "Send Fps: %d", new Object[] { Integer.valueOf(((e)localObject1).qMs) });
                  String str2 = String.format(Locale.US, "Recv Fps: %d", new Object[] { Integer.valueOf(((e)localObject1).qMu) });
                  int j = com.tencent.mm.plugin.voip.model.d.btG().qIe.qDX.qFt.qDX.qFr.field_sendVideoLen;
                  int k = com.tencent.mm.plugin.voip.model.d.btG().qIe.qDX.qFt.qDX.qFr.field_recvVideoLen;
                  ((e)localObject1).qMv = ((int)((j - ((e)localObject1).qMv) * 8.0D / (i * 1000)));
                  ((e)localObject1).qMw = ((int)((k - ((e)localObject1).qMw) * 8.0D / (i * 1000)));
                  String str3 = String.format(Locale.US, "Send Br: %d", new Object[] { Integer.valueOf(((e)localObject1).qMv) });
                  String str4 = String.format(Locale.US, "Recv Br: %d", new Object[] { Integer.valueOf(((e)localObject1).qMw) });
                  Object localObject3 = com.tencent.mm.plugin.voip.model.d.btG().qIe.qDX.qFr.qKs;
                  if (localObject3 != null) {}
                  try
                  {
                    localObject3 = new String((byte[])localObject3, "UTF-8");
                    ((e)localObject1).qMm.setText((CharSequence)localObject3);
                    ((e)localObject1).qMh.setText((CharSequence)localObject2);
                    ((e)localObject1).qMi.setText(str1);
                    ((e)localObject1).qMj.setText(str2);
                    ((e)localObject1).qMl.setText(str4);
                    ((e)localObject1).qMk.setText(str3);
                    ((e)localObject1).qMv = j;
                    ((e)localObject1).qMw = k;
                    ((e)localObject1).qMC = l;
                    ((e)localObject1).qMt = 0;
                    ((e)localObject1).qMs = 0;
                    ((e)localObject1).qMu = 0;
                    GMTrace.o(5362266669056L, 39952);
                    return;
                    label484:
                    i = 1;
                  }
                  catch (UnsupportedEncodingException localUnsupportedEncodingException)
                  {
                    for (;;)
                    {
                      w.printErrStackTrace("MicroMsg.Voip.VoipVideoFragment", localUnsupportedEncodingException, "", new Object[0]);
                    }
                  }
                }
              }
            });
            GMTrace.o(5364682588160L, 39970);
          }
        };
        this.mTimer.schedule((TimerTask)localObject, 1000L, 1000L);
      }
      this.qLr.bvA();
      this.qMb.setEnabled(false);
      this.qMf.setEnabled(false);
      this.qMe.setEnabled(false);
      this.qMd.setEnabled(false);
      this.qMc.setEnabled(false);
      this.qMa.setEnabled(false);
      this.qMg.setEnabled(false);
      this.qLZ.setEnabled(false);
      this.qLY.setEnabled(false);
      switch (paramInt1)
      {
      }
      for (;;)
      {
        if (this.qLq != null) {
          this.qLq.x(true, false);
        }
        GMTrace.o(5334886252544L, 39748);
        return;
        this.qLU.setVisibility(0);
        this.qLU.setText(R.l.eiO);
      }
      this.qLQ.setText(R.l.ejp);
      this.qLr.a(this.qLR, qLl);
    }
  }
  
  public final void iC(boolean paramBoolean)
  {
    GMTrace.i(16026938900480L, 119410);
    if (!paramBoolean)
    {
      aG().getWindow().setFlags(1024, 1024);
      GMTrace.o(16026938900480L, 119410);
      return;
    }
    aG().getWindow().clearFlags(1024);
    GMTrace.o(16026938900480L, 119410);
  }
  
  public final Point iD(boolean paramBoolean)
  {
    GMTrace.i(5336899518464L, 39763);
    int i = (int)(aG().getWindowManager().getDefaultDisplay().getHeight() / 5.0D);
    float f = i;
    com.tencent.mm.plugin.voip.model.d.btG();
    Point localPoint = new Point((int)(f * m.iA(paramBoolean)), i);
    GMTrace.o(5336899518464L, 39763);
    return localPoint;
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(5334483599360L, 39745);
    this.qLm = ((RelativeLayout)paramLayoutInflater.inflate(R.i.cHG, paramViewGroup, false));
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
      ((RelativeLayout)this.qLm.findViewById(R.h.bYS)).setPadding(0, 0, 0, BackwardSupportUtil.b.a(aG(), 40.0F));
    }
    this.qLn = ((ImageView)this.qLm.findViewById(R.h.cmi));
    this.qLo = ((ImageView)this.qLm.findViewById(R.h.cmN));
    this.qLW = ((RelativeLayout)this.qLm.findViewById(R.h.bKs));
    this.qLJ = ((OpenGlView)this.qLm.findViewById(R.h.bgA));
    this.qLJ.ds(mScreenWidth, mScreenHeight);
    this.qMg = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmJ));
    this.qMg.setOnClickListener(this.qMQ);
    this.qMf = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmW));
    this.qMf.setOnClickListener(this.qMG);
    this.qMb = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmj));
    this.qMb.setOnClickListener(this.qML);
    this.qMe = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmy));
    this.qMe.setOnClickListener(this.qMF);
    this.qMd = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmg));
    this.qMd.setOnClickListener(this.qMJ);
    this.qMa = ((VoipSmallIconButton)this.qLm.findViewById(R.h.cmh));
    this.qMa.setOnClickListener(this.qMI);
    this.qMc = ((VoipBigIconButton)this.qLm.findViewById(R.h.cmG));
    this.qMc.setOnClickListener(this.qMK);
    this.qLZ = ((VoipSmallIconButton)this.qLm.findViewById(R.h.cmK));
    this.qLZ.setOnClickListener(this.qMH);
    boolean bool;
    if (com.tencent.mm.plugin.voip.b.d.na("VOIPBlockIgnoreButton") == 0)
    {
      bool = true;
      this.qMB = bool;
      this.qLY = ((VoipSmallIconButton)this.qLm.findViewById(R.h.cmz));
      this.qLY.setOnClickListener(this.qMN);
      if (!this.qMB) {
        this.qLY.setVisibility(8);
      }
      this.qLT = ((TextView)this.qLm.findViewById(R.h.cmX));
      this.qLN = this.qLm.findViewById(R.h.cmT);
      this.qLO = ((ImageView)this.qLm.findViewById(R.h.cmS));
      a.b.a(this.qLO, this.fKP, 0.05882353F, true);
      this.qLP = ((TextView)this.qLm.findViewById(R.h.cmU));
      this.qLQ = ((TextView)this.qLm.findViewById(R.h.cmP));
      this.qLR = ((TextView)this.qLm.findViewById(R.h.cmR));
      this.qLS = this.qLm.findViewById(R.h.cmQ);
      b(this.qLR, getResources().getString(R.l.eja));
      this.qLU = ((TextView)this.qLm.findViewById(R.h.cmO));
      this.qLV = ((TextView)this.qLm.findViewById(R.h.cmV));
      this.qLX = ((Button)this.qLm.findViewById(R.h.biE));
      this.muc = ((TextView)this.qLm.findViewById(R.h.cmC));
      if (com.tencent.mm.platformtools.r.hkW)
      {
        this.qMh = ((TextView)this.qLm.findViewById(R.h.cmk));
        this.qMi = ((TextView)this.qLm.findViewById(R.h.cmH));
        this.qMj = ((TextView)this.qLm.findViewById(R.h.cmE));
        this.qMk = ((TextView)this.qLm.findViewById(R.h.cmI));
        this.qMl = ((TextView)this.qLm.findViewById(R.h.cmF));
        this.qMm = ((TextView)this.qLm.findViewById(R.h.bwR));
      }
      this.qMp = ((Button)this.qLm.findViewById(R.h.cmw));
      this.qMq = ((Button)this.qLm.findViewById(R.h.cmx));
      this.qMp.setVisibility(8);
      this.qMq.setVisibility(8);
      this.qMp.setOnClickListener(this.qMO);
      this.qMq.setOnClickListener(this.qMP);
      this.qMo = new com.tencent.mm.plugin.voip.video.e(aG());
      this.qLm.addView(this.qMo);
      this.qMo.setVisibility(8);
      this.qLX.setOnClickListener(this.qMM);
      c(this.qHb);
      int i = u.fq(aG());
      w.d("MicroMsg.Voip.VoipVideoFragment", "statusHeight: " + i);
      E(this.qLX, i);
      E(this.qLm.findViewById(R.h.cmM), i);
      E(this.qLN, i);
      this.qMt = 0;
      this.qMs = 0;
      this.qMu = 0;
      this.qMv = 0;
      this.qMw = 0;
      paramLayoutInflater = (WindowManager)aG().getSystemService("window");
      i = paramLayoutInflater.getDefaultDisplay().getHeight() / 5;
      int j = paramLayoutInflater.getDefaultDisplay().getWidth() * i / paramLayoutInflater.getDefaultDisplay().getHeight();
      this.qLK = new MovableVideoView(aG().getApplicationContext());
      ((MovableVideoView)this.qLK).dr(j, i);
      this.qLK.setVisibility(8);
      this.qLL = new OpenGlRender(this.qLK, OpenGlRender.qPu);
      this.qLK.a(this.qLL);
      this.qLK.setRenderMode(0);
      this.qLM = new OpenGlRender(this.qLJ, OpenGlRender.qPt);
      this.qLJ.a(this.qLM);
      this.qLJ.setRenderMode(0);
      if (!Build.MODEL.equals("Nexus 6")) {
        break label1307;
      }
      this.qLK.setZOrderOnTop(true);
    }
    for (;;)
    {
      this.qLm.addView(this.qLK);
      this.qLK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5351931904000L, 39875);
          paramAnonymousView = e.this;
          if (!e.this.qMy)
          {
            bool = true;
            paramAnonymousView.qMy = bool;
            paramAnonymousView = e.this;
            if (e.this.qMy) {
              break label105;
            }
          }
          label105:
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView = paramAnonymousView.iD(bool);
            e.this.qLK.dt(paramAnonymousView.x, paramAnonymousView.y);
            com.tencent.mm.plugin.report.service.g.ork.i(11079, new Object[] { Integer.valueOf(3) });
            GMTrace.o(5351931904000L, 39875);
            return;
            bool = false;
            break;
          }
        }
      });
      this.qLP.setText(com.tencent.mm.pluginsdk.ui.d.h.b(aG(), com.tencent.mm.y.r.fs(this.fKP), this.qLP.getTextSize()));
      if (this.qHg) {
        this.iAX.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5327235842048L, 39691);
            e.this.qLQ.setText(R.l.eiH);
            e.this.qLr.a(e.this.qLR, d.qLl);
            GMTrace.o(5327235842048L, 39691);
          }
        }, 2000L);
      }
      this.qMn = ((VoIPVideoView)this.qLm.findViewById(R.h.cmL));
      this.mTimer = new Timer("VoIP_video_talking_count");
      this.qMA = true;
      dq(0, this.mStatus);
      paramLayoutInflater = this.qLm;
      GMTrace.o(5334483599360L, 39745);
      return paramLayoutInflater;
      bool = false;
      break;
      label1307:
      this.qLK.setZOrderMediaOverlay(true);
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5334617817088L, 39746);
    this.qMz = false;
    super.onDestroy();
    GMTrace.o(5334617817088L, 39746);
  }
  
  public final void onDetach()
  {
    GMTrace.i(5336631083008L, 39761);
    w.i("MicroMsg.Voip.VoipVideoFragment", "onDetach");
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    super.onDetach();
    GMTrace.o(5336631083008L, 39761);
  }
  
  public final void onStart()
  {
    GMTrace.i(5335557341184L, 39753);
    this.qLM.qPa = true;
    this.qLL.qPa = true;
    super.onStart();
    GMTrace.o(5335557341184L, 39753);
  }
  
  public final void onStop()
  {
    GMTrace.i(5335423123456L, 39752);
    this.qLM.bvZ();
    this.qLL.bvZ();
    super.onStop();
    GMTrace.o(5335423123456L, 39752);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(5335288905728L, 39751);
    GMTrace.o(5335288905728L, 39751);
  }
  
  public final void uninit()
  {
    GMTrace.i(5335154688000L, 39750);
    this.qLK.setVisibility(4);
    if (this.qHb != null)
    {
      this.qLm.removeView(this.qHb);
      this.qHb = null;
      w.d("MicroMsg.Voip.VoipVideoFragment", "CaptureView removed");
    }
    if (this.qME != null)
    {
      com.tencent.mm.sdk.f.e.remove(this.qME);
      this.qME = null;
    }
    super.uninit();
    GMTrace.o(5335154688000L, 39750);
  }
  
  public final void wu(int paramInt)
  {
    GMTrace.i(5336765300736L, 39762);
    GMTrace.o(5336765300736L, 39762);
  }
  
  public final class a
    implements Runnable
  {
    public final void run()
    {
      GMTrace.i(5366561636352L, 39984);
      w.i("MicroMsg.Voip.VoipVideoFragment", "try load blur bitmap");
      final Bitmap localBitmap = this.qMU.qMD;
      this.qMU.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5354482040832L, 39894);
          if (e.a.this.qMU.qLn != null) {
            e.a.this.qMU.qLn.setBackgroundDrawable(new BitmapDrawable(localBitmap));
          }
          e.a.this.qMU.qME = null;
          GMTrace.o(5354482040832L, 39894);
        }
      });
      GMTrace.o(5366561636352L, 39984);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */