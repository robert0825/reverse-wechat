package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends BaseAdapter
  implements Filterable
{
  private static String TAG;
  private Context mContext;
  private String oeA;
  private AutoCompleteTextView oem;
  private List<String[]> oeq;
  public List<com.tencent.mm.plugin.recharge.model.a> oew;
  public boolean oex;
  private List<com.tencent.mm.plugin.recharge.model.a> oey;
  private MallFormView ofY;
  private b ogL;
  public d ogM;
  public a ogN;
  
  static
  {
    GMTrace.i(7866903691264L, 58613);
    TAG = "MicroMsg.MobileHistoryAdapter";
    GMTrace.o(7866903691264L, 58613);
  }
  
  public d(MallFormView paramMallFormView, List<String[]> paramList)
  {
    GMTrace.i(7864085118976L, 58592);
    this.oew = new ArrayList();
    this.oex = false;
    this.ogM = null;
    this.ogN = null;
    this.mContext = paramMallFormView.getContext();
    this.ofY = paramMallFormView;
    this.oem = ((AutoCompleteTextView)paramMallFormView.oge);
    this.oeq = paramList;
    GMTrace.o(7864085118976L, 58592);
  }
  
  public final void bi(List<com.tencent.mm.plugin.recharge.model.a> paramList)
  {
    try
    {
      GMTrace.i(7864219336704L, 58593);
      this.oey = paramList;
      this.oew.clear();
      this.oex = false;
      notifyDataSetChanged();
      GMTrace.o(7864219336704L, 58593);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(7864487772160L, 58595);
    int i;
    if (this.oex)
    {
      i = this.oew.size();
      GMTrace.o(7864487772160L, 58595);
      return i + 2;
    }
    if (this.oew.size() > 0)
    {
      i = this.oew.size();
      GMTrace.o(7864487772160L, 58595);
      return i + 1;
    }
    GMTrace.o(7864487772160L, 58595);
    return 0;
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(7864353554432L, 58594);
    w.d(TAG, "getFilter");
    if (this.ogL == null) {
      this.ogL = new b((byte)0);
    }
    b localb = this.ogL;
    GMTrace.o(7864353554432L, 58594);
    return localb;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(7864756207616L, 58597);
    long l = paramInt;
    GMTrace.o(7864756207616L, 58597);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(7865024643072L, 58599);
    if (this.oex)
    {
      if (paramInt == 0)
      {
        GMTrace.o(7865024643072L, 58599);
        return 2;
      }
      if (paramInt <= this.oew.size())
      {
        GMTrace.o(7865024643072L, 58599);
        return 0;
      }
      GMTrace.o(7865024643072L, 58599);
      return 3;
    }
    if (paramInt < this.oew.size())
    {
      GMTrace.o(7865024643072L, 58599);
      return 0;
    }
    GMTrace.o(7865024643072L, 58599);
    return 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7864890425344L, 58598);
    switch (getItemViewType(paramInt))
    {
    }
    for (;;)
    {
      GMTrace.o(7864890425344L, 58598);
      return paramView;
      c localc;
      label157:
      com.tencent.mm.plugin.recharge.model.a locala;
      int i;
      label296:
      int j;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(this.mContext, a.g.sOo, null);
        localc = new c();
        localc.oeE = ((TextView)paramViewGroup.findViewById(a.f.sAY));
        localc.hvQ = ((TextView)paramViewGroup.findViewById(a.f.sAX));
        localc.ogQ = ((ImageView)paramViewGroup.findViewById(a.f.sHU));
        paramViewGroup.setTag(localc);
        if ((localc != null) && (localc.ogQ != null))
        {
          if (paramInt != 0) {
            break label380;
          }
          localc.ogQ.setVisibility(0);
        }
        locala = td(paramInt);
        paramView = paramViewGroup;
        if (locala == null) {
          continue;
        }
        paramView = paramViewGroup;
        if (localc == null) {
          continue;
        }
        paramView = paramViewGroup;
        if (localc.oeE == null) {
          continue;
        }
        paramView = paramViewGroup;
        if (localc.hvQ == null) {
          continue;
        }
        paramView = b.Fq(locala.odE);
        w.d(TAG, "record.record " + paramView + ", record.name " + locala.name + "，record.location " + locala.odF);
        if (com.tencent.mm.plugin.recharge.model.a.odC.equals(locala.odG)) {
          break label603;
        }
        paramView = new SpannableStringBuilder(paramView);
        int[] arrayOfInt = locala.odG;
        int k = arrayOfInt.length;
        i = 0;
        if (i >= k) {
          break label410;
        }
        j = arrayOfInt[i];
        if (j >= 0)
        {
          if (j < 7) {
            break label393;
          }
          paramInt = j + 2;
        }
      }
      for (;;)
      {
        paramView.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(a.c.smI)), paramInt, paramInt + 1, 34);
        i += 1;
        break label296;
        localc = (c)paramView.getTag();
        paramViewGroup = paramView;
        break;
        label380:
        localc.ogQ.setVisibility(8);
        break label157;
        label393:
        paramInt = j;
        if (j >= 3) {
          paramInt = j + 1;
        }
      }
      label410:
      localc.oeE.setTextSize(24.0F);
      localc.oeE.setTextColor(this.mContext.getResources().getColor(a.c.aOE));
      localc.hvQ.setTextColor(this.mContext.getResources().getColor(a.c.aOE));
      localc.oeE.setText(paramView);
      label472:
      if ((locala.name != null) && (!bg.nm(locala.name.trim())))
      {
        if (!bg.nm(locala.odF)) {
          localc.hvQ.setText(locala.name + this.mContext.getString(a.i.tfz, new Object[] { locala.odF }));
        }
        for (;;)
        {
          if (!locala.name.equals(this.mContext.getString(a.i.tfF))) {
            break label684;
          }
          localc.hvQ.setTextColor(this.mContext.getResources().getColor(a.c.smG));
          paramView = paramViewGroup;
          break;
          label603:
          localc.oeE.setTextSize(16.0F);
          localc.oeE.setTextColor(this.mContext.getResources().getColor(a.c.aOa));
          localc.hvQ.setTextColor(this.mContext.getResources().getColor(a.c.aOa));
          localc.oeE.setText(paramView);
          break label472;
          localc.hvQ.setText(locala.name);
        }
        label684:
        localc.hvQ.setTextColor(this.mContext.getResources().getColor(a.c.aOB));
        paramView = paramViewGroup;
      }
      else if (!bg.nm(locala.odF))
      {
        localc.hvQ.setText(this.mContext.getString(a.i.tfH) + this.mContext.getString(a.i.tfz, new Object[] { locala.odF }));
        paramView = paramViewGroup;
      }
      else
      {
        localc.hvQ.setText(this.mContext.getString(a.i.tfH));
        paramView = paramViewGroup;
        continue;
        paramView = View.inflate(this.mContext, a.g.sOn, null);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7861669199872L, 58574);
            d.a(d.this).dismissDropDown();
            GMTrace.o(7861669199872L, 58574);
          }
        });
        continue;
        paramView = View.inflate(this.mContext, a.g.sOp, null);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7863682465792L, 58589);
            com.tencent.mm.plugin.recharge.a.a.baj().bi(null);
            d.b(d.this).baC();
            d.this.bi(new LinkedList());
            if (d.c(d.this) != null) {
              d.c(d.this).bat();
            }
            GMTrace.o(7863682465792L, 58589);
          }
        });
        continue;
        paramView = View.inflate(this.mContext, a.g.sOp, null);
        ((TextView)paramView.findViewById(a.f.sFS)).setText(a.i.sWf);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7860998111232L, 58569);
            d.a(d.this).dismissDropDown();
            d.b(d.this).baB();
            GMTrace.o(7860998111232L, 58569);
          }
        });
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(7865158860800L, 58600);
    GMTrace.o(7865158860800L, 58600);
    return 4;
  }
  
  public final com.tencent.mm.plugin.recharge.model.a td(int paramInt)
  {
    com.tencent.mm.plugin.recharge.model.a locala1 = null;
    for (;;)
    {
      try
      {
        GMTrace.i(7864621989888L, 58596);
        if (!this.oex) {
          break label95;
        }
        if (paramInt == 0)
        {
          GMTrace.o(7864621989888L, 58596);
          return locala1;
        }
        if (paramInt <= this.oew.size())
        {
          locala1 = (com.tencent.mm.plugin.recharge.model.a)this.oew.get(paramInt - 1);
          GMTrace.o(7864621989888L, 58596);
          continue;
        }
        GMTrace.o(7864621989888L, 58596);
      }
      finally {}
      continue;
      label95:
      if (paramInt < this.oew.size())
      {
        com.tencent.mm.plugin.recharge.model.a locala2 = (com.tencent.mm.plugin.recharge.model.a)this.oew.get(paramInt);
        GMTrace.o(7864621989888L, 58596);
      }
      else
      {
        GMTrace.o(7864621989888L, 58596);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bat();
  }
  
  private final class b
    extends Filter
  {
    private b()
    {
      GMTrace.i(7875359408128L, 58676);
      GMTrace.o(7875359408128L, 58676);
    }
    
    private static int[] jdMethod_do(String paramString1, String paramString2)
    {
      GMTrace.i(7875762061312L, 58679);
      if (paramString1.equals(paramString2))
      {
        paramString1 = com.tencent.mm.plugin.recharge.model.a.odC;
        GMTrace.o(7875762061312L, 58679);
        return paramString1;
      }
      if ((paramString2 != null) && (paramString1.length() == paramString2.length()))
      {
        int[] arrayOfInt = new int[2];
        int[] tmp52_50 = arrayOfInt;
        tmp52_50[0] = -1;
        int[] tmp56_52 = tmp52_50;
        tmp56_52[1] = -1;
        tmp56_52;
        int j = paramString1.length();
        int i = 0;
        j -= 1;
        int k;
        for (;;)
        {
          k = i;
          if (j <= 0) {
            break;
          }
          k = i;
          if (paramString2.charAt(j) != paramString1.charAt(j))
          {
            i += 1;
            k = i;
            if (i > 2) {
              break;
            }
            arrayOfInt[(i - 1)] = j;
            k = i;
          }
          j -= 1;
          i = k;
        }
        if (k <= 2)
        {
          GMTrace.o(7875762061312L, 58679);
          return arrayOfInt;
        }
      }
      paramString1 = com.tencent.mm.plugin.recharge.model.a.odD;
      GMTrace.o(7875762061312L, 58679);
      return paramString1;
    }
    
    protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
    {
      Filter.FilterResults localFilterResults;
      ArrayList localArrayList;
      Object localObject1;
      try
      {
        GMTrace.i(7875493625856L, 58677);
        localFilterResults = new Filter.FilterResults();
        localArrayList = new ArrayList();
        if (paramCharSequence != null) {}
        for (localObject1 = b.Fp(paramCharSequence.toString()); (((String)localObject1).equals(d.d(d.this))) && (!((String)localObject1).equals("")); localObject1 = "")
        {
          d.a(d.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7862474506240L, 58580);
              d.a(d.this).dismissDropDown();
              GMTrace.o(7862474506240L, 58580);
            }
          });
          GMTrace.o(7875493625856L, 58677);
          return localFilterResults;
        }
        d.a(d.this, (String)localObject1);
        if (d.b(d.this).QW()) {
          break label315;
        }
        if (bg.nm(d.d(d.this))) {
          break label295;
        }
        w.i(d.baD(), "performFiltering1 " + paramCharSequence);
        paramCharSequence = d.e(d.this).iterator();
        while (paramCharSequence.hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
          if (((com.tencent.mm.plugin.recharge.model.a)localObject1).odE.startsWith(d.d(d.this))) {
            localArrayList.add(localObject1);
          }
        }
        bool = false;
      }
      finally {}
      boolean bool;
      label236:
      localFilterResults.count = localArrayList.size();
      localFilterResults.values = localArrayList;
      d.this.oex = bool;
      if (localArrayList.size() == 0) {}
      for (d.b(d.this).ogI = true;; d.b(d.this).ogI = false)
      {
        GMTrace.o(7875493625856L, 58677);
        break;
        label295:
        localArrayList.addAll(d.e(d.this));
        bool = false;
        break label236;
        label315:
        long l = System.currentTimeMillis();
        w.i(d.baD(), "performFiltering2 " + paramCharSequence);
        paramCharSequence = com.tencent.mm.plugin.recharge.a.a.bal();
        if ((paramCharSequence != null) && (((String)localObject1).equals(paramCharSequence.odE)))
        {
          GMTrace.o(7875493625856L, 58677);
          break;
        }
        if ((d.f(d.this) == null) || (d.f(d.this).isEmpty())) {
          d.a(d.this, com.tencent.mm.pluginsdk.a.dC(d.g(d.this)));
        }
        Object localObject2;
        if (d.f(d.this) != null)
        {
          paramCharSequence = d.f(d.this).iterator();
          for (;;)
          {
            if (!paramCharSequence.hasNext()) {
              break label561;
            }
            localObject2 = (String[])paramCharSequence.next();
            String str = b.Fp(localObject2[2]);
            localObject1 = jdMethod_do(d.d(d.this), str);
            if (com.tencent.mm.plugin.recharge.model.a.odC.equals(localObject1))
            {
              GMTrace.o(7875493625856L, 58677);
              break;
            }
            if ((!com.tencent.mm.plugin.recharge.model.a.odD.equals(localObject1)) && (localArrayList.size() < 4))
            {
              localObject2 = new com.tencent.mm.plugin.recharge.model.a(str, localObject2[1], 1);
              ((com.tencent.mm.plugin.recharge.model.a)localObject2).odG = ((int[])localObject1);
              localArrayList.add(localObject2);
            }
          }
        }
        label561:
        paramCharSequence = com.tencent.mm.plugin.recharge.a.a.baj().bak().iterator();
        for (;;)
        {
          if (!paramCharSequence.hasNext()) {
            break label681;
          }
          localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
          localObject2 = b.Fp(((com.tencent.mm.plugin.recharge.model.a)localObject1).odE);
          localObject2 = jdMethod_do(d.d(d.this), (String)localObject2);
          if (com.tencent.mm.plugin.recharge.model.a.odC.equals(localObject2))
          {
            GMTrace.o(7875493625856L, 58677);
            break;
          }
          if ((!com.tencent.mm.plugin.recharge.model.a.odD.equals(localObject2)) && (localArrayList.size() < 4))
          {
            ((com.tencent.mm.plugin.recharge.model.a)localObject1).odG = ((int[])localObject2);
            localArrayList.add(localObject1);
          }
        }
        label681:
        w.d(d.baD(), " search phone number cost " + (System.currentTimeMillis() - l) + " ms ");
        bool = true;
        break label236;
      }
    }
    
    protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
    {
      GMTrace.i(7875627843584L, 58678);
      if (paramFilterResults.values == null) {}
      for (d.this.oew = new ArrayList();; d.this.oew = ((List)paramFilterResults.values))
      {
        w.i(d.baD(), "results.count " + paramFilterResults.count);
        if (paramFilterResults.count > 0) {
          d.this.notifyDataSetChanged();
        }
        GMTrace.o(7875627843584L, 58678);
        return;
      }
    }
  }
  
  private final class c
  {
    TextView hvQ;
    TextView oeE;
    ImageView ogQ;
    
    public c()
    {
      GMTrace.i(7872943489024L, 58658);
      GMTrace.o(7872943489024L, 58658);
    }
  }
  
  public static abstract interface d {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\form\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */