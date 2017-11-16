package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.aw.a;
import com.tencent.mm.aw.j;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsSelectBgUI
  extends MMActivity
  implements e
{
  private boolean oIT;
  private a oKb;
  private GridView oKc;
  private j oKd;
  private List<j> oKe;
  private aj oKf;
  private String username;
  
  public SettingsSelectBgUI()
  {
    GMTrace.i(4703526060032L, 35044);
    this.oKe = new ArrayList();
    this.oKf = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4708626333696L, 35082);
        if (SettingsSelectBgUI.this.findViewById(R.h.cdf).getWidth() <= 0)
        {
          GMTrace.o(4708626333696L, 35082);
          return true;
        }
        SettingsSelectBgUI.a(SettingsSelectBgUI.this);
        GMTrace.o(4708626333696L, 35082);
        return false;
      }
    }, true);
    GMTrace.o(4703526060032L, 35044);
  }
  
  private void bp(List<j> paramList)
  {
    GMTrace.i(4704331366400L, 35050);
    if (paramList.size() > 0)
    {
      this.oKd = ((j)paramList.remove(0));
      at.wS().a(this.oKd, 0);
      GMTrace.o(4704331366400L, 35050);
      return;
    }
    this.oKd = null;
    GMTrace.o(4704331366400L, 35050);
  }
  
  protected final void MP()
  {
    GMTrace.i(4704062930944L, 35048);
    oM(R.l.dYF);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4632793317376L, 34517);
        SettingsSelectBgUI.this.finish();
        GMTrace.o(4632793317376L, 34517);
        return true;
      }
    });
    this.oIT = getIntent().getBooleanExtra("isApplyToAll", true);
    this.username = getIntent().getStringExtra("username");
    this.oKf.z(20L, 20L);
    GMTrace.o(4704062930944L, 35048);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4704197148672L, 35049);
    if ((!(paramk instanceof com.tencent.mm.ad.m)) || (((com.tencent.mm.ad.m)paramk).DM() != 1))
    {
      w.d("MicroMsg.SettingsSelectBgUI", "another scene");
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    int i = paramk.getType();
    if ((i != 159) && (i != 160))
    {
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    if (i == 160) {
      bp(this.oKe);
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    GMTrace.o(4704197148672L, 35049);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4703660277760L, 35045);
    int i = R.i.cGh;
    GMTrace.o(4703660277760L, 35045);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4703794495488L, 35046);
    super.onCreate(paramBundle);
    MP();
    at.wS().a(159, this);
    at.wS().a(160, this);
    at.AR();
    if (c.isSDCardAvailable())
    {
      paramBundle = new com.tencent.mm.aw.k(1);
      at.wS().a(paramBundle, 0);
    }
    GMTrace.o(4703794495488L, 35046);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4703928713216L, 35047);
    super.onDestroy();
    if (this.oKd != null)
    {
      at.wS().c(this.oKd);
      com.tencent.mm.aw.t.Kj().aV(this.oKd.gQc, 1);
    }
    List localList = this.oKe;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      com.tencent.mm.aw.t.Kj().aV(localj.gQc, 1);
    }
    localList.clear();
    at.wS().b(159, this);
    at.wS().b(160, this);
    this.oKb.aJe();
    com.tencent.mm.aw.t.Kj().j(this.oKb);
    GMTrace.o(4703928713216L, 35047);
  }
  
  final class a
    extends o<com.tencent.mm.aw.m>
  {
    private Context context;
    private int jMw;
    
    public a(Context paramContext, int paramInt)
    {
      super(new com.tencent.mm.aw.m());
      GMTrace.i(4680440610816L, 34872);
      this.context = paramContext;
      this.jMw = paramInt;
      GMTrace.o(4680440610816L, 34872);
    }
    
    public final void QF()
    {
      GMTrace.i(4680843264000L, 34875);
      com.tencent.mm.aw.n localn = com.tencent.mm.aw.t.Kj();
      String str = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1";
      setCursor(localn.goN.a(str, null, 0));
      super.notifyDataSetChanged();
      GMTrace.o(4680843264000L, 34875);
    }
    
    protected final void QG()
    {
      GMTrace.i(4680709046272L, 34874);
      QF();
      GMTrace.o(4680709046272L, 34874);
    }
    
    public final int getCount()
    {
      GMTrace.i(4680574828544L, 34873);
      int i = getCursor().getCount();
      GMTrace.o(4680574828544L, 34873);
      return i + 2;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4680977481728L, 34876);
      int i;
      a locala;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cGi, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(this.jMw, this.jMw));
        paramViewGroup = new b();
        paramViewGroup.oLC = ((LinearLayout)paramView.findViewById(R.h.cbo));
        paramViewGroup.oLD = ((LinearLayout)paramView.findViewById(R.h.cbn));
        paramViewGroup.oLE = ((LinearLayout)paramView.findViewById(R.h.cbq));
        paramViewGroup.oLF = ((LinearLayout)paramView.findViewById(R.h.cbr));
        paramViewGroup.oLG = ((LinearLayout)paramView.findViewById(R.h.cbm));
        paramView.setTag(paramViewGroup);
        at.AR();
        i = bg.a((Integer)c.xh().get(12311, null), -2);
        locala = com.tencent.mm.aw.t.Kk().kE(SettingsSelectBgUI.f(SettingsSelectBgUI.this));
        if (paramInt != 0) {
          break label294;
        }
        if (((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) || (i != -2)) && ((SettingsSelectBgUI.c(SettingsSelectBgUI.this)) || (i != -2) || (locala != null)) && ((locala == null) || (locala.gPK != -2))) {
          break label284;
        }
        paramViewGroup.Gm("using");
      }
      for (;;)
      {
        paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), R.g.aVD), true, 10.0F);
        ((ImageView)paramView.findViewById(R.h.cbp)).setImageBitmap(paramViewGroup);
        GMTrace.o(4680977481728L, 34876);
        return paramView;
        paramViewGroup = (b)paramView.getTag();
        break;
        label284:
        paramViewGroup.Gm("downloaded");
      }
      label294:
      if (paramInt == 1)
      {
        if (((SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (i == 0)) || ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (i == 0) && (locala == null)) || ((locala != null) && (locala.gPK == 0))) {
          paramViewGroup.Gm("using");
        }
        for (;;)
        {
          paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), R.g.aVC), true, 10.0F);
          ((ImageView)paramView.findViewById(R.h.cbp)).setImageBitmap(paramViewGroup);
          GMTrace.o(4680977481728L, 34876);
          return paramView;
          paramViewGroup.Gm("downloaded");
        }
      }
      com.tencent.mm.aw.m localm = (com.tencent.mm.aw.m)getItem(paramInt - 2);
      com.tencent.mm.aw.t.Kj();
      at.AR();
      if (!c.isSDCardAvailable()) {}
      for (Bitmap localBitmap = BitmapFactory.decodeResource(SettingsSelectBgUI.this.getResources(), R.g.aYw); localBitmap == null; localBitmap = d.RD(com.tencent.mm.aw.n.Kf() + com.tencent.mm.aw.n.aS(localm.id, localm.eII)))
      {
        GMTrace.o(4680977481728L, 34876);
        return paramView;
      }
      localBitmap = d.a(localBitmap, true, 10.0F);
      ((ImageView)paramView.findViewById(R.h.cbp)).setImageBitmap(localBitmap);
      switch (localm.status)
      {
      }
      for (;;)
      {
        GMTrace.o(4680977481728L, 34876);
        return paramView;
        paramViewGroup.Gm("downloading");
        continue;
        if ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (locala != null) && (locala.gPK == localm.id))
        {
          paramViewGroup.Gm("using");
        }
        else
        {
          paramViewGroup.Gm("downloaded");
          continue;
          paramViewGroup.Gm("undownloaded");
          continue;
          if ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (locala != null) && (locala.gPK != localm.id))
          {
            paramViewGroup.Gm("downloaded");
          }
          else
          {
            paramViewGroup.Gm("using");
            continue;
            paramViewGroup.Gm("canceling");
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsSelectBgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */