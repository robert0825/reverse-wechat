package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.talkroom.a.a;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  implements p.m
{
  private ae handler;
  private final String path;
  private com.tencent.mm.plugin.talkroom.a.b qxb;
  private HashSet<p.l> qxc;
  
  public e()
  {
    GMTrace.i(5151410618368L, 38381);
    this.qxc = new HashSet();
    Object localObject = new File(b.bsh());
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    this.path = (b.bsh() + "talkroomMemberList.info");
    this.handler = new ae(Looper.getMainLooper());
    if (this.qxb == null)
    {
      if (!com.tencent.mm.a.e.aZ(this.path))
      {
        this.qxb = new com.tencent.mm.plugin.talkroom.a.b();
        GMTrace.o(5151410618368L, 38381);
        return;
      }
      try
      {
        localObject = com.tencent.mm.a.e.d(this.path, 0, -1);
        this.qxb = ((com.tencent.mm.plugin.talkroom.a.b)new com.tencent.mm.plugin.talkroom.a.b().aD((byte[])localObject));
        GMTrace.o(5151410618368L, 38381);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", localException, "", new Object[0]);
        this.qxb = new com.tencent.mm.plugin.talkroom.a.b();
      }
    }
    GMTrace.o(5151410618368L, 38381);
  }
  
  private void M(final String paramString1, final String paramString2, final String paramString3)
  {
    GMTrace.i(5152350142464L, 38388);
    Iterator localIterator = this.qxc.iterator();
    while (localIterator.hasNext())
    {
      final p.l locall = (p.l)localIterator.next();
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5149665787904L, 38368);
          locall.E(paramString1, paramString2, paramString3);
          GMTrace.o(5149665787904L, 38368);
        }
      });
    }
    GMTrace.o(5152350142464L, 38388);
  }
  
  private boolean aKC()
  {
    GMTrace.i(5152484360192L, 38389);
    if (this.qxb.qwO.isEmpty())
    {
      com.tencent.mm.loader.stub.b.deleteFile(this.path);
      GMTrace.o(5152484360192L, 38389);
      return true;
    }
    try
    {
      byte[] arrayOfByte = this.qxb.toByteArray();
      com.tencent.mm.a.e.b(this.path, arrayOfByte, arrayOfByte.length);
      GMTrace.o(5152484360192L, 38389);
      return true;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", localException, "", new Object[0]);
      GMTrace.o(5152484360192L, 38389);
    }
    return false;
  }
  
  /* Error */
  public final boolean JD(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 170
    //   5: ldc -84
    //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 84	com/tencent/mm/plugin/talkroom/model/e:qxb	Lcom/tencent/mm/plugin/talkroom/a/b;
    //   14: getfield 150	com/tencent/mm/plugin/talkroom/a/b:qwO	Ljava/util/LinkedList;
    //   17: invokevirtual 173	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 129 1 0
    //   27: ifeq +48 -> 75
    //   30: aload_3
    //   31: invokeinterface 133 1 0
    //   36: checkcast 175	com/tencent/mm/plugin/talkroom/a/a
    //   39: astore 4
    //   41: aload 4
    //   43: getfield 178	com/tencent/mm/plugin/talkroom/a/a:username	Ljava/lang/String;
    //   46: aload_1
    //   47: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   50: ifeq -29 -> 21
    //   53: aload 4
    //   55: getfield 188	com/tencent/mm/plugin/talkroom/a/a:nvM	I
    //   58: ifne -37 -> 21
    //   61: iconst_1
    //   62: istore_2
    //   63: ldc2_w 170
    //   66: ldc -84
    //   68: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: aload_0
    //   72: monitorexit
    //   73: iload_2
    //   74: ireturn
    //   75: iconst_0
    //   76: istore_2
    //   77: ldc2_w 170
    //   80: ldc -84
    //   82: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   85: goto -14 -> 71
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	e
    //   0	93	1	paramString	String
    //   62	15	2	bool	boolean
    //   20	11	3	localIterator	Iterator
    //   39	15	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	21	88	finally
    //   21	61	88	finally
    //   63	71	88	finally
    //   77	85	88	finally
  }
  
  /* Error */
  public final LinkedList<bir> JE(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 191
    //   5: ldc -63
    //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 84	com/tencent/mm/plugin/talkroom/model/e:qxb	Lcom/tencent/mm/plugin/talkroom/a/b;
    //   14: getfield 150	com/tencent/mm/plugin/talkroom/a/b:qwO	Ljava/util/LinkedList;
    //   17: invokevirtual 173	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   20: astore_2
    //   21: aload_2
    //   22: invokeinterface 129 1 0
    //   27: ifeq +47 -> 74
    //   30: aload_2
    //   31: invokeinterface 133 1 0
    //   36: checkcast 175	com/tencent/mm/plugin/talkroom/a/a
    //   39: astore_3
    //   40: aload_3
    //   41: getfield 178	com/tencent/mm/plugin/talkroom/a/a:username	Ljava/lang/String;
    //   44: aload_1
    //   45: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   48: ifeq -27 -> 21
    //   51: aload_3
    //   52: getfield 196	com/tencent/mm/plugin/talkroom/a/a:eNM	Ljava/util/LinkedList;
    //   55: invokevirtual 199	java/util/LinkedList:clone	()Ljava/lang/Object;
    //   58: checkcast 152	java/util/LinkedList
    //   61: astore_1
    //   62: ldc2_w 191
    //   65: ldc -63
    //   67: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: areturn
    //   74: new 152	java/util/LinkedList
    //   77: dup
    //   78: invokespecial 200	java/util/LinkedList:<init>	()V
    //   81: astore_1
    //   82: ldc2_w 191
    //   85: ldc -63
    //   87: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: goto -20 -> 70
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	e
    //   0	98	1	paramString	String
    //   20	11	2	localIterator	Iterator
    //   39	13	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	21	93	finally
    //   21	70	93	finally
    //   74	90	93	finally
  }
  
  public final void a(p.l paraml)
  {
    try
    {
      GMTrace.i(5151544836096L, 38382);
      this.qxc.add(paraml);
      GMTrace.o(5151544836096L, 38382);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public final void a(String paramString1, LinkedList<bir> paramLinkedList, String paramString2, String paramString3, int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(5152215924736L, 38387);
        localObject = paramLinkedList;
        if (paramLinkedList == null) {
          localObject = new LinkedList();
        }
        w.i("MicroMsg.TalkRoomInfoListMgr", "updateList talk: %s,  size: %d", new Object[] { paramString1, Integer.valueOf(((LinkedList)localObject).size()) });
        paramLinkedList = (LinkedList)((LinkedList)localObject).clone();
        boolean bool = paramLinkedList.isEmpty();
        localObject = this.qxb.qwO.iterator();
        if (((Iterator)localObject).hasNext())
        {
          a locala = (a)((Iterator)localObject).next();
          if (!locala.username.equals(paramString1)) {
            continue;
          }
          if (bool)
          {
            this.qxb.qwO.remove(locala);
            aKC();
            M(paramString1, paramString2, paramString3);
            GMTrace.o(5152215924736L, 38387);
            return;
          }
          locala.eNM = paramLinkedList;
          locala.nvM = paramInt;
          continue;
        }
        if (bool) {
          break label222;
        }
      }
      finally {}
      Object localObject = new a();
      ((a)localObject).username = paramString1;
      ((a)localObject).eNM = paramLinkedList;
      ((a)localObject).nvM = paramInt;
      this.qxb.qwO.add(localObject);
      label222:
      aKC();
      M(paramString1, paramString2, paramString3);
      GMTrace.o(5152215924736L, 38387);
    }
  }
  
  public final void b(p.l paraml)
  {
    try
    {
      GMTrace.i(5151679053824L, 38383);
      this.qxc.remove(paraml);
      GMTrace.o(5151679053824L, 38383);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  /* Error */
  public final boolean bsm()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 245
    //   5: ldc -9
    //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 84	com/tencent/mm/plugin/talkroom/model/e:qxb	Lcom/tencent/mm/plugin/talkroom/a/b;
    //   14: getfield 150	com/tencent/mm/plugin/talkroom/a/b:qwO	Ljava/util/LinkedList;
    //   17: invokevirtual 173	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   20: astore_2
    //   21: aload_2
    //   22: invokeinterface 129 1 0
    //   27: ifeq +76 -> 103
    //   30: aload_2
    //   31: invokeinterface 133 1 0
    //   36: checkcast 175	com/tencent/mm/plugin/talkroom/a/a
    //   39: astore_3
    //   40: aload_3
    //   41: getfield 188	com/tencent/mm/plugin/talkroom/a/a:nvM	I
    //   44: ifne -23 -> 21
    //   47: aload_3
    //   48: getfield 196	com/tencent/mm/plugin/talkroom/a/a:eNM	Ljava/util/LinkedList;
    //   51: invokevirtual 173	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   54: astore_3
    //   55: aload_3
    //   56: invokeinterface 129 1 0
    //   61: ifeq -40 -> 21
    //   64: aload_3
    //   65: invokeinterface 133 1 0
    //   70: checkcast 249	com/tencent/mm/protocal/c/bir
    //   73: astore 4
    //   75: invokestatic 254	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   78: aload 4
    //   80: getfield 257	com/tencent/mm/protocal/c/bir:jhi	Ljava/lang/String;
    //   83: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   86: ifeq -31 -> 55
    //   89: iconst_1
    //   90: istore_1
    //   91: ldc2_w 245
    //   94: ldc -9
    //   96: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: aload_0
    //   100: monitorexit
    //   101: iload_1
    //   102: ireturn
    //   103: iconst_0
    //   104: istore_1
    //   105: ldc2_w 245
    //   108: ldc -9
    //   110: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: goto -14 -> 99
    //   116: astore_2
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_2
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	e
    //   90	15	1	bool	boolean
    //   20	11	2	localIterator	Iterator
    //   116	4	2	localObject1	Object
    //   39	26	3	localObject2	Object
    //   73	6	4	localbir	bir
    // Exception table:
    //   from	to	target	type
    //   2	21	116	finally
    //   21	55	116	finally
    //   55	89	116	finally
    //   91	99	116	finally
    //   105	113	116	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */