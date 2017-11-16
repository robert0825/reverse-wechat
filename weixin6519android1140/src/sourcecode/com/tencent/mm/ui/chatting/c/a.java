package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.chatting.d.c;

public final class a
{
  public static abstract interface a
    extends c<a.b>
  {
    public abstract void CY(int paramInt);
    
    public abstract String Qb();
    
    public abstract RecyclerView.a an(String paramString, long paramLong);
    
    public abstract <T extends RecyclerView.a> T ceO();
    
    public abstract int ceP();
    
    public abstract void ceQ();
    
    public abstract void ceR();
    
    public abstract boolean ceS();
    
    public abstract void ceT();
    
    public abstract <T extends RecyclerView.h> T fv(Context paramContext);
    
    public abstract RecyclerView.g fw(Context paramContext);
    
    public abstract void onResume();
    
    public abstract void u(boolean paramBoolean, int paramInt);
  }
  
  public static abstract interface b
    extends com.tencent.mm.ui.chatting.f.a<a.a>
  {
    public abstract void CZ(int paramInt);
    
    public abstract void Da(int paramInt);
    
    public abstract void ceR();
    
    public abstract void ceT();
    
    public abstract void ceU();
    
    public abstract void ceV();
    
    public abstract boolean ceW();
    
    public abstract View getChildAt(int paramInt);
    
    public abstract void mj(boolean paramBoolean);
    
    public abstract void v(boolean paramBoolean, int paramInt);
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(14956284084224L, 111433);
      wKn = 1;
      wKo = new int[] { wKn };
      GMTrace.o(14956284084224L, 111433);
    }
    
    public static int[] ceX()
    {
      GMTrace.i(14956149866496L, 111432);
      int[] arrayOfInt = (int[])wKo.clone();
      GMTrace.o(14956149866496L, 111432);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */