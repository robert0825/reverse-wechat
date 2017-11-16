package com.tencent.mm.plugin.fts.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.Comparator;
import java.util.HashSet;

public final class f
{
  public String eDs;
  public String eQb;
  public ae handler;
  public int lwS;
  public int[] lwT;
  public int[] lwU;
  public int lwV;
  public HashSet<String> lwW;
  public Comparator<i> lwX;
  public j lwY;
  public int scene;
  
  public f()
  {
    GMTrace.i(18636802621440L, 138855);
    this.lwS = 0;
    this.eQb = null;
    this.eDs = null;
    this.lwT = null;
    this.lwU = null;
    this.lwV = Integer.MAX_VALUE;
    this.lwW = new HashSet();
    this.lwX = null;
    this.lwY = null;
    this.handler = null;
    this.scene = -1;
    GMTrace.o(18636802621440L, 138855);
  }
  
  public static f a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt, HashSet<String> paramHashSet, Comparator<i> paramComparator, j paramj, ae paramae)
  {
    GMTrace.i(18636936839168L, 138856);
    f localf = new f();
    localf.eQb = paramString;
    localf.eDs = null;
    localf.lwT = paramArrayOfInt1;
    localf.lwU = paramArrayOfInt2;
    localf.lwV = paramInt;
    localf.lwW = paramHashSet;
    localf.lwX = paramComparator;
    localf.lwY = paramj;
    localf.handler = paramae;
    GMTrace.o(18636936839168L, 138856);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */