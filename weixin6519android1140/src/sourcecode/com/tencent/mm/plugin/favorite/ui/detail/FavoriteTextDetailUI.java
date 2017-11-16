package com.tencent.mm.plugin.favorite.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.FavTextEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.f;

public class FavoriteTextDetailUI
  extends MMActivity
{
  private static final int liS;
  private l jGV;
  private FavDetailTitleView liD;
  private FavDetailFooterView liE;
  private FavTagEntrance liF;
  private long liK;
  private TextView liT;
  private ClipboardManager liU;
  private j liV;
  private p.d liW;
  private j lip;
  
  static
  {
    GMTrace.i(6402722496512L, 47704);
    liS = b.tY();
    GMTrace.o(6402722496512L, 47704);
  }
  
  public FavoriteTextDetailUI()
  {
    GMTrace.i(6400843448320L, 47690);
    this.liW = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6395340521472L, 47649);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(6395340521472L, 47649);
          return;
          if ((FavoriteTextDetailUI.c(FavoriteTextDetailUI.this) != null) && (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this) != null) && (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto != null))
          {
            FavoriteTextDetailUI.c(FavoriteTextDetailUI.this).setText(FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc);
            com.tencent.mm.ui.base.h.bm(FavoriteTextDetailUI.this.vKB.vKW, FavoriteTextDetailUI.this.vKB.vKW.getString(R.l.cSq));
          }
        }
      }
    };
    GMTrace.o(6400843448320L, 47690);
  }
  
  private void azh()
  {
    GMTrace.i(6401648754688L, 47696);
    this.lip = com.tencent.mm.plugin.favorite.h.axB().cf(this.liK);
    if ((this.lip == null) || (this.lip.field_favProto == null))
    {
      w.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.liK) });
      GMTrace.o(6401648754688L, 47696);
      return;
    }
    this.liF.cx(this.lip.field_localId);
    this.liF.aC(this.lip.field_tagProto.ulP);
    if ((this.liV != null) && (this.liV.field_edittime == this.lip.field_edittime))
    {
      w.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
      GMTrace.o(6401648754688L, 47696);
      return;
    }
    this.liV = this.lip;
    this.liD.C(this.lip);
    this.liE.C(this.lip);
    this.liT.setText(this.lip.field_favProto.desc);
    com.tencent.mm.pluginsdk.ui.d.h.e(this.liT, 1);
    GMTrace.o(6401648754688L, 47696);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6400977666048L, 47691);
    int i = R.i.cwU;
    GMTrace.o(6400977666048L, 47691);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6401917190144L, 47698);
    if ((1 == paramInt1) && (-1 == paramInt2))
    {
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.cUq));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6412251955200L, 47775);
          FavoriteTextDetailUI.d(FavoriteTextDetailUI.this);
          GMTrace.o(6412251955200L, 47775);
        }
      }, 250L);
      GMTrace.o(6401917190144L, 47698);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6401917190144L, 47698);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6401111883776L, 47692);
    super.onCreate(paramBundle);
    this.liT = ((TextView)findViewById(R.h.bma));
    this.liD = ((FavDetailTitleView)findViewById(R.h.byN));
    this.liE = ((FavDetailFooterView)findViewById(R.h.byM));
    this.liF = ((FavTagEntrance)findViewById(R.h.bzr));
    this.liU = ((ClipboardManager)getSystemService("clipboard"));
    this.liK = getIntent().getLongExtra("key_detail_info_id", -1L);
    com.tencent.mm.pluginsdk.wallet.h.zJ(5);
    this.jGV = new l(this.vKB.vKW);
    this.jGV.a(this.liT, this, this.liW);
    sq(getString(R.l.dsW));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6380845006848L, 47541);
        FavoriteTextDetailUI.this.finish();
        GMTrace.o(6380845006848L, 47541);
        return true;
      }
    });
    a(0, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6387824328704L, 47593);
        paramAnonymousMenuItem = new f(FavoriteTextDetailUI.this.vKB.vKW, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(6384603103232L, 47569);
            if (FavoriteTextDetailUI.this.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true)) {
              paramAnonymous2n.e(2, FavoriteTextDetailUI.this.getString(R.l.duL));
            }
            paramAnonymous2n.e(0, FavoriteTextDetailUI.this.getString(R.l.dti));
            paramAnonymous2n.e(3, FavoriteTextDetailUI.this.getString(R.l.dtk));
            paramAnonymous2n.e(4, FavoriteTextDetailUI.this.getString(R.l.cSt));
            GMTrace.o(6384603103232L, 47569);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6385139974144L, 47573);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6385139974144L, 47573);
              return;
              if ((FavoriteTextDetailUI.a(FavoriteTextDetailUI.this) != null) && (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto != null))
              {
                paramAnonymous2MenuItem = new Intent(FavoriteTextDetailUI.this, FavTextEditUI.class);
                paramAnonymous2MenuItem.putExtra("key_value", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc);
                paramAnonymous2MenuItem.putExtra("key_max_count", FavoriteTextDetailUI.aeX());
                paramAnonymous2MenuItem.putExtra("key_show_confirm", true);
                paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_id);
                FavoriteTextDetailUI.this.startActivityForResult(paramAnonymous2MenuItem, 1);
                GMTrace.o(6385139974144L, 47573);
                return;
                if ((FavoriteTextDetailUI.a(FavoriteTextDetailUI.this) != null) && (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto != null))
                {
                  paramAnonymous2MenuItem = FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc;
                  FavoriteTextDetailUI localFavoriteTextDetailUI = FavoriteTextDetailUI.this;
                  if (bg.nm(paramAnonymous2MenuItem)) {
                    w.e("MicroMsg.FavApplication", "shareTextToFriend content null");
                  }
                  for (;;)
                  {
                    g.ork.i(10651, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
                    GMTrace.o(6385139974144L, 47573);
                    return;
                    Intent localIntent = new Intent();
                    localIntent.putExtra("Retr_Msg_content", paramAnonymous2MenuItem);
                    localIntent.putExtra("Retr_Msg_Type", 4);
                    localIntent.putExtra("mutil_select_is_ret", true);
                    c.hnH.l(localIntent, localFavoriteTextDetailUI);
                  }
                  paramAnonymous2MenuItem = new Intent(FavoriteTextDetailUI.this.vKB.vKW, FavTagEditUI.class);
                  paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                  paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_localId);
                  FavoriteTextDetailUI.this.vKB.vKW.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(6385139974144L, 47573);
                  return;
                  com.tencent.mm.ui.base.h.a(FavoriteTextDetailUI.this.vKB.vKW, FavoriteTextDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
                  {
                    public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(6384334667776L, 47567);
                      paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteTextDetailUI.this.vKB.vKW, FavoriteTextDetailUI.this.getString(R.l.cSu), false, null);
                      x.a(FavoriteTextDetailUI.b(FavoriteTextDetailUI.this), new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(6385408409600L, 47575);
                          paramAnonymous3DialogInterface.dismiss();
                          w.d("MicroMsg.FavoriteTextDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteTextDetailUI.b(FavoriteTextDetailUI.this)) });
                          FavoriteTextDetailUI.this.finish();
                          GMTrace.o(6385408409600L, 47575);
                        }
                      });
                      GMTrace.o(6384334667776L, 47567);
                    }
                  }, null);
                }
              }
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(6387824328704L, 47593);
        return true;
      }
    });
    com.tencent.mm.plugin.favorite.h.axB().c(this.liF);
    GMTrace.o(6401111883776L, 47692);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6401782972416L, 47697);
    paramContextMenu.add(0, 1, 0, getString(R.l.cSp));
    GMTrace.o(6401782972416L, 47697);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6401246101504L, 47693);
    com.tencent.mm.plugin.favorite.h.axB().j(this.liF);
    super.onDestroy();
    GMTrace.o(6401246101504L, 47693);
  }
  
  protected void onPause()
  {
    GMTrace.i(6401514536960L, 47695);
    super.onPause();
    GMTrace.o(6401514536960L, 47695);
  }
  
  protected void onResume()
  {
    GMTrace.i(6401380319232L, 47694);
    super.onResume();
    azh();
    GMTrace.o(6401380319232L, 47694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteTextDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */