package com.tencent.mm.modelfriend;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends BaseAdapter
{
  private Context context;
  public LinkedList<aly> gCS;
  private LinkedList<aly> gCT;
  public List<String[]> gCU;
  private List<String[]> gCV;
  public int[] gCW;
  private a gCX;
  public com.tencent.mm.ui.applet.b gCY;
  private b.b gCZ;
  int showType;
  
  public j(Context paramContext, a parama, int paramInt)
  {
    GMTrace.i(4416702775296L, 32907);
    this.gCS = new LinkedList();
    this.gCT = new LinkedList();
    this.gCV = new LinkedList();
    this.showType = 1;
    this.gCY = new com.tencent.mm.ui.applet.b(new b.a()
    {
      public final Bitmap jP(String paramAnonymousString)
      {
        GMTrace.i(4454820610048L, 33191);
        paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
        GMTrace.o(4454820610048L, 33191);
        return paramAnonymousString;
      }
    });
    this.gCZ = null;
    this.context = paramContext;
    this.showType = paramInt;
    this.gCX = parama;
    this.gCW = new int[this.gCS.size()];
    GMTrace.o(4416702775296L, 32907);
  }
  
  private void a(aly paramaly, String[] paramArrayOfString)
  {
    GMTrace.i(4417642299392L, 32914);
    Iterator localIterator = this.gCT.iterator();
    while (localIterator.hasNext())
    {
      aly localaly = (aly)localIterator.next();
      if ((localaly.oqQ != null) && (paramaly.oqQ != null) && (localaly.oqQ.equals(paramaly.oqQ)))
      {
        w.d("MicroMsg.FriendAdapter", "tigerreg mobile already added");
        GMTrace.o(4417642299392L, 32914);
        return;
      }
    }
    this.gCT.add(paramaly);
    paramaly = paramArrayOfString[2];
    paramArrayOfString = paramArrayOfString[1];
    this.gCV.add(new String[] { paramaly, paramArrayOfString });
    GMTrace.o(4417642299392L, 32914);
  }
  
  public final int Hi()
  {
    int k = 0;
    GMTrace.i(4416836993024L, 32908);
    int[] arrayOfInt = this.gCW;
    int m = arrayOfInt.length;
    int j = 0;
    if (j < m)
    {
      int n = arrayOfInt[j];
      int i;
      if (this.showType == 1)
      {
        i = k;
        if (n == 1) {
          i = k + 1;
        }
      }
      for (;;)
      {
        j += 1;
        k = i;
        break;
        i = k;
        if (this.showType == 2)
        {
          i = k;
          if (n == 2) {
            i = k + 1;
          }
        }
      }
    }
    GMTrace.o(4416836993024L, 32908);
    return k;
  }
  
  public final boolean Hj()
  {
    GMTrace.i(4416971210752L, 32909);
    if ((this.gCW == null) || (this.gCW.length == 0))
    {
      GMTrace.o(4416971210752L, 32909);
      return false;
    }
    int i = 0;
    while (i < this.gCW.length)
    {
      int j = this.gCW[i];
      if (this.showType == 1)
      {
        if (j == 0)
        {
          GMTrace.o(4416971210752L, 32909);
          return false;
        }
      }
      else if ((this.showType == 2) && (j == 0))
      {
        GMTrace.o(4416971210752L, 32909);
        return false;
      }
      i += 1;
    }
    GMTrace.o(4416971210752L, 32909);
    return true;
  }
  
  public final void bv(boolean paramBoolean)
  {
    GMTrace.i(4417239646208L, 32911);
    int i;
    int[] arrayOfInt;
    int j;
    if (this.showType == 1)
    {
      i = 0;
      if (i < this.gCW.length)
      {
        arrayOfInt = this.gCW;
        if (paramBoolean) {}
        for (j = 1;; j = 0)
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
    }
    else if (this.showType == 2)
    {
      i = 0;
      if (i < this.gCW.length)
      {
        arrayOfInt = this.gCW;
        if (paramBoolean) {}
        for (j = 2;; j = 0)
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
    }
    notifyDataSetChanged();
    GMTrace.o(4417239646208L, 32911);
  }
  
  public final void e(LinkedList<aly> paramLinkedList)
  {
    GMTrace.i(4417508081664L, 32913);
    if (paramLinkedList != null)
    {
      this.gCT.clear();
      this.gCS.clear();
      this.gCV.clear();
      Iterator localIterator1 = this.gCU.iterator();
      while (localIterator1.hasNext())
      {
        String[] arrayOfString = (String[])localIterator1.next();
        Iterator localIterator2 = paramLinkedList.iterator();
        while (localIterator2.hasNext())
        {
          aly localaly = (aly)localIterator2.next();
          if (this.showType == 1)
          {
            if (((localaly.jhA == 1) || (localaly.jhA == 0)) && (!bg.nm(arrayOfString[2])) && (localaly.oqQ.equals(g.n(arrayOfString[2].getBytes())))) {
              a(localaly, arrayOfString);
            }
          }
          else if ((this.showType == 2) && (localaly.jhA == 2) && (!bg.nm(arrayOfString[2])) && (localaly.oqQ.equals(g.n(arrayOfString[2].getBytes())))) {
            a(localaly, arrayOfString);
          }
        }
      }
    }
    this.gCW = new int[this.gCT.size()];
    this.gCS.addAll(this.gCT);
    this.gCT.clear();
    GMTrace.o(4417508081664L, 32913);
  }
  
  public final void ga(int paramInt)
  {
    GMTrace.i(4417105428480L, 32910);
    if (this.showType == 1) {
      this.gCW[paramInt] = 1;
    }
    for (;;)
    {
      notifyDataSetChanged();
      GMTrace.o(4417105428480L, 32910);
      return;
      if (this.showType == 2) {
        this.gCW[paramInt] = 2;
      }
    }
  }
  
  public final aly gb(int paramInt)
  {
    GMTrace.i(4417910734848L, 32916);
    aly localaly = (aly)this.gCS.get(paramInt);
    GMTrace.o(4417910734848L, 32916);
    return localaly;
  }
  
  public final int getCount()
  {
    GMTrace.i(4417776517120L, 32915);
    int i = this.gCS.size();
    GMTrace.o(4417776517120L, 32915);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4418044952576L, 32917);
    long l = ((aly)this.gCS.get(paramInt)).hashCode();
    GMTrace.o(4418044952576L, 32917);
    return l;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4418179170304L, 32918);
    if (this.showType == 1)
    {
      if (this.gCZ == null) {
        this.gCZ = new b.b()
        {
          public final int Hk()
          {
            GMTrace.i(4439922442240L, 33080);
            int i = j.this.getCount();
            GMTrace.o(4439922442240L, 33080);
            return i;
          }
          
          public final String gc(int paramAnonymousInt)
          {
            GMTrace.i(4439788224512L, 33079);
            if ((paramAnonymousInt < 0) || (paramAnonymousInt >= j.this.getCount()))
            {
              w.e("MicroMsg.FriendAdapter", "pos is invalid");
              GMTrace.o(4439788224512L, 33079);
              return null;
            }
            Object localObject = j.this.gb(paramAnonymousInt);
            if (localObject == null)
            {
              GMTrace.o(4439788224512L, 33079);
              return null;
            }
            localObject = ((aly)localObject).jhi;
            GMTrace.o(4439788224512L, 33079);
            return (String)localObject;
          }
        };
      }
      if (this.gCY != null) {
        this.gCY.a(paramInt, this.gCZ);
      }
    }
    aly localaly = (aly)this.gCS.get(paramInt);
    b localb;
    if (paramView == null)
    {
      localb = new b();
      if (this.showType == 1)
      {
        paramView = View.inflate(this.context, R.i.cwZ, null);
        localb.gDd = ((TextView)paramView.findViewById(R.h.bNI));
        localb.gDe = ((TextView)paramView.findViewById(R.h.bNB));
        localb.gDf = ((Button)paramView.findViewById(R.h.bNC));
        localb.gDg = ((Button)paramView.findViewById(R.h.bNE));
        localb.gDc = ((ImageView)paramView.findViewById(R.h.bBU));
        localb.gDh = ((TextView)paramView.findViewById(R.h.bNJ));
        localb.gDi = ((TextView)paramView.findViewById(R.h.bNM));
        paramView.setTag(localb);
        paramViewGroup = localb;
        paramViewGroup.gDi.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(4429050806272L, 32999);
            paramAnonymousView = j.this;
            int i = paramInt;
            if (paramAnonymousView.showType == 1) {
              paramAnonymousView.gCW[i] = 0;
            }
            for (;;)
            {
              paramAnonymousView.notifyDataSetChanged();
              GMTrace.o(4429050806272L, 32999);
              return;
              if (paramAnonymousView.showType == 2) {
                paramAnonymousView.gCW[i] = 0;
              }
            }
          }
        });
        if (this.showType != 1) {
          break label531;
        }
        if (bg.nm(((String[])this.gCV.get(paramInt))[1])) {
          break label490;
        }
        paramViewGroup.gDd.setText(((String[])this.gCV.get(paramInt))[1]);
        label281:
        paramViewGroup.gDf.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(4442338361344L, 33098);
            j.this.ga(paramInt);
            GMTrace.o(4442338361344L, 33098);
          }
        });
        a.b.a(paramViewGroup.gDc, localaly.jhi);
        label309:
        switch (this.gCW[paramInt])
        {
        }
      }
    }
    for (;;)
    {
      GMTrace.o(4418179170304L, 32918);
      return paramView;
      paramViewGroup = localb;
      if (this.showType != 2) {
        break;
      }
      paramView = View.inflate(this.context, R.i.cxa, null);
      localb.gDd = ((TextView)paramView.findViewById(R.h.bNI));
      localb.gDe = ((TextView)paramView.findViewById(R.h.bNB));
      localb.gDf = ((Button)paramView.findViewById(R.h.bNC));
      localb.gDg = ((Button)paramView.findViewById(R.h.bNE));
      localb.gDh = ((TextView)paramView.findViewById(R.h.bNJ));
      localb.gDi = ((TextView)paramView.findViewById(R.h.bNM));
      paramView.setTag(localb);
      paramViewGroup = localb;
      break;
      paramViewGroup = (b)paramView.getTag();
      break;
      label490:
      if (bg.nm(localaly.jio))
      {
        paramViewGroup.gDd.setText(localaly.jhi);
        break label281;
      }
      paramViewGroup.gDd.setText(localaly.jio);
      break label281;
      label531:
      if (this.showType != 2) {
        break label309;
      }
      paramViewGroup.gDd.setText(((String[])this.gCV.get(paramInt))[1]);
      paramViewGroup.gDg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4444485844992L, 33114);
          j.this.ga(paramInt);
          GMTrace.o(4444485844992L, 33114);
        }
      });
      break label309;
      paramViewGroup.gDf.setVisibility(8);
      paramViewGroup.gDe.setVisibility(0);
      paramViewGroup.gDh.setVisibility(0);
      paramViewGroup.gDi.setVisibility(0);
      continue;
      paramViewGroup.gDf.setVisibility(8);
      paramViewGroup.gDe.setVisibility(0);
      paramViewGroup.gDh.setVisibility(0);
      paramViewGroup.gDi.setVisibility(0);
      continue;
      paramViewGroup.gDf.setVisibility(8);
      paramViewGroup.gDg.setVisibility(8);
      paramViewGroup.gDe.setVisibility(0);
      paramViewGroup.gDh.setVisibility(0);
      paramViewGroup.gDi.setVisibility(0);
      continue;
      if (this.showType == 1)
      {
        paramViewGroup.gDe.setVisibility(8);
        paramViewGroup.gDf.setVisibility(0);
        paramViewGroup.gDg.setVisibility(8);
        paramViewGroup.gDh.setVisibility(8);
        paramViewGroup.gDi.setVisibility(8);
      }
      else if (this.showType == 2)
      {
        paramViewGroup.gDe.setVisibility(8);
        paramViewGroup.gDf.setVisibility(8);
        paramViewGroup.gDg.setVisibility(0);
        paramViewGroup.gDh.setVisibility(8);
        paramViewGroup.gDi.setVisibility(8);
      }
    }
  }
  
  public final void jO(String paramString)
  {
    GMTrace.i(4418313388032L, 32919);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.gCV.size())
    {
      if (this.gCW[i] == 2) {
        localArrayList.add(((String[])this.gCV.get(i))[0]);
      }
      i += 1;
    }
    paramString = new z(paramString, localArrayList);
    at.wS().a(paramString, 0);
    GMTrace.o(4418313388032L, 32919);
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(4417373863936L, 32912);
    super.notifyDataSetChanged();
    if (this.gCX != null) {
      this.gCX.notifyDataSetChanged();
    }
    GMTrace.o(4417373863936L, 32912);
  }
  
  public static abstract interface a
  {
    public abstract void notifyDataSetChanged();
  }
  
  static final class b
  {
    ImageView gDc;
    TextView gDd;
    TextView gDe;
    Button gDf;
    Button gDg;
    TextView gDh;
    TextView gDi;
    
    b()
    {
      GMTrace.i(4436298563584L, 33053);
      GMTrace.o(4436298563584L, 33053);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */