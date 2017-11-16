package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.ui.a.b;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.Set;

public class FavSelectUI
  extends FavBaseUI
{
  private String leZ;
  private b lfa;
  private Set<Integer> lfb;
  private q lfc;
  private String toUser;
  
  public FavSelectUI()
  {
    GMTrace.i(6465133740032L, 48169);
    this.lfa = null;
    this.lfb = new HashSet();
    this.lfc = new q();
    GMTrace.o(6465133740032L, 48169);
  }
  
  protected final boolean ayA()
  {
    GMTrace.i(6465804828672L, 48174);
    if (com.tencent.mm.plugin.favorite.h.axB().getCount() > 0)
    {
      GMTrace.o(6465804828672L, 48174);
      return true;
    }
    GMTrace.o(6465804828672L, 48174);
    return false;
  }
  
  protected final void ayB()
  {
    GMTrace.i(6465939046400L, 48175);
    this.ldw.setCompoundDrawablesWithIntrinsicBounds(0, R.g.aWu, 0, 0);
    this.ldw.setCompoundDrawablePadding(com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 10));
    this.ldw.setText(R.l.dtm);
    GMTrace.o(6465939046400L, 48175);
  }
  
  public final com.tencent.mm.plugin.favorite.ui.a.a ayy()
  {
    GMTrace.i(6465536393216L, 48172);
    if (this.lfa == null)
    {
      localObject = this.vKB.vKW;
      this.lfa = new b(this.laj, false);
    }
    Object localObject = this.lfa;
    GMTrace.o(6465536393216L, 48172);
    return (com.tencent.mm.plugin.favorite.ui.a.a)localObject;
  }
  
  protected final void ayz()
  {
    GMTrace.i(6465670610944L, 48173);
    GMTrace.o(6465670610944L, 48173);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6466073264128L, 48176);
    if ((paramInt1 == 0) && (-1 == paramInt2))
    {
      finish();
      GMTrace.o(6466073264128L, 48176);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6466073264128L, 48176);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6465267957760L, 48170);
    super.onCreate(paramBundle);
    this.toUser = getIntent().getStringExtra("key_to_user");
    this.leZ = getIntent().getStringExtra("key_fav_item_id");
    if (this.leZ != null)
    {
      paramBundle = this.leZ.split(",");
      int j = paramBundle.length;
      int i = 0;
      while (i < j)
      {
        int k = bg.getInt(paramBundle[i], Integer.MAX_VALUE);
        if (Integer.MAX_VALUE != k) {
          this.lfb.add(Integer.valueOf(k));
        }
        i += 1;
      }
    }
    this.lfb.remove(Integer.valueOf(3));
    this.lfa.e(this.lfb);
    this.lfc.lbg = false;
    this.lfa.a(this.lfc);
    this.ldy.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6416412704768L, 47806);
        FavSelectUI.a(FavSelectUI.this).ayR();
        FavSelectUI.this.ayC();
        GMTrace.o(6416412704768L, 47806);
      }
    });
    a(0, R.k.cIT, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6415875833856L, 47802);
        paramAnonymousMenuItem = new Intent(FavSelectUI.this.vKB.vKW, FavSearchUI.class);
        paramAnonymousMenuItem.putExtra("key_to_user", FavSelectUI.b(FavSelectUI.this));
        paramAnonymousMenuItem.putExtra("key_fav_item_id", FavSelectUI.c(FavSelectUI.this));
        paramAnonymousMenuItem.putExtra("key_search_type", 1);
        paramAnonymousMenuItem.putExtra("key_enter_fav_search_from", 1);
        FavSelectUI.this.startActivityForResult(paramAnonymousMenuItem, 0);
        GMTrace.o(6415875833856L, 47802);
        return true;
      }
    });
    oM(R.l.duI);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6337492680704L, 47218);
        FavSelectUI.this.finish();
        GMTrace.o(6337492680704L, 47218);
        return true;
      }
    });
    GMTrace.o(6465267957760L, 48170);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6466207481856L, 48177);
    super.onDestroy();
    if (this.lfa != null) {
      this.lfa.finish();
    }
    GMTrace.o(6466207481856L, 48177);
  }
  
  public void onItemClick(final AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6465402175488L, 48171);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      w.w("MicroMsg.FavSelectUI", "on item click, holder is null");
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    if (paramAdapterView.lcn == null)
    {
      w.w("MicroMsg.FavSelectUI", "on item click, info is null");
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    paramView = paramAdapterView.lcn;
    g.ork.i(10651, new Object[] { Integer.valueOf(paramView.field_type), Integer.valueOf(1), Integer.valueOf(1) });
    if (paramView.field_type == 3)
    {
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.cPN));
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    if ((paramView.field_type == 8) && (s.fD(this.toUser)))
    {
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.cPL));
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    paramView = new e.a(this.vKB.vKW);
    paramView.bA(this.toUser);
    e.a(paramView, this.vKB.vKW, paramAdapterView.lcn);
    e.b(paramView, this.vKB.vKW, paramAdapterView.lcn);
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(6362994049024L, 47408);
        FavSelectUI.this.aLo();
        if (paramAnonymousBoolean)
        {
          final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(FavSelectUI.this.vKB.vKW, FavSelectUI.this.getString(R.l.dtM), false, null);
          com.tencent.mm.plugin.favorite.b.r.a(FavSelectUI.this.vKB.vKW, FavSelectUI.b(FavSelectUI.this), paramAnonymousString, paramAdapterView.lcn, new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6334271455232L, 47194);
              if (localr != null) {
                localr.dismiss();
              }
              com.tencent.mm.ui.snackbar.a.e(FavSelectUI.this, FavSelectUI.this.getString(R.l.dwg));
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6367020580864L, 47438);
                  FavSelectUI.this.finish();
                  GMTrace.o(6367020580864L, 47438);
                }
              }, 1800L);
              GMTrace.o(6334271455232L, 47194);
            }
          });
        }
        GMTrace.o(6362994049024L, 47408);
      }
    }.show();
    GMTrace.o(6465402175488L, 48171);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */