package com.tencent.mm.plugin.emoji.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ak;
import java.util.HashMap;

public abstract class a
  extends BaseAdapter
{
  private final String TAG;
  private final String fRQ;
  private HashMap<String, com.tencent.mm.plugin.emoji.a.a> kgZ;
  public AbsListView khn;
  public c kho;
  public g.a khp;
  protected volatile boolean khq;
  private int khr;
  private int khs;
  public Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(11349853732864L, 84563);
    this.khq = false;
    this.fRQ = "lock";
    this.khr = 0;
    this.khs = 0;
    this.TAG = "MicroMsg.BaseEmojiListAdapter";
    this.mContext = paramContext;
    if (this.mContext != null) {
      this.kgZ = new HashMap();
    }
    GMTrace.o(11349853732864L, 84563);
  }
  
  public static String a(f paramf)
  {
    GMTrace.i(11351195910144L, 84573);
    if (paramf == null)
    {
      GMTrace.o(11351195910144L, 84573);
      return null;
    }
    if (paramf.khz == f.a.khI) {}
    for (paramf = paramf.khB.etB + "_cell";; paramf = paramf.khA.tRS)
    {
      GMTrace.o(11351195910144L, 84573);
      return paramf;
    }
  }
  
  public c a(e parame)
  {
    GMTrace.i(11350524821504L, 84568);
    parame = new c(parame);
    GMTrace.o(11350524821504L, 84568);
    return parame;
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(11349987950592L, 84564);
    if ((paramc == null) || (this.kho == paramc))
    {
      GMTrace.o(11349987950592L, 84564);
      return;
    }
    this.kho = paramc.aqo();
    notifyDataSetChanged();
    GMTrace.o(11349987950592L, 84564);
  }
  
  public final void a(f paramf, String paramString, int paramInt)
  {
    GMTrace.i(11352940740608L, 84586);
    if ((paramf == null) || (paramString == null))
    {
      GMTrace.o(11352940740608L, 84586);
      return;
    }
    paramf.dB(paramInt);
    paramf = (ak)this.kho.khv.get(paramString);
    if (paramf != null) {
      paramf.Au(paramInt);
    }
    GMTrace.o(11352940740608L, 84586);
  }
  
  public void aN(String paramString, int paramInt)
  {
    GMTrace.i(11352538087424L, 84583);
    if ((this.kgZ == null) || (this.kho == null) || (paramString == null))
    {
      GMTrace.o(11352538087424L, 84583);
      return;
    }
    Object localObject = this.kho.vH(paramString);
    if (localObject != null) {
      a((f)localObject, paramString, paramInt);
    }
    if ((localObject != null) && (this.kho != null) && (((f)localObject).mStatus == -1))
    {
      w.i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
      ((f)localObject).a(this.kho.khx, this.kho.vL(paramString), this.kho.vJ(paramString));
    }
    com.tencent.mm.plugin.emoji.a.a locala = vG(paramString);
    if (locala == null)
    {
      GMTrace.o(11352538087424L, 84583);
      return;
    }
    if (locala.apY() == null) {}
    for (localObject = null; (localObject == null) || (!((String)localObject).equals(paramString)); localObject = locala.apY())
    {
      GMTrace.o(11352538087424L, 84583);
      return;
    }
    locala.aqe();
    GMTrace.o(11352538087424L, 84583);
  }
  
  public final void aO(String paramString, int paramInt)
  {
    GMTrace.i(11352806522880L, 84585);
    if ((this.kgZ == null) || (this.kho == null) || (paramString == null))
    {
      GMTrace.o(11352806522880L, 84585);
      return;
    }
    Object localObject = this.kho.vH(paramString);
    if (localObject != null)
    {
      if ((paramInt >= 0) && (paramInt < 100))
      {
        a((f)localObject, paramString, 6);
        ((f)localObject).rr = paramInt;
      }
      if (paramInt >= 100) {
        a((f)localObject, paramString, 7);
      }
    }
    com.tencent.mm.plugin.emoji.a.a locala = vG(paramString);
    if (locala == null)
    {
      GMTrace.o(11352806522880L, 84585);
      return;
    }
    if (locala.apY() == null) {}
    for (localObject = null; (localObject == null) || (!((String)localObject).equals(paramString)); localObject = locala.apY())
    {
      GMTrace.o(11352806522880L, 84585);
      return;
    }
    locala.aqe();
    GMTrace.o(11352806522880L, 84585);
  }
  
  public final void anc()
  {
    GMTrace.i(11353074958336L, 84587);
    if (!this.khq)
    {
      GMTrace.o(11353074958336L, 84587);
      return;
    }
    super.notifyDataSetChanged();
    GMTrace.o(11353074958336L, 84587);
  }
  
  public void aqi()
  {
    GMTrace.i(11350122168320L, 84565);
    if (this.kgZ != null) {
      this.kgZ.clear();
    }
    super.notifyDataSetChanged();
    this.khq = true;
    GMTrace.o(11350122168320L, 84565);
  }
  
  public abstract int aqj();
  
  public abstract int aqk();
  
  public abstract int aql();
  
  public abstract View b(int paramInt, View paramView, ViewGroup paramViewGroup);
  
  public final void b(final e parame)
  {
    GMTrace.i(11350390603776L, 84567);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11354148700160L, 84595);
        if (parame == null)
        {
          GMTrace.o(11354148700160L, 84595);
          return;
        }
        a.a(a.this, a.this.a(parame));
        a.this.notifyDataSetChanged();
        GMTrace.o(11354148700160L, 84595);
      }
    });
    GMTrace.o(11350390603776L, 84567);
  }
  
  public abstract com.tencent.mm.plugin.emoji.a.a c(Context paramContext, View paramView);
  
  public void clear()
  {
    GMTrace.i(11352403869696L, 84582);
    if (this.kgZ != null)
    {
      this.kgZ.clear();
      this.kgZ = null;
    }
    if (this.kho != null)
    {
      this.kho.clear();
      this.kho = null;
    }
    this.khq = false;
    GMTrace.o(11352403869696L, 84582);
  }
  
  public int getCount()
  {
    GMTrace.i(11350659039232L, 84569);
    if (this.kho == null)
    {
      GMTrace.o(11350659039232L, 84569);
      return 0;
    }
    int i = this.kho.size();
    GMTrace.o(11350659039232L, 84569);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(11350927474688L, 84571);
    long l = paramInt;
    GMTrace.o(11350927474688L, 84571);
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11351061692416L, 84572);
    com.tencent.mm.plugin.emoji.a.a locala1 = null;
    if (paramView != null) {
      locala1 = (com.tencent.mm.plugin.emoji.a.a)paramView.getTag();
    }
    f localf = mC(paramInt);
    com.tencent.mm.plugin.emoji.a.a locala2;
    View localView;
    if (locala1 == null)
    {
      locala2 = c(this.mContext, paramView);
      localView = locala2.aqf();
      this.kgZ.put(a(localf), locala2);
    }
    for (;;)
    {
      locala2.jP = paramInt;
      locala2.kfY = localf;
      paramView = b(paramInt, localView, paramViewGroup);
      locala2.aqe();
      GMTrace.o(11351061692416L, 84572);
      return paramView;
      locala2 = locala1;
      localView = paramView;
      if (!bg.nm(a(localf)))
      {
        if (this.kgZ.containsValue(locala1)) {
          this.kgZ.remove(locala1.apY());
        }
        this.kgZ.put(a(localf), locala1);
        locala2 = locala1;
        localView = paramView;
      }
    }
  }
  
  public abstract void mA(int paramInt);
  
  public abstract void mB(int paramInt);
  
  public f mC(int paramInt)
  {
    GMTrace.i(11350793256960L, 84570);
    if (this.kho == null)
    {
      GMTrace.o(11350793256960L, 84570);
      return null;
    }
    f localf = this.kho.mF(paramInt);
    GMTrace.o(11350793256960L, 84570);
    return localf;
  }
  
  public abstract void mz(int paramInt);
  
  public void notifyDataSetChanged()
  {
    GMTrace.i(11350256386048L, 84566);
    this.khq = false;
    if (this.kho != null)
    {
      this.kho.notifyDataSetChanged();
      i = this.khr;
      this.khr = (i + 1);
      w.d("MicroMsg.BaseEmojiListAdapter", "xxx data Notify: %d", new Object[] { Integer.valueOf(i) });
    }
    int i = this.khs;
    this.khs = (i + 1);
    w.v("MicroMsg.BaseEmojiListAdapter", "xxx ui Notify: %d", new Object[] { Integer.valueOf(i) });
    aqi();
    GMTrace.o(11350256386048L, 84566);
  }
  
  public final com.tencent.mm.plugin.emoji.a.a vG(String paramString)
  {
    GMTrace.i(11352672305152L, 84584);
    if (this.kgZ == null)
    {
      GMTrace.o(11352672305152L, 84584);
      return null;
    }
    paramString = (com.tencent.mm.plugin.emoji.a.a)this.kgZ.get(paramString);
    GMTrace.o(11352672305152L, 84584);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */