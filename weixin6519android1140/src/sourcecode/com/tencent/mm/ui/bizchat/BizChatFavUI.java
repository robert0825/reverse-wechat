package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.a.b.a;
import com.tencent.mm.af.a.b.a.b;
import com.tencent.mm.af.a.d;
import com.tencent.mm.af.a.d.a;
import com.tencent.mm.af.a.d.a.b;
import com.tencent.mm.af.a.s;
import com.tencent.mm.g.b.af;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

public class BizChatFavUI
  extends MMActivity
  implements com.tencent.mm.af.n
{
  private com.tencent.mm.ui.base.r iBj;
  private TextView jqc;
  private ListView jqd;
  private p.d jqg;
  private long juT;
  private String juZ;
  private boolean vHX;
  private b.a wpd;
  private d.a wpe;
  private c wpj;
  
  public BizChatFavUI()
  {
    GMTrace.i(2986076012544L, 22248);
    GMTrace.o(2986076012544L, 22248);
  }
  
  protected final void MP()
  {
    GMTrace.i(2987149754368L, 22256);
    this.jqd = ((ListView)findViewById(R.h.chU));
    this.jqc = ((TextView)findViewById(R.h.bwF));
    this.jqc.setText(R.l.daN);
    this.jqd.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2974533287936L, 22162);
        GMTrace.o(2974533287936L, 22162);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2974399070208L, 22161);
        com.tencent.mm.ao.n.Jd().bi(paramAnonymousInt);
        GMTrace.o(2974399070208L, 22161);
      }
    });
    this.wpj = new c(this, new o.a()
    {
      public final void QC()
      {
        GMTrace.i(3000839962624L, 22358);
        BizChatFavUI.this.sq(com.tencent.mm.y.r.fs(BizChatFavUI.a(BizChatFavUI.this)));
        if (BizChatFavUI.c(BizChatFavUI.this).getCount() <= 0)
        {
          BizChatFavUI.d(BizChatFavUI.this).setVisibility(0);
          BizChatFavUI.e(BizChatFavUI.this).setVisibility(8);
          GMTrace.o(3000839962624L, 22358);
          return;
        }
        BizChatFavUI.d(BizChatFavUI.this).setVisibility(8);
        BizChatFavUI.e(BizChatFavUI.this).setVisibility(0);
        GMTrace.o(3000839962624L, 22358);
      }
      
      public final void QD()
      {
        GMTrace.i(3000974180352L, 22359);
        GMTrace.o(3000974180352L, 22359);
      }
    }, this.juZ);
    this.wpj.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(2990907850752L, 22284);
        int i = BizChatFavUI.e(BizChatFavUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(2990907850752L, 22284);
        return i;
      }
    });
    this.wpj.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(2985404923904L, 22243);
        BizChatFavUI.e(BizChatFavUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(2985404923904L, 22243);
      }
    });
    this.wpj.a(new MMSlideDelView.e()
    {
      public final void aV(Object paramAnonymousObject)
      {
        GMTrace.i(2970238320640L, 22130);
        if (paramAnonymousObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BizChatFavUI", "onItemDel object null");
          GMTrace.o(2970238320640L, 22130);
          return;
        }
        GMTrace.o(2970238320640L, 22130);
      }
    });
    this.jqd.setAdapter(this.wpj);
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2984599617536L, 22237);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(2984599617536L, 22237);
          return;
          BizChatFavUI.a(BizChatFavUI.this, BizChatFavUI.f(BizChatFavUI.this));
        }
      }
    };
    final l locall = new l(this);
    this.jqd.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(3001242615808L, 22361);
        if (paramAnonymousInt < BizChatFavUI.e(BizChatFavUI.this).getHeaderViewsCount())
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatFavUI", "on header view long click, ignore");
          GMTrace.o(3001242615808L, 22361);
          return true;
        }
        locall.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BizChatFavUI.this, BizChatFavUI.g(BizChatFavUI.this));
        GMTrace.o(3001242615808L, 22361);
        return true;
      }
    });
    this.jqd.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2972117368832L, 22144);
        paramAnonymousAdapterView = (com.tencent.mm.af.a.c)BizChatFavUI.c(BizChatFavUI.this).getItem(paramAnonymousInt);
        BizChatFavUI.b(BizChatFavUI.this, paramAnonymousAdapterView.field_bizChatLocalId);
        GMTrace.o(2972117368832L, 22144);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2982452133888L, 22221);
        BizChatFavUI.this.finish();
        GMTrace.o(2982452133888L, 22221);
        return true;
      }
    });
    GMTrace.o(2987149754368L, 22256);
  }
  
  public final void a(int paramInt, k paramk)
  {
    GMTrace.i(2987015536640L, 22255);
    if (this.iBj != null) {
      this.iBj.dismiss();
    }
    GMTrace.o(2987015536640L, 22255);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2986344448000L, 22250);
    int i = R.i.cvp;
    GMTrace.o(2986344448000L, 22250);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2986210230272L, 22249);
    super.onCreate(paramBundle);
    this.juZ = getIntent().getStringExtra("Contact_User");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatFavUI", "[regitListener]");
    this.wpd = new b.a()
    {
      public final void a(b.a.b paramAnonymousb)
      {
        GMTrace.i(3000571527168L, 22356);
        if ((paramAnonymousb != null) && (paramAnonymousb.gxZ != null) && (BizChatFavUI.a(BizChatFavUI.this).equals(paramAnonymousb.gxZ.field_brandUserName)))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChatConv change");
          if (BizChatFavUI.b(BizChatFavUI.this)) {
            BizChatFavUI.c(BizChatFavUI.this).QF();
          }
        }
        GMTrace.o(3000571527168L, 22356);
      }
    };
    this.wpe = new d.a()
    {
      public final void a(d.a.b paramAnonymousb)
      {
        GMTrace.i(2962990563328L, 22076);
        if ((paramAnonymousb != null) && (paramAnonymousb.gyj != null))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChat change");
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BizChatFavUI", "needToUpdate:%s", new Object[] { Boolean.valueOf(com.tencent.mm.af.x.FI().t(paramAnonymousb.gxY).field_needToUpdate) });
          if (BizChatFavUI.b(BizChatFavUI.this)) {
            BizChatFavUI.c(BizChatFavUI.this).QF();
          }
        }
        GMTrace.o(2962990563328L, 22076);
      }
    };
    com.tencent.mm.af.x.FJ().a(this.wpd, getMainLooper());
    com.tencent.mm.af.x.FI().a(this.wpe, getMainLooper());
    MP();
    com.tencent.mm.af.x.FM();
    paramBundle = new s(this.juZ);
    com.tencent.mm.kernel.h.xx().fYr.a(paramBundle, 0);
    GMTrace.o(2986210230272L, 22249);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(2986881318912L, 22254);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.juT = ((com.tencent.mm.af.a.c)this.wpj.getItem(paramView.position)).field_bizChatLocalId;
    paramContextMenu.add(paramView.position, 0, 1, R.l.daO);
    GMTrace.o(2986881318912L, 22254);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2986478665728L, 22251);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatFavUI", "[unRegitListener]");
    com.tencent.mm.af.x.FJ().a(this.wpd);
    com.tencent.mm.af.x.FI().a(this.wpe);
    this.wpj.aJe();
    super.onDestroy();
    GMTrace.o(2986478665728L, 22251);
  }
  
  public void onPause()
  {
    GMTrace.i(2986747101184L, 22253);
    this.wpj.onPause();
    this.vHX = false;
    at.getNotification().dv("");
    super.onPause();
    GMTrace.o(2986747101184L, 22253);
  }
  
  public void onResume()
  {
    GMTrace.i(2986612883456L, 22252);
    super.onResume();
    at.AR();
    com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(this.juZ);
    if ((localx == null) || (!com.tencent.mm.l.a.eE(localx.field_type)))
    {
      finish();
      GMTrace.o(2986612883456L, 22252);
      return;
    }
    Ba(8);
    this.vHX = true;
    this.wpj.a(null, null);
    at.getNotification().dv(this.juZ);
    GMTrace.o(2986612883456L, 22252);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatFavUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */