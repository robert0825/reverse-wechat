package com.tencent.mm.plugin.ipcall.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMDotView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class i
  extends AlertDialog
  implements ViewPager.e
{
  private TextView EN;
  private MMDotView iPE;
  private View jBw;
  private Context mContext;
  private b mtl;
  private IPCallShareViewPager mtm;
  private View.OnClickListener mtn;
  private LinkedList<Integer> mto;
  private CharSequence tX;
  
  public final void V(int paramInt)
  {
    GMTrace.i(11691035197440L, 87105);
    if (this.mtl.getCount() <= 1)
    {
      this.iPE.setVisibility(4);
      GMTrace.o(11691035197440L, 87105);
      return;
    }
    this.iPE.setVisibility(0);
    this.iPE.BU(this.mtl.getCount());
    this.iPE.BV(paramInt);
    GMTrace.o(11691035197440L, 87105);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(11691169415168L, 87106);
    GMTrace.o(11691169415168L, 87106);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(11691303632896L, 87107);
    GMTrace.o(11691303632896L, 87107);
  }
  
  public final void dismiss()
  {
    GMTrace.i(11691706286080L, 87110);
    try
    {
      super.dismiss();
      GMTrace.o(11691706286080L, 87110);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.IPCallShareDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(11691706286080L, 87110);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11690900979712L, 87104);
    super.onCreate(paramBundle);
    getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
    getWindow().setGravity(80);
    getWindow().getDecorView().setPadding(0, 0, 0, 0);
    setContentView(this.jBw);
    GMTrace.o(11690900979712L, 87104);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(11691437850624L, 87108);
    if (paramCharSequence != null)
    {
      this.tX = paramCharSequence;
      GMTrace.o(11691437850624L, 87108);
      return;
    }
    this.tX = null;
    GMTrace.o(11691437850624L, 87108);
  }
  
  public final void show()
  {
    GMTrace.i(11691572068352L, 87109);
    if ((this.mto == null) || (this.mto.size() == 0))
    {
      GMTrace.o(11691572068352L, 87109);
      return;
    }
    this.mtm.b(this);
    b localb = new b();
    localb.mtp = this.mtn;
    localb.mtu = this.mto;
    int i;
    if (localb.mtu.size() > 0)
    {
      localb.mCount = ((localb.mtu.size() - 1) / 9 + 1);
      i = 0;
    }
    for (;;)
    {
      if (i >= localb.mCount) {
        break label263;
      }
      View localView = ((LayoutInflater)localb.mtw.mContext.getSystemService("layout_inflater")).inflate(R.i.cAA, null);
      GridView localGridView = (GridView)localView.findViewById(R.h.bIA);
      ArrayList localArrayList = new ArrayList();
      int j = i * 9;
      for (;;)
      {
        if ((j < localb.mtu.size()) && (j < i * 9 + 9))
        {
          localArrayList.add(localb.mtu.get(j));
          j += 1;
          continue;
          localb.mCount = 0;
          break;
        }
      }
      a locala = new a(localb.mtw.getContext());
      locala.mtp = localb.mtp;
      locala.lWy = localArrayList;
      localGridView.setAdapter(locala);
      localb.mtv.add(localView);
      i += 1;
    }
    label263:
    this.mtl = localb;
    this.mtm.a(this.mtl);
    this.EN.setText(this.tX);
    super.show();
    GMTrace.o(11691572068352L, 87109);
  }
  
  public static final class a
    extends BaseAdapter
  {
    List<Integer> lWy;
    private Context mContext;
    View.OnClickListener mtp;
    
    public a(Context paramContext)
    {
      GMTrace.i(11651977838592L, 86814);
      this.lWy = null;
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.mContext = paramContext;
        GMTrace.o(11651977838592L, 86814);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11652112056320L, 86815);
      if (this.lWy == null)
      {
        GMTrace.o(11652112056320L, 86815);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(11652112056320L, 86815);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11652246274048L, 86816);
      if (this.lWy != null)
      {
        Object localObject = this.lWy.get(paramInt);
        GMTrace.o(11652246274048L, 86816);
        return localObject;
      }
      GMTrace.o(11652246274048L, 86816);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11652380491776L, 86817);
      long l = paramInt;
      GMTrace.o(11652380491776L, 86817);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11652648927232L, 86819);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(R.i.cAB, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.mtr = ((RelativeLayout)paramView.findViewById(R.h.layout));
        paramViewGroup.mts = ((TextView)paramView.findViewById(R.h.bIz));
        paramViewGroup.mtt = ((ImageView)paramView.findViewById(R.h.bIy));
        paramView.setTag(paramViewGroup);
      }
      Object localObject;
      for (;;)
      {
        localObject = getItem(paramInt);
        if (localObject != null) {
          break;
        }
        GMTrace.o(11652648927232L, 86819);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.id = ((Integer)localObject).intValue();
      IPCallShareCouponCardUI.a(this.mContext, paramViewGroup.id, paramViewGroup.mts, paramViewGroup.mtt);
      paramViewGroup.mtr.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11697074995200L, 87150);
          if (i.a.a(i.a.this) != null) {
            i.a.a(i.a.this).onClick(paramAnonymousView);
          }
          GMTrace.o(11697074995200L, 87150);
        }
      });
      GMTrace.o(11652648927232L, 86819);
      return paramView;
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(11652514709504L, 86818);
      GMTrace.o(11652514709504L, 86818);
      return 2;
    }
    
    public final class a
    {
      int id;
      RelativeLayout mtr;
      TextView mts;
      ImageView mtt;
      
      public a()
      {
        GMTrace.i(11694659076096L, 87132);
        GMTrace.o(11694659076096L, 87132);
      }
    }
  }
  
  public final class b
    extends u
  {
    int mCount;
    View.OnClickListener mtp;
    LinkedList<Integer> mtu;
    ArrayList<View> mtv;
    
    public b()
    {
      GMTrace.i(11725931806720L, 87365);
      this.mtv = new ArrayList();
      this.mCount = 0;
      GMTrace.o(11725931806720L, 87365);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(11726334459904L, 87368);
      w.v("MicroMsg.IPCallShareDialog", "destroy item: %d", new Object[] { Integer.valueOf(paramInt) });
      paramViewGroup.removeView((View)paramObject);
      GMTrace.o(11726334459904L, 87368);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(11726200242176L, 87367);
      if (paramView == paramObject)
      {
        GMTrace.o(11726200242176L, 87367);
        return true;
      }
      GMTrace.o(11726200242176L, 87367);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(11726468677632L, 87369);
      if (this.mtv.get(paramInt) != null) {}
      for (View localView = (View)this.mtv.get(paramInt);; localView = null)
      {
        if (localView != null)
        {
          if (localView.getParent() != null) {
            ((ViewGroup)localView.getParent()).removeView(localView);
          }
          if (paramViewGroup != null) {
            paramViewGroup.addView(localView, 0);
          }
        }
        GMTrace.o(11726468677632L, 87369);
        return localView;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11726066024448L, 87366);
      int i = this.mCount;
      GMTrace.o(11726066024448L, 87366);
      return i;
    }
    
    public final int j(Object paramObject)
    {
      GMTrace.i(11726602895360L, 87370);
      int i = super.j(paramObject);
      GMTrace.o(11726602895360L, 87370);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */