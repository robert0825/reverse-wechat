package com.tencent.mm.plugin.clean.ui.newui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.clean.c.b;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashSet;

public final class a
  extends BaseAdapter
{
  HashSet<Integer> iYP;
  CleanChattingUI jVu;
  
  public a(CleanChattingUI paramCleanChattingUI)
  {
    GMTrace.i(20554639736832L, 153144);
    this.jVu = paramCleanChattingUI;
    this.iYP = new HashSet();
    GMTrace.o(20554639736832L, 153144);
  }
  
  private static b ml(int paramInt)
  {
    GMTrace.i(20554908172288L, 153146);
    b localb = (b)d.agb().get(paramInt);
    GMTrace.o(20554908172288L, 153146);
    return localb;
  }
  
  public final void aom()
  {
    GMTrace.i(20555310825472L, 153149);
    this.iYP.clear();
    this.jVu.a(this.iYP);
    GMTrace.o(20555310825472L, 153149);
  }
  
  public final int getCount()
  {
    GMTrace.i(20554773954560L, 153145);
    ArrayList localArrayList = d.agb();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      GMTrace.o(20554773954560L, 153145);
      return i;
    }
    GMTrace.o(20554773954560L, 153145);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20555042390016L, 153147);
    GMTrace.o(20555042390016L, 153147);
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20555176607744L, 153148);
    b localb;
    if (paramView == null)
    {
      paramView = this.jVu.getLayoutInflater().inflate(R.i.ctt, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.bti));
      paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.cbs));
      paramViewGroup.iYS = ((RelativeLayout)paramView.findViewById(R.h.cbt));
      paramView.setTag(paramViewGroup);
      paramViewGroup.iYS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20541620617216L, 153047);
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            GMTrace.o(20541620617216L, 153047);
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      localb = ml(paramInt);
      a.b.a(paramViewGroup.hqG, localb.username);
      paramViewGroup.hqH.setText(bg.aF(localb.eJe));
      if (!s.eb(localb.username)) {
        break label249;
      }
      paramViewGroup.hqI.setText(h.b(this.jVu, r.F(localb.username, localb.username), paramViewGroup.hqI.getTextSize()));
      label206:
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label281;
      }
      paramViewGroup.hqJ.setChecked(true);
    }
    for (;;)
    {
      GMTrace.o(20555176607744L, 153148);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label249:
      paramViewGroup.hqI.setText(h.b(this.jVu, r.fs(localb.username), paramViewGroup.hqI.getTextSize()));
      break label206;
      label281:
      paramViewGroup.hqJ.setChecked(false);
    }
  }
  
  final class a
  {
    ImageView hqG;
    TextView hqH;
    TextView hqI;
    CheckBox hqJ;
    RelativeLayout iYS;
    
    a()
    {
      GMTrace.i(20543768100864L, 153063);
      GMTrace.o(20543768100864L, 153063);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\newui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */