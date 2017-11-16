package com.tencent.mm.ui.chatting.d;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.t;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.a.b.a;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.a.b.e;
import com.tencent.mm.ui.gridviewheaders.a;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public final class d
  extends b
{
  public int iGe;
  public int wOJ;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14943264964608L, 111336);
    this.iGe = -1;
    this.wOJ = 0;
    GMTrace.o(14943264964608L, 111336);
  }
  
  public final String Qb()
  {
    GMTrace.i(14943533400064L, 111338);
    String str = this.mContext.getString(R.l.cRy);
    GMTrace.o(14943533400064L, 111338);
    return str;
  }
  
  public final void a(b.a parama, int paramInt)
  {
    GMTrace.i(16449322090496L, 122557);
    parama = (b)parama;
    a locala = (a)CV(paramInt);
    if (bg.nm(locala.desc)) {
      parama.hqI.setVisibility(8);
    }
    for (;;)
    {
      parama.iub.setImageResource(locala.iconRes);
      GMTrace.o(16449322090496L, 122557);
      return;
      parama.hqI.setVisibility(0);
      parama.hqI.setText(bg.aq(locala.desc, ""));
    }
  }
  
  public final void a(com.tencent.mm.ui.chatting.a.b.b paramb)
  {
    GMTrace.i(16449456308224L, 122558);
    if (!CU())
    {
      u.fo(this.mContext);
      GMTrace.o(16449456308224L, 122558);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(this.mContext, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
    localIntent.putExtra("app_msg_id", paramb.eDr);
    this.mContext.startActivity(localIntent);
    GMTrace.o(16449456308224L, 122558);
  }
  
  public final void ceZ()
  {
    GMTrace.i(14943399182336L, 111337);
    w.i("MicroMsg.FileHistoryListPresenter", "[loadData] isFirst:%s", new Object[] { Boolean.valueOf(true) });
    this.wOy.cfd();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14940312174592L, 111314);
        LinkedList localLinkedList = new LinkedList();
        at.AR();
        Cursor localCursor = com.tencent.mm.y.c.yM().bl(d.this.iGc, d.this.iGe);
        if (localCursor == null)
        {
          w.e("MicroMsg.FileHistoryListPresenter", "[loadData] cursor is null!");
          GMTrace.o(14940312174592L, 111314);
          return;
        }
        if (s.eb(d.this.iGc)) {
          at.AR();
        }
        Object localObject2;
        for (q localq = com.tencent.mm.y.c.yT().gC(d.this.iGc);; localObject2 = null)
        {
          long l1 = 0L;
          try
          {
            while (localCursor.moveToNext())
            {
              au localau = new au();
              localau.b(localCursor);
              Object localObject3 = localau.field_content;
              if (localObject3 != null)
              {
                f.a locala = f.a.eS((String)localObject3);
                if (6 == locala.type) {}
                for (int i = 1; i != 0; i = 0)
                {
                  localObject3 = new Date(localau.field_createTime);
                  long l2 = a.chJ().a((Date)localObject3);
                  if (l1 != l2)
                  {
                    localLinkedList.add(new b.c(localau.field_createTime));
                    localObject3 = d.this;
                    ((d)localObject3).wOJ += 1;
                  }
                  String str = d.b(localau, s.eb(d.this.iGc));
                  x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
                  localObject3 = "";
                  if (localq != null) {
                    localObject3 = localq.fs(str);
                  }
                  i = com.tencent.mm.pluginsdk.model.c.Oh(locala.giw);
                  localObject3 = new d.a(d.this, localau.field_createTime, locala.type, locala.title, localau.field_msgId, localx.field_username, localx.vj(), localx.field_conRemark, (String)localObject3);
                  ((d.a)localObject3).iconRes = i;
                  ((d.a)localObject3).desc = bg.aF(locala.giv);
                  localLinkedList.add(localObject3);
                  l1 = l2;
                  break;
                }
              }
            }
            localCursor.close();
            d.this.iFZ.addAll(localLinkedList);
            d.this.wOB = d.this.iFZ;
            localLinkedList.clear();
            w.i("MicroMsg.FileHistoryListPresenter", "[loadData] data:%s", new Object[] { Integer.valueOf(d.this.iFZ.size()) });
            com.tencent.mm.sdk.platformtools.af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14941654351872L, 111324);
                if (d.this.wOy != null) {
                  d.this.wOy.v(d.1.this.wOu, d.this.iFZ.size());
                }
                GMTrace.o(14941654351872L, 111324);
              }
            });
            GMTrace.o(14940312174592L, 111314);
            return;
          }
          finally
          {
            localCursor.close();
          }
        }
      }
    });
    GMTrace.o(14943399182336L, 111337);
  }
  
  public final b.e cfa()
  {
    GMTrace.i(16449053655040L, 122555);
    b.e local2 = new b.e()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16451469574144L, 122573);
        w.i("MicroMsg.FileHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        d.this.a(paramAnonymousb);
        GMTrace.o(16451469574144L, 122573);
      }
      
      public final void a(View paramAnonymousView, int paramAnonymousInt, final com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16451603791872L, 122574);
        w.i("MicroMsg.FileHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        new l(paramAnonymousView.getContext()).b(paramAnonymousView, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
          {
            GMTrace.i(14941385916416L, 111322);
            paramAnonymous2ContextMenu.add(0, 0, 0, paramAnonymous2View.getContext().getString(R.l.dSm));
            paramAnonymous2ContextMenu.add(0, 1, 0, paramAnonymous2View.getContext().getString(R.l.dfl));
            paramAnonymous2ContextMenu.add(0, 2, 0, paramAnonymous2View.getContext().getString(R.l.dgd));
            GMTrace.o(14941385916416L, 111322);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(14938701561856L, 111302);
            at.AR();
            paramAnonymous2MenuItem = com.tencent.mm.y.c.yM().cM(paramAnonymousb.eDr);
            d.this.d(paramAnonymous2Int, paramAnonymous2MenuItem);
            GMTrace.o(14938701561856L, 111302);
          }
        });
        GMTrace.o(16451603791872L, 122574);
      }
    };
    GMTrace.o(16449053655040L, 122555);
    return local2;
  }
  
  public final String cfc()
  {
    GMTrace.i(16448919437312L, 122554);
    String str = this.mContext.getString(R.l.cRy);
    GMTrace.o(16448919437312L, 122554);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(20395189075968L, 151956);
    GMTrace.o(20395189075968L, 151956);
    return 6;
  }
  
  public final RecyclerView.t m(ViewGroup paramViewGroup)
  {
    GMTrace.i(16449187872768L, 122556);
    paramViewGroup = new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cwY, paramViewGroup, false));
    GMTrace.o(16449187872768L, 122556);
    return paramViewGroup;
  }
  
  final class a
    extends com.tencent.mm.ui.chatting.a.b.b
  {
    public String desc;
    public int iconRes;
    
    public a(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      super(paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
      GMTrace.i(16454288146432L, 122594);
      GMTrace.o(16454288146432L, 122594);
    }
    
    public final boolean Wn(String paramString)
    {
      GMTrace.i(16786745458688L, 125071);
      if (paramString != null)
      {
        boolean bool = super.Wn(paramString.toLowerCase());
        GMTrace.o(16786745458688L, 125071);
        return bool;
      }
      GMTrace.o(16786745458688L, 125071);
      return false;
    }
    
    public final int getType()
    {
      GMTrace.i(16454422364160L, 122595);
      GMTrace.o(16454422364160L, 122595);
      return 6;
    }
  }
  
  final class b
    extends b.a
  {
    TextView hqI;
    ImageView iub;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(16454153928704L, 122593);
      this.iub = ((ImageView)paramView.findViewById(R.h.byW));
      this.hqH.setSingleLine(false);
      this.hqH.setMaxLines(2);
      this.hqI = ((TextView)paramView.findViewById(R.h.byL));
      GMTrace.o(16454153928704L, 122593);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */