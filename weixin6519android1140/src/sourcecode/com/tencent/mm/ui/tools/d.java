package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.v;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends BaseAdapter
{
  private Context context;
  private List<c> ePZ;
  private String htH;
  private List<c> mpf;
  int[] mph;
  boolean mpi;
  
  public d(Context paramContext, List<c> paramList)
  {
    GMTrace.i(2013802790912L, 15004);
    this.mpf = new ArrayList();
    this.mpi = false;
    this.context = paramContext;
    this.ePZ = paramList;
    aJj();
    aJk();
    GMTrace.o(2013802790912L, 15004);
  }
  
  private void aJj()
  {
    GMTrace.i(2013937008640L, 15005);
    int i = 0;
    int j = this.ePZ.size();
    while (i < j)
    {
      this.mpf.add(this.ePZ.get(i));
      i += 1;
    }
    GMTrace.o(2013937008640L, 15005);
  }
  
  private void aJk()
  {
    GMTrace.i(2014071226368L, 15006);
    this.mph = new int[this.ePZ.size()];
    int j = this.ePZ.size();
    int i = 0;
    while (i < j)
    {
      this.mph[i] = ((c)this.ePZ.get(i)).mmZ;
      i += 1;
    }
    GMTrace.o(2014071226368L, 15006);
  }
  
  private static String pt(int paramInt)
  {
    GMTrace.i(2014876532736L, 15012);
    if (v.bPI())
    {
      String str = Integer.toString(paramInt) + "劃";
      GMTrace.o(2014876532736L, 15012);
      return str;
    }
    char c = (char)paramInt;
    GMTrace.o(2014876532736L, 15012);
    return String.valueOf(c);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(2014608097280L, 15010);
    if (paramString != null)
    {
      this.htH = paramString.trim();
      this.ePZ.clear();
      int j = this.mpf.size();
      int i = 0;
      while (i < j)
      {
        if ((((c)this.mpf.get(i)).gLy.toUpperCase().contains(this.htH.toUpperCase())) || (((c)this.mpf.get(i)).mna.toUpperCase().contains(this.htH.toUpperCase())) || (((c)this.mpf.get(i)).countryCode.contains(this.htH))) {
          this.ePZ.add(this.mpf.get(i));
        }
        i += 1;
      }
      aJk();
      super.notifyDataSetChanged();
    }
    GMTrace.o(2014608097280L, 15010);
  }
  
  public final int getCount()
  {
    GMTrace.i(2014205444096L, 15007);
    int i = this.ePZ.size();
    GMTrace.o(2014205444096L, 15007);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(2014339661824L, 15008);
    Object localObject = this.ePZ.get(paramInt);
    GMTrace.o(2014339661824L, 15008);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(2014473879552L, 15009);
    long l = paramInt;
    GMTrace.o(2014473879552L, 15009);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2014742315008L, 15011);
    c localc = (c)getItem(paramInt);
    label96:
    int i;
    if (paramView == null) {
      if (!v.bPI())
      {
        paramView = View.inflate(this.context, R.i.cuf, null);
        paramViewGroup = new a();
        paramViewGroup.mpk = ((TextView)paramView.findViewById(R.h.brF));
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
        paramViewGroup.mpl = ((TextView)paramView.findViewById(R.h.brK));
        paramView.setTag(paramViewGroup);
        if (paramInt <= 0) {
          break label214;
        }
        i = this.mph[(paramInt - 1)];
        label110:
        if (paramInt != 0) {
          break label220;
        }
        paramViewGroup.mpk.setVisibility(0);
        paramViewGroup.mpk.setText(pt(this.mph[paramInt]));
        label138:
        paramViewGroup.jtr.setText(localc.gLy);
        paramViewGroup.mpl.setText(localc.countryCode);
        if (!this.mpi) {
          break label274;
        }
        paramViewGroup.mpl.setVisibility(0);
      }
    }
    for (;;)
    {
      GMTrace.o(2014742315008L, 15011);
      return paramView;
      paramView = View.inflate(this.context, R.i.cug, null);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label96;
      label214:
      i = -1;
      break label110;
      label220:
      if ((paramInt > 0) && (this.mph[paramInt] != i))
      {
        paramViewGroup.mpk.setVisibility(0);
        paramViewGroup.mpk.setText(pt(this.mph[paramInt]));
        break label138;
      }
      paramViewGroup.mpk.setVisibility(8);
      break label138;
      label274:
      paramViewGroup.mpl.setVisibility(4);
    }
  }
  
  static final class a
  {
    TextView jtr;
    TextView mpk;
    TextView mpl;
    
    a()
    {
      GMTrace.i(1956223385600L, 14575);
      GMTrace.o(1956223385600L, 14575);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */