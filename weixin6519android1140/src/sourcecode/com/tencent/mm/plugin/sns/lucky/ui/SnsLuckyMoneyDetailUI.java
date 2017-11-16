package com.tencent.mm.plugin.sns.lucky.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.q.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.LinkedList;
import java.util.List;

public class SnsLuckyMoneyDetailUI
  extends LuckyMoneyBaseUI
{
  private ListView mMY;
  AbsListView.OnScrollListener mNr;
  private final int mOl;
  private final int mOm;
  private b pqu;
  
  public SnsLuckyMoneyDetailUI()
  {
    GMTrace.i(8819044253696L, 65707);
    this.mNr = new AbsListView.OnScrollListener()
    {
      private boolean mNs;
      private boolean mNt;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        boolean bool = true;
        GMTrace.i(8825352486912L, 65754);
        if ((paramAnonymousInt3 == 0) || (!this.mNs))
        {
          GMTrace.o(8825352486912L, 65754);
          return;
        }
        if (paramAnonymousInt1 > 0) {}
        label70:
        label124:
        label127:
        for (;;)
        {
          if (this.mNt != bool)
          {
            if (bool)
            {
              SnsLuckyMoneyDetailUI.a(SnsLuckyMoneyDetailUI.this, SnsLuckyMoneyDetailUI.this.getResources().getDrawable(a.c.smK));
              this.mNt = bool;
            }
          }
          else
          {
            GMTrace.o(8825352486912L, 65754);
            return;
            paramAnonymousAbsListView = paramAnonymousAbsListView.getChildAt(paramAnonymousInt1);
            if (paramAnonymousAbsListView == null) {
              break label124;
            }
          }
          for (paramAnonymousInt1 = 0 - paramAnonymousAbsListView.getTop();; paramAnonymousInt1 = 0)
          {
            if (paramAnonymousInt1 > 100) {
              break label127;
            }
            bool = false;
            break;
            SnsLuckyMoneyDetailUI.a(SnsLuckyMoneyDetailUI.this);
            break label70;
          }
        }
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(8825218269184L, 65753);
        if (paramAnonymousAbsListView.getCount() == 0)
        {
          GMTrace.o(8825218269184L, 65753);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(8825218269184L, 65753);
          return;
          this.mNs = false;
          GMTrace.o(8825218269184L, 65753);
          return;
          this.mNs = true;
        }
      }
    };
    this.mOl = 750;
    this.mOm = 240;
    GMTrace.o(8819044253696L, 65707);
  }
  
  protected final void MP()
  {
    GMTrace.i(8819312689152L, 65709);
    q(getResources().getDrawable(a.e.snX));
    oM(a.i.sYA);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8818641600512L, 65704);
        SnsLuckyMoneyDetailUI.this.finish();
        GMTrace.o(8818641600512L, 65704);
        return true;
      }
    });
    this.mMY = ((ListView)findViewById(a.f.syo));
    this.pqu = new b(this.vKB.vKW);
    this.mMY.setAdapter(this.pqu);
    this.mMY.setOnScrollListener(this.mNr);
    this.mMY.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(8847229976576L, 65917);
        GMTrace.o(8847229976576L, 65917);
      }
    });
    GMTrace.o(8819312689152L, 65709);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8819581124608L, 65711);
    GMTrace.o(8819581124608L, 65711);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8819446906880L, 65710);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8819446906880L, 65710);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8819715342336L, 65712);
    int i = a.g.sOF;
    GMTrace.o(8819715342336L, 65712);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8819178471424L, 65708);
    super.onCreate(paramBundle);
    MP();
    paramBundle = a.Bz(getIntent().getStringExtra("key_feedid"));
    if ((paramBundle == null) || (paramBundle.size() == 0))
    {
      bXp();
      if (Build.VERSION.SDK_INT >= 21)
      {
        int i = getResources().getColor(a.c.smL);
        getWindow().setStatusBarColor(i);
      }
      Ve(null);
      GMTrace.o(8819178471424L, 65708);
      return;
    }
    b localb = this.pqu;
    if (paramBundle == null) {
      new LinkedList();
    }
    for (;;)
    {
      localb.notifyDataSetChanged();
      break;
      localb.mNm = paramBundle;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8819849560064L, 65713);
    super.onDestroy();
    GMTrace.o(8819849560064L, 65713);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\ui\SnsLuckyMoneyDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */