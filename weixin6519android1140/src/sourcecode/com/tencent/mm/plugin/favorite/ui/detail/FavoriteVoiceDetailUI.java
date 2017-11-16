package com.tencent.mm.plugin.favorite.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.plugin.favorite.ui.base.FavVoiceBaseView;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import java.util.LinkedList;

public class FavoriteVoiceDetailUI
  extends MMActivity
  implements j.a
{
  private com.tencent.mm.plugin.favorite.b.w lcI;
  private j lcn;
  private long liK;
  private FavDetailTitleView lil;
  private FavDetailFooterView lim;
  private FavTagEntrance lin;
  private FavVoiceBaseView ljo;
  
  public FavoriteVoiceDetailUI()
  {
    GMTrace.i(6395474739200L, 47650);
    GMTrace.o(6395474739200L, 47650);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(6396280045568L, 47656);
    this.lcn = com.tencent.mm.plugin.favorite.h.axB().cf(this.liK);
    if (this.lcn == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
      finish();
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if (this.lcn.field_itemStatus != 10)
    {
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if ((paraml == null) || (paraml.vmG == null))
    {
      GMTrace.o(6396280045568L, 47656);
      return;
    }
    if (this.lcn.field_favProto.ulB.size() > 0)
    {
      paramString = x.n(this.lcn);
      paraml = x.g(paramString);
      int i = x.xS(paramString.ujI);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
      this.ljo.F(paraml, i, paramString.duration);
    }
    GMTrace.o(6396280045568L, 47656);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6395608956928L, 47651);
    int i = R.i.cwV;
    GMTrace.o(6395608956928L, 47651);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6395743174656L, 47652);
    super.onCreate(paramBundle);
    sq(getString(R.l.dsW));
    this.liK = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lcn = com.tencent.mm.plugin.favorite.h.axB().cf(this.liK);
    if (this.lcn == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
      finish();
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axB().c(this);
      if (this.lin != null) {
        com.tencent.mm.plugin.favorite.h.axB().c(this.lin);
      }
      GMTrace.o(6395743174656L, 47652);
      return;
      this.lil = ((FavDetailTitleView)findViewById(R.h.byN));
      this.lil.C(this.lcn);
      this.lim = ((FavDetailFooterView)findViewById(R.h.byM));
      this.lim.C(this.lcn);
      this.lcI = new com.tencent.mm.plugin.favorite.b.w();
      this.ljo = ((FavVoiceBaseView)findViewById(R.h.clw));
      paramBundle = this.ljo;
      paramBundle.lcI = this.lcI;
      paramBundle.lcI.a(paramBundle);
      paramBundle = x.n(this.lcn);
      String str = x.g(paramBundle);
      int i = x.xS(paramBundle.ujI);
      if (!e.aZ(str)) {
        x.m(this.lcn);
      }
      this.ljo.F(str, i, paramBundle.duration);
      this.lin = ((FavTagEntrance)findViewById(R.h.bzr));
      this.lin.cx(this.lcn.field_localId);
      this.lin.aC(this.lcn.field_tagProto.ulP);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6409030729728L, 47751);
          FavoriteVoiceDetailUI.this.finish();
          GMTrace.o(6409030729728L, 47751);
          return true;
        }
      });
      a(0, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6400172359680L, 47685);
          paramAnonymousMenuItem = new f(FavoriteVoiceDetailUI.this.vKB.vKW, f.xpQ, false);
          paramAnonymousMenuItem.qik = new p.c()
          {
            public final void a(n paramAnonymous2n)
            {
              GMTrace.i(6412788826112L, 47779);
              paramAnonymous2n.e(0, FavoriteVoiceDetailUI.this.getString(R.l.dtk));
              paramAnonymous2n.e(1, FavoriteVoiceDetailUI.this.vKB.vKW.getString(R.l.cSt));
              GMTrace.o(6412788826112L, 47779);
            }
          };
          paramAnonymousMenuItem.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(6380308135936L, 47537);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(6380308135936L, 47537);
                return;
                paramAnonymous2MenuItem = new Intent(FavoriteVoiceDetailUI.this.vKB.vKW, FavTagEditUI.class);
                paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId);
                FavoriteVoiceDetailUI.this.vKB.vKW.startActivity(paramAnonymous2MenuItem);
                GMTrace.o(6380308135936L, 47537);
                return;
                com.tencent.mm.ui.base.h.a(FavoriteVoiceDetailUI.this.vKB.vKW, FavoriteVoiceDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
                {
                  public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                  {
                    GMTrace.i(6410775560192L, 47764);
                    paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteVoiceDetailUI.this.vKB.vKW, FavoriteVoiceDetailUI.this.getString(R.l.cSu), false, null);
                    final long l1 = FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId;
                    long l2 = FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_id;
                    x.a(FavoriteVoiceDetailUI.a(FavoriteVoiceDetailUI.this).field_localId, new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6387555893248L, 47591);
                        paramAnonymous3DialogInterface.dismiss();
                        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavoriteDetailUI", "do del fav voice, local id %d, fav id %d", new Object[] { Long.valueOf(l1), Long.valueOf(this.ljt) });
                        FavoriteVoiceDetailUI.this.finish();
                        GMTrace.o(6387555893248L, 47591);
                      }
                    });
                    GMTrace.o(6410775560192L, 47764);
                  }
                }, null);
              }
            }
          };
          paramAnonymousMenuItem.bFk();
          GMTrace.o(6400172359680L, 47685);
          return true;
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6395877392384L, 47653);
    super.onDestroy();
    this.ljo.ahO();
    this.lcI.destroy();
    com.tencent.mm.plugin.favorite.h.axB().j(this);
    if (this.lin != null) {
      com.tencent.mm.plugin.favorite.h.axB().j(this.lin);
    }
    GMTrace.o(6395877392384L, 47653);
  }
  
  protected void onPause()
  {
    GMTrace.i(6396145827840L, 47655);
    super.onPause();
    this.ljo.axW();
    this.lcI.pause();
    GMTrace.o(6396145827840L, 47655);
  }
  
  protected void onResume()
  {
    GMTrace.i(6396011610112L, 47654);
    super.onResume();
    GMTrace.o(6396011610112L, 47654);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteVoiceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */