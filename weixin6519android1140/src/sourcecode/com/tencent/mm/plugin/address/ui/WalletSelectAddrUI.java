package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.a.jo.b;
import com.tencent.mm.plugin.address.model.d;
import com.tencent.mm.plugin.address.model.e;
import com.tencent.mm.plugin.address.model.f;
import com.tencent.mm.plugin.address.model.g;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WalletSelectAddrUI
  extends MMActivity
  implements com.tencent.mm.plugin.address.c.a
{
  private ListView hvF;
  private Object hvH;
  private boolean hvc;
  private com.tencent.mm.plugin.address.c.b hwA;
  private View hwB;
  private TextView hwC;
  private o hwD;
  private boolean hwE;
  private i hwF;
  private List<com.tencent.mm.plugin.address.d.b> hwx;
  private com.tencent.mm.plugin.address.d.b hwy;
  private a hwz;
  
  public WalletSelectAddrUI()
  {
    GMTrace.i(12800344719360L, 95370);
    this.hwx = new LinkedList();
    this.hwA = null;
    this.hwC = null;
    this.hvH = new Object();
    this.hvc = false;
    this.hwE = false;
    this.hwF = null;
    GMTrace.o(12800344719360L, 95370);
  }
  
  private void QY()
  {
    GMTrace.i(12800881590272L, 95374);
    synchronized (this.hvH)
    {
      com.tencent.mm.plugin.address.a.a.QM();
      this.hwx = com.tencent.mm.plugin.address.a.a.QO().hut.huB;
      this.hwz.gpU = this.hwx;
      this.hwx.size();
      this.hwB.setVisibility(8);
      this.hwz.notifyDataSetChanged();
      GMTrace.o(12800881590272L, 95374);
      return;
    }
  }
  
  private void Rd()
  {
    GMTrace.i(12801552678912L, 95379);
    final jo localjo = new jo();
    localjo.eNs.eNu = this;
    localjo.eNs.eNv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12812826968064L, 95463);
        WalletSelectAddrUI.j(WalletSelectAddrUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12794036486144L, 95323);
            if (WalletSelectAddrUI.9.this.hwJ.eNt.eDb)
            {
              at.AR();
              String str1 = bg.nl((String)c.xh().get(46, null));
              at.AR();
              String str2 = bg.nl((String)c.xh().get(72, null));
              WalletSelectAddrUI.a(WalletSelectAddrUI.this, str1, str2);
            }
            GMTrace.o(12794036486144L, 95323);
          }
        });
        GMTrace.o(12812826968064L, 95463);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(localjo, Looper.myLooper());
    GMTrace.o(12801552678912L, 95379);
  }
  
  private void ay(String paramString1, String paramString2)
  {
    GMTrace.i(12801418461184L, 95378);
    paramString1 = new d(paramString1, paramString2, this.hwD);
    this.hwA.g(paramString1);
    GMTrace.o(12801418461184L, 95378);
  }
  
  private void hS(int paramInt)
  {
    GMTrace.i(12801686896640L, 95380);
    Intent localIntent = new Intent();
    localIntent.setClass(this, WalletAddAddressUI.class);
    localIntent.putExtra("address_id", paramInt);
    startActivity(localIntent);
    GMTrace.o(12801686896640L, 95380);
  }
  
  public final void MP()
  {
    GMTrace.i(12801015808000L, 95375);
    this.hwC = ((TextView)findViewById(R.h.bHj));
    this.hwC.setVisibility(8);
    this.hwC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12803968598016L, 95397);
        h.a(WalletSelectAddrUI.this, true, WalletSelectAddrUI.this.getString(R.l.cRr, new Object[] { WalletSelectAddrUI.a(WalletSelectAddrUI.this).toString() }), "", WalletSelectAddrUI.this.getString(R.l.cRs), WalletSelectAddrUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(12818195677184L, 95503);
            WalletSelectAddrUI.b(WalletSelectAddrUI.this);
            GMTrace.o(12818195677184L, 95503);
          }
        }, null);
        GMTrace.o(12803968598016L, 95397);
      }
    });
    this.hvF = ((ListView)findViewById(R.h.ccZ));
    this.hwz = new a(this);
    this.hwB = findViewById(R.h.bcP);
    this.hwB.findViewById(R.h.bcU).setVisibility(8);
    ((TextView)this.hwB.findViewById(R.h.bda)).setText(R.l.cQH);
    this.hvF.setAdapter(this.hwz);
    this.hvF.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> arg1, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12818464112640L, 95505);
        w.d("MicroMsg.WalletSelectAddrUI", "select pos " + paramAnonymousInt);
        synchronized (WalletSelectAddrUI.c(WalletSelectAddrUI.this))
        {
          if (paramAnonymousInt < WalletSelectAddrUI.d(WalletSelectAddrUI.this).size())
          {
            WalletSelectAddrUI.a(WalletSelectAddrUI.this, (com.tencent.mm.plugin.address.d.b)WalletSelectAddrUI.d(WalletSelectAddrUI.this).get(paramAnonymousInt));
            if ((WalletSelectAddrUI.e(WalletSelectAddrUI.this)) || (WalletSelectAddrUI.f(WalletSelectAddrUI.this) == null)) {
              break label137;
            }
            WalletSelectAddrUI.a(WalletSelectAddrUI.this, WalletSelectAddrUI.f(WalletSelectAddrUI.this).id);
          }
          label137:
          while ((WalletSelectAddrUI.f(WalletSelectAddrUI.this) == null) || (WalletSelectAddrUI.f(WalletSelectAddrUI.this).id == 0))
          {
            WalletSelectAddrUI.h(WalletSelectAddrUI.this).notifyDataSetChanged();
            GMTrace.o(12818464112640L, 95505);
            return;
          }
          paramAnonymousView = new g(WalletSelectAddrUI.f(WalletSelectAddrUI.this).id);
          WalletSelectAddrUI.g(WalletSelectAddrUI.this).g(paramAnonymousView);
        }
      }
    });
    this.hvF.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12811216355328L, 95451);
        paramAnonymousAdapterView = WalletSelectAddrUI.this.getResources().getStringArray(R.c.aMz);
        h.a(WalletSelectAddrUI.this.vKB.vKW, null, paramAnonymousAdapterView, null, new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(12794304921600L, 95325);
            for (;;)
            {
              synchronized (WalletSelectAddrUI.c(WalletSelectAddrUI.this))
              {
                if (paramAnonymousInt >= WalletSelectAddrUI.d(WalletSelectAddrUI.this).size()) {
                  break label205;
                }
                com.tencent.mm.plugin.address.d.b localb = (com.tencent.mm.plugin.address.d.b)WalletSelectAddrUI.d(WalletSelectAddrUI.this).get(paramAnonymousInt);
                if (localb == null)
                {
                  GMTrace.o(12794304921600L, 95325);
                  return;
                }
              }
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(12794304921600L, 95325);
                return;
                WalletSelectAddrUI.a(WalletSelectAddrUI.this, ((com.tencent.mm.plugin.address.d.b)localObject1).id);
                GMTrace.o(12794304921600L, 95325);
                return;
                localf = new f(((com.tencent.mm.plugin.address.d.b)localObject1).id);
                WalletSelectAddrUI.a(WalletSelectAddrUI.this, null);
                WalletSelectAddrUI.g(WalletSelectAddrUI.this).g(localf);
                GMTrace.o(12794304921600L, 95325);
                return;
                WalletSelectAddrUI.b(WalletSelectAddrUI.this, localf);
              }
              label205:
              f localf = null;
            }
          }
        });
        GMTrace.o(12811216355328L, 95451);
        return true;
      }
    });
    QY();
    this.hwB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12794976010240L, 95330);
        WalletSelectAddrUI.i(WalletSelectAddrUI.this);
        GMTrace.o(12794976010240L, 95330);
      }
    });
    this.hwz.notifyDataSetChanged();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12808934653952L, 95434);
        WalletSelectAddrUI.this.setResult(0);
        WalletSelectAddrUI.this.finish();
        GMTrace.o(12808934653952L, 95434);
        return true;
      }
    });
    a(0, R.l.cQJ, R.k.cIG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12810142613504L, 95443);
        WalletSelectAddrUI.i(WalletSelectAddrUI.this);
        GMTrace.o(12810142613504L, 95443);
        return true;
      }
    });
    GMTrace.o(12801015808000L, 95375);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12801284243456L, 95377);
    this.hwA.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 417)
      {
        if (((e)paramk).hum)
        {
          QY();
          this.vKB.hqF.setVisibility(0);
          if ((this.hvc) && (this.hwx.size() == 0))
          {
            paramString = new Intent();
            paramString.setClass(this, WalletAddAddressUI.class);
            startActivityForResult(paramString, 1);
          }
        }
        GMTrace.o(12801284243456L, 95377);
        return;
      }
      if (paramk.getType() == 416)
      {
        paramString = (f)paramk;
        com.tencent.mm.plugin.address.a.a.QM();
        paramString = com.tencent.mm.plugin.address.a.a.QO().hM(paramString.hun);
        if (paramString != null)
        {
          com.tencent.mm.plugin.address.a.a.QM();
          boolean bool = com.tencent.mm.plugin.address.a.a.QO().a(paramString);
          w.d("MicroMsg.WalletSelectAddrUI", "delte addr " + bool);
        }
        QY();
        GMTrace.o(12801284243456L, 95377);
        return;
      }
      if (paramk.getType() == 419)
      {
        if (this.hwy != null)
        {
          setResult(-1, com.tencent.mm.plugin.address.e.a.b(this.hwy));
          finish();
          GMTrace.o(12801284243456L, 95377);
        }
      }
      else if (paramk.getType() == 582)
      {
        paramString = getString(R.l.cRt);
        switch (((d)paramk).status)
        {
        default: 
        case 1: 
        case 2: 
        case 0: 
          for (;;)
          {
            if (this.hwF != null) {
              this.hwF.dismiss();
            }
            this.hwF = h.a(this, paramString, null, true, null);
            GMTrace.o(12801284243456L, 95377);
            return;
            at.AR();
            c.xh().set(196657, Boolean.valueOf(true));
            this.hwC.setVisibility(8);
            paramString = getString(R.l.cRu);
            continue;
            at.AR();
            c.xh().set(196657, Boolean.valueOf(true));
            this.hwC.setVisibility(8);
            QY();
            this.vKB.hqF.setVisibility(0);
            paramString = getString(R.l.cRv);
          }
        }
        Rd();
        GMTrace.o(12801284243456L, 95377);
      }
    }
    else if ((paramk.getType() == 419) && (paramInt2 == 62433))
    {
      h.a(this, true, paramString, "", getString(R.l.cQN), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12812021661696L, 95457);
          paramAnonymousDialogInterface.dismiss();
          WalletSelectAddrUI.a(WalletSelectAddrUI.this, WalletSelectAddrUI.f(WalletSelectAddrUI.this).id);
          GMTrace.o(12812021661696L, 95457);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12817927241728L, 95501);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12817927241728L, 95501);
        }
      });
    }
    GMTrace.o(12801284243456L, 95377);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12801150025728L, 95376);
    int i = R.i.cHN;
    GMTrace.o(12801150025728L, 95376);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12801821114368L, 95381);
    if (paramInt1 == 1)
    {
      if (-1 != paramInt2) {
        break label168;
      }
      if (paramIntent != null) {
        break label57;
      }
      w.e("MicroMsg.AddrUtil", "intent == null");
      paramIntent = null;
      setResult(-1, com.tencent.mm.plugin.address.e.a.b(paramIntent));
    }
    for (;;)
    {
      finish();
      GMTrace.o(12801821114368L, 95381);
      return;
      label57:
      com.tencent.mm.plugin.address.d.b localb = new com.tencent.mm.plugin.address.d.b();
      localb.huK = paramIntent.getStringExtra("nationalCode");
      localb.huI = paramIntent.getStringExtra("userName");
      localb.huJ = paramIntent.getStringExtra("telNumber");
      localb.huG = paramIntent.getStringExtra("addressPostalCode");
      localb.huD = paramIntent.getStringExtra("proviceFirstStageName");
      localb.huE = paramIntent.getStringExtra("addressCitySecondStageName");
      localb.huF = paramIntent.getStringExtra("addressCountiesThirdStageName");
      localb.huH = paramIntent.getStringExtra("addressDetailInfo");
      paramIntent = localb;
      break;
      label168:
      setResult(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12800478937088L, 95371);
    super.onCreate(paramBundle);
    this.hwA = new com.tencent.mm.plugin.address.c.b(this, this);
    paramBundle = getIntent();
    this.hwE = paramBundle.getBooleanExtra("launch_from_appbrand", false);
    if ((paramBundle.getBooleanExtra("launch_from_webview", false)) || (this.hwE))
    {
      this.hvc = true;
      this.vKB.hqF.setVisibility(8);
      if (this.hwE) {
        getWindow().setBackgroundDrawableResource(R.e.aOz);
      }
      w.i("MicroMsg.WalletSelectAddrUI", "showDisclaimerDailog()");
      at.AR();
      if (((Boolean)c.xh().get(w.a.vva, Boolean.valueOf(true))).booleanValue())
      {
        w.i("MicroMsg.WalletSelectAddrUI", "isShowDisclaimerDialog");
        h.a(this, getString(R.l.cRk), getString(R.l.cRl), getString(R.l.cPO), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12809874178048L, 95441);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(12809874178048L, 95441);
          }
        });
        at.AR();
        c.xh().a(w.a.vva, Boolean.valueOf(false));
      }
    }
    oM(R.l.cRj);
    this.hwA.hN(417);
    this.hwA.hN(416);
    this.hwA.hN(419);
    this.hwA.hN(582);
    paramBundle = new e(paramBundle.getStringExtra("req_url"), paramBundle.getStringExtra("req_app_id"), 2);
    this.hwA.g(paramBundle);
    at.AR();
    this.hwD = new o(bg.a((Integer)c.xh().get(9, null), 0));
    MP();
    at.AR();
    if (c.isSDCardAvailable())
    {
      paramBundle = new com.tencent.mm.aw.k(12);
      at.wS().a(paramBundle, 0);
    }
    GMTrace.o(12800478937088L, 95371);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12800613154816L, 95372);
    super.onDestroy();
    this.hwA.hO(417);
    this.hwA.hO(416);
    this.hwA.hO(419);
    this.hwA.hO(582);
    GMTrace.o(12800613154816L, 95372);
  }
  
  public void onResume()
  {
    GMTrace.i(12800747372544L, 95373);
    super.onResume();
    QY();
    GMTrace.o(12800747372544L, 95373);
  }
  
  public final class a
    extends BaseAdapter
  {
    private final Context context;
    List<com.tencent.mm.plugin.address.d.b> gpU;
    
    public a(Context paramContext)
    {
      GMTrace.i(12795781316608L, 95336);
      this.gpU = new ArrayList();
      this.context = paramContext;
      GMTrace.o(12795781316608L, 95336);
    }
    
    private com.tencent.mm.plugin.address.d.b hT(int paramInt)
    {
      GMTrace.i(12796183969792L, 95339);
      com.tencent.mm.plugin.address.d.b localb = (com.tencent.mm.plugin.address.d.b)this.gpU.get(paramInt);
      GMTrace.o(12796183969792L, 95339);
      return localb;
    }
    
    public final int getCount()
    {
      GMTrace.i(12796049752064L, 95338);
      int i = this.gpU.size();
      GMTrace.o(12796049752064L, 95338);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12796318187520L, 95340);
      long l = paramInt;
      GMTrace.o(12796318187520L, 95340);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12795915534336L, 95337);
      paramViewGroup = new a();
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cHM, null);
        paramViewGroup.hvP = ((ImageView)paramView.findViewById(R.h.bpc));
        paramViewGroup.hvO = ((TextView)paramView.findViewById(R.h.bcU));
        paramViewGroup.hvQ = ((TextView)paramView.findViewById(R.h.bda));
        paramView.setTag(paramViewGroup);
        com.tencent.mm.plugin.address.d.b localb = hT(paramInt);
        StringBuilder localStringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(localb.huD)) {
          localStringBuilder.append(localb.huD);
        }
        if (!TextUtils.isEmpty(localb.huE))
        {
          localStringBuilder.append(" ");
          localStringBuilder.append(localb.huE);
        }
        if (!TextUtils.isEmpty(localb.huF))
        {
          localStringBuilder.append(" ");
          localStringBuilder.append(localb.huF);
        }
        if (!TextUtils.isEmpty(localb.huH))
        {
          localStringBuilder.append(" ");
          localStringBuilder.append(localb.huH);
        }
        paramViewGroup.hvO.setText(localStringBuilder.toString());
        paramViewGroup.hvQ.setText(localb.huI + "，" + localb.huJ);
        if ((!WalletSelectAddrUI.e(WalletSelectAddrUI.this)) || (WalletSelectAddrUI.f(WalletSelectAddrUI.this) == null) || (WalletSelectAddrUI.f(WalletSelectAddrUI.this).id != localb.id)) {
          break label327;
        }
        paramViewGroup.hvP.setImageResource(R.k.cOv);
      }
      for (;;)
      {
        GMTrace.o(12795915534336L, 95337);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label327:
        paramViewGroup.hvP.setImageBitmap(null);
      }
    }
    
    final class a
    {
      TextView hvO;
      ImageView hvP;
      TextView hvQ;
      
      a()
      {
        GMTrace.i(12799405195264L, 95363);
        GMTrace.o(12799405195264L, 95363);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\WalletSelectAddrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */