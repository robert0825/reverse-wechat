package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.o;

public class c
  extends o<CardInfo>
{
  private final String TAG;
  private int count;
  private com.tencent.mm.plugin.card.base.c jCu;
  private int jEb;
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, new CardInfo());
    GMTrace.i(4936528035840L, 36780);
    this.TAG = "MicroMsg.CardAdapter";
    this.count = 0;
    this.jEb = paramInt;
    lb(true);
    this.jCu = new l(paramContext, this);
    GMTrace.o(4936528035840L, 36780);
  }
  
  public void QF()
  {
    GMTrace.i(4936662253568L, 36781);
    w.v("MicroMsg.CardAdapter", "resetCursor");
    Cursor localCursor = al.akn().lF(this.jEb);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      w.v("MicroMsg.CardAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    notifyDataSetChanged();
    GMTrace.o(4936662253568L, 36781);
  }
  
  protected void QG()
  {
    GMTrace.i(4936796471296L, 36782);
    aJe();
    QF();
    GMTrace.o(4936796471296L, 36782);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4936930689024L, 36783);
    paramViewGroup = (CardInfo)getItem(paramInt);
    paramView = this.jCu.a(paramInt, paramView, paramViewGroup);
    GMTrace.o(4936930689024L, 36783);
    return paramView;
  }
  
  public void release()
  {
    GMTrace.i(20571148517376L, 153267);
    aJe();
    this.jCu.release();
    this.jCu = null;
    GMTrace.o(20571148517376L, 153267);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */