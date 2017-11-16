package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
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
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.c;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class ShakeTvHistoryListUI
  extends MMActivity
{
  private p.d jqg;
  private a oRa;
  private ListView oRb;
  private String username;
  
  public ShakeTvHistoryListUI()
  {
    GMTrace.i(6573715881984L, 48978);
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6572507922432L, 48969);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          GMTrace.o(6572507922432L, 48969);
          return;
        }
        g.ork.i(12662, new Object[] { Integer.valueOf(1), bg.nl(ShakeTvHistoryListUI.d(ShakeTvHistoryListUI.this)) });
        paramAnonymousMenuItem = m.bfm();
        String str = ShakeTvHistoryListUI.d(ShakeTvHistoryListUI.this);
        if (bg.nm(str))
        {
          paramAnonymousInt = -1;
          label95:
          if (paramAnonymousInt >= 0) {
            break label194;
          }
          w.i("MicroMsg.ShakeTvHistoryListUI", "delete tv history fail, ret[%d]", new Object[] { Integer.valueOf(paramAnonymousInt) });
        }
        for (;;)
        {
          ShakeTvHistoryListUI.a(ShakeTvHistoryListUI.this).a(null, null);
          break;
          str = "username = '" + str + "'";
          paramAnonymousInt = paramAnonymousMenuItem.fTZ.delete(paramAnonymousMenuItem.getTableName(), str, null);
          w.d("MicroMsg.ShakeTvHistoryStorage", "delMsgByUserName = " + paramAnonymousInt);
          break label95;
          label194:
          paramAnonymousMenuItem = new c(1, ShakeTvHistoryListUI.d(ShakeTvHistoryListUI.this));
          at.wS().a(paramAnonymousMenuItem, 0);
        }
      }
    };
    GMTrace.o(6573715881984L, 48978);
  }
  
  protected final void MP()
  {
    GMTrace.i(6574118535168L, 48981);
    oM(R.l.ecu);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6571165745152L, 48959);
        ShakeTvHistoryListUI.this.aLo();
        ShakeTvHistoryListUI.this.finish();
        GMTrace.o(6571165745152L, 48959);
        return true;
      }
    });
    a(0, getString(R.l.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6570360438784L, 48953);
        h.a(ShakeTvHistoryListUI.this.vKB.vKW, true, ShakeTvHistoryListUI.this.getString(R.l.ect), "", ShakeTvHistoryListUI.this.getString(R.l.dUO), ShakeTvHistoryListUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6586600783872L, 49074);
            paramAnonymous2DialogInterface = g.ork;
            Object localObject2 = m.bfm();
            Object localObject1 = new ArrayList();
            localObject2 = ((com.tencent.mm.plugin.shake.d.a.o)localObject2).bfO();
            if (localObject2 != null)
            {
              while (((Cursor)localObject2).moveToNext())
              {
                com.tencent.mm.plugin.shake.d.a.n localn = new com.tencent.mm.plugin.shake.d.a.n();
                localn.b((Cursor)localObject2);
                ((List)localObject1).add(localn);
              }
              ((Cursor)localObject2).close();
            }
            localObject2 = new StringBuilder();
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              ((StringBuilder)localObject2).append(((com.tencent.mm.plugin.shake.d.a.n)((Iterator)localObject1).next()).field_username);
              ((StringBuilder)localObject2).append("|");
            }
            paramAnonymous2DialogInterface.i(12662, new Object[] { Integer.valueOf(2), ((StringBuilder)localObject2).toString() });
            m.bfm().fTZ.delete("shaketvhistory", null, null);
            paramAnonymous2DialogInterface = new c(2, null);
            at.wS().a(paramAnonymous2DialogInterface, 0);
            ShakeTvHistoryListUI.a(ShakeTvHistoryListUI.this).QF();
            ShakeTvHistoryListUI.this.lf(false);
            GMTrace.o(6586600783872L, 49074);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6586063912960L, 49070);
            GMTrace.o(6586063912960L, 49070);
          }
        });
        GMTrace.o(6570360438784L, 48953);
        return true;
      }
    });
    this.oRb = ((ListView)findViewById(R.h.cej));
    this.oRa = new a(this);
    this.oRb.setAdapter(this.oRa);
    this.oRb.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6569555132416L, 48947);
        k.a((com.tencent.mm.plugin.shake.d.a.n)ShakeTvHistoryListUI.a(ShakeTvHistoryListUI.this).getItem(paramAnonymousInt), ShakeTvHistoryListUI.this.vKB.vKW, 2);
        GMTrace.o(6569555132416L, 48947);
      }
    });
    final l locall = new l(this);
    this.oRb.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6571434180608L, 48961);
        if (paramAnonymousInt < ShakeTvHistoryListUI.b(ShakeTvHistoryListUI.this).getHeaderViewsCount())
        {
          GMTrace.o(6571434180608L, 48961);
          return true;
        }
        locall.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ShakeTvHistoryListUI.this.vKB.vKW, ShakeTvHistoryListUI.c(ShakeTvHistoryListUI.this));
        GMTrace.o(6571434180608L, 48961);
        return true;
      }
    });
    GMTrace.o(6574118535168L, 48981);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6574386970624L, 48983);
    int i = R.i.cGu;
    GMTrace.o(6574386970624L, 48983);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6573850099712L, 48979);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6573850099712L, 48979);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6574252752896L, 48982);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.username = ((com.tencent.mm.plugin.shake.d.a.n)this.oRa.getItem(paramView.position)).field_username;
    paramContextMenu.add(paramView.position, 0, 0, R.l.cSt);
    GMTrace.o(6574252752896L, 48982);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6573984317440L, 48980);
    this.oRa.aJe();
    super.onDestroy();
    GMTrace.o(6573984317440L, 48980);
  }
  
  final class a
    extends com.tencent.mm.ui.o<com.tencent.mm.plugin.shake.d.a.n>
  {
    private LayoutInflater CJ;
    
    public a(Context paramContext)
    {
      super(new com.tencent.mm.plugin.shake.d.a.n());
      GMTrace.i(6587003437056L, 49077);
      this.CJ = LayoutInflater.from(paramContext);
      GMTrace.o(6587003437056L, 49077);
    }
    
    public final void QF()
    {
      GMTrace.i(6587271872512L, 49079);
      setCursor(m.bfm().bfO());
      super.notifyDataSetChanged();
      GMTrace.o(6587271872512L, 49079);
    }
    
    protected final void QG()
    {
      GMTrace.i(6587406090240L, 49080);
      QF();
      GMTrace.o(6587406090240L, 49080);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6587137654784L, 49078);
      Object localObject1;
      Object localObject2;
      long l1;
      if (paramView == null)
      {
        paramViewGroup = this.CJ.inflate(R.i.cGt, paramViewGroup, false);
        localObject1 = new a();
        ((a)localObject1).oRe = ((MMImageView)paramViewGroup.findViewById(R.h.ceg));
        ((a)localObject1).izE = ((TextView)paramViewGroup.findViewById(R.h.cei));
        ((a)localObject1).mOF = ((TextView)paramViewGroup.findViewById(R.h.ceh));
        paramViewGroup.setTag(localObject1);
        localObject2 = (com.tencent.mm.plugin.shake.d.a.n)getItem(paramInt);
        e.a(((a)localObject1).oRe, ((com.tencent.mm.plugin.shake.d.a.n)localObject2).field_iconurl, 0, true);
        ((a)localObject1).izE.setText(((com.tencent.mm.plugin.shake.d.a.n)localObject2).field_title);
        localObject1 = ((a)localObject1).mOF;
        paramView = ShakeTvHistoryListUI.this.vKB.vKW;
        l1 = ((com.tencent.mm.plugin.shake.d.a.n)localObject2).field_createtime * 1000L;
        localObject2 = new GregorianCalendar();
        if (l1 >= 3600000L) {
          break label204;
        }
        paramView = "";
      }
      for (;;)
      {
        ((TextView)localObject1).setText(paramView);
        GMTrace.o(6587137654784L, 49078);
        return paramViewGroup;
        localObject1 = (a)paramView.getTag();
        paramViewGroup = paramView;
        break;
        label204:
        localObject2 = new GregorianCalendar(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2), ((GregorianCalendar)localObject2).get(5));
        long l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
        if ((l2 > 0L) && (l2 <= 86400000L))
        {
          paramView = com.tencent.mm.pluginsdk.i.n.ac(paramView.getString(R.l.dwR), l1 / 1000L);
        }
        else
        {
          l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L;
          if ((l2 > 0L) && (l2 <= 86400000L)) {
            paramView = paramView.getString(R.l.dwU);
          } else {
            paramView = com.tencent.mm.pluginsdk.i.n.ac(paramView.getString(R.l.dwM), l1 / 1000L);
          }
        }
      }
    }
    
    final class a
    {
      TextView izE;
      TextView mOF;
      MMImageView oRe;
      
      a()
      {
        GMTrace.i(6580829421568L, 49031);
        GMTrace.o(6580829421568L, 49031);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeTvHistoryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */