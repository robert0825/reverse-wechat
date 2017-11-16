package com.tencent.mm.plugin.backup.b;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.lan_cs.Client.Java2C;
import com.tencent.mm.lan_cs.Client.a;
import com.tencent.mm.lan_cs.Server.Java2C;
import com.tencent.mm.lan_cs.Server.a;
import com.tencent.mm.plugin.backup.e.c;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.plugin.backup.f.b.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;

public final class a
  implements b.a
{
  public static final byte[] iVB;
  public String iVC;
  public int iVD;
  public ae iVE;
  public a iVF;
  public int mode;
  
  static
  {
    GMTrace.i(9479395475456L, 70627);
    iVB = "GSMW".getBytes();
    GMTrace.o(9479395475456L, 70627);
  }
  
  public a()
  {
    GMTrace.i(9477516427264L, 70613);
    this.mode = 0;
    this.iVE = null;
    GMTrace.o(9477516427264L, 70613);
  }
  
  public final void Q(byte[] paramArrayOfByte)
  {
    GMTrace.i(16048950607872L, 119574);
    paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    Object localObject = new byte[4];
    paramArrayOfByte.read((byte[])localObject);
    if (!Arrays.equals(iVB, (byte[])localObject))
    {
      GMTrace.o(16048950607872L, 119574);
      return;
    }
    int j = paramArrayOfByte.readInt();
    short s1 = paramArrayOfByte.readShort();
    short s2 = paramArrayOfByte.readShort();
    int i = paramArrayOfByte.readInt();
    if (i > 16777216)
    {
      paramArrayOfByte = String.format("loopRead size too large, size:%d", new Object[] { Integer.valueOf(i) });
      w.e("MicroMsg.BackupCEngine", paramArrayOfByte);
      a(true, j, 10007, paramArrayOfByte.getBytes());
      GMTrace.o(16048950607872L, 119574);
      return;
    }
    int k = paramArrayOfByte.readInt();
    w.i("MicroMsg.BackupCEngine", "read buf size:%d, seq:%d, version:%d, type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Short.valueOf(s1), Short.valueOf(s2) });
    localObject = new byte[i - 20];
    if (paramArrayOfByte.read((byte[])localObject) != localObject.length)
    {
      GMTrace.o(16048950607872L, 119574);
      return;
    }
    PByteArray localPByteArray = new PByteArray();
    b.kD(bg.br((byte[])localObject));
    paramArrayOfByte = iVB;
    int m = b.ael();
    if (s1 != 1)
    {
      paramArrayOfByte = String.format("unpack failed, getVersion:%d", new Object[] { Short.valueOf(s1) });
      w.e("MicroMsg.BackupPacker", paramArrayOfByte);
      localPByteArray.value = paramArrayOfByte.getBytes();
      i = -1;
      if (i == 0) {
        break label507;
      }
      if (localPByteArray.value != null) {
        break label491;
      }
    }
    label479:
    label491:
    for (paramArrayOfByte = "";; paramArrayOfByte = new String(localPByteArray.value))
    {
      a(true, j, 10007, paramArrayOfByte.getBytes());
      GMTrace.o(16048950607872L, 119574);
      return;
      if (m == 1)
      {
        m = c.a(paramArrayOfByte, j, s1, s2, i, (byte[])localObject);
        if (k != m)
        {
          paramArrayOfByte = new CRC32();
          paramArrayOfByte.update((byte[])localObject);
          localObject = c.S((byte[])localObject);
          paramArrayOfByte = String.format("unpack failed--calcSum:%d, getfromPcMgr:%d, seq:%d, type:%d, size:%d, just buf.crc:%d, last 100 bytes:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(j), Short.valueOf(s2), Integer.valueOf(i), Integer.valueOf((int)paramArrayOfByte.getValue()), localObject });
          w.e("MicroMsg.BackupPacker", paramArrayOfByte);
          localPByteArray.value = paramArrayOfByte.getBytes();
          i = -2;
          break;
        }
      }
      paramArrayOfByte = (byte[])localObject;
      if (s2 != 1) {
        if (s2 != 2) {
          break label479;
        }
      }
      for (paramArrayOfByte = (byte[])localObject;; paramArrayOfByte = k.a((byte[])localObject, com.tencent.mm.plugin.backup.a.e.aem()))
      {
        localPByteArray.value = paramArrayOfByte;
        i = 0;
        break;
      }
    }
    label507:
    if (this.iVF != null)
    {
      this.iVF.a(j, s2, localPByteArray.value);
      GMTrace.o(16048950607872L, 119574);
      return;
    }
    a(false, j, s2, localPByteArray.value);
    GMTrace.o(16048950607872L, 119574);
  }
  
  public final void a(final boolean paramBoolean, final int paramInt1, final int paramInt2, final byte[] paramArrayOfByte)
  {
    GMTrace.i(9478321733632L, 70619);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9467718533120L, 70540);
        b.b(paramBoolean, paramInt1, paramInt2, paramArrayOfByte);
        GMTrace.o(9467718533120L, 70540);
      }
    });
    GMTrace.o(9478321733632L, 70619);
  }
  
  public final boolean a(PString paramPString, PInt paramPInt)
  {
    GMTrace.i(9477650644992L, 70614);
    this.mode = 0;
    w.i("MicroMsg.BackupCEngine", "listen before server.stop");
    Server.Java2C.stop();
    w.i("MicroMsg.BackupCEngine", "listen after server.stop");
    w.i("MicroMsg.BackupCEngine", "listen before server.start listener");
    com.tencent.mm.lan_cs.Server.gcc = new Server.a()
    {
      public final void fl(int paramAnonymousInt)
      {
        GMTrace.i(9468792274944L, 70548);
        if (a.this.mode == 1) {
          b.kD(paramAnonymousInt);
        }
        GMTrace.o(9468792274944L, 70548);
      }
      
      public final void onConnect(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(9469194928128L, 70551);
        a.this.iVC = paramAnonymousString;
        a.this.iVD = paramAnonymousInt;
        GMTrace.o(9469194928128L, 70551);
      }
      
      public final void onRecv(String paramAnonymousString, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(9468926492672L, 70549);
        a.this.iVC = paramAnonymousString;
        a.this.iVD = paramAnonymousInt;
        try
        {
          a.this.Q(paramAnonymousArrayOfByte);
          GMTrace.o(9468926492672L, 70549);
          return;
        }
        catch (IOException paramAnonymousString)
        {
          a.this.a(true, 0, 10006, ("server readErr:" + paramAnonymousString.toString()).getBytes());
          GMTrace.o(9468926492672L, 70549);
        }
      }
      
      public final void xZ()
      {
        GMTrace.i(9469060710400L, 70550);
        a.this.a(true, 0, 10011, "listen server onDisconnect".getBytes());
        GMTrace.o(9469060710400L, 70550);
      }
    };
    Object[] arrayOfObject = Server.Java2C.start();
    if ((arrayOfObject == null) || (arrayOfObject.length != 3))
    {
      w.e("MicroMsg.BackupCEngine", "listen error");
      GMTrace.o(9477650644992L, 70614);
      return false;
    }
    w.i("MicroMsg.BackupCEngine", "listen result: %d, %s, %d", new Object[] { arrayOfObject[0], arrayOfObject[1], arrayOfObject[2] });
    if (((Integer)arrayOfObject[0]).intValue() != 1)
    {
      GMTrace.o(9477650644992L, 70614);
      return false;
    }
    paramPString.value = ((String)arrayOfObject[1]);
    paramPInt.value = ((Integer)arrayOfObject[2]).intValue();
    this.mode = 1;
    GMTrace.o(9477650644992L, 70614);
    return true;
  }
  
  public final void connect(String paramString, int paramInt)
  {
    GMTrace.i(9477784862720L, 70615);
    this.mode = 2;
    this.iVC = paramString;
    this.iVD = paramInt;
    com.tencent.mm.lan_cs.Client.gcb = new Client.a()
    {
      public final void onRecv(String paramAnonymousString, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(9467315879936L, 70537);
        a.this.iVC = paramAnonymousString;
        a.this.iVD = paramAnonymousInt;
        try
        {
          a.this.Q(paramAnonymousArrayOfByte);
          GMTrace.o(9467315879936L, 70537);
          return;
        }
        catch (IOException paramAnonymousString)
        {
          a.this.a(true, 0, 10006, ("client readErr:" + paramAnonymousString.toString()).getBytes());
          GMTrace.o(9467315879936L, 70537);
        }
      }
      
      public final void xZ()
      {
        GMTrace.i(9467450097664L, 70538);
        a.this.a(true, 0, 10011, "client onDisconnect".getBytes());
        GMTrace.o(9467450097664L, 70538);
      }
    };
    GMTrace.o(9477784862720L, 70615);
  }
  
  public final void i(final int paramInt, final byte[] paramArrayOfByte)
  {
    GMTrace.i(9478053298176L, 70617);
    final long l = bg.Pv();
    w.v("MicroMsg.BackupCEngine", "send seq:%d buff:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(bg.br(paramArrayOfByte)) });
    if ((this.iVE == null) || (!this.iVE.getLooper().getThread().isAlive()))
    {
      HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.SV("BackupCEngine_sendHandler");
      localHandlerThread.setPriority(10);
      localHandlerThread.start();
      this.iVE = new ae(localHandlerThread.getLooper());
      w.w("MicroMsg.BackupCEngine", "BackupCEngine new writerHandler:%d", new Object[] { Long.valueOf(localHandlerThread.getId()) });
    }
    this.iVE.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9466107920384L, 70528);
        long l = bg.Pv();
        w.i("MicroMsg.BackupCEngine", "before send server mode:%d  seq:%d  buff:%d time:[%d]", new Object[] { Integer.valueOf(a.this.mode), Integer.valueOf(paramInt), Integer.valueOf(bg.br(paramArrayOfByte)), Long.valueOf(l - l) });
        if (a.this.mode == 0)
        {
          w.i("MicroMsg.BackupCEngine", "sendImp err mode!!");
          GMTrace.o(9466107920384L, 70528);
          return;
        }
        int i = 0;
        if (a.this.mode == 1)
        {
          int j = Server.Java2C.send(a.this.iVC, a.this.iVD, paramArrayOfByte);
          i = j;
          if (j == 0) {}
        }
        for (;;)
        {
          b.kD(bg.br(paramArrayOfByte));
          w.i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], time[%d,%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(bg.br(paramArrayOfByte)), Long.valueOf(bg.aH(l)), Long.valueOf(bg.aH(l)) });
          GMTrace.o(9466107920384L, 70528);
          return;
          if (a.this.mode == 2) {
            i = Client.Java2C.send(a.this.iVC, a.this.iVD, paramArrayOfByte);
          }
        }
      }
    });
    GMTrace.o(9478053298176L, 70617);
  }
  
  public final int j(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9478187515904L, 70618);
    long l = bg.Pv();
    int i = 0;
    if (this.mode == 1) {
      i = Server.Java2C.send(this.iVC, this.iVD, paramArrayOfByte);
    }
    for (;;)
    {
      w.i("MicroMsg.BackupCEngine", "send result:%d seq:%d  buff:%d time[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(bg.br(paramArrayOfByte)), Long.valueOf(bg.aH(l)) });
      GMTrace.o(9478187515904L, 70618);
      return i;
      if (this.mode == 2)
      {
        i = Client.Java2C.send(this.iVC, this.iVD, paramArrayOfByte);
        b.kD(bg.br(paramArrayOfByte));
      }
    }
  }
  
  public final void stop()
  {
    GMTrace.i(9477919080448L, 70616);
    w.i("MicroMsg.BackupCEngine", "BackupCEngine stop.");
    if (this.mode == 1)
    {
      Server.Java2C.stop();
      b.aeS();
      this.mode = 0;
      GMTrace.o(9477919080448L, 70616);
      return;
    }
    if (this.mode == 2)
    {
      Client.Java2C.disconnect();
      b.aeS();
      this.mode = 0;
      GMTrace.o(9477919080448L, 70616);
      return;
    }
    GMTrace.o(9477919080448L, 70616);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */