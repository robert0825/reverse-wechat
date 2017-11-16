package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.d.j;
import com.tencent.mm.plugin.ipcall.a.e.f;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.afj;
import com.tencent.mm.protocal.c.bqj;
import com.tencent.mm.protocal.c.bql;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallPackageUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private ListView mrh;
  private TextView mri;
  private ProgressDialog mrj;
  private ProgressDialog mrk;
  private a mrl;
  private com.tencent.mm.plugin.ipcall.a.d.e mrm;
  private j mrn;
  private f mro;
  
  public IPCallPackageUI()
  {
    GMTrace.i(15072382418944L, 112298);
    this.mrh = null;
    this.mri = null;
    this.mrj = null;
    this.mrk = null;
    this.mrl = null;
    this.mrm = null;
    this.mrn = null;
    this.mro = new f();
    GMTrace.o(15072382418944L, 112298);
  }
  
  private void aJr()
  {
    GMTrace.i(15073053507584L, 112303);
    w.i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
    if (this.mrl != null)
    {
      this.mrl.lWy = null;
      this.mrl.notifyDataSetChanged();
    }
    if (this.mrh != null) {
      this.mrh.setVisibility(8);
    }
    if (this.mri != null) {
      this.mri.setVisibility(8);
    }
    if (this.mrj == null)
    {
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.mrj = h.a(localActionBarActivity, getString(R.l.dEs), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(15073993031680L, 112310);
          try
          {
            if (IPCallPackageUI.a(IPCallPackageUI.this) != null) {
              at.wS().c(IPCallPackageUI.a(IPCallPackageUI.this));
            }
            IPCallPackageUI.this.finish();
            GMTrace.o(15073993031680L, 112310);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            w.e("MicroMsg.IPCallPackageUI", "cancel getPackageProductListNetScene error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
            GMTrace.o(15073993031680L, 112310);
          }
        }
      });
    }
    for (;;)
    {
      this.mrm = new com.tencent.mm.plugin.ipcall.a.d.e();
      at.wS().a(this.mrm, 0);
      GMTrace.o(15073053507584L, 112303);
      return;
      this.mrj.show();
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(15072919289856L, 112302);
    GMTrace.o(15072919289856L, 112302);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15073187725312L, 112304);
    if ((this.mrj != null) && (this.mrj.isShowing())) {
      this.mrj.dismiss();
    }
    if ((this.mrk != null) && (this.mrk.isShowing())) {
      this.mrk.dismiss();
    }
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.e))
    {
      w.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.ipcall.a.d.e)paramk).mlF;
        if ((paramString != null) && (paramString.uuS != null) && (paramString.uuS.size() > 0))
        {
          this.mrl.lWy = paramString.uuS;
          this.mrl.notifyDataSetChanged();
          this.mrh.setVisibility(0);
          GMTrace.o(15073187725312L, 112304);
          return;
        }
        this.mrl.lWy = null;
        this.mrl.notifyDataSetChanged();
        this.mri.setVisibility(0);
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      Toast.makeText(this.vKB.vKW, getString(R.l.dEp), 0).show();
      finish();
      GMTrace.o(15073187725312L, 112304);
      return;
    }
    if ((paramk instanceof j))
    {
      w.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
      this.mro.mmm = paramInt2;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.mro.finish();
        Toast.makeText(this.vKB.vKW, getString(R.l.dFy), 0).show();
        aJr();
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      if (paramInt2 == 101)
      {
        Object localObject = this.mrl;
        paramString = (j)paramk;
        if (paramString.mlP != null)
        {
          paramString = paramString.mlP.tRS;
          if ((bg.nm(paramString)) || (((a)localObject).lWy == null)) {
            break label470;
          }
          localObject = ((a)localObject).lWy.iterator();
          do
          {
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
            paramk = (bqj)((Iterator)localObject).next();
          } while ((paramk == null) || (!paramk.tRS.equals(paramString)));
        }
        label470:
        for (paramString = paramk;; paramString = null)
        {
          if (paramString != null) {
            break label475;
          }
          w.e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
          this.mro.finish();
          Toast.makeText(this.vKB.vKW, getString(R.l.dFt), 0).show();
          GMTrace.o(15073187725312L, 112304);
          return;
          paramString = "";
          break;
        }
        label475:
        h.a(this.vKB.vKW, this.vKB.vKW.getString(R.l.dFu, new Object[] { paramString.uJL, paramString.eBt }), this.vKB.vKW.getString(R.l.dFv), this.vKB.vKW.getString(R.l.dEC), this.vKB.vKW.getString(R.l.dFq), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(15075469426688L, 112321);
            paramAnonymousDialogInterface = IPCallPackageUI.b(IPCallPackageUI.this);
            paramAnonymousDialogInterface.mmo += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).finish();
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClass(IPCallPackageUI.this.vKB.vKW, IPCallRechargeUI.class);
            IPCallPackageUI.this.startActivity(paramAnonymousDialogInterface);
            IPCallPackageUI.this.finish();
            GMTrace.o(15075469426688L, 112321);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(15071845548032L, 112294);
            paramAnonymousDialogInterface = IPCallPackageUI.b(IPCallPackageUI.this);
            paramAnonymousDialogInterface.mmp += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).finish();
            GMTrace.o(15071845548032L, 112294);
          }
        });
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      this.mro.finish();
      Toast.makeText(this.vKB.vKW, getString(R.l.dFt), 0).show();
      aJr();
      GMTrace.o(15073187725312L, 112304);
      return;
    }
    w.i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    GMTrace.o(15073187725312L, 112304);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15072785072128L, 112301);
    int i = R.i.cAw;
    GMTrace.o(15072785072128L, 112301);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15072516636672L, 112299);
    super.onCreate(paramBundle);
    at.wS().a(831, this);
    at.wS().a(277, this);
    this.mro.start();
    paramBundle = this.mro;
    paramBundle.mmi += 1;
    this.mro.finish();
    oM(R.l.dFw);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15071577112576L, 112292);
        IPCallPackageUI.this.finish();
        GMTrace.o(15071577112576L, 112292);
        return true;
      }
    });
    this.mrh = ((ListView)findViewById(R.h.bSQ));
    this.mrl = new a(this);
    this.mrh.setAdapter(this.mrl);
    this.mri = ((TextView)findViewById(R.h.bRf));
    aJr();
    GMTrace.o(15072516636672L, 112299);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(15072650854400L, 112300);
    super.onDestroy();
    at.wS().b(831, this);
    at.wS().b(277, this);
    GMTrace.o(15072650854400L, 112300);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<bqj> lWy;
    private IPCallPackageUI mrq;
    
    public a(IPCallPackageUI paramIPCallPackageUI)
    {
      GMTrace.i(15070637588480L, 112285);
      this.lWy = null;
      this.mrq = null;
      this.mrq = paramIPCallPackageUI;
      GMTrace.o(15070637588480L, 112285);
    }
    
    public final int getCount()
    {
      GMTrace.i(15070771806208L, 112286);
      if (this.lWy == null)
      {
        GMTrace.o(15070771806208L, 112286);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(15070771806208L, 112286);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(15070906023936L, 112287);
      if (this.lWy != null)
      {
        Object localObject = this.lWy.get(paramInt);
        GMTrace.o(15070906023936L, 112287);
        return localObject;
      }
      GMTrace.o(15070906023936L, 112287);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(15071040241664L, 112288);
      long l = paramInt;
      GMTrace.o(15071040241664L, 112288);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(15071174459392L, 112289);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.mrq.getSystemService("layout_inflater")).inflate(R.i.cAv, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.mru = ((CdnImageView)paramView.findViewById(R.h.bSO));
        paramViewGroup.hvQ = ((TextView)paramView.findViewById(R.h.bSR));
        paramViewGroup.mrv = ((TextView)paramView.findViewById(R.h.bSS));
        paramViewGroup.mrw = ((TextView)paramView.findViewById(R.h.bSL));
        paramViewGroup.mrx = ((TextView)paramView.findViewById(R.h.bSM));
        paramViewGroup.mry = ((Button)paramView.findViewById(R.h.bSK));
        paramView.setTag(paramViewGroup);
      }
      bqj localbqj;
      for (;;)
      {
        localbqj = (bqj)getItem(paramInt);
        if (localbqj != null) {
          break;
        }
        GMTrace.o(15071174459392L, 112289);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.hvQ.setText(localbqj.eBt);
      paramViewGroup.mrv.setText(localbqj.uJL);
      paramViewGroup.mrx.setText(localbqj.lPj);
      paramViewGroup.mrw.setText(localbqj.mmS);
      paramViewGroup.mru.setVisibility(0);
      paramViewGroup.mru.setUrl(localbqj.vay);
      if (localbqj.tPM == 0) {
        paramViewGroup.mry.setEnabled(true);
      }
      for (;;)
      {
        paramViewGroup.mry.setTag(Integer.valueOf(paramInt));
        paramViewGroup.mry.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(15075737862144L, 112323);
            paramAnonymousView = (bqj)IPCallPackageUI.a.this.getItem(((Integer)paramAnonymousView.getTag()).intValue());
            if ((paramAnonymousView == null) || (bg.nm(paramAnonymousView.tRS)))
            {
              w.e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
              GMTrace.o(15075737862144L, 112323);
              return;
            }
            IPCallPackageUI.b(IPCallPackageUI.this).start();
            f localf = IPCallPackageUI.b(IPCallPackageUI.this);
            localf.mmj += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).mmn = paramAnonymousView.tRS;
            h.a(IPCallPackageUI.this, IPCallPackageUI.this.getString(R.l.dFr, new Object[] { paramAnonymousView.uJL, paramAnonymousView.eBt }), IPCallPackageUI.this.getString(R.l.dFs), IPCallPackageUI.this.getString(R.l.dFp), IPCallPackageUI.this.getString(R.l.dFq), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(15069295411200L, 112275);
                paramAnonymous2DialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this));
                paramAnonymous2DialogInterface.mmk += 1;
                IPCallPackageUI.a(IPCallPackageUI.a.a(IPCallPackageUI.a.this), paramAnonymousView.tRS);
                GMTrace.o(15069295411200L, 112275);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(15070503370752L, 112284);
                paramAnonymous2DialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this));
                paramAnonymous2DialogInterface.mml += 1;
                IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this)).finish();
                GMTrace.o(15070503370752L, 112284);
              }
            });
            GMTrace.o(15075737862144L, 112323);
          }
        });
        GMTrace.o(15071174459392L, 112289);
        return paramView;
        paramViewGroup.mry.setEnabled(false);
      }
    }
    
    private final class a
    {
      TextView hvQ;
      CdnImageView mru;
      TextView mrv;
      TextView mrw;
      TextView mrx;
      Button mry;
      
      public a()
      {
        GMTrace.i(15071979765760L, 112295);
        GMTrace.o(15071979765760L, 112295);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallPackageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */