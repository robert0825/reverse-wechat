package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.p;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.platformtools.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;
import java.util.Map;

public class BizConversationUI
  extends BaseConversationUI
{
  private View hqF;
  
  public BizConversationUI()
  {
    GMTrace.i(3417720225792L, 25464);
    GMTrace.o(3417720225792L, 25464);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(3417988661248L, 25466);
    super.onConfigurationChanged(paramConfiguration);
    com.tencent.mm.pluginsdk.e.a(this, this.hqF);
    GMTrace.o(3417988661248L, 25466);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3417854443520L, 25465);
    super.onCreate(paramBundle);
    this.hqF = v.fb(this).inflate(R.i.cqo, null);
    setContentView(this.hqF);
    this.wVK = new a();
    aR().aV().a(R.h.bNx, this.wVK).commit();
    com.tencent.mm.pluginsdk.e.a(this, this.hqF);
    GMTrace.o(3417854443520L, 25465);
  }
  
  public static final class a
    extends BaseConversationUI.b
  {
    public String eDs;
    public String gvB;
    private r hsU;
    TextView jqc;
    public boolean jqh;
    public int juH;
    public int juI;
    public com.tencent.mm.ui.widget.h juL;
    public p.d mTX;
    private com.tencent.mm.sdk.b.c orz;
    public ae wQZ;
    public ListView wVZ;
    public d wVs;
    private String wWa;
    public long wWb;
    
    public a()
    {
      GMTrace.i(3391816204288L, 25271);
      this.eDs = "";
      this.wWb = 0L;
      this.juH = 0;
      this.juI = 0;
      this.hsU = null;
      this.jqh = false;
      this.mTX = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(14683822096384L, 109403);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(14683822096384L, 109403);
            return;
            at.AR();
            paramAnonymousMenuItem = com.tencent.mm.y.c.yK().TE(BizConversationUI.a.this.eDs);
            if (paramAnonymousMenuItem == null)
            {
              w.e("MicroMsg.BizConversationUI", "changed biz stick status failed, contact is null, talker = " + BizConversationUI.a.this.eDs);
              GMTrace.o(14683822096384L, 109403);
              return;
            }
            if (paramAnonymousMenuItem.vf())
            {
              g.ork.i(13307, new Object[] { paramAnonymousMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2) });
              s.o(BizConversationUI.a.this.eDs, true);
              GMTrace.o(14683822096384L, 109403);
              return;
            }
            g.ork.i(13307, new Object[] { paramAnonymousMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(2) });
            s.n(BizConversationUI.a.this.eDs, true);
            GMTrace.o(14683822096384L, 109403);
            return;
            at.AR();
            paramAnonymousMenuItem = com.tencent.mm.y.c.yK().TE(BizConversationUI.a.this.eDs);
            b.a(com.tencent.mm.af.x.FG().iC(BizConversationUI.a.this.eDs), BizConversationUI.a.this.bWQ(), paramAnonymousMenuItem, 2);
            GMTrace.o(14683822096384L, 109403);
            return;
            BizConversationUI.a.this.WC(BizConversationUI.a.this.eDs);
          }
        }
      };
      this.orz = new com.tencent.mm.sdk.b.c() {};
      GMTrace.o(3391816204288L, 25271);
    }
    
    public final void WC(String paramString)
    {
      GMTrace.i(16020496449536L, 119362);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.BizConversationUI", "Delete Conversation and messages fail because username is null or nil.");
        GMTrace.o(16020496449536L, 119362);
        return;
      }
      if ("officialaccounts".equals(this.gvB)) {
        g.ork.i(13773, new Object[] { Integer.valueOf(0), Integer.valueOf(this.wQZ.field_unReadCount), Integer.valueOf(0), this.wQZ.field_username });
      }
      at.AR();
      Object localObject1 = com.tencent.mm.y.c.yM().BZ(paramString);
      Object localObject2 = new ox();
      ((ox)localObject2).ufy = new azq().Rq(bg.nl(paramString));
      ((ox)localObject2).tQd = ((ce)localObject1).field_msgSvrId;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(8, (com.tencent.mm.bm.a)localObject2));
      this.jqh = false;
      localObject1 = bWQ();
      getString(R.l.cUG);
      bc.a(paramString, new bc.a()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(14687982845952L, 109434);
          BizConversationUI.a.this.jqh = true;
          GMTrace.o(14687982845952L, 109434);
        }
      }
      {
        public final void Bk()
        {
          GMTrace.i(14679392911360L, 109370);
          if (this.jOb != null) {
            this.jOb.dismiss();
          }
          GMTrace.o(14679392911360L, 109370);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(14679258693632L, 109369);
          boolean bool = BizConversationUI.a.this.jqh;
          GMTrace.o(14679258693632L, 109369);
          return bool;
        }
      });
      at.AR();
      localObject1 = com.tencent.mm.y.c.yK().TE(paramString);
      at.AR();
      localObject2 = com.tencent.mm.y.c.yP().TO(paramString);
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramString);
      if ((localObject2 != null) && ((((ae)localObject2).eH(4194304)) || ((localObject1 != null) && (((com.tencent.mm.storage.x)localObject1).bSA()) && (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject1).field_type)) && (((aj)localObject2).field_conversationTime < com.tencent.mm.af.x.FS()))))
      {
        paramString = new i(paramString);
        at.wS().a(paramString, 0);
      }
      GMTrace.o(16020496449536L, 119362);
    }
    
    protected final int getLayoutId()
    {
      GMTrace.i(3392084639744L, 25273);
      int i = R.i.cGY;
      GMTrace.o(3392084639744L, 25273);
      return i;
    }
    
    public final String getUserName()
    {
      GMTrace.i(3392218857472L, 25274);
      String str = this.gvB;
      GMTrace.o(3392218857472L, 25274);
      return str;
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      GMTrace.i(3391950422016L, 25272);
      super.onActivityCreated(paramBundle);
      this.gvB = bWQ().getIntent().getStringExtra("enterprise_biz_name");
      if (bg.nm(this.gvB)) {
        this.gvB = "officialaccounts";
      }
      if (bg.nl(this.gvB).equals("officialaccounts")) {
        g.ork.A(11404, "");
      }
      this.wWa = bWQ().getIntent().getStringExtra("enterprise_biz_display_name");
      if (bg.nm(this.wWa)) {
        this.wWa = getString(R.l.daG);
      }
      sq(this.wWa);
      this.wVZ = ((ListView)findViewById(R.h.chU));
      this.jqc = ((TextView)findViewById(R.h.bwF));
      this.jqc.setText(R.l.dpK);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3419733491712L, 25479);
          BizConversationUI.a.this.finish();
          GMTrace.o(3419733491712L, 25479);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3372757286912L, 25129);
          a.b.a(BizConversationUI.a.this.wVZ);
          GMTrace.o(3372757286912L, 25129);
        }
      };
      this.wVs = new a(bWQ(), this.gvB, new o.a()
      {
        public final void QC()
        {
          GMTrace.i(3425773289472L, 25524);
          BizConversationUI.a locala = BizConversationUI.a.this;
          if (BizConversationUI.a.this.wVs.getCount() <= 0)
          {
            locala.jqc.setVisibility(0);
            locala.wVZ.setVisibility(8);
            GMTrace.o(3425773289472L, 25524);
            return;
          }
          locala.jqc.setVisibility(8);
          locala.wVZ.setVisibility(0);
          GMTrace.o(3425773289472L, 25524);
        }
        
        public final void QD()
        {
          GMTrace.i(3425907507200L, 25525);
          GMTrace.o(3425907507200L, 25525);
        }
      });
      this.wVs.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(3420538798080L, 25485);
          int i = BizConversationUI.a.this.wVZ.getPositionForView(paramAnonymousView);
          GMTrace.o(3420538798080L, 25485);
          return i;
        }
      });
      this.wVs.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(3375307423744L, 25148);
          BizConversationUI.a.this.wVZ.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(3375307423744L, 25148);
        }
      });
      this.wVZ.setAdapter(this.wVs);
      this.juL = new com.tencent.mm.ui.widget.h(bWQ());
      this.wVZ.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(3407653896192L, 25389);
          BizConversationUI.a.this.wQZ = ((ae)BizConversationUI.a.this.wVs.getItem(paramAnonymousInt));
          BizConversationUI.a.this.eDs = BizConversationUI.a.this.wQZ.field_username;
          paramAnonymousAdapterView = BizConversationUI.a.this.wQZ;
          if (paramAnonymousAdapterView == null)
          {
            w.e("MicroMsg.BizConversationUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(BizConversationUI.a.this.wVs.getCount()) });
            BizConversationUI.a.this.wVs.notifyDataSetChanged();
            GMTrace.o(3407653896192L, 25389);
            return;
          }
          paramAnonymousView = new Bundle();
          paramAnonymousView.putInt("biz_click_item_unread_count", BizConversationUI.a.this.wQZ.field_unReadCount);
          paramAnonymousView.putInt("biz_click_item_position", paramAnonymousInt + 1);
          BizConversationUI.a.this.wVW.a(paramAnonymousAdapterView.field_username, paramAnonymousView, true);
          GMTrace.o(3407653896192L, 25389);
        }
      });
      this.wVZ.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(14687714410496L, 109432);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(14687714410496L, 109432);
            return false;
            BizConversationUI.a.this.juH = ((int)paramAnonymousMotionEvent.getRawX());
            BizConversationUI.a.this.juI = ((int)paramAnonymousMotionEvent.getRawY());
          }
        }
      });
      this.wVZ.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(14687580192768L, 109431);
          BizConversationUI.a.this.wQZ = ((ae)BizConversationUI.a.this.wVs.getItem(paramAnonymousInt));
          BizConversationUI.a.this.eDs = BizConversationUI.a.this.wQZ.field_username;
          BizConversationUI.a.this.juL.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BizConversationUI.a.this, BizConversationUI.a.this.mTX, BizConversationUI.a.this.juH, BizConversationUI.a.this.juI);
          GMTrace.o(14687580192768L, 109431);
          return true;
        }
      });
      this.wVs.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(14678453387264L, 109363);
          int i = BizConversationUI.a.this.wVZ.getPositionForView(paramAnonymousView);
          GMTrace.o(14678453387264L, 109363);
          return i;
        }
      });
      this.wVs.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(14683151007744L, 109398);
          BizConversationUI.a.this.wVZ.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(14683151007744L, 109398);
        }
      });
      this.wVs.a(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(14681943048192L, 109389);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.BizConversationUI", "onItemDel object null");
            GMTrace.o(14681943048192L, 109389);
            return;
          }
          paramAnonymousObject = paramAnonymousObject.toString();
          BizConversationUI.a.this.WC((String)paramAnonymousObject);
          GMTrace.o(14681943048192L, 109389);
        }
      });
      if ("officialaccounts".equals(this.gvB))
      {
        paramBundle = com.tencent.mm.y.c.c.Ct().er("100045");
        if ((!paramBundle.isValid()) || (!"1".equals(paramBundle.bSg().get("isOpenSearch")))) {
          break label489;
        }
      }
      label489:
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.BizConversationUI", "open search entrance:%b", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          a(1, R.l.eey, R.k.cIS, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(3387387019264L, 25238);
              if (com.tencent.mm.az.e.Kr())
              {
                paramAnonymousMenuItem = com.tencent.mm.az.e.Kv();
                paramAnonymousMenuItem.putExtra("title", BizConversationUI.a.this.getString(R.l.dyC));
                paramAnonymousMenuItem.putExtra("searchbar_tips", BizConversationUI.a.this.getString(R.l.dyC));
                paramAnonymousMenuItem.putExtra("KRightBtn", true);
                paramAnonymousMenuItem.putExtra("ftsneedkeyboard", true);
                paramAnonymousMenuItem.putExtra("publishIdPrefix", "bs");
                paramAnonymousMenuItem.putExtra("ftsType", 2);
                paramAnonymousMenuItem.putExtra("ftsbizscene", 11);
                paramAnonymousMenuItem.putExtra("rawUrl", com.tencent.mm.az.e.n(com.tencent.mm.az.e.a(11, true, 2)));
                paramAnonymousMenuItem.putExtra("key_load_js_without_delay", true);
                paramAnonymousMenuItem.addFlags(67108864);
                com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramAnonymousMenuItem);
              }
              for (;;)
              {
                GMTrace.o(3387387019264L, 25238);
                return true;
                w.e("MicroMsg.BizConversationUI", "fts h5 template not avail");
              }
            }
          });
        }
        at.AR();
        com.tencent.mm.y.c.yP().a(this.wVs);
        this.wWb = System.currentTimeMillis();
        com.tencent.mm.sdk.b.a.vgX.b(this.orz);
        GMTrace.o(3391950422016L, 25272);
        return;
      }
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(3392755728384L, 25278);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if ((this.eDs != null) && (!this.eDs.isEmpty())) {
        this.eDs = "";
      }
      if (paramInt2 != -1)
      {
        GMTrace.o(3392755728384L, 25278);
        return;
      }
      GMTrace.o(3392755728384L, 25278);
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(3392889946112L, 25279);
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      at.AR();
      com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(this.eDs);
      if (localx == null)
      {
        w.e("MicroMsg.BizConversationUI", "onCreateContextMenu, contact is null, talker = " + this.eDs);
        GMTrace.o(3392889946112L, 25279);
        return;
      }
      String str = localx.vk();
      paramView = str;
      if (str.toLowerCase().endsWith("@chatroom"))
      {
        paramView = str;
        if (bg.nm(localx.field_nickname)) {
          paramView = getString(R.l.dhh);
        }
      }
      paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(bWQ(), paramView));
      if (com.tencent.mm.l.a.eE(localx.field_type))
      {
        if (!localx.vf()) {
          break label217;
        }
        paramContextMenu.add(paramContextMenuInfo.position, 1, 0, R.l.dHQ);
      }
      for (;;)
      {
        paramContextMenu.add(paramContextMenuInfo.position, 2, 0, R.l.dHM);
        paramContextMenu.add(paramContextMenuInfo.position, 3, 0, R.l.dHT);
        GMTrace.o(3392889946112L, 25279);
        return;
        label217:
        paramContextMenu.add(paramContextMenuInfo.position, 1, 0, R.l.dlt);
      }
    }
    
    public final void onDestroy()
    {
      GMTrace.i(3392353075200L, 25275);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14683016790016L, 109397);
          if ((!at.AU()) || (!"officialaccounts".equals(BizConversationUI.a.this.gvB)))
          {
            GMTrace.o(14683016790016L, 109397);
            return;
          }
          long l3 = System.currentTimeMillis();
          int j = 0;
          int k = 0;
          int i = 0;
          long l1 = 0L;
          StringBuilder localStringBuilder = new StringBuilder("");
          at.AR();
          Cursor localCursor = com.tencent.mm.y.c.yP().c(s.gmw, null, BizConversationUI.a.this.gvB);
          int i1;
          if (localCursor != null)
          {
            int i3 = localCursor.getColumnIndex("unReadCount");
            int i4 = localCursor.getColumnIndex("conversationTime");
            int i5 = localCursor.getColumnIndex("flag");
            i1 = localCursor.getCount();
            ae localae = new ae();
            if (localCursor.moveToNext())
            {
              localae.y(localCursor.getLong(i5));
              m = localCursor.getInt(i3);
              long l2;
              int n;
              if (m > 0)
              {
                l2 = localCursor.getLong(i4);
                n = k + 1;
                k = j + m;
                j = m;
                m = k;
                label211:
                if (!localCursor.isFirst()) {
                  break label300;
                }
              }
              label300:
              for (String str = "";; str = ".")
              {
                localStringBuilder.append(str).append(j);
                at.AR();
                l1 = l2;
                k = n;
                j = m;
                if (!com.tencent.mm.y.c.yP().g(localae)) {
                  break;
                }
                i += 1;
                l1 = l2;
                k = n;
                j = m;
                break;
                int i2 = 0;
                l2 = l1;
                n = k;
                m = j;
                j = i2;
                break label211;
              }
            }
            localCursor.close();
          }
          for (int m = i1;; m = 0)
          {
            g.ork.i(13771, new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(j), Long.valueOf(l1 / 1000L), Integer.valueOf(i), localStringBuilder.toString() });
            w.v("MicroMsg.BizConversationUI", "report use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
            GMTrace.o(14683016790016L, 109397);
            return;
            j = 0;
            k = 0;
            l1 = 0L;
            i = 0;
          }
        }
      });
      if ((this.wWb != 0L) && ("officialaccounts".equals(this.gvB))) {
        g.ork.i(13932, new Object[] { Integer.valueOf((int)(System.currentTimeMillis() - this.wWb) / 1000) });
      }
      com.tencent.mm.sdk.b.a.vgX.c(this.orz);
      if (at.AU())
      {
        at.AR();
        com.tencent.mm.y.c.yP().b(this.wVs);
      }
      if (this.wVs != null) {
        this.wVs.onDestroy();
      }
      super.onDestroy();
      GMTrace.o(3392353075200L, 25275);
    }
    
    public final void onPause()
    {
      GMTrace.i(3392621510656L, 25277);
      w.i("MicroMsg.BizConversationUI", "on pause");
      at.AR();
      com.tencent.mm.y.c.yP().TQ(this.gvB);
      if (this.wVs != null) {
        this.wVs.onPause();
      }
      super.onPause();
      GMTrace.o(3392621510656L, 25277);
    }
    
    public final void onResume()
    {
      GMTrace.i(3392487292928L, 25276);
      w.v("MicroMsg.BizConversationUI", "on resume");
      if (this.wVs != null) {
        this.wVs.onResume();
      }
      super.onResume();
      GMTrace.o(3392487292928L, 25276);
    }
    
    private static final class a
      extends d
    {
      private String ePK;
      
      public a(Context paramContext, String paramString, o.a parama)
      {
        super(parama);
        GMTrace.i(3418525532160L, 25470);
        this.ePK = paramString;
        GMTrace.o(3418525532160L, 25470);
      }
      
      public final void QF()
      {
        GMTrace.i(3418659749888L, 25471);
        at.AR();
        setCursor(com.tencent.mm.y.c.yP().c(s.gmw, this.iVA, this.ePK));
        if (this.vKu != null) {
          this.vKu.QC();
        }
        super.notifyDataSetChanged();
        GMTrace.o(3418659749888L, 25471);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\BizConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */