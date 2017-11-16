package com.tencent.mm.plugin.chatroom.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.n;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;

public final class b
  extends RecyclerView.a<b>
  implements com.tencent.mm.plugin.chatroom.ui.b.a
{
  private final Calendar calendar;
  private final TypedArray jMN;
  private final a jMO;
  private final a<com.tencent.mm.plugin.chatroom.d.a> jMP;
  private final Collection<com.tencent.mm.plugin.chatroom.d.a> jMQ;
  private final Integer jMR;
  private final Integer jMS;
  private final boolean jMT;
  private final Context mContext;
  
  public b(Context paramContext, a parama, TypedArray paramTypedArray, long paramLong, Collection<com.tencent.mm.plugin.chatroom.d.a> paramCollection)
  {
    GMTrace.i(9069091880960L, 67570);
    this.jMN = paramTypedArray;
    this.calendar = Calendar.getInstance();
    this.jMS = Integer.valueOf(paramTypedArray.getInt(R.n.enf, this.calendar.get(2) % 12));
    if (-1L != paramLong) {
      this.calendar.setTimeInMillis(paramLong);
    }
    this.jMR = Integer.valueOf(paramTypedArray.getInt(R.n.enc, this.calendar.get(2)));
    this.jMT = paramTypedArray.getBoolean(R.n.eng, false);
    this.jMP = new a();
    this.jMQ = paramCollection;
    this.mContext = paramContext;
    this.jMO = parama;
    if (this.jMN.getBoolean(R.n.emZ, false)) {
      c(new com.tencent.mm.plugin.chatroom.d.a(System.currentTimeMillis()));
    }
    GMTrace.o(9069091880960L, 67570);
  }
  
  private void c(com.tencent.mm.plugin.chatroom.d.a parama)
  {
    GMTrace.i(9069628751872L, 67574);
    this.jMO.a(parama);
    if (this.jMT)
    {
      int i;
      if ((this.jMP.first != null) && (this.jMP.jMU == null))
      {
        this.jMP.jMU = parama;
        if (((com.tencent.mm.plugin.chatroom.d.a)this.jMP.first).month < parama.month) {
          i = 0;
        }
      }
      else
      {
        while (i < ((com.tencent.mm.plugin.chatroom.d.a)this.jMP.first).month - parama.month - 1)
        {
          this.jMO.a(parama);
          i += 1;
          continue;
          if (this.jMP.jMU == null) {
            break label158;
          }
          this.jMP.first = parama;
          this.jMP.jMU = null;
        }
      }
    }
    for (;;)
    {
      this.TS.notifyChanged();
      GMTrace.o(9069628751872L, 67574);
      return;
      label158:
      this.jMP.first = parama;
      continue;
      this.jMP.first = parama;
    }
  }
  
  public final void b(com.tencent.mm.plugin.chatroom.d.a parama)
  {
    GMTrace.i(9069494534144L, 67573);
    if (parama != null) {
      c(parama);
    }
    GMTrace.o(9069494534144L, 67573);
  }
  
  public final int getItemCount()
  {
    GMTrace.i(9069360316416L, 67572);
    int j = (new com.tencent.mm.plugin.chatroom.d.a(this.jMO.ano()).year - this.calendar.get(1) + 1) * 12;
    int i = j;
    if (this.jMR.intValue() != -1) {
      i = j - this.jMR.intValue();
    }
    j = i;
    if (this.jMS.intValue() != -1) {
      j = i - (12 - this.jMS.intValue() - 1);
    }
    GMTrace.o(9069360316416L, 67572);
    return j;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9069226098688L, 67571);
    long l = paramInt;
    GMTrace.o(9069226098688L, 67571);
    return l;
  }
  
  public static final class a<K>
    implements Serializable
  {
    K first;
    K jMU;
    
    public a()
    {
      GMTrace.i(9070031405056L, 67577);
      GMTrace.o(9070031405056L, 67577);
    }
  }
  
  public static final class b
    extends RecyclerView.t
  {
    final com.tencent.mm.plugin.chatroom.ui.b jMV;
    
    public b(View paramView, com.tencent.mm.plugin.chatroom.ui.b.a parama)
    {
      super();
      GMTrace.i(9070165622784L, 67578);
      this.jMV = ((com.tencent.mm.plugin.chatroom.ui.b)paramView);
      this.jMV.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      this.jMV.setClickable(true);
      this.jMV.jSD = parama;
      GMTrace.o(9070165622784L, 67578);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */