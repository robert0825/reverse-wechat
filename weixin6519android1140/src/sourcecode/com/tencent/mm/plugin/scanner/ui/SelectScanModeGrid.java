package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.scanner.util.p;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class SelectScanModeGrid
  extends GridView
{
  public SelectScanModeGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6140863709184L, 45753);
    GMTrace.o(6140863709184L, 45753);
  }
  
  public SelectScanModeGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6140997926912L, 45754);
    GMTrace.o(6140997926912L, 45754);
  }
  
  public static final class a
    extends BaseAdapter
  {
    private Context context;
    private List<SelectScanModeGrid.b> ozi;
    int ozj;
    
    public a(Context paramContext, List<SelectScanModeGrid.b> paramList)
    {
      GMTrace.i(6115093905408L, 45561);
      this.ozj = -1;
      this.context = paramContext;
      this.ozi = paramList;
      w.d("MicroMsg.scanner.SelectScanModeGroupAdapter", "<init> list size = " + this.ozi.size());
      GMTrace.o(6115093905408L, 45561);
    }
    
    public final int getCount()
    {
      GMTrace.i(6115228123136L, 45562);
      int i = this.ozi.size();
      GMTrace.o(6115228123136L, 45562);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6115362340864L, 45563);
      if ((paramInt < 0) || (paramInt >= this.ozi.size()))
      {
        w.e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getItem fail, invalid position = " + paramInt);
        GMTrace.o(6115362340864L, 45563);
        return null;
      }
      Object localObject = this.ozi.get(paramInt);
      GMTrace.o(6115362340864L, 45563);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6115496558592L, 45564);
      long l = paramInt;
      GMTrace.o(6115496558592L, 45564);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6115630776320L, 45565);
      a locala;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cFN, null);
        locala = new a();
        locala.ozk = ((TextView)paramView.findViewById(R.h.cbN));
        locala.nJt = ((TextView)paramView.findViewById(R.h.cbR));
        paramView.setTag(locala);
      }
      while (paramInt == paramViewGroup.getChildCount())
      {
        paramViewGroup = (SelectScanModeGrid.b)getItem(paramInt);
        if (paramViewGroup == null)
        {
          w.e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getView fail, item is null");
          GMTrace.o(6115630776320L, 45565);
          return paramView;
          locala = (a)paramView.getTag();
        }
        else
        {
          if (paramViewGroup.ozl != R.l.dVc) {
            break label192;
          }
          locala.nJt.setText(p.dy(p.oBy, this.context.getString(R.l.dVc)));
          if (paramInt != this.ozj) {
            break label207;
          }
          locala.ozk.setBackgroundResource(paramViewGroup.ozn);
        }
      }
      for (;;)
      {
        paramViewGroup.ozp = locala.ozk;
        GMTrace.o(6115630776320L, 45565);
        return paramView;
        label192:
        locala.nJt.setText(paramViewGroup.ozl);
        break;
        label207:
        locala.ozk.setBackgroundResource(paramViewGroup.ozm);
      }
    }
    
    static final class a
    {
      public TextView nJt;
      public TextView ozk;
      
      a()
      {
        GMTrace.i(6140729491456L, 45752);
        GMTrace.o(6140729491456L, 45752);
      }
    }
  }
  
  public static final class b
  {
    public int ozl;
    public int ozm;
    public int ozn;
    public int ozo;
    public TextView ozp;
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(6136166088704L, 45718);
      this.ozl = paramInt1;
      this.ozm = paramInt2;
      this.ozn = paramInt3;
      this.ozo = paramInt4;
      GMTrace.o(6136166088704L, 45718);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\SelectScanModeGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */