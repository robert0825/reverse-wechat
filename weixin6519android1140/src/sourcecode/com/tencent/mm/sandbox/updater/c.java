package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

public final class c
  extends com.tencent.mm.sandbox.monitor.c
{
  public String ero;
  public boolean gLX;
  public int jxh;
  public String mhL;
  public ae vfA;
  private b.a vfB;
  public b.a vfr;
  private String[] vfx;
  private a vfy;
  public boolean vfz;
  
  public c(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    super(paramInt1, paramString1, paramInt2, paramBoolean);
    GMTrace.i(3595156062208L, 26786);
    this.vfy = null;
    this.jxh = 0;
    this.vfz = false;
    this.gLX = false;
    this.vfA = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3597974634496L, 26807);
        if ((1 == paramAnonymousMessage.what) && (!c.this.gLX))
        {
          new File(c.this.aPU()).delete();
          if (paramAnonymousMessage.arg1 != 0) {
            break label97;
          }
          w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "patch ok");
          c.this.vfr.a(200, 0, (azh)paramAnonymousMessage.obj);
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(3597974634496L, 26807);
          return;
          label97:
          if (paramAnonymousMessage.arg1 == 3) {
            c.this.vfr.a(3, -1, (azh)paramAnonymousMessage.obj);
          } else if (paramAnonymousMessage.arg1 == 4) {
            c.this.vfr.a(4, -1, (azh)paramAnonymousMessage.obj);
          }
        }
      }
    };
    this.vfB = new b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, azh paramAnonymousazh)
      {
        GMTrace.i(3576768233472L, 26649);
        if (paramAnonymousInt1 != 0)
        {
          w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene error. netRet=" + paramAnonymousInt1);
          if (paramAnonymousInt1 == -2) {
            new File(c.this.aPU()).delete();
          }
          paramAnonymousazh = c.this;
          paramAnonymousazh.jxh += 1;
          c.this.a(c.this.vfr);
          GMTrace.o(3576768233472L, 26649);
          return;
        }
        w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene success");
        try
        {
          if (com.tencent.mm.a.e.aY(c.this.aPU()) < c.a(c.this))
          {
            w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene continue;");
            c.this.a(c.this.vfr);
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          c localc;
          if (c.this.vfz)
          {
            if (!c.this.ero.equalsIgnoreCase(g.bg(c.this.aPU())))
            {
              w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "pack md5 check error");
              new File(c.this.aPU()).delete();
              c.this.vfr.a(2, -1, paramAnonymousazh);
              GMTrace.o(3576768233472L, 26649);
              return;
            }
            localc = c.this;
          }
          Message localMessage;
          if (c.b(c.this).equalsIgnoreCase(g.bg(c.this.aPU()))) {
            break label462;
          }
        }
        catch (Exception localException1)
        {
          try
          {
            w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "in genNewAPKInNewThread()");
            com.tencent.mm.sdk.f.e.post(new c.2(localc, paramAnonymousazh), "NetSceneGetUpdatePackFromCDN_genApk");
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exception in genNewAPKInNewThread()");
            w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localException2, "", new Object[0]);
            localMessage = Message.obtain();
            localMessage.what = 1;
            localMessage.arg1 = 3;
            localMessage.obj = paramAnonymousazh;
            localException1.vfA.sendMessage(localMessage);
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          localException1 = localException1;
          w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "error occured during pack processing");
          w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localException1, "", new Object[0]);
          c.this.vfr.a(-1, -1, paramAnonymousazh);
          GMTrace.o(3576768233472L, 26649);
          return;
        }
        w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "update pack check error");
        new File(c.this.aPU()).delete();
        c.this.vfr.a(-1, -1, paramAnonymousazh);
        GMTrace.o(3576768233472L, 26649);
        return;
        label462:
        com.tencent.mm.a.e.g(com.tencent.mm.sandbox.monitor.c.veU, c.c(c.this) + ".temp", c.d(c.this) + ".apk");
        c.this.vfr.a(200, 0, paramAnonymousazh);
        GMTrace.o(3576768233472L, 26649);
      }
      
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3576634015744L, 26648);
        w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "progress, total=" + paramAnonymousInt1 + ", offset=" + paramAnonymousInt2);
        c.this.vfr.bP(paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(3576634015744L, 26648);
      }
      
      public final void eF(long paramAnonymousLong)
      {
        GMTrace.i(3576902451200L, 26650);
        c.this.vfr.eF(paramAnonymousLong);
        GMTrace.o(3576902451200L, 26650);
      }
      
      public final void eG(long paramAnonymousLong)
      {
        GMTrace.i(3577036668928L, 26651);
        c.this.vfr.eG(paramAnonymousLong);
        GMTrace.o(3577036668928L, 26651);
      }
    };
    this.vfx = new String[] { paramString2 };
    this.vfz = true;
    this.ero = paramString3;
    this.mhL = paramString4;
    GMTrace.o(3595156062208L, 26786);
  }
  
  public c(int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString, paramInt2, paramBoolean);
    GMTrace.i(3595021844480L, 26785);
    this.vfy = null;
    this.jxh = 0;
    this.vfz = false;
    this.gLX = false;
    this.vfA = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3597974634496L, 26807);
        if ((1 == paramAnonymousMessage.what) && (!c.this.gLX))
        {
          new File(c.this.aPU()).delete();
          if (paramAnonymousMessage.arg1 != 0) {
            break label97;
          }
          w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "patch ok");
          c.this.vfr.a(200, 0, (azh)paramAnonymousMessage.obj);
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(3597974634496L, 26807);
          return;
          label97:
          if (paramAnonymousMessage.arg1 == 3) {
            c.this.vfr.a(3, -1, (azh)paramAnonymousMessage.obj);
          } else if (paramAnonymousMessage.arg1 == 4) {
            c.this.vfr.a(4, -1, (azh)paramAnonymousMessage.obj);
          }
        }
      }
    };
    this.vfB = new b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, azh paramAnonymousazh)
      {
        GMTrace.i(3576768233472L, 26649);
        if (paramAnonymousInt1 != 0)
        {
          w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene error. netRet=" + paramAnonymousInt1);
          if (paramAnonymousInt1 == -2) {
            new File(c.this.aPU()).delete();
          }
          paramAnonymousazh = c.this;
          paramAnonymousazh.jxh += 1;
          c.this.a(c.this.vfr);
          GMTrace.o(3576768233472L, 26649);
          return;
        }
        w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene success");
        try
        {
          if (com.tencent.mm.a.e.aY(c.this.aPU()) < c.a(c.this))
          {
            w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene continue;");
            c.this.a(c.this.vfr);
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          c localc;
          if (c.this.vfz)
          {
            if (!c.this.ero.equalsIgnoreCase(g.bg(c.this.aPU())))
            {
              w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "pack md5 check error");
              new File(c.this.aPU()).delete();
              c.this.vfr.a(2, -1, paramAnonymousazh);
              GMTrace.o(3576768233472L, 26649);
              return;
            }
            localc = c.this;
          }
          Message localMessage;
          if (c.b(c.this).equalsIgnoreCase(g.bg(c.this.aPU()))) {
            break label462;
          }
        }
        catch (Exception localException1)
        {
          try
          {
            w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "in genNewAPKInNewThread()");
            com.tencent.mm.sdk.f.e.post(new c.2(localc, paramAnonymousazh), "NetSceneGetUpdatePackFromCDN_genApk");
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exception in genNewAPKInNewThread()");
            w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localException2, "", new Object[0]);
            localMessage = Message.obtain();
            localMessage.what = 1;
            localMessage.arg1 = 3;
            localMessage.obj = paramAnonymousazh;
            localException1.vfA.sendMessage(localMessage);
            GMTrace.o(3576768233472L, 26649);
            return;
          }
          localException1 = localException1;
          w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "error occured during pack processing");
          w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localException1, "", new Object[0]);
          c.this.vfr.a(-1, -1, paramAnonymousazh);
          GMTrace.o(3576768233472L, 26649);
          return;
        }
        w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "update pack check error");
        new File(c.this.aPU()).delete();
        c.this.vfr.a(-1, -1, paramAnonymousazh);
        GMTrace.o(3576768233472L, 26649);
        return;
        label462:
        com.tencent.mm.a.e.g(com.tencent.mm.sandbox.monitor.c.veU, c.c(c.this) + ".temp", c.d(c.this) + ".apk");
        c.this.vfr.a(200, 0, paramAnonymousazh);
        GMTrace.o(3576768233472L, 26649);
      }
      
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3576634015744L, 26648);
        w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "progress, total=" + paramAnonymousInt1 + ", offset=" + paramAnonymousInt2);
        c.this.vfr.bP(paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(3576634015744L, 26648);
      }
      
      public final void eF(long paramAnonymousLong)
      {
        GMTrace.i(3576902451200L, 26650);
        c.this.vfr.eF(paramAnonymousLong);
        GMTrace.o(3576902451200L, 26650);
      }
      
      public final void eG(long paramAnonymousLong)
      {
        GMTrace.i(3577036668928L, 26651);
        c.this.vfr.eG(paramAnonymousLong);
        GMTrace.o(3577036668928L, 26651);
      }
    };
    this.vfx = paramArrayOfString;
    GMTrace.o(3595021844480L, 26785);
  }
  
  private int bOR()
  {
    GMTrace.i(3595827150848L, 26791);
    w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "requestCount=" + this.jxh + ", curLinkIdx = " + this.jxh / 5);
    int i = this.jxh / 5;
    GMTrace.o(3595827150848L, 26791);
    return i;
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(3595290279936L, 26787);
    this.vfr = parama;
    if (!h.getExternalStorageState().equals("mounted"))
    {
      w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard not available.");
      parama.a(-1, -1, null);
      GMTrace.o(3595290279936L, 26787);
      return;
    }
    if (this.gLX)
    {
      w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "netscene had been canceled.");
      parama.a(-1, -1, null);
      GMTrace.o(3595290279936L, 26787);
      return;
    }
    if ((bOK()) || (bOR() >= this.vfx.length))
    {
      w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exceed max download url. url count = " + this.vfx.length);
      if (this.vfz)
      {
        parama.a(1, -1, null);
        GMTrace.o(3595290279936L, 26787);
        return;
      }
      parama.a(-1, -1, null);
      GMTrace.o(3595290279936L, 26787);
      return;
    }
    if (!f.L(this.veW))
    {
      w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard full");
      if (this.vfz)
      {
        parama.a(13, -1, null);
        GMTrace.o(3595290279936L, 26787);
        return;
      }
      parama.a(-1, -1, null);
      GMTrace.o(3595290279936L, 26787);
      return;
    }
    this.vfy = new a(this.veW, com.tencent.mm.a.e.aY(aPU()), this.vfB);
    this.vfy.execute(new String[] { this.vfx[bOR()] });
    GMTrace.o(3595290279936L, 26787);
  }
  
  protected final String aPU()
  {
    GMTrace.i(3595424497664L, 26788);
    if (this.vfz)
    {
      str = veU + this.ero + ".temp";
      GMTrace.o(3595424497664L, 26788);
      return str;
    }
    String str = super.aPU();
    GMTrace.o(3595424497664L, 26788);
    return str;
  }
  
  public final String bOJ()
  {
    GMTrace.i(3595558715392L, 26789);
    if (this.vfz)
    {
      str = veU + this.mhL + ".apk";
      GMTrace.o(3595558715392L, 26789);
      return str;
    }
    String str = veU + this.veY + ".apk";
    GMTrace.o(3595558715392L, 26789);
    return str;
  }
  
  public final void cancel()
  {
    GMTrace.i(3595692933120L, 26790);
    w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "cancel netscene");
    this.gLX = true;
    if ((this.vfy != null) && (!this.vfy.isCancelled())) {
      this.vfy.cancel(true);
    }
    GMTrace.o(3595692933120L, 26790);
  }
  
  private final class a
    extends AsyncTask<String, Integer, Integer>
  {
    private int aJF;
    private HttpClient nSj;
    private int size;
    private HttpPost vfE;
    private HttpResponse vfF;
    private HttpEntity vfG;
    private OutputStream vfH;
    private b.a vfr;
    
    public a(int paramInt1, int paramInt2, b.a parama)
    {
      GMTrace.i(3574620749824L, 26633);
      this.nSj = null;
      this.vfE = null;
      this.vfF = null;
      this.vfG = null;
      this.vfH = new OutputStream()
      {
        private ae handler;
        private ByteArrayOutputStream vfI;
        
        public final void write(int paramAnonymousInt)
        {
          GMTrace.i(3594619191296L, 26782);
          throw new IOException("unexpected operation");
        }
        
        public final void write(byte[] paramAnonymousArrayOfByte, final int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(3594484973568L, 26781);
          this.vfI.write(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2);
          if ((this.vfI.size() < 131072) && (c.a.a(c.a.this) + this.vfI.size() < c.a.b(c.a.this)))
          {
            GMTrace.o(3594484973568L, 26781);
            return;
          }
          paramAnonymousInt1 = this.vfI.size();
          paramAnonymousInt2 = com.tencent.mm.a.e.a(c.this.aPU(), this.vfI.toByteArray(), paramAnonymousInt1);
          this.vfI.reset();
          if (paramAnonymousInt2 != 0) {
            throw new IOException("appendToFile failed :" + paramAnonymousInt2);
          }
          c.a.a(c.a.this, c.a.a(c.a.this) + paramAnonymousInt1);
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3578378846208L, 26661);
              if (c.a.a(c.a.this) <= c.a.b(c.a.this)) {
                c.a.c(c.a.this).bP(c.a.b(c.a.this), c.a.a(c.a.this));
              }
              c.a.c(c.a.this).eG(paramAnonymousInt1);
              GMTrace.o(3578378846208L, 26661);
            }
          });
          if (c.this.gLX) {
            throw new IOException("manual force cancel!");
          }
          GMTrace.o(3594484973568L, 26781);
        }
      };
      this.size = paramInt1;
      this.aJF = paramInt2;
      this.vfr = parama;
      GMTrace.o(3574620749824L, 26633);
    }
    
    private Integer D(String... paramVarArgs)
    {
      GMTrace.i(3574754967552L, 26634);
      paramVarArgs = paramVarArgs[0];
      if ((paramVarArgs == null) || (paramVarArgs.length() == 0))
      {
        GMTrace.o(3574754967552L, 26634);
        return Integer.valueOf(-1);
      }
      w.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "current download url=" + paramVarArgs + ", range=" + this.aJF);
      this.nSj = new DefaultHttpClient();
      this.nSj.getParams().setIntParameter("http.connection.timeout", 15000);
      this.vfE = new HttpPost(paramVarArgs);
      HttpPost localHttpPost = this.vfE;
      StringBuilder localStringBuilder = new StringBuilder("bytes=").append(this.aJF).append("-");
      if (this.size - this.aJF > 1048576) {
        paramVarArgs = Integer.valueOf(this.aJF + 1048576 - 1);
      }
      for (;;)
      {
        localHttpPost.addHeader("RANGE", paramVarArgs);
        try
        {
          this.vfr.eF(50L);
          this.vfF = this.nSj.execute(this.vfE);
          int i = this.vfF.getStatusLine().getStatusCode();
          if ((i != 200) && (i != 206))
          {
            w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "HttpClient return code:" + i);
            if (i == 416)
            {
              if (this.vfE != null) {
                this.vfE.abort();
              }
              if (this.vfG != null) {}
              try
              {
                this.vfG.consumeContent();
                if (this.nSj != null) {
                  this.nSj.getConnectionManager().shutdown();
                }
                GMTrace.o(3574754967552L, 26634);
                return Integer.valueOf(-2);
                paramVarArgs = "";
              }
              catch (IOException paramVarArgs)
              {
                for (;;)
                {
                  w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
                }
              }
            }
            if (this.vfE != null) {
              this.vfE.abort();
            }
            if (this.vfG != null) {}
            try
            {
              this.vfG.consumeContent();
              if (this.nSj != null) {
                this.nSj.getConnectionManager().shutdown();
              }
              GMTrace.o(3574754967552L, 26634);
              return Integer.valueOf(-1);
            }
            catch (IOException paramVarArgs)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
              }
            }
          }
          if ((c.this.vfz) && (r.hjY) && (Math.random() > 0.2D))
          {
            w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "simulateNetworkFault");
            if (this.vfE != null) {
              this.vfE.abort();
            }
            if (this.vfG != null) {}
            try
            {
              this.vfG.consumeContent();
              if (this.nSj != null) {
                this.nSj.getConnectionManager().shutdown();
              }
              GMTrace.o(3574754967552L, 26634);
              return Integer.valueOf(-1);
            }
            catch (IOException paramVarArgs)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
              }
            }
          }
          this.vfF.getHeaders("Content-Length");
          if (this.aJF > this.size)
          {
            w.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "range out of size");
            if (this.vfE != null) {
              this.vfE.abort();
            }
            if (this.vfG != null) {}
            try
            {
              this.vfG.consumeContent();
              if (this.nSj != null) {
                this.nSj.getConnectionManager().shutdown();
              }
              GMTrace.o(3574754967552L, 26634);
              return Integer.valueOf(-2);
            }
            catch (IOException paramVarArgs)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
              }
            }
          }
          this.vfG = this.vfF.getEntity();
          this.vfG.writeTo(this.vfH);
          this.vfG.consumeContent();
          if (this.vfE != null) {
            this.vfE.abort();
          }
          if (this.vfG != null) {}
          try
          {
            this.vfG.consumeContent();
            if (this.nSj != null) {
              this.nSj.getConnectionManager().shutdown();
            }
            GMTrace.o(3574754967552L, 26634);
            return Integer.valueOf(0);
          }
          catch (IOException paramVarArgs)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
            }
          }
          try
          {
            this.vfG.consumeContent();
            if (this.nSj != null) {
              this.nSj.getConnectionManager().shutdown();
            }
            throw paramVarArgs;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException, "", new Object[0]);
            }
          }
        }
        catch (Exception paramVarArgs)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
          w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "exception current in download pack", new Object[0]);
          if (this.vfE != null) {
            this.vfE.abort();
          }
          if (this.vfG != null) {}
          try
          {
            this.vfG.consumeContent();
            if (this.nSj != null) {
              this.nSj.getConnectionManager().shutdown();
            }
            GMTrace.o(3574754967552L, 26634);
            return Integer.valueOf(-1);
          }
          catch (IOException paramVarArgs)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramVarArgs, "", new Object[0]);
            }
          }
        }
        finally
        {
          if (this.vfE != null) {
            this.vfE.abort();
          }
          if (this.vfG == null) {}
        }
      }
    }
    
    protected final void onCancelled()
    {
      GMTrace.i(3574889185280L, 26635);
      w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "AsyncTask had been canceled.");
      if (this.vfE != null) {
        this.vfE.abort();
      }
      if (this.vfG != null) {}
      try
      {
        this.vfG.consumeContent();
        if (this.nSj != null)
        {
          w.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "connection shutdown.");
          this.nSj.getConnectionManager().shutdown();
        }
        GMTrace.o(3574889185280L, 26635);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */