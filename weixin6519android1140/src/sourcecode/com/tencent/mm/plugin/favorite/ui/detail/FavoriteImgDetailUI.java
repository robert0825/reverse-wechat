package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavImgGalleryUI;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class FavoriteImgDetailUI
  extends MMActivity
  implements b.a
{
  private com.tencent.mm.sdk.b.c leg;
  private View.OnClickListener lgu;
  private LinearLayout lik;
  private FavDetailTitleView lil;
  private FavDetailFooterView lim;
  private FavTagEntrance lin;
  private int lio;
  private j lip;
  private HashMap<String, a> liq;
  private Bitmap lir;
  private boolean lis;
  private View.OnLongClickListener lit;
  
  public FavoriteImgDetailUI()
  {
    GMTrace.i(6388763852800L, 47600);
    this.lio = 0;
    this.liq = new HashMap();
    this.lis = true;
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6393998344192L, 47639);
        Intent localIntent = new Intent(FavoriteImgDetailUI.this.vKB.vKW, FavImgGalleryUI.class);
        localIntent.putExtra("key_detail_info_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
        localIntent.putExtra("key_detail_data_id", ((th)paramAnonymousView.getTag()).lhq);
        FavoriteImgDetailUI.this.startActivity(localIntent);
        GMTrace.o(6393998344192L, 47639);
      }
    };
    this.lit = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6387019022336L, 47587);
        paramAnonymousView = (th)paramAnonymousView.getTag();
        paramAnonymousView = (FavoriteImgDetailUI.a)FavoriteImgDetailUI.c(FavoriteImgDetailUI.this).get(paramAnonymousView.lhq);
        FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, paramAnonymousView);
        if (!paramAnonymousView.liB) {
          FavoriteImgDetailUI.b(paramAnonymousView);
        }
        GMTrace.o(6387019022336L, 47587);
        return true;
      }
    };
    this.leg = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6388763852800L, 47600);
  }
  
  private void a(final a parama)
  {
    GMTrace.i(6389569159168L, 47606);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6380039700480L, 47535);
        Bitmap localBitmap2 = com.tencent.mm.plugin.favorite.c.g.a(parama.eIc, FavoriteImgDetailUI.b(FavoriteImgDetailUI.this), false);
        final Bitmap localBitmap1 = localBitmap2;
        if (localBitmap2 == null)
        {
          w.d("MicroMsg.FavoriteImgDetailUI", "get big img fail");
          localBitmap1 = FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, parama.eIc);
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6410372907008L, 47761);
            FavoriteImgDetailUI.a(FavoriteImgDetailUI.this, FavoriteImgDetailUI.3.this.liy, localBitmap1);
            GMTrace.o(6410372907008L, 47761);
          }
          
          public final String toString()
          {
            GMTrace.i(6410507124736L, 47762);
            String str = super.toString() + "|renderView";
            GMTrace.o(6410507124736L, 47762);
            return str;
          }
        });
        GMTrace.o(6380039700480L, 47535);
      }
    });
    GMTrace.o(6389569159168L, 47606);
  }
  
  private void azf()
  {
    GMTrace.i(6389300723712L, 47604);
    if (ab.getResources() != null) {}
    for (DisplayMetrics localDisplayMetrics = ab.getResources().getDisplayMetrics();; localDisplayMetrics = getResources().getDisplayMetrics())
    {
      this.lio = (localDisplayMetrics.widthPixels - getResources().getDimensionPixelOffset(R.f.aQe) * 2);
      this.lio = Math.max(this.lio, 0);
      w.d("MicroMsg.FavoriteImgDetailUI", "update display width %d", new Object[] { Integer.valueOf(this.lio) });
      GMTrace.o(6389300723712L, 47604);
      return;
    }
  }
  
  private Bitmap j(th paramth)
  {
    boolean bool = true;
    GMTrace.i(6389703376896L, 47607);
    paramth = com.tencent.mm.plugin.favorite.c.g.a(paramth, this.lip);
    if (paramth != null) {}
    for (;;)
    {
      w.d("MicroMsg.FavoriteImgDetailUI", "get thumb ok ? %B", new Object[] { Boolean.valueOf(bool) });
      if (paramth == null) {
        break;
      }
      GMTrace.o(6389703376896L, 47607);
      return paramth;
      bool = false;
    }
    if (this.lir == null) {
      this.lir = com.tencent.mm.compatible.f.a.decodeResource(getResources(), R.k.cMo);
    }
    paramth = this.lir;
    GMTrace.o(6389703376896L, 47607);
    return paramth;
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6389837594624L, 47608);
    if ((parama == null) || (!parama.isFinished()))
    {
      GMTrace.o(6389837594624L, 47608);
      return;
    }
    w.d("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", new Object[] { parama.field_dataId });
    parama = (a)this.liq.get(parama.field_dataId);
    if (parama != null) {
      a(parama);
    }
    GMTrace.o(6389837594624L, 47608);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6388898070528L, 47601);
    int i = R.i.cwS;
    GMTrace.o(6388898070528L, 47601);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6389971812352L, 47609);
    if (1 == paramInt1)
    {
      if (-1 != paramInt2)
      {
        GMTrace.o(6389971812352L, 47609);
        return;
      }
      new q();
      if (q.h(this.lip))
      {
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.cPM));
        GMTrace.o(6389971812352L, 47609);
        return;
      }
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      String str2 = paramIntent.getStringExtra("custom_send_text");
      w.d("MicroMsg.FavoriteImgDetailUI", "select %s for sending", new Object[] { str1 });
      final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
      com.tencent.mm.plugin.favorite.b.r.a(this.vKB.vKW, str1, str2, this.lip, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16140218662912L, 120254);
          localr.dismiss();
          com.tencent.mm.ui.snackbar.a.e(FavoriteImgDetailUI.this, FavoriteImgDetailUI.this.getString(R.l.dwg));
          GMTrace.o(16140218662912L, 120254);
        }
      });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6389971812352L, 47609);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(6389434941440L, 47605);
    super.onConfigurationChanged(paramConfiguration);
    azf();
    paramConfiguration = this.liq.entrySet().iterator();
    while (paramConfiguration.hasNext()) {
      a((a)((Map.Entry)paramConfiguration.next()).getValue());
    }
    GMTrace.o(6389434941440L, 47605);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6389032288256L, 47602);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    azf();
    this.lik = ((LinearLayout)findViewById(R.h.bzc));
    this.lil = ((FavDetailTitleView)findViewById(R.h.byN));
    this.lim = ((FavDetailFooterView)findViewById(R.h.byM));
    this.lin = ((FavTagEntrance)findViewById(R.h.bzr));
    long l = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lip = com.tencent.mm.plugin.favorite.h.axB().cf(l);
    if (this.lip == null)
    {
      finish();
      GMTrace.o(6389032288256L, 47602);
      return;
    }
    this.lil.C(this.lip);
    this.lim.C(this.lip);
    paramBundle = this.lip.field_favProto.ulB.iterator();
    int i = 0;
    while (paramBundle.hasNext())
    {
      th localth = (th)paramBundle.next();
      w.d("MicroMsg.FavoriteImgDetailUI", "index[%d], dataid[%s]", new Object[] { Integer.valueOf(i), localth.lhq });
      a locala = new a();
      locala.eIc = localth;
      ImageView localImageView = new ImageView(this.vKB.vKW);
      int j = getResources().getDimensionPixelSize(R.f.aQN);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      if (i > 0) {
        localLayoutParams.topMargin = j;
      }
      this.lik.addView(localImageView, localLayoutParams);
      localImageView.setTag(localth);
      j /= 2;
      localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      localImageView.setPadding(j, j, j, j);
      localImageView.setMinimumWidth(com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 50));
      localImageView.setMinimumHeight(com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 50));
      localImageView.setImageResource(R.k.cMo);
      localImageView.setOnClickListener(this.lgu);
      localImageView.setOnLongClickListener(this.lit);
      locala.eId = localImageView;
      this.liq.put(localth.lhq, locala);
      a(locala);
      if (localth.ukB != 0) {
        this.lis = false;
      }
      i += 1;
    }
    this.lin.cx(this.lip.field_localId);
    this.lin.aC(this.lip.field_tagProto.ulP);
    sq(getString(R.l.dsW));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6402990931968L, 47706);
        FavoriteImgDetailUI.this.finish();
        GMTrace.o(6402990931968L, 47706);
        return true;
      }
    });
    a(0, R.l.eex, R.k.cIQ, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6411983519744L, 47773);
        paramAnonymousMenuItem = new f(FavoriteImgDetailUI.this.vKB.vKW, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(6392119296000L, 47625);
            if (FavoriteImgDetailUI.a(FavoriteImgDetailUI.this)) {
              paramAnonymous2n.e(2, FavoriteImgDetailUI.this.getString(R.l.duL));
            }
            paramAnonymous2n.e(0, FavoriteImgDetailUI.this.getString(R.l.dtk));
            paramAnonymous2n.e(1, FavoriteImgDetailUI.this.vKB.vKW.getString(R.l.cSt));
            GMTrace.o(6392119296000L, 47625);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6384871538688L, 47571);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6384871538688L, 47571);
              return;
              paramAnonymous2MenuItem = new Intent(FavoriteImgDetailUI.this.vKB.vKW, FavTagEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
              FavoriteImgDetailUI.this.vKB.vKW.startActivity(paramAnonymous2MenuItem);
              GMTrace.o(6384871538688L, 47571);
              return;
              com.tencent.mm.ui.base.h.a(FavoriteImgDetailUI.this.vKB.vKW, FavoriteImgDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(6394803650560L, 47645);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteImgDetailUI.this.vKB.vKW, FavoriteImgDetailUI.this.getString(R.l.cSu), false, null);
                  x.a(FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId, new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6388629635072L, 47599);
                      paramAnonymous3DialogInterface.dismiss();
                      w.d("MicroMsg.FavoriteImgDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId) });
                      FavoriteImgDetailUI.this.finish();
                      GMTrace.o(6388629635072L, 47599);
                    }
                  });
                  GMTrace.o(6394803650560L, 47645);
                }
              }, null);
              GMTrace.o(6384871538688L, 47571);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavoriteImgDetailUI.b(FavoriteImgDetailUI.this).field_localId);
              d.a(FavoriteImgDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
              com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0) });
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(6411983519744L, 47773);
        return true;
      }
    });
    com.tencent.mm.pluginsdk.e.h(this);
    com.tencent.mm.plugin.favorite.h.axB().c(this.lin);
    com.tencent.mm.plugin.favorite.h.axw().a(this);
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    GMTrace.o(6389032288256L, 47602);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6389166505984L, 47603);
    com.tencent.mm.plugin.favorite.h.axB().j(this.lin);
    com.tencent.mm.plugin.favorite.h.axw().b(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    super.onDestroy();
    GMTrace.o(6389166505984L, 47603);
  }
  
  protected void onResume()
  {
    GMTrace.i(6390106030080L, 47610);
    super.onResume();
    Iterator localIterator = this.liq.entrySet().iterator();
    while (localIterator.hasNext()) {
      a((a)((Map.Entry)localIterator.next()).getValue());
    }
    GMTrace.o(6390106030080L, 47610);
  }
  
  private final class a
  {
    int eDg;
    int eDh;
    th eIc;
    ImageView eId;
    l ihF;
    boolean liB;
    String liC;
    
    public a()
    {
      GMTrace.i(16141560840192L, 120264);
      this.ihF = new l(FavoriteImgDetailUI.this.vKB.vKW);
      this.liB = false;
      this.liC = null;
      this.eDg = 0;
      this.eDh = 0;
      GMTrace.o(16141560840192L, 120264);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteImgDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */