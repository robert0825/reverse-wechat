package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

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
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e;
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
  BakMoveChooseUI jeO;
  
  public a(BakMoveChooseUI paramBakMoveChooseUI)
  {
    GMTrace.i(14804349616128L, 110301);
    this.jeO = paramBakMoveChooseUI;
    this.iYP = new HashSet();
    GMTrace.o(14804349616128L, 110301);
  }
  
  private static com.tencent.mm.plugin.backup.bakoldlogic.a.a kH(int paramInt)
  {
    GMTrace.i(14804618051584L, 110303);
    com.tencent.mm.plugin.backup.bakoldlogic.a.a locala = (com.tencent.mm.plugin.backup.bakoldlogic.a.a)e.agb().get(paramInt);
    GMTrace.o(14804618051584L, 110303);
    return locala;
  }
  
  public final int getCount()
  {
    GMTrace.i(14804483833856L, 110302);
    ArrayList localArrayList = e.agb();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      GMTrace.o(14804483833856L, 110302);
      return i;
    }
    GMTrace.o(14804483833856L, 110302);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(14804752269312L, 110304);
    GMTrace.o(14804752269312L, 110304);
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(14804886487040L, 110305);
    com.tencent.mm.plugin.backup.bakoldlogic.a.a locala;
    if (paramView == null)
    {
      paramView = this.jeO.getLayoutInflater().inflate(R.i.cpN, paramViewGroup, false);
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
          GMTrace.i(14795491246080L, 110235);
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            GMTrace.o(14795491246080L, 110235);
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      locala = kH(paramInt);
      a.b.a(paramViewGroup.hqG, locala.iVh);
      paramViewGroup.hqH.setText(bg.aF(locala.iVk));
      if (!s.eb(locala.iVh)) {
        break label249;
      }
      paramViewGroup.hqI.setText(h.b(this.jeO, r.F(locala.iVh, locala.iVh), paramViewGroup.hqI.getTextSize()));
      label206:
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label281;
      }
      paramViewGroup.hqJ.setChecked(true);
    }
    for (;;)
    {
      GMTrace.o(14804886487040L, 110305);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label249:
      paramViewGroup.hqI.setText(h.b(this.jeO, r.fs(locala.iVh), paramViewGroup.hqI.getTextSize()));
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
      GMTrace.i(14795222810624L, 110233);
      GMTrace.o(14795222810624L, 110233);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmoveui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */