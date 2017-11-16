package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.collect.b.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CollectBillListUI
  extends WalletBaseUI
{
  private int aCN;
  private Dialog hul;
  private View jIq;
  private int jWL;
  private ListView jYS;
  private b jYT;
  private LinearLayout jYU;
  private CollectPullDownView jYV;
  private TextView jYW;
  private Dialog jYX;
  private boolean jYY;
  private boolean jYZ;
  private boolean jZa;
  private boolean jZb;
  private boolean jZc;
  private boolean jZd;
  private boolean jZe;
  private boolean jZf;
  private boolean jZg;
  private long jZh;
  private long jZi;
  private Calendar jZj;
  private List<h> jZk;
  private int retryCount;
  private int type;
  
  public CollectBillListUI()
  {
    GMTrace.i(5429509750784L, 40453);
    this.jYY = false;
    this.jYZ = false;
    this.jZa = false;
    this.jZb = false;
    this.jZc = false;
    this.jZd = false;
    this.jZe = true;
    this.jZf = false;
    this.jZg = false;
    this.type = 0;
    this.aCN = 20;
    this.jWL = 0;
    this.retryCount = 0;
    this.jZh = 0L;
    this.jZi = 0L;
    this.jZk = new ArrayList();
    GMTrace.o(5429509750784L, 40453);
  }
  
  private void a(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(5430851928064L, 40463);
    w.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", new Object[] { Integer.valueOf(this.type), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    b(new com.tencent.mm.plugin.collect.b.p(this.type, paramLong, paramInt2, this.aCN, paramInt3, paramInt1), false);
    this.retryCount += 1;
    GMTrace.o(5430851928064L, 40463);
  }
  
  private void aoU()
  {
    GMTrace.i(5430180839424L, 40458);
    this.jYV.scrollTo(0, this.jYV.wdP);
    GMTrace.o(5430180839424L, 40458);
  }
  
  private void aoV()
  {
    GMTrace.i(5430315057152L, 40459);
    this.jYS.setVisibility(8);
    this.jYU.setVisibility(0);
    this.jYW.setVisibility(0);
    GMTrace.o(5430315057152L, 40459);
  }
  
  private void aoW()
  {
    GMTrace.i(5430717710336L, 40462);
    int i = this.jYT.getCount();
    if (i > 0)
    {
      long l = this.jYT.mo(i - 1).jWm;
      if (l < this.jZi)
      {
        w.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", new Object[] { Long.valueOf(l), Long.valueOf(this.jZi) });
        this.jZi = l;
      }
    }
    w.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.jZi) });
    b(new com.tencent.mm.plugin.collect.b.p(this.type, this.jZi, this.aCN, 0), false);
    this.jZa = true;
    GMTrace.o(5430717710336L, 40462);
  }
  
  private void dI(boolean paramBoolean)
  {
    GMTrace.i(5430583492608L, 40461);
    CollectPullDownView localCollectPullDownView = this.jYV;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localCollectPullDownView.lF(paramBoolean);
      GMTrace.o(5430583492608L, 40461);
      return;
    }
  }
  
  private void vj(String paramString)
  {
    GMTrace.i(5430449274880L, 40460);
    if (this.jYT.getCount() == 0)
    {
      w.i("MicroMsg.CollectBillListUI", "show empty view");
      if (!bg.nm(paramString)) {
        this.jYW.setText(paramString);
      }
      for (;;)
      {
        aoV();
        GMTrace.o(5430449274880L, 40460);
        return;
        if (this.jZd)
        {
          this.jYW.setText(getString(a.i.sSw));
        }
        else
        {
          paramString = getString(a.i.sSw) + getString(a.i.sSx);
          this.jYW.setText(paramString);
        }
      }
    }
    if (!bg.nm(paramString)) {
      Toast.makeText(this.vKB.vKW, paramString, 1).show();
    }
    GMTrace.o(5430449274880L, 40460);
  }
  
  protected final void MP()
  {
    GMTrace.i(5429778186240L, 40455);
    this.jYS = ((ListView)findViewById(a.f.stC));
    this.jYU = ((LinearLayout)findViewById(a.f.stA));
    this.jYW = ((TextView)findViewById(a.f.stB));
    this.jIq = v.fb(this).inflate(a.g.sLX, this.jYS, false);
    View localView = new View(this);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 5)));
    this.jYS.addHeaderView(localView, null, true);
    new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 10)));
    this.jYS.addFooterView(localView, null, true);
    this.jYS.setOverScrollMode(2);
    this.jYT = new b(this);
    this.jYS.setAdapter(this.jYT);
    this.jYS.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5416222195712L, 40354);
        w.d("MicroMsg.CollectBillListUI", "click item: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          GMTrace.o(5416222195712L, 40354);
          return;
        }
        paramAnonymousView = new Intent(CollectBillListUI.this.vKB.vKW, CollectBillUI.class);
        paramAnonymousAdapterView = (h)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.CollectBillListUI", "invaild record: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(5416222195712L, 40354);
          return;
        }
        paramAnonymousView.putExtra("key_type", paramAnonymousAdapterView.type);
        paramAnonymousView.putExtra("key_timestamp", paramAnonymousAdapterView.jWm);
        paramAnonymousView.putExtra("key_from_scene", 2);
        CollectBillListUI.this.startActivity(paramAnonymousView);
        com.tencent.mm.plugin.report.service.g.ork.i(13944, new Object[] { Integer.valueOf(3) });
        GMTrace.o(5416222195712L, 40354);
      }
    });
    this.jYS.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5414477365248L, 40341);
        GMTrace.o(5414477365248L, 40341);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5414343147520L, 40340);
        GMTrace.o(5414343147520L, 40340);
      }
    });
    this.jYV = ((CollectPullDownView)findViewById(a.f.stE));
    this.jYV.lG(false);
    this.jYV.lD(false);
    this.jYV.lF(true);
    this.jYV.lE(false);
    this.jYV.wei = true;
    this.jYV.wea = new MMPullDownView.d()
    {
      public final boolean aoY()
      {
        GMTrace.i(5424409477120L, 40415);
        int i = CollectBillListUI.e(CollectBillListUI.this).getFirstVisiblePosition();
        if (i == 0)
        {
          View localView = CollectBillListUI.e(CollectBillListUI.this).getChildAt(i);
          if ((localView != null) && (localView.getX() == 0.0F))
          {
            GMTrace.o(5424409477120L, 40415);
            return true;
          }
        }
        GMTrace.o(5424409477120L, 40415);
        return false;
      }
    };
    this.jYV.wdZ = new MMPullDownView.c()
    {
      public final boolean aoZ()
      {
        GMTrace.i(5420919816192L, 40389);
        if (CollectBillListUI.f(CollectBillListUI.this).getVisibility() == 0)
        {
          w.d("MicroMsg.CollectBillListUI", "empty view");
          GMTrace.o(5420919816192L, 40389);
          return true;
        }
        View localView = CollectBillListUI.e(CollectBillListUI.this).getChildAt(CollectBillListUI.e(CollectBillListUI.this).getChildCount() - 1);
        if ((localView != null) && (localView.getBottom() <= CollectBillListUI.e(CollectBillListUI.this).getHeight()) && (CollectBillListUI.e(CollectBillListUI.this).getLastVisiblePosition() == CollectBillListUI.e(CollectBillListUI.this).getAdapter().getCount() - 1))
        {
          GMTrace.o(5420919816192L, 40389);
          return true;
        }
        GMTrace.o(5420919816192L, 40389);
        return false;
      }
    };
    this.jYV.wdN = new MMPullDownView.g()
    {
      public final boolean apa()
      {
        GMTrace.i(5412732534784L, 40328);
        w.d("MicroMsg.CollectBillListUI", "top load");
        GMTrace.o(5412732534784L, 40328);
        return true;
      }
    };
    this.jYV.wdO = new MMPullDownView.e()
    {
      public final boolean aoX()
      {
        GMTrace.i(5413537841152L, 40334);
        w.d("MicroMsg.CollectBillListUI", "bottomLoad, isLoading: %s, isFinish: %s", new Object[] { Boolean.valueOf(CollectBillListUI.g(CollectBillListUI.this)), Boolean.valueOf(CollectBillListUI.h(CollectBillListUI.this)) });
        if ((!CollectBillListUI.g(CollectBillListUI.this)) && (!CollectBillListUI.h(CollectBillListUI.this)))
        {
          CollectBillListUI.i(CollectBillListUI.this);
          CollectBillListUI.j(CollectBillListUI.this);
          GMTrace.o(5413537841152L, 40334);
          return false;
        }
        GMTrace.o(5413537841152L, 40334);
        return true;
      }
    };
    GMTrace.o(5429778186240L, 40455);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5430046621696L, 40457);
    if ((paramk instanceof com.tencent.mm.plugin.collect.b.p))
    {
      paramk = (com.tencent.mm.plugin.collect.b.p)paramk;
      if (this.hul.isShowing()) {
        this.hul.dismiss();
      }
      this.jYV.wdV = true;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramk.jWL == 0)
        {
          if (this.jZc)
          {
            w.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
            GMTrace.o(5430046621696L, 40457);
            return true;
          }
          if (paramk.jWM == 1)
          {
            this.jZe = paramk.gpJ;
            if (!paramk.jWQ.isEmpty())
            {
              paramString = this.jYT;
              List localList = paramk.jWQ;
              paramString.jYO.addAll(0, localList);
              paramString.notifyDataSetChanged();
              this.jZh = ((h)paramk.jWQ.get(0)).jWm;
              this.jZb = false;
              this.jYZ = false;
            }
          }
          for (;;)
          {
            GMTrace.o(5430046621696L, 40457);
            return true;
            this.jZe = true;
            break;
            this.jZd = paramk.gpJ;
            this.jYS.setVisibility(0);
            this.jYU.setVisibility(8);
            if (paramk.jWK)
            {
              if (!paramk.jWQ.isEmpty()) {
                this.jZk.addAll(paramk.jWQ);
              }
              if ((paramk.jWN == 0) && (paramk.jWO > 0) && (paramk.jWQ.isEmpty()))
              {
                w.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
                a(paramk.jWO, paramk.jWm, paramk.jWM, paramk.jWL);
                GMTrace.o(5430046621696L, 40457);
                return true;
              }
              this.retryCount = 0;
              if (this.jZk.size() > 0) {
                this.jYT.ao(this.jZk);
              }
              for (;;)
              {
                this.jZa = false;
                this.jZi = paramk.jWm;
                aoU();
                dI(this.jZd);
                break;
                w.i("MicroMsg.CollectBillListUI", "retry data is empty");
                vj(paramk.jWP);
              }
            }
            if (!paramk.jWQ.isEmpty())
            {
              this.jYT.ao(paramk.jWQ);
              this.jZi = ((h)paramk.jWQ.get(paramk.jWQ.size() - 1)).jWm;
              if (this.jZi > paramk.jWm)
              {
                w.d("MicroMsg.CollectBillListUI", "use from_timestamp");
                this.jZi = paramk.jWm;
              }
              for (;;)
              {
                this.jZa = false;
                aoU();
                dI(this.jZd);
                break;
                w.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", new Object[] { Long.valueOf(this.jZi), Long.valueOf(paramk.jWm) });
              }
            }
            if ((paramk.jWN == 0) && (paramk.jWO > 0))
            {
              w.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramk.jWO), Long.valueOf(paramk.jWm) });
              a(paramk.jWO, paramk.jWm, paramk.jWM, paramk.jWL);
              this.jZk.clear();
            }
            else
            {
              this.jZa = false;
              aoU();
              w.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
              vj(paramk.jWP);
              dI(this.jZd);
            }
          }
        }
        this.jZd = paramk.gpJ;
        if (paramk.jWK)
        {
          if (!paramk.jWQ.isEmpty()) {
            this.jZk.addAll(paramk.jWQ);
          }
          if ((paramk.jWN == 0) && (paramk.jWO > 0))
          {
            w.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
            a(paramk.jWO, paramk.jWm, paramk.jWM, paramk.jWL);
          }
          for (;;)
          {
            GMTrace.o(5430046621696L, 40457);
            return true;
            this.retryCount = 0;
            this.jZe = true;
            this.jZi = paramk.jWm;
            if (paramk.jWN == 0) {}
            for (this.jZd = false;; this.jZd = true)
            {
              if (this.jZk.size() <= 0) {
                break label876;
              }
              this.jYT.an(this.jZk);
              break;
            }
            label876:
            w.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
            aoV();
            if (!bg.nm(paramk.jWP))
            {
              this.jYW.setText(paramk.jWP);
              this.jYW.setVisibility(0);
            }
            paramString = this.jYT;
            paramString.jYO.clear();
            paramString.notifyDataSetChanged();
          }
        }
        if (!paramk.jWQ.isEmpty())
        {
          this.jYT.an(paramk.jWQ);
          this.jZh = ((h)paramk.jWQ.get(0)).jWm;
          this.jZi = ((h)paramk.jWQ.get(paramk.jWQ.size() - 1)).jWm;
        }
        for (;;)
        {
          this.jZc = false;
          this.jZe = false;
          break;
          if ((paramk.jWN == 0) && (paramk.jWO > 0))
          {
            w.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramk.jWO), Long.valueOf(paramk.jWm) });
            a(paramk.jWO, paramk.jWm, paramk.jWM, paramk.jWL);
            this.jZk.clear();
          }
          else
          {
            aoV();
          }
        }
      }
      w.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.jWL), Integer.valueOf(paramk.jWM) });
      if (paramk.jWL == 0) {
        if (paramk.jWM == 0)
        {
          this.jZa = false;
          aoU();
        }
      }
      for (;;)
      {
        if (this.jYT.isEmpty()) {
          aoV();
        }
        Toast.makeText(this, a.i.sSv, 1).show();
        GMTrace.o(5430046621696L, 40457);
        return true;
        this.jZb = false;
        continue;
        this.jZc = false;
      }
    }
    GMTrace.o(5430046621696L, 40457);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5429912403968L, 40456);
    int i = a.g.sLV;
    GMTrace.o(5429912403968L, 40456);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5429643968512L, 40454);
    super.onCreate(paramBundle);
    MP();
    oM(a.i.sSy);
    if (this.jZg) {
      a(0, a.h.sQF, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5424677912576L, 40417);
          CollectBillListUI.a(CollectBillListUI.this);
          GMTrace.o(5424677912576L, 40417);
          return false;
        }
      });
    }
    this.hul = com.tencent.mm.wallet_core.ui.g.a(this, false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5417832808448L, 40366);
        GMTrace.o(5417832808448L, 40366);
      }
    });
    aoW();
    com.tencent.mm.plugin.report.service.g.ork.i(13944, new Object[] { Integer.valueOf(4) });
    GMTrace.o(5429643968512L, 40454);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectBillListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */