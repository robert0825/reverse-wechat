package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.m;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class i
  extends BaseAdapter
{
  private Context mContext;
  private c nJB;
  LinkedList<m> nKm;
  AdapterView.OnItemClickListener nKn;
  
  public i(Context paramContext)
  {
    GMTrace.i(6022483673088L, 44871);
    this.mContext = paramContext;
    com.tencent.mm.plugin.product.a.a.aWW();
    this.nJB = com.tencent.mm.plugin.product.a.a.aWX();
    GMTrace.o(6022483673088L, 44871);
  }
  
  private m sx(int paramInt)
  {
    GMTrace.i(6022752108544L, 44873);
    m localm = (m)this.nKm.get(paramInt);
    GMTrace.o(6022752108544L, 44873);
    return localm;
  }
  
  public final int getCount()
  {
    GMTrace.i(6022617890816L, 44872);
    if (this.nKm != null)
    {
      int i = this.nKm.size();
      GMTrace.o(6022617890816L, 44872);
      return i;
    }
    GMTrace.o(6022617890816L, 44872);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6022886326272L, 44874);
    long l = paramInt;
    GMTrace.o(6022886326272L, 44874);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6023020544000L, 44875);
    m localm = sx(paramInt);
    Object localObject2;
    Object localObject1;
    label169:
    int i;
    float f1;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new a();
      paramView = View.inflate(this.mContext, a.g.sOa, null);
      paramViewGroup.nKo = ((TextView)paramView.findViewById(a.f.sBP));
      paramViewGroup.nKp = ((MaxGridView)paramView.findViewById(a.f.sBN));
      paramViewGroup.nKq = new j(this.mContext);
      paramView.setTag(paramViewGroup);
      paramViewGroup.nKo.setText(localm.nIP);
      paramViewGroup.nKp.setOnItemClickListener(this.nKn);
      localObject2 = paramViewGroup.nKq;
      localObject1 = this.nJB;
      Object localObject3 = localm.nIO;
      if (!((c)localObject1).nHO.containsKey(localObject3)) {
        break label310;
      }
      localObject1 = (String)((c)localObject1).nHO.get(localObject3);
      ((j)localObject2).nKs = localm;
      ((j)localObject2).nKt = ((String)localObject1);
      localObject1 = this.mContext;
      localObject3 = localm.nIQ;
      i = ((Context)localObject1).getResources().getDisplayMetrics().widthPixels - com.tencent.mm.br.a.fromDPToPix((Context)localObject1, 16) * 2;
      localObject2 = ((TextView)((LayoutInflater)((Context)localObject1).getSystemService("layout_inflater")).inflate(a.g.sNZ, null)).getPaint();
      f1 = 0.0F;
      localObject3 = ((LinkedList)localObject3).iterator();
      label254:
      if (!((Iterator)localObject3).hasNext()) {
        break label316;
      }
      float f2 = ((TextPaint)localObject2).measureText(((h)((Iterator)localObject3).next()).name);
      if (f1 >= f2) {
        break label526;
      }
      f1 = f2;
    }
    label310:
    label316:
    label526:
    for (;;)
    {
      break label254;
      paramViewGroup = (a)paramView.getTag();
      break;
      localObject1 = null;
      break label169;
      int j = (int)f1;
      int k = com.tencent.mm.br.a.fromDPToPix((Context)localObject1, 10);
      localObject2 = new int[4];
      int m = com.tencent.mm.br.a.fromDPToPix((Context)localObject1, 12);
      paramInt = 0;
      while (paramInt < 4)
      {
        localObject2[paramInt] = ((i - m * paramInt) / (paramInt + 1));
        paramInt += 1;
      }
      paramInt = 4;
      if (paramInt > 0) {
        if (j + k * 2 >= localObject2[(paramInt - 1)]) {}
      }
      for (localObject1 = new Pair(Integer.valueOf(paramInt), Integer.valueOf(localObject2[(paramInt - 1)]));; localObject1 = new Pair(Integer.valueOf(1), Integer.valueOf(i)))
      {
        w.d("MicroMsg.MallProductImageAdapter", localm.nIP + " numColumns = " + localObject1);
        paramViewGroup.nKp.setColumnWidth(((Integer)((Pair)localObject1).second).intValue());
        paramViewGroup.nKq.notifyDataSetChanged();
        paramViewGroup.nKp.setAdapter(paramViewGroup.nKq);
        GMTrace.o(6023020544000L, 44875);
        return paramView;
        paramInt -= 1;
        break;
      }
    }
  }
  
  final class a
  {
    public TextView nKo;
    public MaxGridView nKp;
    public j nKq;
    
    a()
    {
      GMTrace.i(6034563268608L, 44961);
      this.nKo = null;
      this.nKp = null;
      this.nKq = null;
      GMTrace.o(6034563268608L, 44961);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */