package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.aa.a.c.b.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.y.q;
import java.util.List;

public class AAQueryListUI
  extends BaseAAPresenterActivity
{
  private com.tencent.mm.plugin.aa.a.c.b hqo;
  private ListView hqp;
  private b hqq;
  private Dialog hqr;
  private boolean hqs;
  private boolean hqt;
  private View hqu;
  private AAQueryListH5UrlFooterView hqv;
  private String hqw;
  private int mode;
  
  public AAQueryListUI()
  {
    GMTrace.i(5628151988224L, 41933);
    this.hqo = ((com.tencent.mm.plugin.aa.a.c.b)m(com.tencent.mm.plugin.aa.a.c.b.class));
    this.hqs = false;
    this.hqt = false;
    this.mode = 1;
    GMTrace.o(5628151988224L, 41933);
  }
  
  private void c(final boolean paramBoolean, int paramInt)
  {
    GMTrace.i(15037485809664L, 112038);
    if (this.hqs)
    {
      w.i("MicroMsg.AAQueryListUI", "getNextPage, loading");
      GMTrace.o(15037485809664L, 112038);
      return;
    }
    if (paramBoolean)
    {
      this.hqt = false;
      this.hqp.removeFooterView(this.hqv);
    }
    this.hqs = true;
    b.a locala = this.hqo.hpF;
    com.tencent.mm.vending.g.g.u(Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt)).a(locala).d(new a() {}).a(new d.a()
    {
      public final void aH(Object paramAnonymousObject)
      {
        GMTrace.i(15040438599680L, 112060);
        w.i("MicroMsg.AAQueryListUI", "getNexPage failed: %s", new Object[] { paramAnonymousObject });
        if (AAQueryListUI.g(AAQueryListUI.this) != null)
        {
          AAQueryListUI.g(AAQueryListUI.this).dismiss();
          AAQueryListUI.h(AAQueryListUI.this);
        }
        AAQueryListUI.i(AAQueryListUI.this);
        if (AAQueryListUI.a(AAQueryListUI.this).getFooterViewsCount() > 0) {
          AAQueryListUI.a(AAQueryListUI.this).removeFooterView(AAQueryListUI.d(AAQueryListUI.this));
        }
        if ((paramAnonymousObject instanceof String))
        {
          Toast.makeText(AAQueryListUI.this, paramAnonymousObject.toString(), 1).show();
          GMTrace.o(15040438599680L, 112060);
          return;
        }
        Toast.makeText(AAQueryListUI.this, a.i.sTs, 1).show();
        GMTrace.o(15040438599680L, 112060);
      }
    });
    GMTrace.o(15037485809664L, 112038);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5628554641408L, 41936);
    int i = a.g.sLw;
    GMTrace.o(5628554641408L, 41936);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5628688859136L, 41937);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      boolean bool = paramIntent.getBooleanExtra("close_aa", false);
      int i = paramIntent.getIntExtra("item_position", 0);
      int j = paramIntent.getIntExtra("item_offset", 0);
      if (bool)
      {
        this.hqp.setSelectionFromTop(i, j);
        c(true, this.mode);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(5628688859136L, 41937);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5628286205952L, 41934);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5635265527808L, 41986);
        AAQueryListUI.this.finish();
        GMTrace.o(5635265527808L, 41986);
        return false;
      }
    });
    oM(a.i.sRw);
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15034935672832L, 112019);
        paramAnonymousMenuItem = new f(AAQueryListUI.this, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(15035204108288L, 112021);
            paramAnonymous2n.add(0, 1, 1, a.i.sRx);
            paramAnonymous2n.add(1, 2, 1, a.i.sRy);
            GMTrace.o(15035204108288L, 112021);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(15039901728768L, 112056);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(15039901728768L, 112056);
              return;
              w.i("MicroMsg.AAQueryListUI", "go to launch list: %d", new Object[] { Integer.valueOf(AAQueryListUI.e(AAQueryListUI.this)) });
              if (AAQueryListUI.e(AAQueryListUI.this) == 1)
              {
                GMTrace.o(15039901728768L, 112056);
                return;
              }
              AAQueryListUI.a(AAQueryListUI.this, 1);
              AAQueryListUI.this.oM(a.i.sRw);
              AAQueryListUI.f(AAQueryListUI.this).mode = AAQueryListUI.e(AAQueryListUI.this);
              AAQueryListUI.f(AAQueryListUI.this).PU();
              AAQueryListUI.f(AAQueryListUI.this).notifyDataSetChanged();
              AAQueryListUI.a(AAQueryListUI.this, true, AAQueryListUI.e(AAQueryListUI.this));
              GMTrace.o(15039901728768L, 112056);
              return;
              w.i("MicroMsg.AAQueryListUI", "go to pay query list: %d", new Object[] { Integer.valueOf(AAQueryListUI.e(AAQueryListUI.this)) });
              if (AAQueryListUI.e(AAQueryListUI.this) == 2)
              {
                GMTrace.o(15039901728768L, 112056);
                return;
              }
              AAQueryListUI.this.oM(a.i.sRz);
              AAQueryListUI.f(AAQueryListUI.this).mode = AAQueryListUI.e(AAQueryListUI.this);
              AAQueryListUI.f(AAQueryListUI.this).PU();
              AAQueryListUI.f(AAQueryListUI.this).notifyDataSetChanged();
              AAQueryListUI.a(AAQueryListUI.this, 2);
              AAQueryListUI.a(AAQueryListUI.this, true, AAQueryListUI.e(AAQueryListUI.this));
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(15034935672832L, 112019);
        return true;
      }
    });
    this.hqp = ((ListView)findViewById(a.f.spu));
    this.hqp.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5617951440896L, 41857);
        if ((AAQueryListUI.a(AAQueryListUI.this).getLastVisiblePosition() == AAQueryListUI.a(AAQueryListUI.this).getCount() - 1) && (AAQueryListUI.a(AAQueryListUI.this).getCount() > 0) && (!AAQueryListUI.b(AAQueryListUI.this)) && (!AAQueryListUI.c(AAQueryListUI.this)))
        {
          AAQueryListUI.a(AAQueryListUI.this).addFooterView(AAQueryListUI.d(AAQueryListUI.this));
          AAQueryListUI.a(AAQueryListUI.this, false, AAQueryListUI.e(AAQueryListUI.this));
        }
        GMTrace.o(5617951440896L, 41857);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5617817223168L, 41856);
        GMTrace.o(5617817223168L, 41856);
      }
    });
    this.hqp.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5627346681856L, 41927);
        int i;
        if (AAQueryListUI.f(AAQueryListUI.this) != null)
        {
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= AAQueryListUI.f(AAQueryListUI.this).getCount()))
          {
            w.i("MicroMsg.AAQueryListUI", "click out of bound! %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
            GMTrace.o(5627346681856L, 41927);
            return;
          }
          i = paramAnonymousView.getTop();
          paramAnonymousView = (k)AAQueryListUI.f(AAQueryListUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousView != null)
          {
            if (bg.nm(paramAnonymousView.tMl)) {
              break label165;
            }
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("rawUrl", paramAnonymousView.tMl);
            com.tencent.mm.bj.d.b(AAQueryListUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousAdapterView);
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(3) });
          GMTrace.o(5627346681856L, 41927);
          return;
          label165:
          if (!bg.nm(paramAnonymousView.tLZ))
          {
            paramAnonymousAdapterView = null;
            if (paramAnonymousView.tMk == 2) {
              paramAnonymousAdapterView = q.zE();
            }
            Intent localIntent = new Intent(AAQueryListUI.this, PaylistAAUI.class);
            localIntent.putExtra("bill_no", paramAnonymousView.tLZ);
            localIntent.putExtra("launcher_user_name", paramAnonymousAdapterView);
            localIntent.putExtra("enter_scene", 4);
            localIntent.putExtra("chatroom", paramAnonymousView.tMa);
            localIntent.putExtra("item_position", paramAnonymousInt);
            localIntent.putExtra("item_offset", i);
            AAQueryListUI.this.startActivityForResult(localIntent, 1);
          }
        }
      }
    });
    this.hqu = new AAQueryListLoadingMoreView(this);
    this.hqv = new AAQueryListH5UrlFooterView(this);
    this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    this.hqq = new b(this, this.mode);
    this.hqp.setAdapter(this.hqq);
    this.hqp.setVisibility(4);
    c(false, this.mode);
    GMTrace.o(5628286205952L, 41934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\AAQueryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */