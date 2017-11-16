package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.bankcard.a.h;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.a;
import com.tencent.mm.plugin.remittance.bankcard.model.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.c.wx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.sortview.d;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.g.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectBankUI
  extends BankRemitBaseUI
{
  private BankRemitSortView olD;
  
  public BankRemitSelectBankUI()
  {
    GMTrace.i(20934207471616L, 155972);
    GMTrace.o(20934207471616L, 155972);
  }
  
  protected final void MP()
  {
    GMTrace.i(20934475907072L, 155974);
    this.olD = ((BankRemitSortView)findViewById(a.f.ssi));
    this.olD.WC = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20942663188480L, 156035);
        paramAnonymousAdapterView = (eo)((d)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt)).data;
        if (paramAnonymousAdapterView != null)
        {
          paramAnonymousAdapterView = new BankcardElemParcel(paramAnonymousAdapterView);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("key_bank_card_elem_parcel", paramAnonymousAdapterView);
          BankRemitSelectBankUI.this.setResult(-1, paramAnonymousView);
          BankRemitSelectBankUI.this.finish();
          GMTrace.o(20942663188480L, 156035);
          return;
        }
        w.w("MicroMsg.BankRemitSelectBankUI", "bankcardelem is null, : %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(20942663188480L, 156035);
      }
    };
    GMTrace.o(20934475907072L, 155974);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(20934610124800L, 155975);
    if ((paramk instanceof h))
    {
      paramString = (h)paramk;
      paramString.a(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20932059987968L, 155956);
          ArrayList localArrayList = new ArrayList();
          paramAnonymousk = paramString.ojd.uoM;
          Object localObject = new b();
          if ((paramAnonymousk != null) && (!paramAnonymousk.isEmpty()))
          {
            w.i("MicroMsg.BankRemitSelectBankUI", "card count: %s", new Object[] { Integer.valueOf(paramAnonymousk.size()) });
            Collections.sort(paramAnonymousk, (Comparator)localObject);
            localObject = paramAnonymousk.iterator();
            while (((Iterator)localObject).hasNext())
            {
              eo localeo = (eo)((Iterator)localObject).next();
              if (!bg.nm(localeo.mhU))
              {
                if (!bg.nm(localeo.yvC)) {
                  w.i("MicroMsg.BankRemitSelectBankUI", "use sort pingyin: %s", new Object[] { localeo.yvC });
                }
                for (paramAnonymousk = localeo.yvC.toUpperCase().charAt(0);; paramAnonymousk = a.Fz(localeo.mhU))
                {
                  d locald = new d();
                  locald.wlE = paramAnonymousk;
                  locald.data = localeo;
                  localArrayList.add(locald);
                  break;
                }
              }
            }
          }
          BankRemitSelectBankUI.a(BankRemitSelectBankUI.this).cA(localArrayList);
          GMTrace.o(20932059987968L, 155956);
        }
      }).b(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20911524675584L, 155803);
          w.e("MicroMsg.BankRemitSelectBankUI", "response error: %s, %s", new Object[] { Integer.valueOf(paramString.ojd.jWs), paramString.ojd.jWt });
          if (!bg.nm(paramString.ojd.jWt)) {
            Toast.makeText(BankRemitSelectBankUI.this, paramString.ojd.jWt, 1).show();
          }
          GMTrace.o(20911524675584L, 155803);
        }
      }).c(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20922933182464L, 155888);
          w.e("MicroMsg.BankRemitSelectBankUI", "net error: %s", new Object[] { paramString });
          GMTrace.o(20922933182464L, 155888);
        }
      });
    }
    GMTrace.o(20934610124800L, 155975);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20934744342528L, 155976);
    int i = a.g.sLJ;
    GMTrace.o(20934744342528L, 155976);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20934341689344L, 155973);
    super.onCreate(paramBundle);
    oM(a.i.sSa);
    hN(1399);
    MP();
    w.i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
    l(new h());
    GMTrace.o(20934341689344L, 155973);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20934878560256L, 155977);
    super.onDestroy();
    hO(1399);
    GMTrace.o(20934878560256L, 155977);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitSelectBankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */