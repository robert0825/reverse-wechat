package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.order.model.g;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.a;
import com.tencent.mm.plugin.wallet_payu.order.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.protocal.c.atd;
import com.tencent.mm.protocal.c.atn;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PayUMallOrderRecordListUI
  extends MallOrderRecordListUI
{
  public PayUMallOrderRecordListUI()
  {
    GMTrace.i(7939381264384L, 59153);
    GMTrace.o(7939381264384L, 59153);
  }
  
  protected final void aWR()
  {
    GMTrace.i(7939515482112L, 59154);
    hN(1519);
    hN(1544);
    GMTrace.o(7939515482112L, 59154);
  }
  
  protected final void aWS()
  {
    GMTrace.i(7939649699840L, 59155);
    hO(1519);
    hO(1544);
    GMTrace.o(7939649699840L, 59155);
  }
  
  protected final void aWT()
  {
    GMTrace.i(7939918135296L, 59157);
    l(new a(this.vq));
    GMTrace.o(7939918135296L, 59157);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7940186570752L, 59159);
    Object localObject;
    boolean bool;
    if ((paramk instanceof a))
    {
      if (this.llK != null)
      {
        this.llK.dismiss();
        this.llK = null;
      }
      paramString = (a)paramk;
      localObject = ((atd)paramString.fUa.gtD.gtK).uJa;
      paramk = new LinkedList();
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        atn localatn = (atn)((Iterator)localObject).next();
        i locali = new i();
        locali.lRT = localatn.lRT;
        locali.nFk = localatn.nFk;
        locali.nFl = localatn.nFl;
        locali.nFd = localatn.nFd;
        locali.nFg = localatn.nFg;
        locali.nFc = localatn.nFc;
        locali.nFj = "0";
        locali.nFf = localatn.nFf;
        locali.nFi = localatn.nFi;
        locali.nFo = 1;
        locali.nFn = localatn.nFn;
        locali.nFm = localatn.nFm;
        locali.nFh = localatn.nFh;
        locali.nFb = localatn.uIS;
        locali.nFe = localatn.nFe;
        locali.nFa = localatn.nFa;
        paramk.add(locali);
      }
      ba(paramk);
      bb(null);
      this.mCount = this.nGi.size();
      if (paramString.bAn() > this.mCount)
      {
        bool = true;
        this.mNh = bool;
        this.nGh.notifyDataSetChanged();
        w.d("MicroMsg.PayUMallOrderRecordListUI", "orders list count: " + this.mCount);
        w.d("MicroMsg.PayUMallOrderRecordListUI", "orders list total record: " + paramString.bAn());
        w.d("MicroMsg.PayUMallOrderRecordListUI", "orders list has more: " + this.mNh);
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7942736707584L, 59178);
            if (PayUMallOrderRecordListUI.a(PayUMallOrderRecordListUI.this))
            {
              w.v("MicroMsg.PayUMallOrderRecordListUI", "has more");
              if (!PayUMallOrderRecordListUI.b(PayUMallOrderRecordListUI.this))
              {
                PayUMallOrderRecordListUI.c(PayUMallOrderRecordListUI.this).bZZ();
                PayUMallOrderRecordListUI.e(PayUMallOrderRecordListUI.this).setAdapter(PayUMallOrderRecordListUI.d(PayUMallOrderRecordListUI.this));
                PayUMallOrderRecordListUI.f(PayUMallOrderRecordListUI.this);
              }
            }
            for (;;)
            {
              PayUMallOrderRecordListUI.h(PayUMallOrderRecordListUI.this).notifyDataSetChanged();
              GMTrace.o(7942736707584L, 59178);
              return;
              w.v("MicroMsg.PayUMallOrderRecordListUI", "no more! dismiss footer view!");
              PayUMallOrderRecordListUI.g(PayUMallOrderRecordListUI.this).caa();
            }
          }
        });
        this.jRF = false;
        label421:
        if ((this.mCount > 0) || (this.nGi.size() != 0)) {
          break label673;
        }
        lg(false);
        findViewById(a.f.svj).setVisibility(0);
      }
    }
    for (;;)
    {
      GMTrace.o(7940186570752L, 59159);
      return true;
      bool = false;
      break;
      if (!(paramk instanceof g)) {
        break label421;
      }
      if (this.llK != null)
      {
        this.llK.dismiss();
        this.llK = null;
      }
      paramString = (g)paramk;
      label545:
      if (paramString.aWM() == 2)
      {
        if (this.nGi != null) {
          this.nGi.clear();
        }
        this.mCount = 0;
        this.mNh = false;
        this.jRn.caa();
      }
      for (;;)
      {
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7941662965760L, 59170);
            PayUMallOrderRecordListUI.i(PayUMallOrderRecordListUI.this).notifyDataSetChanged();
            GMTrace.o(7941662965760L, 59170);
          }
        });
        break;
        paramString = paramString.aWN();
        w.d("MicroMsg.PayUMallOrderRecordListUI", "delete transId:" + paramString);
        if (!bg.nm(paramString))
        {
          paramk = this.nGi.iterator();
          if (paramk.hasNext())
          {
            localObject = (i)paramk.next();
            if (!paramString.equals(((i)localObject).nFa)) {
              break label545;
            }
            this.nGi.remove(localObject);
            this.mCount = this.nGi.size();
          }
        }
      }
      label673:
      lg(true);
      findViewById(a.f.svj).setVisibility(8);
    }
  }
  
  protected final void dj(String paramString1, String paramString2)
  {
    GMTrace.i(7939783917568L, 59156);
    l(new com.tencent.mm.plugin.wallet_payu.order.a.b(paramString1));
    GMTrace.o(7939783917568L, 59156);
  }
  
  protected final String sr(int paramInt)
  {
    GMTrace.i(7940052353024L, 59158);
    String str = e.a(paramInt, new SimpleDateFormat("dd MMMM", Locale.ENGLISH), new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH));
    GMTrace.o(7940052353024L, 59158);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\ui\PayUMallOrderRecordListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */