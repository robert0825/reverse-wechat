package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;

public final class dc
  extends o<au>
{
  private String eDs;
  private String gtf;
  private String jtg;
  public a wAH;
  private boolean wqK;
  
  public dc(Context paramContext, au paramau, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, paramau);
    GMTrace.i(2485041233920L, 18515);
    this.eDs = paramString1;
    this.gtf = paramString2;
    this.wqK = paramBoolean;
    GMTrace.o(2485041233920L, 18515);
  }
  
  private String ay(au paramau)
  {
    GMTrace.i(2485443887104L, 18518);
    if (paramau.field_isSend == 1)
    {
      paramau = this.gtf;
      GMTrace.o(2485443887104L, 18518);
      return paramau;
    }
    paramau = this.eDs;
    GMTrace.o(2485443887104L, 18518);
    return paramau;
  }
  
  private CharSequence az(au paramau)
  {
    GMTrace.i(2485846540288L, 18521);
    if (paramau.field_createTime == Long.MAX_VALUE)
    {
      GMTrace.o(2485846540288L, 18521);
      return "";
    }
    paramau = n.c(this.context, paramau.field_createTime, true);
    GMTrace.o(2485846540288L, 18521);
    return paramau;
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(2485309669376L, 18517);
    this.jtg = paramString;
    if (!t.nm(this.jtg))
    {
      aJe();
      QF();
    }
    GMTrace.o(2485309669376L, 18517);
  }
  
  public final void QF()
  {
    GMTrace.i(2485578104832L, 18519);
    at.AR();
    setCursor(com.tencent.mm.y.c.yM().cT(this.eDs, this.jtg));
    if ((this.wAH != null) && (!t.nm(this.jtg))) {
      this.wAH.CL(getCount());
    }
    super.notifyDataSetChanged();
    GMTrace.o(2485578104832L, 18519);
  }
  
  protected final void QG()
  {
    GMTrace.i(2485712322560L, 18520);
    aJe();
    QF();
    GMTrace.o(2485712322560L, 18520);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2485175451648L, 18516);
    Object localObject;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.cFt, null);
      paramViewGroup = new b();
      paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
      paramViewGroup.jpV = ((TextView)paramView.findViewById(R.h.bQX));
      paramViewGroup.jpW = ((TextView)paramView.findViewById(R.h.cjq));
      paramViewGroup.wAI = ((TextView)paramView.findViewById(R.h.bOG));
      paramView.setTag(paramViewGroup);
      localObject = (au)getItem(paramInt);
      if (localObject != null)
      {
        if ((!this.wqK) || (((ce)localObject).field_isSend != 0)) {
          break label246;
        }
        String str1 = ((ce)localObject).field_content;
        String str2 = bc.gP(str1);
        if (!t.nm(str2))
        {
          a.b.a(paramViewGroup.hqG, str2);
          paramViewGroup.jpV.setText(h.b(this.context, r.fs(str2), paramViewGroup.jpV.getTextSize()));
        }
        paramViewGroup.jpW.setText(az((au)localObject));
        localObject = bc.gQ(str1);
        paramViewGroup.wAI.setText(h.b(this.context, (CharSequence)localObject, paramViewGroup.wAI.getTextSize()));
      }
    }
    for (;;)
    {
      GMTrace.o(2485175451648L, 18516);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      label246:
      a.b.a(paramViewGroup.hqG, ay((au)localObject));
      paramViewGroup.jpV.setText(h.b(this.context, r.fs(ay((au)localObject)), paramViewGroup.jpV.getTextSize()));
      paramViewGroup.jpW.setText(az((au)localObject));
      paramViewGroup.wAI.setText(h.b(this.context, ((ce)localObject).field_content, paramViewGroup.wAI.getTextSize()));
    }
  }
  
  public static abstract interface a
  {
    public abstract void CL(int paramInt);
  }
  
  private static final class b
  {
    public ImageView hqG;
    public TextView jpV;
    public TextView jpW;
    public TextView wAI;
    
    public b()
    {
      GMTrace.i(2401155153920L, 17890);
      GMTrace.o(2401155153920L, 17890);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */