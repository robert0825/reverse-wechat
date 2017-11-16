package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.ui.view.aa;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class k
  extends c
{
  private final String TAG;
  private int count;
  private com.tencent.mm.plugin.card.base.c jCu;
  private int jEb;
  private final String jJi;
  private final String jJj;
  private ArrayList<CardInfo> jJk;
  private ArrayList<CardInfo> jJl;
  private ArrayList<CardInfo> jJm;
  
  public k(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    GMTrace.i(20572222259200L, 153275);
    this.TAG = "MicroMsg.CardTicketAdapter";
    this.jJi = "PRIVATE_TICKET_TITLE";
    this.jJj = "PRIVATE_INVOICE_TITLE";
    this.count = 0;
    this.jEb = paramInt;
    this.jCu = new aa(paramContext, this);
    this.jJk = new ArrayList();
    this.jJl = new ArrayList();
    this.jJm = new ArrayList();
    GMTrace.o(20572222259200L, 153275);
  }
  
  private void amd()
  {
    GMTrace.i(20572356476928L, 153276);
    this.jJk.clear();
    this.jJl.clear();
    this.jJm.clear();
    int i = 0;
    CardInfo localCardInfo;
    if (i < this.count)
    {
      localCardInfo = (CardInfo)super.getItem(i);
      if (localCardInfo != null)
      {
        if (!localCardInfo.ajg()) {
          break label75;
        }
        this.jJm.add(localCardInfo);
      }
      for (;;)
      {
        i += 1;
        break;
        label75:
        this.jJl.add(localCardInfo);
      }
    }
    if (!this.jJl.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_TICKET_TITLE";
      this.jJk.add(localCardInfo);
      this.jJk.addAll(this.jJl);
    }
    if (!this.jJm.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_INVOICE_TITLE";
      this.jJk.add(localCardInfo);
      this.jJk.addAll(this.jJm);
    }
    this.count = this.jJk.size();
    GMTrace.o(20572356476928L, 153276);
  }
  
  private CardInfo lN(int paramInt)
  {
    GMTrace.i(20572759130112L, 153279);
    CardInfo localCardInfo = (CardInfo)this.jJk.get(paramInt);
    GMTrace.o(20572759130112L, 153279);
    return localCardInfo;
  }
  
  public final void QF()
  {
    GMTrace.i(20572490694656L, 153277);
    w.v("MicroMsg.CardTicketAdapter", "resetCursor");
    Cursor localCursor = al.akn().lF(this.jEb);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      w.v("MicroMsg.CardTicketAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    amd();
    notifyDataSetChanged();
    GMTrace.o(20572490694656L, 153277);
  }
  
  protected final void QG()
  {
    GMTrace.i(20572624912384L, 153278);
    aJe();
    QF();
    GMTrace.o(20572624912384L, 153278);
  }
  
  public final int getCount()
  {
    GMTrace.i(20573027565568L, 153281);
    if (this.jJk.isEmpty())
    {
      i = super.getCount();
      GMTrace.o(20573027565568L, 153281);
      return i;
    }
    int i = this.jJk.size();
    GMTrace.o(20573027565568L, 153281);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(20572893347840L, 153280);
    CardInfo localCardInfo = lN(paramInt);
    if ((localCardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE")) || (localCardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")))
    {
      GMTrace.o(20572893347840L, 153280);
      return 0;
    }
    if (localCardInfo.ajg())
    {
      GMTrace.o(20572893347840L, 153280);
      return 2;
    }
    GMTrace.o(20572893347840L, 153280);
    return 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20573296001024L, 153283);
    paramViewGroup = lN(paramInt);
    paramView = this.jCu.a(paramInt, paramView, paramViewGroup);
    GMTrace.o(20573296001024L, 153283);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(20573161783296L, 153282);
    GMTrace.o(20573161783296L, 153282);
    return 3;
  }
  
  public final void release()
  {
    GMTrace.i(20573430218752L, 153284);
    aJe();
    this.jCu.release();
    this.jCu = null;
    GMTrace.o(20573430218752L, 153284);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */