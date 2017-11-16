package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public class MassSendHistoryUI
  extends MMActivity
  implements g.a, g.b, SensorController.a
{
  private static SensorController jrf;
  private com.tencent.mm.e.a.a euQ;
  private boolean jri;
  private ListView mTQ;
  private c mTR;
  private Button mTS;
  private Button mTT;
  private MMPullDownView mTU;
  private boolean mTV;
  private LinearLayout mTW;
  private p.d mTX;
  private View mqQ;
  
  public MassSendHistoryUI()
  {
    GMTrace.i(11245432340480L, 83785);
    this.jri = true;
    this.mTV = false;
    this.mTX = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(11241003155456L, 83752);
        Object localObject1;
        Object localObject2;
        if (paramAnonymousMenuItem.getItemId() == 1)
        {
          localObject1 = (com.tencent.mm.plugin.masssend.a.a)MassSendHistoryUI.b(MassSendHistoryUI.this).getItem(paramAnonymousMenuItem.getGroupId());
          if (localObject1 == null)
          {
            GMTrace.o(11241003155456L, 83752);
            return;
          }
          if (((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt().equals(MassSendHistoryUI.b(MassSendHistoryUI.this).mTF)) {
            MassSendHistoryUI.h(MassSendHistoryUI.this);
          }
          paramAnonymousMenuItem = h.aNB();
          localObject1 = ((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt();
          localObject2 = paramAnonymousMenuItem.goN.a("select * from massendinfo ORDER BY createtime DESC  limit 2", null, 0);
          if (localObject2 != null)
          {
            if (((Cursor)localObject2).getCount() != 0) {
              break label157;
            }
            ((Cursor)localObject2).close();
          }
        }
        for (;;)
        {
          if (paramAnonymousMenuItem.goN.delete("massendinfo", "clientid= ?", new String[] { localObject1 }) > 0) {
            paramAnonymousMenuItem.doNotify();
          }
          GMTrace.o(11241003155456L, 83752);
          return;
          label157:
          com.tencent.mm.plugin.masssend.a.a locala;
          if (((Cursor)localObject2).getCount() == 1)
          {
            ((Cursor)localObject2).moveToFirst();
            locala = new com.tencent.mm.plugin.masssend.a.a();
            locala.b((Cursor)localObject2);
            ((Cursor)localObject2).close();
            localObject2 = new ae();
            ((ae)localObject2).setUsername("masssendapp");
            ((ae)localObject2).setContent(ab.getContext().getResources().getString(R.l.djS));
            ((ae)localObject2).x(locala.hcs);
            ((ae)localObject2).dC(0);
            ((ae)localObject2).dz(0);
            at.AR();
            com.tencent.mm.y.c.yP().a((ae)localObject2, "masssendapp");
          }
          else
          {
            ((Cursor)localObject2).moveToPosition(1);
            locala = new com.tencent.mm.plugin.masssend.a.a();
            locala.b((Cursor)localObject2);
            ((Cursor)localObject2).close();
            localObject2 = new ae();
            ((ae)localObject2).setUsername("masssendapp");
            ((ae)localObject2).setContent(b.a(locala));
            ((ae)localObject2).x(locala.hcs);
            ((ae)localObject2).dC(0);
            ((ae)localObject2).dz(0);
            at.AR();
            com.tencent.mm.y.c.yP().a((ae)localObject2, "masssendapp");
          }
        }
      }
    };
    GMTrace.o(11245432340480L, 83785);
  }
  
  private boolean BP(String paramString)
  {
    GMTrace.i(11246908735488L, 83796);
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      jrf.a(this);
      paramString = h.aNB().BK(paramString);
      at.AR();
      if ((com.tencent.mm.y.c.isSDCardAvailable()) || (bg.nm(paramString.aNu()))) {
        break;
      }
      u.fo(this);
      GMTrace.o(11246908735488L, 83796);
      return false;
    }
    if (this.euQ == null) {
      this.euQ = new com.tencent.mm.e.a.a(this);
    }
    this.euQ.ax(false);
    if (this.euQ.h(paramString.aNu(), this.jri))
    {
      at.AS().e(this.jri, false);
      this.euQ.ewO = this;
      this.euQ.ewN = this;
      GMTrace.o(11246908735488L, 83796);
      return true;
    }
    Toast.makeText(this, getString(R.l.dgV), 0).show();
    GMTrace.o(11246908735488L, 83796);
    return false;
  }
  
  private void ahO()
  {
    GMTrace.i(11247042953216L, 83797);
    jrf.bQD();
    this.euQ.ax(false);
    this.mTR.BN("");
    releaseWakeLock();
    GMTrace.o(11247042953216L, 83797);
  }
  
  protected final void MP()
  {
    GMTrace.i(11246237646848L, 83791);
    this.mTV = getIntent().getBooleanExtra("finish_direct", false);
    w.d("MicroMsg.MassSendHistoryUI", "isFromSearch  " + this.mTV);
    this.mTW = ((LinearLayout)findViewById(R.h.bMu));
    this.mTQ = ((ListView)findViewById(R.h.bMe));
    this.mTQ.setTranscriptMode(0);
    this.mTU = ((MMPullDownView)findViewById(R.h.bMf));
    this.mTU.wdN = new MMPullDownView.g()
    {
      public final boolean apa()
      {
        int i = 0;
        GMTrace.i(11230399954944L, 83673);
        if (MassSendHistoryUI.b(MassSendHistoryUI.this).alU())
        {
          MassSendHistoryUI.d(MassSendHistoryUI.this).setSelectionFromTop(0, MassSendHistoryUI.c(MassSendHistoryUI.this).wdP);
          GMTrace.o(11230399954944L, 83673);
          return true;
        }
        c localc = MassSendHistoryUI.b(MassSendHistoryUI.this);
        if (localc.alU()) {}
        for (;;)
        {
          w.v("MicroMsg.MassSendHistoryUI", "onLoadData add count:" + i);
          MassSendHistoryUI.b(MassSendHistoryUI.this).a(null, null);
          MassSendHistoryUI.d(MassSendHistoryUI.this).setSelectionFromTop(i, MassSendHistoryUI.c(MassSendHistoryUI.this).wdP);
          GMTrace.o(11230399954944L, 83673);
          return true;
          localc.jIt += 10;
          if (localc.jIt <= localc.gQB)
          {
            i = 10;
          }
          else
          {
            localc.jIt = localc.gQB;
            i = localc.gQB % 10;
          }
        }
      }
    };
    this.mTU.lG(true);
    this.mTU.wdZ = new MMPullDownView.c()
    {
      public final boolean aoZ()
      {
        GMTrace.i(11239526760448L, 83741);
        if ((MassSendHistoryUI.d(MassSendHistoryUI.this).getChildAt(MassSendHistoryUI.d(MassSendHistoryUI.this).getChildCount() - 1).getBottom() <= MassSendHistoryUI.d(MassSendHistoryUI.this).getHeight()) && (MassSendHistoryUI.d(MassSendHistoryUI.this).getLastVisiblePosition() == MassSendHistoryUI.d(MassSendHistoryUI.this).getAdapter().getCount() - 1))
        {
          GMTrace.o(11239526760448L, 83741);
          return true;
        }
        GMTrace.o(11239526760448L, 83741);
        return false;
      }
    };
    this.mTU.wea = new MMPullDownView.d()
    {
      public final boolean aoY()
      {
        GMTrace.i(11242345332736L, 83762);
        View localView = MassSendHistoryUI.d(MassSendHistoryUI.this).getChildAt(MassSendHistoryUI.d(MassSendHistoryUI.this).getFirstVisiblePosition());
        if ((localView != null) && (localView.getTop() == 0))
        {
          GMTrace.o(11242345332736L, 83762);
          return true;
        }
        GMTrace.o(11242345332736L, 83762);
        return false;
      }
    };
    this.mTU.lE(true);
    this.mTR = new c(this);
    this.mTR.vKu = new o.a()
    {
      public final void QC()
      {
        GMTrace.i(11249861525504L, 83818);
        MassSendHistoryUI.c(MassSendHistoryUI.this).lD(MassSendHistoryUI.b(MassSendHistoryUI.this).alU());
        if (MassSendHistoryUI.b(MassSendHistoryUI.this).getCount() == 0)
        {
          MassSendHistoryUI.c(MassSendHistoryUI.this).setVisibility(8);
          MassSendHistoryUI.e(MassSendHistoryUI.this).setVisibility(0);
          MassSendHistoryUI.f(MassSendHistoryUI.this).setVisibility(8);
          GMTrace.o(11249861525504L, 83818);
          return;
        }
        MassSendHistoryUI.c(MassSendHistoryUI.this).setVisibility(0);
        MassSendHistoryUI.e(MassSendHistoryUI.this).setVisibility(8);
        MassSendHistoryUI.f(MassSendHistoryUI.this).setVisibility(0);
        GMTrace.o(11249861525504L, 83818);
      }
      
      public final void QD()
      {
        GMTrace.i(11249995743232L, 83819);
        GMTrace.o(11249995743232L, 83819);
      }
    };
    this.mqQ = findViewById(R.h.bMd);
    this.mTQ.setAdapter(this.mTR);
    this.mTQ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11230131519488L, 83671);
        w.v("MicroMsg.MassSendHistoryUI", "onItemClick");
        GMTrace.o(11230131519488L, 83671);
      }
    });
    this.mTQ.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11230936825856L, 83677);
        w.v("MicroMsg.MassSendHistoryUI", "onTouch");
        GMTrace.o(11230936825856L, 83677);
        return false;
      }
    });
    this.mTS = ((Button)findViewById(R.h.bMt));
    this.mTS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11248922001408L, 83811);
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
        GMTrace.o(11248922001408L, 83811);
      }
    });
    this.mTT = ((Button)findViewById(R.h.bMv));
    this.mTT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11232010567680L, 83685);
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
        GMTrace.o(11232010567680L, 83685);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11234694922240L, 83705);
        if (MassSendHistoryUI.g(MassSendHistoryUI.this)) {
          MassSendHistoryUI.this.finish();
        }
        for (;;)
        {
          GMTrace.o(11234694922240L, 83705);
          return true;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.addFlags(67108864);
          com.tencent.mm.plugin.masssend.a.hnH.s(paramAnonymousMenuItem, MassSendHistoryUI.this);
          MassSendHistoryUI.this.finish();
        }
      }
    });
    a(0, R.l.cUv, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11231205261312L, 83679);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("Contact_User", "masssendapp");
        com.tencent.mm.plugin.masssend.a.hnH.d(paramAnonymousMenuItem, MassSendHistoryUI.this);
        GMTrace.o(11231205261312L, 83679);
        return true;
      }
    });
    new l(this).a(this.mTQ, this, this.mTX);
    GMTrace.o(11246237646848L, 83791);
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    GMTrace.i(11246774517760L, 83795);
    if (this.euQ == null)
    {
      GMTrace.o(11246774517760L, 83795);
      return;
    }
    if (!this.euQ.isPlaying())
    {
      this.euQ.ay(true);
      at.AS().e(true, false);
      this.jri = true;
      GMTrace.o(11246774517760L, 83795);
      return;
    }
    this.euQ.ay(paramBoolean);
    at.AS().e(paramBoolean, false);
    this.jri = paramBoolean;
    if (!paramBoolean)
    {
      if (BP(this.mTR.mTF))
      {
        this.mTR.BN(this.mTR.mTF);
        GMTrace.o(11246774517760L, 83795);
        return;
      }
      this.mTR.BN("");
    }
    GMTrace.o(11246774517760L, 83795);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11246103429120L, 83790);
    int i = R.i.cBh;
    GMTrace.o(11246103429120L, 83790);
    return i;
  }
  
  public final void onCompletion()
  {
    GMTrace.i(11247177170944L, 83798);
    ahO();
    GMTrace.o(11247177170944L, 83798);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11245566558208L, 83786);
    super.onCreate(paramBundle);
    oM(R.l.dIn);
    if (jrf == null) {
      jrf = new SensorController(getApplicationContext());
    }
    MP();
    this.euQ = new com.tencent.mm.e.a.a(this);
    this.euQ.ewO = this;
    this.euQ.ewN = this;
    this.mTR.mTG = new c.e()
    {
      public final String BO(String paramAnonymousString)
      {
        GMTrace.i(11238318800896L, 83732);
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable())
        {
          u.fo(MassSendHistoryUI.this);
          GMTrace.o(11238318800896L, 83732);
          return "";
        }
        paramAnonymousString = bg.nl(paramAnonymousString);
        if ((MassSendHistoryUI.a(MassSendHistoryUI.this).isPlaying()) && (paramAnonymousString.equals(MassSendHistoryUI.b(MassSendHistoryUI.this).mTF)))
        {
          MassSendHistoryUI.aNK();
          MassSendHistoryUI.this.releaseWakeLock();
          MassSendHistoryUI.a(MassSendHistoryUI.this).ax(false);
          GMTrace.o(11238318800896L, 83732);
          return "";
        }
        if (MassSendHistoryUI.a(MassSendHistoryUI.this, paramAnonymousString))
        {
          GMTrace.o(11238318800896L, 83732);
          return paramAnonymousString;
        }
        GMTrace.o(11238318800896L, 83732);
        return "";
      }
    };
    if (this.vKB != null) {
      this.vKB.aa(3, false);
    }
    GMTrace.o(11245566558208L, 83786);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(11246506082304L, 83793);
    w.v("MicroMsg.MassSendHistoryUI", "onCreateContextMenu");
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = ((com.tencent.mm.plugin.masssend.a.a)this.mTR.getItem(paramView.position)).aNw().split(";");
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramContextMenuInfo.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramContextMenuInfo[i];
      at.AR();
      localObject = com.tencent.mm.y.c.yK().TE((String)localObject);
      if (localObject != null) {
        localStringBuilder.append(((x)localObject).vk() + ";");
      }
      i += 1;
    }
    paramContextMenu.setHeaderTitle(localStringBuilder.toString());
    paramContextMenu.add(paramView.position, 1, 0, getString(R.l.dgd));
    GMTrace.o(11246506082304L, 83793);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11245969211392L, 83789);
    this.mTR.aJe();
    super.onDestroy();
    GMTrace.o(11245969211392L, 83789);
  }
  
  public final void onError()
  {
    GMTrace.i(11247311388672L, 83799);
    ahO();
    GMTrace.o(11247311388672L, 83799);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11246371864576L, 83792);
    if (paramInt == 4)
    {
      if (this.mTV) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(11246371864576L, 83792);
        return true;
        paramKeyEvent = new Intent();
        paramKeyEvent.addFlags(67108864);
        com.tencent.mm.plugin.masssend.a.hnH.s(paramKeyEvent, this);
        finish();
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11246371864576L, 83792);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11245834993664L, 83788);
    super.onPause();
    at.AS().sr();
    h.aNB().j(this.mTR);
    jrf.bQD();
    GMTrace.o(11245834993664L, 83788);
  }
  
  protected void onResume()
  {
    GMTrace.i(11245700775936L, 83787);
    super.onResume();
    h.aNB().c(this.mTR);
    this.mTR.a(null, null);
    this.mTQ.setSelection(this.mTR.getCount() - 1);
    GMTrace.o(11245700775936L, 83787);
  }
  
  protected final void releaseWakeLock()
  {
    GMTrace.i(11246640300032L, 83794);
    this.mTQ.setKeepScreenOn(false);
    GMTrace.o(11246640300032L, 83794);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\MassSendHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */