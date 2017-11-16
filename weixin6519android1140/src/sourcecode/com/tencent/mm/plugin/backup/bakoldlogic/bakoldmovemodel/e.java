package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.backup.bakoldlogic.a.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.3;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.4;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.5;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  implements a.c
{
  public static LinkedList<String> gOZ;
  public static boolean iXr;
  public static ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> jea;
  public static ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> jeb;
  public com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a jdY;
  public a.c jdZ;
  public com.tencent.mm.sdk.platformtools.aj jec;
  private Object lock;
  
  static
  {
    GMTrace.i(14753615314944L, 109923);
    jea = new ArrayList();
    iXr = false;
    gOZ = null;
    jeb = null;
    GMTrace.o(14753615314944L, 109923);
  }
  
  public e()
  {
    GMTrace.i(14752138919936L, 109912);
    this.lock = new Object();
    GMTrace.o(14752138919936L, 109912);
  }
  
  public static void B(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(14752407355392L, 109914);
    gOZ = paramLinkedList;
    GMTrace.o(14752407355392L, 109914);
  }
  
  public static ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> agb()
  {
    GMTrace.i(14752273137664L, 109913);
    ArrayList localArrayList = jea;
    GMTrace.o(14752273137664L, 109913);
    return localArrayList;
  }
  
  public static LinkedList<String> agc()
  {
    GMTrace.i(14752541573120L, 109915);
    LinkedList localLinkedList = gOZ;
    GMTrace.o(14752541573120L, 109915);
    return localLinkedList;
  }
  
  public static ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> agd()
  {
    GMTrace.i(14752810008576L, 109917);
    ArrayList localArrayList = jeb;
    GMTrace.o(14752810008576L, 109917);
    return localArrayList;
  }
  
  public static boolean age()
  {
    GMTrace.i(14752944226304L, 109918);
    boolean bool = iXr;
    GMTrace.o(14752944226304L, 109918);
    return bool;
  }
  
  public static void n(ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList)
  {
    GMTrace.i(14752675790848L, 109916);
    jeb = paramArrayList;
    GMTrace.o(14752675790848L, 109916);
  }
  
  public final void a(long paramLong1, long paramLong2, ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(14753078444032L, 109919);
    w.i("MicroMsg.BakMoveChooseServer", "onCalcuChooseProgress progress:%d, converSize%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    if (paramBoolean) {
      jea = (ArrayList)paramArrayList.clone();
    }
    if (this.jdZ != null) {
      this.jdZ.a(paramLong1, paramLong2, paramArrayList, paramBoolean);
    }
    GMTrace.o(14753078444032L, 109919);
  }
  
  public final void a(ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, PLong paramPLong, PInt paramPInt)
  {
    GMTrace.i(14753212661760L, 109920);
    Collections.sort(paramArrayList);
    jea = (ArrayList)paramArrayList.clone();
    iXr = true;
    if (this.jdZ != null) {
      this.jdZ.a(paramArrayList, paramPLong, paramPInt);
    }
    GMTrace.o(14753212661760L, 109920);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */