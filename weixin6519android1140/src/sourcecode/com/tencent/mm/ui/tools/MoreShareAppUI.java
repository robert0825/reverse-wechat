package com.tencent.mm.ui.tools;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.DragSortListView;
import com.tencent.mm.ui.widget.DragSortListView.g;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.List;

public class MoreShareAppUI
  extends MMActivity
{
  private DragSortListView kpm;
  private List<f> vOw;
  private a xij;
  
  public MoreShareAppUI()
  {
    GMTrace.i(2033264361472L, 15149);
    GMTrace.o(2033264361472L, 15149);
  }
  
  protected final void MP()
  {
    GMTrace.i(2033667014656L, 15152);
    oM(R.l.dby);
    this.kpm = ((DragSortListView)findViewById(R.h.bKn));
    this.kpm.xnZ = new DragSortListView.g()
    {
      public final void bW(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1998636187648L, 14891);
        f localf = (f)MoreShareAppUI.a(MoreShareAppUI.this).getItem(paramAnonymousInt1);
        MoreShareAppUI.a.a(MoreShareAppUI.a(MoreShareAppUI.this)).remove(paramAnonymousInt1);
        MoreShareAppUI.a(MoreShareAppUI.this).notifyDataSetChanged();
        MoreShareAppUI.a(MoreShareAppUI.this).insert(localf, paramAnonymousInt2);
        GMTrace.o(1998636187648L, 14891);
      }
    };
    GMTrace.o(2033667014656L, 15152);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2033398579200L, 15150);
    int i = R.i.cCy;
    GMTrace.o(2033398579200L, 15150);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2033532796928L, 15151);
    super.onCreate(paramBundle);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1924548001792L, 14339);
        MoreShareAppUI.this.finish();
        GMTrace.o(1924548001792L, 14339);
        return true;
      }
    });
    a(0, getString(R.l.doq), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1916360720384L, 14278);
        GMTrace.o(1916360720384L, 14278);
        return false;
      }
    });
    this.xij = new a(this, this.vOw);
    this.kpm.setAdapter(this.xij);
    GMTrace.o(2033532796928L, 15151);
  }
  
  private static final class a
    extends ArrayAdapter<f>
  {
    private List<f> kgE;
    private Context mContext;
    
    public a(Context paramContext, List<f> paramList)
    {
      super(R.i.cCz, paramList);
      GMTrace.i(1957565562880L, 14585);
      this.mContext = paramContext;
      this.kgE = paramList;
      GMTrace.o(1957565562880L, 14585);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1957699780608L, 14586);
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cCz, null);
        paramViewGroup = new a(paramView);
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        f localf = (f)getItem(paramInt);
        paramViewGroup.hqH.setText(localf.field_appName);
        paramView.setVisibility(0);
        GMTrace.o(1957699780608L, 14586);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
    }
    
    static final class a
    {
      TextView hqH;
      ImageView iub;
      View kgF;
      ImageView kgG;
      MMSwitchBtn saZ;
      
      public a(View paramView)
      {
        GMTrace.i(1958370869248L, 14591);
        this.kgG = ((ImageView)paramView.findViewById(R.h.bGi));
        this.iub = ((ImageView)paramView.findViewById(R.h.bGn));
        this.hqH = ((TextView)paramView.findViewById(R.h.chH));
        this.saZ = ((MMSwitchBtn)paramView.findViewById(R.h.cgj));
        this.kgF = paramView.findViewById(R.h.brL);
        GMTrace.o(1958370869248L, 14591);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\MoreShareAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */