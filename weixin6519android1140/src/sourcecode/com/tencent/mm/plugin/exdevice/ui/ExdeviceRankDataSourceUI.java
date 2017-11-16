package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.q;
import com.tencent.mm.protocal.c.ads;
import com.tencent.mm.protocal.c.bmw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceRankDataSourceUI
  extends MMActivity
  implements e
{
  private ListView Ev;
  private b kJv;
  
  public ExdeviceRankDataSourceUI()
  {
    GMTrace.i(11066654326784L, 82453);
    GMTrace.o(11066654326784L, 82453);
  }
  
  protected final void MP()
  {
    GMTrace.i(11067056979968L, 82456);
    this.Ev = ((ListView)findViewById(R.h.bKn));
    View localView1 = View.inflate(this, R.i.cvZ, null);
    View localView2 = View.inflate(this, R.i.cvY, null);
    this.Ev.addHeaderView(localView1, null, false);
    this.Ev.addFooterView(localView2, null, false);
    this.kJv = new b();
    this.Ev.setAdapter(this.kJv);
    ((ScrollView)findViewById(R.h.bZQ)).scrollTo(0, 0);
    localView2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11041152958464L, 82263);
        paramAnonymousView = new Intent(ExdeviceRankDataSourceUI.this.vKB.vKW, ExdeviceAddDataSourceUI.class);
        ExdeviceRankDataSourceUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(11041152958464L, 82263);
      }
    });
    GMTrace.o(11067056979968L, 82456);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11067593850880L, 82460);
    if (paramk == null)
    {
      w.e("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, scene is null.");
      GMTrace.o(11067593850880L, 82460);
      return;
    }
    if ((paramk instanceof q))
    {
      at.wS().b(1267, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ads)((q)paramk).fUa.gtD.gtK;
        if (paramString.upp == null) {
          break label131;
        }
      }
    }
    label131:
    for (paramInt1 = paramString.upp.size();; paramInt1 = 0)
    {
      w.d("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, get sport device list succ.(size : %d)", new Object[] { Integer.valueOf(paramInt1) });
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11081149841408L, 82561);
          ExdeviceRankDataSourceUI.b localb = ExdeviceRankDataSourceUI.b(ExdeviceRankDataSourceUI.this);
          Object localObject = this.kJx;
          localb.kJA.clear();
          if ((localObject == null) || (((List)localObject).size() == 0)) {}
          for (;;)
          {
            ExdeviceRankDataSourceUI.b(ExdeviceRankDataSourceUI.this).notifyDataSetChanged();
            GMTrace.o(11081149841408L, 82561);
            return;
            localObject = ((List)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              bmw localbmw = (bmw)((Iterator)localObject).next();
              if (localbmw != null) {
                localb.kJA.add(ExdeviceRankDataSourceUI.a(localbmw));
              }
            }
          }
        }
      });
      GMTrace.o(11067593850880L, 82460);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11066788544512L, 82454);
    int i = R.i.cvX;
    GMTrace.o(11066788544512L, 82454);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11067459633152L, 82459);
    w.d("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, reqCode(%s), resultCode(%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 1) && (paramInt2 == -1) && (paramIntent != null))
    {
      long l = paramIntent.getLongExtra("device_mac", 0L);
      paramIntent.getIntExtra("step", 0);
      if (l == 0L)
      {
        w.e("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, mac is nil.");
        GMTrace.o(11067459633152L, 82459);
        return;
      }
      paramIntent = com.tencent.mm.plugin.exdevice.j.b.bS(l);
      if (paramIntent == null)
      {
        w.e("MicroMsg.ExdeviceRankDataSourceUI", "invalid mac(%s).", new Object[] { paramIntent });
        GMTrace.o(11067459633152L, 82459);
        return;
      }
      if (this.kJv.xe(paramIntent) != null)
      {
        w.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
        GMTrace.o(11067459633152L, 82459);
        return;
      }
      paramIntent = ad.atR().bR(l);
      if (paramIntent == null)
      {
        w.w("MicroMsg.ExdeviceRankDataSourceUI", "hard device info is null.(mac : %s)", new Object[] { Long.valueOf(l) });
        GMTrace.o(11067459633152L, 82459);
        return;
      }
      if (this.kJv.cc(paramIntent.field_deviceID, paramIntent.field_deviceType) != null)
      {
        w.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
        GMTrace.o(11067459633152L, 82459);
        return;
      }
      at.wS().a(1267, this);
      at.wS().a(new q(), 0);
    }
    GMTrace.o(11067459633152L, 82459);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11067191197696L, 82457);
    finish();
    GMTrace.o(11067191197696L, 82457);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11066922762240L, 82455);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11102222024704L, 82718);
        ExdeviceRankDataSourceUI.a(ExdeviceRankDataSourceUI.this);
        GMTrace.o(11102222024704L, 82718);
        return true;
      }
    });
    oM(R.l.dkv);
    at.wS().a(1267, this);
    MP();
    at.wS().a(new q(), 0);
    GMTrace.o(11066922762240L, 82455);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11067325415424L, 82458);
    super.onDestroy();
    at.wS().b(1267, this);
    GMTrace.o(11067325415424L, 82458);
  }
  
  private static final class a
  {
    bmw kJy;
    com.tencent.mm.plugin.exdevice.h.b kJz;
    String mac;
    
    public a()
    {
      GMTrace.i(11103698419712L, 82729);
      GMTrace.o(11103698419712L, 82729);
    }
  }
  
  private static final class b
    extends BaseAdapter
  {
    private com.tencent.mm.ao.a.a.c kEK;
    List<ExdeviceRankDataSourceUI.a> kJA;
    
    public b()
    {
      GMTrace.i(11078062833664L, 82538);
      this.kJA = new LinkedList();
      c.a locala = new c.a();
      locala.gKR = R.g.aWr;
      this.kEK = locala.Jn();
      GMTrace.o(11078062833664L, 82538);
    }
    
    private ExdeviceRankDataSourceUI.a nk(int paramInt)
    {
      GMTrace.i(11078599704576L, 82542);
      ExdeviceRankDataSourceUI.a locala = (ExdeviceRankDataSourceUI.a)this.kJA.get(paramInt);
      GMTrace.o(11078599704576L, 82542);
      return locala;
    }
    
    /* Error */
    public final ExdeviceRankDataSourceUI.a cc(String paramString1, String paramString2)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 71
      //   5: ldc 73
      //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: aload_0
      //   11: getfield 33	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$b:kJA	Ljava/util/List;
      //   14: invokeinterface 77 1 0
      //   19: astore 4
      //   21: aload 4
      //   23: invokeinterface 83 1 0
      //   28: ifeq +44 -> 72
      //   31: aload 4
      //   33: invokeinterface 87 1 0
      //   38: checkcast 68	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$a
      //   41: astore_3
      //   42: aload_3
      //   43: ifnull -22 -> 21
      //   46: aload_1
      //   47: aload_2
      //   48: aload_3
      //   49: getfield 91	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$a:kJy	Lcom/tencent/mm/protocal/c/bmw;
      //   52: invokestatic 94	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/c/bmw;)Z
      //   55: ifeq -34 -> 21
      //   58: ldc2_w 71
      //   61: ldc 73
      //   63: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   66: aload_3
      //   67: astore_1
      //   68: aload_0
      //   69: monitorexit
      //   70: aload_1
      //   71: areturn
      //   72: aconst_null
      //   73: astore_1
      //   74: ldc2_w 71
      //   77: ldc 73
      //   79: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   82: goto -14 -> 68
      //   85: astore_1
      //   86: aload_0
      //   87: monitorexit
      //   88: aload_1
      //   89: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	90	0	this	b
      //   0	90	1	paramString1	String
      //   0	90	2	paramString2	String
      //   41	26	3	locala	ExdeviceRankDataSourceUI.a
      //   19	13	4	localIterator	Iterator
      // Exception table:
      //   from	to	target	type
      //   2	21	85	finally
      //   21	42	85	finally
      //   46	66	85	finally
      //   74	82	85	finally
    }
    
    public final int getCount()
    {
      GMTrace.i(11078465486848L, 82541);
      int i = this.kJA.size();
      GMTrace.o(11078465486848L, 82541);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11078733922304L, 82543);
      long l = paramInt;
      GMTrace.o(11078733922304L, 82543);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11078868140032L, 82544);
      ExdeviceRankDataSourceUI.a locala = nk(paramInt);
      Object localObject;
      if (paramView == null)
      {
        paramView = new a();
        localObject = View.inflate(paramViewGroup.getContext(), R.i.cvW, null);
        paramView.jUm = ((TextView)((View)localObject).findViewById(R.h.bPo));
        paramView.iub = ((ImageView)((View)localObject).findViewById(R.h.bGn));
        ((View)localObject).setTag(paramView);
        paramViewGroup = paramView;
        paramView = (View)localObject;
      }
      for (;;)
      {
        localObject = ExdeviceRankDataSourceUI.a(locala);
        w.d("MicroMsg.ExdeviceRankDataSourceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), localObject, locala.mac });
        paramViewGroup.jUm.setText((CharSequence)localObject);
        com.tencent.mm.ao.n.Jd().a(locala.kJy.lRV, paramViewGroup.iub, this.kEK);
        GMTrace.o(11078868140032L, 82544);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
    }
    
    /* Error */
    public final ExdeviceRankDataSourceUI.a xe(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 215
      //   5: ldc -39
      //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: aload_1
      //   11: invokestatic 223	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   14: ifne +57 -> 71
      //   17: aload_0
      //   18: getfield 33	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$b:kJA	Ljava/util/List;
      //   21: invokeinterface 77 1 0
      //   26: astore_3
      //   27: aload_3
      //   28: invokeinterface 83 1 0
      //   33: ifeq +38 -> 71
      //   36: aload_3
      //   37: invokeinterface 87 1 0
      //   42: checkcast 68	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$a
      //   45: astore_2
      //   46: aload_1
      //   47: aload_2
      //   48: getfield 183	com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$a:mac	Ljava/lang/String;
      //   51: invokevirtual 229	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   54: ifeq -27 -> 27
      //   57: ldc2_w 215
      //   60: ldc -39
      //   62: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   65: aload_2
      //   66: astore_1
      //   67: aload_0
      //   68: monitorexit
      //   69: aload_1
      //   70: areturn
      //   71: aconst_null
      //   72: astore_1
      //   73: ldc2_w 215
      //   76: ldc -39
      //   78: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   81: goto -14 -> 67
      //   84: astore_1
      //   85: aload_0
      //   86: monitorexit
      //   87: aload_1
      //   88: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	89	0	this	b
      //   0	89	1	paramString	String
      //   45	21	2	locala	ExdeviceRankDataSourceUI.a
      //   26	11	3	localIterator	Iterator
      // Exception table:
      //   from	to	target	type
      //   2	27	84	finally
      //   27	65	84	finally
      //   73	81	84	finally
    }
    
    private static final class a
    {
      ImageView iub;
      TextView jUm;
      
      public a()
      {
        GMTrace.i(11041555611648L, 82266);
        GMTrace.o(11041555611648L, 82266);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceRankDataSourceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */