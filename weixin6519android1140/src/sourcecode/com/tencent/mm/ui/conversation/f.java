package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.l.a;
import com.tencent.mm.modelsimple.ah;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public final class f
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener
{
  public Activity activity;
  public String eDs;
  private p.d mTX;
  public ae wQZ;
  private ListView wVF;
  private g wWm;
  private int[] wXe;
  
  public f(g paramg, ListView paramListView, Activity paramActivity, int[] paramArrayOfInt)
  {
    GMTrace.i(14681808830464L, 109388);
    this.eDs = "";
    this.wQZ = null;
    this.wXe = new int[2];
    this.mTX = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        paramAnonymousInt = 4;
        GMTrace.i(14515647283200L, 108150);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          paramAnonymousInt = -1;
          for (;;)
          {
            if (paramAnonymousInt > 0)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(11090, new Object[] { Integer.valueOf(paramAnonymousInt) });
              w.d("MicroMsg.ConversationClickListener", "jacks kv long click: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            }
            GMTrace.o(14515647283200L, 108150);
            return;
            if (s.eb(f.this.eDs))
            {
              com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(1), f.this.eDs });
              label163:
              paramAnonymousMenuItem = f.this.wQZ.vAo;
              if (paramAnonymousMenuItem == null) {
                break label322;
              }
              w.i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg[%s, %s, %s]", new Object[] { f.this.eDs, f.this.activity, f.this.wQZ.field_username, Long.valueOf(paramAnonymousMenuItem.field_msgId), paramAnonymousMenuItem.field_content, Long.valueOf(paramAnonymousMenuItem.field_createTime) });
            }
            for (;;)
            {
              b.a(f.this.eDs, f.this.activity, f.this.wQZ, null, true, false);
              paramAnonymousInt = 1;
              break;
              com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(1), f.this.eDs });
              break label163;
              label322:
              w.i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg is null", new Object[] { f.this.eDs, f.this.activity, f.this.wQZ.field_username });
            }
            w.d("MicroMsg.ConversationClickListener", "placed to the top");
            s.n(f.this.eDs, true);
            at.AR();
            paramAnonymousMenuItem = c.yK().TE(f.this.eDs);
            if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.bSA())) {
              com.tencent.mm.plugin.report.service.g.ork.i(13307, new Object[] { paramAnonymousMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1) });
            }
            com.tencent.mm.ui.base.h.bm(f.this.activity, f.this.activity.getString(R.l.dHR));
            com.tencent.mm.modelstat.b.gWv.c(true, f.this.eDs, true);
            continue;
            w.d("MicroMsg.ConversationClickListener", "unplaced to the top");
            s.o(f.this.eDs, true);
            at.AR();
            paramAnonymousMenuItem = c.yK().TE(f.this.eDs);
            if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.bSA())) {
              com.tencent.mm.plugin.report.service.g.ork.i(13307, new Object[] { paramAnonymousMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
            }
            com.tencent.mm.ui.base.h.bm(f.this.activity, f.this.activity.getString(R.l.dHS));
            com.tencent.mm.modelstat.b.gWv.c(true, f.this.eDs, false);
            paramAnonymousInt = 5;
            continue;
            w.d("MicroMsg.ConversationClickListener", "jacks mark read: %s", new Object[] { f.this.eDs });
            at.AR();
            c.yP().TQ(f.this.eDs);
            MMAppMgr.cancelNotification(f.this.eDs);
            ah.I(f.this.eDs, 1);
            com.tencent.mm.modelstat.b.gWv.D(f.this.eDs, false);
            paramAnonymousInt = 3;
            continue;
            w.d("MicroMsg.ConversationClickListener", "jacks set unread: %s", new Object[] { f.this.eDs });
            at.AR();
            c.yP().TR(f.this.eDs);
            com.tencent.mm.modelstat.b.gWv.D(f.this.eDs, true);
            paramAnonymousInt = 2;
            continue;
            w.d("MicroMsg.ConversationClickListener", "jacks clear history: %s", new Object[] { f.this.eDs });
            f.this.eDs.endsWith("@chatroom");
            paramAnonymousMenuItem = f.this.eDs;
            Activity localActivity = f.this.activity;
            PBool localPBool = new PBool();
            localPBool.value = false;
            localActivity.getString(R.l.cUG);
            bc.a(paramAnonymousMenuItem, new b.6(localPBool, com.tencent.mm.ui.base.h.a(localActivity, localActivity.getString(R.l.cUV), true, new b.5(localPBool))));
            paramAnonymousInt = -1;
          }
          w.d("MicroMsg.ConversationClickListener", "delete biz service: %s", new Object[] { f.this.eDs });
          at.AR();
          paramAnonymousMenuItem = c.yK().TE(f.this.eDs);
          com.tencent.mm.ui.tools.b.a(com.tencent.mm.af.f.iK(f.this.eDs), f.this.activity, paramAnonymousMenuItem, 1);
        }
      }
    };
    this.wWm = paramg;
    this.wVF = paramListView;
    this.activity = paramActivity;
    this.wXe = paramArrayOfInt;
    GMTrace.o(14681808830464L, 109388);
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    int j = 1;
    GMTrace.i(14488803737600L, 107950);
    at.AR();
    x localx = c.yK().TE(this.eDs);
    if (localx == null)
    {
      w.e("MicroMsg.ConversationClickListener", "onCreateContextMenu, contact is null, talker = " + this.eDs);
      GMTrace.o(14488803737600L, 107950);
      return;
    }
    String str = localx.vk();
    paramView = str;
    if (str.toLowerCase().endsWith("@chatroom"))
    {
      paramView = str;
      if (t.nm(localx.field_nickname)) {
        paramView = this.activity.getString(R.l.dhh);
      }
    }
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(this.activity, paramView));
    int i;
    if (this.wQZ != null)
    {
      i = 1;
      if ((i & s.b(this.wQZ)) != 0)
      {
        paramView = this.eDs;
        at.AR();
        paramView = c.yP().TO(paramView);
        if (paramView == null) {
          break label422;
        }
        if ((paramView.field_unReadCount > 0) || (paramView.eH(1048576))) {
          break label416;
        }
        i = j;
        label201:
        if (i == 0) {
          break label428;
        }
        paramContextMenu.add(paramContextMenuInfo.position, 8, 0, R.l.dHP);
      }
      label223:
      if ((this.wQZ != null) && (s.a(this.wQZ)))
      {
        at.AR();
        if (!c.yP().TV(this.eDs)) {
          break label448;
        }
        paramContextMenu.add(paramContextMenuInfo.position, 6, 0, R.l.dHQ);
      }
    }
    for (;;)
    {
      if ((localx.bSA()) && (a.eE(localx.field_type)) && (!s.gn(localx.field_username)) && (!s.fP(localx.field_username)))
      {
        paramView = com.tencent.mm.af.f.iK(localx.field_username);
        if ((paramView != null) && (paramView.EC())) {
          paramContextMenu.add(paramContextMenuInfo.position, 10, 0, R.l.dHM);
        }
      }
      if ((this.wQZ == null) || (this.wQZ.field_conversationTime == -1L)) {
        break label545;
      }
      if (!s.fI(this.eDs)) {
        break label494;
      }
      paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.dHV);
      GMTrace.o(14488803737600L, 107950);
      return;
      i = 0;
      break;
      label416:
      i = 0;
      break label201;
      label422:
      i = 0;
      break label201;
      label428:
      paramContextMenu.add(paramContextMenuInfo.position, 7, 0, R.l.dHN);
      break label223;
      label448:
      if (localx.bSA()) {
        paramContextMenu.add(paramContextMenuInfo.position, 5, 0, R.l.dlt);
      } else {
        paramContextMenu.add(paramContextMenuInfo.position, 5, 0, R.l.dHO);
      }
    }
    label494:
    if (s.fJ(this.eDs))
    {
      paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.dHU);
      GMTrace.o(14488803737600L, 107950);
      return;
    }
    paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.dHT);
    label545:
    GMTrace.o(14488803737600L, 107950);
  }
  
  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(14488669519872L, 107949);
    if (paramInt < this.wVF.getHeaderViewsCount())
    {
      w.d("MicroMsg.ConversationClickListener", "on long click header view");
      GMTrace.o(14488669519872L, 107949);
      return true;
    }
    this.wQZ = ((ae)this.wWm.AH(paramInt - this.wVF.getHeaderViewsCount()));
    if (this.wQZ == null)
    {
      w.e("MicroMsg.ConversationClickListener", "headercount:%d, postion:%d", new Object[] { Integer.valueOf(this.wVF.getHeaderViewsCount()), Integer.valueOf(paramInt) });
      GMTrace.o(14488669519872L, 107949);
      return true;
    }
    this.eDs = this.wQZ.field_username;
    new com.tencent.mm.ui.widget.h(this.activity).a(paramView, paramInt, paramLong, this, this.mTX, this.wXe[0], this.wXe[1]);
    if (s.eb(this.eDs)) {
      com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(0), this.eDs });
    }
    for (;;)
    {
      GMTrace.o(14488669519872L, 107949);
      return true;
      com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(0), this.eDs });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */