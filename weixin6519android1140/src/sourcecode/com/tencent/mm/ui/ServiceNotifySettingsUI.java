package com.tencent.mm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.mr;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.adk;
import com.tencent.mm.protocal.c.bih;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;

public class ServiceNotifySettingsUI
  extends MMActivity
  implements e
{
  private DataSetObserver AH;
  private ListView Ev;
  private String iEr;
  private int mMode;
  private MMSwitchBtn qZl;
  private a vOf;
  private r vOg;
  
  public ServiceNotifySettingsUI()
  {
    GMTrace.i(2102654926848L, 15666);
    GMTrace.o(2102654926848L, 15666);
  }
  
  private boolean bYj()
  {
    GMTrace.i(2103326015488L, 15671);
    w.a locala = w.a.vve;
    if (this.mMode == 1) {
      locala = w.a.vvf;
    }
    at.AR();
    boolean bool = com.tencent.mm.y.c.xh().getBoolean(locala, true);
    GMTrace.o(2103326015488L, 15671);
    return bool;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2103191797760L, 15670);
    if (this.vOg != null) {
      this.vOg.dismiss();
    }
    w.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(GetServiceNotifyOptions), errType : %s, errCode : %s, errMsg : %s.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      u.makeText(this, R.l.dMX, 0).show();
      GMTrace.o(2103191797760L, 15670);
      return;
    }
    paramString = ((l)paramk).CL();
    if (this.mMode == 1) {
      this.qZl.mK(paramString.uty);
    }
    for (;;)
    {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2915611705344L, 21723);
          if (ServiceNotifySettingsUI.b(ServiceNotifySettingsUI.this) == 1)
          {
            ServiceNotifySettingsUI.a(ServiceNotifySettingsUI.this, paramString.utz);
            GMTrace.o(2915611705344L, 21723);
            return;
          }
          ServiceNotifySettingsUI.a(ServiceNotifySettingsUI.this, paramString.tUe);
          GMTrace.o(2915611705344L, 21723);
        }
      });
      GMTrace.o(2103191797760L, 15670);
      return;
      this.qZl.mK(paramString.tUd);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2102789144576L, 15667);
    int i = R.i.cFU;
    GMTrace.o(2102789144576L, 15667);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2102923362304L, 15668);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.mMode = paramBundle.getIntExtra("mode", 0);
    this.iEr = paramBundle.getStringExtra("scene_id");
    paramBundle.putExtra("scene_id", this.iEr);
    paramBundle = paramBundle.getStringExtra("title");
    if (TextUtils.isEmpty(paramBundle))
    {
      oM(R.l.dNg);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2870782984192L, 21389);
          ServiceNotifySettingsUI.this.finish();
          GMTrace.o(2870782984192L, 21389);
          return false;
        }
      });
      this.qZl = ((MMSwitchBtn)findViewById(R.h.checkbox));
      this.Ev = ((ListView)findViewById(R.h.bKn));
      paramBundle = (TextView)findViewById(R.h.bKg);
      if (this.mMode != 1) {
        break label329;
      }
      i = R.l.dMS;
      label138:
      paramBundle.setText(i);
      paramBundle = (TextView)findViewById(R.h.chG);
      if (this.mMode != 1) {
        break label336;
      }
    }
    label329:
    label336:
    for (int i = R.l.dMT;; i = R.l.dMU)
    {
      paramBundle.setText(i);
      this.vOf = new a(this, getLayoutInflater(), this.mMode, this.iEr);
      this.Ev.setAdapter(this.vOf);
      getString(R.l.cUG);
      this.vOg = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2070040018944L, 15423);
          ServiceNotifySettingsUI.this.finish();
          GMTrace.o(2070040018944L, 15423);
        }
      });
      this.AH = new DataSetObserver()
      {
        public final void onChanged()
        {
          GMTrace.i(2874675298304L, 21418);
          View localView = ServiceNotifySettingsUI.this.findViewById(R.h.bKg);
          if (ServiceNotifySettingsUI.a(ServiceNotifySettingsUI.this).isEmpty()) {}
          for (int i = 4;; i = 0)
          {
            localView.setVisibility(i);
            GMTrace.o(2874675298304L, 21418);
            return;
          }
        }
      };
      this.vOf.registerDataSetObserver(this.AH);
      i = 3;
      if (this.mMode == 1) {
        i = 12;
      }
      at.wS().a(1145, this);
      at.wS().a(new l(i), 0);
      this.qZl.mK(bYj());
      GMTrace.o(2102923362304L, 15668);
      return;
      sq(paramBundle);
      break;
      i = R.l.dMP;
      break label138;
    }
  }
  
  protected void onDestroy()
  {
    int j = 3;
    GMTrace.i(2103057580032L, 15669);
    at.wS().b(1145, this);
    final boolean bool3 = bYj();
    final boolean bool1;
    final LinkedList localLinkedList;
    Object localObject2;
    final int i;
    label75:
    label91:
    boolean bool2;
    label113:
    Object localObject1;
    if (this.qZl.xrA != bool3)
    {
      bool1 = true;
      localLinkedList = new LinkedList();
      if (bool1)
      {
        localObject2 = new bih();
        if (!this.qZl.xrA) {
          break label430;
        }
        i = 1;
        ((bih)localObject2).uTL = i;
        if (this.mMode != 1) {
          break label435;
        }
        i = 2;
        ((bih)localObject2).jib = i;
        localLinkedList.add(localObject2);
        if (bool3) {
          break label440;
        }
        bool2 = true;
        localObject1 = w.a.vve;
        if (this.mMode == 1) {
          localObject1 = w.a.vvf;
        }
        at.AR();
        com.tencent.mm.y.c.xh().a((w.a)localObject1, Boolean.valueOf(bool2));
        com.tencent.mm.sdk.b.a.vgX.m(new mr());
        if (this.mMode != 1) {
          break label451;
        }
        if (((bih)localObject2).uTL != 1) {
          break label446;
        }
        i = 3;
        label181:
        w.d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, mSceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(i), this.iEr });
        g.ork.i(13798, new Object[] { Integer.valueOf(i), "", Integer.valueOf(0), this.iEr, Long.valueOf(bg.Pu()) });
      }
      if (this.mMode != 1) {
        break label520;
      }
      i = 2;
      label275:
      localObject1 = this.vOf.vOo;
      if ((localObject1 == null) || (((LinkedList)localObject1).isEmpty())) {
        break label530;
      }
      if (this.mMode != 1) {
        break label525;
      }
    }
    for (;;)
    {
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ServiceNotifySettingsUI.a.a)((Iterator)localObject1).next();
        Object localObject3 = new bih();
        ((bih)localObject3).uTM = ((ServiceNotifySettingsUI.a.a)localObject2).username;
        ((bih)localObject3).jib = j;
        ((bih)localObject3).uTL = 1;
        localLinkedList.add(localObject3);
        localObject3 = new rz();
        ((rz)localObject3).eWN.eAr = ((ServiceNotifySettingsUI.a.a)localObject2).username;
        ((rz)localObject3).eWN.action = 2;
        ((rz)localObject3).eWN.eWP = i;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
      }
      bool1 = false;
      break;
      label430:
      i = 0;
      break label75;
      label435:
      i = 0;
      break label91;
      label440:
      bool2 = false;
      break label113;
      label446:
      i = 2;
      break label181;
      label451:
      if (((bih)localObject2).uTL == 1) {}
      for (i = 11;; i = 10)
      {
        g.ork.i(13796, new Object[] { Integer.valueOf(i), "", "", Integer.valueOf(0), Long.valueOf(bg.Pu()) });
        break;
      }
      label520:
      i = 1;
      break label275;
      label525:
      j = 1;
    }
    label530:
    if (!localLinkedList.isEmpty())
    {
      at.wS().a(1176, new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(2070576889856L, 15427);
          at.wS().b(1176, this);
          w.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(BatchSwitchServiceNotifyOption), errType : %s, errCode : %s, errMsg : %s.", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            u.makeText(ServiceNotifySettingsUI.this, R.l.dNf, 0).show();
            if (bool1)
            {
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vve, Boolean.valueOf(bool3));
              com.tencent.mm.sdk.b.a.vgX.m(new mr());
            }
            paramAnonymousString = localLinkedList.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousk = (bih)paramAnonymousString.next();
              rz localrz = new rz();
              localrz.eWN.eAr = paramAnonymousk.uTM;
              localrz.eWN.action = 1;
              localrz.eWN.eWP = i;
              com.tencent.mm.sdk.b.a.vgX.m(localrz);
            }
            GMTrace.o(2070576889856L, 15427);
            return;
          }
          GMTrace.o(2070576889856L, 15427);
        }
      });
      at.wS().a(new com.tencent.mm.modelappbrand.k(localLinkedList), 0);
    }
    this.vOf.unregisterDataSetObserver(this.AH);
    super.onDestroy();
    GMTrace.o(2103057580032L, 15669);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private String iEr;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int mMode;
    private View.OnClickListener mOnClickListener;
    LinkedList<a> vOn;
    LinkedList<a> vOo;
    private com.tencent.mm.ao.a.a.c vOp;
    
    public a(Context paramContext, LayoutInflater paramLayoutInflater, final int paramInt, String paramString)
    {
      GMTrace.i(2068295188480L, 15410);
      this.mContext = paramContext;
      this.mMode = paramInt;
      this.iEr = paramString;
      this.mLayoutInflater = paramLayoutInflater;
      this.vOn = new LinkedList();
      this.vOo = new LinkedList();
      this.mOnClickListener = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2078227300352L, 15484);
          final String str = (String)paramAnonymousView.getTag();
          if (TextUtils.isEmpty(str))
          {
            GMTrace.o(2078227300352L, 15484);
            return;
          }
          paramAnonymousView = paramAnonymousView.getContext();
          int i;
          if (paramInt == 1)
          {
            i = R.l.dNb;
            if (paramInt != 1) {
              break label114;
            }
          }
          label114:
          for (int j = R.l.dNc;; j = R.l.cTM)
          {
            com.tencent.mm.ui.base.h.a(paramAnonymousView, i, 0, j, R.l.cancel, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(3469930921984L, 25853);
                paramAnonymous2Int = 0;
                while (paramAnonymous2Int < ServiceNotifySettingsUI.a.a(ServiceNotifySettingsUI.a.this).size())
                {
                  paramAnonymous2DialogInterface = (ServiceNotifySettingsUI.a.a)ServiceNotifySettingsUI.a.a(ServiceNotifySettingsUI.a.this).get(paramAnonymous2Int);
                  if ((paramAnonymous2DialogInterface != null) && (str.equals(paramAnonymous2DialogInterface.username)))
                  {
                    ServiceNotifySettingsUI.a.b(ServiceNotifySettingsUI.a.this).add(ServiceNotifySettingsUI.a.a(ServiceNotifySettingsUI.a.this).remove(paramAnonymous2Int));
                    ServiceNotifySettingsUI.a.this.notifyDataSetChanged();
                    paramAnonymous2DialogInterface = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(str);
                    if (paramAnonymous2DialogInterface == null) {}
                    for (paramAnonymous2DialogInterface = ""; ServiceNotifySettingsUI.a.1.this.val$mode == 1; paramAnonymous2DialogInterface = paramAnonymous2DialogInterface.field_appId)
                    {
                      w.d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, appId %s, mSceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(4), paramAnonymous2DialogInterface, ServiceNotifySettingsUI.a.c(ServiceNotifySettingsUI.a.this) });
                      g.ork.i(13798, new Object[] { Integer.valueOf(4), paramAnonymous2DialogInterface, Integer.valueOf(0), ServiceNotifySettingsUI.a.c(ServiceNotifySettingsUI.a.this), Long.valueOf(bg.Pu()) });
                      GMTrace.o(3469930921984L, 25853);
                      return;
                    }
                    g.ork.i(13796, new Object[] { Integer.valueOf(12), paramAnonymous2DialogInterface, "", Integer.valueOf(0), Long.valueOf(bg.Pu()) });
                    GMTrace.o(3469930921984L, 25853);
                    return;
                  }
                  paramAnonymous2Int += 1;
                }
                GMTrace.o(3469930921984L, 25853);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(3087947268096L, 23007);
                GMTrace.o(3087947268096L, 23007);
              }
            }, R.e.aNQ);
            GMTrace.o(2078227300352L, 15484);
            return;
            i = R.l.dNe;
            break;
          }
        }
      };
      paramContext = new c.a();
      paramContext.gKZ = true;
      paramContext.gKW = com.tencent.mm.modelappbrand.a.a.CS();
      this.vOp = paramContext.Jn();
      GMTrace.o(2068295188480L, 15410);
    }
    
    private a Bp(int paramInt)
    {
      GMTrace.i(2068563623936L, 15412);
      a locala = (a)this.vOn.get(paramInt);
      GMTrace.o(2068563623936L, 15412);
      return locala;
    }
    
    public final int getCount()
    {
      GMTrace.i(2068429406208L, 15411);
      int i = this.vOn.size();
      GMTrace.o(2068429406208L, 15411);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2068697841664L, 15413);
      long l = paramInt;
      GMTrace.o(2068697841664L, 15413);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2068832059392L, 15414);
      a locala = Bp(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = this.mLayoutInflater.inflate(R.i.cFT, paramViewGroup, false);
        paramView = new b();
        paramView.hqg = ((ImageView)localView.findViewById(R.h.bfm));
        paramView.hqi = ((TextView)localView.findViewById(R.h.chI));
        paramView.vOs = ((TextView)localView.findViewById(R.h.bYD));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        com.tencent.mm.ao.n.Jd().a(locala.url, paramViewGroup.hqg, this.vOp);
        paramViewGroup.hqi.setText(locala.title);
        if (this.mMode != 1) {
          break label200;
        }
        paramViewGroup.vOs.setText(this.mContext.getString(R.l.dMY));
      }
      for (;;)
      {
        paramViewGroup.vOs.setTag(locala.username);
        paramViewGroup.vOs.setOnClickListener(this.mOnClickListener);
        GMTrace.o(2068832059392L, 15414);
        return localView;
        paramViewGroup = (b)paramView.getTag();
        localView = paramView;
        break;
        label200:
        paramViewGroup.vOs.setText(this.mContext.getString(R.l.dMZ));
      }
    }
    
    private static final class a
    {
      String title;
      String url;
      String username;
      
      public a()
      {
        GMTrace.i(2961514168320L, 22065);
        GMTrace.o(2961514168320L, 22065);
      }
    }
    
    private static final class b
    {
      ImageView hqg;
      TextView hqi;
      TextView vOs;
      
      public b()
      {
        GMTrace.i(2102386491392L, 15664);
        GMTrace.o(2102386491392L, 15664);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\ServiceNotifySettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */