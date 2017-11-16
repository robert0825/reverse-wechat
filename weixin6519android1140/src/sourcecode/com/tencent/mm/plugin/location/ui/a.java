package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.l.a;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  extends l
{
  private int myv;
  private ArrayList<String> myw;
  
  public a()
  {
    GMTrace.i(9666763423744L, 72023);
    this.myv = 8;
    this.myw = new ArrayList();
    GMTrace.o(9666763423744L, 72023);
  }
  
  public final void G(ArrayList<String> paramArrayList)
  {
    GMTrace.i(9666897641472L, 72024);
    this.myw.clear();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      this.myw.add(str);
    }
    if (this.wcI == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.wcI != null) {
        break;
      }
      GMTrace.o(9666897641472L, 72024);
      return;
    }
    this.wcI.bZV();
    GMTrace.o(9666897641472L, 72024);
  }
  
  public final View c(int paramInt, View paramView)
  {
    GMTrace.i(9667166076928L, 72026);
    a locala = new a();
    if (paramView == null)
    {
      paramView = View.inflate(ab.getContext(), R.i.cpC, null);
      locala.gDc = ((ImageView)paramView.findViewById(R.h.bfp));
      locala.myx = ((TextView)paramView.findViewById(R.h.cjM));
      paramView.setTag(locala);
    }
    for (;;)
    {
      Object localObject = (String)this.myw.get(paramInt);
      a.b.a(locala.gDc, (String)localObject);
      String str = r.fs((String)localObject);
      localObject = str;
      if (str.length() > this.myv) {
        localObject = str.subSequence(0, this.myv + 1) + "...";
      }
      locala.myx.setText((CharSequence)localObject);
      GMTrace.o(9667166076928L, 72026);
      return paramView;
      locala = (a)paramView.getTag();
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(9667031859200L, 72025);
    int i = this.myw.size();
    GMTrace.o(9667031859200L, 72025);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(9667300294656L, 72027);
    Object localObject = this.myw.get(paramInt);
    GMTrace.o(9667300294656L, 72027);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9667434512384L, 72028);
    long l = paramInt;
    GMTrace.o(9667434512384L, 72028);
    return l;
  }
  
  final class a
  {
    ImageView gDc;
    TextView myx;
    
    a()
    {
      GMTrace.i(9653475868672L, 71924);
      GMTrace.o(9653475868672L, 71924);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */