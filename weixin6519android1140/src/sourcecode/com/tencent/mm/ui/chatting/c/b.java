package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.ui.chatting.a.b.e;
import com.tencent.mm.ui.chatting.d.c;
import com.tencent.mm.ui.chatting.f.a;

public final class b
{
  public static abstract interface a
    extends c<b.b>
  {
    public abstract String Qb();
    
    public abstract RecyclerView.a Wr(String paramString);
    
    public abstract RecyclerView.g ceY();
    
    public abstract void ceZ();
    
    public abstract b.e cfa();
    
    public abstract p.a cfb();
    
    public abstract String cfc();
    
    public abstract <T extends RecyclerView.h> T fv(Context paramContext);
    
    public abstract int getType();
  }
  
  public static abstract interface b
    extends a<b.a>
  {
    public abstract void bf(String paramString, boolean paramBoolean);
    
    public abstract void cfd();
    
    public abstract void onFinish();
    
    public abstract void v(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */