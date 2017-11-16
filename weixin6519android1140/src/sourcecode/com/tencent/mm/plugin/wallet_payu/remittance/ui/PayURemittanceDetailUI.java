package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.b;
import com.tencent.mm.plugin.wallet_payu.remittance.a.c;
import com.tencent.mm.plugin.wallet_payu.remittance.a.f;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;

public class PayURemittanceDetailUI
  extends RemittanceDetailUI
{
  private int nEJ;
  private int nEK;
  private String opL;
  private int opj;
  private String rvi;
  private String rvj;
  private int rvk;
  private int rvl;
  
  public PayURemittanceDetailUI()
  {
    GMTrace.i(7963674673152L, 59334);
    GMTrace.o(7963674673152L, 59334);
  }
  
  protected final void T(Intent paramIntent)
  {
    GMTrace.i(7964211544064L, 59338);
    d.b(this, "wallet_payu", ".remittance.ui.PayURemittanceResendMsgUI", paramIntent);
    GMTrace.o(7964211544064L, 59338);
  }
  
  protected final void bbH()
  {
    GMTrace.i(7964345761792L, 59339);
    l(new c(this.opf, this.opj, this.rvi, this.ope));
    GMTrace.o(7964345761792L, 59339);
  }
  
  protected final void bbI()
  {
    GMTrace.i(7964479979520L, 59340);
    l(new b(this.opf, this.opj, this.rvi, this.ope));
    GMTrace.o(7964479979520L, 59340);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7964614197248L, 59341);
    if ((paramk instanceof f))
    {
      paramString = (f)paramk;
      Object localObject1;
      Object localObject2;
      a locala;
      if (paramString.eHz == 0)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((this.opc == 1) && (!getIntent().getBooleanExtra("is_sender", false)))
          {
            this.ooW.setImageResource(a.e.spk);
            this.ooX.setText(a.i.sXQ);
            this.okD.setText(com.tencent.mm.wallet_core.ui.e.d(paramString.jWS, paramString.nEr));
            this.ooY.setVisibility(0);
            this.ooY.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(7967969640448L, 59366);
                PayURemittanceDetailUI.this.bbH();
                GMTrace.o(7967969640448L, 59366);
              }
            });
            paramk = getString(a.i.sXU, new Object[] { Integer.valueOf(this.oph) });
            localObject1 = getString(a.i.sXI);
            localObject2 = new SpannableString(paramk + (String)localObject1);
            locala = new a(this);
            locala.nHb = new a.a()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(7969580253184L, 59378);
                com.tencent.mm.ui.base.h.a(PayURemittanceDetailUI.this, PayURemittanceDetailUI.this.getString(a.i.sXE, new Object[] { PayURemittanceDetailUI.KL(PayURemittanceDetailUI.f(PayURemittanceDetailUI.this)) }), PayURemittanceDetailUI.this.getString(a.i.cUl), PayURemittanceDetailUI.this.getString(a.i.sXJ), PayURemittanceDetailUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(7969311817728L, 59376);
                    PayURemittanceDetailUI.this.bbI();
                    GMTrace.o(7969311817728L, 59376);
                  }
                }, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(7968506511360L, 59370);
                    GMTrace.o(7968506511360L, 59370);
                  }
                });
                GMTrace.o(7969580253184L, 59378);
              }
            };
            ((SpannableString)localObject2).setSpan(locala, paramk.length(), paramk.length() + ((String)localObject1).length(), 33);
            this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
            this.mNy.setText((CharSequence)localObject2);
            this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(paramString.omO) }));
            this.ooZ.setVisibility(0);
            this.opa.setVisibility(8);
          }
          GMTrace.o(7964614197248L, 59341);
          return true;
        }
        tm(0);
        GMTrace.o(7964614197248L, 59341);
        return true;
      }
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0)
        {
          this.rvk = paramString.status;
          this.rvl = paramString.omO;
          this.nEK = paramString.rve;
          this.nEJ = paramString.rvf;
          this.opj = ((int)(paramString.jWS * 100.0D));
          this.rvi = paramString.nEr;
          bool1 = true;
          paramk = q.zE();
          bool2 = this.opL.equals(paramk);
          this.ooY.setVisibility(8);
          this.okD.setText(com.tencent.mm.wallet_core.ui.e.d(this.opj / 100.0D, this.rvi));
          paramInt1 = this.rvk;
        }
      }
      switch (paramInt1)
      {
      default: 
        finish();
        if (paramString.eQl == 1)
        {
          com.tencent.mm.kernel.h.xz();
          if (!((String)com.tencent.mm.kernel.h.xy().xh().get(327729, "0")).equals("0")) {
            break label1569;
          }
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.sSl, a.i.tfN, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7966224809984L, 59353);
              com.tencent.mm.ui.base.h.bm(PayURemittanceDetailUI.this.vKB.vKW, PayURemittanceDetailUI.this.getString(a.i.sXy));
              GMTrace.o(7966224809984L, 59353);
            }
          });
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(327729, "1");
        }
        break;
      }
      for (;;)
      {
        GMTrace.o(7964614197248L, 59341);
        return bool1;
        if (!bool2)
        {
          paramk = getString(a.i.sXR, new Object[] { ao(this.opL, true) });
          this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramk, this.ooX.getTextSize()));
          paramk = getString(a.i.sXY, new Object[] { Integer.valueOf(this.oph) });
          localObject1 = getString(a.i.sYq);
          localObject2 = new SpannableString(paramk + (String)localObject1);
          locala = new a(this);
          locala.nHb = new a.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7969043382272L, 59374);
              com.tencent.mm.ui.base.h.a(PayURemittanceDetailUI.this, PayURemittanceDetailUI.this.getString(a.i.sXs), PayURemittanceDetailUI.this.getString(a.i.cUl), PayURemittanceDetailUI.this.getString(a.i.sYp), PayURemittanceDetailUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(7968238075904L, 59368);
                  paramAnonymous2DialogInterface = new Intent();
                  paramAnonymous2DialogInterface.putExtra("transaction_id", PayURemittanceDetailUI.a(PayURemittanceDetailUI.this));
                  paramAnonymous2DialogInterface.putExtra("receiver_name", PayURemittanceDetailUI.b(PayURemittanceDetailUI.this));
                  paramAnonymous2DialogInterface.putExtra("total_fee", PayURemittanceDetailUI.c(PayURemittanceDetailUI.this));
                  paramAnonymous2DialogInterface.putExtra("fee_type", PayURemittanceDetailUI.d(PayURemittanceDetailUI.this));
                  PayURemittanceDetailUI.this.T(paramAnonymous2DialogInterface);
                  GMTrace.o(7968238075904L, 59368);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(7966493245440L, 59355);
                  GMTrace.o(7966493245440L, 59355);
                }
              });
              GMTrace.o(7969043382272L, 59374);
            }
          };
          ((SpannableString)localObject2).setSpan(locala, paramk.length(), paramk.length() + ((String)localObject1).length(), 33);
          this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
          this.mNy.setText((CharSequence)localObject2);
        }
        for (;;)
        {
          this.ooW.setImageResource(a.e.spk);
          this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(this.nEK) }));
          this.ooZ.setVisibility(0);
          this.opa.setVisibility(8);
          bool1 = true;
          break;
          this.ooW.setImageResource(a.e.spk);
          this.ooY.setVisibility(0);
          this.ooY.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7970385559552L, 59384);
              PayURemittanceDetailUI.this.bbH();
              GMTrace.o(7970385559552L, 59384);
            }
          });
          paramk = getString(a.i.sXU, new Object[] { Integer.valueOf(this.oph) });
          localObject1 = getString(a.i.sXI);
          localObject2 = new SpannableString(paramk + (String)localObject1);
          locala = new a(this);
          locala.nHb = new a.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7971190865920L, 59390);
              com.tencent.mm.ui.base.h.a(PayURemittanceDetailUI.this, PayURemittanceDetailUI.this.getString(a.i.sXE, new Object[] { PayURemittanceDetailUI.KK(PayURemittanceDetailUI.e(PayURemittanceDetailUI.this)) }), PayURemittanceDetailUI.this.getString(a.i.cUl), PayURemittanceDetailUI.this.getString(a.i.sXJ), PayURemittanceDetailUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(7967030116352L, 59359);
                  PayURemittanceDetailUI.this.bbI();
                  GMTrace.o(7967030116352L, 59359);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(7968774946816L, 59372);
                  GMTrace.o(7968774946816L, 59372);
                }
              });
              GMTrace.o(7971190865920L, 59390);
            }
          };
          ((SpannableString)localObject2).setSpan(locala, paramk.length(), paramk.length() + ((String)localObject1).length(), 33);
          this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
          this.mNy.setText((CharSequence)localObject2);
        }
        this.ooW.setImageResource(a.h.sQT);
        if (bool2)
        {
          this.ooX.setText(a.i.sXL);
          paramk = getString(a.i.sXw);
          localObject1 = new SpannableString(paramk);
          localObject2 = new a(this);
          ((a)localObject2).nHb = new a.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7965956374528L, 59351);
              g.T(PayURemittanceDetailUI.this, 0);
              GMTrace.o(7965956374528L, 59351);
            }
          };
          ((SpannableString)localObject1).setSpan(localObject2, 0, paramk.length(), 33);
          this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
          this.mNy.setText((CharSequence)localObject1);
          this.mNy.setVisibility(0);
        }
        for (;;)
        {
          this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(this.rvl) }));
          this.ooZ.setVisibility(0);
          this.opa.setText(getString(a.i.sXA, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(this.nEJ) }));
          this.opa.setVisibility(0);
          bool1 = true;
          break;
          paramk = ao(this.opL, true) + " " + getString(a.i.sXL);
          this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramk, this.ooX.getTextSize()));
          this.mNy.setVisibility(8);
        }
        if ((paramInt1 == 2003) && (!bool2))
        {
          this.ooW.setImageResource(a.h.sQV);
          this.ooX.setText(a.i.sXP);
          label1267:
          if (bool2) {
            break label1556;
          }
          paramk = getString(a.i.sXF);
          localObject1 = getString(a.i.sXw);
          localObject2 = new SpannableString(paramk + (String)localObject1);
          locala = new a(this);
          locala.nHb = new a.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7966761680896L, 59357);
              g.T(PayURemittanceDetailUI.this, 0);
              GMTrace.o(7966761680896L, 59357);
            }
          };
          ((SpannableString)localObject2).setSpan(locala, paramk.length(), paramk.length() + ((String)localObject1).length(), 33);
          this.mNy.setMovementMethod(LinkMovementMethod.getInstance());
          this.mNy.setText((CharSequence)localObject2);
        }
        for (;;)
        {
          this.mNy.setVisibility(0);
          this.ooZ.setText(getString(a.i.sXZ, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(this.rvl) }));
          this.ooZ.setVisibility(0);
          this.opa.setText(getString(a.i.sXD, new Object[] { com.tencent.mm.wallet_core.ui.e.EO(this.nEK) }));
          this.opa.setVisibility(0);
          bool1 = true;
          break;
          this.ooW.setImageResource(a.h.sQU);
          if (bool2)
          {
            this.ooX.setText(a.i.sXN);
            break label1267;
          }
          paramk = ao(this.opL, true) + getString(a.i.sXN);
          this.ooX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, paramk, this.ooX.getTextSize()));
          break label1267;
          label1556:
          this.mNy.setText("");
        }
        label1569:
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(a.i.sXy));
      }
    }
    if (((paramk instanceof c)) || ((paramk instanceof b)))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((paramk instanceof c)) {
          tm(1);
        }
        for (;;)
        {
          GMTrace.o(7964614197248L, 59341);
          return true;
          am(0, getString(a.i.sXz));
        }
      }
      am(paramInt2, paramString);
      GMTrace.o(7964614197248L, 59341);
      return true;
    }
    GMTrace.o(7964614197248L, 59341);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7963808890880L, 59335);
    super.onCreate(paramBundle);
    this.opj = getIntent().getIntExtra("total_fee", 0);
    this.rvi = getIntent().getStringExtra("fee_type");
    if (getIntent().getBooleanExtra("is_sender", false))
    {
      this.rvj = q.zE();
      this.opL = this.ope;
      GMTrace.o(7963808890880L, 59335);
      return;
    }
    this.rvj = this.ope;
    this.opL = q.zE();
    GMTrace.o(7963808890880L, 59335);
  }
  
  protected final void tl(int paramInt)
  {
    GMTrace.i(7963943108608L, 59336);
    b(new f(this.opf, this.ope, this.opb), true);
    GMTrace.o(7963943108608L, 59336);
  }
  
  protected final void tm(int paramInt)
  {
    GMTrace.i(7964077326336L, 59337);
    b(new f(this.opf, this.ope, this.opb, 1, paramInt), true);
    GMTrace.o(7964077326336L, 59337);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\remittance\ui\PayURemittanceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */