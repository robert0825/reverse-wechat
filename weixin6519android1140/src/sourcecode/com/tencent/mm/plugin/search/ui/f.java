package com.tencent.mm.plugin.search.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.br.a;
import com.tencent.mm.protocal.c.ayh;
import com.tencent.mm.protocal.c.azj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends LinearLayout
  implements View.OnClickListener
{
  String eQb;
  String hSv;
  private TextView hqi;
  private List<View> oCN;
  b oCO;
  List<azj> oCP;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(19510828466176L, 145367);
    this.hqi = null;
    this.oCN = new LinkedList();
    this.oCO = null;
    this.eQb = null;
    this.hSv = null;
    this.oCP = null;
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19515257651200L, 145400);
        f.a(f.this);
        GMTrace.o(19515257651200L, 145400);
      }
    });
    GMTrace.o(19510828466176L, 145367);
  }
  
  public final boolean a(ayh paramayh, String paramString1, String paramString2)
  {
    GMTrace.i(19511096901632L, 145369);
    if ((paramayh == null) || (paramayh.tRy == null))
    {
      w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas param nil!");
      GMTrace.o(19511096901632L, 145369);
      return false;
    }
    Object localObject = paramayh.tRy;
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      azj localazj = (azj)((Iterator)localObject).next();
      if (!bg.nm(localazj.uNE)) {
        localLinkedList.add(localazj);
      }
    }
    if (localLinkedList.size() <= 0)
    {
      w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas size 0 items!");
      GMTrace.o(19511096901632L, 145369);
      return false;
    }
    this.eQb = paramString2;
    this.hSv = paramString1;
    this.oCP = paramayh.tRy;
    int j;
    if (this.hqi == null)
    {
      this.hqi = new TextView(new ContextThemeWrapper(getContext(), R.m.elY));
      this.hqi.setTextSize(15.0F);
      i = a.fromDPToPix(getContext(), 10);
      j = a.fromDPToPix(getContext(), 2);
      this.hqi.setPadding(0, i, 0, j);
      addView(this.hqi);
    }
    if (!bg.nm(paramayh.eBt)) {
      this.hqi.setText(paramayh.eBt);
    }
    int k;
    for (;;)
    {
      j = (localLinkedList.size() + 1) / 2;
      k = this.oCN.size();
      i = 0;
      while (i < j - k)
      {
        paramayh = View.inflate(getContext(), R.i.cxP, null);
        addView(paramayh);
        this.oCN.add(paramayh);
        paramayh.findViewById(R.h.bKQ).setOnClickListener(this);
        paramayh.findViewById(R.h.bKR).setOnClickListener(this);
        i += 1;
      }
      this.hqi.setText(R.l.dWF);
    }
    paramString1 = this.oCN.iterator();
    int i = 0;
    while (paramString1.hasNext())
    {
      paramString2 = (View)paramString1.next();
      if (i < localLinkedList.size())
      {
        j = 0;
        if (j < 2)
        {
          if (i < localLinkedList.size())
          {
            paramayh = new a((azj)localLinkedList.get(i), i + 1);
            label454:
            k = i % 2;
            switch (k)
            {
            default: 
              w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configItemLinearLayout wrong Index:" + k);
            }
          }
          for (;;)
          {
            i += 1;
            j += 1;
            break;
            paramayh = null;
            break label454;
            k = R.h.bKO;
            for (int m = R.h.bKQ;; m = R.h.bKR)
            {
              if (paramayh != null) {
                break label568;
              }
              paramString2.findViewById(k).setVisibility(8);
              break;
              k = R.h.bKP;
            }
            label568:
            paramString2.findViewById(k).setVisibility(0);
            localObject = (TextView)paramString2.findViewById(m);
            ((TextView)localObject).setText(paramayh.oCR.uNE);
            ((TextView)localObject).setTag(paramayh);
          }
        }
        paramString2.setVisibility(0);
      }
      else
      {
        paramString2.setVisibility(8);
      }
    }
    requestLayout();
    GMTrace.o(19511096901632L, 145369);
    return true;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(19510962683904L, 145368);
    if ((this.oCO != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof a)))
    {
      paramView = (a)paramView.getTag();
      this.oCO.a(paramView.oCR, this.hSv, paramView.position);
    }
    GMTrace.o(19510962683904L, 145368);
  }
  
  private final class a
  {
    public azj oCR;
    public int position;
    
    public a(azj paramazj, int paramInt)
    {
      GMTrace.i(19512573296640L, 145380);
      this.oCR = paramazj;
      this.position = paramInt;
      GMTrace.o(19512573296640L, 145380);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(azj paramazj, String paramString, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */