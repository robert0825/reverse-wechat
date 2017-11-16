package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.fi;
import com.tencent.mm.plugin.remittance.c.j;
import com.tencent.mm.plugin.remittance.c.l;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public abstract class RemittanceBaseUI
  extends WalletBaseUI
  implements d.a
{
  public String fKP;
  protected String fLH;
  public int gRb;
  private final int hqZ;
  protected WalletFormView jZE;
  protected Button kES;
  private int mChannel;
  protected ScrollView ola;
  private double omp;
  private String onA;
  protected String onB;
  protected String onC;
  protected int onD;
  private int onE;
  private Map<String, a> onF;
  private boolean onG;
  private boolean onH;
  private boolean onI;
  private boolean onJ;
  private c<fi> onK;
  protected com.tencent.mm.plugin.wallet.a onh;
  public double oni;
  protected String onj;
  public int onk;
  public String onl;
  protected ImageView onm;
  protected TextView onn;
  protected TextView ono;
  protected TextView onp;
  protected TextView onq;
  protected TextView onr;
  private TextView ons;
  private TextView ont;
  protected TextView onu;
  private LinearLayout onv;
  private LinearLayout onw;
  protected String onx;
  private String ony;
  private String onz;
  
  public RemittanceBaseUI()
  {
    GMTrace.i(10802782273536L, 80487);
    this.hqZ = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 270);
    this.onh = null;
    this.onB = null;
    this.onC = null;
    this.onF = new HashMap();
    this.onG = false;
    this.onH = false;
    this.onI = false;
    this.onJ = false;
    this.onK = new c() {};
    GMTrace.o(10802782273536L, 80487);
  }
  
  private boolean a(final l paraml)
  {
    GMTrace.i(10804929757184L, 80503);
    boolean bool2 = false;
    boolean bool1;
    label182:
    double d;
    Object localObject;
    if (!this.onG)
    {
      if (!bg.nm(paraml.omj))
      {
        this.onG = true;
        com.tencent.mm.ui.base.h.a(this, paraml.omj, getString(a.i.cUl), getString(a.i.sXt), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10808822071296L, 80532);
            if (!RemittanceBaseUI.a(RemittanceBaseUI.this, paraml)) {
              RemittanceBaseUI.this.P(paraml.eJQ, RemittanceBaseUI.this.fKP, RemittanceBaseUI.g(RemittanceBaseUI.this));
            }
            GMTrace.o(10808822071296L, 80532);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10821975408640L, 80630);
            GMTrace.o(10821975408640L, 80630);
          }
        });
        bool2 = true;
      }
    }
    else
    {
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!this.onH)
        {
          if (paraml.omi <= 0) {
            break label617;
          }
          this.onH = true;
          com.tencent.mm.ui.base.h.a(this, getString(a.i.sYn, new Object[] { Integer.valueOf(paraml.omi) }), getString(a.i.cUl), getString(a.i.sXt), getString(a.i.sYj), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10813653909504L, 80568);
              if (!RemittanceBaseUI.a(RemittanceBaseUI.this, paraml)) {
                RemittanceBaseUI.this.P(paraml.eJQ, RemittanceBaseUI.this.fKP, RemittanceBaseUI.g(RemittanceBaseUI.this));
              }
              GMTrace.o(10813653909504L, 80568);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10820096360448L, 80616);
              com.tencent.mm.wallet_core.a.b(RemittanceBaseUI.this, "ShowOrdersInfoProcess", null);
              GMTrace.o(10820096360448L, 80616);
            }
          });
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.onI)
        {
          if (!paraml.omo) {
            break label623;
          }
          this.onI = true;
          int i = this.gRb;
          d = paraml.oms / 100.0D;
          localObject = paraml.omq;
          a.a(this, i, d, paraml.omr / 100.0D, paraml.oml / 100.0D, paraml.omn, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(19336211202048L, 144066);
              RemittanceBaseUI.this.P(paraml.eJQ, RemittanceBaseUI.this.fKP, RemittanceBaseUI.g(RemittanceBaseUI.this));
              if (RemittanceBaseUI.this.gRb == 1)
              {
                com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(12), Integer.valueOf(1) });
                GMTrace.o(19336211202048L, 144066);
                return;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
              GMTrace.o(19336211202048L, 144066);
            }
          });
          bool2 = true;
        }
      }
      label275:
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!this.onJ) {
          bool1 = b(paraml);
        }
      }
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!bg.nm(paraml.omx))
        {
          bool2 = bool1;
          if (!bg.nm(paraml.omy))
          {
            localObject = com.tencent.mm.wallet_core.ui.e.dl(com.tencent.mm.wallet_core.ui.e.fs(this.fKP), 6);
            if (bg.nm(this.onA)) {
              break label629;
            }
            localObject = getString(a.i.sXo, new Object[] { localObject, this.onA });
          }
        }
      }
    }
    label617:
    label623:
    label629:
    for (;;)
    {
      final String str1 = paraml.eJQ;
      String str2 = paraml.omy;
      String str3 = paraml.omx;
      paraml = LayoutInflater.from(this).inflate(a.g.sOC, null);
      TextView localTextView1 = (TextView)paraml.findViewById(a.f.sGZ);
      TextView localTextView2 = (TextView)paraml.findViewById(a.f.sGY);
      TextView localTextView3 = (TextView)paraml.findViewById(a.f.sGX);
      localTextView1.setText(str2);
      localTextView2.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject, localTextView2.getTextSize()));
      d = bg.getDouble(str3, 0.0D);
      localTextView3.setText(String.format("%s%.2f", new Object[] { com.tencent.mm.wallet_core.c.t.clX(), Double.valueOf(Double.valueOf(d).doubleValue() / 100.0D) }));
      localObject = new i.a(this);
      ((i.a)localObject).lz(false);
      ((i.a)localObject).BN(a.i.sYw);
      ((i.a)localObject).dg(paraml);
      ((i.a)localObject).BQ(a.i.sXt);
      ((i.a)localObject).BR(a.i.sSk);
      ((i.a)localObject).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20889244532736L, 155637);
          RemittanceBaseUI.this.P(str1, RemittanceBaseUI.this.fKP, RemittanceBaseUI.g(RemittanceBaseUI.this));
          GMTrace.o(20889244532736L, 155637);
        }
      });
      ((i.a)localObject).aax().show();
      bool2 = true;
      GMTrace.o(10804929757184L, 80503);
      return bool2;
      bool2 = false;
      break;
      bool1 = false;
      break label182;
      bool2 = false;
      break label275;
    }
  }
  
  private boolean b(final l paraml)
  {
    GMTrace.i(10805063974912L, 80504);
    if ((paraml.eTV != null) && (paraml.eTV.byb()))
    {
      this.onJ = true;
      com.tencent.mm.ui.base.h.a(this, paraml.eTV.eLQ, "", paraml.eTV.mJP, paraml.eTV.mJO, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19329902968832L, 144019);
          w.i("MicroMsg.RemittanceBaseUI", "goto h5: %s", new Object[] { paraml.eTV.jWz });
          com.tencent.mm.wallet_core.ui.e.m(RemittanceBaseUI.this.vKB.vKW, paraml.eTV.jWz, false);
          GMTrace.o(19329902968832L, 144019);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10824659763200L, 80650);
          GMTrace.o(10824659763200L, 80650);
        }
      });
      GMTrace.o(10805063974912L, 80504);
      return true;
    }
    GMTrace.o(10805063974912L, 80504);
    return false;
  }
  
  private void bbA()
  {
    GMTrace.i(10804124450816L, 80497);
    if ((bbF()) && (!bg.nm(this.onC)) && (this.onE != 0) && (this.onD == 1))
    {
      a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(10823317585920L, 80640);
          com.tencent.mm.wallet_core.ui.e.m(RemittanceBaseUI.this.vKB.vKW, RemittanceBaseUI.this.onC, false);
          GMTrace.o(10823317585920L, 80640);
          return false;
        }
      });
      GMTrace.o(10804124450816L, 80497);
      return;
    }
    this.vKB.bXE();
    GMTrace.o(10804124450816L, 80497);
  }
  
  private void bbB()
  {
    GMTrace.i(10804258668544L, 80498);
    if ((!bg.nm(this.onB)) && (this.onE != 0))
    {
      int i;
      if (this.onE == 1) {
        i = 2;
      }
      try
      {
        for (;;)
        {
          this.onp.setText(String.format(this.onB, new Object[] { Integer.valueOf(i) }));
          this.onp.setVisibility(0);
          GMTrace.o(10804258668544L, 80498);
          return;
          i = 24;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.RemittanceBaseUI", localException, "", new Object[0]);
          this.onp.setText(getString(a.i.sYh, new Object[] { Integer.valueOf(i) }));
        }
      }
    }
    this.onp.setText("");
    this.onp.setVisibility(8);
    GMTrace.o(10804258668544L, 80498);
  }
  
  private void bbD()
  {
    GMTrace.i(10804527104000L, 80500);
    if (bg.nm(this.fKP))
    {
      GMTrace.o(10804527104000L, 80500);
      return;
    }
    Object localObject1 = com.tencent.mm.wallet_core.ui.e.dl(com.tencent.mm.wallet_core.ui.e.fs(this.fKP), 6);
    Object localObject2 = localObject1;
    if (!bg.nm(this.onA)) {
      localObject2 = getString(a.i.sXo, new Object[] { localObject1, this.onA });
    }
    if (this.gRb == 1)
    {
      localObject1 = getIntent().getStringExtra("receiver_tips");
      this.onn.setTextColor(getResources().getColor(a.c.black));
      this.ono.setVisibility(0);
      this.ono.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(a.i.sXq, new Object[] { com.tencent.mm.wallet_core.ui.e.dl(com.tencent.mm.wallet_core.ui.e.fs(this.fKP), 6), this.onA }), this.ono.getTextSize()));
      this.onn.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject1, this.onn.getTextSize()));
      this.onm.setImageResource(a.e.aVS);
      if (!com.tencent.mm.kernel.h.xw().wL()) {
        break label375;
      }
      localObject1 = n.Di();
      if (localObject1 == null) {
        break label375;
      }
      localObject1 = ((com.tencent.mm.ac.i)localObject1).ig(this.fKP);
      if ((localObject1 != null) && (!bg.nm(((com.tencent.mm.ac.h)localObject1).Dp()))) {
        break label375;
      }
      final long l = bg.Pv();
      ak.a.gmX.a(this.fKP, "", new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(10812848603136L, 80562);
          if (paramAnonymousBoolean)
          {
            w.v("MicroMsg.RemittanceBaseUI", "getContact suc; cost=" + (bg.Pv() - l) + " ms");
            com.tencent.mm.ac.b.y(paramAnonymousString, 3);
          }
          for (;;)
          {
            RemittanceBaseUI.d(RemittanceBaseUI.this);
            GMTrace.o(10812848603136L, 80562);
            return;
            w.w("MicroMsg.RemittanceBaseUI", "getContact failed");
          }
        }
      });
    }
    label375:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        bbE();
      }
      GMTrace.o(10804527104000L, 80500);
      return;
      localObject1 = localObject2;
      if (this.gRb != 6) {
        break;
      }
      localObject1 = getIntent().getStringExtra("receiver_tips");
      if (bg.nm((String)localObject1))
      {
        localObject1 = getString(a.i.sXp, new Object[] { localObject2 });
        break;
      }
      localObject1 = bg.i((String)localObject1, new Object[] { localObject2 });
      break;
    }
  }
  
  private void bbE()
  {
    GMTrace.i(10804661321728L, 80501);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10813385474048L, 80566);
        Bitmap localBitmap = com.tencent.mm.ac.b.a(RemittanceBaseUI.this.fKP, false, -1);
        if (localBitmap == null)
        {
          RemittanceBaseUI.this.onm.setImageResource(a.e.aVS);
          GMTrace.o(10813385474048L, 80566);
          return;
        }
        RemittanceBaseUI.this.onm.setImageBitmap(localBitmap);
        GMTrace.o(10813385474048L, 80566);
      }
    });
    GMTrace.o(10804661321728L, 80501);
  }
  
  protected final void MP()
  {
    GMTrace.i(10803990233088L, 80496);
    if (this.gRb == 1)
    {
      oM(a.i.sXr);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(10808285200384L, 80528);
          if ((RemittanceBaseUI.this.gRb == 1) || (RemittanceBaseUI.this.gRb == 6))
          {
            RemittanceBaseUI.this.bbx();
            RemittanceBaseUI.this.finish();
          }
          for (;;)
          {
            RemittanceBaseUI.this.bby();
            GMTrace.o(10808285200384L, 80528);
            return true;
            if ((RemittanceBaseUI.this.gRb == 2) || (RemittanceBaseUI.this.gRb == 5)) {
              RemittanceBaseUI.this.finish();
            } else {
              RemittanceBaseUI.this.bbG();
            }
          }
        }
      });
      this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
      this.mLL = findViewById(a.f.sHw);
      this.ola = ((ScrollView)findViewById(a.f.sGW));
      this.onm = ((ImageView)findViewById(a.f.sGG));
      this.onn = ((TextView)findViewById(a.f.sGH));
      this.ono = ((TextView)findViewById(a.f.sGI));
      this.ono.setVisibility(8);
      this.onw = ((LinearLayout)findViewById(a.f.sGz));
      this.onv = ((LinearLayout)findViewById(a.f.sGE));
      this.ont = ((TextView)findViewById(a.f.sGC));
      this.onu = ((TextView)findViewById(a.f.sGD));
      this.ons = ((TextView)findViewById(a.f.sGB));
      bbD();
      this.jZE = ((WalletFormView)findViewById(a.f.sCz));
      if (this.onk != 33) {
        break label605;
      }
      this.ont.setText(com.tencent.mm.wallet_core.ui.e.r(this.oni));
      this.onu.setText(com.tencent.mm.wallet_core.c.t.clX());
      this.onx = getIntent().getStringExtra("desc");
      if (bg.nm(this.onx)) {
        break label593;
      }
      this.ons.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.onx, this.ons.getTextSize()));
      this.ons.setVisibility(0);
      label307:
      this.onv.setVisibility(0);
      this.onw.setVisibility(8);
      label324:
      this.kES = ((Button)findViewById(a.f.bQR));
      if (this.gRb == 1) {
        this.kES.setText(a.i.sXr);
      }
      this.kES.setOnClickListener(new com.tencent.mm.ui.r()
      {
        public final void aoJ()
        {
          GMTrace.i(10807748329472L, 80524);
          if (RemittanceBaseUI.this.onk == 33)
          {
            RemittanceBaseUI.this.dt(RemittanceBaseUI.this.fLH, RemittanceBaseUI.this.onx);
            if (RemittanceBaseUI.a(RemittanceBaseUI.this) == 0.0D)
            {
              if (RemittanceBaseUI.this.gRb != 1) {
                break label244;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(15), Integer.valueOf(1) });
            }
          }
          for (;;)
          {
            if ((RemittanceBaseUI.this.gRb == 1) && (!bg.nm(RemittanceBaseUI.this.fLH))) {
              com.tencent.mm.plugin.report.service.g.ork.i(14074, new Object[] { Integer.valueOf(2) });
            }
            GMTrace.o(10807748329472L, 80524);
            return;
            RemittanceBaseUI.this.oni = bg.getDouble(RemittanceBaseUI.this.jZE.getText(), 0.0D);
            if (!RemittanceBaseUI.this.jZE.QW())
            {
              u.makeText(RemittanceBaseUI.this.vKB.vKW, a.i.sZH, 0).show();
              break;
            }
            if (RemittanceBaseUI.this.oni < 0.01D)
            {
              RemittanceBaseUI.this.bbz();
              break;
            }
            RemittanceBaseUI.this.dt(RemittanceBaseUI.this.fLH, null);
            break;
            label244:
            com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
          }
        }
      });
      this.onq = ((TextView)findViewById(a.f.sGq));
      this.onr = ((TextView)findViewById(a.f.spF));
      if ((this.gRb != 1) && (this.gRb != 6)) {
        break label726;
      }
      this.onr.setText(a.i.sXi);
    }
    for (;;)
    {
      if (!q.zR()) {
        findViewById(a.f.sGr).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(10831370649600L, 80700);
            RemittanceBaseUI.b(RemittanceBaseUI.this);
            com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(9), Integer.valueOf(1) });
            String str;
            if ((RemittanceBaseUI.this.gRb == 1) || (RemittanceBaseUI.this.gRb == 6))
            {
              paramAnonymousView = RemittanceBaseUI.this.getString(a.i.sXi);
              str = RemittanceBaseUI.this.getString(a.i.sXu);
              com.tencent.mm.plugin.report.service.g.ork.i(14074, new Object[] { Integer.valueOf(1) });
            }
            for (;;)
            {
              com.tencent.mm.plugin.wallet_core.ui.view.a.a(RemittanceBaseUI.this, paramAnonymousView, RemittanceBaseUI.this.fLH, str, 20, new h.b()new DialogInterface.OnClickListener
              {
                public final boolean v(CharSequence paramAnonymous2CharSequence)
                {
                  GMTrace.i(10808553635840L, 80530);
                  if (!bg.nm(paramAnonymous2CharSequence.toString()))
                  {
                    RemittanceBaseUI.this.fLH = paramAnonymous2CharSequence.toString();
                    RemittanceBaseUI.c(RemittanceBaseUI.this);
                  }
                  for (;;)
                  {
                    GMTrace.o(10808553635840L, 80530);
                    return true;
                    RemittanceBaseUI.this.fLH = null;
                    RemittanceBaseUI.c(RemittanceBaseUI.this);
                  }
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(10819559489536L, 80612);
                  af.i(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(10831102214144L, 80698);
                      RemittanceBaseUI.this.aLo();
                      GMTrace.o(10831102214144L, 80698);
                    }
                  }, 500L);
                  GMTrace.o(10819559489536L, 80612);
                }
              });
              GMTrace.o(10831370649600L, 80700);
              return;
              paramAnonymousView = RemittanceBaseUI.this.getString(a.i.sXh);
              str = RemittanceBaseUI.this.getString(a.i.sXl);
            }
          }
        });
      }
      if (this.gRb == 1)
      {
        com.tencent.mm.kernel.h.xz();
        if (((String)com.tencent.mm.kernel.h.xy().xh().get(327732, "0")).equals("0"))
        {
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.sYd, a.i.sYe, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10808016764928L, 80526);
              GMTrace.o(10808016764928L, 80526);
            }
          });
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(327732, "1");
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().kL(true);
        }
      }
      this.onp = ((TextView)findViewById(a.f.sEs));
      bbB();
      bbC();
      bbA();
      GMTrace.o(10803990233088L, 80496);
      return;
      oM(a.i.sYy);
      break;
      label593:
      this.ons.setVisibility(8);
      break label307;
      label605:
      this.jZE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10813117038592L, 80564);
          RemittanceBaseUI.e(RemittanceBaseUI.this);
          GMTrace.o(10813117038592L, 80564);
        }
      });
      this.jZE.izE.setText(String.format(getString(a.i.sYc), new Object[] { "¥" }));
      this.jZE.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(10834994528256L, 80727);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 2)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          GMTrace.o(10834994528256L, 80727);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(10834726092800L, 80725);
          GMTrace.o(10834726092800L, 80725);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(10834860310528L, 80726);
          GMTrace.o(10834860310528L, 80726);
        }
      });
      e(this.jZE, 2, false);
      findViewById(a.f.sEs);
      findViewById(a.f.sGF).setVisibility(0);
      this.onv.setVisibility(8);
      this.onw.setVisibility(0);
      this.mLW = new com.tencent.mm.wallet_core.ui.a()
      {
        public final void gU(boolean paramAnonymousBoolean)
        {
          GMTrace.i(10836068270080L, 80735);
          if (paramAnonymousBoolean)
          {
            RemittanceBaseUI.a(RemittanceBaseUI.this, RemittanceBaseUI.this.ola, RemittanceBaseUI.this.kES);
            GMTrace.o(10836068270080L, 80735);
            return;
          }
          RemittanceBaseUI.this.ola.scrollTo(0, 0);
          GMTrace.o(10836068270080L, 80735);
        }
      };
      break label324;
      label726:
      this.onr.setText(a.i.sXh);
    }
  }
  
  protected final void P(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10805466628096L, 80507);
    Object localObject;
    if (this.onk == 31)
    {
      localObject = this.onz;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        w.e("MicroMsg.RemittanceBaseUI", "msgxml is null");
      }
    }
    else
    {
      localObject = new PayInfo();
      ((PayInfo)localObject).eHG = paramString1;
      ((PayInfo)localObject).ePL = this.onk;
      if (this.mChannel > 0) {
        ((PayInfo)localObject).ePH = this.mChannel;
      }
      if ((this.gRb != 2) && (this.gRb != 5)) {
        break label386;
      }
    }
    label386:
    for (boolean bool = true;; bool = false)
    {
      paramString1 = new Bundle();
      paramString1.putString("extinfo_key_1", paramString2);
      paramString1.putString("extinfo_key_2", getIntent().getStringExtra("receiver_true_name"));
      paramString1.putString("extinfo_key_3", this.onx);
      paramString1.putBoolean("extinfo_key_4", bool);
      paramString1.putString("extinfo_key_5", getIntent().getStringExtra("receiver_tips"));
      paramString1.putString("extinfo_key_6", getIntent().getStringExtra("payer_desc"));
      paramString1.putString("extinfo_key_7", this.fLH);
      paramString1.putString("extinfo_key_8", getIntent().getStringExtra("rcvr_new_desc"));
      ((PayInfo)localObject).tIC = paramString1;
      paramString1 = new Intent();
      com.tencent.mm.plugin.wallet.a.a(this.onh, paramString1);
      com.tencent.mm.pluginsdk.wallet.g.a(this, false, "", (PayInfo)localObject, paramString3, paramString1, 1);
      GMTrace.o(10805466628096L, 80507);
      return;
      localObject = URLDecoder.decode((String)localObject);
      w.i("MicroMsg.RemittanceBaseUI", "helios:" + (String)localObject);
      String str = (String)bh.q((String)localObject, "msg").get(".msg.appmsg.wcpayinfo.transcationid");
      if (TextUtils.isEmpty(str))
      {
        w.e("MicroMsg.RemittanceBaseUI", "paymsgid count't be null in appmsg");
        break;
      }
      com.tencent.mm.plugin.remittance.c.r localr = com.tencent.mm.plugin.remittance.a.b.bbf().bbi();
      if ((bg.nm(str)) || (bg.nm((String)localObject)))
      {
        w.e(com.tencent.mm.plugin.remittance.c.r.TAG, "saveMsgContent param error");
        break;
      }
      localr.onb.put(str, localObject);
      break;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(10805600845824L, 80508);
    GMTrace.o(10805600845824L, 80508);
    return 1;
  }
  
  public abstract void bbC();
  
  protected final boolean bbF()
  {
    GMTrace.i(10805198192640L, 80505);
    if ((this.gRb == 0) || (this.gRb == 2))
    {
      GMTrace.o(10805198192640L, 80505);
      return true;
    }
    GMTrace.o(10805198192640L, 80505);
    return false;
  }
  
  protected void bbG()
  {
    GMTrace.i(10805735063552L, 80509);
    Intent localIntent = new Intent();
    localIntent.putExtra("recent_remittance_contact_list", com.tencent.mm.plugin.remittance.c.s.bbu());
    localIntent.setClass(this.vKB.vKW, SelectRemittanceContactUI.class);
    startActivityForResult(localIntent, 2);
    GMTrace.o(10805735063552L, 80509);
  }
  
  public abstract void bbw();
  
  public void bbx()
  {
    GMTrace.i(10803453362176L, 80492);
    j localj = new j(this.fKP, this.onl);
    localj.fXf = "RemittanceProcess";
    l(localj);
    GMTrace.o(10803453362176L, 80492);
  }
  
  public void bby()
  {
    GMTrace.i(10803721797632L, 80494);
    GMTrace.o(10803721797632L, 80494);
  }
  
  public abstract void bbz();
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10804795539456L, 80502);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof l))
      {
        paramString = (l)paramk;
        this.onz = paramString.omk;
        this.onA = paramString.omt;
        if (this.onh != null) {
          this.onh.j(10000, new Object[] { Integer.valueOf(this.onk), this.fKP, Double.valueOf(paramString.omw) });
        }
        if (!a(paramString)) {
          P(paramString.eJQ, this.fKP, this.onA);
        }
        paramk = new a(paramString.omu, paramString.jVR, paramString.jXz, paramString.omv, paramString.mFu, paramString.eRi, paramString.eRP, paramString.omz, bg.getLong(paramString.omx, 0L));
        this.onF.put(paramString.eJQ, paramk);
      }
      for (;;)
      {
        GMTrace.o(10804795539456L, 80502);
        return true;
        if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.s))
        {
          paramString = (com.tencent.mm.plugin.wallet_core.c.s)paramk;
          if (!bg.nm(paramString.rcD))
          {
            ((TextView)findViewById(a.f.sGT)).setText(paramString.rcD);
            paramk = findViewById(a.f.sHO);
            paramk.setVisibility(0);
            paramk.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(19337687597056L, 144077);
                a.a(RemittanceBaseUI.this, RemittanceBaseUI.this.gRb, RemittanceBaseUI.f(RemittanceBaseUI.this), RemittanceBaseUI.a(RemittanceBaseUI.this));
                if (RemittanceBaseUI.this.gRb == 1)
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(13), Integer.valueOf(1) });
                  GMTrace.o(19337687597056L, 144077);
                  return;
                }
                com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
                GMTrace.o(19337687597056L, 144077);
              }
            });
          }
          this.ony = paramString.ony;
          this.omp = paramString.omp;
          if (this.omp == 0.0D) {
            if (this.gRb == 1) {
              com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(14), Integer.valueOf(1) });
            } else {
              com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
            }
          }
        }
        else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
        {
          this.onB = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcF;
          this.onC = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcJ;
          this.onD = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcK;
          bbB();
          bbA();
        }
      }
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
    {
      w.i("MicroMsg.RemittanceBaseUI", "net error, use hardcode wording");
      this.onp.setText("");
      this.onp.setVisibility(8);
    }
    while ((!(paramk instanceof l)) || (!b((l)paramk)))
    {
      GMTrace.o(10804795539456L, 80502);
      return false;
    }
    GMTrace.o(10804795539456L, 80502);
    return true;
  }
  
  public abstract void dt(String paramString1, String paramString2);
  
  protected int getLayoutId()
  {
    GMTrace.i(10802916491264L, 80488);
    int i = a.g.sOz;
    GMTrace.o(10802916491264L, 80488);
    return i;
  }
  
  public void ib(String paramString)
  {
    GMTrace.i(10805869281280L, 80510);
    w.i("MicroMsg.RemittanceBaseUI", "onGet");
    if (bg.nl(paramString).length() <= 0)
    {
      w.e("MicroMsg.RemittanceBaseUI", "notifyChanged: user = " + paramString);
      GMTrace.o(10805869281280L, 80510);
      return;
    }
    if (paramString.equals(this.fKP)) {
      bbE();
    }
    GMTrace.o(10805869281280L, 80510);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10805332410368L, 80506);
    w.d("MicroMsg.RemittanceBaseUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.fKP);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(10805332410368L, 80506);
      return;
      if (paramInt2 == -1)
      {
        if ((this.onk != 33) && (this.onk != 32)) {
          com.tencent.mm.plugin.remittance.c.s.FE(this.fKP);
        }
        if (this.omp == 0.0D)
        {
          if (this.gRb != 1) {
            break label179;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(17), Integer.valueOf(1) });
        }
        for (;;)
        {
          finish();
          break;
          label179:
          com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(8), Integer.valueOf(1) });
        }
      }
      if (this.gRb == 1)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(16), Integer.valueOf(1) });
      }
      else
      {
        com.tencent.mm.plugin.report.service.g.ork.i(12689, new Object[] { Integer.valueOf(7), Integer.valueOf(1) });
        continue;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          String str = paramIntent.getStringExtra("Select_Conv_User");
          if (!bg.nm(str))
          {
            this.fKP = str;
            bbD();
          }
          else
          {
            finish();
          }
        }
        else
        {
          finish();
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10803184926720L, 80490);
    this.gRb = getIntent().getIntExtra("scene", 0);
    super.onCreate(paramBundle);
    this.onh = com.tencent.mm.plugin.wallet.a.X(getIntent());
    this.onk = getIntent().getIntExtra("pay_scene", 31);
    this.onl = getIntent().getStringExtra("scan_remittance_id");
    this.oni = getIntent().getDoubleExtra("fee", 0.0D);
    this.fKP = getIntent().getStringExtra("receiver_name");
    this.onj = getIntent().getStringExtra("receiver_nick_name");
    this.onA = getIntent().getStringExtra("receiver_true_name");
    this.mChannel = getIntent().getIntExtra("pay_channel", 0);
    if (bg.nm(this.fKP)) {
      bbG();
    }
    com.tencent.mm.kernel.h.xz();
    long l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(147457, Long.valueOf(0L))).longValue();
    if ((0x10 & l) != 0L) {
      this.onE = 1;
    }
    for (;;)
    {
      bbw();
      n.Dh().a(this);
      MP();
      this.onK.bPu();
      GMTrace.o(10803184926720L, 80490);
      return;
      if ((l & 0x20) != 0L) {
        this.onE = 2;
      } else {
        this.onE = 0;
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(10803319144448L, 80491);
    super.onDestroy();
    n.Dh().b(this);
    this.onK.dead();
    GMTrace.o(10803319144448L, 80491);
  }
  
  private static final class a
  {
    String eRP;
    String eRi;
    String jVR;
    String jXz;
    int mFu;
    String omu;
    String omv;
    String omz;
    long onQ;
    
    a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6, String paramString7, long paramLong)
    {
      GMTrace.i(20889378750464L, 155638);
      this.omu = paramString1;
      this.jVR = paramString2;
      this.jXz = paramString3;
      this.omv = paramString4;
      this.mFu = paramInt;
      this.eRi = paramString5;
      this.eRP = paramString6;
      this.omz = paramString7;
      this.onQ = paramLong;
      GMTrace.o(20889378750464L, 155638);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */