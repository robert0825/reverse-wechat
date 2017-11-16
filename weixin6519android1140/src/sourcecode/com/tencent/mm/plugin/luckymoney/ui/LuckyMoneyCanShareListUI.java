package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.g;
import com.tencent.mm.plugin.luckymoney.b.h;
import com.tencent.mm.plugin.luckymoney.b.x;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.p;
import java.util.LinkedList;
import java.util.List;

public class LuckyMoneyCanShareListUI
  extends LuckyMoneyBaseUI
{
  private boolean knj;
  private MMLoadMoreListView mNR;
  private d mNS;
  private boolean mNh;
  private List<h> mNm;
  private String mNp;
  private int vq;
  
  public LuckyMoneyCanShareListUI()
  {
    GMTrace.i(9841783341056L, 73327);
    this.vq = 0;
    this.mNm = new LinkedList();
    this.mNh = true;
    this.knj = false;
    this.mNp = "";
    GMTrace.o(9841783341056L, 73327);
  }
  
  private void aMC()
  {
    GMTrace.i(9842454429696L, 73332);
    this.knj = true;
    if (this.vq == 0) {
      this.mNp = "";
    }
    l(new x(10, this.vq, 3, "", "v1.0", this.mNp));
    GMTrace.o(9842454429696L, 73332);
  }
  
  protected final void MP()
  {
    GMTrace.i(9842051776512L, 73329);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9812389658624L, 73108);
        LuckyMoneyCanShareListUI.this.finish();
        GMTrace.o(9812389658624L, 73108);
        return true;
      }
    });
    this.mNR = ((MMLoadMoreListView)findViewById(a.f.szj));
    sq(getString(a.i.sUD));
    this.mNS = new e(this.vKB.vKW);
    this.mNR.setAdapter(this.mNS);
    this.mNR.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9840843816960L, 73320);
        paramAnonymousAdapterView = LuckyMoneyCanShareListUI.a(LuckyMoneyCanShareListUI.this).qe((int)paramAnonymousLong);
        if ((paramAnonymousAdapterView != null) && (!bg.nm(paramAnonymousAdapterView.mFr)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(LuckyMoneyCanShareListUI.this.vKB.vKW, LuckyMoneyDetailUI.class);
          paramAnonymousView.putExtra("key_sendid", paramAnonymousAdapterView.mFr);
          LuckyMoneyCanShareListUI.this.startActivity(paramAnonymousView);
        }
        GMTrace.o(9840843816960L, 73320);
      }
    });
    this.mNR.wdv = new MMLoadMoreListView.a()
    {
      public final void anO()
      {
        GMTrace.i(9857352597504L, 73443);
        if ((LuckyMoneyCanShareListUI.b(LuckyMoneyCanShareListUI.this)) && (!LuckyMoneyCanShareListUI.c(LuckyMoneyCanShareListUI.this))) {
          LuckyMoneyCanShareListUI.d(LuckyMoneyCanShareListUI.this);
        }
        GMTrace.o(9857352597504L, 73443);
      }
    };
    GMTrace.o(9842051776512L, 73329);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9842185994240L, 73330);
    if (((paramk instanceof x)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (x)paramk;
      paramk = paramString.mJF.mIz;
      this.mNp = paramString.mJv;
      if (paramk != null)
      {
        paramInt1 = 0;
        while (paramInt1 < paramk.size())
        {
          this.mNm.add(paramk.get(paramInt1));
          paramInt1 += 1;
        }
        this.vq += paramk.size();
        this.mNh = paramString.aMi();
        this.knj = false;
        this.mNS.aS(this.mNm);
      }
      if (this.mNh) {
        this.mNR.bZZ();
      }
      for (;;)
      {
        GMTrace.o(9842185994240L, 73330);
        return true;
        this.mNR.caa();
      }
    }
    GMTrace.o(9842185994240L, 73330);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9842320211968L, 73331);
    int i = a.g.sMW;
    GMTrace.o(9842320211968L, 73331);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9841917558784L, 73328);
    super.onCreate(paramBundle);
    MP();
    aMC();
    GMTrace.o(9841917558784L, 73328);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyCanShareListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */