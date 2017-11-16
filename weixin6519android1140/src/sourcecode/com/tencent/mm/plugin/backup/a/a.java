package com.tencent.mm.plugin.backup.a;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a
{
  private static String TAG;
  private static LinkedList<a> iUV;
  
  static
  {
    GMTrace.i(14727845511168L, 109731);
    TAG = "MicroMsg.BackupBaseModel";
    iUV = new LinkedList();
    GMTrace.o(14727845511168L, 109731);
  }
  
  public a()
  {
    GMTrace.i(14727308640256L, 109727);
    GMTrace.o(14727308640256L, 109727);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(14727442857984L, 109728);
    iUV.add(parama);
    GMTrace.o(14727442857984L, 109728);
  }
  
  public static void aeb()
  {
    GMTrace.i(14727577075712L, 109729);
    Iterator localIterator = iUV.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).aec();
    }
    iUV.clear();
    GMTrace.o(14727577075712L, 109729);
  }
  
  public abstract void aec();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */