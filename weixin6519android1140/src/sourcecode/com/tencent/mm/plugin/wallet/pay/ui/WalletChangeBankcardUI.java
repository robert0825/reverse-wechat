package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sq;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletChangeBankcardUI
  extends WalletBaseUI
  implements a.a
{
  public static int qYQ;
  protected int ePL;
  protected TextView jHd;
  public String llG;
  protected Button oow;
  public Orders opK;
  public l qTS;
  public ArrayList<Bankcard> qTU;
  public Bankcard qTV;
  public Authen qXg;
  protected ListView qYR;
  public int qYS;
  public com.tencent.mm.plugin.wallet_core.ui.e qYT;
  public PayInfo qYU;
  protected String qYV;
  public FavorPayInfo qYW;
  private a qYX;
  com.tencent.mm.plugin.wallet_core.ui.c qYY;
  private com.tencent.mm.sdk.b.c qYZ;
  
  static
  {
    GMTrace.i(7805968842752L, 58159);
    qYQ = 1;
    GMTrace.o(7805968842752L, 58159);
  }
  
  public WalletChangeBankcardUI()
  {
    GMTrace.i(7802076528640L, 58130);
    this.ePL = 0;
    this.qTV = null;
    this.qYT = null;
    this.qXg = null;
    this.opK = null;
    this.qYU = null;
    this.qYV = null;
    this.qYY = null;
    this.qYZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7802076528640L, 58130);
  }
  
  private boolean bxm()
  {
    GMTrace.i(7802881835008L, 58136);
    if ((this.qYU != null) && (this.qYU.ePL != 11))
    {
      GMTrace.o(7802881835008L, 58136);
      return true;
    }
    GMTrace.o(7802881835008L, 58136);
    return false;
  }
  
  private ArrayList<Bankcard> iL(boolean paramBoolean)
  {
    GMTrace.i(7802613399552L, 58134);
    if (this.ePL == 8)
    {
      com.tencent.mm.plugin.wallet.a.p.bxd();
      localArrayList = com.tencent.mm.plugin.wallet.a.p.bxe().iT(paramBoolean);
      GMTrace.o(7802613399552L, 58134);
      return localArrayList;
    }
    com.tencent.mm.plugin.wallet.a.p.bxd();
    ArrayList localArrayList = com.tencent.mm.plugin.wallet.a.p.bxe().iL(paramBoolean);
    GMTrace.o(7802613399552L, 58134);
    return localArrayList;
  }
  
  private void wM(int paramInt)
  {
    GMTrace.i(7802210746368L, 58131);
    Object localObject = com.tencent.mm.wallet_core.a.ad(this);
    if (localObject != null) {
      ((com.tencent.mm.wallet_core.b)localObject).c(this, 1);
    }
    for (;;)
    {
      localObject = new sz();
      ((sz)localObject).eYt.result = -1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(7802210746368L, 58131);
      return;
      finish();
    }
  }
  
  public void JY(String paramString)
  {
    GMTrace.i(7804492447744L, 58148);
    this.qXg.red = paramString;
    label164:
    boolean bool;
    if (this.qTV != null)
    {
      this.ui.putString("key_mobile", this.qTV.field_mobile);
      this.ui.putParcelable("key_bankcard", this.qTV);
      this.qXg.nDu = this.qTV.field_bindSerial;
      this.qXg.nDt = this.qTV.field_bankcardType;
      if (this.qYW == null) {
        break label290;
      }
      this.qXg.rep = this.qYW.rgo;
      if (this.opK.rhw != null) {
        this.qXg.reo = this.opK.rhw.qXz;
      }
      if ((this.opK != null) && (this.opK.rcw == 3))
      {
        if (!this.qTV.byg()) {
          break label301;
        }
        this.qXg.eQl = 3;
        Bundle localBundle = this.ui;
        if (this.qTV.byg()) {
          break label313;
        }
        bool = true;
        label181:
        localBundle.putBoolean("key_is_oversea", bool);
      }
    }
    this.ui.putString("key_pwd1", paramString);
    this.ui.putParcelable("key_authen", this.qXg);
    paramString = com.tencent.mm.plugin.wallet.pay.a.a.a(this.qXg, this.opK, false);
    if (paramString != null)
    {
      paramString.fXf = "PayProcess";
      paramString.ui = this.ui;
      if ((this.qYU.ePL != 6) || (this.qYU.tIz != 100)) {
        break label318;
      }
    }
    label290:
    label301:
    label313:
    label318:
    for (paramString.gRb = 100;; paramString.gRb = this.qYU.ePL)
    {
      l(paramString);
      GMTrace.o(7804492447744L, 58148);
      return;
      this.qXg.rep = null;
      break;
      this.qXg.eQl = 6;
      break label164;
      bool = false;
      break label181;
    }
  }
  
  public final void MP()
  {
    GMTrace.i(7803150270464L, 58138);
    this.oow = ((Button)findViewById(a.f.sDE));
    this.oow.setEnabled(false);
    this.oow.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7792278634496L, 58057);
        WalletChangeBankcardUI.this.bxp();
        GMTrace.o(7792278634496L, 58057);
      }
    });
    if (bg.nm(this.ui.getString("key_pwd1"))) {
      this.oow.setText(a.i.cTM);
    }
    for (;;)
    {
      this.qYR = ((ListView)findViewById(a.f.ccZ));
      this.qYT = bxo();
      this.qYR.setAdapter(this.qYT);
      this.qYR.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(7814156124160L, 58220);
          WalletChangeBankcardUI.this.wN(paramAnonymousInt);
          GMTrace.o(7814156124160L, 58220);
        }
      });
      ar();
      GMTrace.o(7803150270464L, 58138);
      return;
      this.oow.setText(a.i.tfe);
    }
  }
  
  protected int Qf()
  {
    GMTrace.i(7805029318656L, 58152);
    GMTrace.o(7805029318656L, 58152);
    return 1;
  }
  
  public final boolean aNg()
  {
    GMTrace.i(7803821359104L, 58143);
    if (super.aNg())
    {
      GMTrace.o(7803821359104L, 58143);
      return true;
    }
    if ((this.qYU == null) || (!this.qYU.lNA))
    {
      GMTrace.o(7803821359104L, 58143);
      return false;
    }
    if (this.qYU.lNA)
    {
      GMTrace.o(7803821359104L, 58143);
      return true;
    }
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (!com.tencent.mm.plugin.wallet.a.p.bxe().byS())
    {
      GMTrace.o(7803821359104L, 58143);
      return false;
    }
    GMTrace.o(7803821359104L, 58143);
    return false;
  }
  
  protected final boolean aNj()
  {
    GMTrace.i(7805297754112L, 58154);
    GMTrace.o(7805297754112L, 58154);
    return true;
  }
  
  public final void ar()
  {
    GMTrace.i(7803418705920L, 58140);
    this.jHd = ((TextView)findViewById(a.f.swf));
    if ((this.qYW != null) && (!bg.nm(this.qYW.rgs)))
    {
      this.jHd.setVisibility(0);
      this.jHd.setText(this.qYW.rgs);
      GMTrace.o(7803418705920L, 58140);
      return;
    }
    if (this.ui.getInt("key_main_bankcard_state", 0) != 0)
    {
      this.jHd.setVisibility(0);
      this.jHd.setText(this.qYV);
      GMTrace.o(7803418705920L, 58140);
      return;
    }
    this.jHd.setVisibility(8);
    GMTrace.o(7803418705920L, 58140);
  }
  
  protected final void bxn()
  {
    GMTrace.i(7803016052736L, 58137);
    if (this.qTU != null) {
      Collections.sort(this.qTU, new Comparator() {});
    }
    GMTrace.o(7803016052736L, 58137);
  }
  
  public com.tencent.mm.plugin.wallet_core.ui.e bxo()
  {
    GMTrace.i(7803284488192L, 58139);
    bxn();
    com.tencent.mm.plugin.wallet_core.ui.e locale = new com.tencent.mm.plugin.wallet_core.ui.e(this, this.qTU, this.qYS, this.opK);
    GMTrace.o(7803284488192L, 58139);
    return locale;
  }
  
  public void bxp()
  {
    GMTrace.i(7804358230016L, 58147);
    w.d("MicroMsg.WalletSelectUseBankcardUI", "pay with old bankcard!");
    String str = this.ui.getString("key_pwd1");
    if (bg.nm(str))
    {
      sv(4);
      this.qTS = l.a(this, this.opK, this.qYW, this.qTV, this.qYU, new l.c()new View.OnClickListener
      {
        public final void a(String paramAnonymousString, FavorPayInfo paramAnonymousFavorPayInfo, boolean paramAnonymousBoolean)
        {
          GMTrace.i(7796170948608L, 58086);
          WalletChangeBankcardUI.this.qYW = paramAnonymousFavorPayInfo;
          WalletChangeBankcardUI.this.ui.putParcelable("key_favor_pay_info", WalletChangeBankcardUI.this.qYW);
          if ((WalletChangeBankcardUI.this.qYW != null) && (paramAnonymousBoolean))
          {
            if (WalletChangeBankcardUI.this.qYW != null)
            {
              WalletChangeBankcardUI.this.iM(true);
              WalletChangeBankcardUI.this.qYT.e(WalletChangeBankcardUI.this.qTU, false);
            }
            if (WalletChangeBankcardUI.this.qTS != null) {
              WalletChangeBankcardUI.this.qTS.dismiss();
            }
            WalletChangeBankcardUI.this.ar();
            WalletChangeBankcardUI.this.sv(0);
            GMTrace.o(7796170948608L, 58086);
            return;
          }
          WalletChangeBankcardUI.this.llG = paramAnonymousString;
          WalletChangeBankcardUI.this.aLo();
          WalletChangeBankcardUI.this.JY(paramAnonymousString);
          WalletChangeBankcardUI.this.qYY = null;
          GMTrace.o(7796170948608L, 58086);
        }
      }, new View.OnClickListener()new DialogInterface.OnCancelListener
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7790936457216L, 58047);
          if (WalletChangeBankcardUI.this.qTS != null) {
            WalletChangeBankcardUI.this.qTS.dismiss();
          }
          WalletChangeBankcardUI.this.iM(false);
          WalletChangeBankcardUI.this.qYT.e(WalletChangeBankcardUI.this.qTU, true);
          WalletChangeBankcardUI.this.qYW = ((FavorPayInfo)paramAnonymousView.getTag());
          if (WalletChangeBankcardUI.this.qYW != null) {
            WalletChangeBankcardUI.this.qYW.rgs = "";
          }
          WalletChangeBankcardUI.this.ui.putParcelable("key_favor_pay_info", WalletChangeBankcardUI.this.qYW);
          WalletChangeBankcardUI.this.ar();
          WalletChangeBankcardUI.this.sv(0);
          WalletChangeBankcardUI.this.qYY = null;
          GMTrace.o(7790936457216L, 58047);
        }
      }, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7800331698176L, 58117);
          if (paramAnonymousDialogInterface != null) {
            paramAnonymousDialogInterface.dismiss();
          }
          WalletChangeBankcardUI.this.llG = null;
          if (WalletChangeBankcardUI.b(WalletChangeBankcardUI.this).getVisibility() != 0) {
            WalletChangeBankcardUI.this.bxr();
          }
          WalletChangeBankcardUI.this.qYY = null;
          GMTrace.o(7800331698176L, 58117);
        }
      });
      this.qYY = this.qTS;
      GMTrace.o(7804358230016L, 58147);
      return;
    }
    JY(str);
    GMTrace.o(7804358230016L, 58147);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7804626665472L, 58149);
    GMTrace.o(7804626665472L, 58149);
    return true;
  }
  
  public final void bxr()
  {
    GMTrace.i(7804895100928L, 58151);
    cmm();
    com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.ad(this);
    if (localb != null)
    {
      localb.b(this, this.ui);
      GMTrace.o(7804895100928L, 58151);
      return;
    }
    finish();
    GMTrace.o(7804895100928L, 58151);
  }
  
  public final void c(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(7805431971840L, 58155);
    w.i("MicroMsg.WalletSelectUseBankcardUI", "onGenFinish callback");
    if (paramBoolean)
    {
      w.i("MicroMsg.WalletSelectUseBankcardUI", "onGenFinish callback, result.isSuccess is true");
      this.qYU.eJR = paramString1;
      this.qYU.eJS = paramString2;
      JY(this.llG);
      GMTrace.o(7805431971840L, 58155);
      return;
    }
    w.e("MicroMsg.WalletSelectUseBankcardUI", "onGenFinish callback, result.isSuccess is false");
    JY(this.llG);
    GMTrace.o(7805431971840L, 58155);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    boolean bool2 = false;
    GMTrace.i(7804224012288L, 58146);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.pay.a.b.e))
      {
        GMTrace.o(7804224012288L, 58146);
        return true;
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        paramString = this.ui;
        paramk = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramk;
        if (!bg.nm(this.llG)) {
          paramString.putString("key_pwd1", this.llG);
        }
        paramString.putString("kreq_token", paramk.token);
        paramString.putParcelable("key_authen", paramk.qYD);
        if (!paramk.qYB) {}
        for (bool1 = true;; bool1 = false)
        {
          paramString.putBoolean("key_need_verify_sms", bool1);
          paramString.putParcelable("key_pay_info", this.qYU);
          paramString.putInt("key_pay_flag", 3);
          Object localObject = paramk.nAD;
          if (localObject != null) {
            paramString.putParcelable("key_realname_guide_helper", (Parcelable)localObject);
          }
          localObject = new Bundle();
          ((Bundle)localObject).putString("pwd", this.llG);
          ((com.tencent.mm.pluginsdk.k)h.h(com.tencent.mm.pluginsdk.k.class)).a(paramk.bxi(), true, (Bundle)localObject);
          if (paramk.qZD)
          {
            paramString.putParcelable("key_orders", paramk.qYC);
            if ((this.qYU != null) && (this.qYU.ePL == 8))
            {
              paramk = new sq();
              paramk.eXX.eXY = this.qXg.nDu;
              com.tencent.mm.sdk.b.a.vgX.m(paramk);
            }
          }
          com.tencent.mm.wallet_core.a.i(this, paramString);
          GMTrace.o(7804224012288L, 58146);
          return true;
        }
      }
    }
    else
    {
      paramString = new Bundle();
      paramString.putString("pwd", this.llG);
      this.ui.putBoolean("key_need_verify_sms", false);
      paramk = (com.tencent.mm.pluginsdk.k)h.h(com.tencent.mm.pluginsdk.k.class);
      if (this.qXg.oek.tID != 1) {
        break label435;
      }
    }
    label435:
    for (boolean bool1 = true;; bool1 = false)
    {
      paramk.a(bool1, true, paramString);
      switch (paramInt2)
      {
      default: 
        GMTrace.o(7804224012288L, 58146);
        return false;
      }
    }
    this.qYU.tIF = paramInt2;
    bxp();
    GMTrace.o(7804224012288L, 58146);
    return true;
    this.qYU.tIF = paramInt2;
    bool1 = bool2;
    if (paramInt2 == 100100) {
      bool1 = true;
    }
    if (this.qYX == null) {
      this.qYX = new a(this, this);
    }
    this.qYX.a(bool1, this.qYU.eJP, this.qYU.eHG);
    w.i("MicroMsg.WalletSelectUseBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + bool1);
    GMTrace.o(7804224012288L, 58146);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7803955576832L, 58144);
    int i = a.g.sPf;
    GMTrace.o(7803955576832L, 58144);
    return i;
  }
  
  protected final void iM(boolean paramBoolean)
  {
    GMTrace.i(7805163536384L, 58153);
    this.qTU = iL(bxm());
    if (this.qYW != null) {
      if (this.qYW.rgp == 0) {
        break label58;
      }
    }
    label58:
    for (int i = 1; (i == 0) || (!paramBoolean); i = 0)
    {
      GMTrace.o(7805163536384L, 58153);
      return;
    }
    String str = this.qYW.rgq;
    ArrayList localArrayList = new ArrayList();
    i = 0;
    if (i < this.qTU.size())
    {
      Bankcard localBankcard = (Bankcard)this.qTU.get(i);
      if (bg.nm(str)) {
        if (!localBankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
          localArrayList.add(localBankcard);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (localBankcard.field_bankcardType.equals(str)) {
          localArrayList.add(localBankcard);
        }
      }
    }
    this.qTU = localArrayList;
    bxn();
    GMTrace.o(7805163536384L, 58153);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7802344964096L, 58132);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletSelectUseBankcardUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == qYQ) {
      wM(-1);
    }
    GMTrace.o(7802344964096L, 58132);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7802479181824L, 58133);
    super.onCreate(paramBundle);
    oM(a.i.tgs);
    paramBundle = this.ui;
    paramBundle.putInt("key_err_code", 0);
    this.qYS = paramBundle.getInt("key_support_bankcard", 1);
    this.qXg = ((Authen)paramBundle.getParcelable("key_authen"));
    this.opK = ((Orders)paramBundle.getParcelable("key_orders"));
    this.qYU = ((PayInfo)paramBundle.getParcelable("key_pay_info"));
    this.qYW = ((FavorPayInfo)paramBundle.getParcelable("key_favor_pay_info"));
    int i;
    if (this.qYU == null)
    {
      i = 0;
      this.ePL = i;
      w.i("MicroMsg.WalletSelectUseBankcardUI", "pay_scene %d", new Object[] { Integer.valueOf(this.ePL) });
      if (!this.ui.getBoolean("key_is_filter_bank_type")) {
        break label320;
      }
      iM(true);
    }
    for (;;)
    {
      if ((this.opK != null) && (this.opK.rhv != null) && (this.opK.rhv.size() > 0)) {
        this.qYV = getString(a.i.taS, new Object[] { com.tencent.mm.wallet_core.ui.e.d(this.opK.rhd, this.opK.nEr), ((Orders.Commodity)this.opK.rhv.get(0)).desc });
      }
      bxn();
      MP();
      com.tencent.mm.wallet_core.c.p.eP(7, 0);
      com.tencent.mm.sdk.b.a.vgX.b(this.qYZ);
      if ((this.ui.getBoolean("key_is_filter_bank_type")) && (this.qYT != null)) {
        this.qYT.rmo = false;
      }
      GMTrace.o(7802479181824L, 58133);
      return;
      i = this.qYU.ePL;
      break;
      label320:
      this.qTU = iL(bxm());
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7802747617280L, 58135);
    if (this.qYX != null)
    {
      this.qYX.bxl();
      this.qYX.release();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.qYZ);
    this.qYY = null;
    super.onDestroy();
    GMTrace.o(7802747617280L, 58135);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7804089794560L, 58145);
    if ((paramInt == 4) && (this.qYW != null) && (this.qTU.size() == 0))
    {
      Object localObject = this.qYW;
      int i;
      if ((localObject != null) && (((FavorPayInfo)localObject).rgp != 0)) {
        i = 1;
      }
      while (i != 0)
      {
        w.i("MicroMsg.WalletSelectUseBankcardUI", "favor need bankcard bind but usr cancel");
        localObject = this.ui.getString("key_is_cur_bankcard_bind_serial");
        if (bg.nm((String)localObject))
        {
          w.e("MicroMsg.WalletSelectUseBankcardUI", "curBankcardBindSerial null & finish");
          bool = super.onKeyUp(paramInt, paramKeyEvent);
          GMTrace.o(7804089794560L, 58145);
          return bool;
          i = 0;
        }
        else
        {
          ArrayList localArrayList = iL(true);
          if ((localArrayList != null) && (this.qTV == null))
          {
            i = 0;
            for (;;)
            {
              if (i < localArrayList.size())
              {
                if (((String)localObject).equals(((Bankcard)localArrayList.get(i)).field_bindSerial))
                {
                  w.i("MicroMsg.WalletSelectUseBankcardUI", "get cur bankcard, bind_serial:" + (String)localObject);
                  this.qTV = ((Bankcard)localArrayList.get(i));
                }
              }
              else
              {
                if (this.qTV != null) {
                  break;
                }
                w.e("MicroMsg.WalletSelectUseBankcardUI", "mDefaultBankcard still null & finish");
                bool = super.onKeyUp(paramInt, paramKeyEvent);
                GMTrace.o(7804089794560L, 58145);
                return bool;
              }
              i += 1;
            }
          }
          bxp();
          GMTrace.o(7804089794560L, 58145);
          return true;
        }
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7804089794560L, 58145);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(7805566189568L, 58156);
    super.onPause();
    if (this.qYY != null) {
      this.qYY.bzu();
    }
    GMTrace.o(7805566189568L, 58156);
  }
  
  public void onResume()
  {
    GMTrace.i(7803687141376L, 58142);
    this.ui.putInt("key_err_code", 0);
    super.onResume();
    if (this.qYY != null) {
      this.qYY.bzt();
    }
    GMTrace.o(7803687141376L, 58142);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(7804760883200L, 58150);
    if (paramInt == 0)
    {
      bxr();
      GMTrace.o(7804760883200L, 58150);
      return;
    }
    if (paramInt == 1)
    {
      this.ui.putString("key_pwd1", "");
      bxp();
      GMTrace.o(7804760883200L, 58150);
      return;
    }
    w.w("MicroMsg.WalletSelectUseBankcardUI", "hy: clean ui data not handled");
    GMTrace.o(7804760883200L, 58150);
  }
  
  protected void wN(int paramInt)
  {
    GMTrace.i(7803552923648L, 58141);
    if (this.qTU != null) {}
    for (int i = this.qTU.size(); (this.qTU != null) && (paramInt < i); i = 0)
    {
      Bankcard localBankcard = (Bankcard)this.qTU.get(paramInt);
      this.qTV = localBankcard;
      this.qYT.rmn = localBankcard.field_bindSerial;
      this.oow.setEnabled(true);
      this.qYT.notifyDataSetChanged();
      bxp();
      GMTrace.o(7803552923648L, 58141);
      return;
    }
    if (i == paramInt)
    {
      this.ui.putInt("key_err_code", 64533);
      com.tencent.mm.wallet_core.a.i(this, this.ui);
    }
    GMTrace.o(7803552923648L, 58141);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\WalletChangeBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */