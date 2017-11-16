package com.tencent.mm.plugin.subapp.ui.friend;

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
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.a.g;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

public class FMessageConversationUI
  extends MMActivity
{
  private p.d jqg;
  private String nRL;
  private b qsK;
  private ListView qsY;
  private a qsZ;
  private TextView qta;
  private long qtb;
  
  public FMessageConversationUI()
  {
    GMTrace.i(5814311976960L, 43320);
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(5821828169728L, 43376);
        com.tencent.mm.bc.e.e(FMessageConversationUI.d(FMessageConversationUI.this), FMessageConversationUI.e(FMessageConversationUI.this));
        GMTrace.o(5821828169728L, 43376);
      }
    };
    GMTrace.o(5814311976960L, 43320);
  }
  
  protected final void MP()
  {
    boolean bool = true;
    GMTrace.i(5814983065600L, 43325);
    final Object localObject1;
    int i;
    if (g.BY().hb("1") != null)
    {
      localObject1 = g.BY().hb("1").value;
      if (((String)localObject1).equals("0"))
      {
        i = 0;
        f.hf("1");
      }
    }
    for (;;)
    {
      this.qsK = new b(this.vKB.vKW);
      com.tencent.mm.bc.l.ML().c(this.qsK);
      this.qsK.vKu = new o.a()
      {
        public final void QC()
        {
          GMTrace.i(5819680686080L, 43360);
          if (FMessageConversationUI.a(FMessageConversationUI.this).getCount() >= 0)
          {
            FMessageConversationUI.this.Y(0, true);
            GMTrace.o(5819680686080L, 43360);
            return;
          }
          FMessageConversationUI.this.Y(0, false);
          GMTrace.o(5819680686080L, 43360);
        }
        
        public final void QD()
        {
          GMTrace.i(5819546468352L, 43359);
          GMTrace.o(5819546468352L, 43359);
        }
      };
      this.qsY = ((ListView)findViewById(R.h.bAG));
      if (i != 0)
      {
        localObject1 = LayoutInflater.from(this.vKB.vKW).inflate(R.i.cxp, null);
        ((View)localObject1).findViewById(R.h.bAP).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5819278032896L, 43357);
            paramAnonymousView = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
            d.b(FMessageConversationUI.this.vKB.vKW, "search", ".ui.FTSAddFriendUI", paramAnonymousView);
            GMTrace.o(5819278032896L, 43357);
          }
        });
        this.qsY.addHeaderView((View)localObject1);
      }
      this.qsY.setAdapter(this.qsK);
      localObject1 = new com.tencent.mm.ui.tools.l(this);
      this.qsY.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5821291298816L, 43372);
          if (paramAnonymousInt < FMessageConversationUI.b(FMessageConversationUI.this).getHeaderViewsCount())
          {
            w.w("MicroMsg.FMessageConversationUI", "on header view long click, ignore");
            GMTrace.o(5821291298816L, 43372);
            return true;
          }
          int i = FMessageConversationUI.b(FMessageConversationUI.this).getHeaderViewsCount();
          localObject1.a(paramAnonymousView, paramAnonymousInt - i, paramAnonymousLong, FMessageConversationUI.this, FMessageConversationUI.c(FMessageConversationUI.this));
          GMTrace.o(5821291298816L, 43372);
          return true;
        }
      });
      localObject1 = this.vKB.vKW;
      Object localObject2 = this.qsK;
      if (this.qsY.getHeaderViewsCount() > 0)
      {
        label214:
        this.qsZ = new a((Context)localObject1, (b)localObject2, bool);
        this.qsY.setOnItemClickListener(this.qsZ);
        if (i != 0) {
          break label346;
        }
        localObject1 = findViewById(R.h.bAE);
        ((View)localObject1).setVisibility(0);
        ((TextView)findViewById(R.h.bwK)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5822365040640L, 43380);
            at.AR();
            if (!bg.nm((String)com.tencent.mm.y.c.xh().get(6, null)))
            {
              paramAnonymousView = new Intent(FMessageConversationUI.this, MobileFriendUI.class);
              FMessageConversationUI.this.startActivity(paramAnonymousView);
              GMTrace.o(5822365040640L, 43380);
              return;
            }
            paramAnonymousView = new Intent(FMessageConversationUI.this.vKB.vKW, BindMContactIntroUI.class);
            paramAnonymousView.putExtra("key_upload_scene", 5);
            MMWizardActivity.A(FMessageConversationUI.this, paramAnonymousView);
            GMTrace.o(5822365040640L, 43380);
          }
        });
        this.qsY.setEmptyView((View)localObject1);
      }
      for (;;)
      {
        a(0, getString(R.l.dIv), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(5822096605184L, 43378);
            paramAnonymousMenuItem = new Intent(FMessageConversationUI.this, AddMoreFriendsUI.class);
            paramAnonymousMenuItem.putExtra("invite_friend_scene", 3);
            FMessageConversationUI.this.startActivity(paramAnonymousMenuItem);
            GMTrace.o(5822096605184L, 43378);
            return true;
          }
        });
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(5817398984704L, 43343);
            FMessageConversationUI.this.finish();
            GMTrace.o(5817398984704L, 43343);
            return true;
          }
        });
        GMTrace.o(5814983065600L, 43325);
        return;
        if (!((String)localObject1).equals("1")) {
          break label422;
        }
        i = 1;
        break;
        bool = false;
        break label214;
        label346:
        localObject1 = findViewById(R.h.bAF);
        ((View)localObject1).setVisibility(0);
        this.qta = ((TextView)((View)localObject1).findViewById(R.h.bAO));
        localObject2 = (ListView)((View)localObject1).findViewById(R.h.bAN);
        ((ListView)localObject2).setAdapter(new BaseAdapter()
        {
          public final int getCount()
          {
            GMTrace.i(5817130549248L, 43341);
            GMTrace.o(5817130549248L, 43341);
            return 1;
          }
          
          public final Object getItem(int paramAnonymousInt)
          {
            GMTrace.i(5816996331520L, 43340);
            GMTrace.o(5816996331520L, 43340);
            return Integer.valueOf(paramAnonymousInt);
          }
          
          public final long getItemId(int paramAnonymousInt)
          {
            GMTrace.i(5816862113792L, 43339);
            long l = paramAnonymousInt;
            GMTrace.o(5816862113792L, 43339);
            return l;
          }
          
          public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
          {
            GMTrace.i(5816727896064L, 43338);
            if ((paramAnonymousView == null) || (paramAnonymousView.getTag() == null))
            {
              paramAnonymousView = LayoutInflater.from(FMessageConversationUI.this.vKB.vKW).inflate(R.i.cxo, null);
              paramAnonymousViewGroup = new FMessageConversationUI.a(FMessageConversationUI.this, paramAnonymousView);
              paramAnonymousView.setTag(paramAnonymousViewGroup);
            }
            for (;;)
            {
              if (paramAnonymousInt == 0)
              {
                paramAnonymousViewGroup.iCr.setImageResource(R.k.cMA);
                paramAnonymousViewGroup.ikm.setText(R.l.dvx);
              }
              GMTrace.o(5816727896064L, 43338);
              return paramAnonymousView;
              paramAnonymousViewGroup = (FMessageConversationUI.a)paramAnonymousView.getTag();
            }
          }
        });
        ((ListView)localObject2).setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(5820083339264L, 43363);
            if (paramAnonymousInt == 0)
            {
              if (m.Ho() != m.a.gDm)
              {
                paramAnonymousAdapterView = new Intent(FMessageConversationUI.this.vKB.vKW, BindMContactIntroUI.class);
                paramAnonymousAdapterView.putExtra("key_upload_scene", 5);
                MMWizardActivity.A(FMessageConversationUI.this.vKB.vKW, paramAnonymousAdapterView);
                GMTrace.o(5820083339264L, 43363);
                return;
              }
              FMessageConversationUI.this.startActivity(new Intent(FMessageConversationUI.this.vKB.vKW, MobileFriendUI.class));
            }
            GMTrace.o(5820083339264L, 43363);
          }
        });
        this.qsY.setEmptyView((View)localObject1);
      }
      label422:
      i = 1;
      break;
      i = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5815117283328L, 43326);
    int i = R.i.cxn;
    GMTrace.o(5815117283328L, 43326);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5814446194688L, 43321);
    super.onCreate(paramBundle);
    oM(R.l.dwj);
    try
    {
      at.getNotification().ry();
      if (!at.AU())
      {
        finish();
        GMTrace.o(5814446194688L, 43321);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FMessageConversationUI", paramBundle, "try cancel notification fail", new Object[0]);
      }
      MP();
      GMTrace.o(5814446194688L, 43321);
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(5815251501056L, 43327);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = (com.tencent.mm.bc.b)this.qsK.getItem(paramView.position);
    if (paramContextMenuInfo == null)
    {
      w.e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + paramView.position);
      GMTrace.o(5815251501056L, 43327);
      return;
    }
    if (!bg.nm(paramContextMenuInfo.field_displayName)) {
      paramContextMenu.setHeaderTitle(h.a(this, paramContextMenuInfo.field_displayName));
    }
    paramContextMenu.add(0, 0, 0, R.l.cSt);
    this.qtb = paramContextMenuInfo.field_fmsgSysRowId;
    this.nRL = paramContextMenuInfo.field_talker;
    GMTrace.o(5815251501056L, 43327);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5814848847872L, 43324);
    super.onDestroy();
    f.hg("1");
    com.tencent.mm.bc.l.ML().My();
    if (this.qsK != null) {
      com.tencent.mm.bc.l.ML().j(this.qsK);
    }
    GMTrace.o(5814848847872L, 43324);
  }
  
  protected void onPause()
  {
    GMTrace.i(5814580412416L, 43322);
    super.onPause();
    at.AR();
    com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
    GMTrace.o(5814580412416L, 43322);
  }
  
  protected void onResume()
  {
    GMTrace.i(5814714630144L, 43323);
    super.onResume();
    if (!at.AU())
    {
      finish();
      GMTrace.o(5814714630144L, 43323);
      return;
    }
    if ((this.qta != null) && (bg.Jw())) {
      this.qta.setText(R.l.dwm);
    }
    GMTrace.o(5814714630144L, 43323);
  }
  
  final class a
  {
    ImageView iCr;
    TextView ikm;
    
    public a(View paramView)
    {
      GMTrace.i(5820485992448L, 43366);
      this.iCr = ((ImageView)paramView.findViewById(R.h.bAL));
      this.ikm = ((TextView)paramView.findViewById(R.h.bAM));
      GMTrace.o(5820485992448L, 43366);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\friend\FMessageConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */