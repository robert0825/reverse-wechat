package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.mv;
import com.tencent.mm.g.a.mv.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.q;

public class RemittanceDetailUI
  extends WalletBaseUI
{
  public TextView mNy;
  private String nEN;
  public TextView okD;
  private String onC;
  private int onD;
  public ImageView ooW;
  public TextView ooX;
  public Button ooY;
  public TextView ooZ;
  public TextView opa;
  public int opb;
  public int opc;
  public String opd;
  public String ope;
  public String opf;
  protected String opg;
  public int oph;
  protected boolean opi;
  protected int opj;
  private int opk;
  private com.tencent.mm.plugin.remittance.c.k opl;
  private c<mv> opm;
  
  public RemittanceDetailUI()
  {
    GMTrace.i(10810298466304L, 80543);
    this.ooW = null;
    this.ooX = null;
    this.okD = null;
    this.ooY = null;
    this.mNy = null;
    this.ooZ = null;
    this.opa = null;
    this.opd = null;
    this.ope = null;
    this.opf = null;
    this.opg = null;
    this.onC = null;
    this.oph = 3;
    this.opi = false;
    this.opm = new c() {};
    GMTrace.o(10810298466304L, 80543);
  }
  
  public static String ao(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10812043296768L, 80556);
    String str = com.tencent.mm.wallet_core.ui.e.fs(paramString);
    if (str == null)
    {
      GMTrace.o(10812043296768L, 80556);
      return "";
    }
    paramString = str;
    if (str.length() > 10)
    {
      paramString = str;
      if (paramBoolean) {
        paramString = str.substring(0, 8) + "...";
      }
    }
    GMTrace.o(10812043296768L, 80556);
    return paramString;
  }
  
  private void bbA()
  {
    GMTrace.i(10811372208128L, 80551);
    if ((this.opk != 0) && (this.onD == 1) && (!bg.nm(this.onC)))
    {
      a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17406160273408L, 129686);
          com.tencent.mm.wallet_core.ui.e.m(RemittanceDetailUI.this.vKB.vKW, RemittanceDetailUI.c(RemittanceDetailUI.this), false);
          GMTrace.o(17406160273408L, 129686);
          return false;
        }
      });
      GMTrace.o(10811372208128L, 80551);
      return;
    }
    w.i("MicroMsg.RemittanceDetailUI", "flag: %d, descUrl empty: %B", new Object[] { Integer.valueOf(this.opk), Boolean.valueOf(bg.nm(this.onC)) });
    this.vKB.bXE();
    GMTrace.o(10811372208128L, 80551);
  }
  
  protected final void MP()
  {
    GMTrace.i(10810701119488L, 80546);
    oM(a.i.sYv);
    this.ooW = ((ImageView)findViewById(a.f.sGt));
    this.ooX = ((TextView)findViewById(a.f.sGw));
    this.okD = ((TextView)findViewById(a.f.sGu));
    this.ooY = ((Button)findViewById(a.f.sGs));
    this.mNy = ((TextView)findViewById(a.f.sGv));
    this.ooZ = ((TextView)findViewById(a.f.sGx));
    this.opa = ((TextView)findViewById(a.f.sGy));
    GMTrace.o(10810701119488L, 80546);
  }
  
  public void T(Intent paramIntent)
  {
    GMTrace.i(10810969554944L, 80548);
    d.b(this, "remittance", ".ui.RemittanceResendMsgUI", paramIntent);
    GMTrace.o(10810969554944L, 80548);
  }
  
  public final void am(int paramInt, String paramString)
  {
    GMTrace.i(10811774861312L, 80554);
    Intent localIntent = new Intent();
    localIntent.putExtra("result_msg", paramString);
    setResult(paramInt, localIntent);
    finish();
    GMTrace.o(10811774861312L, 80554);
  }
  
  public void bbH()
  {
    GMTrace.i(10811103772672L, 80549);
    com.tencent.mm.plugin.remittance.c.k localk = new com.tencent.mm.plugin.remittance.c.k(this.opd, this.opf, this.opj, "confirm", this.ope, this.opb);
    localk.fXf = "RemittanceProcess";
    l(localk);
    GMTrace.o(10811103772672L, 80549);
  }
  
  public void bbI()
  {
    GMTrace.i(10811237990400L, 80550);
    com.tencent.mm.plugin.remittance.c.k localk = new com.tencent.mm.plugin.remittance.c.k(this.opd, this.opf, this.opj, "refuse", this.ope, this.opb);
    localk.fXf = "RemittanceProcess";
    l(localk);
    GMTrace.o(10811237990400L, 80550);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(10811506425856L, 80552);
    final boolean bool;
    if ((paramk instanceof com.tencent.mm.plugin.remittance.c.n))
    {
      final com.tencent.mm.plugin.remittance.c.n localn = (com.tencent.mm.plugin.remittance.c.n)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Object localObject;
        if (localn != null)
        {
          paramString = q.zE();
          bool = localn.omP.equals(paramString);
          this.ooY.setVisibility(8);
          this.okD.setText(com.tencent.mm.wallet_core.ui.e.d(localn.jWS, localn.nEr));
          paramk = localn.omT;
          paramString = paramk;
          if (!bg.nm(paramk))
          {
            paramString = paramk;
            if (paramk.contains("%s")) {
              paramString = paramk.trim().replace("%s", ao(localn.omP, true));
            }
          }
          paramk = localn.omU;
          localObject = new Bundle();
          ((Bundle)localObject).putString("transaction_id", this.opd);
          ((Bundle)localObject).putString("receiver_name", localn.omP);
          ((Bundle)localObject).putString("transfer_id", this.opf);
          ((Bundle)localObject).putInt("total_fee", this.opj);
          ((Bundle)localObject).putString("sender_name", this.ope);
          ((Bundle)localObject).putInt("invalid_time", this.opb);
          this.mNy.setClickable(true);
          this.ooX.setClickable(true);
          this.nEN = localn.omR;
          paramInt1 = localn.status;
          w.d("MicroMsg.RemittanceDetailUI", "status: %d", new Object[] { Integer.valueOf(paramInt1) });
        }
        switch (paramInt1)
        {
        default: 
          finish();
          this.opk = localn.omV;
          com.tencent.mm.kernel.h.xz();
          this.onC = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwe, ""));
          com.tencent.mm.kernel.h.xz();
          this.onD = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwf, Integer.valueOf(0))).intValue();
          if (bg.nm(this.onC))
          {
            com.tencent.mm.plugin.wallet_core.c.t.a(true, this.xEL);
            label399:
            bbA();
            if (localn.nEZ == 1)
            {
              com.tencent.mm.kernel.h.xz();
              if (!((String)com.tencent.mm.kernel.h.xy().xh().get(327729, "0")).equals("0")) {
                break label3064;
              }
              paramString = this.vKB.vKW;
              if (!q.zR()) {
                break label3057;
              }
              paramInt1 = a.i.sSl;
              label461:
              com.tencent.mm.ui.base.h.a(paramString, paramInt1, a.i.tfN, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(17405489184768L, 129681);
                  com.tencent.mm.ui.base.h.bm(RemittanceDetailUI.this.vKB.vKW, RemittanceDetailUI.this.getString(a.i.sXy));
                  GMTrace.o(17405489184768L, 129681);
                }
              });
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xy().xh().set(327729, "1");
            }
          }
          break;
        }
        for (;;)
        {
          GMTrace.o(10811506425856L, 80552);
          return true;
          if (!bool) {
            if ((!bg.nm(paramString)) && (!bg.nm(paramk)))
            {
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
              this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
              this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            }
          }
          com.tencent.mm.plugin.order.c.a locala;
          for (;;)
          {
            this.ooW.setImageResource(a.h.sQW);
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omO) }));
            this.ooZ.setVisibility(0);
            this.opa.setVisibility(8);
            break;
            paramString = getString(a.i.sXR, new Object[] { ao(localn.omP, true) });
            this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramString, this.ooX.getTextSize()));
            paramString = getString(a.i.sXX, new Object[] { Integer.valueOf(this.oph) });
            paramk = getString(a.i.sYq);
            localObject = new SpannableString(paramString + paramk);
            locala = new com.tencent.mm.plugin.order.c.a(this);
            locala.nHb = new com.tencent.mm.plugin.order.c.a.a()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(10819827924992L, 80614);
                com.tencent.mm.ui.base.h.a(RemittanceDetailUI.this, RemittanceDetailUI.this.getString(a.i.sXs), RemittanceDetailUI.this.getString(a.i.cUl), RemittanceDetailUI.this.getString(a.i.sYp), RemittanceDetailUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(17404549660672L, 129674);
                    paramAnonymous2DialogInterface = new Intent();
                    paramAnonymous2DialogInterface.putExtra("transaction_id", RemittanceDetailUI.this.opd);
                    paramAnonymous2DialogInterface.putExtra("receiver_name", RemittanceDetailUI.2.this.opq.omP);
                    RemittanceDetailUI.this.T(paramAnonymous2DialogInterface);
                    GMTrace.o(17404549660672L, 129674);
                  }
                }, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(17404281225216L, 129672);
                    GMTrace.o(17404281225216L, 129672);
                  }
                });
                GMTrace.o(10819827924992L, 80614);
              }
            };
            ((SpannableString)localObject).setSpan(locala, paramString.length(), paramString.length() + paramk.length(), 33);
            this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
            this.mNy.setText((CharSequence)localObject);
            continue;
            this.ooW.setImageResource(a.h.sQW);
            this.ooY.setVisibility(0);
            this.ooY.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(10819291054080L, 80610);
                com.tencent.mm.plugin.wallet_core.model.n.bys();
                if (!com.tencent.mm.plugin.wallet_core.model.n.a(RemittanceDetailUI.this, RemittanceDetailUI.b(RemittanceDetailUI.this), new com.tencent.mm.plugin.wallet_core.id_verify.util.a.a()
                {
                  public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
                  {
                    GMTrace.i(17409113063424L, 129708);
                    if (paramAnonymous2Int1 == 2)
                    {
                      RemittanceDetailUI.this.bbH();
                      GMTrace.o(17409113063424L, 129708);
                      return true;
                    }
                    if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Boolean)) {
                      RemittanceDetailUI.this.bbH();
                    }
                    GMTrace.o(17409113063424L, 129708);
                    return true;
                  }
                })) {
                  RemittanceDetailUI.this.bbH();
                }
                GMTrace.o(10819291054080L, 80610);
              }
            });
            if ((bg.nm(paramString)) || (bg.nm(paramk))) {
              break label956;
            }
            this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
            this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
            this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
          }
          label956:
          this.ooX.setText(a.i.sXQ);
          if (localn.omV != 0) {
            if (!bg.nm(localn.omU)) {
              paramString = localn.omU;
            }
          }
          for (;;)
          {
            paramk = getString(a.i.sXI);
            localObject = new SpannableString(paramString + paramk);
            locala = new com.tencent.mm.plugin.order.c.a(this);
            locala.nHb = new com.tencent.mm.plugin.order.c.a.a()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(10826673029120L, 80665);
                com.tencent.mm.ui.base.h.a(RemittanceDetailUI.this, RemittanceDetailUI.this.getString(a.i.sXE, new Object[] { RemittanceDetailUI.ao(localn.omR, false) }), RemittanceDetailUI.this.getString(a.i.cUl), RemittanceDetailUI.this.getString(a.i.sXJ), RemittanceDetailUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(17408844627968L, 129706);
                    RemittanceDetailUI.this.bbI();
                    GMTrace.o(17408844627968L, 129706);
                  }
                }, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(17405757620224L, 129683);
                    GMTrace.o(17405757620224L, 129683);
                  }
                });
                GMTrace.o(10826673029120L, 80665);
              }
            };
            ((SpannableString)localObject).setSpan(locala, paramString.length(), paramString.length() + paramk.length(), 33);
            this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
            this.mNy.setText((CharSequence)localObject);
            break;
            w.i("MicroMsg.RemittanceDetailUI", "use hardcode wording");
            if (localn.omV == 1) {}
            for (paramString = "24";; paramString = "2")
            {
              paramString = getString(a.i.sXS, new Object[] { paramString });
              paramk = getString(a.i.sXT, new Object[] { Integer.valueOf(this.oph) });
              paramString = paramString + paramk;
              break;
            }
            paramString = getString(a.i.sXT, new Object[] { Integer.valueOf(this.oph) });
          }
          this.ooW.setImageResource(a.h.sQT);
          if ((!bg.nm(paramString)) && (!bg.nm(paramk)))
          {
            this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
            this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
            this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
          }
          for (;;)
          {
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omO) }));
            this.ooZ.setVisibility(0);
            this.opa.setText(getString(a.i.sXA, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omS) }));
            this.opa.setVisibility(0);
            break;
            if (bool)
            {
              this.ooX.setText(a.i.sXL);
              paramString = new SpannableStringBuilder(getString(a.i.sXw));
              paramk = new com.tencent.mm.plugin.order.c.a(this);
              paramk.nHb = new com.tencent.mm.plugin.order.c.a.a()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(10813922344960L, 80570);
                  g.T(RemittanceDetailUI.this, 0);
                  GMTrace.o(10813922344960L, 80570);
                }
              };
              paramString.setSpan(paramk, 0, paramString.length(), 18);
              this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
              this.mNy.setText(paramString);
              this.mNy.setVisibility(0);
            }
            else
            {
              paramString = ao(localn.omP, true) + getString(a.i.sXL);
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramString, this.ooX.getTextSize()));
              this.mNy.setText(a.i.sXW);
              this.mNy.setVisibility(0);
            }
          }
          if ((paramInt1 == 2003) && (!bool))
          {
            this.ooW.setImageResource(a.h.sQV);
            if (!bg.nm(paramString))
            {
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
              this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              label1621:
              if (bool) {
                break label2104;
              }
              if (bg.nm(paramk)) {
                break label1898;
              }
              this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
              this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              label1671:
              this.mNy.setVisibility(0);
            }
          }
          for (;;)
          {
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omO) }));
            this.ooZ.setVisibility(0);
            this.opa.setText(getString(a.i.sXD, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omS) }));
            this.opa.setVisibility(0);
            break;
            this.ooX.setText(a.i.sXP);
            break label1621;
            this.ooW.setImageResource(a.h.sQU);
            if (!bg.nm(paramString))
            {
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
              this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              break label1621;
            }
            if (bool)
            {
              this.ooX.setText(a.i.sXN);
              break label1621;
            }
            paramString = ao(localn.omP, true) + getString(a.i.sXN);
            this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramString, this.ooX.getTextSize()));
            break label1621;
            label1898:
            if (("CFT".equals(localn.nEP)) || ("LQT".equals(localn.nEP)))
            {
              bool = "LQT".equals(localn.nEP);
              if (bool)
              {
                paramString = getString(a.i.sXH);
                label1952:
                if (!bool) {
                  break label2079;
                }
              }
              label2079:
              for (paramk = getString(a.i.sXx);; paramk = getString(a.i.sXw))
              {
                localObject = new SpannableString(paramString + paramk);
                locala = new com.tencent.mm.plugin.order.c.a(this);
                locala.nHb = new com.tencent.mm.plugin.order.c.a.a()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(10835799834624L, 80733);
                    if (bool)
                    {
                      d.x(RemittanceDetailUI.this, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
                      GMTrace.o(10835799834624L, 80733);
                      return;
                    }
                    g.T(RemittanceDetailUI.this, 0);
                    GMTrace.o(10835799834624L, 80733);
                  }
                };
                paramInt1 = paramString.length();
                paramInt2 = paramString.length();
                ((SpannableString)localObject).setSpan(locala, paramInt1, paramk.length() + paramInt2, 33);
                this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
                this.mNy.setText((CharSequence)localObject);
                break;
                paramString = getString(a.i.sXF);
                break label1952;
              }
            }
            this.mNy.setText(a.i.sXG);
            break label1671;
            label2104:
            this.mNy.setVisibility(8);
          }
          if (bool)
          {
            this.ooW.setImageResource(a.h.sQW);
            if ((!bg.nm(paramString)) && (!bg.nm(paramk)))
            {
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
              this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
              this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            }
          }
          for (;;)
          {
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omO) }));
            this.ooZ.setVisibility(0);
            this.opa.setText(getString(a.i.sXA, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omS) }));
            this.opa.setVisibility(0);
            break;
            if (!bg.nm(localn.omT)) {
              this.ooX.setText(localn.omT);
            }
            for (;;)
            {
              if (bg.nm(localn.omU)) {
                break label2358;
              }
              this.mNy.setText(localn.omU);
              break;
              this.ooX.setText(a.i.sXM);
            }
            label2358:
            this.mNy.setText(a.i.sXC);
            continue;
            this.ooW.setImageResource(a.h.sQW);
            if ((!bg.nm(paramString)) && (!bg.nm(paramk)))
            {
              this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
              this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
              this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
              this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            }
            else
            {
              if (!bg.nm(localn.omT)) {}
              for (;;)
              {
                try
                {
                  this.ooX.setText(String.format(localn.omT, new Object[] { ao(localn.omP, true) }));
                  if (bg.nm(localn.omU)) {
                    break label2586;
                  }
                  this.mNy.setText(localn.omU);
                }
                catch (Exception paramString)
                {
                  w.printErrStackTrace("MicroMsg.RemittanceDetailUI", paramString, "", new Object[0]);
                }
                this.ooX.setText(getString(a.i.sXO, new Object[] { ao(localn.omP, true) }));
              }
              label2586:
              this.mNy.setText("");
            }
          }
          this.ooW.setImageResource(a.h.sQS);
          if ((!bg.nm(paramString)) && (!bg.nm(paramk)))
          {
            this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramString, (int)this.ooX.getTextSize(), localObject));
            this.mNy.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, paramk, (int)this.mNy.getTextSize(), localObject));
            this.ooX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
            this.mNy.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
          }
          for (;;)
          {
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omO) }));
            this.ooZ.setVisibility(0);
            if (localn.omS <= 0) {
              break label3033;
            }
            this.opa.setText(getString(a.i.sXv, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(localn.omS) }));
            this.opa.setVisibility(0);
            break;
            if (!bg.nm(localn.omT))
            {
              this.ooX.setText(localn.omT);
              label2804:
              if (bg.nm(localn.omU)) {
                break label3002;
              }
              if ((!"CFT".equals(localn.nEP)) && (!"LQT".equals(localn.nEP))) {
                break label2987;
              }
              bool = "LQT".equals(localn.nEP);
              paramk = localn.omU;
              if (!bool) {
                break label2976;
              }
            }
            label2976:
            for (paramString = getString(a.i.sXx);; paramString = getString(a.i.sXw))
            {
              localObject = new SpannableStringBuilder();
              ((SpannableStringBuilder)localObject).append(paramk);
              ((SpannableStringBuilder)localObject).append(paramString);
              paramString = new com.tencent.mm.plugin.order.c.a(this);
              paramString.nHb = new com.tencent.mm.plugin.order.c.a.a()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(17403341701120L, 129665);
                  if (bool)
                  {
                    d.x(RemittanceDetailUI.this, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
                    GMTrace.o(17403341701120L, 129665);
                    return;
                  }
                  g.T(RemittanceDetailUI.this, 0);
                  GMTrace.o(17403341701120L, 129665);
                }
              };
              ((SpannableStringBuilder)localObject).setSpan(paramString, paramk.length(), ((SpannableStringBuilder)localObject).length(), 18);
              this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
              this.mNy.setText((CharSequence)localObject);
              break;
              this.ooX.setText(a.i.sXK);
              break label2804;
            }
            label2987:
            this.mNy.setText(localn.omU);
            continue;
            label3002:
            if (bool) {
              this.mNy.setText(a.i.sXB);
            } else {
              this.mNy.setText(a.i.sXV);
            }
          }
          label3033:
          this.opa.setVisibility(8);
          break;
          com.tencent.mm.plugin.wallet_core.c.t.a(false, this.xEL);
          break label399;
          label3057:
          paramInt1 = a.i.tfN;
          break label461;
          label3064:
          if (this.opk == 0) {
            com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(a.i.sXy));
          }
        }
      }
    }
    else
    {
      if ((paramk instanceof com.tencent.mm.plugin.remittance.c.k))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.opl = ((com.tencent.mm.plugin.remittance.c.k)paramk);
          if ("confirm".equals(this.opl.omh)) {
            tl(1);
          }
          for (;;)
          {
            GMTrace.o(10811506425856L, 80552);
            return true;
            am(0, getString(a.i.sXz));
          }
        }
        if (paramInt2 == 416)
        {
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_plugin", "remittance");
          paramString.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramInt2, paramk, paramString, 1008);
          GMTrace.o(10811506425856L, 80552);
          return bool;
        }
        am(paramInt2, paramString);
        GMTrace.o(10811506425856L, 80552);
        return true;
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.onC = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcJ;
          this.onD = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcK;
          bbA();
        }
        for (;;)
        {
          GMTrace.o(10811506425856L, 80552);
          return true;
          w.i("MicroMsg.RemittanceDetailUI", "net error");
        }
      }
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.e))
    {
      GMTrace.o(10811506425856L, 80552);
      return true;
    }
    GMTrace.o(10811506425856L, 80552);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(10811909079040L, 80555);
    Bundle localBundle = new Bundle();
    localBundle.putString("realname_verify_process_jump_plugin", "remittance");
    localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
    if ((this.opl != null) && (com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, this.opl, localBundle, true, null, 1008, 1)))
    {
      this.opl = null;
      GMTrace.o(10811909079040L, 80555);
      return;
    }
    super.finish();
    GMTrace.o(10811909079040L, 80555);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10811640643584L, 80553);
    int i = a.g.sOx;
    GMTrace.o(10811640643584L, 80553);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10810432684032L, 80544);
    super.onCreate(paramBundle);
    this.opb = getIntent().getIntExtra("invalid_time", 0);
    this.opc = getIntent().getIntExtra("appmsg_type", 0);
    this.opd = getIntent().getStringExtra("transaction_id");
    this.opg = getIntent().getStringExtra("bill_id");
    this.opf = getIntent().getStringExtra("transfer_id");
    this.ope = getIntent().getStringExtra("sender_name");
    this.oph = getIntent().getIntExtra("effective_date", 3);
    this.opi = getIntent().getBooleanExtra("is_sender", false);
    this.opj = getIntent().getIntExtra("total_fee", 0);
    MP();
    tl(0);
    com.tencent.mm.sdk.b.a.vgX.b(this.opm);
    GMTrace.o(10810432684032L, 80544);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17404683878400L, 129675);
    com.tencent.mm.sdk.b.a.vgX.c(this.opm);
    super.onDestroy();
    GMTrace.o(17404683878400L, 129675);
  }
  
  public void tl(int paramInt)
  {
    GMTrace.i(10810566901760L, 80545);
    b(new com.tencent.mm.plugin.remittance.c.n(paramInt, this.opd, this.opf, this.opb), true);
    GMTrace.o(10810566901760L, 80545);
  }
  
  public void tm(int paramInt)
  {
    GMTrace.i(10810835337216L, 80547);
    if (!getIntent().getBooleanExtra("is_sender", false)) {}
    for (com.tencent.mm.plugin.order.model.h localh = new com.tencent.mm.plugin.order.model.h(this.opf, this.opg, paramInt);; localh = new com.tencent.mm.plugin.order.model.h(this.opd, this.opg, paramInt))
    {
      localh.fXf = "RemittanceProcess";
      l(localh);
      GMTrace.o(10810835337216L, 80547);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */