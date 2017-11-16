package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMTextView;
import java.util.ArrayList;

public final class b
  extends BaseAdapter
{
  private Context mContext;
  String mvM;
  ArrayList<String> mvN;
  SparseArray<SpannableString> mvO;
  
  public b(Context paramContext)
  {
    GMTrace.i(7301444403200L, 54400);
    this.mvN = new ArrayList();
    this.mvO = new SparseArray();
    this.mContext = paramContext;
    GMTrace.o(7301444403200L, 54400);
  }
  
  public final int getCount()
  {
    GMTrace.i(7301578620928L, 54401);
    if (this.mvN == null)
    {
      GMTrace.o(7301578620928L, 54401);
      return 0;
    }
    int i = this.mvN.size();
    GMTrace.o(7301578620928L, 54401);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(7301847056384L, 54403);
    long l = paramInt;
    GMTrace.o(7301847056384L, 54403);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7301981274112L, 54404);
    MMTextView localMMTextView;
    String str;
    int i;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.ctN, paramViewGroup, false);
      paramViewGroup = new c(paramView);
      paramView.setTag(paramViewGroup);
      localMMTextView = paramViewGroup.mwo;
      str = bg.aq(iH(paramInt), "");
      i = (int)paramViewGroup.mwo.getTextSize();
      paramInt = str.hashCode();
      paramViewGroup = (SpannableString)this.mvO.get(paramInt);
      if (paramViewGroup == null) {
        break label126;
      }
    }
    for (;;)
    {
      localMMTextView.setText(paramViewGroup);
      GMTrace.o(7301981274112L, 54404);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
      break;
      label126:
      paramViewGroup = new SpannableString(h.c(this.mContext, str, i));
      i = str.indexOf(this.mvM);
      if (i == -1)
      {
        w.w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", new Object[] { str });
      }
      else
      {
        int j = this.mvM.length() + i;
        paramViewGroup.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.e.aPp)), i, j, 33);
        paramViewGroup.setSpan(new StyleSpan(1), i, j, 33);
        this.mvO.put(paramInt, paramViewGroup);
      }
    }
  }
  
  public final String iH(int paramInt)
  {
    GMTrace.i(7301712838656L, 54402);
    if ((this.mvN == null) || (paramInt >= getCount()))
    {
      GMTrace.o(7301712838656L, 54402);
      return null;
    }
    String str = (String)this.mvN.get(paramInt);
    GMTrace.o(7301712838656L, 54402);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */