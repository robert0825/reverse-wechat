package com.tencent.mm.plugin.favorite.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public abstract class d
  extends BaseAdapter
  implements View.OnClickListener
{
  private Context context;
  public String lgm;
  public List<String> lgn;
  public SparseArray<SpannableString> lgo;
  
  public d(Context paramContext)
  {
    GMTrace.i(6333063495680L, 47185);
    this.lgn = new LinkedList();
    this.lgo = new SparseArray();
    this.context = paramContext;
    GMTrace.o(6333063495680L, 47185);
  }
  
  private String iH(int paramInt)
  {
    GMTrace.i(6333331931136L, 47187);
    String str = (String)this.lgn.get(paramInt);
    GMTrace.o(6333331931136L, 47187);
    return str;
  }
  
  public int getCount()
  {
    GMTrace.i(6333197713408L, 47186);
    int i = this.lgn.size();
    GMTrace.o(6333197713408L, 47186);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(6333466148864L, 47188);
    long l = paramInt;
    GMTrace.o(6333466148864L, 47188);
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6333600366592L, 47189);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.context, R.i.cwL, null);
      paramViewGroup.setOnClickListener(this);
    }
    TextView localTextView = (TextView)paramViewGroup.findViewById(R.h.caw);
    String str = bg.aq(iH(paramInt), "");
    int i = (int)localTextView.getTextSize();
    paramInt = str.hashCode();
    paramView = (SpannableString)this.lgo.get(paramInt);
    if (paramView != null) {}
    for (;;)
    {
      localTextView.setText(paramView);
      GMTrace.o(6333600366592L, 47189);
      return paramViewGroup;
      paramView = new SpannableString(h.c(this.context, str, i));
      i = str.indexOf(this.lgm);
      if (-1 == i)
      {
        w.w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", new Object[] { str });
      }
      else
      {
        int j = this.lgm.length() + i;
        paramView.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.e.aPp)), i, j, 33);
        paramView.setSpan(new StyleSpan(1), i, j, 33);
        this.lgo.put(paramInt, paramView);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6333868802048L, 47191);
    paramView = ((TextView)paramView.findViewById(R.h.caw)).getText().toString();
    w.d("MicroMsg.FavoriteTagSearchAdapter", "select search tag %s", new Object[] { paramView });
    xf(paramView);
    GMTrace.o(6333868802048L, 47191);
  }
  
  public abstract void xf(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */