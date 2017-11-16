package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class b
  extends a
{
  ArrayList<Object> dw;
  Context mContext;
  int qnp;
  
  protected b(Context paramContext, int paramInt)
  {
    GMTrace.i(15990297460736L, 119137);
    this.dw = new ArrayList();
    this.mContext = paramContext;
    this.qnp = 4;
    GMTrace.o(15990297460736L, 119137);
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    GMTrace.i(15990834331648L, 119141);
    bt(paramObject);
    this.dw.add(paramInt, paramObject);
    notifyDataSetChanged();
    GMTrace.o(15990834331648L, 119141);
  }
  
  public final void add(Object paramObject)
  {
    GMTrace.i(15990700113920L, 119140);
    bt(paramObject);
    this.dw.add(paramObject);
    notifyDataSetChanged();
    GMTrace.o(15990700113920L, 119140);
  }
  
  public void bI(List<?> paramList)
  {
    GMTrace.i(15990431678464L, 119138);
    clear();
    bH(paramList);
    this.dw.addAll(paramList);
    notifyDataSetChanged();
    GMTrace.o(15990431678464L, 119138);
  }
  
  public void clear()
  {
    GMTrace.i(15990565896192L, 119139);
    this.qno.clear();
    this.dw.clear();
    notifyDataSetChanged();
    GMTrace.o(15990565896192L, 119139);
  }
  
  public void di(int paramInt1, int paramInt2)
  {
    GMTrace.i(15991371202560L, 119145);
    if (paramInt2 < getCount())
    {
      ArrayList localArrayList = this.dw;
      localArrayList.add(paramInt2, localArrayList.remove(paramInt1));
      notifyDataSetChanged();
    }
    GMTrace.o(15991371202560L, 119145);
  }
  
  public final int getColumnCount()
  {
    GMTrace.i(15991236984832L, 119144);
    int i = this.qnp;
    GMTrace.o(15991236984832L, 119144);
    return i;
  }
  
  public int getCount()
  {
    GMTrace.i(15990968549376L, 119142);
    int i = this.dw.size();
    GMTrace.o(15990968549376L, 119142);
    return i;
  }
  
  public Object getItem(int paramInt)
  {
    GMTrace.i(15991102767104L, 119143);
    Object localObject = this.dw.get(paramInt);
    GMTrace.o(15991102767104L, 119143);
    return localObject;
  }
  
  public boolean vC(int paramInt)
  {
    GMTrace.i(15991505420288L, 119146);
    GMTrace.o(15991505420288L, 119146);
    return true;
  }
  
  public boolean vD(int paramInt)
  {
    GMTrace.i(15991639638016L, 119147);
    GMTrace.o(15991639638016L, 119147);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */