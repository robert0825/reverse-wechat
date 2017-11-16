package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.db;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.x;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceManageDeviceUI
  extends MMActivity
{
  private ListView Ev;
  private a kHG;
  
  public ExdeviceManageDeviceUI()
  {
    GMTrace.i(11016322678784L, 82078);
    GMTrace.o(11016322678784L, 82078);
  }
  
  protected final void MP()
  {
    GMTrace.i(11016725331968L, 82081);
    this.Ev = ((ListView)findViewById(R.h.bKn));
    this.kHG = new a(this);
    View.inflate(this, R.i.cvD, null);
    this.Ev.setAdapter(this.kHG);
    GMTrace.o(11016725331968L, 82081);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11016456896512L, 82079);
    int i = R.i.cvN;
    GMTrace.o(11016456896512L, 82079);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11016859549696L, 82082);
    this.kHG.at(ad.atR().auw());
    this.kHG.notifyDataSetChanged();
    GMTrace.o(11016859549696L, 82082);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11016591114240L, 82080);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11083565760512L, 82579);
        ExdeviceManageDeviceUI.this.finish();
        GMTrace.o(11083565760512L, 82579);
        return true;
      }
    });
    oM(R.l.drw);
    paramBundle = new db();
    paramBundle.eEA.eEB = true;
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    MP();
    at.wS().a(537, this.kHG);
    GMTrace.o(11016591114240L, 82080);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11016993767424L, 82083);
    super.onDestroy();
    at.wS().b(537, this.kHG);
    GMTrace.o(11016993767424L, 82083);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11017127985152L, 82084);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0) && (this.kHG.kHI))
    {
      aH(0, getString(R.l.cSC));
      paramKeyEvent = this.kHG;
      if (paramKeyEvent.kHI)
      {
        paramKeyEvent.kHI = false;
        af.t(new ExdeviceManageDeviceUI.a.5(paramKeyEvent));
      }
      GMTrace.o(11017127985152L, 82084);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11017127985152L, 82084);
    return bool;
  }
  
  private static final class a
    extends BaseAdapter
    implements e
  {
    private r hsU;
    private p.d jvG;
    private com.tencent.mm.ao.a.a.c kEK;
    private List<com.tencent.mm.plugin.exdevice.h.b> kEw;
    boolean kHI;
    private WeakReference<Context> kHJ;
    private View.OnClickListener kHK;
    private l kHL;
    private volatile int kHM;
    
    public a(Context paramContext)
    {
      GMTrace.i(11029207580672L, 82174);
      this.hsU = null;
      this.kHM = -1;
      this.kHJ = new WeakReference(paramContext);
      this.kEw = new LinkedList();
      this.kHL = new l(paramContext);
      paramContext = new c.a();
      paramContext.gKR = R.g.aWq;
      this.kEK = paramContext.Jn();
      this.jvG = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(11028268056576L, 82167);
          paramAnonymousInt = paramAnonymousMenuItem.getItemId();
          int i = ExdeviceManageDeviceUI.a.this.getCount();
          w.d("MicroMsg.ExdeviceManageDeviceUI", "onMenuItemSelected, itemId(%d), count(%d).", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i) });
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= i))
          {
            GMTrace.o(11028268056576L, 82167);
            return;
          }
          ExdeviceManageDeviceUI.a.a(ExdeviceManageDeviceUI.a.this, paramAnonymousInt);
          ExdeviceManageDeviceUI.a.a(ExdeviceManageDeviceUI.a.this, (com.tencent.mm.plugin.exdevice.h.b)ExdeviceManageDeviceUI.a.a(ExdeviceManageDeviceUI.a.this).get(paramAnonymousInt));
          ExdeviceManageDeviceUI.a.this.notifyDataSetChanged();
          GMTrace.o(11028268056576L, 82167);
        }
      };
      this.kHK = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11071620382720L, 82490);
          if (ExdeviceManageDeviceUI.a.b(ExdeviceManageDeviceUI.a.this))
          {
            GMTrace.o(11071620382720L, 82490);
            return;
          }
          paramAnonymousView = paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (!(paramAnonymousView instanceof Integer)))
          {
            GMTrace.o(11071620382720L, 82490);
            return;
          }
          int i = ((Integer)paramAnonymousView).intValue();
          if ((i < 0) || (i >= ExdeviceManageDeviceUI.a.this.getCount()))
          {
            GMTrace.o(11071620382720L, 82490);
            return;
          }
          paramAnonymousView = ExdeviceManageDeviceUI.a.this.ni(i);
          Context localContext = (Context)ExdeviceManageDeviceUI.a.c(ExdeviceManageDeviceUI.a.this).get();
          if (localContext == null)
          {
            w.e("MicroMsg.ExdeviceManageDeviceUI", "Start activity failed, context is null.");
            GMTrace.o(11071620382720L, 82490);
            return;
          }
          ExdeviceManageDeviceUI.a.a(localContext, paramAnonymousView);
          GMTrace.o(11071620382720L, 82490);
        }
      };
      at(ad.atR().auw());
      GMTrace.o(11029207580672L, 82174);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(11030012887040L, 82180);
      if (paramk == null)
      {
        w.e("MicroMsg.ExdeviceManageDeviceUI", "scene is null.");
        GMTrace.o(11030012887040L, 82180);
        return;
      }
      if ((paramk instanceof x))
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.dismiss();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((this.kHM < 0) || (this.kHM >= this.kEw.size()))
          {
            GMTrace.o(11030012887040L, 82180);
            return;
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11088934469632L, 82619);
              ExdeviceManageDeviceUI.a.a(ExdeviceManageDeviceUI.a.this).remove(ExdeviceManageDeviceUI.a.d(ExdeviceManageDeviceUI.a.this));
              ExdeviceManageDeviceUI.a.this.notifyDataSetChanged();
              ExdeviceManageDeviceUI.a.a(ExdeviceManageDeviceUI.a.this, -1);
              GMTrace.o(11088934469632L, 82619);
            }
          });
        }
      }
      GMTrace.o(11030012887040L, 82180);
    }
    
    public final void at(List<com.tencent.mm.plugin.exdevice.h.b> paramList)
    {
      GMTrace.i(11029341798400L, 82175);
      this.kEw.clear();
      if ((paramList == null) || (paramList.size() == 0))
      {
        GMTrace.o(11029341798400L, 82175);
        return;
      }
      this.kEw.addAll(paramList);
      GMTrace.o(11029341798400L, 82175);
    }
    
    public final int getCount()
    {
      GMTrace.i(11029476016128L, 82176);
      int i = this.kEw.size();
      GMTrace.o(11029476016128L, 82176);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11029744451584L, 82178);
      long l = paramInt;
      GMTrace.o(11029744451584L, 82178);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11029878669312L, 82179);
      com.tencent.mm.plugin.exdevice.h.b localb = ni(paramInt);
      View localView;
      if (paramView == null)
      {
        paramView = new a();
        localView = View.inflate(paramViewGroup.getContext(), R.i.cvM, null);
        paramView.kHP = localView.findViewById(R.h.brL);
        paramView.jUm = ((TextView)localView.findViewById(R.h.bPo));
        paramView.kHQ = localView.findViewById(R.h.btc);
        paramView.iub = ((ImageView)localView.findViewById(R.h.bGn));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        if (localb != null) {
          break label247;
        }
        paramView = "";
        w.d("MicroMsg.ExdeviceManageDeviceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), paramView, Long.valueOf(localb.field_mac) });
        paramViewGroup.jUm.setText(paramView);
        com.tencent.mm.ao.n.Jd().a(localb.iconUrl, paramViewGroup.iub, this.kEK);
        paramViewGroup.kHQ.setTag(Integer.valueOf(paramInt));
        if (!this.kHI) {
          break label336;
        }
        paramViewGroup.kHQ.setVisibility(0);
      }
      for (;;)
      {
        paramViewGroup.kHP.setTag(Integer.valueOf(paramInt));
        paramViewGroup.kHP.setOnClickListener(this.kHK);
        GMTrace.o(11029878669312L, 82179);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        label247:
        paramView = null;
        if (!bg.nm(localb.fsF)) {
          paramView = localb.fsF;
        }
        for (;;)
        {
          paramView = bg.nl(paramView);
          break;
          if (!bg.nm(localb.fsG)) {
            paramView = localb.fsG;
          } else if (localb.field_mac != 0L) {
            paramView = com.tencent.mm.plugin.exdevice.j.b.bS(localb.field_mac);
          } else if (!bg.nm(localb.field_deviceID)) {
            paramView = localb.field_deviceID;
          }
        }
        label336:
        paramViewGroup.kHQ.setVisibility(8);
      }
    }
    
    public final com.tencent.mm.plugin.exdevice.h.b ni(int paramInt)
    {
      GMTrace.i(11029610233856L, 82177);
      com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)this.kEw.get(paramInt);
      GMTrace.o(11029610233856L, 82177);
      return localb;
    }
    
    private static final class a
    {
      ImageView iub;
      TextView jUm;
      View kHP;
      View kHQ;
      
      public a()
      {
        GMTrace.i(11015248936960L, 82070);
        GMTrace.o(11015248936960L, 82070);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceManageDeviceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */