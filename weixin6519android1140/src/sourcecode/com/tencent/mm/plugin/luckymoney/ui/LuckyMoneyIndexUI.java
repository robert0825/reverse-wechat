package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.plugin.luckymoney.b.c;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.v;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.LinkedList;
import java.util.List;

public class LuckyMoneyIndexUI
  extends LuckyMoneyBaseUI
{
  private int mChannel;
  private LinearLayout mOo;
  private LinearLayout mOp;
  private LinearLayout mOq;
  
  public LuckyMoneyIndexUI()
  {
    GMTrace.i(9813597618176L, 73117);
    GMTrace.o(9813597618176L, 73117);
  }
  
  private void aMF()
  {
    GMTrace.i(9814134489088L, 73121);
    a.aLP();
    c localc = a.aLQ().aMb();
    if (localc == null)
    {
      GMTrace.o(9814134489088L, 73121);
      return;
    }
    ImageView localImageView = (ImageView)findViewById(a.f.soq);
    if ((localc.mHX & 0x1) == 1)
    {
      w.i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
      localImageView.setImageResource(a.e.soq);
      GMTrace.o(9814134489088L, 73121);
      return;
    }
    localImageView.setImageResource(a.e.sor);
    GMTrace.o(9814134489088L, 73121);
  }
  
  protected final void MP()
  {
    GMTrace.i(9814000271360L, 73120);
    oM(a.i.sVm);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9816416190464L, 73138);
        LuckyMoneyIndexUI.this.finish();
        GMTrace.o(9816416190464L, 73138);
        return true;
      }
    });
    this.mOo = ((LinearLayout)findViewById(a.f.syR));
    this.mOp = ((LinearLayout)findViewById(a.f.syP));
    this.mOq = ((LinearLayout)findViewById(a.f.syN));
    ((Button)findViewById(a.f.syQ)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9818026803200L, 73150);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
        LuckyMoneyIndexUI.a(LuckyMoneyIndexUI.this, 0);
        GMTrace.o(9818026803200L, 73150);
      }
    });
    ((Button)findViewById(a.f.syO)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9835475107840L, 73280);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
        LuckyMoneyIndexUI.a(LuckyMoneyIndexUI.this, 1);
        GMTrace.o(9835475107840L, 73280);
      }
    });
    a(0, getString(a.i.sUH), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9793867612160L, 72970);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
        paramAnonymousMenuItem = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousMenuItem.add(LuckyMoneyIndexUI.this.getString(a.i.sUJ));
        localLinkedList.add(Integer.valueOf(0));
        paramAnonymousMenuItem.add(LuckyMoneyIndexUI.this.getString(a.i.sUK));
        localLinkedList.add(Integer.valueOf(1));
        com.tencent.mm.ui.base.h.a(LuckyMoneyIndexUI.this.vKB.vKW, "", paramAnonymousMenuItem, localLinkedList, "", false, new h.d()
        {
          public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            paramAnonymous2Int1 = 1;
            GMTrace.i(9819637415936L, 73162);
            switch (paramAnonymous2Int2)
            {
            default: 
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5) });
              paramAnonymous2Int1 = 2;
            }
            for (;;)
            {
              Intent localIntent = new Intent();
              localIntent.setClass(LuckyMoneyIndexUI.this.vKB.vKW, LuckyMoneyMyRecordUI.class);
              localIntent.putExtra("key_type", paramAnonymous2Int1);
              LuckyMoneyIndexUI.this.startActivity(localIntent);
              GMTrace.o(9819637415936L, 73162);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(6) });
            }
          }
        });
        GMTrace.o(9793867612160L, 72970);
        return true;
      }
    }, p.b.vLN);
    aMF();
    GMTrace.o(9814000271360L, 73120);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9814402924544L, 73123);
    if ((paramk instanceof v))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (v)paramk;
        paramk = new g.c();
        paramk.textColor = getResources().getColor(a.c.smr);
        paramk.mPU = 101;
        g.a(this, this.mOo, paramString.mIv, paramk, "Text");
        paramk = new g.c();
        paramk.textColor = getResources().getColor(a.c.smr);
        paramk.mPU = 100;
        g.a(this, this.mOp, paramString.mJC, paramk, "Text");
        paramk = new g.c();
        paramk.mPU = 102;
        g.a(this, this.mOq, paramString.mJA, paramk, "Pic");
        aMF();
      }
      GMTrace.o(9814402924544L, 73123);
      return true;
    }
    GMTrace.o(9814402924544L, 73123);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9814268706816L, 73122);
    int i = a.g.sMS;
    GMTrace.o(9814268706816L, 73122);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9813731835904L, 73118);
    super.onCreate(paramBundle);
    ((b)com.tencent.mm.kernel.h.h(b.class)).a(this, null);
    MP();
    b(new v("v1.0", (byte)0), false);
    this.mChannel = getIntent().getIntExtra("pay_channel", -1);
    com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    GMTrace.o(9813731835904L, 73118);
  }
  
  protected void onResume()
  {
    GMTrace.i(9813866053632L, 73119);
    super.onResume();
    b localb = (b)com.tencent.mm.kernel.h.h(b.class);
    localb.a(this, localb.bAq(), null);
    GMTrace.o(9813866053632L, 73119);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */