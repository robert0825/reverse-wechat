package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.o;

public abstract class a<T>
  extends o<T>
  implements AbsListView.OnScrollListener
{
  private static final String TAG;
  protected boolean kNw;
  
  static
  {
    GMTrace.i(11753714876416L, 87572);
    TAG = "MicroMsg." + a.class.getName();
    GMTrace.o(11753714876416L, 87572);
  }
  
  public a(Context paramContext, T paramT)
  {
    super(paramContext, paramT);
    GMTrace.i(11752909570048L, 87566);
    lb(true);
    GMTrace.o(11752909570048L, 87566);
  }
  
  public abstract boolean alU();
  
  public abstract int alV();
  
  public abstract int bai();
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11753580658688L, 87571);
    GMTrace.o(11753580658688L, 87571);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11753446440960L, 87570);
    this.kNw = false;
    GMTrace.o(11753446440960L, 87570);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */