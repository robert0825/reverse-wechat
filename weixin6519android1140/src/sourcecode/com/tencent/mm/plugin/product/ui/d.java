package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.List;

public final class d
{
  static final class a
    extends BaseAdapter
  {
    private final Context context;
    List<String> nJr;
    int nJs;
    private final int style;
    
    public a(Context paramContext)
    {
      GMTrace.i(6023960068096L, 44882);
      this.nJs = -1;
      this.context = paramContext;
      this.style = 1;
      GMTrace.o(6023960068096L, 44882);
    }
    
    public final int getCount()
    {
      GMTrace.i(6024094285824L, 44883);
      if (this.nJr != null)
      {
        int i = this.nJr.size();
        GMTrace.o(6024094285824L, 44883);
        return i;
      }
      GMTrace.o(6024094285824L, 44883);
      return 0;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6024228503552L, 44884);
      GMTrace.o(6024228503552L, 44884);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6024362721280L, 44885);
      GMTrace.o(6024362721280L, 44885);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool = true;
      GMTrace.i(6024496939008L, 44886);
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(this.context, a.g.gfv, null);
        paramView = new d.b();
        paramView.nJt = ((TextView)paramViewGroup.findViewById(a.f.text));
        paramView.nJu = ((CheckBox)paramViewGroup.findViewById(a.f.gda));
        paramView.nJv = ((RadioButton)paramViewGroup.findViewById(a.f.radio));
        paramViewGroup.setTag(paramView);
      }
      paramView = (d.b)paramViewGroup.getTag();
      paramView.nJt.setText((CharSequence)this.nJr.get(paramInt));
      switch (this.style)
      {
      default: 
        paramView.nJu.setVisibility(8);
        paramView.nJv.setVisibility(8);
        GMTrace.o(6024496939008L, 44886);
        return paramViewGroup;
      case 1: 
        paramView.nJu.setVisibility(8);
        paramView.nJv.setVisibility(0);
        paramView = paramView.nJv;
        if (paramInt == this.nJs) {}
        for (bool = true;; bool = false)
        {
          paramView.setChecked(bool);
          break;
        }
      }
      paramView.nJu.setVisibility(0);
      paramView.nJv.setVisibility(8);
      paramView = paramView.nJu;
      if (paramInt == this.nJs) {}
      for (;;)
      {
        paramView.setChecked(bool);
        break;
        bool = false;
      }
    }
  }
  
  static final class b
  {
    TextView nJt;
    CheckBox nJu;
    RadioButton nJv;
    
    b()
    {
      GMTrace.i(6023557414912L, 44879);
      GMTrace.o(6023557414912L, 44879);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */