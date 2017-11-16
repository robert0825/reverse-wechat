package com.tencent.mm.plugin.location.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.location.a.a;
import com.tencent.mm.pluginsdk.p.q;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  implements p.r
{
  private List<p.q> gEV;
  private ae handler;
  private com.tencent.mm.plugin.location.a.b myk;
  private final String path;
  
  public p()
  {
    GMTrace.i(9632135249920L, 71765);
    this.gEV = new LinkedList();
    Object localObject = new File(l.aKr());
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    this.path = (l.aKr() + "trackroominfolist.info");
    this.handler = new ae(Looper.getMainLooper());
    if (this.myk == null)
    {
      if (!e.aZ(this.path))
      {
        this.myk = new com.tencent.mm.plugin.location.a.b();
        GMTrace.o(9632135249920L, 71765);
        return;
      }
      try
      {
        localObject = e.d(this.path, 0, -1);
        this.myk = ((com.tencent.mm.plugin.location.a.b)new com.tencent.mm.plugin.location.a.b().aD((byte[])localObject));
        GMTrace.o(9632135249920L, 71765);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
        this.myk = new com.tencent.mm.plugin.location.a.b();
      }
    }
    GMTrace.o(9632135249920L, 71765);
  }
  
  private void M(final String paramString1, final String paramString2, final String paramString3)
  {
    GMTrace.i(9632940556288L, 71771);
    Iterator localIterator = this.gEV.iterator();
    while (localIterator.hasNext())
    {
      final p.q localq = (p.q)localIterator.next();
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9643543756800L, 71850);
          localq.Oc(paramString1);
          GMTrace.o(9643543756800L, 71850);
        }
      });
    }
    GMTrace.o(9632940556288L, 71771);
  }
  
  private boolean aKC()
  {
    GMTrace.i(9633074774016L, 71772);
    w.d("MicroMsg.TrackRoomListMgr", "infoFile infolist size %d", new Object[] { Integer.valueOf(this.myk.mwE.size()) });
    if (this.myk.mwE.isEmpty())
    {
      com.tencent.mm.loader.stub.b.deleteFile(this.path);
      GMTrace.o(9633074774016L, 71772);
      return true;
    }
    try
    {
      byte[] arrayOfByte = this.myk.toByteArray();
      e.b(this.path, arrayOfByte, arrayOfByte.length);
      GMTrace.o(9633074774016L, 71772);
      return true;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
      GMTrace.o(9633074774016L, 71772);
    }
    return false;
  }
  
  /* Error */
  public final LinkedList<String> Bh(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 186
    //   5: ldc -68
    //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 84	com/tencent/mm/plugin/location/model/p:myk	Lcom/tencent/mm/plugin/location/a/b;
    //   14: getfield 154	com/tencent/mm/plugin/location/a/b:mwE	Ljava/util/LinkedList;
    //   17: invokevirtual 189	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   20: astore_2
    //   21: aload_2
    //   22: invokeinterface 131 1 0
    //   27: ifeq +47 -> 74
    //   30: aload_2
    //   31: invokeinterface 135 1 0
    //   36: checkcast 191	com/tencent/mm/plugin/location/a/a
    //   39: astore_3
    //   40: aload_3
    //   41: getfield 194	com/tencent/mm/plugin/location/a/a:username	Ljava/lang/String;
    //   44: aload_1
    //   45: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   48: ifeq -27 -> 21
    //   51: aload_3
    //   52: getfield 203	com/tencent/mm/plugin/location/a/a:eNM	Ljava/util/LinkedList;
    //   55: invokevirtual 206	java/util/LinkedList:clone	()Ljava/lang/Object;
    //   58: checkcast 34	java/util/LinkedList
    //   61: astore_1
    //   62: ldc2_w 186
    //   65: ldc -68
    //   67: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: areturn
    //   74: new 34	java/util/LinkedList
    //   77: dup
    //   78: invokespecial 35	java/util/LinkedList:<init>	()V
    //   81: astore_1
    //   82: ldc2_w 186
    //   85: ldc -68
    //   87: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: goto -20 -> 70
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	p
    //   0	98	1	paramString	String
    //   20	11	2	localIterator	Iterator
    //   39	13	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	21	93	finally
    //   21	70	93	finally
    //   74	90	93	finally
  }
  
  /* Error */
  public final a Bi(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 211
    //   5: ldc -43
    //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 84	com/tencent/mm/plugin/location/model/p:myk	Lcom/tencent/mm/plugin/location/a/b;
    //   14: getfield 154	com/tencent/mm/plugin/location/a/b:mwE	Ljava/util/LinkedList;
    //   17: invokevirtual 189	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 131 1 0
    //   27: ifeq +38 -> 65
    //   30: aload_3
    //   31: invokeinterface 135 1 0
    //   36: checkcast 191	com/tencent/mm/plugin/location/a/a
    //   39: astore_2
    //   40: aload_2
    //   41: getfield 194	com/tencent/mm/plugin/location/a/a:username	Ljava/lang/String;
    //   44: aload_1
    //   45: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   48: ifeq -27 -> 21
    //   51: ldc2_w 211
    //   54: ldc -43
    //   56: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: aload_2
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: areturn
    //   65: aconst_null
    //   66: astore_1
    //   67: ldc2_w 211
    //   70: ldc -43
    //   72: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: goto -14 -> 61
    //   78: astore_1
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	p
    //   0	83	1	paramString	String
    //   39	21	2	locala	a
    //   20	11	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	21	78	finally
    //   21	59	78	finally
    //   67	75	78	finally
  }
  
  public final boolean Bj(String paramString)
  {
    GMTrace.i(9633208991744L, 71773);
    if (Bh(paramString).size() > 0)
    {
      GMTrace.o(9633208991744L, 71773);
      return true;
    }
    GMTrace.o(9633208991744L, 71773);
    return false;
  }
  
  public final void Bk(String paramString)
  {
    GMTrace.i(9633745862656L, 71777);
    if (this.myk != null) {
      this.myk.mwF = paramString;
    }
    aKC();
    GMTrace.o(9633745862656L, 71777);
  }
  
  public final void a(p.q paramq)
  {
    try
    {
      GMTrace.i(9632269467648L, 71766);
      this.gEV.add(paramq);
      GMTrace.o(9632269467648L, 71766);
      return;
    }
    finally
    {
      paramq = finally;
      throw paramq;
    }
  }
  
  public final void a(String paramString1, LinkedList<String> paramLinkedList, double paramDouble1, double paramDouble2, String paramString2, String paramString3, String paramString4)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(9632806338560L, 71770);
        localObject = paramLinkedList;
        if (paramLinkedList == null) {
          localObject = new LinkedList();
        }
        w.i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", new Object[] { paramString1, Integer.valueOf(((LinkedList)localObject).size()), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
        paramLinkedList = (LinkedList)((LinkedList)localObject).clone();
        boolean bool = paramLinkedList.isEmpty();
        localObject = this.myk.mwE.iterator();
        if (((Iterator)localObject).hasNext())
        {
          a locala = (a)((Iterator)localObject).next();
          if (!locala.username.equals(paramString1)) {
            continue;
          }
          if (bool)
          {
            this.myk.mwE.remove(locala);
            aKC();
            M(paramString1, paramString3, paramString4);
            GMTrace.o(9632806338560L, 71770);
            return;
          }
          locala.eNM = paramLinkedList;
          locala.mwD = paramString2;
          locala.latitude = paramDouble1;
          locala.longitude = paramDouble2;
          continue;
        }
        if (bool) {
          break label264;
        }
      }
      finally {}
      Object localObject = new a();
      ((a)localObject).username = paramString1;
      ((a)localObject).eNM = paramLinkedList;
      ((a)localObject).mwD = paramString2;
      ((a)localObject).latitude = paramDouble1;
      ((a)localObject).longitude = paramDouble2;
      this.myk.mwE.add(localObject);
      label264:
      aKC();
      M(paramString1, paramString3, paramString4);
      GMTrace.o(9632806338560L, 71770);
    }
  }
  
  public final boolean aKD()
  {
    GMTrace.i(9633343209472L, 71774);
    String str;
    do
    {
      Iterator localIterator = this.myk.mwE.iterator();
      Object localObject;
      while (!((Iterator)localObject).hasNext())
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (a)localIterator.next();
        w.d("MicroMsg.TrackRoomListMgr", "info :" + ((a)localObject).eNM.size());
        localObject = ((a)localObject).eNM.iterator();
      }
      str = (String)((Iterator)localObject).next();
      w.d("MicroMsg.TrackRoomListMgr", "member :" + str);
    } while (!str.equals(q.zE()));
    w.i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
    GMTrace.o(9633343209472L, 71774);
    return true;
    GMTrace.o(9633343209472L, 71774);
    return false;
  }
  
  public final String aKE()
  {
    GMTrace.i(9633611644928L, 71776);
    if (this.myk != null)
    {
      String str = this.myk.mwF;
      GMTrace.o(9633611644928L, 71776);
      return str;
    }
    GMTrace.o(9633611644928L, 71776);
    return "";
  }
  
  public final void b(p.q paramq)
  {
    try
    {
      GMTrace.i(9632403685376L, 71767);
      this.gEV.remove(paramq);
      GMTrace.o(9632403685376L, 71767);
      return;
    }
    finally
    {
      paramq = finally;
      throw paramq;
    }
  }
  
  public final boolean cM(String paramString1, String paramString2)
  {
    GMTrace.i(9633477427200L, 71775);
    boolean bool = Bh(paramString1).contains(paramString2);
    GMTrace.o(9633477427200L, 71775);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */