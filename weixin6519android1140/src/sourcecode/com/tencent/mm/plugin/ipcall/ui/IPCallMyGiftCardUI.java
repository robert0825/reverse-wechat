package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.afh;
import com.tencent.mm.protocal.c.bqh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class IPCallMyGiftCardUI
  extends MMActivity
  implements e
{
  private ListView Ev;
  private View iTN;
  private ProgressDialog kgz;
  private a mqW;
  private com.tencent.mm.plugin.ipcall.a.d.d mqX;
  
  public IPCallMyGiftCardUI()
  {
    GMTrace.i(11695732817920L, 87140);
    GMTrace.o(11695732817920L, 87140);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11695867035648L, 87141);
    GMTrace.o(11695867035648L, 87141);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11696672342016L, 87147);
    w.i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.d))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.ipcall.a.d.d)paramk).mlD;
        if ((this.kgz != null) && (this.kgz.isShowing())) {
          this.kgz.dismiss();
        }
        this.mqW.lWy = paramString.uuU;
        this.mqW.mra = paramString;
        this.mqW.notifyDataSetChanged();
        if (paramString.uuU.size() == 0) {
          this.iTN.setVisibility(0);
        }
        GMTrace.o(11696672342016L, 87147);
        return;
      }
      if ((this.kgz != null) && (this.kgz.isShowing())) {
        this.kgz.dismiss();
      }
      this.iTN.setVisibility(0);
      Toast.makeText(this.vKB.vKW, getString(R.l.dEp), 0).show();
    }
    GMTrace.o(11696672342016L, 87147);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11696538124288L, 87146);
    int i = R.i.cAu;
    GMTrace.o(11696538124288L, 87146);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11696001253376L, 87142);
    GMTrace.o(11696001253376L, 87142);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11696135471104L, 87143);
    super.onCreate(paramBundle);
    at.wS().a(288, this);
    oM(R.l.dFk);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11675600158720L, 86990);
        IPCallMyGiftCardUI.this.finish();
        GMTrace.o(11675600158720L, 86990);
        return true;
      }
    });
    a(0, this.vKB.vKW.getString(R.l.dFj), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11630503002112L, 86654);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("rawUrl", IPCallMyGiftCardUI.this.getString(R.l.dEj));
        paramAnonymousMenuItem.putExtra("showShare", false);
        com.tencent.mm.bj.d.b(IPCallMyGiftCardUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
        GMTrace.o(11630503002112L, 86654);
        return true;
      }
    });
    this.iTN = findViewById(R.h.bIw);
    this.Ev = ((ListView)findViewById(R.h.bIx));
    this.mqW = new a(this);
    this.Ev.setAdapter(this.mqW);
    paramBundle = this.vKB.vKW;
    getString(R.l.cUG);
    this.kgz = h.a(paramBundle, getString(R.l.dEs), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11711973163008L, 87261);
        try
        {
          if (IPCallMyGiftCardUI.a(IPCallMyGiftCardUI.this) != null) {
            at.wS().c(IPCallMyGiftCardUI.a(IPCallMyGiftCardUI.this));
          }
          IPCallMyGiftCardUI.this.finish();
          GMTrace.o(11711973163008L, 87261);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
          GMTrace.o(11711973163008L, 87261);
        }
      }
    });
    this.mqX = new com.tencent.mm.plugin.ipcall.a.d.d();
    at.wS().a(this.mqX, 0);
    GMTrace.o(11696135471104L, 87143);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11696403906560L, 87145);
    super.onDestroy();
    at.wS().b(288, this);
    GMTrace.o(11696403906560L, 87145);
  }
  
  protected void onResume()
  {
    GMTrace.i(11696269688832L, 87144);
    super.onResume();
    GMTrace.o(11696269688832L, 87144);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<bqh> lWy;
    private IPCallMyGiftCardUI mqZ;
    afh mra;
    
    public a(IPCallMyGiftCardUI paramIPCallMyGiftCardUI)
    {
      GMTrace.i(11638019194880L, 86710);
      this.lWy = null;
      this.mqZ = null;
      this.mra = null;
      if (paramIPCallMyGiftCardUI != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.mqZ = paramIPCallMyGiftCardUI;
        GMTrace.o(11638019194880L, 86710);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11638153412608L, 86711);
      if (this.lWy == null)
      {
        GMTrace.o(11638153412608L, 86711);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(11638153412608L, 86711);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11638287630336L, 86712);
      if (this.lWy != null)
      {
        Object localObject = this.lWy.get(paramInt);
        GMTrace.o(11638287630336L, 86712);
        return localObject;
      }
      GMTrace.o(11638287630336L, 86712);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11638421848064L, 86713);
      long l = paramInt;
      GMTrace.o(11638421848064L, 86713);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11638690283520L, 86715);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.mqZ.getSystemService("layout_inflater")).inflate(R.i.cAt, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.mrb = ((TextView)paramView.findViewById(R.h.bsm));
        paramViewGroup.mrc = ((TextView)paramView.findViewById(R.h.bsT));
        paramViewGroup.mrd = ((TextView)paramView.findViewById(R.h.bxX));
        paramViewGroup.mre = ((CdnImageView)paramView.findViewById(R.h.bFV));
        paramViewGroup.mrf = ((ImageView)paramView.findViewById(R.h.bsZ));
        paramView.setTag(paramViewGroup);
      }
      bqh localbqh;
      for (;;)
      {
        localbqh = (bqh)getItem(paramInt);
        if (localbqh != null) {
          break;
        }
        GMTrace.o(11638690283520L, 86715);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      if (bg.nm(localbqh.vav))
      {
        paramViewGroup.mrb.setVisibility(0);
        paramViewGroup.mrc.setVisibility(0);
        paramViewGroup.mrd.setVisibility(8);
        paramViewGroup.mrb.setText(localbqh.uJL);
        paramViewGroup.mrc.setText(localbqh.vau);
        a.b.a(paramViewGroup.mrf, "", 0.5F, false);
        if (bg.nm(localbqh.lQe)) {
          break label315;
        }
        paramViewGroup.mre.setVisibility(0);
        paramViewGroup.mre.setUrl(localbqh.lQe);
        paramViewGroup.mrf.setVisibility(4);
      }
      for (;;)
      {
        GMTrace.o(11638690283520L, 86715);
        return paramView;
        paramViewGroup.mrb.setVisibility(8);
        paramViewGroup.mrc.setVisibility(8);
        paramViewGroup.mrd.setVisibility(0);
        paramViewGroup.mrd.setText(localbqh.vav);
        break;
        label315:
        paramViewGroup.mrf.setVisibility(0);
        paramViewGroup.mre.setVisibility(4);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(11638556065792L, 86714);
      GMTrace.o(11638556065792L, 86714);
      return 2;
    }
    
    private final class a
    {
      TextView mrb;
      TextView mrc;
      TextView mrd;
      CdnImageView mre;
      ImageView mrf;
      
      public a()
      {
        GMTrace.i(11674660634624L, 86983);
        GMTrace.o(11674660634624L, 86983);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallMyGiftCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */