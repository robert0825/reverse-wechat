package com.tencent.mm.plugin.emoji.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.emoji.a.a.c;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class g
{
  private final String TAG;
  public Context iPn;
  public int kkA;
  public long kkB;
  public String kkC;
  public b kkD;
  private String kkE;
  private b kkF;
  public String kkG;
  public com.tencent.mm.plugin.emoji.a.a.a kkx;
  public boolean kky;
  public Fragment kkz;
  private Context sN;
  
  public g()
  {
    GMTrace.i(11303817052160L, 84220);
    this.TAG = "MicroMsg.emoji.PayOrDownloadComponent";
    this.kky = false;
    this.kkB = 0L;
    this.kkC = "";
    this.sN = ab.getContext();
    this.kkF = new b(2003);
    GMTrace.o(11303817052160L, 84220);
  }
  
  private void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11304085487616L, 84222);
    if (this.kkD != null) {
      this.kkD.H(paramString1, paramString2, paramString3);
    }
    GMTrace.o(11304085487616L, 84222);
  }
  
  private String getString(int paramInt)
  {
    GMTrace.i(11304488140800L, 84225);
    String str = this.sN.getString(paramInt);
    GMTrace.o(11304488140800L, 84225);
    return str;
  }
  
  private void wl(String paramString)
  {
    GMTrace.i(11304353923072L, 84224);
    if (!TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      h.a(this.iPn, paramString, "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11307709366272L, 84249);
          GMTrace.o(11307709366272L, 84249);
        }
      });
      GMTrace.o(11304353923072L, 84224);
      return;
      paramString = getString(R.l.doj);
    }
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    GMTrace.i(11303951269888L, 84221);
    if ((parama == null) || (parama.kfY == null) || (this.kkx == null) || (this.kkx.kho == null))
    {
      GMTrace.o(11303951269888L, 84221);
      return;
    }
    rh localrh = parama.kfY.khA;
    if (localrh == null)
    {
      GMTrace.o(11303951269888L, 84221);
      return;
    }
    Object localObject3 = localrh.tRS;
    String str2 = localrh.uhe;
    Object localObject2 = localrh.uhp;
    String str1 = localrh.uhq;
    int i = parama.apZ();
    Object localObject1;
    c localc;
    boolean bool1;
    boolean bool2;
    if (parama.kfY == null)
    {
      localObject1 = null;
      ((Integer)localObject1).intValue();
      localc = this.kkx.kho;
      bool1 = localc.khx;
      bool2 = parama.kfY.khE;
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        break label291;
      }
      localObject1 = "";
      label153:
      w.i("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { localObject3, localObject1, Integer.valueOf(i) });
      this.kkE = ((String)localObject3);
    }
    switch (i)
    {
    case 1: 
    case 2: 
    case 6: 
    case 8: 
    default: 
      w.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] unkonw product status");
    case 9: 
    case 0: 
    case 7: 
    case 4: 
    case 12: 
      do
      {
        do
        {
          GMTrace.o(11303951269888L, 84221);
          return;
          localObject1 = Integer.valueOf(parama.kfY.khC);
          break;
          localObject1 = localObject2;
          break label153;
          parama = new com.tencent.mm.plugin.emoji.f.q((String)localObject3, 2);
          at.wS().a(parama, 0);
          GMTrace.o(11303951269888L, 84221);
          return;
          if (this.kkx != null) {
            this.kkx.aN((String)localObject3, 3);
          }
          GMTrace.o(11303951269888L, 84221);
          return;
          if (bool2)
          {
            if (this.kkz != null)
            {
              i = 1;
              if (i == 0) {
                break label495;
              }
              parama = this.kkF;
              localObject1 = this.kkz;
              w.d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
              ((Intent)localObject2).putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
              d.a((Fragment)localObject1, ".ui.transmit.SelectConversationUI", (Intent)localObject2, parama.iAR);
              ((Fragment)localObject1).aG().overridePendingTransition(R.a.aLG, R.a.aLt);
            }
            for (;;)
            {
              this.kkF.kvx = ((String)localObject3);
              com.tencent.mm.plugin.report.service.g.ork.i(12069, new Object[] { Integer.valueOf(1), localObject3 });
              GMTrace.o(11303951269888L, 84221);
              return;
              i = 0;
              break;
              this.kkF.m((Activity)this.iPn);
            }
          }
        } while (!parama.kfY.khG);
        localObject1 = parama.kfY.khA.tRS;
        parama = parama.kfY.khA.uhe;
        localObject2 = this.kkG;
        if (this.iPn != null)
        {
          if (this.kkA == 9) {}
          for (i = 3;; i = 4)
          {
            localObject3 = new Intent();
            ((Intent)localObject3).setClass(this.iPn, EmojiStoreV2RewardUI.class);
            ((Intent)localObject3).putExtra("extra_id", (String)localObject1);
            ((Intent)localObject3).putExtra("extra_name", parama);
            ((Intent)localObject3).putExtra("name", (String)localObject2);
            ((Intent)localObject3).putExtra("scene", this.kkA);
            ((Intent)localObject3).putExtra("pageType", i);
            ((Intent)localObject3).putExtra("searchID", this.kkB);
            this.iPn.startActivity((Intent)localObject3);
            com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { localObject1, Integer.valueOf(i), Integer.valueOf(this.kkA), Integer.valueOf(0) });
            GMTrace.o(11303951269888L, 84221);
            return;
          }
        }
        w.i("MicroMsg.emoji.PayOrDownloadComponent", "start reward ui faild. context is null");
        GMTrace.o(11303951269888L, 84221);
        return;
      } while (this.kky);
      parama = new Intent();
      parama.putExtra("key_product_id", (String)localObject3);
      if (bool1)
      {
        parama.putExtra("key_currency_type", "");
        parama.putExtra("key_price", (String)localObject2);
      }
      for (;;)
      {
        d.b(this.iPn, "wallet_index", ".ui.WalletIapUI", parama, 2001);
        this.kky = true;
        com.tencent.mm.plugin.report.service.g.ork.i(12066, new Object[] { Integer.valueOf(2), Integer.valueOf(this.kkA), "", localObject3, Long.valueOf(this.kkB), this.kkC });
        GMTrace.o(11303951269888L, 84221);
        return;
        parama.putExtra("key_currency_type", str1);
        parama.putExtra("key_price", (String)localObject2);
      }
    case 3: 
    case 5: 
      if (com.tencent.mm.plugin.emoji.h.a.d(localrh))
      {
        com.tencent.mm.plugin.emoji.f.a.arq();
        com.tencent.mm.plugin.emoji.f.a.arr();
        GMTrace.o(11303951269888L, 84221);
        return;
      }
      H((String)localObject3, null, str2);
      if (this.kkx != null) {
        this.kkx.aO((String)localObject3, 0);
      }
      w.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { localObject3 });
      com.tencent.mm.plugin.report.service.g.ork.i(12066, new Object[] { Integer.valueOf(0), Integer.valueOf(this.kkA), "", localObject3, Long.valueOf(this.kkB), this.kkC });
      GMTrace.o(11303951269888L, 84221);
      return;
    case -1: 
      if (e.a(localrh)) {
        i = 3;
      }
      for (;;)
      {
        this.kkx.aN((String)localObject3, i);
        GMTrace.o(11303951269888L, 84221);
        return;
        if ((e.b(localrh)) || ((!bool1) && (TextUtils.isEmpty(localrh.uhh))))
        {
          i = 3;
        }
        else if (bool1)
        {
          parama = localc.vK((String)localObject3);
          if (TextUtils.isEmpty(parama.vAO)) {
            i = parama.vAM;
          } else {
            i = 4;
          }
        }
        else
        {
          i = 4;
        }
      }
    case 10: 
      label291:
      label495:
      parama = localc.vK((String)localObject3);
      if (parama != null) {
        switch (parama.vAN)
        {
        default: 
          parama = getString(R.l.dpI);
        }
      }
      for (;;)
      {
        h.b(this.iPn, parama, null, true);
        GMTrace.o(11303951269888L, 84221);
        return;
        parama = getString(R.l.dob);
        continue;
        parama = getString(R.l.dog);
        continue;
        parama = getString(R.l.dpE);
      }
    }
    w.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
    GMTrace.o(11303951269888L, 84221);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11304219705344L, 84223);
    w.d("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    String str1 = "";
    int i = 0;
    if (paramIntent != null)
    {
      i = paramIntent.getIntExtra("key_err_code", 0);
      w.w("MicroMsg.emoji.PayOrDownloadComponent", "errCode:" + i);
      str1 = paramIntent.getStringExtra("key_err_msg");
      w.w("MicroMsg.emoji.PayOrDownloadComponent", "errMsg:" + str1);
    }
    this.kky = false;
    if (paramInt2 != -1)
    {
      if (paramInt1 == 2001)
      {
        if (com.tencent.mm.y.q.zQ())
        {
          com.tencent.mm.plugin.report.service.g.ork.a(166L, 6L, 1L, false);
          GMTrace.o(11304219705344L, 84223);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 2L, 1L, false);
      }
      GMTrace.o(11304219705344L, 84223);
      return;
    }
    switch (paramInt1)
    {
    case 2002: 
    default: 
      w.e("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult unknow request");
      GMTrace.o(11304219705344L, 84223);
      return;
    case 2003: 
      str1 = this.kkF.kvx;
      if (bg.nm(str1))
      {
        GMTrace.o(11304219705344L, 84223);
        return;
      }
      b.a(paramIntent, str1, (Activity)this.iPn);
      com.tencent.mm.plugin.report.service.g.ork.i(12069, new Object[] { Integer.valueOf(3), str1 });
      GMTrace.o(11304219705344L, 84223);
      return;
    }
    if ((this.kkx == null) || (this.kkx.kho == null))
    {
      GMTrace.o(11304219705344L, 84223);
      return;
    }
    if ((paramIntent != null) && (i == 0))
    {
      ArrayList localArrayList = paramIntent.getStringArrayListExtra("key_response_product_ids");
      paramIntent = paramIntent.getStringArrayListExtra("key_response_series_ids");
      paramInt1 = 0;
      int j = localArrayList.size();
      paramInt2 = 0;
      if (paramInt2 < j)
      {
        String str2 = (String)localArrayList.get(paramInt2);
        String str3 = (String)paramIntent.get(paramInt2);
        ak localak = this.kkx.kho.vK(str2);
        if (this.kkE.equals(str2))
        {
          i = 1;
          H(str2, str3, localak.kry);
          this.kkx.aO(this.kkE, 0);
          h.bm(this.iPn, str1);
          w.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { str2 });
          paramInt1 = i;
          if (localArrayList.size() <= 1) {
            break label541;
          }
          w.i("MicroMsg.emoji.PayOrDownloadComponent", "some other product verify.");
          paramInt1 = i;
          if (this.kkD == null) {
            break label541;
          }
          this.kkD.ard();
          paramInt1 = 1;
        }
        label541:
        for (;;)
        {
          paramInt2 += 1;
          break;
          this.kkx.aN(this.kkE, 5);
        }
      }
      if (paramInt1 == 0) {
        wl(str1);
      }
      if (com.tencent.mm.y.q.zQ())
      {
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 4L, 1L, false);
        GMTrace.o(11304219705344L, 84223);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(166L, 0L, 1L, false);
      GMTrace.o(11304219705344L, 84223);
      return;
    }
    if ((paramIntent != null) && (i == 103))
    {
      paramIntent = this.kkx.kho.vK(this.kkE);
      H(this.kkE, null, paramIntent.kry);
      this.kkx.aO(this.kkE, 0);
      w.i("MicroMsg.emoji.PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { this.kkE });
      wl(str1);
      if (com.tencent.mm.y.q.zQ())
      {
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 7L, 1L, false);
        GMTrace.o(11304219705344L, 84223);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(166L, 3L, 1L, false);
      GMTrace.o(11304219705344L, 84223);
      return;
    }
    if ((paramIntent != null) && (i == 100000000))
    {
      if (com.tencent.mm.y.q.zQ()) {
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 6L, 1L, false);
      }
      for (;;)
      {
        w.i("MicroMsg.emoji.PayOrDownloadComponent", "user cancel pay emoji.");
        GMTrace.o(11304219705344L, 84223);
        return;
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 2L, 1L, false);
      }
    }
    if ((this.kkE == null) || (this.kkx == null) || (this.kkx.kho == null))
    {
      wl(str1);
      if (!com.tencent.mm.y.q.zQ()) {
        break label917;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(166L, 5L, 1L, false);
    }
    for (;;)
    {
      w.i("MicroMsg.emoji.PayOrDownloadComponent", "failed pay emoji. errormsg:%s", new Object[] { str1 });
      GMTrace.o(11304219705344L, 84223);
      return;
      this.kkx.kho.vI(this.kkE);
      paramIntent = this.kkx.vG(this.kkE);
      if (paramIntent == null) {
        break;
      }
      paramIntent.aqe();
      break;
      label917:
      com.tencent.mm.plugin.report.service.g.ork.a(166L, 1L, 1L, false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.mm.plugin.emoji.a.a parama);
  }
  
  public static abstract interface b
  {
    public abstract void H(String paramString1, String paramString2, String paramString3);
    
    public abstract void ard();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */