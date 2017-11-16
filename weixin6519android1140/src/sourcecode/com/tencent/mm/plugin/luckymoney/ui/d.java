package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.b.h;
import java.util.LinkedList;
import java.util.List;

public abstract class d
  extends BaseAdapter
{
  protected LayoutInflater CJ;
  protected Context mContext;
  protected List<h> mNm;
  
  public d(Context paramContext)
  {
    GMTrace.i(9872384983040L, 73555);
    this.mNm = new LinkedList();
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(9872384983040L, 73555);
  }
  
  public final void a(h paramh)
  {
    GMTrace.i(9872787636224L, 73558);
    this.mNm.remove(paramh);
    GMTrace.o(9872787636224L, 73558);
  }
  
  public final void aS(List<h> paramList)
  {
    GMTrace.i(9872519200768L, 73556);
    if (paramList == null) {}
    for (this.mNm = new LinkedList();; this.mNm = paramList)
    {
      notifyDataSetChanged();
      GMTrace.o(9872519200768L, 73556);
      return;
    }
  }
  
  public int getCount()
  {
    GMTrace.i(9872653418496L, 73557);
    int i = this.mNm.size();
    GMTrace.o(9872653418496L, 73557);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(9873056071680L, 73560);
    long l = paramInt;
    GMTrace.o(9873056071680L, 73560);
    return l;
  }
  
  public final h qe(int paramInt)
  {
    GMTrace.i(9872921853952L, 73559);
    h localh = (h)this.mNm.get(paramInt);
    GMTrace.o(9872921853952L, 73559);
    return localh;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */