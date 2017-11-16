package com.tencent.mm.plugin.backup.backupmoveui;

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
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.LinkedList;

public final class a
  extends BaseAdapter
{
  static boolean iYQ;
  BackupMoveChooseUI iYO;
  HashSet<Integer> iYP;
  
  static
  {
    GMTrace.i(18457219301376L, 137517);
    iYQ = false;
    GMTrace.o(18457219301376L, 137517);
  }
  
  public a(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
    GMTrace.i(9587977617408L, 71436);
    this.iYO = paramBackupMoveChooseUI;
    this.iYP = new HashSet();
    iYQ = false;
    GMTrace.o(9587977617408L, 71436);
  }
  
  public static boolean Hj()
  {
    GMTrace.i(18457085083648L, 137516);
    boolean bool = iYQ;
    GMTrace.o(18457085083648L, 137516);
    return bool;
  }
  
  private static d kw(int paramInt)
  {
    GMTrace.i(14846359764992L, 110614);
    d locald = (d)b.aeH().aeL().aeC().get(paramInt);
    GMTrace.o(14846359764992L, 110614);
    return locald;
  }
  
  public final int getCount()
  {
    GMTrace.i(9588111835136L, 71437);
    LinkedList localLinkedList = b.aeH().aeL().aeC();
    if (localLinkedList != null)
    {
      int i = localLinkedList.size();
      GMTrace.o(9588111835136L, 71437);
      return i;
    }
    GMTrace.o(9588111835136L, 71437);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9588380270592L, 71439);
    GMTrace.o(9588380270592L, 71439);
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9588514488320L, 71440);
    d locald;
    if (paramView == null)
    {
      paramView = this.iYO.getLayoutInflater().inflate(R.i.cpN, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.chT));
      paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.cbs));
      paramViewGroup.iYS = ((RelativeLayout)paramView.findViewById(R.h.cbt));
      paramView.setTag(paramViewGroup);
      paramViewGroup.iYS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9589722447872L, 71449);
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            GMTrace.o(9589722447872L, 71449);
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      locald = kw(paramInt);
      a.b.a(paramViewGroup.hqG, locald.iVh);
      if (!s.eb(locald.iVh)) {
        break label220;
      }
      paramViewGroup.hqH.setText(h.b(this.iYO, r.F(locald.iVh, locald.iVh), paramViewGroup.hqH.getTextSize()));
      label177:
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label252;
      }
      paramViewGroup.hqJ.setChecked(true);
    }
    for (;;)
    {
      GMTrace.o(9588514488320L, 71440);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label220:
      paramViewGroup.hqH.setText(h.b(this.iYO, r.fs(locald.iVh), paramViewGroup.hqH.getTextSize()));
      break label177;
      label252:
      paramViewGroup.hqJ.setChecked(false);
    }
  }
  
  final class a
  {
    ImageView hqG;
    TextView hqH;
    CheckBox hqJ;
    RelativeLayout iYS;
    
    a()
    {
      GMTrace.i(9584756391936L, 71412);
      GMTrace.o(9584756391936L, 71412);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */