package com.tencent.mm.plugin.g.a.c;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public final class c
{
  public static final class a
  {
    BluetoothSocket jol;
    final boolean jom;
    public final b jon;
    public final a joo;
    boolean jop;
    final BluetoothDevice joq;
    public final ae mHandler;
    private final HandlerThread mThread;
    
    public a(b paramb, a parama, BluetoothDevice paramBluetoothDevice, boolean paramBoolean)
    {
      GMTrace.i(4807142146048L, 35816);
      this.joo = parama;
      this.jon = paramb;
      this.jom = true;
      this.jop = false;
      this.joq = paramBluetoothDevice;
      this.mThread = e.SV("BluetoothChatThreads_handlerThread");
      this.mThread.start();
      this.mHandler = new a(this.mThread.getLooper(), this);
      GMTrace.o(4807142146048L, 35816);
    }
    
    public final void disconnect()
    {
      GMTrace.i(4807276363776L, 35817);
      w.i("MicroMsg.exdevice.ConnectThread", "------disconnect------");
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1))) {
        w.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", new Object[] { Integer.valueOf(1) });
      }
      if (f.et(18))
      {
        this.mThread.quitSafely();
        GMTrace.o(4807276363776L, 35817);
        return;
      }
      this.mThread.quit();
      GMTrace.o(4807276363776L, 35817);
    }
    
    private static final class a
      extends ae
    {
      private WeakReference<c.a> jlI;
      
      public a(Looper paramLooper, c.a parama)
      {
        super();
        GMTrace.i(4807813234688L, 35821);
        this.jlI = null;
        this.jlI = new WeakReference(parama);
        GMTrace.o(4807813234688L, 35821);
      }
      
      /* Error */
      public final void handleMessage(android.os.Message paramMessage)
      {
        // Byte code:
        //   0: ldc2_w 42
        //   3: ldc 44
        //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: aload_0
        //   9: getfield 28	com/tencent/mm/plugin/g/a/c/c$a$a:jlI	Ljava/lang/ref/WeakReference;
        //   12: invokevirtual 48	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
        //   15: checkcast 6	com/tencent/mm/plugin/g/a/c/c$a
        //   18: astore_2
        //   19: aload_2
        //   20: ifnonnull +19 -> 39
        //   23: ldc 50
        //   25: ldc 52
        //   27: invokestatic 58	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   30: ldc2_w 42
        //   33: ldc 44
        //   35: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   38: return
        //   39: aload_1
        //   40: getfield 64	android/os/Message:what	I
        //   43: tableswitch	default:+21->64, 0:+30->73, 1:+404->447
        //   64: ldc2_w 42
        //   67: ldc 44
        //   69: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: return
        //   73: ldc 66
        //   75: ldc 68
        //   77: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   80: aload_2
        //   81: getfield 74	com/tencent/mm/plugin/g/a/c/c$a:jop	Z
        //   84: ifeq +19 -> 103
        //   87: ldc 66
        //   89: ldc 76
        //   91: invokestatic 79	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
        //   94: ldc2_w 42
        //   97: ldc 44
        //   99: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   102: return
        //   103: aload_2
        //   104: getfield 82	com/tencent/mm/plugin/g/a/c/c$a:jom	Z
        //   107: ifeq +183 -> 290
        //   110: aload_2
        //   111: aload_2
        //   112: getfield 86	com/tencent/mm/plugin/g/a/c/c$a:joq	Landroid/bluetooth/BluetoothDevice;
        //   115: getstatic 92	com/tencent/mm/plugin/g/a/c/a:joc	Ljava/util/UUID;
        //   118: invokevirtual 98	android/bluetooth/BluetoothDevice:createRfcommSocketToServiceRecord	(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;
        //   121: putfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   124: aload_2
        //   125: getfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   128: invokevirtual 108	android/bluetooth/BluetoothSocket:connect	()V
        //   131: aload_2
        //   132: iconst_1
        //   133: putfield 74	com/tencent/mm/plugin/g/a/c/c$a:jop	Z
        //   136: aload_2
        //   137: getfield 112	com/tencent/mm/plugin/g/a/c/c$a:jon	Lcom/tencent/mm/plugin/g/a/c/b;
        //   140: astore_1
        //   141: aload_2
        //   142: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   145: astore_3
        //   146: aload_2
        //   147: getfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   150: astore 4
        //   152: ldc 118
        //   154: ldc 120
        //   156: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   159: aload_1
        //   160: iconst_3
        //   161: putfield 125	com/tencent/mm/plugin/g/a/c/b:mState	I
        //   164: aload_1
        //   165: getfield 129	com/tencent/mm/plugin/g/a/c/b:joj	Lcom/tencent/mm/plugin/g/a/c/c$b;
        //   168: ifnull +15 -> 183
        //   171: aload_1
        //   172: getfield 129	com/tencent/mm/plugin/g/a/c/b:joj	Lcom/tencent/mm/plugin/g/a/c/c$b;
        //   175: invokevirtual 134	com/tencent/mm/plugin/g/a/c/c$b:cancel	()V
        //   178: aload_1
        //   179: aconst_null
        //   180: putfield 129	com/tencent/mm/plugin/g/a/c/b:joj	Lcom/tencent/mm/plugin/g/a/c/c$b;
        //   183: aload_1
        //   184: getfield 138	com/tencent/mm/plugin/g/a/c/b:jok	Lcom/tencent/mm/plugin/g/a/c/c$c;
        //   187: ifnull +15 -> 202
        //   190: aload_1
        //   191: getfield 138	com/tencent/mm/plugin/g/a/c/b:jok	Lcom/tencent/mm/plugin/g/a/c/c$c;
        //   194: invokevirtual 141	com/tencent/mm/plugin/g/a/c/c$c:cancel	()V
        //   197: aload_1
        //   198: aconst_null
        //   199: putfield 138	com/tencent/mm/plugin/g/a/c/b:jok	Lcom/tencent/mm/plugin/g/a/c/c$c;
        //   202: aload_1
        //   203: new 131	com/tencent/mm/plugin/g/a/c/c$b
        //   206: dup
        //   207: aload_1
        //   208: aload_3
        //   209: aload 4
        //   211: invokespecial 144	com/tencent/mm/plugin/g/a/c/c$b:<init>	(Lcom/tencent/mm/plugin/g/a/c/b;Lcom/tencent/mm/plugin/g/a/c/a;Landroid/bluetooth/BluetoothSocket;)V
        //   214: putfield 129	com/tencent/mm/plugin/g/a/c/b:joj	Lcom/tencent/mm/plugin/g/a/c/c$b;
        //   217: aload_1
        //   218: getfield 129	com/tencent/mm/plugin/g/a/c/b:joj	Lcom/tencent/mm/plugin/g/a/c/c$b;
        //   221: ldc -110
        //   223: invokestatic 152	com/tencent/mm/sdk/f/e:b	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
        //   226: invokevirtual 157	java/lang/Thread:start	()V
        //   229: aload_1
        //   230: new 140	com/tencent/mm/plugin/g/a/c/c$c
        //   233: dup
        //   234: aload_1
        //   235: aload_3
        //   236: aload 4
        //   238: invokespecial 158	com/tencent/mm/plugin/g/a/c/c$c:<init>	(Lcom/tencent/mm/plugin/g/a/c/b;Lcom/tencent/mm/plugin/g/a/c/a;Landroid/bluetooth/BluetoothSocket;)V
        //   241: putfield 138	com/tencent/mm/plugin/g/a/c/b:jok	Lcom/tencent/mm/plugin/g/a/c/c$c;
        //   244: aload_1
        //   245: getfield 138	com/tencent/mm/plugin/g/a/c/b:jok	Lcom/tencent/mm/plugin/g/a/c/c$c;
        //   248: ldc -96
        //   250: invokestatic 152	com/tencent/mm/sdk/f/e:b	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
        //   253: invokevirtual 157	java/lang/Thread:start	()V
        //   256: aload_2
        //   257: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   260: ifnull +21 -> 281
        //   263: aload_2
        //   264: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   267: getfield 164	com/tencent/mm/plugin/g/a/c/a:joe	Lcom/tencent/mm/plugin/g/a/c/a$a;
        //   270: aload_2
        //   271: getfield 112	com/tencent/mm/plugin/g/a/c/c$a:jon	Lcom/tencent/mm/plugin/g/a/c/b;
        //   274: getfield 168	com/tencent/mm/plugin/g/a/c/b:mSessionId	J
        //   277: iconst_1
        //   278: invokevirtual 174	com/tencent/mm/plugin/g/a/c/a$a:d	(JZ)V
        //   281: ldc2_w 42
        //   284: ldc 44
        //   286: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   289: return
        //   290: aload_2
        //   291: aload_2
        //   292: getfield 86	com/tencent/mm/plugin/g/a/c/c$a:joq	Landroid/bluetooth/BluetoothDevice;
        //   295: getstatic 177	com/tencent/mm/plugin/g/a/c/a:jod	Ljava/util/UUID;
        //   298: invokevirtual 180	android/bluetooth/BluetoothDevice:createInsecureRfcommSocketToServiceRecord	(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;
        //   301: putfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   304: goto -180 -> 124
        //   307: astore_1
        //   308: aload_2
        //   309: aconst_null
        //   310: putfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   313: ldc 66
        //   315: ldc -74
        //   317: iconst_1
        //   318: anewarray 184	java/lang/Object
        //   321: dup
        //   322: iconst_0
        //   323: aload_1
        //   324: invokevirtual 188	java/io/IOException:toString	()Ljava/lang/String;
        //   327: aastore
        //   328: invokestatic 191	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   331: aload_2
        //   332: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   335: ifnull +21 -> 356
        //   338: aload_2
        //   339: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   342: getfield 164	com/tencent/mm/plugin/g/a/c/a:joe	Lcom/tencent/mm/plugin/g/a/c/a$a;
        //   345: aload_2
        //   346: getfield 112	com/tencent/mm/plugin/g/a/c/c$a:jon	Lcom/tencent/mm/plugin/g/a/c/b;
        //   349: getfield 168	com/tencent/mm/plugin/g/a/c/b:mSessionId	J
        //   352: iconst_0
        //   353: invokevirtual 174	com/tencent/mm/plugin/g/a/c/a$a:d	(JZ)V
        //   356: ldc2_w 42
        //   359: ldc 44
        //   361: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   364: return
        //   365: astore_1
        //   366: ldc 66
        //   368: ldc -63
        //   370: iconst_1
        //   371: anewarray 184	java/lang/Object
        //   374: dup
        //   375: iconst_0
        //   376: aload_1
        //   377: invokevirtual 188	java/io/IOException:toString	()Ljava/lang/String;
        //   380: aastore
        //   381: invokestatic 191	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   384: aload_2
        //   385: getfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   388: invokevirtual 196	android/bluetooth/BluetoothSocket:close	()V
        //   391: aload_2
        //   392: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   395: ifnull +21 -> 416
        //   398: aload_2
        //   399: getfield 116	com/tencent/mm/plugin/g/a/c/c$a:joo	Lcom/tencent/mm/plugin/g/a/c/a;
        //   402: getfield 164	com/tencent/mm/plugin/g/a/c/a:joe	Lcom/tencent/mm/plugin/g/a/c/a$a;
        //   405: aload_2
        //   406: getfield 112	com/tencent/mm/plugin/g/a/c/c$a:jon	Lcom/tencent/mm/plugin/g/a/c/b;
        //   409: getfield 168	com/tencent/mm/plugin/g/a/c/b:mSessionId	J
        //   412: iconst_0
        //   413: invokevirtual 174	com/tencent/mm/plugin/g/a/c/a$a:d	(JZ)V
        //   416: ldc2_w 42
        //   419: ldc 44
        //   421: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   424: return
        //   425: astore_1
        //   426: ldc 66
        //   428: ldc -58
        //   430: iconst_1
        //   431: anewarray 184	java/lang/Object
        //   434: dup
        //   435: iconst_0
        //   436: aload_1
        //   437: invokevirtual 188	java/io/IOException:toString	()Ljava/lang/String;
        //   440: aastore
        //   441: invokestatic 191	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   444: goto -53 -> 391
        //   447: aload_2
        //   448: getfield 74	com/tencent/mm/plugin/g/a/c/c$a:jop	Z
        //   451: ifne +19 -> 470
        //   454: ldc 66
        //   456: ldc -56
        //   458: invokestatic 79	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
        //   461: ldc2_w 42
        //   464: ldc 44
        //   466: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   469: return
        //   470: aload_2
        //   471: getfield 102	com/tencent/mm/plugin/g/a/c/c$a:jol	Landroid/bluetooth/BluetoothSocket;
        //   474: invokevirtual 196	android/bluetooth/BluetoothSocket:close	()V
        //   477: ldc2_w 42
        //   480: ldc 44
        //   482: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   485: return
        //   486: astore_1
        //   487: ldc 66
        //   489: ldc -54
        //   491: iconst_1
        //   492: anewarray 184	java/lang/Object
        //   495: dup
        //   496: iconst_0
        //   497: aload_1
        //   498: invokevirtual 188	java/io/IOException:toString	()Ljava/lang/String;
        //   501: aastore
        //   502: invokestatic 191	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   505: goto -441 -> 64
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	508	0	this	a
        //   0	508	1	paramMessage	android.os.Message
        //   18	453	2	locala	c.a
        //   145	91	3	locala1	a
        //   150	87	4	localBluetoothSocket	BluetoothSocket
        // Exception table:
        //   from	to	target	type
        //   103	124	307	java/io/IOException
        //   290	304	307	java/io/IOException
        //   124	131	365	java/io/IOException
        //   384	391	425	java/io/IOException
        //   470	477	486	java/io/IOException
      }
    }
  }
  
  public static final class b
    implements Runnable
  {
    private final BluetoothSocket jol;
    private b jon;
    a joo;
    private InputStream jor;
    private volatile boolean jos;
    
    public b(b paramb, a parama, BluetoothSocket paramBluetoothSocket)
    {
      GMTrace.i(4807410581504L, 35818);
      this.jol = paramBluetoothSocket;
      this.jon = paramb;
      this.joo = parama;
      this.jos = false;
      this.jor = null;
      try
      {
        this.jor = paramBluetoothSocket.getInputStream();
        GMTrace.o(4807410581504L, 35818);
        return;
      }
      catch (IOException paramb)
      {
        this.jor = null;
        w.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! (%s)", new Object[] { paramb.toString() });
        GMTrace.o(4807410581504L, 35818);
      }
    }
    
    public final void cancel()
    {
      GMTrace.i(4807679016960L, 35820);
      w.i("MicroMsg.exdevice.RecvThread", "------cancel------");
      if (this.jos)
      {
        w.w("MicroMsg.exdevice.RecvThread", "Cancel is done aready, just leave");
        GMTrace.o(4807679016960L, 35820);
        return;
      }
      this.jos = true;
      e.L(this);
      try
      {
        this.jol.close();
        GMTrace.o(4807679016960L, 35820);
        return;
      }
      catch (IOException localIOException)
      {
        w.e("MicroMsg.exdevice.RecvThread", "close() of connect socket failed", new Object[] { localIOException });
        GMTrace.o(4807679016960L, 35820);
      }
    }
    
    public final void run()
    {
      GMTrace.i(4807544799232L, 35819);
      w.i("MicroMsg.exdevice.RecvThread", "BEGIN RecvThread");
      if (this.jor == null)
      {
        w.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! Just Leave");
        GMTrace.o(4807544799232L, 35819);
        return;
      }
      byte[] arrayOfByte1 = new byte['ࠀ'];
      for (;;)
      {
        if (this.jos)
        {
          w.w("MicroMsg.exdevice.RecvThread", "Cancel is called while receiving data, just leave");
          GMTrace.o(4807544799232L, 35819);
          return;
        }
        try
        {
          int i = this.jor.read(arrayOfByte1);
          if (i > 0)
          {
            w.i("MicroMsg.exdevice.RecvThread", "------On data receivce------data length = %d", new Object[] { Integer.valueOf(i) });
            w.d("MicroMsg.exdevice.RecvThread", "data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.w(arrayOfByte1, i) });
            byte[] arrayOfByte2 = new byte[i];
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
            if (this.joo != null) {
              this.joo.joe.b(this.jon.mSessionId, arrayOfByte2);
            }
          }
        }
        catch (IOException localIOException1)
        {
          w.e("MicroMsg.exdevice.RecvThread", "mInStream.read Failed!!! (%s)", new Object[] { localIOException1.toString() });
          try
          {
            this.jol.close();
            GMTrace.o(4807544799232L, 35819);
            return;
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.exdevice.RecvThread", "Close socket failed!!! (%s)", new Object[] { localIOException2.toString() });
            GMTrace.o(4807544799232L, 35819);
          }
        }
      }
    }
  }
  
  public static final class c
    implements Runnable
  {
    private b jon;
    private a joo;
    private volatile boolean jos;
    private volatile Runnable jot;
    private OutputStream jou;
    private final LinkedList<byte[]> jov;
    private final LinkedList<byte[]> jow;
    
    public c(b paramb, a parama, BluetoothSocket paramBluetoothSocket)
    {
      GMTrace.i(4805799968768L, 35806);
      this.jot = null;
      this.jou = null;
      this.jov = new LinkedList();
      this.jow = new LinkedList();
      this.jon = null;
      this.joo = null;
      this.jos = false;
      this.jon = paramb;
      this.joo = parama;
      try
      {
        paramb = paramBluetoothSocket.getOutputStream();
        this.jot = this;
        this.jou = paramb;
        GMTrace.o(4805799968768L, 35806);
        return;
      }
      catch (IOException paramb)
      {
        w.e("MicroMsg.exdevice.SendThread", "temp sockets not created", new Object[] { paramb });
        this.jou = null;
        if (this.joo != null) {
          this.joo.joe.b(this.jon.mSessionId, 11, "Can not get write stream");
        }
        GMTrace.o(4805799968768L, 35806);
      }
    }
    
    public final boolean ac(byte[] paramArrayOfByte)
    {
      GMTrace.i(4806068404224L, 35808);
      w.i("MicroMsg.exdevice.SendThread", "------write------buffer length = %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
      if (this.jot == null)
      {
        w.e("MicroMsg.exdevice.SendThread", "Send thread has been close. Send data abort");
        GMTrace.o(4806068404224L, 35808);
        return false;
      }
      try
      {
        this.jov.add(paramArrayOfByte);
        notify();
        GMTrace.o(4806068404224L, 35808);
        return true;
      }
      finally {}
    }
    
    public final void cancel()
    {
      GMTrace.i(4806202621952L, 35809);
      this.jot = null;
      this.jos = true;
      try
      {
        notify();
        this.jow.clear();
        this.jov.clear();
        GMTrace.o(4806202621952L, 35809);
        return;
      }
      finally {}
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 134
      //   3: ldc -120
      //   5: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: ldc 67
      //   10: ldc -118
      //   12: invokestatic 140	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   15: aload_0
      //   16: getfield 43	com/tencent/mm/plugin/g/a/c/c$c:jou	Ljava/io/OutputStream;
      //   19: ifnonnull +38 -> 57
      //   22: ldc2_w 134
      //   25: ldc -120
      //   27: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   30: return
      //   31: astore_1
      //   32: aload_0
      //   33: getfield 54	com/tencent/mm/plugin/g/a/c/c$c:joo	Lcom/tencent/mm/plugin/g/a/c/a;
      //   36: ifnull +21 -> 57
      //   39: aload_0
      //   40: getfield 54	com/tencent/mm/plugin/g/a/c/c$c:joo	Lcom/tencent/mm/plugin/g/a/c/a;
      //   43: getfield 81	com/tencent/mm/plugin/g/a/c/a:joe	Lcom/tencent/mm/plugin/g/a/c/a$a;
      //   46: aload_0
      //   47: getfield 52	com/tencent/mm/plugin/g/a/c/c$c:jon	Lcom/tencent/mm/plugin/g/a/c/b;
      //   50: getfield 87	com/tencent/mm/plugin/g/a/c/b:mSessionId	J
      //   53: iconst_0
      //   54: invokevirtual 143	com/tencent/mm/plugin/g/a/c/a$a:e	(JZ)V
      //   57: aload_0
      //   58: getfield 56	com/tencent/mm/plugin/g/a/c/c$c:jos	Z
      //   61: ifne +170 -> 231
      //   64: aload_0
      //   65: getfield 41	com/tencent/mm/plugin/g/a/c/c$c:jot	Ljava/lang/Runnable;
      //   68: ifnonnull +19 -> 87
      //   71: ldc 67
      //   73: ldc -111
      //   75: invokestatic 148	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   78: ldc2_w 134
      //   81: ldc -120
      //   83: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   86: return
      //   87: aload_0
      //   88: getfield 50	com/tencent/mm/plugin/g/a/c/c$c:jow	Ljava/util/LinkedList;
      //   91: invokevirtual 152	java/util/LinkedList:isEmpty	()Z
      //   94: ifne +50 -> 144
      //   97: aload_0
      //   98: getfield 50	com/tencent/mm/plugin/g/a/c/c$c:jow	Ljava/util/LinkedList;
      //   101: invokevirtual 156	java/util/LinkedList:pop	()Ljava/lang/Object;
      //   104: checkcast 158	[B
      //   107: astore_1
      //   108: aload_0
      //   109: getfield 43	com/tencent/mm/plugin/g/a/c/c$c:jou	Ljava/io/OutputStream;
      //   112: aload_1
      //   113: invokevirtual 164	java/io/OutputStream:write	([B)V
      //   116: aload_0
      //   117: getfield 54	com/tencent/mm/plugin/g/a/c/c$c:joo	Lcom/tencent/mm/plugin/g/a/c/a;
      //   120: ifnull -63 -> 57
      //   123: aload_0
      //   124: getfield 54	com/tencent/mm/plugin/g/a/c/c$c:joo	Lcom/tencent/mm/plugin/g/a/c/a;
      //   127: getfield 81	com/tencent/mm/plugin/g/a/c/a:joe	Lcom/tencent/mm/plugin/g/a/c/a$a;
      //   130: aload_0
      //   131: getfield 52	com/tencent/mm/plugin/g/a/c/c$c:jon	Lcom/tencent/mm/plugin/g/a/c/b;
      //   134: getfield 87	com/tencent/mm/plugin/g/a/c/b:mSessionId	J
      //   137: iconst_1
      //   138: invokevirtual 143	com/tencent/mm/plugin/g/a/c/a$a:e	(JZ)V
      //   141: goto -84 -> 57
      //   144: aload_0
      //   145: getfield 48	com/tencent/mm/plugin/g/a/c/c$c:jov	Ljava/util/LinkedList;
      //   148: invokevirtual 152	java/util/LinkedList:isEmpty	()Z
      //   151: ifne +41 -> 192
      //   154: aload_0
      //   155: getfield 48	com/tencent/mm/plugin/g/a/c/c$c:jov	Ljava/util/LinkedList;
      //   158: astore_1
      //   159: aload_1
      //   160: monitorenter
      //   161: aload_0
      //   162: getfield 50	com/tencent/mm/plugin/g/a/c/c$c:jow	Ljava/util/LinkedList;
      //   165: aload_0
      //   166: getfield 48	com/tencent/mm/plugin/g/a/c/c$c:jov	Ljava/util/LinkedList;
      //   169: invokevirtual 168	java/util/LinkedList:addAll	(Ljava/util/Collection;)Z
      //   172: invokestatic 174	junit/framework/Assert:assertTrue	(Z)V
      //   175: aload_0
      //   176: getfield 48	com/tencent/mm/plugin/g/a/c/c$c:jov	Ljava/util/LinkedList;
      //   179: invokevirtual 130	java/util/LinkedList:clear	()V
      //   182: aload_1
      //   183: monitorexit
      //   184: goto -127 -> 57
      //   187: astore_2
      //   188: aload_1
      //   189: monitorexit
      //   190: aload_2
      //   191: athrow
      //   192: aload_0
      //   193: monitorenter
      //   194: aload_0
      //   195: invokevirtual 177	java/lang/Object:wait	()V
      //   198: aload_0
      //   199: monitorexit
      //   200: goto -143 -> 57
      //   203: astore_1
      //   204: aload_0
      //   205: monitorexit
      //   206: aload_1
      //   207: athrow
      //   208: astore_1
      //   209: ldc 67
      //   211: aload_1
      //   212: ldc -77
      //   214: iconst_0
      //   215: anewarray 4	java/lang/Object
      //   218: invokestatic 183	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   221: ldc 67
      //   223: ldc -71
      //   225: invokestatic 148	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   228: goto -30 -> 198
      //   231: ldc2_w 134
      //   234: ldc -120
      //   236: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   239: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	240	0	this	c
      //   31	1	1	localIOException	IOException
      //   107	82	1	localObject1	Object
      //   203	4	1	localObject2	Object
      //   208	4	1	localInterruptedException	InterruptedException
      //   187	4	2	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   108	116	31	java/io/IOException
      //   161	184	187	finally
      //   188	190	187	finally
      //   194	198	203	finally
      //   198	200	203	finally
      //   204	206	203	finally
      //   209	228	203	finally
      //   194	198	208	java/lang/InterruptedException
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */