package com.tencent.mm.plugin.clean.ui.fileindexui;

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
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.List;

public final class a
  extends BaseAdapter
{
  private List<c> dataList;
  HashSet<Integer> iYP;
  CleanChattingUI jTW;
  
  public a(CleanChattingUI paramCleanChattingUI, List<c> paramList)
  {
    GMTrace.i(20533835988992L, 152989);
    this.jTW = paramCleanChattingUI;
    this.iYP = new HashSet();
    this.dataList = paramList;
    GMTrace.o(20533835988992L, 152989);
  }
  
  public final void aom()
  {
    GMTrace.i(20534507077632L, 152994);
    this.iYP.clear();
    this.jTW.a(this.iYP);
    GMTrace.o(20534507077632L, 152994);
  }
  
  public final int getCount()
  {
    GMTrace.i(20533970206720L, 152990);
    int i = this.dataList.size();
    GMTrace.o(20533970206720L, 152990);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20534238642176L, 152992);
    GMTrace.o(20534238642176L, 152992);
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20534372859904L, 152993);
    c localc;
    if (paramView == null)
    {
      paramView = this.jTW.getLayoutInflater().inflate(R.i.ctt, paramViewGroup, false);
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
          GMTrace.i(20515582377984L, 152853);
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            GMTrace.o(20515582377984L, 152853);
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      localc = mh(paramInt);
      a.b.a(paramViewGroup.hqG, localc.username);
      paramViewGroup.hqH.setText(bg.aF(localc.size));
      if (!s.eb(localc.username)) {
        break label250;
      }
      paramViewGroup.hqI.setText(h.b(this.jTW, r.F(localc.username, localc.username), paramViewGroup.hqI.getTextSize()));
      label207:
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label282;
      }
      paramViewGroup.hqJ.setChecked(true);
    }
    for (;;)
    {
      GMTrace.o(20534372859904L, 152993);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label250:
      paramViewGroup.hqI.setText(h.b(this.jTW, r.fs(localc.username), paramViewGroup.hqI.getTextSize()));
      break label207;
      label282:
      paramViewGroup.hqJ.setChecked(false);
    }
  }
  
  public final c mh(int paramInt)
  {
    GMTrace.i(20534104424448L, 152991);
    c localc = (c)this.dataList.get(paramInt);
    GMTrace.o(20534104424448L, 152991);
    return localc;
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
      GMTrace.i(20519608909824L, 152883);
      GMTrace.o(20519608909824L, 152883);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\fileindexui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */