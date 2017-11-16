package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.k.f;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements Serializable, Iterable<a>
{
  LinkedList<a> fKX;
  
  public a()
  {
    GMTrace.i(512309067776L, 3817);
    GMTrace.o(512309067776L, 3817);
  }
  
  private void save()
  {
    try
    {
      GMTrace.i(512711720960L, 3820);
      if (this.fKX == null) {
        GMTrace.o(512711720960L, 3820);
      }
      for (;;)
      {
        return;
        w.d("MicroMsg.NotificationAppMsgQueue", "save: size: %d", new Object[] { Integer.valueOf(this.fKX.size()) });
        if (this.fKX.isEmpty())
        {
          f.tI().edit().putString("com.tencent.preference.notification.key.queue", "").apply();
          w.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", new Object[] { Integer.valueOf(this.fKX.size()), toString() });
          GMTrace.o(512711720960L, 3820);
          continue;
        }
        try
        {
          LinkedList localLinkedList = new LinkedList(this.fKX);
          f.tI().edit().putString("com.tencent.preference.notification.key.queue", c.a(localLinkedList)).apply();
          w.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", new Object[] { Integer.valueOf(this.fKX.size()), toString() });
          GMTrace.o(512711720960L, 3820);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", localIOException, "", new Object[0]);
          }
        }
      }
    }
    finally {}
  }
  
  public final boolean aO(int paramInt)
  {
    for (;;)
    {
      boolean bool;
      int i;
      try
      {
        GMTrace.i(513114374144L, 3823);
        if (paramInt == -1)
        {
          GMTrace.o(513114374144L, 3823);
          bool = false;
          return bool;
        }
        if (this.fKX == null) {
          restore();
        }
        LinkedList localLinkedList1 = new LinkedList();
        Iterator localIterator = this.fKX.iterator();
        i = 0;
        if (!localIterator.hasNext()) {
          break label116;
        }
        a locala = (a)localIterator.next();
        if (locala.fKY != paramInt)
        {
          localLinkedList1.add(locala);
          continue;
        }
        i = 1;
      }
      finally {}
      continue;
      label116:
      if (i != 0)
      {
        this.fKX = localLinkedList2;
        save();
        GMTrace.o(513114374144L, 3823);
        bool = true;
      }
      else
      {
        GMTrace.o(513114374144L, 3823);
        bool = false;
      }
    }
  }
  
  public final void b(NotificationItem paramNotificationItem)
  {
    int i = 1;
    label271:
    for (;;)
    {
      try
      {
        GMTrace.i(512845938688L, 3821);
        if (paramNotificationItem == null)
        {
          GMTrace.o(512845938688L, 3821);
          return;
        }
        if (this.fKX == null) {
          restore();
        }
        aO(paramNotificationItem.id);
        if ((paramNotificationItem.fKS) && (!t.nm(paramNotificationItem.fKP)))
        {
          Object localObject = this.fKX.iterator();
          if (((Iterator)localObject).hasNext())
          {
            a locala = (a)((Iterator)localObject).next();
            if (!locala.userName.equals(paramNotificationItem.fKP)) {
              break label271;
            }
            locala.a(paramNotificationItem.id, paramNotificationItem.fKQ, paramNotificationItem.fKP, paramNotificationItem.fKR, paramNotificationItem.fKS, paramNotificationItem.fKT);
            i = 0;
            break label271;
          }
          if (i != 0)
          {
            localObject = new a(paramNotificationItem.id, paramNotificationItem.fKQ, paramNotificationItem.fKP, paramNotificationItem.fKR, paramNotificationItem.fKS, paramNotificationItem.fKT);
            this.fKX.add(localObject);
            w.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
          }
          save();
          GMTrace.o(512845938688L, 3821);
          continue;
        }
        this.fKX.add(new a(paramNotificationItem.id, paramNotificationItem.fKS));
      }
      finally {}
      w.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
    }
  }
  
  public final List<Integer> dY(int paramInt)
  {
    try
    {
      GMTrace.i(512980156416L, 3822);
      if (this.fKX == null) {
        restore();
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (((locala.fKZ & paramInt) != 0) && (!localArrayList.contains(Integer.valueOf(locala.fKY)))) {
          localArrayList.add(Integer.valueOf(locala.fKY));
        }
      }
      GMTrace.o(512980156416L, 3822);
    }
    finally {}
    return localList;
  }
  
  /* Error */
  public final boolean dx(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 217
    //   5: sipush 3824
    //   8: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc 40
    //   13: ldc -36
    //   15: iconst_1
    //   16: anewarray 5	java/lang/Object
    //   19: dup
    //   20: iconst_0
    //   21: aload_1
    //   22: aastore
    //   23: invokestatic 97	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_1
    //   27: invokestatic 167	com/tencent/mm/platformtools/t:nm	(Ljava/lang/String;)Z
    //   30: ifeq +18 -> 48
    //   33: ldc2_w 217
    //   36: sipush 3824
    //   39: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: iconst_0
    //   43: istore_2
    //   44: aload_0
    //   45: monitorexit
    //   46: iload_2
    //   47: ireturn
    //   48: aload_0
    //   49: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   52: ifnonnull +7 -> 59
    //   55: aload_0
    //   56: invokevirtual 118	com/tencent/mm/booter/notification/queue/a:restore	()V
    //   59: aload_0
    //   60: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   63: invokevirtual 123	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   66: astore_3
    //   67: aload_3
    //   68: invokeinterface 128 1 0
    //   73: ifeq +54 -> 127
    //   76: aload_3
    //   77: invokeinterface 132 1 0
    //   82: checkcast 11	com/tencent/mm/booter/notification/queue/a$a
    //   85: astore 4
    //   87: aload_1
    //   88: aload 4
    //   90: getfield 170	com/tencent/mm/booter/notification/queue/a$a:userName	Ljava/lang/String;
    //   93: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq -29 -> 67
    //   99: aload_0
    //   100: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   103: aload 4
    //   105: invokevirtual 223	java/util/LinkedList:remove	(Ljava/lang/Object;)Z
    //   108: pop
    //   109: aload_0
    //   110: invokespecial 142	com/tencent/mm/booter/notification/queue/a:save	()V
    //   113: ldc2_w 217
    //   116: sipush 3824
    //   119: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: iconst_1
    //   123: istore_2
    //   124: goto -80 -> 44
    //   127: ldc2_w 217
    //   130: sipush 3824
    //   133: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: iconst_0
    //   137: istore_2
    //   138: goto -94 -> 44
    //   141: astore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: aload_1
    //   145: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	a
    //   0	146	1	paramString	String
    //   43	95	2	bool	boolean
    //   66	11	3	localIterator	Iterator
    //   85	19	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	42	141	finally
    //   48	59	141	finally
    //   59	67	141	finally
    //   67	122	141	finally
    //   127	136	141	finally
  }
  
  public final Iterator<a> iterator()
  {
    GMTrace.i(513382809600L, 3825);
    if (this.fKX == null) {
      restore();
    }
    Iterator localIterator = this.fKX.iterator();
    GMTrace.o(513382809600L, 3825);
    return localIterator;
  }
  
  /* Error */
  public final void restore()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 229
    //   5: sipush 3819
    //   8: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 70	com/tencent/mm/k/f:tI	()Landroid/content/SharedPreferences;
    //   14: ldc 78
    //   16: ldc 80
    //   18: invokeinterface 234 3 0
    //   23: astore_1
    //   24: aload_0
    //   25: aload_1
    //   26: invokestatic 238	com/tencent/mm/booter/notification/queue/c:dz	(Ljava/lang/String;)Ljava/io/Serializable;
    //   29: checkcast 44	java/util/LinkedList
    //   32: putfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   35: aload_0
    //   36: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   39: ifnonnull +14 -> 53
    //   42: aload_0
    //   43: new 44	java/util/LinkedList
    //   46: dup
    //   47: invokespecial 119	java/util/LinkedList:<init>	()V
    //   50: putfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   53: ldc 40
    //   55: ldc -16
    //   57: iconst_2
    //   58: anewarray 5	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload_0
    //   64: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   67: invokevirtual 48	java/util/LinkedList:size	()I
    //   70: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: aload_0
    //   77: invokevirtual 95	com/tencent/mm/booter/notification/queue/a:toString	()Ljava/lang/String;
    //   80: aastore
    //   81: invokestatic 97	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: ldc2_w 229
    //   87: sipush 3819
    //   90: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore_1
    //   97: ldc 40
    //   99: aload_1
    //   100: ldc 80
    //   102: iconst_0
    //   103: anewarray 5	java/lang/Object
    //   106: invokestatic 111	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   113: ifnonnull -60 -> 53
    //   116: aload_0
    //   117: new 44	java/util/LinkedList
    //   120: dup
    //   121: invokespecial 119	java/util/LinkedList:<init>	()V
    //   124: putfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   127: goto -74 -> 53
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_1
    //   134: athrow
    //   135: astore_1
    //   136: aload_0
    //   137: getfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   140: ifnonnull +14 -> 154
    //   143: aload_0
    //   144: new 44	java/util/LinkedList
    //   147: dup
    //   148: invokespecial 119	java/util/LinkedList:<init>	()V
    //   151: putfield 38	com/tencent/mm/booter/notification/queue/a:fKX	Ljava/util/LinkedList;
    //   154: aload_1
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	a
    //   23	3	1	str	String
    //   96	4	1	localException	Exception
    //   130	4	1	localObject1	Object
    //   135	20	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   24	35	96	java/lang/Exception
    //   2	24	130	finally
    //   35	53	130	finally
    //   53	93	130	finally
    //   109	127	130	finally
    //   136	154	130	finally
    //   154	156	130	finally
    //   24	35	135	finally
    //   97	109	135	finally
  }
  
  public final String toString()
  {
    GMTrace.i(512443285504L, 3818);
    Iterator localIterator = this.fKX.iterator();
    a locala;
    for (String str = ""; localIterator.hasNext(); str = str + locala.toString() + ";  ") {
      locala = (a)localIterator.next();
    }
    GMTrace.o(512443285504L, 3818);
    return str;
  }
  
  public static final class a
    implements Serializable
  {
    public long eDr;
    public int fKA;
    public boolean fKS;
    public int fKY;
    public int fKZ;
    public String userName;
    
    public a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      GMTrace.i(511235325952L, 3809);
      this.eDr = -1L;
      this.userName = "";
      this.fKS = false;
      this.fKZ = 0;
      a(paramInt1, paramLong, paramString, paramInt2, paramBoolean, paramInt3);
      GMTrace.o(511235325952L, 3809);
    }
    
    public a(int paramInt, boolean paramBoolean)
    {
      GMTrace.i(511369543680L, 3810);
      this.eDr = -1L;
      this.userName = "";
      this.fKS = false;
      this.fKZ = 0;
      this.fKY = paramInt;
      this.fKS = paramBoolean;
      GMTrace.o(511369543680L, 3810);
    }
    
    public final void a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      GMTrace.i(511503761408L, 3811);
      this.fKY = paramInt1;
      this.eDr = paramLong;
      this.userName = paramString;
      this.fKA = paramInt2;
      this.fKS = paramBoolean;
      this.fKZ = paramInt3;
      GMTrace.o(511503761408L, 3811);
    }
    
    public final String toString()
    {
      GMTrace.i(511637979136L, 3812);
      String str = this.userName + " id:" + this.eDr + " unReadCount:" + this.fKA + "　notificationId:" + this.fKY;
      GMTrace.o(511637979136L, 3812);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\queue\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */