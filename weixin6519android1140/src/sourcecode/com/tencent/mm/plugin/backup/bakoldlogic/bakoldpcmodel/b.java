package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.a.n;
import com.tencent.mm.plugin.backup.f.b.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;

public final class b
  implements b.a
{
  public static final byte[] iVB;
  private Socket iHE;
  private Boolean jfo;
  private ServerSocket jfp;
  public ae jfq;
  private ae jfr;
  public DataOutputStream jfs;
  private int jft;
  private int jfu;
  private long jfv;
  public Object lock;
  
  static
  {
    GMTrace.i(14788377706496L, 110182);
    iVB = "GSMW".getBytes();
    GMTrace.o(14788377706496L, 110182);
  }
  
  public b()
  {
    GMTrace.i(14786096005120L, 110165);
    this.jfo = Boolean.valueOf(false);
    this.jfp = null;
    this.iHE = null;
    this.jfq = null;
    this.jfr = new ae(Looper.getMainLooper());
    this.jfs = null;
    this.lock = new Object();
    this.jft = 0;
    this.jfu = 0;
    this.jfv = 0L;
    agq();
    GMTrace.o(14786096005120L, 110165);
  }
  
  private void a(DataInputStream paramDataInputStream)
  {
    GMTrace.i(14787303964672L, 110174);
    try
    {
      for (;;)
      {
        int j;
        if ((!this.jfo.booleanValue()) && (this.jft != 4))
        {
          j = paramDataInputStream.readByte();
          if (iVB[this.jft] == j)
          {
            this.jft += 1;
            continue;
          }
        }
        try
        {
          paramDataInputStream.close();
          if (!this.jfo.booleanValue()) {
            a(true, 0, 10006, ("read_error " + localException).getBytes());
          }
          agp();
          GMTrace.o(14787303964672L, 110174);
          return;
          long l1 = bg.Pu();
          long l2 = this.jfv;
          if (this.jfu - (l1 - l2) < 10L)
          {
            if (this.jfu < 0) {
              this.jfu = 0;
            }
            this.jfu += 1;
            this.jfv = l1;
            i = 0;
            String str;
            if (i == 0)
            {
              str = String.format("GSMW in the %dth step error:expect:%02X, butGet:%02X", new Object[] { Integer.valueOf(this.jft + 1), Integer.valueOf(iVB[this.jft] & 0xFF), Integer.valueOf(j & 0xFF) });
              w.e("MicroMsg.BakOldJavaEngine", str);
              a(true, 0, 10007, str.getBytes());
            }
            this.jft = 0;
            continue;
            this.jft = 0;
            j = paramDataInputStream.readInt();
            short s1 = paramDataInputStream.readShort();
            s2 = paramDataInputStream.readShort();
            int k = paramDataInputStream.readInt();
            if (k > 16777216)
            {
              str = String.format("loopRead size to large:%d", new Object[] { Integer.valueOf(k) });
              w.e("MicroMsg.BakOldJavaEngine", str);
              this.jfo = Boolean.valueOf(true);
              a(true, 0, 10007, str.getBytes());
              GMTrace.o(14787303964672L, 110174);
              return;
            }
            int m = paramDataInputStream.readInt();
            w.i("MicroMsg.BakOldJavaEngine", "read buf size:" + k);
            localObject2 = new byte[k - 20];
            i = 0;
            while (i < localObject2.length)
            {
              int n = paramDataInputStream.read((byte[])localObject2, i, localObject2.length - i);
              if (n == -1) {
                try
                {
                  Thread.sleep(200L);
                }
                catch (InterruptedException localInterruptedException) {}
              } else {
                i += n;
              }
            }
            PByteArray localPByteArray = new PByteArray();
            localObject1 = iVB;
            if (s1 != 1)
            {
              localObject1 = String.format("unpack failed, getVersion:%d", new Object[] { Short.valueOf(s1) });
              w.e("MicroMsg.BakOldPacker", (String)localObject1);
              localPByteArray.value = ((String)localObject1).getBytes();
              i = -1;
              w.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d]", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label769;
              }
              if (localPByteArray.value != null) {
                break label752;
              }
            }
            for (localObject1 = "";; localObject1 = new String(localPByteArray.value))
            {
              a(true, 0, 10007, ((String)localObject1).getBytes());
              GMTrace.o(14787303964672L, 110174);
              return;
              if (com.tencent.mm.plugin.backup.f.b.ael() != 1) {
                break label836;
              }
              i = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.a((byte[])localObject1, j, s1, s2, k, (byte[])localObject2);
              if (m == i) {
                break label836;
              }
              localObject1 = new CRC32();
              ((CRC32)localObject1).update((byte[])localObject2);
              localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.S((byte[])localObject2);
              localObject1 = String.format("unpack failed--calcSum:%d, getfromPcMgr:%d, seq:%d, type:%d, size:%d, just buf.crc:%d, last 100 bytes:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(j), Short.valueOf(s2), Integer.valueOf(k), Integer.valueOf((int)((CRC32)localObject1).getValue()), localObject2 });
              w.e("MicroMsg.BakOldPacker", (String)localObject1);
              localPByteArray.value = ((String)localObject1).getBytes();
              i = -2;
              break;
              for (;;)
              {
                localPByteArray.value = ((byte[])localObject1);
                i = 0;
                break;
                localObject1 = k.a((byte[])localObject2, com.tencent.mm.plugin.backup.a.e.aem());
              }
            }
            w.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d], seq[%d], type[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Short.valueOf(s2) });
            a(false, j, s2, localPByteArray.value);
            GMTrace.o(14787303964672L, 110174);
            return;
          }
        }
        catch (IOException paramDataInputStream)
        {
          for (;;)
          {
            short s2;
            Object localObject2;
            continue;
            int i = 1;
            continue;
            Object localObject1 = localObject2;
            if (s2 != 1) {
              if (s2 == 2) {
                localObject1 = localObject2;
              }
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.BakOldJavaEngine", "loopRead %s", new Object[] { localException });
    }
  }
  
  private void agq()
  {
    GMTrace.i(14787169746944L, 110173);
    if ((this.jfq == null) || (!this.jfq.getLooper().getThread().isAlive())) {
      com.tencent.mm.sdk.f.e.b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14778714030080L, 110110);
          Looper.prepare();
          b.this.jfq = new ae();
          Looper.loop();
          GMTrace.o(14778714030080L, 110110);
        }
      }, "BackupJavaEngine_handler").start();
    }
    GMTrace.o(14787169746944L, 110173);
  }
  
  public final void V(final byte[] paramArrayOfByte)
  {
    GMTrace.i(14787035529216L, 110172);
    if (this.jfo.booleanValue())
    {
      w.e("MicroMsg.BakOldJavaEngine", "engine has stop");
      GMTrace.o(14787035529216L, 110172);
      return;
    }
    this.jfq.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14781532602368L, 110131);
        try
        {
          synchronized (b.this.lock)
          {
            b.this.jfs.write(paramArrayOfByte);
            b.this.jfs.flush();
            GMTrace.o(14781532602368L, 110131);
            return;
          }
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.BakOldJavaEngine", "send_error %s", new Object[] { localException });
          b.this.agp();
          b.this.a(true, 0, 10008, ("send_error " + localException).getBytes());
          GMTrace.o(14781532602368L, 110131);
        }
      }
    });
    GMTrace.o(14787035529216L, 110172);
  }
  
  public final void a(final boolean paramBoolean, final int paramInt1, final int paramInt2, final byte[] paramArrayOfByte)
  {
    GMTrace.i(14786632876032L, 110169);
    this.jfr.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14792538456064L, 110213);
        com.tencent.mm.plugin.backup.f.b.b(paramBoolean, paramInt1, paramInt2, paramArrayOfByte);
        GMTrace.o(14792538456064L, 110213);
      }
    });
    GMTrace.o(14786632876032L, 110169);
  }
  
  public final void aD(String paramString, int paramInt)
  {
    GMTrace.i(16049353261056L, 119577);
    paramInt = (paramInt & 0xFF) << 8 | paramInt >> 8 & 0xFF;
    w.i("MicroMsg.BakOldJavaEngine", "doConnect serverIp:%s, port:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    try
    {
      paramString = InetAddress.getByName(paramString);
      w.i("MicroMsg.BakOldJavaEngine", "TCP  Connecting...");
      this.iHE = new Socket(paramString, paramInt);
      this.iHE.setKeepAlive(true);
      w.i("MicroMsg.BakOldJavaEngine", "TCP connected" + this.iHE.toString());
      this.jfs = new DataOutputStream(new BufferedOutputStream(this.iHE.getOutputStream()));
      paramString = new DataInputStream(this.iHE.getInputStream());
      this.jfo = Boolean.valueOf(false);
      a(true, 0, 10002, null);
      while (!this.jfo.booleanValue()) {
        a(paramString);
      }
      GMTrace.o(16049353261056L, 119577);
    }
    catch (IOException paramString)
    {
      w.e("MicroMsg.BakOldJavaEngine", "doConnect %s", new Object[] { paramString });
      agp();
      a(true, 0, 10004, ("doConnect " + paramString).getBytes());
      GMTrace.o(16049353261056L, 119577);
      return;
    }
  }
  
  public final void ago()
  {
    GMTrace.i(14786364440576L, 110167);
    w.i("MicroMsg.BakOldJavaEngine", "close connect");
    agp();
    a(true, 0, 10003, null);
    GMTrace.o(14786364440576L, 110167);
  }
  
  /* Error */
  public final void agp()
  {
    // Byte code:
    //   0: ldc2_w 386
    //   3: ldc_w 388
    //   6: invokestatic 47	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 100	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jft	I
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 102	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jfu	I
    //   19: aload_0
    //   20: lconst_0
    //   21: putfield 104	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jfv	J
    //   24: aload_0
    //   25: iconst_1
    //   26: invokestatic 73	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   29: putfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jfo	Ljava/lang/Boolean;
    //   32: aload_0
    //   33: getfield 98	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:lock	Ljava/lang/Object;
    //   36: astore_1
    //   37: aload_1
    //   38: monitorenter
    //   39: aload_0
    //   40: getfield 96	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jfs	Ljava/io/DataOutputStream;
    //   43: ifnull +10 -> 53
    //   46: aload_0
    //   47: getfield 96	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:jfs	Ljava/io/DataOutputStream;
    //   50: invokevirtual 389	java/io/DataOutputStream:close	()V
    //   53: aload_1
    //   54: monitorexit
    //   55: aload_0
    //   56: getfield 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:iHE	Ljava/net/Socket;
    //   59: ifnull +10 -> 69
    //   62: aload_0
    //   63: getfield 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:iHE	Ljava/net/Socket;
    //   66: invokevirtual 390	java/net/Socket:close	()V
    //   69: ldc2_w 386
    //   72: ldc_w 388
    //   75: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: return
    //   79: astore_2
    //   80: aload_1
    //   81: monitorexit
    //   82: aload_2
    //   83: athrow
    //   84: astore_1
    //   85: goto -30 -> 55
    //   88: astore_1
    //   89: ldc2_w 386
    //   92: ldc_w 388
    //   95: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	b
    //   84	1	1	localException1	Exception
    //   88	1	1	localException2	Exception
    //   79	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   39	53	79	finally
    //   53	55	79	finally
    //   80	82	79	finally
    //   32	39	84	java/lang/Exception
    //   82	84	84	java/lang/Exception
    //   55	69	88	java/lang/Exception
  }
  
  public final void b(final int paramInt, final List<nu> paramList)
  {
    GMTrace.i(14786230222848L, 110166);
    w.i("MicroMsg.BakOldJavaEngine", "connect type:%d", new Object[] { Integer.valueOf(paramInt) });
    agq();
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14790659407872L, 110199);
        Object localObject;
        int k;
        String str;
        int i;
        switch (paramInt)
        {
        default: 
          GMTrace.o(14790659407872L, 110199);
          return;
        case 1: 
          localObject = (WifiManager)ab.getContext().getSystemService("wifi");
          int j = ((WifiManager)localObject).getConnectionInfo().getIpAddress();
          localObject = ((WifiManager)localObject).getDhcpInfo();
          if (localObject == null)
          {
            GMTrace.o(14790659407872L, 110199);
            return;
          }
          k = ((DhcpInfo)localObject).netmask;
          str = (j & 0xFF) + "." + (j >> 8 & 0xFF) + "." + (j >> 16 & 0xFF) + "." + (j >> 24 & 0xFF);
          w.e("MicroMsg.BakOldJavaEngine", "localip:%s, mask:%d", new Object[] { str, Integer.valueOf(k) });
          localObject = null;
          i = 0;
          Iterator localIterator = paramList.iterator();
          label201:
          while (localIterator.hasNext())
          {
            nu localnu = (nu)localIterator.next();
            w.i("MicroMsg.BakOldJavaEngine", "try ip:%s", new Object[] { localnu.uez });
            if (localnu.uez != null)
            {
              String[] arrayOfString = localnu.uez.split("\\.");
              if (arrayOfString.length >= 4)
              {
                int m = n.p(new byte[] { (byte)(bg.getInt(arrayOfString[0], 0) & 0xFF), (byte)(bg.getInt(arrayOfString[1], 0) & 0xFF), (byte)(bg.getInt(arrayOfString[2], 0) & 0xFF), (byte)(bg.getInt(arrayOfString[3], 0) & 0xFF) });
                if ((k & m) == (k & j))
                {
                  b.this.aD(localnu.uez, ((Integer)localnu.ueA.getFirst()).intValue());
                  GMTrace.o(14790659407872L, 110199);
                  return;
                }
                if ((m & 0xFFFF) != (0xFFFF & j)) {
                  break label573;
                }
                localObject = localnu.uez;
                i = ((Integer)localnu.ueA.getFirst()).intValue();
              }
            }
          }
        }
        label573:
        for (;;)
        {
          break label201;
          if (localObject != null)
          {
            w.w("MicroMsg.BakOldJavaEngine", "try to connect to secondary:%s, port:%d", new Object[] { localObject, Integer.valueOf(i) });
            b.this.aD((String)localObject, i);
            GMTrace.o(14790659407872L, 110199);
            return;
          }
          b.this.a(true, 0, 10009, String.format("not match ip mask:%d, localip:%s", new Object[] { Integer.valueOf(k), str }).getBytes());
          w.e("MicroMsg.BakOldJavaEngine", "not match ip mask:%d, localip:%s", new Object[] { Integer.valueOf(k), str });
          GMTrace.o(14790659407872L, 110199);
          return;
          b.this.kJ(((Integer)((nu)paramList.get(0)).ueA.getFirst()).intValue());
          break;
        }
      }
    }, "BackupJavaEngine_connect");
    GMTrace.o(14786230222848L, 110166);
  }
  
  public final void i(final int paramInt, final byte[] paramArrayOfByte)
  {
    GMTrace.i(14786767093760L, 110170);
    if (this.jfq != null)
    {
      V(paramArrayOfByte);
      GMTrace.o(14786767093760L, 110170);
      return;
    }
    this.jfr.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14780458860544L, 110123);
        b.this.V(paramArrayOfByte);
        GMTrace.o(14780458860544L, 110123);
      }
    }, 200L);
    GMTrace.o(14786767093760L, 110170);
  }
  
  public final int j(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(14786901311488L, 110171);
    GMTrace.o(14786901311488L, 110171);
    return 0;
  }
  
  public final void kJ(int paramInt)
  {
    GMTrace.i(16049487478784L, 119578);
    paramInt = paramInt >> 8 & 0xFF | (paramInt & 0xFF) << 8;
    w.i("MicroMsg.BakOldJavaEngine", "doListen port:%d", new Object[] { Integer.valueOf(paramInt) });
    this.jfp = null;
    try
    {
      Object localObject = InetAddress.getLocalHost().getHostAddress();
      w.i("MicroMsg.BakOldJavaEngine", "ip:" + (String)localObject);
      w.i("MicroMsg.BakOldJavaEngine", "before init ");
      this.jfp = new ServerSocket(paramInt);
      w.i("MicroMsg.BakOldJavaEngine", "before accept server:  " + this.jfp.toString());
      this.iHE = this.jfp.accept();
      this.iHE.setKeepAlive(true);
      w.i("MicroMsg.BakOldJavaEngine", "after accept client:  " + this.iHE.toString());
      localObject = new DataInputStream(new BufferedInputStream(this.iHE.getInputStream()));
      this.jfs = new DataOutputStream(new BufferedOutputStream(this.iHE.getOutputStream()));
      this.jfo = Boolean.valueOf(false);
      a(true, 0, 10001, null);
      while (!this.jfo.booleanValue()) {
        a((DataInputStream)localObject);
      }
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.BakOldJavaEngine", "doListen %s", new Object[] { localIOException });
      agp();
      a(true, 0, 10005, ("doListenErr " + localIOException).getBytes());
      GMTrace.o(16049487478784L, 119578);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BakOldJavaEngine", localException, "getHostAddress", new Object[0]);
      }
      GMTrace.o(16049487478784L, 119578);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */