package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  public Object data;
  public int type;
  public boolean wln;
  
  public a(int paramInt, Object paramObject)
  {
    GMTrace.i(21005879738368L, 156506);
    this.type = paramInt;
    this.data = paramObject;
    GMTrace.o(21005879738368L, 156506);
  }
  
  public abstract void a(Context paramContext, a parama, Object... paramVarArgs);
  
  public abstract b aig();
  
  public abstract a aih();
  
  public static abstract interface a {}
  
  public static abstract class b
  {
    public b()
    {
      GMTrace.i(20999168851968L, 156456);
      GMTrace.o(20999168851968L, 156456);
    }
    
    public abstract void a(Context paramContext, a.a parama, a paramVarArgs);
    
    public abstract void a(View paramView, a.a parama);
    
    public abstract boolean a(Context paramContext, a parama, Object... paramVarArgs);
    
    public abstract View b(Context paramContext, View paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\sortview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */