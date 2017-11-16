package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.ui.v;

public class NotInterestMenu
  extends LinearLayout
{
  private static int[] plX;
  private Context mContext;
  m oWL;
  private ListView plW;
  c plY;
  b plZ;
  
  static
  {
    GMTrace.i(8872462909440L, 66105);
    plX = new int[] { i.j.pjx, i.j.pjv, i.j.pjw };
    GMTrace.o(8872462909440L, 66105);
  }
  
  public NotInterestMenu(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8871389167616L, 66097);
    this.mContext = null;
    this.oWL = null;
    this.plY = null;
    this.plZ = null;
    this.mContext = paramContext;
    init();
    GMTrace.o(8871389167616L, 66097);
  }
  
  public NotInterestMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8871523385344L, 66098);
    this.mContext = null;
    this.oWL = null;
    this.plY = null;
    this.plZ = null;
    this.mContext = paramContext;
    init();
    GMTrace.o(8871523385344L, 66098);
  }
  
  private void init()
  {
    GMTrace.i(8871657603072L, 66099);
    v.fb(this.mContext).inflate(i.g.peW, this);
    this.plW = ((ListView)findViewById(i.f.pbw));
    this.plW.setAdapter(new a());
    this.plW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(8875013046272L, 66124);
        if (NotInterestMenu.a(NotInterestMenu.this) != null) {
          NotInterestMenu.a(NotInterestMenu.this).bhA();
        }
        if (NotInterestMenu.b(NotInterestMenu.this) != null) {
          switch (paramAnonymousInt)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(8875013046272L, 66124);
          return;
          NotInterestMenu.b(NotInterestMenu.this).c(NotInterestMenu.c(NotInterestMenu.this));
          GMTrace.o(8875013046272L, 66124);
          return;
          NotInterestMenu.b(NotInterestMenu.this).d(NotInterestMenu.c(NotInterestMenu.this));
          GMTrace.o(8875013046272L, 66124);
          return;
          NotInterestMenu.b(NotInterestMenu.this).e(NotInterestMenu.c(NotInterestMenu.this));
        }
      }
    });
    GMTrace.o(8871657603072L, 66099);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(8872731344896L, 66107);
      GMTrace.o(8872731344896L, 66107);
    }
    
    public final int getCount()
    {
      GMTrace.i(8872865562624L, 66108);
      int i = NotInterestMenu.bhz().length;
      GMTrace.o(8872865562624L, 66108);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8872999780352L, 66109);
      paramInt = NotInterestMenu.bhz()[paramInt];
      GMTrace.o(8872999780352L, 66109);
      return Integer.valueOf(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8873133998080L, 66110);
      long l = paramInt;
      GMTrace.o(8873133998080L, 66110);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8873268215808L, 66111);
      View localView = paramView;
      if (paramView == null)
      {
        localView = v.fb(NotInterestMenu.d(NotInterestMenu.this)).inflate(i.g.peX, paramViewGroup, false);
        paramView = new a();
        paramView.pmb = ((TextView)localView.findViewById(i.f.pbx));
        localView.setTag(paramView);
      }
      ((a)localView.getTag()).pmb.setText(NotInterestMenu.bhz()[paramInt]);
      GMTrace.o(8873268215808L, 66111);
      return localView;
    }
    
    final class a
    {
      TextView pmb;
      
      a()
      {
        GMTrace.i(8872597127168L, 66106);
        GMTrace.o(8872597127168L, 66106);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void bhA();
  }
  
  public static abstract interface c
  {
    public abstract void c(m paramm);
    
    public abstract void d(m paramm);
    
    public abstract void e(m paramm);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\abtest\NotInterestMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */