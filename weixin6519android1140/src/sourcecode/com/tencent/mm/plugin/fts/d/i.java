package com.tencent.mm.plugin.fts.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public abstract interface i
{
  public abstract void Ty();
  
  public abstract void a(String paramString, ae paramae, HashSet<String> paramHashSet);
  
  public abstract void aCw();
  
  public abstract LinkedList<Integer> aCx();
  
  public abstract int getType();
  
  public abstract int oa(int paramInt);
  
  public abstract a ob(int paramInt);
  
  public static final class a
  {
    public int gRj;
    public List<String> hWm;
    public int lzE;
    public boolean lzF;
    public int lzG;
    public boolean lzH;
    public List<com.tencent.mm.plugin.fts.a.a.i> lzI;
    public int lzJ;
    
    public a()
    {
      GMTrace.i(16701248765952L, 124434);
      this.lzE = Integer.MAX_VALUE;
      this.lzF = true;
      this.lzG = Integer.MAX_VALUE;
      this.lzH = false;
      this.gRj = 0;
      this.lzI = null;
      this.hWm = new LinkedList();
      this.lzJ = 0;
      GMTrace.o(16701248765952L, 124434);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(i parami, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */