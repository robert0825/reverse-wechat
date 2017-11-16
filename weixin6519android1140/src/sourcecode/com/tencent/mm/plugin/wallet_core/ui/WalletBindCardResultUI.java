package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.ij.a;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.sp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.c.f;
import com.tencent.mm.plugin.wallet_core.c.n;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.model.m.a;
import com.tencent.mm.plugin.wallet_core.model.m.b;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(3)
public class WalletBindCardResultUI
  extends WalletBaseUI
{
  private c nCD;
  private String nFJ;
  private TextView opN;
  private String opd;
  private PayInfo qYU;
  private int rhb;
  private BindCardOrder rkI;
  private boolean rkJ;
  private String rkK;
  private String rkL;
  private m.b rkM;
  private WalletOrderInfoNewUI.b rkN;
  private HashMap<String, WalletOrderInfoNewUI.a> rkO;
  private String rkP;
  private BindCardOrder rkQ;
  private String rkR;
  private Button rkS;
  private ImageView rkT;
  private ViewGroup rkU;
  private CdnImageView rkV;
  private TextView rkW;
  private TextView rkX;
  private View rkY;
  private Button rkZ;
  private ViewGroup rla;
  private boolean rlb;
  private boolean rlc;
  private boolean rld;
  private b rle;
  
  public WalletBindCardResultUI()
  {
    GMTrace.i(20879983509504L, 155568);
    this.nFJ = null;
    this.rkJ = false;
    this.rkO = new HashMap();
    this.rkQ = null;
    this.rkR = "-1";
    this.rlb = false;
    this.rlc = false;
    this.rld = false;
    this.nCD = new c() {};
    GMTrace.o(20879983509504L, 155568);
  }
  
  private void Kz(String paramString)
  {
    GMTrace.i(20880923033600L, 155575);
    bzy();
    e.m(this, paramString, false);
    GMTrace.o(20880923033600L, 155575);
  }
  
  private void bzv()
  {
    GMTrace.i(20880520380416L, 155572);
    this.rla.setVisibility(0);
    GMTrace.o(20880520380416L, 155572);
  }
  
  private void bzw()
  {
    GMTrace.i(20880654598144L, 155573);
    this.opN.setText(this.rkI.yvq);
    GMTrace.o(20880654598144L, 155573);
  }
  
  private void bzx()
  {
    int i = 1;
    GMTrace.i(20880788815872L, 155574);
    this.rkU.setVisibility(4);
    this.rlc = false;
    this.rlb = false;
    if (this.rkI != null) {
      if (this.rkI.rfq != null)
      {
        w.i("MicroMsg.WalletBindCardResultUI", "activityPromotions: %s", new Object[] { this.rkQ });
        if ((this.rkI == null) || ((!this.rkI.byi()) && (!this.rkI.byj())) || (this.rkI.rfq.rgN <= 0L) || (bg.nm(this.rkI.rfr.rgT))) {
          break label859;
        }
        this.rkQ = this.rkI;
        this.rkY.setVisibility(8);
        this.rkV.twF = true;
        this.rkZ.setEnabled(true);
        this.rkZ.setBackgroundResource(a.e.aUF);
        this.rkX.setCompoundDrawables(null, null, null, null);
        localObject = (WalletOrderInfoNewUI.a)this.rkO.get(this.rkQ.rfq.rgN);
        if (localObject == null) {
          break label646;
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).eQA)) {
          this.rkV.setUrl(((WalletOrderInfoNewUI.a)localObject).eQA);
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).eLQ)) {
          this.rkW.setText(((WalletOrderInfoNewUI.a)localObject).eLQ);
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rnz))
        {
          this.rkZ.setText(((WalletOrderInfoNewUI.a)localObject).rnz);
          this.rkZ.setBackgroundResource(a.e.sph);
        }
        localLayoutParams = (RelativeLayout.LayoutParams)this.rkX.getLayoutParams();
        if ((localObject == null) || (bg.nm(((WalletOrderInfoNewUI.a)localObject).title))) {
          break label700;
        }
        this.rkX.setText(((WalletOrderInfoNewUI.a)localObject).title);
        localLayoutParams.addRule(15, 0);
        this.rkX.setLayoutParams(localLayoutParams);
        this.rkZ.setVisibility(0);
        this.rkZ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(20884412694528L, 155601);
            w.i("MicroMsg.WalletBindCardResultUI", "click activity button");
            WalletBindCardResultUI.b(WalletBindCardResultUI.this);
            GMTrace.o(20884412694528L, 155601);
          }
        });
        if (this.rkQ.rfq.rgO != 1L) {
          this.rkU.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(20885486436352L, 155609);
              w.i("MicroMsg.WalletBindCardResultUI", "click activity layout");
              WalletBindCardResultUI.b(WalletBindCardResultUI.this);
              GMTrace.o(20885486436352L, 155609);
            }
          });
        }
        localObject = this.rkR;
        switch (((String)localObject).hashCode())
        {
        default: 
          i = -1;
          switch (i)
          {
          default: 
            localObject = this.rkW.getText();
            if ((!bg.L((CharSequence)localObject)) && (((CharSequence)localObject).length() > 9))
            {
              this.rkW.setText(((CharSequence)localObject).subSequence(0, 9));
              this.rkW.append("...");
            }
            localObject = (ViewGroup.MarginLayoutParams)this.rkU.getLayoutParams();
            ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.br.a.fromDPToPix(this, 50);
            this.rkU.setLayoutParams((ViewGroup.LayoutParams)localObject);
            this.rkU.setVisibility(0);
          }
          break;
        }
      }
    }
    label569:
    label646:
    label700:
    label859:
    while ((this.rkI.rfs == null) || (bg.nm(this.rkI.rfs.rgY))) {
      for (;;)
      {
        RelativeLayout.LayoutParams localLayoutParams;
        if (this.rkW.getVisibility() == 0) {
          this.rkW.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20879849291776L, 155567);
              if ((WalletBindCardResultUI.g(WalletBindCardResultUI.this).getVisibility() == 0) && (WalletBindCardResultUI.h(WalletBindCardResultUI.this).getRight() >= WalletBindCardResultUI.g(WalletBindCardResultUI.this).getLeft()) && (!bg.L(WalletBindCardResultUI.h(WalletBindCardResultUI.this).getText())))
              {
                float f1 = WalletBindCardResultUI.h(WalletBindCardResultUI.this).getTextSize();
                w.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", new Object[] { Integer.valueOf(WalletBindCardResultUI.h(WalletBindCardResultUI.this).getRight()), Integer.valueOf(WalletBindCardResultUI.g(WalletBindCardResultUI.this).getLeft()) });
                Paint localPaint = new Paint();
                localPaint.setTextSize(f1);
                String str = WalletBindCardResultUI.h(WalletBindCardResultUI.this).getText().toString();
                f1 = localPaint.measureText(str);
                float f2 = WalletBindCardResultUI.h(WalletBindCardResultUI.this).getRight() - WalletBindCardResultUI.g(WalletBindCardResultUI.this).getLeft();
                int i = 1;
                while ((localPaint.measureText(str.substring(0, str.length() - i - 1)) > f1 - f2) && (i <= str.length() - 1)) {
                  i += 1;
                }
                w.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()) });
                WalletBindCardResultUI.h(WalletBindCardResultUI.this).setText(str.substring(0, str.length() - i - 1));
                WalletBindCardResultUI.h(WalletBindCardResultUI.this).append("...");
              }
              GMTrace.o(20879849291776L, 155567);
            }
          });
        }
        if (this.rkU.getVisibility() == 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.rkT.getLayoutParams();
          ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.br.a.fromDPToPix(this, 91);
          this.rkT.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        GMTrace.o(20880788815872L, 155574);
        return;
        this.rkV.setUrl(this.rkI.rfr.nIR);
        this.rkW.setText(this.rkI.rfr.name);
        this.rkZ.setText(this.rkI.rfr.rgT);
        continue;
        if (!bg.nm(this.rkI.rfr.title))
        {
          this.rkX.setText(this.rkI.rfr.title);
          localLayoutParams.addRule(15, 0);
        }
        else
        {
          this.rkX.setVisibility(8);
          localLayoutParams.addRule(15, -1);
          continue;
          if (((String)localObject).equals("0"))
          {
            i = 0;
            continue;
            if (((String)localObject).equals("-1"))
            {
              continue;
              if (((String)localObject).equals("3"))
              {
                i = 2;
                continue;
                if (((String)localObject).equals("4"))
                {
                  i = 3;
                  continue;
                  if (((String)localObject).equals("2"))
                  {
                    i = 4;
                    continue;
                    if (((String)localObject).equals("1"))
                    {
                      i = 5;
                      continue;
                      this.rkZ.setEnabled(false);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    Object localObject = this.rkI;
    if ((((BindCardOrder)localObject).jumpType == BindCardOrder.rfi) && (((BindCardOrder)localObject).rfs != null))
    {
      i = 1;
      label909:
      if (i == 0) {
        break label1369;
      }
      this.rkK = this.rkI.rfs.rgY;
      this.rkL = this.rkI.rfs.rgZ;
      this.rhb = this.rkI.rfs.rhb;
      this.rkM = this.rkI.rfs;
      this.rkV.setUrl(this.rkI.rfs.rgW);
      this.rkW.setText(this.rkI.rfs.rgX);
      this.rkX.setText(getString(a.i.sZb));
      this.rkX.setVisibility(0);
      this.rkV.twF = true;
      this.rkZ.setEnabled(true);
      this.rkZ.setBackgroundResource(a.e.aUF);
      localObject = (RelativeLayout.LayoutParams)this.rkX.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject).addRule(15, 0);
      this.rkX.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (this.rkI.rfq.rgN <= 0L) {
        break label1371;
      }
      if (!bg.nm(this.rkI.rfs.rha))
      {
        this.rkZ.setVisibility(0);
        this.rkZ.setText(this.rkI.rfs.rha);
        this.rkY.setVisibility(8);
      }
      localObject = (WalletOrderInfoNewUI.a)this.rkO.get(this.rkI.rfq.rgN);
      if (localObject != null)
      {
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rgW)) {
          this.rkV.setUrl(((WalletOrderInfoNewUI.a)localObject).rgW);
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rgX)) {
          this.rkW.setText(((WalletOrderInfoNewUI.a)localObject).rgX);
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rha))
        {
          this.rkZ.setText(((WalletOrderInfoNewUI.a)localObject).rha);
          this.rkZ.setBackgroundResource(a.e.sph);
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rgY)) {
          this.rkK = ((WalletOrderInfoNewUI.a)localObject).rgY;
        }
        if (!bg.nm(((WalletOrderInfoNewUI.a)localObject).rgZ)) {
          this.rkL = ((WalletOrderInfoNewUI.a)localObject).rgZ;
        }
      }
    }
    for (;;)
    {
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20885218000896L, 155607);
          w.i("MicroMsg.WalletBindCardResultUI", "click tiny app, userName: %s, path: %s, version: %s", new Object[] { WalletBindCardResultUI.c(WalletBindCardResultUI.this), WalletBindCardResultUI.d(WalletBindCardResultUI.this), Integer.valueOf(WalletBindCardResultUI.e(WalletBindCardResultUI.this)) });
          WalletBindCardResultUI.this.fm(2);
          paramAnonymousView = new qi();
          paramAnonymousView.eUY.userName = WalletBindCardResultUI.c(WalletBindCardResultUI.this);
          paramAnonymousView.eUY.eVa = bg.aq(WalletBindCardResultUI.d(WalletBindCardResultUI.this), "");
          paramAnonymousView.eUY.scene = 1034;
          paramAnonymousView.eUY.eVb = 0;
          if (WalletBindCardResultUI.e(WalletBindCardResultUI.this) > 0) {
            paramAnonymousView.eUY.eVc = WalletBindCardResultUI.e(WalletBindCardResultUI.this);
          }
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
          if ((!bg.nm(WalletBindCardResultUI.f(WalletBindCardResultUI.this).rfs.rha)) && (WalletBindCardResultUI.f(WalletBindCardResultUI.this).rfq.rgN > 0L))
          {
            WalletBindCardResultUI.a(WalletBindCardResultUI.this, true);
            GMTrace.o(20885218000896L, 155607);
            return;
          }
          WalletBindCardResultUI.a(WalletBindCardResultUI.this, false);
          GMTrace.o(20885218000896L, 155607);
        }
      };
      this.rkU.setOnClickListener((View.OnClickListener)localObject);
      this.rkZ.setOnClickListener((View.OnClickListener)localObject);
      localObject = this.rkW.getText();
      if ((bg.L((CharSequence)localObject)) || (((CharSequence)localObject).length() <= 9)) {
        break;
      }
      this.rkW.setText(((CharSequence)localObject).subSequence(0, 9));
      this.rkW.append("...");
      break;
      i = 0;
      break label909;
      label1369:
      break label569;
      label1371:
      this.rkZ.setVisibility(8);
      this.rkY.setVisibility(8);
    }
  }
  
  private void bzy()
  {
    int i = 0;
    GMTrace.i(20881862557696L, 155582);
    if (!this.rkJ)
    {
      ij localij = new ij();
      localij.eLM.eLN = 4;
      ij.a locala = localij.eLM;
      if (this.ui.getBoolean("intent_pay_end", false)) {
        i = -1;
      }
      locala.aGY = i;
      com.tencent.mm.sdk.b.a.vgX.m(localij);
      this.rkJ = true;
    }
    GMTrace.o(20881862557696L, 155582);
  }
  
  protected final void MP()
  {
    GMTrace.i(20880386162688L, 155571);
    if (cN().cO() != null) {
      cN().cO().hide();
    }
    this.rkT = ((ImageView)findViewById(a.f.sLs));
    this.opN = ((TextView)findViewById(a.f.sDJ));
    this.rkS = ((Button)findViewById(a.f.sDG));
    ld(false);
    le(false);
    String str = getString(a.i.cTh);
    if ((this.rkI != null) && (!bg.nm(this.rkI.rfl))) {
      this.rkS.setText(this.rkI.rfl);
    }
    for (;;)
    {
      this.rkS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20883875823616L, 155597);
          WalletBindCardResultUI.this.done();
          GMTrace.o(20883875823616L, 155597);
        }
      });
      this.rla = ((ViewGroup)findViewById(a.f.sJR));
      this.rkU = ((ViewGroup)findViewById(a.f.sHH));
      this.rkV = ((CdnImageView)findViewById(a.f.sHJ));
      this.rkV.twG = true;
      this.rkW = ((TextView)findViewById(a.f.sHG));
      this.rkX = ((TextView)findViewById(a.f.sHL));
      this.rkZ = ((Button)findViewById(a.f.sHE));
      this.rkY = findViewById(a.f.sHI);
      this.rla.setVisibility(4);
      bzw();
      bzx();
      bzv();
      if ((!bg.nm(this.rkI.yvr)) && (!bg.nm(this.rkI.yvs))) {
        ((TextView)findViewById(a.f.sDK)).setText(getString(a.i.sZV, new Object[] { this.rkI.yvr, this.rkI.yvs }));
      }
      GMTrace.o(20880386162688L, 155571);
      return;
      this.rkS.setText(str);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(20881996775424L, 155583);
    if ((paramk instanceof n)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (n)paramk;
        paramk = new WalletOrderInfoNewUI.a(paramString.mXK);
        if (this.rkN == null) {
          break label84;
        }
        this.rkO.put(paramString.rcA, paramk);
        bzx();
        bzv();
      }
    }
    label84:
    while (!(paramk instanceof f)) {
      for (;;)
      {
        GMTrace.o(20881996775424L, 155583);
        return false;
        if (this.rlb)
        {
          this.rkO.put(paramString.rcA, paramk);
          bzx();
          bzv();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (f)paramk;
      paramk = paramString.rcl;
      if ((this.rkQ != null) && (this.rkQ.rfq.rgN == paramString.rcn.rfq.rgN))
      {
        w.i("MicroMsg.WalletBindCardResultUI", "activityAwardState: %s", new Object[] { this.rkQ });
        this.rkR = paramk;
        bzx();
        bzv();
        if ((!bg.nm(paramString.jNb)) && (!"3".equals(paramk))) {
          this.rkZ.setText(paramString.jNb);
        }
      }
      if ((!"-1".equals(paramk)) && (!"0".equals(paramk)) && (!bg.nm(paramString.rcm))) {
        h.b(this, paramString.rcm, "", true);
      }
      while (!"0".equals(paramk))
      {
        GMTrace.o(20881996775424L, 155583);
        return true;
      }
      if (!bg.nm(paramString.rcm)) {}
      for (paramString = paramString.rcm;; paramString = getString(a.i.ted))
      {
        Toast.makeText(this, paramString, 0).show();
        break;
      }
    }
    paramk = paramString;
    if (bg.nm(paramString)) {
      paramk = getString(a.i.tgK);
    }
    h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20884144259072L, 155599);
        GMTrace.o(20884144259072L, 155599);
      }
    });
    GMTrace.o(20881996775424L, 155583);
    return true;
  }
  
  public final void done()
  {
    GMTrace.i(20881459904512L, 155579);
    Bundle localBundle = new Bundle();
    if (this.rle != null)
    {
      this.rle.a(this, 0, localBundle);
      GMTrace.o(20881459904512L, 155579);
      return;
    }
    finish();
    GMTrace.o(20881459904512L, 155579);
  }
  
  public final void fm(int paramInt)
  {
    GMTrace.i(20882265210880L, 155585);
    g localg = g.ork;
    if (this.rkI.rfq == null) {}
    for (String str = "";; str = bg.aq(this.rkI.rfq.rgN, ""))
    {
      localg.i(14877, new Object[] { str, this.rkI.rfn, Integer.valueOf(paramInt), this.rkI.nDt });
      GMTrace.o(20882265210880L, 155585);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20881325686784L, 155578);
    int i = a.g.sPa;
    GMTrace.o(20881325686784L, 155578);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20881057251328L, 155576);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletBindCardResultUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.WalletBindCardResultUI", "do query pay arawrd");
      l(new n(this.rkN.rcA, this.rkN.rnA, this.rkN.rnB, this.rkN.rnC, this.rkN.ril, this.rkN.rnD, this.rkI.nDt, this.rkI.rfn, this.rkI.rfo, this.rkI.rfo));
    }
    GMTrace.o(20881057251328L, 155576);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20880117727232L, 155569);
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (!com.tencent.mm.compatible.util.d.et(23)) {
        break label182;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      sv(4);
      com.tencent.mm.wallet_core.a.ad(this);
      this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
      this.ui.getInt("key_pay_type", -1);
      BindCardOrder localBindCardOrder = (BindCardOrder)this.ui.getParcelable("key_bindcard_value_result");
      paramBundle = localBindCardOrder;
      if (localBindCardOrder == null) {
        paramBundle = new BindCardOrder();
      }
      this.rkI = paramBundle;
      sv(0);
      MP();
      this.rle = cmp();
      bzw();
      fm(1);
      hN(1979);
      com.tencent.mm.sdk.b.a.vgX.b(this.nCD);
      this.rld = true;
      GMTrace.o(20880117727232L, 155569);
      return;
      label182:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(20881191469056L, 155577);
    Dialog localDialog = h.a(this.vKB.vKW, getString(a.i.tdn), getResources().getStringArray(a.b.slP), "", new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(20879580856320L, 155565);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(20879580856320L, 155565);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletBindCardResultUI.i(WalletBindCardResultUI.this)));
          localIntent.addFlags(268435456);
          WalletBindCardResultUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(20881191469056L, 155577);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(20881728339968L, 155581);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.nCD);
    hO(1979);
    GMTrace.o(20881728339968L, 155581);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(20881594122240L, 155580);
    if (paramInt == 4)
    {
      done();
      GMTrace.o(20881594122240L, 155580);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(20881594122240L, 155580);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(20880251944960L, 155570);
    super.onResume();
    w.i("MicroMsg.WalletBindCardResultUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", new Object[] { Boolean.valueOf(this.rld), this.rkQ, Boolean.valueOf(this.rlb), Boolean.valueOf(this.rlc), this.rkM });
    if (this.rld)
    {
      this.rld = false;
      GMTrace.o(20880251944960L, 155570);
      return;
    }
    if ((this.rkQ != null) && (this.rlc))
    {
      l(new n(this.rkQ.rfq.rgN, this.rkQ.rfq.rgP, this.rkQ.rfq.rgQ, this.rkQ.rfq.rgR, this.rkQ.rfq.rgO, this.rkQ.rfq.rgS, this.rkI.nDt, this.rkI.rfn, this.rkI.rfo, this.rkI.rfo));
      GMTrace.o(20880251944960L, 155570);
      return;
    }
    if ((this.rlb) && (this.rkM != null)) {
      l(new n(this.rkI.rfq.rgN, this.rkI.rfq.rgP, this.rkI.rfq.rgQ, this.rkI.rfq.rgR, this.rkI.rfq.rgS, this.rkI.rfq.rgO, this.rkI.nDt, this.rkI.rfn, this.rkI.rfo, this.rkI.rfo));
    }
    GMTrace.o(20880251944960L, 155570);
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(20882130993152L, 155584);
    this.vKB.hqF.setVisibility(paramInt);
    GMTrace.o(20882130993152L, 155584);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletBindCardResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */