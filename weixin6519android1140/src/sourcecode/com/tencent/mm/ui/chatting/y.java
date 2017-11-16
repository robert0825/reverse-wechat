package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.af.j;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.q;
import java.util.Iterator;
import java.util.List;

public final class y
  implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  public LayoutInflater CJ;
  private int height;
  public Context mContext;
  public int mCount;
  AdapterView.OnItemClickListener wtV;
  private ViewGroup wtW;
  private b wtX;
  private MMListPopupWindow wtY;
  private int wtZ;
  private int wua;
  public j wub;
  private boolean wuc;
  
  public y(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(2214189858816L, 16497);
    this.wtV = null;
    this.mContext = null;
    this.wtW = null;
    this.wtX = null;
    this.wtZ = R.m.emd;
    this.wub = null;
    this.wuc = true;
    this.mContext = paramContext;
    this.wtW = paramViewGroup;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    cca();
    this.wtX = new b((byte)0);
    GMTrace.o(2214189858816L, 16497);
  }
  
  private int b(ListAdapter paramListAdapter)
  {
    GMTrace.i(2214726729728L, 16501);
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    int j = 0;
    int i = 0;
    View localView = null;
    int k = 0;
    if (j < i2)
    {
      int m = paramListAdapter.getItemViewType(j);
      if (m == i) {
        break label145;
      }
      localView = null;
      i = m;
    }
    label145:
    for (;;)
    {
      if (this.wtW == null) {
        this.wtW = new FrameLayout(this.mContext);
      }
      localView = paramListAdapter.getView(j, localView, this.wtW);
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      GMTrace.o(2214726729728L, 16501);
      return k;
    }
  }
  
  @SuppressLint({"WrongCall"})
  public final boolean a(j paramj, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17903705391104L, 133393);
    if ((!isShowing()) && (paramj != null) && (paramj.gxe != null) && (paramj.gxe.size() > 0))
    {
      this.wuc = false;
      this.wub = paramj;
      this.mCount = paramj.gxe.size();
      this.wtX.notifyDataSetChanged();
      this.height = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getHeight();
      TextView localTextView = (TextView)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(R.i.cDv, null);
      paramj = a.a(this.mContext, localTextView.getPaint(), paramj.gxe, paramInt1);
      this.wua = (paramInt2 - this.wtX.getCount() * this.mContext.getResources().getDimensionPixelSize(R.f.aQM) - this.mContext.getResources().getDimensionPixelSize(R.f.aQh));
      new StringBuilder("showPointY=").append(paramInt2).append("verticalOffset=").append(this.wua);
      this.wtY = new MMListPopupWindow(this.mContext, null, 0);
      this.wtY.setOnDismissListener(this);
      this.wtY.RZ = this.wtV;
      this.wtY.setAdapter(this.wtX);
      this.wtY.bZX();
      this.wtY.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.baG));
      this.wtY.setAnimationStyle(this.wtZ);
      this.wtY.RO = paramj.iPS;
      this.wtY.setVerticalOffset(this.wua);
      this.wtY.RX = this.wtW;
      this.wtY.setContentWidth(b(this.wtX));
      this.wtY.fd();
      this.wtY.show();
      this.wtY.wdp.setOnKeyListener(this);
      this.wtY.wdp.setDivider(new ColorDrawable(this.mContext.getResources().getColor(R.e.aOZ)));
      this.wtY.wdp.setSelector(this.mContext.getResources().getDrawable(R.g.aYX));
      this.wtY.wdp.setDividerHeight(1);
      this.wtY.wdp.setVerticalScrollBarEnabled(false);
      this.wtY.wdp.setHorizontalScrollBarEnabled(false);
      GMTrace.o(17903705391104L, 133393);
      return true;
    }
    GMTrace.o(17903705391104L, 133393);
    return false;
  }
  
  public final boolean cca()
  {
    GMTrace.i(2214592512000L, 16500);
    if (isShowing())
    {
      this.wtY.dismiss();
      GMTrace.o(2214592512000L, 16500);
      return true;
    }
    GMTrace.o(2214592512000L, 16500);
    return false;
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(2214458294272L, 16499);
    if ((this.wtY != null) && (this.wtY.hwd.isShowing()))
    {
      GMTrace.o(2214458294272L, 16499);
      return true;
    }
    GMTrace.o(2214458294272L, 16499);
    return false;
  }
  
  public final void onDismiss()
  {
    GMTrace.i(2215129382912L, 16504);
    GMTrace.o(2215129382912L, 16504);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(2214995165184L, 16503);
    GMTrace.o(2214995165184L, 16503);
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2214860947456L, 16502);
    GMTrace.o(2214860947456L, 16502);
    return false;
  }
  
  public static final class a
  {
    private static DisplayMetrics wiJ;
    
    static
    {
      GMTrace.i(2284117295104L, 17018);
      wiJ = null;
      GMTrace.o(2284117295104L, 17018);
    }
    
    public static a a(Context paramContext, TextPaint paramTextPaint, List<j> paramList, int paramInt)
    {
      GMTrace.i(2283983077376L, 17017);
      a locala = new a();
      if (wiJ == null) {
        wiJ = paramContext.getResources().getDisplayMetrics();
      }
      DisplayMetrics localDisplayMetrics = wiJ;
      paramList = paramList.iterator();
      float f1 = 0.0F;
      if (paramList.hasNext())
      {
        float f2 = paramTextPaint.measureText(((j)paramList.next()).name);
        if (f1 >= f2) {
          break label243;
        }
        f1 = f2;
      }
      label243:
      for (;;)
      {
        break;
        int i = (int)f1;
        i = a.fromDPToPix(paramContext, 30) * 2 + i;
        int j = a.fromDPToPix(paramContext, 95);
        if (i < j) {
          i = j;
        }
        for (;;)
        {
          if (paramInt - i / 2 < 0)
          {
            locala.iPR = 0;
            locala.iPS = (localDisplayMetrics.widthPixels - (i + 0));
          }
          for (;;)
          {
            GMTrace.o(2283983077376L, 17017);
            return locala;
            if (localDisplayMetrics.widthPixels - (i / 2 + paramInt) < 0)
            {
              locala.iPR = (localDisplayMetrics.widthPixels - (i + 0));
              locala.iPS = 0;
            }
            else
            {
              locala.iPR = (paramInt - i / 2);
              locala.iPS = (localDisplayMetrics.widthPixels - (i / 2 + paramInt));
            }
          }
        }
      }
    }
    
    public static final class a
    {
      public int iPR;
      public int iPS;
      
      public a()
      {
        GMTrace.i(2517924577280L, 18760);
        GMTrace.o(2517924577280L, 18760);
      }
      
      public final String toString()
      {
        GMTrace.i(2518058795008L, 18761);
        String str = " marginLeft:" + this.iPR + " marginRight:" + this.iPS;
        GMTrace.o(2518058795008L, 18761);
        return str;
      }
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private b()
    {
      GMTrace.i(2173119234048L, 16191);
      GMTrace.o(2173119234048L, 16191);
    }
    
    private j CD(int paramInt)
    {
      GMTrace.i(17898605117440L, 133355);
      j localj = (j)y.this.wub.gxe.get(paramInt);
      GMTrace.o(17898605117440L, 133355);
      return localj;
    }
    
    public final int getCount()
    {
      GMTrace.i(2173253451776L, 16192);
      int i = y.this.mCount;
      GMTrace.o(2173253451776L, 16192);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2173521887232L, 16194);
      long l = paramInt;
      GMTrace.o(2173521887232L, 16194);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2173656104960L, 16195);
      if (paramView == null) {}
      for (paramView = (TextView)y.this.CJ.inflate(R.i.cDv, paramViewGroup, false);; paramView = (TextView)paramView)
      {
        paramViewGroup = CD(paramInt);
        paramView.setTag(paramViewGroup);
        paramView.setText(h.a(y.this.mContext, paramViewGroup.name));
        GMTrace.o(2173656104960L, 16195);
        return paramView;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */