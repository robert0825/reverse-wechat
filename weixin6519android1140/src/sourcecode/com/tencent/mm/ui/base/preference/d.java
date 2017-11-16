package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.HashMap;
import junit.framework.Assert;

final class d
  extends BaseAdapter
{
  private final Context context;
  protected int nJs;
  private final int style;
  protected String value;
  protected final HashMap<CharSequence, c> values;
  protected CharSequence[] wjt;
  protected CharSequence[] wju;
  
  public d(Context paramContext)
  {
    GMTrace.i(3210488053760L, 23920);
    this.nJs = -1;
    this.values = new HashMap();
    this.context = paramContext;
    this.style = 1;
    GMTrace.o(3210488053760L, 23920);
  }
  
  protected final void caV()
  {
    int i = 0;
    GMTrace.i(3210622271488L, 23921);
    if (this.wjt == null) {
      this.wjt = new CharSequence[0];
    }
    if (this.wju == null) {
      this.wju = new CharSequence[0];
    }
    if (this.wjt.length == this.wju.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.wju.length)
      {
        c localc = new c(this.wjt[i], 1048576 + i);
        this.values.put(this.wju[i], localc);
        i += 1;
      }
    }
    GMTrace.o(3210622271488L, 23921);
  }
  
  public final int getCount()
  {
    GMTrace.i(3210756489216L, 23922);
    int i = this.wju.length;
    GMTrace.o(3210756489216L, 23922);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(3210890706944L, 23923);
    GMTrace.o(3210890706944L, 23923);
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(3211024924672L, 23924);
    GMTrace.o(3211024924672L, 23924);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3211159142400L, 23925);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = v.fb(this.context).inflate(a.h.gfv, null);
      paramView = new a();
      paramView.nJt = ((TextView)paramViewGroup.findViewById(a.g.text));
      paramView.nJu = ((CheckBox)paramViewGroup.findViewById(a.g.gda));
      paramView.nJv = ((RadioButton)paramViewGroup.findViewById(a.g.radio));
      paramViewGroup.setTag(paramView);
    }
    paramView = (a)paramViewGroup.getTag();
    paramView.nJt.setText(this.wjt[paramInt]);
    switch (this.style)
    {
    default: 
      paramView.nJu.setVisibility(8);
      paramView.nJv.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(3211159142400L, 23925);
      return paramViewGroup;
      paramView.nJu.setVisibility(8);
      paramView.nJv.setVisibility(0);
      paramView.nJv.setChecked(this.wju[paramInt].equals(this.value));
      continue;
      paramView.nJu.setVisibility(0);
      paramView.nJv.setVisibility(8);
      paramView.nJu.setChecked(this.wju[paramInt].equals(this.value));
    }
  }
  
  static final class a
  {
    TextView nJt;
    CheckBox nJu;
    RadioButton nJv;
    
    a()
    {
      GMTrace.i(3208609005568L, 23906);
      GMTrace.o(3208609005568L, 23906);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */