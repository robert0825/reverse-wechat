package com.tencent.mm.ui.base.sortview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  extends BaseAdapter
{
  private Map<String, Integer> wlA;
  private a wlB;
  public Runnable wlC;
  public List<d> wlv;
  
  public c(a parama)
  {
    GMTrace.i(20999839940608L, 156461);
    this.wlv = null;
    this.wlC = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(21004805996544L, 156498);
        c.this.cA(c.a(c.this));
        GMTrace.o(21004805996544L, 156498);
      }
    };
    if (parama == null) {
      throw new RuntimeException("ViewCreator can not be null.");
    }
    this.wlB = parama;
    this.wlv = new ArrayList();
    this.wlA = new HashMap();
    GMTrace.o(20999839940608L, 156461);
  }
  
  private String Cv(int paramInt)
  {
    GMTrace.i(21000645246976L, 156467);
    if ((paramInt < 0) || (paramInt >= this.wlv.size()))
    {
      GMTrace.o(21000645246976L, 156467);
      return null;
    }
    String str = ((d)this.wlv.get(paramInt)).wlE;
    GMTrace.o(21000645246976L, 156467);
    return str;
  }
  
  public final int VL(String paramString)
  {
    GMTrace.i(21000779464704L, 156468);
    int i = bg.a((Integer)this.wlA.get(paramString), -1);
    GMTrace.o(21000779464704L, 156468);
    return i;
  }
  
  public final void cA(List<d> paramList)
  {
    GMTrace.i(20999974158336L, 156462);
    if (this.wlv != paramList)
    {
      this.wlv.clear();
      if (paramList != null) {
        this.wlv.addAll(paramList);
      }
    }
    this.wlA.clear();
    int i = 0;
    paramList = null;
    Object localObject;
    if (i < this.wlv.size())
    {
      localObject = (d)this.wlv.get(i);
      if ((localObject != null) && (((d)localObject).wlE != null))
      {
        localObject = ((d)localObject).wlE;
        label96:
        if ((localObject == null) || (((String)localObject).equalsIgnoreCase(paramList))) {
          break label150;
        }
        this.wlA.put(localObject, Integer.valueOf(i));
      }
    }
    for (;;)
    {
      i += 1;
      paramList = (List<d>)localObject;
      break;
      localObject = null;
      break label96;
      notifyDataSetChanged();
      GMTrace.o(20999974158336L, 156462);
      return;
      label150:
      localObject = paramList;
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(21000108376064L, 156463);
    int i = this.wlv.size();
    GMTrace.o(21000108376064L, 156463);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(21000242593792L, 156464);
    Object localObject = this.wlv.get(paramInt);
    GMTrace.o(21000242593792L, 156464);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(21000376811520L, 156465);
    long l = paramInt;
    GMTrace.o(21000376811520L, 156465);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool2 = true;
    GMTrace.i(21000511029248L, 156466);
    paramViewGroup = (d)getItem(paramInt);
    Object localObject = Cv(paramInt);
    String str = Cv(paramInt + 1);
    boolean bool1;
    if (paramInt == VL((String)localObject))
    {
      bool1 = true;
      if ((localObject == null) || (((String)localObject).equalsIgnoreCase(str))) {
        break label106;
      }
    }
    for (;;)
    {
      localObject = this.wlB;
      getCount();
      paramView = ((a)localObject).a(paramViewGroup, paramView, paramInt, bool1, bool2);
      GMTrace.o(21000511029248L, 156466);
      return paramView;
      bool1 = false;
      break;
      label106:
      bool2 = false;
    }
  }
  
  public static abstract interface a
  {
    public abstract View a(d paramd, View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\sortview\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */