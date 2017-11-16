package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.remittance.bankcard.a.d;
import com.tencent.mm.plugin.remittance.bankcard.a.m;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.protocal.c.art;
import com.tencent.mm.protocal.c.awl;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.protocal.c.li;
import com.tencent.mm.protocal.c.wv;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.wallet_core.c.g.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(1)
public class BankRemitBankcardInputUI
  extends BankRemitBaseUI
{
  private Button kES;
  private f mST;
  private CdnImageView ojB;
  private WalletFormView ojI;
  private WalletFormView ojJ;
  private WalletFormView ojK;
  private WalletFormView ojL;
  private ListPopupWindow ojM;
  private c ojN;
  private Filter.FilterListener ojO;
  private ArrayList<TransferRecordParcel> ojP;
  private ArrayList<TransferRecordParcel> ojQ;
  private String ojR;
  private String ojS;
  private String ojT;
  private String ojU;
  private String ojV;
  private String ojW;
  private EnterTimeParcel ojX;
  private BankcardElemParcel ojY;
  private TransferRecordParcel ojZ;
  private boolean oka;
  private boolean okb;
  private boolean okc;
  private boolean okd;
  private com.tencent.mm.plugin.remittance.bankcard.a.g oke;
  private boolean okf;
  private boolean okg;
  private boolean okh;
  
  public BankRemitBankcardInputUI()
  {
    GMTrace.i(20912464199680L, 155810);
    this.oka = true;
    this.okb = false;
    this.okc = false;
    this.okd = false;
    this.oke = null;
    this.okf = false;
    this.okg = false;
    this.okh = true;
    GMTrace.o(20912464199680L, 155810);
  }
  
  private void N(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20913672159232L, 155819);
    w.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", new Object[] { paramString1 });
    b(new com.tencent.mm.plugin.remittance.bankcard.a.a(paramString1, paramString2, paramString3), false);
    GMTrace.o(20913672159232L, 155819);
  }
  
  private static void a(TransferRecordParcel paramTransferRecordParcel, List<TransferRecordParcel> paramList)
  {
    GMTrace.i(20913403723776L, 155817);
    if (paramList != null)
    {
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.ojE.equals(paramTransferRecordParcel.ojE))
        {
          localTransferRecordParcel.ojH = paramTransferRecordParcel.ojH;
          GMTrace.o(20913403723776L, 155817);
          return;
        }
        i -= 1;
      }
    }
    GMTrace.o(20913403723776L, 155817);
  }
  
  private void bbk()
  {
    GMTrace.i(20913940594688L, 155821);
    if (this.ojZ != null)
    {
      this.ojI.setText(this.ojZ.ojG);
      this.okb = true;
      this.ojJ.setText(getString(a.i.sRG, new Object[] { this.ojZ.ojF }));
      this.ojK.setText(this.ojZ.mhU);
      this.ojB.setUrl(this.ojZ.ojk);
      this.ojJ.baB();
      this.ojJ.mS(false);
      this.okc = true;
      this.ojK.setClickable(false);
      this.okd = true;
    }
    GMTrace.o(20913940594688L, 155821);
  }
  
  private void bbl()
  {
    GMTrace.i(20914074812416L, 155822);
    if (this.ojY != null)
    {
      this.ojK.setText(this.ojY.mhU);
      this.ojB.setUrl(this.ojY.ojk);
    }
    GMTrace.o(20914074812416L, 155822);
  }
  
  private void bbm()
  {
    GMTrace.i(20914209030144L, 155823);
    if (this.ojX != null)
    {
      if (!bg.nm(this.ojX.gjg)) {
        this.ojL.ET(Color.parseColor(this.ojX.gjg));
      }
      for (;;)
      {
        this.ojL.setText(this.ojX.ojs);
        this.ojL.setVisibility(0);
        GMTrace.o(20914209030144L, 155823);
        return;
        this.ojL.ES(a.c.black);
      }
    }
    if (!bg.nm(this.ojY.ojn))
    {
      this.ojL.setText(this.ojY.ojn);
      if (!bg.nm(this.ojY.ojo)) {
        this.ojL.ET(Color.parseColor(this.ojY.ojo));
      }
      for (;;)
      {
        this.ojL.setVisibility(0);
        GMTrace.o(20914209030144L, 155823);
        return;
        this.ojL.ES(a.c.black);
      }
    }
    this.ojL.setVisibility(8);
    GMTrace.o(20914209030144L, 155823);
  }
  
  private void bbn()
  {
    GMTrace.i(20914343247872L, 155824);
    if (this.ojL.getVisibility() == 0)
    {
      this.ojK.setBackground(getResources().getDrawable(a.e.spg));
      GMTrace.o(20914343247872L, 155824);
      return;
    }
    this.ojK.setBackground(getResources().getDrawable(a.e.snM));
    GMTrace.o(20914343247872L, 155824);
  }
  
  private void bbo()
  {
    GMTrace.i(20914477465600L, 155825);
    if ((!bg.nm(this.ojI.getText())) && (!this.ojI.getText().trim().isEmpty()) && (!bg.nm(this.ojJ.getText())) && (!this.ojJ.getText().trim().isEmpty()) && (this.ojJ.QW()) && (!bg.nm(this.ojK.getText())) && (this.ojL.getVisibility() == 0) && (!bg.nm(this.ojL.getText())) && (this.ojY != null) && (bg.nm(this.ojY.ojp)))
    {
      this.kES.setEnabled(true);
      GMTrace.o(20914477465600L, 155825);
      return;
    }
    this.kES.setEnabled(false);
    GMTrace.o(20914477465600L, 155825);
  }
  
  private void bbp()
  {
    GMTrace.i(20914611683328L, 155826);
    if ((this.ojY != null) && (!bg.nm(this.ojY.ojn)))
    {
      this.ojX = null;
      GMTrace.o(20914611683328L, 155826);
      return;
    }
    if ((this.ojY != null) && (this.ojY.ojq != null))
    {
      Iterator localIterator = this.ojY.ojq.iterator();
      while (localIterator.hasNext())
      {
        EnterTimeParcel localEnterTimeParcel = (EnterTimeParcel)localIterator.next();
        if (localEnterTimeParcel.oju > 0)
        {
          this.ojX = localEnterTimeParcel;
          GMTrace.o(20914611683328L, 155826);
          return;
        }
      }
    }
    GMTrace.o(20914611683328L, 155826);
  }
  
  private void gT(boolean paramBoolean)
  {
    GMTrace.i(20913806376960L, 155820);
    w.i("MicroMsg.BankRemitBankcardInputUI", "do fetch transfer record: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      b(new m(), true);
      GMTrace.o(20913806376960L, 155820);
      return;
    }
    b(new m(), false);
    GMTrace.o(20913806376960L, 155820);
  }
  
  private static void j(String paramString, List<TransferRecordParcel> paramList)
  {
    GMTrace.i(20913537941504L, 155818);
    if (paramList != null)
    {
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.ojE.equals(paramString))
        {
          paramList.remove(localTransferRecordParcel);
          GMTrace.o(20913537941504L, 155818);
          return;
        }
        i -= 1;
      }
    }
    GMTrace.o(20913537941504L, 155818);
  }
  
  protected final void MP()
  {
    GMTrace.i(20912732635136L, 155812);
    this.ojI = ((WalletFormView)findViewById(a.f.sre));
    this.ojJ = ((WalletFormView)findViewById(a.f.srd));
    this.ojK = ((WalletFormView)findViewById(a.f.srb));
    this.ojB = ((CdnImageView)this.ojK.findViewById(a.f.sJG));
    this.ojL = ((WalletFormView)findViewById(a.f.sra));
    this.kES = ((Button)findViewById(a.f.srf));
    "\\x20\\t\\r\\n".toCharArray();
    this.ojI.a(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(20923470053376L, 155892);
        BankRemitBankcardInputUI.d(BankRemitBankcardInputUI.this);
        BankRemitBankcardInputUI.e(BankRemitBankcardInputUI.this);
        if ((BankRemitBankcardInputUI.f(BankRemitBankcardInputUI.this)) && (BankRemitBankcardInputUI.g(BankRemitBankcardInputUI.this) != null)) {
          BankRemitBankcardInputUI.i(BankRemitBankcardInputUI.this).getFilter().filter(paramAnonymousEditable.toString(), BankRemitBankcardInputUI.h(BankRemitBankcardInputUI.this));
        }
        for (;;)
        {
          if (BankRemitBankcardInputUI.j(BankRemitBankcardInputUI.this)) {
            BankRemitBankcardInputUI.k(BankRemitBankcardInputUI.this);
          }
          BankRemitBankcardInputUI.l(BankRemitBankcardInputUI.this);
          BankRemitBankcardInputUI.m(BankRemitBankcardInputUI.this);
          GMTrace.o(20923470053376L, 155892);
          return;
          BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, true);
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20923201617920L, 155890);
        GMTrace.o(20923201617920L, 155890);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20923335835648L, 155891);
        GMTrace.o(20923335835648L, 155891);
      }
    });
    this.ojI.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(20903605829632L, 155744);
        if (paramAnonymousInt == 5)
        {
          BankRemitBankcardInputUI.this.aLo();
          if (!BankRemitBankcardInputUI.n(BankRemitBankcardInputUI.this)) {
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20906961272832L, 155769);
                BankRemitBankcardInputUI.o(BankRemitBankcardInputUI.this);
                GMTrace.o(20906961272832L, 155769);
              }
            }, 200L);
          }
        }
        GMTrace.o(20903605829632L, 155744);
        return false;
      }
    });
    this.ojI.cmA();
    com.tencent.mm.wallet_core.ui.formview.a.a(this.ojJ);
    a(this.ojJ, 2, false, true);
    this.ojJ.a(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(20941589446656L, 156027);
        BankRemitBankcardInputUI.p(BankRemitBankcardInputUI.this);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20906424401920L, 155765);
            BankRemitBankcardInputUI.l(BankRemitBankcardInputUI.this);
            GMTrace.o(20906424401920L, 155765);
          }
        }, 200L);
        GMTrace.o(20941589446656L, 156027);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20941321011200L, 156025);
        GMTrace.o(20941321011200L, 156025);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20941455228928L, 156026);
        GMTrace.o(20941455228928L, 156026);
      }
    });
    this.ojK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20925617537024L, 155908);
        BankRemitBankcardInputUI.this.aLo();
        if (BankRemitBankcardInputUI.q(BankRemitBankcardInputUI.this))
        {
          paramAnonymousView = BankRemitBankcardInputUI.r(BankRemitBankcardInputUI.this).getText();
          String str = BankRemitBankcardInputUI.r(BankRemitBankcardInputUI.this).cmx();
          BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, paramAnonymousView, str);
          GMTrace.o(20925617537024L, 155908);
          return;
        }
        BankRemitBankcardInputUI.s(BankRemitBankcardInputUI.this);
        GMTrace.o(20925617537024L, 155908);
      }
    });
    this.ojL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20925885972480L, 155910);
        w.i("MicroMsg.BankRemitBankcardInputUI", "click arrive time et");
        BankRemitBankcardInputUI.this.aLo();
        BankRemitBankcardInputUI.r(BankRemitBankcardInputUI.this).baB();
        if (!BankRemitBankcardInputUI.t(BankRemitBankcardInputUI.this))
        {
          paramAnonymousView = new Intent(BankRemitBankcardInputUI.this.vKB.vKW, BankRemitSelectArriveTimeUI.class);
          if ((BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this) != null) && (BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this).ojq != null)) {
            paramAnonymousView.putParcelableArrayListExtra("key_arrive_time_parcel_list", BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this).ojq);
          }
          if (BankRemitBankcardInputUI.v(BankRemitBankcardInputUI.this) != null) {
            paramAnonymousView.putExtra("key_select_arrive_time", BankRemitBankcardInputUI.v(BankRemitBankcardInputUI.this).ojr);
          }
          BankRemitBankcardInputUI.this.startActivityForResult(paramAnonymousView, 3);
        }
        GMTrace.o(20925885972480L, 155910);
      }
    });
    this.kES.setOnClickListener(new r()
    {
      public final void aoJ()
      {
        GMTrace.i(20909242974208L, 155786);
        w.i("MicroMsg.BankRemitBankcardInputUI", "click next btn");
        BankRemitBankcardInputUI.this.aLo();
        BankRemitBankcardInputUI.w(BankRemitBankcardInputUI.this);
        if (BankRemitBankcardInputUI.t(BankRemitBankcardInputUI.this))
        {
          GMTrace.o(20909242974208L, 155786);
          return;
        }
        String str1 = BankRemitBankcardInputUI.x(BankRemitBankcardInputUI.this).getText();
        String str2 = BankRemitBankcardInputUI.r(BankRemitBankcardInputUI.this).getText();
        if ((bg.nm(str1)) || (str1.trim().isEmpty()) || (bg.nm(str2)) || (str2.trim().isEmpty()) || (BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this) == null))
        {
          w.w("MicroMsg.BankRemitBankcardInputUI", "args is empty, payeeName: %s, bankCardNo: %s, bankcard: %s", new Object[] { str1, str2, BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this) });
          GMTrace.o(20909242974208L, 155786);
          return;
        }
        if (BankRemitBankcardInputUI.j(BankRemitBankcardInputUI.this))
        {
          w.i("MicroMsg.BankRemitBankcardInputUI", "from record goto next direct");
          BankRemitBankcardInputUI.y(BankRemitBankcardInputUI.this);
          GMTrace.o(20909242974208L, 155786);
          return;
        }
        BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, str1, str2, BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this).mhU, BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this).nDt);
        GMTrace.o(20909242974208L, 155786);
      }
    });
    this.ojI.ogf.setVisibility(0);
    this.ojI.ogf.setClickable(true);
    this.ojI.ogf.setEnabled(true);
    this.ojI.ogf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20911256240128L, 155801);
        w.d("MicroMsg.BankRemitBankcardInputUI", "name iv click");
        if ((BankRemitBankcardInputUI.J(BankRemitBankcardInputUI.this)) || (!BankRemitBankcardInputUI.K(BankRemitBankcardInputUI.this))) {
          BankRemitBankcardInputUI.L(BankRemitBankcardInputUI.this);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(3) });
          GMTrace.o(20911256240128L, 155801);
          return;
          paramAnonymousView = new Intent(BankRemitBankcardInputUI.this.vKB.vKW, BankRemitSelectPayeeUI.class);
          if (BankRemitBankcardInputUI.E(BankRemitBankcardInputUI.this) != null) {
            paramAnonymousView.putParcelableArrayListExtra("key_self_transfer_record_list", BankRemitBankcardInputUI.E(BankRemitBankcardInputUI.this));
          }
          if (BankRemitBankcardInputUI.F(BankRemitBankcardInputUI.this) != null) {
            paramAnonymousView.putParcelableArrayListExtra("key_freq_transfer_record_list", BankRemitBankcardInputUI.F(BankRemitBankcardInputUI.this));
          }
          BankRemitBankcardInputUI.this.startActivityForResult(paramAnonymousView, 1);
        }
      }
    });
    bbo();
    GMTrace.o(20912732635136L, 155812);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(20912866852864L, 155813);
    if ((paramk instanceof com.tencent.mm.plugin.remittance.bankcard.a.a))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.a)paramk;
      if (!paramString.oiX.equals(this.ojZ.ojE))
      {
        w.i("MicroMsg.BankRemitBankcardInputUI", "outdated request: %s, %s", new Object[] { paramString.oiX, this.ojT });
        GMTrace.o(20912866852864L, 155813);
        return true;
      }
      paramString.a(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20925349101568L, 155906);
          BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, paramString.oiW.tRL);
          BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, new BankcardElemParcel(paramString.oiW.tRK));
          if (BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this) != null) {}
          for (paramAnonymousk = BankRemitBankcardInputUI.u(BankRemitBankcardInputUI.this).mhU;; paramAnonymousk = "")
          {
            w.i("MicroMsg.BankRemitBankcardInputUI", "response bank: %s", new Object[] { paramAnonymousk });
            BankRemitBankcardInputUI.z(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.A(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.B(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.C(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.l(BankRemitBankcardInputUI.this);
            GMTrace.o(20925349101568L, 155906);
            return;
          }
        }
      }).b(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20935281213440L, 155980);
          w.e("MicroMsg.BankRemitBankcardInputUI", "appoint reponse error: %s, msg: %s", new Object[] { Integer.valueOf(paramString.oiW.jWs), paramString.oiW.jWt });
          if (!bg.nm(paramString.oiW.jWt)) {
            Toast.makeText(BankRemitBankcardInputUI.this, paramString.oiW.jWt, 1).show();
          }
          GMTrace.o(20935281213440L, 155980);
        }
      }).c(new g.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(20905082224640L, 155755);
          w.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(20905082224640L, 155755);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(20912866852864L, 155813);
      return false;
      if ((paramk instanceof com.tencent.mm.plugin.remittance.bankcard.a.g))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.g)paramk;
        if (paramString == this.oke)
        {
          w.i("MicroMsg.BankRemitBankcardInputUI", "reset pending scene");
          this.oke = null;
        }
        if (!paramString.eDW.equals(this.ojJ.cmx()))
        {
          w.i("MicroMsg.BankRemitBankcardInputUI", "outdated card request: %s, %s", new Object[] { paramString.eDW, this.ojJ.cmx() });
          GMTrace.o(20912866852864L, 155813);
          return true;
        }
        paramString.a(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20908974538752L, 155784);
            BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, new BankcardElemParcel(paramString.ojc.tRK));
            BankRemitBankcardInputUI.z(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.A(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.B(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.C(BankRemitBankcardInputUI.this);
            BankRemitBankcardInputUI.l(BankRemitBankcardInputUI.this);
            GMTrace.o(20908974538752L, 155784);
          }
        }).b(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20940247269376L, 156017);
            w.e("MicroMsg.BankRemitBankcardInputUI", "bank info reponse error: %s, msg: %s", new Object[] { Integer.valueOf(paramString.ojc.jWs), paramString.ojc.jWt });
            BankRemitBankcardInputUI.s(BankRemitBankcardInputUI.this);
            GMTrace.o(20940247269376L, 156017);
          }
        }).c(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20906692837376L, 155767);
            w.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousk });
            GMTrace.o(20906692837376L, 155767);
          }
        });
      }
      else if ((paramk instanceof m))
      {
        paramString = (m)paramk;
        this.okg = true;
        paramString.a(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20903874265088L, 155746);
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, false);
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, paramString.oji.tRJ);
            w.d("MicroMsg.BankRemitBankcardInputUI", "timing_id: %s", new Object[] { BankRemitBankcardInputUI.D(BankRemitBankcardInputUI.this) });
            BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, TransferRecordParcel.bm(paramString.oji.uLF));
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, TransferRecordParcel.bm(paramString.oji.uLE));
            w.i("MicroMsg.BankRemitBankcardInputUI", "selfList: %d, freqList: %d", new Object[] { Integer.valueOf(BankRemitBankcardInputUI.E(BankRemitBankcardInputUI.this).size()), Integer.valueOf(BankRemitBankcardInputUI.F(BankRemitBankcardInputUI.this).size()) });
            BankRemitBankcardInputUI.G(BankRemitBankcardInputUI.this);
            GMTrace.o(20903874265088L, 155746);
          }
        }).b(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20926959714304L, 155918);
            w.e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", new Object[] { Integer.valueOf(paramString.oji.jWs), paramString.oji.jWt });
            if (!bg.nm(paramString.oji.jWt)) {
              Toast.makeText(BankRemitBankcardInputUI.this, paramString.oji.jWt, 1).show();
            }
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, true);
            GMTrace.o(20926959714304L, 155918);
          }
        }).c(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20908169232384L, 155778);
            w.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousk });
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, true);
            GMTrace.o(20908169232384L, 155778);
          }
        });
      }
      else if ((paramk instanceof d))
      {
        paramString = (d)paramk;
        paramString.a(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20911793111040L, 155805);
            BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, paramString.oiZ.tRL);
            BankRemitBankcardInputUI.c(BankRemitBankcardInputUI.this, paramString.oiZ.ojG);
            BankRemitBankcardInputUI.d(BankRemitBankcardInputUI.this, paramString.oiZ.ojE);
            BankRemitBankcardInputUI.e(BankRemitBankcardInputUI.this, paramString.oiZ.ojF);
            BankRemitBankcardInputUI.y(BankRemitBankcardInputUI.this);
            GMTrace.o(20911793111040L, 155805);
          }
        }).b(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20924946448384L, 155903);
            w.e("MicroMsg.BankRemitBankcardInputUI", "check response error: %s, %s", new Object[] { Integer.valueOf(paramString.oiZ.jWs), paramString.oiZ.jWt });
            if (!bg.nm(paramString.oiZ.jWt)) {
              Toast.makeText(BankRemitBankcardInputUI.this, paramString.oiZ.jWt, 1).show();
            }
            GMTrace.o(20924946448384L, 155903);
          }
        }).c(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20909511409664L, 155788);
            w.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousk });
            GMTrace.o(20909511409664L, 155788);
          }
        });
      }
      else if ((paramk instanceof com.tencent.mm.plugin.remittance.bankcard.a.k))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.k)paramk;
        paramString.a(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20922127876096L, 155882);
            BankRemitBankcardInputUI.f(BankRemitBankcardInputUI.this, paramString.ojg.uHP);
            GMTrace.o(20922127876096L, 155882);
          }
        }).b(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20910987804672L, 155799);
            w.e("MicroMsg.BankRemitBankcardInputUI", "operation response error: %s, %s", new Object[] { Integer.valueOf(paramString.ojg.jWs), paramString.ojg.jWt });
            if (!bg.nm(paramString.ojg.jWt)) {
              Toast.makeText(BankRemitBankcardInputUI.this, paramString.ojg.jWt, 1).show();
            }
            BankRemitBankcardInputUI.this.finish();
            GMTrace.o(20910987804672L, 155799);
          }
        }).c(new g.a()
        {
          public final void i(com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(20939710398464L, 156013);
            w.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousk });
            GMTrace.o(20939710398464L, 156013);
          }
        });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20913001070592L, 155814);
    int i = a.g.sLB;
    GMTrace.o(20913001070592L, 155814);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20913269506048L, 155816);
    Object localObject;
    if (paramInt1 == 1)
    {
      String str;
      Iterator localIterator;
      if (paramInt2 == -1)
      {
        this.oka = false;
        this.ojT = paramIntent.getStringExtra("key_bank_card_seqno");
        str = this.ojT;
        if (this.ojP == null) {
          break label244;
        }
        localIterator = this.ojP.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = (TransferRecordParcel)localIterator.next();
        } while (!((TransferRecordParcel)localObject).ojE.equals(str));
      }
      for (;;)
      {
        this.ojZ = ((TransferRecordParcel)localObject);
        bbk();
        bbo();
        if (this.ojZ != null) {
          N(this.ojZ.ojE, this.ojS, this.ojZ.nDt);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20900921475072L, 155724);
            BankRemitBankcardInputUI.x(BankRemitBankcardInputUI.this).baB();
            GMTrace.o(20900921475072L, 155724);
          }
        }, 50L);
        w.i("MicroMsg.BankRemitBankcardInputUI", "resultCode: %s", new Object[] { Integer.valueOf(paramInt2) });
        if (paramIntent == null) {
          break label530;
        }
        localObject = paramIntent.getStringArrayListExtra("key_delete_seq_no_list");
        paramIntent = paramIntent.getParcelableArrayListExtra("key_modified_record_list");
        if (localObject == null) {
          break;
        }
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str = (String)((Iterator)localObject).next();
          j(str, this.ojP);
          j(str, this.ojQ);
        }
        label244:
        if (this.ojQ != null)
        {
          localIterator = this.ojQ.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              localObject = (TransferRecordParcel)localIterator.next();
              if (((TransferRecordParcel)localObject).ojE.equals(str)) {
                break;
              }
            }
          }
        }
        localObject = null;
      }
      if (paramIntent != null)
      {
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          localObject = (TransferRecordParcel)paramIntent.next();
          a((TransferRecordParcel)localObject, this.ojP);
          a((TransferRecordParcel)localObject, this.ojQ);
        }
      }
      GMTrace.o(20913269506048L, 155816);
      return;
    }
    if (paramInt1 == 3)
    {
      if (paramInt2 == -1)
      {
        paramInt1 = paramIntent.getIntExtra("key_enter_time_scene", -1);
        paramIntent = this.ojY.ojq.iterator();
        while (paramIntent.hasNext())
        {
          localObject = (EnterTimeParcel)paramIntent.next();
          if (((EnterTimeParcel)localObject).ojr == paramInt1) {
            this.ojX = ((EnterTimeParcel)localObject);
          }
        }
        for (;;)
        {
          bbm();
          bbo();
          GMTrace.o(20913269506048L, 155816);
          return;
          w.w("MicroMsg.BankRemitBankcardInputUI", "can't find the right enter scene: %d", new Object[] { Integer.valueOf(paramInt1) });
        }
      }
    }
    else if (paramInt1 == 2)
    {
      if (paramInt2 == -1)
      {
        this.ojY = ((BankcardElemParcel)paramIntent.getParcelableExtra("key_bank_card_elem_parcel"));
        bbl();
        bbp();
        bbm();
        bbn();
        bbo();
        GMTrace.o(20913269506048L, 155816);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    label530:
    GMTrace.o(20913269506048L, 155816);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(20912598417408L, 155811);
    super.onCreate(paramBundle);
    MP();
    paramBundle = new sm();
    paramBundle.eXp.eXr = "12";
    paramBundle.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20899445080064L, 155713);
        if (!bg.nm(paramBundle.eXq.eXs)) {
          com.tencent.mm.wallet_core.ui.e.a((TextView)BankRemitBankcardInputUI.this.findViewById(a.f.sqJ), paramBundle.eXq.eXs, paramBundle.eXq.content, paramBundle.eXq.url);
        }
        GMTrace.o(20899445080064L, 155713);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    hN(1348);
    hN(1542);
    hN(1378);
    hN(1349);
    hN(1280);
    this.ojW = ((String)h.xy().xh().get(w.a.vzU, ""));
    gT(false);
    w.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
    b(new com.tencent.mm.plugin.remittance.bankcard.a.k(), false);
    oM(a.i.sSh);
    a(0, a.h.sQz, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20898908209152L, 155709);
        w.d("MicroMsg.BankRemitBankcardInputUI", "help click");
        BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this, new f(BankRemitBankcardInputUI.this.vKB.vKW, f.xpQ, false));
        BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this).qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(20907498143744L, 155773);
            paramAnonymous2n.add(0, 0, 0, BankRemitBankcardInputUI.this.getString(a.i.sRT));
            paramAnonymous2n.add(0, 1, 0, BankRemitBankcardInputUI.this.getString(a.i.sRR));
            GMTrace.o(20907498143744L, 155773);
          }
        };
        BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this).qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(20910719369216L, 155797);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(20910719369216L, 155797);
              return;
              if (!bg.nm(BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this))) {
                com.tencent.mm.wallet_core.ui.e.m(BankRemitBankcardInputUI.this.vKB.vKW, BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this), false);
              }
              for (;;)
              {
                com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(6) });
                GMTrace.o(20910719369216L, 155797);
                return;
                w.w("MicroMsg.BankRemitBankcardInputUI", "paylist url is null");
              }
              com.tencent.mm.wallet_core.ui.e.m(BankRemitBankcardInputUI.this.vKB.vKW, "https://kf.qq.com/touch/scene_product.html?scene_id=kf4449", true);
            }
          }
        };
        BankRemitBankcardInputUI.c(BankRemitBankcardInputUI.this);
        BankRemitBankcardInputUI.a(BankRemitBankcardInputUI.this).bFk();
        com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(2) });
        GMTrace.o(20898908209152L, 155709);
        return false;
      }
    });
    com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(1) });
    GMTrace.o(20912598417408L, 155811);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20913135288320L, 155815);
    super.onDestroy();
    hO(1348);
    hO(1542);
    hO(1378);
    hO(1349);
    hO(1280);
    GMTrace.o(20913135288320L, 155815);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitBankcardInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */