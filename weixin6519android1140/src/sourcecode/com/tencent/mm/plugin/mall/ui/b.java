package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
  extends BaseAdapter
{
  private LayoutInflater CJ;
  private Context mContext;
  private final int mRB;
  private final int mRC;
  List<ArrayList<c>> mRD;
  d mRE;
  private boolean mRF;
  int mRG;
  int mRH;
  boolean mRI;
  private boolean mRJ;
  SparseArray<String> mRh;
  int mRi;
  
  public b(Context paramContext, int paramInt)
  {
    GMTrace.i(8000584548352L, 59609);
    this.mRB = 3;
    this.mRC = 9;
    this.mRD = new ArrayList();
    this.mRh = null;
    this.mRF = true;
    this.mRG = 0;
    this.mRH = 0;
    this.mRI = false;
    this.mRJ = false;
    this.mContext = paramContext;
    this.mRi = paramInt;
    this.CJ = LayoutInflater.from(this.mContext);
    GMTrace.o(8000584548352L, 59609);
  }
  
  private void a(View paramView, c paramc)
  {
    GMTrace.i(8001389854720L, 59615);
    if (paramView == null)
    {
      GMTrace.o(8001389854720L, 59615);
      return;
    }
    a locala = (a)paramView.getTag();
    final MallFunction localMallFunction = paramc.mSe;
    final int i = paramc.mSf;
    locala.mRT = localMallFunction.mRT;
    locala.mRS = localMallFunction.mRS;
    com.tencent.mm.plugin.mall.b.a.f(locala.mRO, locala.mRS, a.h.sQN);
    locala.mRQ.setText(localMallFunction.eVy);
    locala.mRP.setVisibility(8);
    if ((localMallFunction.rjL != null) && (!bg.nm(localMallFunction.rjL.rjU)) && (b(localMallFunction)))
    {
      if (d.bzm().Kp(localMallFunction.odH) != null)
      {
        w.w("MicroMsg.FunctionListAdapter", "show the news : " + d.bzm().Kp(localMallFunction.odH).rjU);
        locala.mRR.setText(localMallFunction.rjL.rjU);
        locala.mRR.setVisibility(0);
      }
      for (;;)
      {
        com.tencent.mm.plugin.mall.b.a.j(locala.mRP, locala.mRT);
        locala.mRP.setVisibility(0);
        paramc = localMallFunction.odH;
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(15052383977472L, 112149);
            w.v("MicroMsg.FunctionListAdapter", "on Click");
            if (b.c(b.this) != null) {
              b.c(b.this).a(i, localMallFunction);
            }
            GMTrace.o(15052383977472L, 112149);
          }
        });
        locala.mRN.setVisibility(0);
        paramView.setEnabled(true);
        paramView.setClickable(true);
        locala.mRV.setVisibility(0);
        locala.mRW.setVisibility(0);
        GMTrace.o(8001389854720L, 59615);
        return;
        locala.mRR.setVisibility(4);
      }
    }
    if ((localMallFunction.rjL != null) && (localMallFunction.rjL.rjZ == 1))
    {
      locala.mRR.setText(localMallFunction.rjL.rjU);
      locala.mRR.setVisibility(0);
    }
    for (;;)
    {
      locala.mRP.setImageBitmap(null);
      locala.mRP.setVisibility(8);
      break;
      locala.mRR.setText("");
      locala.mRR.setVisibility(4);
    }
  }
  
  private static void a(a parama)
  {
    GMTrace.i(16144782065664L, 120288);
    parama.mRV.setVisibility(4);
    GMTrace.o(16144782065664L, 120288);
  }
  
  public static boolean a(MallFunction paramMallFunction)
  {
    GMTrace.i(8001255636992L, 59614);
    if ((paramMallFunction.rjL != null) && (!bg.nm(paramMallFunction.rjL.rjU)) && (b(paramMallFunction)) && (d.bzm().Kp(paramMallFunction.odH) != null))
    {
      GMTrace.o(8001255636992L, 59614);
      return true;
    }
    GMTrace.o(8001255636992L, 59614);
    return false;
  }
  
  private static boolean b(MallFunction paramMallFunction)
  {
    GMTrace.i(8001524072448L, 59616);
    Object localObject = d.bzm().Kp(paramMallFunction.odH);
    if ((localObject == null) || (bg.nm(((MallNews)localObject).qrG)) || (!((MallNews)localObject).qrG.equals(paramMallFunction.rjL.qrG)))
    {
      w.d("MicroMsg.FunctionListAdapter", "old news null or should be replaced %s %s", new Object[] { paramMallFunction.rjL.qrG, paramMallFunction.eVy });
      localObject = d.bzm();
      paramMallFunction = paramMallFunction.rjL;
      if (paramMallFunction == null) {
        w.w("MicroMsg.MallNewsManagerNewVersion", "null obj");
      }
      for (;;)
      {
        GMTrace.o(8001524072448L, 59616);
        return true;
        paramMallFunction.rka = ("<sysmsg><mallactivitynew><functionid>" + paramMallFunction.rjT + "</functionid><activityid>" + paramMallFunction.qrG + "</activityid><type>" + paramMallFunction.type + "</type><showflag>" + paramMallFunction.rjR + "</showflag><newsTipFlag>" + paramMallFunction.rjS + "</newsTipFlag></mallactivitynew></sysmsg>;");
        ((d)localObject).rkd.put(paramMallFunction.rjT, paramMallFunction);
        ((d)localObject).aXr();
      }
    }
    if (localObject != null)
    {
      if (!"0".equals(((MallNews)localObject).rjR))
      {
        w.d("MicroMsg.FunctionListAdapter", "still old news or clicked, then should not show");
        GMTrace.o(8001524072448L, 59616);
        return false;
      }
      w.d("MicroMsg.FunctionListAdapter", "still old news and should show");
      GMTrace.o(8001524072448L, 59616);
      return true;
    }
    GMTrace.o(8001524072448L, 59616);
    return false;
  }
  
  final boolean aNc()
  {
    GMTrace.i(17412871159808L, 129736);
    if (this.mRD.size() > 3)
    {
      Object localObject = (ArrayList)this.mRD.get(3);
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        int i = ((c)((ArrayList)localObject).get(0)).mSe.type;
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          c localc = (c)((Iterator)localObject).next();
          if (localc.mSe.type == i) {
            if (a(localc.mSe))
            {
              GMTrace.o(17412871159808L, 129736);
              return true;
            }
          }
        }
      }
    }
    GMTrace.o(17412871159808L, 129736);
    return false;
  }
  
  public final int getCount()
  {
    GMTrace.i(8000718766080L, 59610);
    int i = this.mRD.size();
    GMTrace.o(8000718766080L, 59610);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(8000852983808L, 59611);
    GMTrace.o(8000852983808L, 59611);
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8000987201536L, 59612);
    GMTrace.o(8000987201536L, 59612);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8001121419264L, 59613);
    int j;
    int i;
    if (this.mRG > 9)
    {
      j = 0;
      i = 0;
      while (i <= paramInt)
      {
        j += ((ArrayList)this.mRD.get(i)).size();
        i += 1;
      }
      if (paramInt <= this.mRH) {
        if ((j > 9) && (this.mRF)) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      Object localObject;
      if (paramView == null)
      {
        paramView = new b();
        localObject = this.CJ.inflate(a.g.sNi, paramViewGroup, false);
        paramView.mRY = ((LinearLayout)((View)localObject).findViewById(a.f.sAO));
        paramView.mRZ = ((TextView)((View)localObject).findViewById(a.f.sAN));
        paramView.mSa = ((View)localObject).findViewById(a.f.sCs);
        paramView.mSc = ((TextView)((View)localObject).findViewById(a.f.sCt));
        paramView.mSb = ((ImageView)((View)localObject).findViewById(a.f.sCr));
        paramView.mSd = ((View)localObject).findViewById(a.f.sCD);
        paramView.mSa.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8000450330624L, 59608);
            paramAnonymousView = b.this;
            if (!b.a(b.this)) {}
            for (boolean bool = true;; bool = false)
            {
              b.a(paramAnonymousView, bool);
              b.b(b.this);
              b.this.notifyDataSetChanged();
              GMTrace.o(8000450330624L, 59608);
              return;
            }
          }
        });
        ((View)localObject).setTag(paramView);
        paramViewGroup = paramView;
        paramView = (View)localObject;
        label223:
        if ((i == 0) || (!this.mRF)) {
          break label365;
        }
        paramViewGroup.mRZ.setVisibility(8);
        paramViewGroup.mSa.setVisibility(0);
        paramViewGroup.mSb.setImageResource(a.h.sQX);
        paramViewGroup.mSc.setText(this.mContext.getString(a.i.sVt));
        paramViewGroup.mRY.setVisibility(8);
        if ((!this.mRI) || (this.mRJ)) {
          break label353;
        }
        paramViewGroup.mSd.setVisibility(0);
      }
      for (;;)
      {
        GMTrace.o(8001121419264L, 59613);
        return paramView;
        if ((paramInt != this.mRH) || (this.mRF)) {
          break label1112;
        }
        i = 1;
        break;
        paramViewGroup = (b)paramView.getTag();
        break label223;
        label353:
        paramViewGroup.mSd.setVisibility(8);
      }
      label365:
      paramViewGroup.mRY.setVisibility(0);
      List localList = (List)this.mRD.get(paramInt);
      j = ((c)localList.get(0)).mSe.type;
      if (localList.size() > 0)
      {
        j = ((c)localList.get(0)).mSe.type;
        if (this.mRh == null)
        {
          localObject = null;
          if (bg.nm((String)localObject)) {
            break label1107;
          }
          if (paramInt != 0) {
            break label584;
          }
          paramInt = 1;
        }
      }
      for (;;)
      {
        label460:
        if (paramInt != 0)
        {
          paramViewGroup.mRZ.setText((CharSequence)localObject);
          paramViewGroup.mRZ.setVisibility(0);
          label481:
          localObject = paramViewGroup.mRY;
          ((LinearLayout)localObject).setFocusable(true);
          paramInt = 0;
          label495:
          if (paramInt >= 3) {
            break label1007;
          }
          if ((paramInt >= ((LinearLayout)localObject).getChildCount()) || (((LinearLayout)localObject).getChildAt(paramInt) == null)) {
            break label731;
          }
          localView = ((LinearLayout)localObject).getChildAt(paramInt);
          localView.setVisibility(0);
          if (paramInt >= localList.size()) {
            break label667;
          }
          a(localView, (c)localList.get(paramInt));
        }
        for (;;)
        {
          paramInt += 1;
          break label495;
          localObject = (String)this.mRh.get(j);
          break;
          label584:
          if ((((ArrayList)this.mRD.get(paramInt - 1)).size() <= 0) || (j == ((c)((ArrayList)this.mRD.get(paramInt - 1)).get(0)).mSe.type)) {
            break label1107;
          }
          paramInt = 1;
          break label460;
          paramViewGroup.mRZ.setVisibility(8);
          break label481;
          paramViewGroup.mRZ.setVisibility(8);
          break label481;
          label667:
          ((LinearLayout)localObject).getChildAt(paramInt).setFocusable(true);
          ((LinearLayout)localObject).getChildAt(paramInt).setOnClickListener(null);
          locala = (a)((LinearLayout)localObject).getChildAt(paramInt).getTag();
          locala.mRN.setVisibility(8);
          localView.setEnabled(false);
          localView.setClickable(false);
          a(locala);
        }
        label731:
        a locala = new a();
        View localView = this.CJ.inflate(a.g.sNk, (ViewGroup)localObject, false);
        locala.mRN = localView.findViewById(a.f.sAS);
        locala.mRO = ((ImageView)localView.findViewById(a.f.sAR));
        locala.mRQ = ((TextView)localView.findViewById(a.f.sAU));
        locala.mRR = ((TextView)localView.findViewById(a.f.sAQ));
        locala.mRP = ((ImageView)localView.findViewById(a.f.sCI));
        locala.mRU = ((ImageView)localView.findViewById(a.f.sve));
        locala.mRV = ((ImageView)localView.findViewById(a.f.svd));
        locala.mRW = ((ImageView)localView.findViewById(a.f.buE));
        locala.mRX = ((ImageView)localView.findViewById(a.f.svb));
        localView.setTag(locala);
        if (paramInt < localList.size()) {
          a(localView, (c)localList.get(paramInt));
        }
        for (;;)
        {
          ((LinearLayout)localObject).addView(localView, new LinearLayout.LayoutParams(-2, a.aMZ(), 1.0F));
          break;
          localView.setFocusable(true);
          locala = (a)localView.getTag();
          locala.mRN.setVisibility(8);
          localView.setOnClickListener(null);
          localView.setEnabled(false);
          localView.setClickable(false);
          a(locala);
        }
        label1007:
        if (i != 0)
        {
          paramViewGroup.mRZ.setVisibility(8);
          paramViewGroup.mSa.setVisibility(0);
          paramViewGroup.mSb.setImageResource(a.h.sQY);
          if (this.mRF) {
            paramViewGroup.mSc.setText(this.mContext.getString(a.i.sVt));
          }
        }
        for (;;)
        {
          paramViewGroup.mSd.setVisibility(8);
          break;
          paramViewGroup.mSc.setText(this.mContext.getString(a.i.sVs));
          continue;
          paramViewGroup.mSa.setVisibility(8);
        }
        label1107:
        paramInt = 0;
      }
      label1112:
      i = 0;
    }
  }
  
  final class a
  {
    public View mRN;
    public ImageView mRO;
    public ImageView mRP;
    public TextView mRQ;
    public TextView mRR;
    public String mRS;
    public String mRT;
    public ImageView mRU;
    public ImageView mRV;
    public ImageView mRW;
    public ImageView mRX;
    
    a()
    {
      GMTrace.i(8005953257472L, 59649);
      this.mRN = null;
      this.mRO = null;
      this.mRP = null;
      this.mRQ = null;
      this.mRR = null;
      this.mRS = null;
      this.mRT = null;
      this.mRU = null;
      this.mRV = null;
      this.mRW = null;
      this.mRX = null;
      GMTrace.o(8005953257472L, 59649);
    }
  }
  
  final class b
  {
    LinearLayout mRY;
    TextView mRZ;
    View mSa;
    ImageView mSb;
    TextView mSc;
    View mSd;
    
    b()
    {
      GMTrace.i(8005684822016L, 59647);
      this.mSd = null;
      GMTrace.o(8005684822016L, 59647);
    }
  }
  
  final class c
  {
    MallFunction mSe;
    int mSf;
    
    c()
    {
      GMTrace.i(8005819039744L, 59648);
      GMTrace.o(8005819039744L, 59648);
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(int paramInt, MallFunction paramMallFunction);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */