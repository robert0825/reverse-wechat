package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.k;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.n;
import java.util.Collection;

public class DayPickerView
  extends RecyclerView
{
  private TypedArray jMN;
  private com.tencent.mm.plugin.chatroom.a.a jMO;
  protected com.tencent.mm.plugin.chatroom.a.b jOr;
  protected int jOs;
  protected long jOt;
  protected int jOu;
  private RecyclerView.k jOv;
  private Collection<com.tencent.mm.plugin.chatroom.d.a> jOw;
  long jOx;
  protected Context mContext;
  
  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9109894070272L, 67874);
    GMTrace.o(9109894070272L, 67874);
  }
  
  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9110028288000L, 67875);
    this.jOs = 0;
    this.jOu = 0;
    this.jOx = -1L;
    if (!isInEditMode())
    {
      this.jMN = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.emO);
      setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
      a(new LinearLayoutManager());
      this.mContext = paramContext;
      setVerticalScrollBarEnabled(false);
      this.TD = this.jOv;
      setFadingEdgeLength(0);
      this.jOv = new RecyclerView.k()
      {
        public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9140629929984L, 68103);
          super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
          if ((b)paramAnonymousRecyclerView.getChildAt(0) == null)
          {
            GMTrace.o(9140629929984L, 68103);
            return;
          }
          DayPickerView.this.jOt = paramAnonymousInt2;
          DayPickerView.this.jOu = DayPickerView.this.jOs;
          GMTrace.o(9140629929984L, 68103);
        }
      };
    }
    GMTrace.o(9110028288000L, 67875);
  }
  
  public final void a(com.tencent.mm.plugin.chatroom.a.a parama, Collection<com.tencent.mm.plugin.chatroom.d.a> paramCollection)
  {
    GMTrace.i(9110162505728L, 67876);
    this.jOw = paramCollection;
    this.jMO = parama;
    if (this.jOr == null) {
      this.jOr = new com.tencent.mm.plugin.chatroom.a.b(getContext(), this.jMO, this.jMN, this.jOx, paramCollection);
    }
    a(this.jOr);
    aX(this.jOr.getItemCount() - 1);
    this.jOr.TS.notifyChanged();
    GMTrace.o(9110162505728L, 67876);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\DayPickerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */