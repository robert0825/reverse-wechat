package com.tencent.mm.plugin.ipcall.ui;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends BaseAdapter
{
  private List<a> ePZ;
  private String htH;
  private List<a> mpf;
  private IPCallCountryCodeSelectUI mpg;
  int[] mph;
  boolean mpi;
  boolean mpj;
  
  public f(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI, List<a> paramList)
  {
    GMTrace.i(11693451116544L, 87123);
    this.mpf = new ArrayList();
    this.mpi = false;
    this.mpj = false;
    this.mpg = paramIPCallCountryCodeSelectUI;
    this.ePZ = paramList;
    aJj();
    aJk();
    GMTrace.o(11693451116544L, 87123);
  }
  
  private void aJj()
  {
    GMTrace.i(11693585334272L, 87124);
    int i = 0;
    int j = this.ePZ.size();
    while (i < j)
    {
      this.mpf.add(this.ePZ.get(i));
      i += 1;
    }
    this.mpg.moX.setVisibility(8);
    GMTrace.o(11693585334272L, 87124);
  }
  
  private void aJk()
  {
    GMTrace.i(11693719552000L, 87125);
    this.mph = new int[this.ePZ.size()];
    int j = this.ePZ.size();
    int i = 0;
    while (i < j)
    {
      this.mph[i] = ((a)this.ePZ.get(i)).aIZ();
      i += 1;
    }
    GMTrace.o(11693719552000L, 87125);
  }
  
  private static String pt(int paramInt)
  {
    GMTrace.i(11694524858368L, 87131);
    char c = (char)paramInt;
    String[] arrayOfString = IPCallCountryCodeScrollbar.mpm;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(String.valueOf((char)paramInt)))
      {
        GMTrace.o(11694524858368L, 87131);
        return String.valueOf(c);
      }
      i += 1;
    }
    GMTrace.o(11694524858368L, 87131);
    return "#";
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(11694256422912L, 87129);
    if (paramString != null)
    {
      this.htH = paramString.trim();
      this.ePZ.clear();
      int j = this.mpf.size();
      int i = 0;
      while (i < j)
      {
        if ((((a)this.mpf.get(i)).gLy.toUpperCase().contains(this.htH.toUpperCase())) || (((a)this.mpf.get(i)).mna.toUpperCase().contains(this.htH.toUpperCase())) || (((a)this.mpf.get(i)).countryCode.contains(this.htH))) {
          this.ePZ.add(this.mpf.get(i));
        }
        i += 1;
      }
      aJk();
      if (this.ePZ.size() != 0) {
        break label203;
      }
      this.mpg.moX.setVisibility(0);
    }
    for (;;)
    {
      super.notifyDataSetChanged();
      GMTrace.o(11694256422912L, 87129);
      return;
      label203:
      this.mpg.moX.setVisibility(8);
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(11693853769728L, 87126);
    int i = this.ePZ.size();
    GMTrace.o(11693853769728L, 87126);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(11693987987456L, 87127);
    Object localObject = this.ePZ.get(paramInt);
    GMTrace.o(11693987987456L, 87127);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11694122205184L, 87128);
    long l = paramInt;
    GMTrace.o(11694122205184L, 87128);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11694390640640L, 87130);
    Object localObject = (a)getItem(paramInt);
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.mpg, R.i.cAe, null);
      paramViewGroup = new a();
      paramViewGroup.mpk = ((TextView)paramView.findViewById(R.h.brF));
      paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
      paramViewGroup.mpl = ((TextView)paramView.findViewById(R.h.brK));
      paramView.setTag(paramViewGroup);
      if (paramInt <= 0) {
        break label244;
      }
      i = this.mph[(paramInt - 1)];
      label103:
      if (paramInt != 0) {
        break label269;
      }
      paramViewGroup.mpk.setVisibility(0);
      if (!this.mpj) {
        break label250;
      }
      paramViewGroup.mpk.setText(R.l.dOw);
      label132:
      if (bg.nm(this.htH)) {
        break label323;
      }
      Spannable localSpannable = e.a(((a)localObject).gLy, this.htH);
      paramViewGroup.jtr.setText(localSpannable);
      localObject = e.a(" (+" + ((a)localObject).countryCode + ")", this.htH);
      paramViewGroup.mpl.setText((CharSequence)localObject);
      label208:
      if (!this.mpi) {
        break label370;
      }
      paramViewGroup.mpl.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(11694390640640L, 87130);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label244:
      i = -1;
      break label103;
      label250:
      paramViewGroup.mpk.setText(pt(this.mph[paramInt]));
      break label132;
      label269:
      if ((paramInt > 0) && (this.mph[paramInt] != i))
      {
        paramViewGroup.mpk.setVisibility(0);
        paramViewGroup.mpk.setText(pt(this.mph[paramInt]));
        break label132;
      }
      paramViewGroup.mpk.setVisibility(8);
      break label132;
      label323:
      paramViewGroup.jtr.setText(((a)localObject).gLy);
      paramViewGroup.mpl.setText(" (+" + ((a)localObject).countryCode + ")");
      break label208;
      label370:
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
      GMTrace.i(11705262276608L, 87211);
      GMTrace.o(11705262276608L, 87211);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */