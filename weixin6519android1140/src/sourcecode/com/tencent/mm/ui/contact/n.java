package com.tencent.mm.ui.contact;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import junit.framework.Assert;

public abstract class n
  extends BaseAdapter
{
  public int scene;
  private SparseArray<a> vpo;
  public l wSB;
  private boolean wSC;
  boolean wSD;
  
  public n(l paraml, boolean paramBoolean, int paramInt)
  {
    this(paraml, paramBoolean, paramInt, false);
    GMTrace.i(1718523789312L, 12804);
    GMTrace.o(1718523789312L, 12804);
  }
  
  public n(l paraml, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    GMTrace.i(16857746636800L, 125600);
    this.wSB = paraml;
    this.wSC = paramBoolean1;
    this.vpo = new SparseArray();
    this.scene = paramInt;
    this.wSD = paramBoolean2;
    GMTrace.o(16857746636800L, 125600);
  }
  
  public final a DC(int paramInt)
  {
    GMTrace.i(1718926442496L, 12807);
    a locala = null;
    if (this.vpo.indexOfKey(paramInt) >= 0) {
      locala = (a)this.vpo.get(paramInt);
    }
    for (;;)
    {
      GMTrace.o(1718926442496L, 12807);
      return locala;
      if ((paramInt >= 0) && (paramInt < getCount()))
      {
        locala = hG(paramInt);
        if (locala != null)
        {
          locala.jug = c(locala);
          this.vpo.put(paramInt, locala);
          w.d("MicroMsg.MMSelectContactAdapter", "put item to cache viewType=%d|position=%d", new Object[] { Integer.valueOf(locala.jHw), Integer.valueOf(paramInt) });
        }
        else
        {
          w.e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
      else
      {
        w.e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
      }
    }
  }
  
  public boolean DD(int paramInt)
  {
    GMTrace.i(1720134402048L, 12816);
    GMTrace.o(1720134402048L, 12816);
    return false;
  }
  
  public boolean bhh()
  {
    GMTrace.i(1718658007040L, 12805);
    boolean bool = this.wSC;
    GMTrace.o(1718658007040L, 12805);
    return bool;
  }
  
  protected boolean c(a parama)
  {
    GMTrace.i(1719194877952L, 12809);
    GMTrace.o(1719194877952L, 12809);
    return false;
  }
  
  public final void clearCache()
  {
    GMTrace.i(1719865966592L, 12814);
    if (this.vpo != null) {
      this.vpo.clear();
    }
    GMTrace.o(1719865966592L, 12814);
  }
  
  public void finish()
  {
    GMTrace.i(1720000184320L, 12815);
    clearCache();
    GMTrace.o(1720000184320L, 12815);
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(1719329095680L, 12810);
    GMTrace.o(1719329095680L, 12810);
    return -1L;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(1719463313408L, 12811);
    if (DC(paramInt) != null)
    {
      paramInt = DC(paramInt).jHw;
      GMTrace.o(1719463313408L, 12811);
      return paramInt;
    }
    w.e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    GMTrace.o(1719463313408L, 12811);
    return -1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(1719731748864L, 12813);
    a locala = DC(paramInt);
    View localView = paramView;
    if (paramView == null) {
      localView = locala.PV().a(this.wSB.getActivity(), paramViewGroup);
    }
    paramView = (a.a)localView.getTag();
    Assert.assertNotNull(paramView);
    if (!locala.wUG)
    {
      locala.bz(this.wSB.getActivity());
      locala.wUG = true;
    }
    locala.wSC = bhh();
    locala.PV().a(this.wSB.getActivity(), paramView, locala, this.wSB.b(locala), this.wSB.a(locala));
    GMTrace.o(1719731748864L, 12813);
    return localView;
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(1719597531136L, 12812);
    GMTrace.o(1719597531136L, 12812);
    return 8;
  }
  
  public abstract a hG(int paramInt);
  
  public final void mr(boolean paramBoolean)
  {
    GMTrace.i(1718792224768L, 12806);
    this.wSC = paramBoolean;
    notifyDataSetChanged();
    GMTrace.o(1718792224768L, 12806);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */