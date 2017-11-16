package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;

public final class w
  extends i
{
  private View jKH;
  private View jKI;
  
  public w()
  {
    GMTrace.i(4993704787968L, 37206);
    GMTrace.o(4993704787968L, 37206);
  }
  
  public final void MP()
  {
    GMTrace.i(4993839005696L, 37207);
    GMTrace.o(4993839005696L, 37207);
  }
  
  public final void amM()
  {
    GMTrace.i(4994107441152L, 37209);
    if (this.jKH != null) {
      this.jKH.setVisibility(8);
    }
    if (this.jKI != null) {
      this.jKI.setVisibility(8);
    }
    GMTrace.o(4994107441152L, 37209);
  }
  
  public final void update()
  {
    GMTrace.i(4993973223424L, 37208);
    b localb = this.jKl.alv();
    g localg = this.jKl.alA();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if ((localb.ajw().tZg != null) && (localb.ajw().tZg.size() > 1))
    {
      if (this.jKH == null) {
        this.jKH = ((ViewStub)findViewById(R.h.bls)).inflate();
      }
      if (this.jKI != null) {
        this.jKI.setVisibility(8);
      }
      localObject1 = this.jKl.aly();
      localObject2 = this.jKH;
      localObject3 = this.jKl.alz();
      LinkedList localLinkedList = localb.ajw().tZg;
      int j = l.uD(localb.ajv().gjg);
      ((ViewGroup)localObject2).removeAllViews();
      Iterator localIterator = localLinkedList.iterator();
      label368:
      while (localIterator.hasNext())
      {
        Object localObject4 = (np)localIterator.next();
        View localView = v.fb((Context)localObject1).inflate(R.i.crt, (ViewGroup)localObject2, false);
        localView.setId(R.h.blt);
        localView.setTag(Integer.valueOf(localLinkedList.indexOf(localObject4)));
        localView.setOnClickListener((View.OnClickListener)localObject3);
        if (TextUtils.isEmpty(((np)localObject4).url)) {
          localView.setEnabled(false);
        }
        ((TextView)localView.findViewById(R.h.caX)).setText(((np)localObject4).title);
        TextView localTextView = (TextView)localView.findViewById(R.h.caU);
        localTextView.setText(((np)localObject4).jxI);
        localTextView.setTextColor(j);
        ((ViewGroup)localObject2).addView(localView);
        if (localLinkedList.indexOf(localObject4) + 1 != localLinkedList.size()) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label368;
          }
          localObject4 = v.fb((Context)localObject1).inflate(R.i.cru, (ViewGroup)localObject2, false);
          ((ViewGroup)localObject2).addView((View)localObject4);
          break;
        }
      }
      if ((localb.ajc()) && (localb.ajw().tZn != null) && (!TextUtils.isEmpty(localb.ajw().tZn.title))) {
        this.jKH.setBackgroundResource(R.g.aXW);
      }
      if ((!localb.ajc()) && (localg.amz()))
      {
        this.jKH.setBackgroundResource(R.g.aXW);
        GMTrace.o(4993973223424L, 37208);
      }
    }
    else if ((localb.ajw().tZg != null) && (localb.ajw().tZg.size() == 1))
    {
      if (this.jKI == null) {
        this.jKI = ((ViewStub)findViewById(R.h.blr)).inflate();
      }
      if (this.jKH != null) {
        this.jKH.setVisibility(8);
      }
      localObject1 = this.jKI;
      localObject2 = this.jKl.alz();
      localObject3 = localb.ajw().tZg;
      if (((LinkedList)localObject3).size() == 1)
      {
        ((View)localObject1).findViewById(R.h.blu).setVisibility(0);
        localObject3 = (np)((LinkedList)localObject3).get(0);
        ((TextView)((View)localObject1).findViewById(R.h.caY)).setText(((np)localObject3).title);
        ((TextView)((View)localObject1).findViewById(R.h.caV)).setText(((np)localObject3).jxI);
        i = l.uD(localb.ajv().gjg);
        ((TextView)((View)localObject1).findViewById(R.h.caV)).setTextColor(i);
        ((View)localObject1).findViewById(R.h.blu).setOnClickListener((View.OnClickListener)localObject2);
        if (TextUtils.isEmpty(((np)localObject3).url)) {
          ((View)localObject1).findViewById(R.h.blu).setEnabled(false);
        }
      }
      if ((localb.ajc()) && (localb.ajw().tZn != null) && (!TextUtils.isEmpty(localb.ajw().tZn.title))) {
        this.jKI.setBackgroundResource(R.g.aXW);
      }
      if ((!localb.ajc()) && (localg.amz()))
      {
        this.jKI.setBackgroundResource(R.g.aXW);
        GMTrace.o(4993973223424L, 37208);
      }
    }
    else
    {
      if (this.jKH != null) {
        this.jKH.setVisibility(8);
      }
      if (this.jKI != null) {
        this.jKI.setVisibility(8);
      }
    }
    GMTrace.o(4993973223424L, 37208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */