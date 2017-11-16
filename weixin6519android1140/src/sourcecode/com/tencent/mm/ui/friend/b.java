package com.tencent.mm.ui.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.o;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.r;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.protocal.c.uq;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

final class b
  extends BaseAdapter
{
  private LinkedList<aqf> glr;
  private boolean[] htR;
  private final LayoutInflater lVD;
  LinkedList<uq> xbA;
  boolean xbB;
  
  public b(LayoutInflater paramLayoutInflater)
  {
    GMTrace.i(2790789218304L, 20793);
    this.lVD = paramLayoutInflater;
    GMTrace.o(2790789218304L, 20793);
  }
  
  public final String[] cht()
  {
    int m = 0;
    GMTrace.i(2791191871488L, 20796);
    Object localObject = this.htR;
    int n = localObject.length;
    int i = 0;
    int k;
    for (int j = 0; i < n; j = k)
    {
      k = j;
      if (localObject[i] != 0) {
        k = j + 1;
      }
      i += 1;
    }
    localObject = new String[j];
    j = 0;
    i = m;
    if (j < this.glr.size())
    {
      if (this.htR[j] == 0) {
        break label127;
      }
      localObject[i] = ((aqf)this.glr.get(j)).jhi;
      i += 1;
    }
    label127:
    for (;;)
    {
      j += 1;
      break;
      GMTrace.o(2791191871488L, 20796);
      return (String[])localObject;
    }
  }
  
  public final void f(LinkedList<aqf> paramLinkedList, int paramInt)
  {
    GMTrace.i(2791057653760L, 20795);
    if (paramInt < 0) {
      this.glr = paramLinkedList;
    }
    for (;;)
    {
      this.htR = new boolean[this.glr.size()];
      GMTrace.o(2791057653760L, 20795);
      return;
      this.glr = new LinkedList();
      int i = 0;
      while (i < paramLinkedList.size())
      {
        if (paramInt == ((aqf)paramLinkedList.get(i)).umS) {
          this.glr.add(paramLinkedList.get(i));
        }
        i += 1;
      }
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(2791326089216L, 20797);
    int i;
    if (this.xbB)
    {
      if (this.xbA == null)
      {
        GMTrace.o(2791326089216L, 20797);
        return 0;
      }
      i = this.xbA.size();
      GMTrace.o(2791326089216L, 20797);
      return i;
    }
    if (this.glr != null)
    {
      i = this.glr.size();
      GMTrace.o(2791326089216L, 20797);
      return i;
    }
    GMTrace.o(2791326089216L, 20797);
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(2791460306944L, 20798);
    if (this.xbB)
    {
      localObject = this.xbA.get(paramInt);
      GMTrace.o(2791460306944L, 20798);
      return localObject;
    }
    Object localObject = this.glr.get(paramInt);
    GMTrace.o(2791460306944L, 20798);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(2791594524672L, 20799);
    GMTrace.o(2791594524672L, 20799);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2791728742400L, 20800);
    Object localObject;
    View localView;
    if (this.xbB)
    {
      localObject = (uq)this.xbA.get(paramInt);
      if ((paramView == null) || (((a)paramView.getTag()).type != 2))
      {
        localView = this.lVD.inflate(R.i.czV, paramViewGroup, false);
        paramView = new a();
        paramView.type = 2;
        paramView.jUm = ((TextView)localView.findViewById(R.h.bUL));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        paramViewGroup.jUm.setText(((uq)localObject).umT);
        GMTrace.o(2791728742400L, 20800);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
    }
    aqf localaqf = (aqf)this.glr.get(paramInt);
    if ((paramView == null) || (((a)paramView.getTag()).type != 1))
    {
      localView = this.lVD.inflate(R.i.czU, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.type = 1;
      paramViewGroup.jtr = ((TextView)localView.findViewById(R.h.bHS));
      paramViewGroup.xbC = ((TextView)localView.findViewById(R.h.bHQ));
      paramViewGroup.htT = ((CheckBox)localView.findViewById(R.h.bHT));
      paramViewGroup.htS = ((TextView)localView.findViewById(R.h.bHI));
      localView.setTag(paramViewGroup);
      if (!af.Ij().jT(localaqf.jhi)) {
        break label385;
      }
      paramViewGroup.htS.setVisibility(0);
      label281:
      TextView localTextView = paramViewGroup.jtr;
      if (localaqf == null) {
        break label476;
      }
      paramView = localaqf.ueH;
      if ((paramView == null) || (paramView.length() <= 0)) {
        break label397;
      }
      label309:
      localTextView.setText(paramView);
      localObject = paramViewGroup.xbC;
      if (localaqf == null) {
        break label576;
      }
      if (localaqf.uxU != 0) {
        break label482;
      }
      paramView = localaqf.jhi;
    }
    for (;;)
    {
      ((TextView)localObject).setText(paramView);
      paramViewGroup.htT.setChecked(this.htR[paramInt]);
      GMTrace.o(2791728742400L, 20800);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      label385:
      paramViewGroup.htS.setVisibility(8);
      break label281;
      label397:
      localObject = localaqf.jio;
      if (localObject != null)
      {
        paramView = (View)localObject;
        if (((String)localObject).length() > 0) {
          break label309;
        }
      }
      localObject = new o(localaqf.kAW).toString();
      if (localObject != null)
      {
        paramView = (View)localObject;
        if (((String)localObject).length() > 0) {
          break label309;
        }
      }
      localObject = localaqf.tUp;
      if (localObject != null)
      {
        paramView = (View)localObject;
        if (((String)localObject).length() > 0) {
          break label309;
        }
      }
      label476:
      paramView = "";
      break label309;
      label482:
      if (localaqf.uxU == 2)
      {
        paramView = localaqf.jhi;
      }
      else
      {
        if (localaqf.uxU == 1)
        {
          paramView = localaqf.jhi;
          if (!bg.nm(paramView))
          {
            paramView = paramView.split("@");
            if ((paramView == null) || (paramView.length < 2) || (bg.nm(paramView[0])))
            {
              paramView = "";
              continue;
            }
            paramView = "@" + paramView[0];
            continue;
          }
        }
        label576:
        paramView = "";
      }
    }
  }
  
  public final void hK(int paramInt)
  {
    GMTrace.i(2790923436032L, 20794);
    if ((paramInt < 0) || (paramInt >= this.htR.length))
    {
      GMTrace.o(2790923436032L, 20794);
      return;
    }
    boolean[] arrayOfBoolean = this.htR;
    if (this.htR[paramInt] == 0) {}
    for (int i = 1;; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      super.notifyDataSetChanged();
      GMTrace.o(2790923436032L, 20794);
      return;
    }
  }
  
  static final class a
  {
    TextView htS;
    CheckBox htT;
    TextView jUm;
    TextView jtr;
    int type;
    TextView xbC;
    
    a()
    {
      GMTrace.i(2797634322432L, 20844);
      GMTrace.o(2797634322432L, 20844);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */