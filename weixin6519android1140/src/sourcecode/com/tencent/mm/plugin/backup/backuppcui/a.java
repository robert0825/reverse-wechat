package com.tencent.mm.plugin.backup.backuppcui;

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
import com.tencent.mm.plugin.backup.backuppcmodel.b;
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
  HashSet<Integer> iYP;
  BackupPcChooseUI jaQ;
  
  static
  {
    GMTrace.i(9564086861824L, 71258);
    iYQ = false;
    GMTrace.o(9564086861824L, 71258);
  }
  
  public a(BackupPcChooseUI paramBackupPcChooseUI)
  {
    GMTrace.i(9562878902272L, 71249);
    this.jaQ = paramBackupPcChooseUI;
    this.iYP = new HashSet();
    iYQ = false;
    GMTrace.o(9562878902272L, 71249);
  }
  
  private static String iH(int paramInt)
  {
    GMTrace.i(9563147337728L, 71251);
    Object localObject = b.afh().afl().aeC();
    if (((LinkedList)localObject).get(paramInt) == null)
    {
      GMTrace.o(9563147337728L, 71251);
      return null;
    }
    localObject = ((d)((LinkedList)localObject).get(paramInt)).iVh;
    GMTrace.o(9563147337728L, 71251);
    return (String)localObject;
  }
  
  public final int getCount()
  {
    GMTrace.i(9563013120000L, 71250);
    LinkedList localLinkedList = b.afh().afl().aeC();
    if (localLinkedList != null)
    {
      int i = localLinkedList.size();
      GMTrace.o(9563013120000L, 71250);
      return i;
    }
    GMTrace.o(9563013120000L, 71250);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9563281555456L, 71252);
    GMTrace.o(9563281555456L, 71252);
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9563415773184L, 71253);
    String str;
    if (paramView == null)
    {
      paramView = this.jaQ.getLayoutInflater().inflate(R.i.cpI, paramViewGroup, false);
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
          GMTrace.i(9564623732736L, 71262);
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            GMTrace.o(9564623732736L, 71262);
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      str = iH(paramInt);
      a.b.a(paramViewGroup.hqG, str);
      if (!s.eb(str)) {
        break label208;
      }
      paramViewGroup.hqH.setText(h.b(this.jaQ, r.F(str, str), paramViewGroup.hqH.getTextSize()));
      label165:
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label237;
      }
      paramViewGroup.hqJ.setChecked(true);
    }
    for (;;)
    {
      GMTrace.o(9563415773184L, 71253);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label208:
      paramViewGroup.hqH.setText(h.b(this.jaQ, r.fs(str), paramViewGroup.hqH.getTextSize()));
      break label165;
      label237:
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
      GMTrace.i(9562744684544L, 71248);
      GMTrace.o(9562744684544L, 71248);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */