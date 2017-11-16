package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.tencent.mm.av.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.bottle.a.b;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.k;
import com.tencent.mm.y.q;

public class BottleConversationUI
  extends MMActivity
{
  private String eDs;
  private r hsU;
  private TextView jqc;
  private ListView jqd;
  private a jqe;
  private String jqf;
  private p.d jqg;
  private boolean jqh;
  
  public BottleConversationUI()
  {
    GMTrace.i(7611218919424L, 56708);
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(7633364844544L, 56873);
        BottleConversationUI.a(BottleConversationUI.this, BottleConversationUI.e(BottleConversationUI.this));
        GMTrace.o(7633364844544L, 56873);
      }
    };
    this.jqh = false;
    this.hsU = null;
    GMTrace.o(7611218919424L, 56708);
  }
  
  protected final void MP()
  {
    GMTrace.i(7612024225792L, 56714);
    int i = q.zI();
    int j = q.zP();
    at.AR();
    com.tencent.mm.y.c.xh().set(7, Integer.valueOf(i | 0x1000));
    at.AR();
    com.tencent.mm.y.c.xh().set(34, Integer.valueOf(j & 0xFFFFFFBF));
    this.jqd = ((ListView)findViewById(R.h.chU));
    this.jqc = ((TextView)findViewById(R.h.bwF));
    this.jqc.setText(R.l.dbh);
    this.jqe = new a(this, new o.a()
    {
      public final void QC()
      {
        GMTrace.i(7614305927168L, 56731);
        BottleConversationUI localBottleConversationUI = BottleConversationUI.this;
        String str = BottleConversationUI.this.getString(R.l.dbk);
        int i = k.zB();
        if (i <= 0) {
          localBottleConversationUI.sq(str);
        }
        while (BottleConversationUI.a(BottleConversationUI.this).getCount() <= 0)
        {
          BottleConversationUI.b(BottleConversationUI.this).setVisibility(0);
          BottleConversationUI.c(BottleConversationUI.this).setVisibility(8);
          GMTrace.o(7614305927168L, 56731);
          return;
          localBottleConversationUI.sq(str + "(" + i + ")");
        }
        BottleConversationUI.b(BottleConversationUI.this).setVisibility(8);
        BottleConversationUI.c(BottleConversationUI.this).setVisibility(0);
        GMTrace.o(7614305927168L, 56731);
      }
      
      public final void QD()
      {
        GMTrace.i(7614440144896L, 56732);
        GMTrace.o(7614440144896L, 56732);
      }
    });
    this.jqe.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(7628667224064L, 56838);
        int i = BottleConversationUI.c(BottleConversationUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(7628667224064L, 56838);
        return i;
      }
    });
    this.jqe.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(7604105379840L, 56655);
        BottleConversationUI.c(BottleConversationUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(7604105379840L, 56655);
      }
    });
    this.jqe.a(new MMSlideDelView.e()
    {
      public final void aV(Object paramAnonymousObject)
      {
        GMTrace.i(7649739407360L, 56995);
        if (paramAnonymousObject == null)
        {
          w.e("MicroMsg.Bottle.BottleConversationUI", "onItemDel object null");
          GMTrace.o(7649739407360L, 56995);
          return;
        }
        BottleConversationUI.a(BottleConversationUI.this, paramAnonymousObject.toString());
        GMTrace.o(7649739407360L, 56995);
      }
    });
    this.jqd.setAdapter(this.jqe);
    final Object localObject = new com.tencent.mm.ui.tools.l(this);
    this.jqd.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7634170150912L, 56879);
        if (paramAnonymousInt < BottleConversationUI.c(BottleConversationUI.this).getHeaderViewsCount())
        {
          w.w("MicroMsg.Bottle.BottleConversationUI", "on header view long click, ignore");
          GMTrace.o(7634170150912L, 56879);
          return true;
        }
        localObject.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BottleConversationUI.this, BottleConversationUI.d(BottleConversationUI.this));
        GMTrace.o(7634170150912L, 56879);
        return true;
      }
    });
    this.jqd.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7631083143168L, 56856);
        paramAnonymousAdapterView = (ae)BottleConversationUI.a(BottleConversationUI.this).getItem(paramAnonymousInt);
        paramAnonymousView = new Intent();
        paramAnonymousView.addFlags(67108864);
        paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.field_username);
        paramAnonymousView.putExtra("finish_direct", true);
        paramAnonymousView.putExtra("key_need_send_video", false);
        com.tencent.mm.plugin.bottle.a.hnH.e(paramAnonymousView, BottleConversationUI.this);
        GMTrace.o(7631083143168L, 56856);
      }
    });
    com.tencent.mm.plugin.bottle.a.hnI.pr();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7625311780864L, 56813);
        BottleConversationUI.this.finish();
        GMTrace.o(7625311780864L, 56813);
        return true;
      }
    });
    localObject = getIntent().getStringExtra("conversation_from");
    if ((bg.nm((String)localObject)) && (bg.nm(this.jqf))) {
      a(0, getString(R.l.dlB), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7653094850560L, 57020);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(BottleConversationUI.this, BottleBeachUI.class);
          BottleConversationUI.this.startActivity(paramAnonymousMenuItem);
          BottleConversationUI.this.finish();
          GMTrace.o(7653094850560L, 57020);
          return true;
        }
      });
    }
    for (;;)
    {
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7623164297216L, 56797);
          BackwardSupportUtil.c.a(BottleConversationUI.c(BottleConversationUI.this));
          GMTrace.o(7623164297216L, 56797);
        }
      };
      GMTrace.o(7612024225792L, 56714);
      return;
      if (!bg.nm((String)localObject)) {
        this.jqf = ((String)localObject);
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7611487354880L, 56710);
    int i = R.i.cGY;
    GMTrace.o(7611487354880L, 56710);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7611353137152L, 56709);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7611353137152L, 56709);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(7612158443520L, 56715);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.eDs = ((ae)this.jqe.getItem(paramView.position)).field_username;
    int i = R.l.dbd;
    paramContextMenuInfo = this.jqe;
    at.AR();
    paramContextMenu.setHeaderTitle(getString(i, new Object[] { paramContextMenuInfo.A(com.tencent.mm.y.c.yK().TE(this.eDs)) }));
    paramContextMenu.add(paramView.position, 0, 0, R.l.dbe);
    GMTrace.o(7612158443520L, 56715);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7611621572608L, 56711);
    this.jqe.aJe();
    super.onDestroy();
    GMTrace.o(7611621572608L, 56711);
  }
  
  public void onPause()
  {
    GMTrace.i(7611890008064L, 56713);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.jqe);
    at.AR();
    com.tencent.mm.y.c.yP().b(this.jqe);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().qq(8);
    if ((localObject != null) && (((ce)localObject).field_msgId > 0L))
    {
      w.d("MicroMsg.Bottle.BottleConversationUI", "resetUnread: lastReadTime = " + ((ce)localObject).field_createTime);
      at.AR();
      com.tencent.mm.y.c.xh().set(12306, Long.valueOf(((ce)localObject).field_createTime));
    }
    at.AR();
    localObject = com.tencent.mm.y.c.yP().TO("floatbottle");
    if ((localObject == null) || (bg.nl(((aj)localObject).field_username).length() <= 0)) {
      w.e("MicroMsg.Bottle.BottleConversationUI", "resetUnread: can not find bottle");
    }
    for (;;)
    {
      this.jqe.onPause();
      super.onPause();
      GMTrace.o(7611890008064L, 56713);
      return;
      ((ae)localObject).dz(0);
      at.AR();
      if (com.tencent.mm.y.c.yP().a((ae)localObject, ((aj)localObject).field_username) == -1) {
        w.e("MicroMsg.Bottle.BottleConversationUI", "reset bottle unread failed");
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(7611755790336L, 56712);
    super.onResume();
    at.AR();
    com.tencent.mm.y.c.yK().a(this.jqe);
    at.AR();
    com.tencent.mm.y.c.yP().a(this.jqe);
    this.jqe.a(null, null);
    GMTrace.o(7611755790336L, 56712);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottleConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */