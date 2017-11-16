package com.tencent.mm.plugin.order.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.plugin.order.model.c;
import com.tencent.mm.plugin.order.model.d;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MallOrderRecordListUI
  extends WalletBaseUI
{
  public boolean jRF;
  public MMLoadMoreListView jRn;
  public Dialog llK;
  public int mCount;
  public ae mHandler;
  public boolean mNh;
  public a nGh;
  public List<i> nGi;
  protected String nGj;
  public boolean nGk;
  protected Map<String, String> nGl;
  public int vq;
  
  public MallOrderRecordListUI()
  {
    GMTrace.i(6657467744256L, 49602);
    this.mHandler = null;
    this.llK = null;
    this.nGh = null;
    this.nGi = new ArrayList();
    this.mNh = true;
    this.mCount = 0;
    this.vq = 0;
    this.nGj = null;
    this.nGk = false;
    this.jRF = false;
    this.nGl = new HashMap();
    GMTrace.o(6657467744256L, 49602);
  }
  
  private boolean EA(String paramString)
  {
    GMTrace.i(6658809921536L, 49612);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6658809921536L, 49612);
      return false;
    }
    int i = 0;
    while (i < this.nGi.size())
    {
      i locali = (i)this.nGi.get(i);
      if ((locali != null) && (paramString.equals(locali.nFa)))
      {
        GMTrace.o(6658809921536L, 49612);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6658809921536L, 49612);
    return false;
  }
  
  private static String cK(int paramInt1, int paramInt2)
  {
    GMTrace.i(6659346792448L, 49616);
    String str = paramInt1 + "-" + paramInt2;
    GMTrace.o(6659346792448L, 49616);
    return str;
  }
  
  protected final void MP()
  {
    GMTrace.i(6658541486080L, 49610);
    if ((com.tencent.mm.wallet_core.a.ad(this) instanceof com.tencent.mm.plugin.order.a.a))
    {
      this.jRF = true;
      aWT();
    }
    oM(a.i.sVu);
    this.jRn = ((MMLoadMoreListView)findViewById(a.f.sBp));
    this.nGh = new a();
    this.jRn.setAdapter(this.nGh);
    this.jRn.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6634784948224L, 49433);
        paramAnonymousAdapterView = MallOrderRecordListUI.this;
        if (paramAnonymousInt < paramAnonymousAdapterView.nGi.size())
        {
          paramAnonymousView = (i)paramAnonymousAdapterView.nGi.get(paramAnonymousInt);
          if (paramAnonymousView != null)
          {
            Bundle localBundle = paramAnonymousAdapterView.ui;
            localBundle.putString("key_trans_id", paramAnonymousView.nFa);
            localBundle.putInt("key_pay_type", paramAnonymousView.nFi);
            localBundle.putString("bill_id", paramAnonymousView.nFt);
            com.tencent.mm.wallet_core.a.i(paramAnonymousAdapterView, localBundle);
          }
        }
        com.tencent.mm.wallet_core.ui.e.EQ(26);
        GMTrace.o(6634784948224L, 49433);
      }
    });
    this.jRn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6652904341504L, 49568);
        if (paramAnonymousInt >= MallOrderRecordListUI.this.nGi.size())
        {
          GMTrace.o(6652904341504L, 49568);
          return true;
        }
        h.a(MallOrderRecordListUI.this, MallOrderRecordListUI.this.getResources().getString(a.i.tdC), null, MallOrderRecordListUI.this.getResources().getString(a.i.cSt), new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(6654649171968L, 49581);
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(6654649171968L, 49581);
              return;
              i locali = (i)MallOrderRecordListUI.this.nGi.get(paramAnonymousInt);
              if (locali != null)
              {
                String str = locali.nFa;
                MallOrderRecordListUI.this.dj(str, locali.nFt);
              }
            }
          }
        });
        GMTrace.o(6652904341504L, 49568);
        return true;
      }
    });
    this.jRn.wdv = new MMLoadMoreListView.a()
    {
      public final void anO()
      {
        GMTrace.i(6639482568704L, 49468);
        if (!MallOrderRecordListUI.this.jRF)
        {
          MallOrderRecordListUI.this.jRF = true;
          MallOrderRecordListUI localMallOrderRecordListUI = MallOrderRecordListUI.this;
          localMallOrderRecordListUI.vq += 10;
          MallOrderRecordListUI.this.aWT();
        }
        GMTrace.o(6639482568704L, 49468);
      }
    };
    final Object localObject = new sm();
    ((sm)localObject).eXp.eXr = "6";
    ((sm)localObject).eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6635053383680L, 49435);
        if (!bg.nm(localObject.eXq.eXs))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)MallOrderRecordListUI.this.findViewById(a.f.sqJ), localObject.eXq.eXs, localObject.eXq.content, localObject.eXq.url);
          GMTrace.o(6635053383680L, 49435);
          return;
        }
        w.i("MicroMsg.WalletOrderListUI", "no bulletin data");
        GMTrace.o(6635053383680L, 49435);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.plugin.order.a.b.aWE().aic();
    this.nGh.notifyDataSetChanged();
    localObject = com.tencent.mm.plugin.report.service.g.ork;
    com.tencent.mm.plugin.order.a.b.aWE();
    ((com.tencent.mm.plugin.report.service.g)localObject).i(11036, new Object[] { Integer.valueOf(com.tencent.mm.plugin.order.a.b.aWH().aWL()) });
    GMTrace.o(6658541486080L, 49610);
  }
  
  public void aWR()
  {
    GMTrace.i(6657870397440L, 49605);
    hN(388);
    hN(389);
    GMTrace.o(6657870397440L, 49605);
  }
  
  public void aWS()
  {
    GMTrace.i(6658004615168L, 49606);
    hO(388);
    hO(389);
    GMTrace.o(6658004615168L, 49606);
  }
  
  public void aWT()
  {
    GMTrace.i(6658407268352L, 49609);
    l(new com.tencent.mm.plugin.order.model.e(this.vq, this.nGj));
    GMTrace.o(6658407268352L, 49609);
  }
  
  public final void ba(List<i> paramList)
  {
    GMTrace.i(6658675703808L, 49611);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(6658675703808L, 49611);
      return;
    }
    if (this.nGi == null) {
      this.nGi = new ArrayList();
    }
    int i = 0;
    while (i < paramList.size())
    {
      i locali = (i)paramList.get(i);
      if (!EA(locali.nFa)) {
        this.nGi.add(locali);
      }
      i += 1;
    }
    GMTrace.o(6658675703808L, 49611);
  }
  
  public final void bb(List<d> paramList)
  {
    GMTrace.i(6659212574720L, 49615);
    if (paramList == null)
    {
      GMTrace.o(6659212574720L, 49615);
      return;
    }
    int i = 0;
    while (i < paramList.size())
    {
      d locald = (d)paramList.get(i);
      if (locald != null)
      {
        String str = cK(locald.year, locald.month);
        this.nGl.put(str, locald.nEU);
      }
      i += 1;
    }
    GMTrace.o(6659212574720L, 49615);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6659481010176L, 49617);
    boolean bool;
    if ((paramk instanceof com.tencent.mm.plugin.order.model.e))
    {
      if (this.llK != null)
      {
        this.llK.dismiss();
        this.llK = null;
      }
      paramString = (com.tencent.mm.plugin.order.model.e)paramk;
      this.nGj = paramString.nEX;
      ba(paramString.nEV);
      bb(paramString.nEW);
      this.mCount = this.nGi.size();
      if (paramString.jWn > this.mCount)
      {
        bool = true;
        this.mNh = bool;
        this.nGh.notifyDataSetChanged();
        w.d("MicroMsg.WalletOrderListUI", "orders list count: " + this.mCount);
        w.d("MicroMsg.WalletOrderListUI", "orders list total record: " + paramString.jWn);
        w.d("MicroMsg.WalletOrderListUI", "orders list has more: " + this.mNh);
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6640287875072L, 49474);
            if (MallOrderRecordListUI.this.mNh)
            {
              w.v("MicroMsg.WalletOrderListUI", "has more");
              if (!MallOrderRecordListUI.this.nGk)
              {
                MallOrderRecordListUI.this.jRn.bZZ();
                MallOrderRecordListUI.this.jRn.setAdapter(MallOrderRecordListUI.this.nGh);
                MallOrderRecordListUI.this.nGk = true;
              }
            }
            for (;;)
            {
              MallOrderRecordListUI.this.nGh.notifyDataSetChanged();
              GMTrace.o(6640287875072L, 49474);
              return;
              w.v("MicroMsg.WalletOrderListUI", "no more! dismiss footer view!");
              MallOrderRecordListUI.this.jRn.caa();
            }
          }
        });
        this.jRF = false;
        label205:
        if ((this.mCount > 0) || (this.nGi.size() != 0)) {
          break label458;
        }
        lg(false);
        findViewById(a.f.svj).setVisibility(0);
      }
    }
    for (;;)
    {
      GMTrace.o(6659481010176L, 49617);
      return true;
      bool = false;
      break;
      if (!(paramk instanceof com.tencent.mm.plugin.order.model.g)) {
        break label205;
      }
      if (this.llK != null)
      {
        this.llK.dismiss();
        this.llK = null;
      }
      paramString = (com.tencent.mm.plugin.order.model.g)paramk;
      label330:
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
            GMTrace.i(6654917607424L, 49583);
            MallOrderRecordListUI.this.nGh.notifyDataSetChanged();
            GMTrace.o(6654917607424L, 49583);
          }
        });
        break;
        paramString = paramString.aWN();
        w.d("MicroMsg.WalletOrderListUI", "delete transId:" + paramString);
        if (!bg.nm(paramString))
        {
          paramk = this.nGi.iterator();
          if (paramk.hasNext())
          {
            i locali = (i)paramk.next();
            if (!paramString.equals(locali.nFa)) {
              break label330;
            }
            this.nGi.remove(locali);
            this.mCount = this.nGi.size();
          }
        }
      }
      label458:
      lg(true);
      findViewById(a.f.svj).setVisibility(8);
    }
  }
  
  public void dj(String paramString1, String paramString2)
  {
    GMTrace.i(6658273050624L, 49608);
    l(new com.tencent.mm.plugin.order.model.g(paramString1, paramString2, 1));
    GMTrace.o(6658273050624L, 49608);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6657601961984L, 49603);
    int i = a.g.sNy;
    GMTrace.o(6657601961984L, 49603);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6657736179712L, 49604);
    super.onCreate(paramBundle);
    this.mHandler = new ae();
    aWR();
    MP();
    this.vq = 0;
    this.nGj = null;
    GMTrace.o(6657736179712L, 49604);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6658944139264L, 49613);
    aWS();
    super.onDestroy();
    GMTrace.o(6658944139264L, 49613);
  }
  
  public void onResume()
  {
    GMTrace.i(6658138832896L, 49607);
    super.onResume();
    if (this.nGh != null) {
      this.nGh.notifyDataSetChanged();
    }
    GMTrace.o(6658138832896L, 49607);
  }
  
  public String sr(int paramInt)
  {
    GMTrace.i(6659078356992L, 49614);
    String str = com.tencent.mm.wallet_core.ui.e.EP(paramInt);
    GMTrace.o(6659078356992L, 49614);
    return str;
  }
  
  protected final class a
    extends BaseAdapter
  {
    protected a()
    {
      GMTrace.i(6649951551488L, 49546);
      GMTrace.o(6649951551488L, 49546);
    }
    
    private i ss(int paramInt)
    {
      GMTrace.i(6650219986944L, 49548);
      i locali = (i)MallOrderRecordListUI.this.nGi.get(paramInt);
      GMTrace.o(6650219986944L, 49548);
      return locali;
    }
    
    public final int getCount()
    {
      GMTrace.i(6650085769216L, 49547);
      int i = MallOrderRecordListUI.this.nGi.size();
      GMTrace.o(6650085769216L, 49547);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6650354204672L, 49549);
      long l = paramInt;
      GMTrace.o(6650354204672L, 49549);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6650488422400L, 49550);
      View localView;
      i locali;
      Object localObject1;
      int i;
      if (paramView == null)
      {
        localView = View.inflate(MallOrderRecordListUI.this, a.g.sNz, null);
        paramViewGroup = new MallOrderRecordListUI.b(MallOrderRecordListUI.this);
        paramViewGroup.nGo = ((TextView)localView.findViewById(a.f.sDo));
        paramViewGroup.nGq = ((TextView)localView.findViewById(a.f.sDn));
        paramViewGroup.nGp = ((TextView)localView.findViewById(a.f.sDm));
        paramViewGroup.nGr = ((TextView)localView.findViewById(a.f.sDk));
        paramViewGroup.nGt = localView.findViewById(a.f.sDh);
        paramViewGroup.nGu = ((TextView)localView.findViewById(a.f.sDj));
        paramViewGroup.nGv = ((TextView)localView.findViewById(a.f.sDi));
        paramViewGroup.nGs = ((TextView)localView.findViewById(a.f.sDl));
        localView.setTag(paramViewGroup);
        locali = ss(paramInt);
        if (paramInt != 0) {
          break label612;
        }
        paramView = ss(0);
        localObject1 = new GregorianCalendar();
        ((GregorianCalendar)localObject1).setTimeInMillis(paramView.nFd * 1000L);
        paramView = MallOrderRecordListUI.cL(((GregorianCalendar)localObject1).get(1), ((GregorianCalendar)localObject1).get(2) + 1);
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          localObject1 = new SimpleDateFormat(MallOrderRecordListUI.this.getString(a.i.dxt, new Object[] { "" })).format(new Date(ss(paramInt).nFd * 1000L));
          paramViewGroup.nGu.setText((CharSequence)localObject1);
          if ((!bg.nm(paramView)) && (!bg.nm((String)MallOrderRecordListUI.this.nGl.get(paramView)))) {
            paramViewGroup.nGv.setText((CharSequence)MallOrderRecordListUI.this.nGl.get(paramView));
          }
          paramViewGroup.nGt.setVisibility(0);
          label346:
          paramViewGroup.nGo.setText(locali.nFc);
          paramViewGroup.nGp.setText(locali.nFe);
          i = MallOrderRecordListUI.this.vKB.vKW.getResources().getColor(a.c.smx);
          paramInt = i;
          if (bg.nm(locali.nFq)) {}
        }
        try
        {
          paramInt = Color.parseColor(locali.nFq);
          paramViewGroup.nGp.setTextColor(paramInt);
          paramViewGroup.nGq.setText(MallOrderRecordListUI.this.sr(locali.nFd));
          i = MallOrderRecordListUI.this.vKB.vKW.getResources().getColor(a.c.smy);
          paramInt = i;
          if (bg.nm(locali.nFr)) {}
        }
        catch (Exception paramView)
        {
          try
          {
            paramInt = Color.parseColor(locali.nFr);
            if (locali.nFb != locali.nFs)
            {
              paramView = com.tencent.mm.wallet_core.ui.e.d(locali.nFb / 100.0D, locali.nFg);
              localObject1 = new SpannableString(paramView);
              ((SpannableString)localObject1).setSpan(new StrikethroughSpan(), 0, paramView.length(), 33);
              paramViewGroup.nGr.setText((CharSequence)localObject1);
              paramViewGroup.nGs.setTextColor(paramInt);
              paramViewGroup.nGs.setText(com.tencent.mm.wallet_core.ui.e.d(locali.nFs / 100.0D, locali.nFg));
              GMTrace.o(6650488422400L, 49550);
              return localView;
              paramViewGroup = (MallOrderRecordListUI.b)paramView.getTag();
              localView = paramView;
              break;
              label612:
              paramView = ss(paramInt);
              Object localObject2 = ss(paramInt - 1);
              if ((paramView.nFd <= 0) || (((i)localObject2).nFd <= 0)) {
                break label841;
              }
              localObject1 = new GregorianCalendar();
              ((GregorianCalendar)localObject1).setTimeInMillis(((i)localObject2).nFd * 1000L);
              localObject2 = new GregorianCalendar();
              ((GregorianCalendar)localObject2).setTimeInMillis(paramView.nFd * 1000L);
              if ((((GregorianCalendar)localObject1).get(1) == ((GregorianCalendar)localObject2).get(1)) && (((GregorianCalendar)localObject1).get(2) == ((GregorianCalendar)localObject2).get(2))) {
                break label841;
              }
              paramView = MallOrderRecordListUI.cL(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2) + 1);
              i = 1;
              continue;
              paramViewGroup.nGt.setVisibility(8);
              break label346;
              paramView = paramView;
              w.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bg.nl(locali.nFq));
              paramInt = i;
            }
          }
          catch (Exception paramView)
          {
            for (;;)
            {
              w.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bg.nl(locali.nFr));
              paramInt = i;
              continue;
              paramViewGroup.nGr.setText("");
            }
            label841:
            i = 0;
            paramView = null;
          }
        }
      }
    }
  }
  
  private final class b
  {
    TextView nGo;
    TextView nGp;
    TextView nGq;
    TextView nGr;
    TextView nGs;
    View nGt;
    TextView nGu;
    TextView nGv;
    
    public b()
    {
      GMTrace.i(6654246518784L, 49578);
      GMTrace.o(6654246518784L, 49578);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\MallOrderRecordListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */