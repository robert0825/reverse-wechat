package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.collect.b.j;
import com.tencent.mm.plugin.collect.b.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.apd;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.kb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectBillUI
  extends WalletBaseUI
{
  private int aCN;
  private int fromScene;
  private boolean gpJ;
  private String hpw;
  private l iok;
  private View jIq;
  private long jWm;
  private ListView jYS;
  private p.d jZA;
  private boolean jZa;
  private a jZo;
  private LinearLayout jZp;
  private CollectBillHeaderView jZq;
  private ImageView jZr;
  private MMSwitchBtn jZs;
  private ImageView jZt;
  private MMSwitchBtn jZu;
  private TextView jZv;
  private boolean jZw;
  private boolean jZx;
  private long jZy;
  private com.tencent.mm.ad.e jZz;
  private int type;
  
  public CollectBillUI()
  {
    GMTrace.i(5433133629440L, 40480);
    this.jZw = false;
    this.jZa = false;
    this.gpJ = false;
    this.jZx = true;
    this.aCN = 20;
    this.jZz = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, final k paramAnonymousk)
      {
        GMTrace.i(17414615990272L, 129749);
        if ((paramAnonymousk instanceof j))
        {
          paramAnonymousString = (j)paramAnonymousk;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = paramAnonymousString.jWq.uaM;
            if ((paramAnonymousString == null) || (paramAnonymousString.isEmpty()))
            {
              CollectBillUI.a(CollectBillUI.this).setVisibility(8);
              GMTrace.o(17414615990272L, 129749);
              return;
            }
            paramAnonymousString = paramAnonymousString.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousk = (cj)paramAnonymousString.next();
              if ((paramAnonymousk.type == 1) && (!bg.nm(paramAnonymousk.eLQ)))
              {
                w.i("MicroMsg.CollectBillUI", "show notice");
                CollectBillUI.a(CollectBillUI.this).setText(paramAnonymousk.eLQ);
                CollectBillUI.a(CollectBillUI.this).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymous2View)
                  {
                    GMTrace.i(17425487626240L, 129830);
                    if (!bg.nm(paramAnonymousk.url)) {
                      com.tencent.mm.wallet_core.ui.e.m(CollectBillUI.this.vKB.vKW, paramAnonymousk.url, true);
                    }
                    GMTrace.o(17425487626240L, 129830);
                  }
                });
                CollectBillUI.a(CollectBillUI.this).setVisibility(0);
                GMTrace.o(17414615990272L, 129749);
                return;
              }
            }
            CollectBillUI.a(CollectBillUI.this).setVisibility(8);
            GMTrace.o(17414615990272L, 129749);
            return;
          }
          w.e("MicroMsg.CollectBillUI", "net error: %s", new Object[] { paramAnonymousString });
          CollectBillUI.a(CollectBillUI.this).setVisibility(8);
        }
        GMTrace.o(17414615990272L, 129749);
      }
    };
    this.jZA = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(17423340142592L, 129814);
        if (paramAnonymousMenuItem.getItemId() == 0)
        {
          paramAnonymousMenuItem = (AdapterView.AdapterContextMenuInfo)paramAnonymousMenuItem.getMenuInfo();
          paramAnonymousMenuItem = (com.tencent.mm.plugin.collect.b.a)CollectBillUI.b(CollectBillUI.this).getItemAtPosition(paramAnonymousMenuItem.position);
          if (paramAnonymousMenuItem != null) {
            CollectBillUI.a(CollectBillUI.this, paramAnonymousMenuItem.jVQ, paramAnonymousMenuItem.timestamp);
          }
        }
        GMTrace.o(17423340142592L, 129814);
      }
    };
    GMTrace.o(5433133629440L, 40480);
  }
  
  private void aoV()
  {
    GMTrace.i(5434207371264L, 40488);
    this.jYS.setVisibility(8);
    this.jZp.setVisibility(0);
    findViewById(a.f.sts).setVisibility(0);
    GMTrace.o(5434207371264L, 40488);
  }
  
  private void aoW()
  {
    GMTrace.i(5434073153536L, 40487);
    if (!this.gpJ)
    {
      r(new com.tencent.mm.plugin.collect.b.q(this.type, this.jWm, this.hpw, this.aCN));
      this.jZa = true;
    }
    GMTrace.o(5434073153536L, 40487);
  }
  
  private void c(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(5433938935808L, 40486);
    if (this.jZx)
    {
      CollectBillHeaderView localCollectBillHeaderView = this.jZq;
      int i = this.type;
      localCollectBillHeaderView.jYP.setText(com.tencent.mm.plugin.collect.b.e.a(localCollectBillHeaderView.getContext(), paramLong, i));
      localCollectBillHeaderView.jYQ.setText(com.tencent.mm.plugin.collect.b.e.mn(paramInt2));
      localCollectBillHeaderView.jXT.setText(localCollectBillHeaderView.getContext().getString(a.i.sSB, new Object[] { Integer.valueOf(paramInt1) }));
      this.jZx = false;
    }
    GMTrace.o(5433938935808L, 40486);
  }
  
  protected final void MP()
  {
    GMTrace.i(5433402064896L, 40482);
    this.jYS = ((ListView)findViewById(a.f.stF));
    this.jZp = ((LinearLayout)findViewById(a.f.str));
    this.jZv = ((TextView)findViewById(a.f.sto));
    this.jIq = v.fb(this).inflate(a.g.sLY, this.jYS, false);
    this.jZq = new CollectBillHeaderView(this);
    this.jYS.addHeaderView(this.jZq, null, false);
    this.jZo = new a(this);
    this.jYS.setAdapter(this.jZo);
    this.jYS.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5432999411712L, 40479);
        if ((CollectBillUI.b(CollectBillUI.this).getLastVisiblePosition() == CollectBillUI.c(CollectBillUI.this).getCount()) && (CollectBillUI.c(CollectBillUI.this).getCount() > 0) && (!CollectBillUI.d(CollectBillUI.this)) && (!CollectBillUI.e(CollectBillUI.this)))
        {
          CollectBillUI.f(CollectBillUI.this);
          CollectBillUI.g(CollectBillUI.this);
        }
        GMTrace.o(5432999411712L, 40479);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5432865193984L, 40478);
        GMTrace.o(5432865193984L, 40478);
      }
    });
    this.iok = new l(this);
    this.jYS.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5423604170752L, 40409);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          w.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(paramAnonymousAdapterView.getAdapter().getCount()) });
          GMTrace.o(5423604170752L, 40409);
          return;
        }
        paramAnonymousAdapterView = (com.tencent.mm.plugin.collect.b.a)CollectBillUI.b(CollectBillUI.this).getItemAtPosition(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.CollectBillUI", "invalid position: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(5423604170752L, 40409);
          return;
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("scene", 2);
        paramAnonymousView.putExtra("trans_id", paramAnonymousAdapterView.jVR);
        paramAnonymousView.putExtra("bill_id", paramAnonymousAdapterView.jVQ);
        com.tencent.mm.bj.d.b(CollectBillUI.this.vKB.vKW, "order", ".ui.MallOrderTransactionInfoUI", paramAnonymousView);
        GMTrace.o(5423604170752L, 40409);
      }
    });
    this.jYS.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5414745800704L, 40343);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          w.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(paramAnonymousAdapterView.getAdapter().getCount()) });
          GMTrace.o(5414745800704L, 40343);
          return false;
        }
        CollectBillUI.i(CollectBillUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, CollectBillUI.this, CollectBillUI.h(CollectBillUI.this));
        GMTrace.o(5414745800704L, 40343);
        return true;
      }
    });
    if (this.fromScene != 2) {
      a(0, getString(a.i.sSy), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17415287078912L, 129754);
          paramAnonymousMenuItem = new Intent(CollectBillUI.this.vKB.vKW, CollectBillListUI.class);
          CollectBillUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(17415287078912L, 129754);
          return false;
        }
      });
    }
    Object localObject;
    if (this.fromScene == 2)
    {
      localObject = this.jZq.findViewById(a.f.suo);
      View localView = this.jZp.findViewById(a.f.sun);
      ((View)localObject).setVisibility(8);
      localView.setVisibility(8);
      GMTrace.o(5433402064896L, 40482);
      return;
    }
    this.jZr = ((ImageView)this.jZq.findViewById(a.f.sul));
    this.jZs = ((MMSwitchBtn)this.jZq.findViewById(a.f.sum));
    this.jZt = ((ImageView)this.jZp.findViewById(a.f.sul));
    this.jZu = ((MMSwitchBtn)this.jZp.findViewById(a.f.sum));
    com.tencent.mm.plugin.collect.a.a.aos();
    if (com.tencent.mm.plugin.collect.a.a.aou())
    {
      this.jZs.mK(true);
      this.jZu.mK(true);
      this.jZr.setImageResource(a.h.sQJ);
      this.jZt.setImageResource(a.h.sQJ);
    }
    for (;;)
    {
      localObject = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(17423608578048L, 129816);
          w.i("MicroMsg.CollectBillUI", "update switch: %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          CollectBillUI.j(CollectBillUI.this).mK(paramAnonymousBoolean);
          CollectBillUI.k(CollectBillUI.this).mK(paramAnonymousBoolean);
          if (paramAnonymousBoolean)
          {
            CollectBillUI.a(CollectBillUI.this, CollectBillUI.l(CollectBillUI.this) | 0x8000);
            CollectBillUI.m(CollectBillUI.this).setImageResource(a.h.sQJ);
            CollectBillUI.n(CollectBillUI.this).setImageResource(a.h.sQJ);
            Toast.makeText(CollectBillUI.this.vKB.vKW, a.i.sSQ, 1).show();
            g.ork.i(13944, new Object[] { Integer.valueOf(11) });
          }
          for (int i = 1;; i = 2)
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(147457, Long.valueOf(CollectBillUI.l(CollectBillUI.this)));
            apd localapd = new apd();
            localapd.oqH = i;
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(209, localapd));
            if (i != 1) {
              break;
            }
            com.tencent.mm.plugin.collect.a.a.aos().aov();
            GMTrace.o(17423608578048L, 129816);
            return;
            CollectBillUI.a(CollectBillUI.this, CollectBillUI.l(CollectBillUI.this) & 0xFFFFFFFFFFFF7FFF);
            CollectBillUI.m(CollectBillUI.this).setImageResource(a.h.sQI);
            CollectBillUI.n(CollectBillUI.this).setImageResource(a.h.sQI);
            Toast.makeText(CollectBillUI.this.vKB.vKW, a.i.sSJ, 1).show();
            g.ork.i(13944, new Object[] { Integer.valueOf(12) });
          }
          com.tencent.mm.plugin.collect.a.a.aos().aow();
          GMTrace.o(17423608578048L, 129816);
        }
      };
      this.jZs.xrE = ((MMSwitchBtn.a)localObject);
      this.jZu.xrE = ((MMSwitchBtn.a)localObject);
      GMTrace.o(5433402064896L, 40482);
      return;
      this.jZs.mK(false);
      this.jZu.mK(false);
      this.jZr.setImageResource(a.h.sQI);
      this.jZt.setImageResource(a.h.sQI);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5433670500352L, 40484);
    Object localObject;
    if ((paramk instanceof com.tencent.mm.plugin.collect.b.q))
    {
      paramString = (com.tencent.mm.plugin.collect.b.q)paramk;
      if (this.jZw)
      {
        this.jYS.removeFooterView(this.jIq);
        this.jZw = false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gpJ = paramString.gpJ;
        this.type = paramString.type;
        this.jWm = paramString.jWm;
        c(paramString.jWn, paramString.jWo, paramString.jWm);
        if (!paramString.jWQ.isEmpty())
        {
          if (bg.nm(this.hpw))
          {
            w.d("MicroMsg.CollectBillUI", "first query, hide block view");
            this.jYS.setVisibility(0);
            this.jZp.setVisibility(8);
          }
          paramk = this.jZo;
          localObject = paramString.jWQ;
          paramk.jYO.addAll((Collection)localObject);
          paramk.notifyDataSetChanged();
          this.hpw = ((com.tencent.mm.plugin.collect.b.a)paramString.jWQ.get(paramString.jWQ.size() - 1)).jVQ;
        }
        for (;;)
        {
          this.jZa = false;
          GMTrace.o(5433670500352L, 40484);
          return true;
          this.gpJ = true;
          if (bg.nm(this.hpw))
          {
            w.i("MicroMsg.CollectBillUI", "no record, show empty view");
            aoV();
          }
        }
      }
      w.i("MicroMsg.CollectBillUI", "net error!");
      this.jZa = false;
      Toast.makeText(this, a.i.sSv, 1).show();
      if (bg.nm(this.hpw)) {
        w.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
      }
      GMTrace.o(5433670500352L, 40484);
      return true;
    }
    if ((paramk instanceof o))
    {
      paramk = (o)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.jZo;
        localObject = paramk.jVQ;
        Iterator localIterator = paramString.jYO.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.collect.b.a locala = (com.tencent.mm.plugin.collect.b.a)localIterator.next();
          if (locala.jVQ.equals(localObject))
          {
            paramString.jYO.remove(locala);
            paramString.notifyDataSetChanged();
          }
        }
        if (this.jZo.getCount() <= 0)
        {
          w.i("MicroMsg.CollectBillUI", "delete all records");
          aoV();
        }
        for (;;)
        {
          GMTrace.o(5433670500352L, 40484);
          return false;
          c(paramk.jWn, paramk.jWo, this.jWm);
        }
      }
      w.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk.jVQ });
      Toast.makeText(this, a.i.sSu, 1).show();
      GMTrace.o(5433670500352L, 40484);
      return false;
    }
    GMTrace.o(5433670500352L, 40484);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5433804718080L, 40485);
    int i = a.g.sLR;
    GMTrace.o(5433804718080L, 40485);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5433267847168L, 40481);
    super.onCreate(paramBundle);
    this.jZy = com.tencent.mm.y.q.zJ();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    this.type = getIntent().getIntExtra("key_type", 0);
    this.jWm = getIntent().getLongExtra("key_timestamp", System.currentTimeMillis() / 1000L);
    aoW();
    MP();
    oM(a.i.sSA);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(1256, this.jZz);
    paramBundle = new j();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramBundle, 0);
    GMTrace.o(5433267847168L, 40481);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(5433536282624L, 40483);
    paramContextMenu.add(0, 0, 0, a.i.sSz);
    GMTrace.o(5433536282624L, 40483);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17415421296640L, 129755);
    super.onDestroy();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1256, this.jZz);
    GMTrace.o(17415421296640L, 129755);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectBillUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */