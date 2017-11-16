package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.mm.MMLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mars.stn.StnLogic.Task;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class z
{
  final a[] hht;
  
  public z()
  {
    GMTrace.i(13706582818816L, 102122);
    this.hht = new a[100];
    GMTrace.o(13706582818816L, 102122);
  }
  
  final boolean OM()
  {
    GMTrace.i(13706851254272L, 102124);
    a[] arrayOfa = this.hht;
    int i = 0;
    for (;;)
    {
      if (i < 100) {}
      try
      {
        if ((this.hht[i] != null) && ((701 == this.hht[i].hhx.getType()) || (702 == this.hht[i].hhx.getType())))
        {
          w.w("MicroMsg.MMNativeNetTaskAdapter", "hasAuthCmd Auth inQueue: netid=" + i + " type=" + this.hht[i].hhx.getType());
          GMTrace.o(13706851254272L, 102124);
          return true;
        }
      }
      catch (RemoteException localRemoteException)
      {
        this.hht[i] = null;
        w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bg.f(localRemoteException), Integer.valueOf(i) });
        break label180;
        GMTrace.o(13706851254272L, 102124);
        return false;
      }
      finally {}
      label180:
      i += 1;
    }
  }
  
  final boolean ON()
  {
    GMTrace.i(13706985472000L, 102125);
    a[] arrayOfa = this.hht;
    int i = 0;
    for (;;)
    {
      if (i < 100) {}
      try
      {
        if ((this.hht[i] != null) && (1000 == this.hht[i].hhx.getType()))
        {
          w.w("MicroMsg.MMNativeNetTaskAdapter", "hasWithoutLoginCmd inQueue: netid=" + i + " type=" + this.hht[i].hhx.getType());
          GMTrace.o(13706985472000L, 102125);
          return true;
        }
      }
      catch (RemoteException localRemoteException)
      {
        this.hht[i] = null;
        w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bg.f(localRemoteException), Integer.valueOf(i) });
        break label160;
        GMTrace.o(13706985472000L, 102125);
        return false;
      }
      finally {}
      label160:
      i += 1;
    }
  }
  
  public final int OO()
  {
    GMTrace.i(13707253907456L, 102127);
    int i = 0;
    int k;
    for (int j = 0; i < 100; j = k)
    {
      k = j;
      try
      {
        if (this.hht[i] != null)
        {
          this.hht[i].hhx.getType();
          k = j;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bg.f(localRemoteException), Integer.valueOf(i) });
          k = j + 1;
          this.hht[i] = null;
        }
      }
      i += 1;
    }
    GMTrace.o(13707253907456L, 102127);
    return j;
  }
  
  /* Error */
  final int a(int paramInt, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    // Byte code:
    //   0: ldc2_w 107
    //   3: ldc 109
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   12: astore 7
    //   14: aload 7
    //   16: monitorenter
    //   17: aload_0
    //   18: iload_1
    //   19: invokevirtual 113	com/tencent/mm/network/z:hx	(I)I
    //   22: istore 5
    //   24: iconst_m1
    //   25: iload 5
    //   27: if_icmpne +16 -> 43
    //   30: aload 7
    //   32: monitorexit
    //   33: ldc2_w 107
    //   36: ldc 109
    //   38: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: iconst_m1
    //   42: ireturn
    //   43: getstatic 119	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_DEFAULT	I
    //   46: istore_1
    //   47: aload_0
    //   48: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   51: iload 5
    //   53: aaload
    //   54: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   57: invokeinterface 123 1 0
    //   62: invokeinterface 129 1 0
    //   67: astore 8
    //   69: aload_0
    //   70: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   73: iload 5
    //   75: aaload
    //   76: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   79: invokeinterface 133 1 0
    //   84: astore 9
    //   86: aload 9
    //   88: aload_0
    //   89: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   92: iload 5
    //   94: aaload
    //   95: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   98: invokeinterface 47 1 0
    //   103: aload_2
    //   104: aload 8
    //   106: invokeinterface 138 4 0
    //   111: ifeq +266 -> 377
    //   114: aload 9
    //   116: invokeinterface 141 1 0
    //   121: istore 5
    //   123: aload 4
    //   125: iconst_0
    //   126: iconst_0
    //   127: iastore
    //   128: iload 5
    //   130: iconst_2
    //   131: iand
    //   132: ifne +25 -> 157
    //   135: aload 4
    //   137: iconst_0
    //   138: aload 4
    //   140: iconst_0
    //   141: iaload
    //   142: iconst_2
    //   143: ior
    //   144: iastore
    //   145: getstatic 147	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   148: ldc2_w 148
    //   151: lconst_0
    //   152: lconst_1
    //   153: iconst_0
    //   154: invokevirtual 152	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   157: iload 5
    //   159: iconst_4
    //   160: iand
    //   161: ifne +25 -> 186
    //   164: aload 4
    //   166: iconst_0
    //   167: aload 4
    //   169: iconst_0
    //   170: iaload
    //   171: iconst_4
    //   172: ior
    //   173: iastore
    //   174: getstatic 147	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   177: ldc2_w 148
    //   180: lconst_1
    //   181: lconst_1
    //   182: iconst_0
    //   183: invokevirtual 152	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   186: aload 9
    //   188: invokeinterface 155 1 0
    //   193: ifnull +28 -> 221
    //   196: bipush -13
    //   198: aload 9
    //   200: invokeinterface 158 1 0
    //   205: if_icmpne +16 -> 221
    //   208: invokestatic 164	com/tencent/mm/network/aa:OY	()Lcom/tencent/mm/network/t;
    //   211: ifnull +10 -> 221
    //   214: invokestatic 164	com/tencent/mm/network/aa:OY	()Lcom/tencent/mm/network/t;
    //   217: invokevirtual 169	com/tencent/mm/network/t:OF	()Z
    //   220: pop
    //   221: bipush -13
    //   223: aload 9
    //   225: invokeinterface 158 1 0
    //   230: if_icmpne +41 -> 271
    //   233: getstatic 172	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_SESSION_TIMEOUT	I
    //   236: istore 6
    //   238: iload 6
    //   240: istore_1
    //   241: iload 6
    //   243: istore 5
    //   245: aload_3
    //   246: iconst_0
    //   247: aload 9
    //   249: invokeinterface 158 1 0
    //   254: iastore
    //   255: iload 6
    //   257: istore_1
    //   258: aload 7
    //   260: monitorexit
    //   261: ldc2_w 107
    //   264: ldc 109
    //   266: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   269: iload_1
    //   270: ireturn
    //   271: sipush 62534
    //   274: aload 9
    //   276: invokeinterface 158 1 0
    //   281: if_icmpeq +16 -> 297
    //   284: sipush 62533
    //   287: aload 9
    //   289: invokeinterface 158 1 0
    //   294: if_icmpne +31 -> 325
    //   297: getstatic 175	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_TASK_END	I
    //   300: istore 6
    //   302: iload 6
    //   304: istore_1
    //   305: iload 6
    //   307: istore 5
    //   309: aload_3
    //   310: iconst_0
    //   311: aload 9
    //   313: invokeinterface 158 1 0
    //   318: iastore
    //   319: iload 6
    //   321: istore_1
    //   322: goto -64 -> 258
    //   325: sipush 62535
    //   328: aload 9
    //   330: invokeinterface 158 1 0
    //   335: if_icmpne +31 -> 366
    //   338: getstatic 172	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_SESSION_TIMEOUT	I
    //   341: istore 6
    //   343: iload 6
    //   345: istore_1
    //   346: iload 6
    //   348: istore 5
    //   350: aload_3
    //   351: iconst_0
    //   352: aload 9
    //   354: invokeinterface 158 1 0
    //   359: iastore
    //   360: iload 6
    //   362: istore_1
    //   363: goto -105 -> 258
    //   366: getstatic 178	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_NORMAL	I
    //   369: istore 5
    //   371: iload 5
    //   373: istore_1
    //   374: goto -116 -> 258
    //   377: getstatic 147	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   380: ldc2_w 179
    //   383: ldc2_w 181
    //   386: lconst_1
    //   387: iconst_0
    //   388: invokevirtual 152	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   391: ldc 49
    //   393: ldc -72
    //   395: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: goto -140 -> 258
    //   401: astore_2
    //   402: getstatic 147	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   405: ldc2_w 179
    //   408: ldc2_w 187
    //   411: lconst_1
    //   412: iconst_0
    //   413: invokevirtual 152	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   416: ldc 49
    //   418: ldc -66
    //   420: iconst_1
    //   421: anewarray 4	java/lang/Object
    //   424: dup
    //   425: iconst_0
    //   426: aload_2
    //   427: invokestatic 83	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   430: aastore
    //   431: invokestatic 93	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   434: goto -176 -> 258
    //   437: getstatic 147	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   440: ldc2_w 179
    //   443: ldc2_w 191
    //   446: lconst_1
    //   447: iconst_0
    //   448: invokevirtual 152	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   451: ldc 49
    //   453: ldc -66
    //   455: iconst_1
    //   456: anewarray 4	java/lang/Object
    //   459: dup
    //   460: iconst_0
    //   461: aload_2
    //   462: invokestatic 83	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   465: aastore
    //   466: invokestatic 93	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   469: goto -211 -> 258
    //   472: astore_2
    //   473: aload 7
    //   475: monitorexit
    //   476: aload_2
    //   477: athrow
    //   478: astore_2
    //   479: goto -42 -> 437
    //   482: astore_2
    //   483: iload 5
    //   485: istore_1
    //   486: goto -84 -> 402
    //   489: astore_2
    //   490: goto -53 -> 437
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	493	0	this	z
    //   0	493	1	paramInt	int
    //   0	493	2	paramArrayOfByte	byte[]
    //   0	493	3	paramArrayOfInt1	int[]
    //   0	493	4	paramArrayOfInt2	int[]
    //   22	462	5	i	int
    //   236	125	6	j	int
    //   12	462	7	arrayOfa	a[]
    //   67	38	8	arrayOfByte	byte[]
    //   84	269	9	localh	h
    // Exception table:
    //   from	to	target	type
    //   47	123	401	android/os/RemoteException
    //   145	157	401	android/os/RemoteException
    //   174	186	401	android/os/RemoteException
    //   186	221	401	android/os/RemoteException
    //   221	238	401	android/os/RemoteException
    //   271	297	401	android/os/RemoteException
    //   297	302	401	android/os/RemoteException
    //   325	343	401	android/os/RemoteException
    //   366	371	401	android/os/RemoteException
    //   377	398	401	android/os/RemoteException
    //   17	24	472	finally
    //   30	33	472	finally
    //   43	47	472	finally
    //   47	123	472	finally
    //   145	157	472	finally
    //   174	186	472	finally
    //   186	221	472	finally
    //   221	238	472	finally
    //   245	255	472	finally
    //   258	261	472	finally
    //   271	297	472	finally
    //   297	302	472	finally
    //   309	319	472	finally
    //   325	343	472	finally
    //   350	360	472	finally
    //   366	371	472	finally
    //   377	398	472	finally
    //   402	434	472	finally
    //   437	469	472	finally
    //   473	476	472	finally
    //   245	255	478	java/lang/Exception
    //   309	319	478	java/lang/Exception
    //   350	360	478	java/lang/Exception
    //   245	255	482	android/os/RemoteException
    //   309	319	482	android/os/RemoteException
    //   350	360	482	android/os/RemoteException
    //   47	123	489	java/lang/Exception
    //   145	157	489	java/lang/Exception
    //   174	186	489	java/lang/Exception
    //   186	221	489	java/lang/Exception
    //   221	238	489	java/lang/Exception
    //   271	297	489	java/lang/Exception
    //   297	302	489	java/lang/Exception
    //   325	343	489	java/lang/Exception
    //   366	371	489	java/lang/Exception
    //   377	398	489	java/lang/Exception
  }
  
  public final int a(r paramr, l paraml, c paramc, int paramInt)
  {
    GMTrace.i(13707388125184L, 102128);
    if (paramr == null)
    {
      w.e("MicroMsg.MMNativeNetTaskAdapter", "startTask  rr is null");
      GMTrace.o(13707388125184L, 102128);
      return -1;
    }
    paramr.hashCode();
    StnLogic.Task localTask = new StnLogic.Task();
    a[] arrayOfa = this.hht;
    int i = 0;
    for (;;)
    {
      if (i < 100) {}
      for (;;)
      {
        try
        {
          if (this.hht[i] != null) {
            break;
          }
          this.hht[i] = new a();
          this.hht[i].hhx = paramr;
          this.hht[i].hhy = paraml;
          this.hht[i].hhz = paramc;
          this.hht[i].startTime = bg.Pv();
          this.hht[i].taskId = localTask.taskID;
          localTask.cmdID = paramr.Ej().getCmdId();
          localTask.cgi = paramr.getUri();
          int j = paramr.getType();
          boolean bool;
          if ((paramr.Dz() & 0x1) != 1)
          {
            bool = true;
            localTask.needAuthed = bool;
            if ((j == 126) || (j == 701) || (j == 702))
            {
              localTask.needAuthed = false;
              if (j == 701) {
                localTask.retryCount = 1;
              }
            }
            localTask.limitFlow = true;
            if ((j == 149) || (j == 193) || (j == 220) || (j == 323) || (j == 324) || (j == 326) || (j == 327)) {
              localTask.limitFlow = false;
            }
            localTask.channelStrategy = 0;
            if ((j == 233) || (j == 835) || (j == 238)) {
              localTask.channelStrategy = 1;
            }
            localTask.sendOnly = false;
            if ((j == 10) || (j == 268369922)) {
              localTask.sendOnly = true;
            }
            if ((paramr.Ej().Ei()) && (paramr.getUri() != null) && (paramr.getUri().length() > 0)) {
              localTask.channelSelect |= 0x1;
            }
            if (localTask.cmdID != 0) {
              localTask.channelSelect |= 0x2;
            }
            localTask.reportArg = String.valueOf(j);
            if (j == 522)
            {
              localTask.totalTimeout = 300000;
              localTask.priority = 0;
            }
            if (j == 710)
            {
              localTask.totalTimeout = 15000;
              localTask.serverProcessCost = 0;
            }
            w.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi startTask inQueue netid:%d hash[%d,%d] net:%d cgi:%s needAuthed:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(localTask.taskID), Integer.valueOf(paramr.DI()), Integer.valueOf(localTask.channelSelect), localTask.cgi, Boolean.valueOf(localTask.needAuthed) });
            if (-1 != i)
            {
              if (paramInt == 1) {
                localTask.retryCount = 0;
              }
              StnLogic.startTask(localTask);
              w.d("MicroMsg.MMNativeNetTaskAdapter", "startTask retsult=" + i);
              GMTrace.o(13707388125184L, 102128);
              return i;
            }
          }
          else
          {
            bool = false;
            continue;
          }
          w.e("MicroMsg.MMNativeNetTaskAdapter", "startTask err");
        }
        catch (RemoteException localRemoteException)
        {
          w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bg.f(localRemoteException) });
        }
        finally {}
        continue;
        i = -1;
      }
      i += 1;
    }
  }
  
  final boolean a(int paramInt1, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    GMTrace.i(13707924996096L, 102132);
    synchronized (this.hht)
    {
      paramInt1 = hx(paramInt1);
      if (-1 == paramInt1)
      {
        GMTrace.o(13707924996096L, 102132);
        return false;
      }
      try
      {
        w.i("MicroMsg.MMNativeNetTaskAdapter", "link: %d req2Buf somr isfg:%b  cookie: %s", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(this.hht[paramInt1].hhz.DW()), bg.bs(this.hht[paramInt1].hhz.DT()) });
        this.hht[paramInt1].hhx.Ej().B(this.hht[paramInt1].hhz.wR());
        this.hht[paramInt1].hhx.Ej().dp(this.hht[paramInt1].hhz.ww());
        bool = this.hht[paramInt1].hhx.Ej().a(this.hht[paramInt1].hhx.getType(), this.hht[paramInt1].hhz.wR(), this.hht[paramInt1].hhz.DT(), this.hht[paramInt1].hhz.DV(), 0, this.hht[paramInt1].hhz.DW());
        if (!bool) {
          break label324;
        }
        paramByteArrayOutputStream.write(this.hht[paramInt1].hhx.Ej().Ec());
      }
      catch (RemoteException paramByteArrayOutputStream)
      {
        for (;;)
        {
          paramArrayOfInt[0] = 1;
          d.oqe.a(162L, paramArrayOfInt[0], 1L, false);
          w.e("MicroMsg.MMNativeNetTaskAdapter", "RemoteException:%s", new Object[] { bg.f(paramByteArrayOutputStream) });
          bool = false;
        }
      }
      catch (IOException paramByteArrayOutputStream)
      {
        for (;;)
        {
          paramArrayOfInt[0] = 2;
          d.oqe.a(162L, paramArrayOfInt[0], 1L, false);
          w.e("MicroMsg.MMNativeNetTaskAdapter", "IOException:%s", new Object[] { bg.f(paramByteArrayOutputStream) });
          bool = false;
        }
      }
      catch (Exception paramByteArrayOutputStream)
      {
        for (;;)
        {
          paramArrayOfInt[0] = 3;
          d.oqe.a(162L, paramArrayOfInt[0], 1L, false);
          w.e("MicroMsg.MMNativeNetTaskAdapter", "Exception:%s", new Object[] { bg.f(paramByteArrayOutputStream) });
          boolean bool = false;
        }
      }
      w.d("MicroMsg.MMNativeNetTaskAdapter", "req2Buf bOk: %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13707924996096L, 102132);
      return bool;
      label324:
      paramArrayOfInt[0] = 0;
      d.oqe.a(162L, paramArrayOfInt[0], 1L, false);
      w.e("MicroMsg.MMNativeNetTaskAdapter", "request to buffer using jni failed");
    }
  }
  
  final r bM(boolean paramBoolean)
  {
    GMTrace.i(13707119689728L, 102126);
    a[] arrayOfa = this.hht;
    int i = 0;
    Object localObject4;
    label257:
    Object localObject2;
    for (Object localObject1 = null;; localObject2 = localObject4)
    {
      if (i < 100)
      {
        try
        {
          a locala = this.hht[i];
          Object localObject3 = localObject1;
          if (locala == null) {
            break label257;
          }
          if (paramBoolean) {
            localObject3 = localObject1;
          }
          try
          {
            if ((this.hht[i].hhx instanceof r.a)) {
              break label257;
            }
            if ((!paramBoolean) && (!(this.hht[i].hhx instanceof r.a)))
            {
              localObject3 = localObject1;
              break label257;
            }
            if ((701 == this.hht[i].hhx.getType()) || (702 == this.hht[i].hhx.getType()))
            {
              w.e("MicroMsg.MMNativeNetTaskAdapter", "getAutoAuthRR Auth inQueue: netid=" + i + " type=" + this.hht[i].hhx.getType());
              GMTrace.o(13707119689728L, 102126);
              return null;
            }
          }
          catch (RemoteException localRemoteException)
          {
            w.w("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bg.f(localRemoteException) });
            localObject4 = localObject1;
          }
          localObject4 = localr;
        }
        finally {}
        if (localr == null) {
          localObject4 = this.hht[i].hhx;
        }
      }
      else
      {
        GMTrace.o(13707119689728L, 102126);
        return localr;
      }
      i += 1;
    }
  }
  
  /* Error */
  public final void e(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 381
    //   3: ldc_w 383
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 49
    //   11: new 51	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 385
    //   18: invokespecial 56	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: iload_1
    //   22: invokevirtual 60	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   25: ldc_w 387
    //   28: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: iload_2
    //   32: invokevirtual 60	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   35: ldc_w 389
    //   38: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_3
    //   42: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 391	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: invokestatic 394	com/tencent/mars/stn/StnLogic:clearTask	()V
    //   54: bipush 100
    //   56: anewarray 8	com/tencent/mm/network/z$a
    //   59: astore 5
    //   61: aload_0
    //   62: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   65: astore 6
    //   67: aload 6
    //   69: monitorenter
    //   70: iconst_0
    //   71: istore 4
    //   73: iload 4
    //   75: bipush 100
    //   77: if_icmpge +32 -> 109
    //   80: aload 5
    //   82: iload 4
    //   84: aload_0
    //   85: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   88: iload 4
    //   90: aaload
    //   91: aastore
    //   92: aload_0
    //   93: getfield 26	com/tencent/mm/network/z:hht	[Lcom/tencent/mm/network/z$a;
    //   96: iload 4
    //   98: aconst_null
    //   99: aastore
    //   100: iload 4
    //   102: iconst_1
    //   103: iadd
    //   104: istore 4
    //   106: goto -33 -> 73
    //   109: aload 6
    //   111: monitorexit
    //   112: iconst_0
    //   113: istore 4
    //   115: iload 4
    //   117: bipush 100
    //   119: if_icmpge +135 -> 254
    //   122: aload 5
    //   124: iload 4
    //   126: aaload
    //   127: ifnull +88 -> 215
    //   130: ldc 49
    //   132: ldc_w 396
    //   135: iconst_3
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: iload 4
    //   143: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: aload 5
    //   151: iload 4
    //   153: aaload
    //   154: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   157: invokeinterface 47 1 0
    //   162: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: dup
    //   167: iconst_2
    //   168: aload 5
    //   170: iload 4
    //   172: aaload
    //   173: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   176: invokeinterface 292 1 0
    //   181: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: aastore
    //   185: invokestatic 299	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload 5
    //   190: iload 4
    //   192: aaload
    //   193: getfield 209	com/tencent/mm/network/z$a:hhy	Lcom/tencent/mm/network/l;
    //   196: iload 4
    //   198: iload_1
    //   199: iload_2
    //   200: aload_3
    //   201: aload 5
    //   203: iload 4
    //   205: aaload
    //   206: getfield 41	com/tencent/mm/network/z$a:hhx	Lcom/tencent/mm/network/r;
    //   209: aconst_null
    //   210: invokeinterface 401 7 0
    //   215: iload 4
    //   217: iconst_1
    //   218: iadd
    //   219: istore 4
    //   221: goto -106 -> 115
    //   224: astore_3
    //   225: aload 6
    //   227: monitorexit
    //   228: aload_3
    //   229: athrow
    //   230: astore 6
    //   232: ldc 49
    //   234: ldc -66
    //   236: iconst_1
    //   237: anewarray 4	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload 6
    //   244: invokestatic 83	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   247: aastore
    //   248: invokestatic 93	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: goto -36 -> 215
    //   254: ldc2_w 381
    //   257: ldc_w 383
    //   260: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   263: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	this	z
    //   0	264	1	paramInt1	int
    //   0	264	2	paramInt2	int
    //   0	264	3	paramString	String
    //   71	149	4	i	int
    //   59	143	5	arrayOfa1	a[]
    //   65	161	6	arrayOfa2	a[]
    //   230	13	6	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   80	100	224	finally
    //   109	112	224	finally
    //   225	228	224	finally
    //   130	215	230	java/lang/Exception
  }
  
  protected final void finalize()
  {
    GMTrace.i(13706717036544L, 102123);
    reset();
    super.finalize();
    GMTrace.o(13706717036544L, 102123);
  }
  
  final int hw(int paramInt)
  {
    GMTrace.i(13707790778368L, 102131);
    synchronized (this.hht)
    {
      paramInt = hx(paramInt);
      if (-1 == paramInt)
      {
        w.e("MicroMsg.MMNativeNetTaskAdapter", "-1 == index");
        GMTrace.o(13707790778368L, 102131);
        return 0;
      }
      try
      {
        paramInt = this.hht[paramInt].hhx.Ek().Eo();
        GMTrace.o(13707790778368L, 102131);
        return paramInt;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(13707790778368L, 102131);
        return 0;
      }
    }
  }
  
  final int hx(int paramInt)
  {
    GMTrace.i(13708193431552L, 102134);
    int i = 0;
    while ((i < 100) && ((this.hht[i] == null) || (paramInt != this.hht[i].taskId))) {
      i += 1;
    }
    if (100 <= i)
    {
      GMTrace.o(13708193431552L, 102134);
      return -1;
    }
    GMTrace.o(13708193431552L, 102134);
    return i;
  }
  
  public final void reset()
  {
    GMTrace.i(13707522342912L, 102129);
    w.i("MicroMsg.MMNativeNetTaskAdapter", "reset");
    StnLogic.reset();
    a[] arrayOfa = this.hht;
    int i = 0;
    while (i < 100) {
      try
      {
        a locala = this.hht[i];
        if (locala != null) {}
        try
        {
          w.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi reset outQueue: netId:%d hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.hht[i].hhx.getType()), Integer.valueOf(this.hht[i].hhx.DI()) });
          this.hht[i] = null;
          i += 1;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            w.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bg.f(localRemoteException) });
          }
        }
      }
      finally {}
    }
    GMTrace.o(13707522342912L, 102129);
  }
  
  private static final class a
  {
    r hhx;
    l hhy;
    c hhz;
    long startTime;
    int taskId;
    
    public a()
    {
      GMTrace.i(13703495811072L, 102099);
      GMTrace.o(13703495811072L, 102099);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */