package com.tencent.mm.bd.a;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.qq.wx.voice.vad.EVadNative;
import com.qq.wx.voice.vad.MMVoipVadNative;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Map;

public class c
{
  private static final String TAG;
  public static SharedPreferences ghC;
  private ae handler;
  private boolean hfI;
  private int hfJ;
  private boolean hfK;
  private boolean hfL;
  private long hfM;
  private int hfN;
  private boolean hfO;
  private a hfP;
  private com.qq.wx.voice.vad.a hfQ;
  public a hfR;
  private short[] hfS;
  
  static
  {
    GMTrace.i(4383550996480L, 32660);
    TAG = c.class.getSimpleName();
    ghC = ab.bPV();
    GMTrace.o(4383550996480L, 32660);
  }
  
  public c()
  {
    this(3500, 16000, ghC.getInt("sil_time", 1000), ghC.getFloat("s_n_ration", 2.5F), ghC.getInt("s_window", 500), ghC.getInt("s_length", 350), ghC.getInt("s_delay_time", 550), true, true);
    GMTrace.i(4382879907840L, 32655);
    GMTrace.o(4382879907840L, 32655);
  }
  
  public c(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4383014125568L, 32656);
    this.hfI = true;
    this.hfJ = 3;
    this.hfK = false;
    this.hfL = false;
    this.hfM = 0L;
    this.hfN = 3500;
    this.hfO = false;
    this.handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(4382343036928L, 32651);
        if (paramAnonymousMessage.what != 0)
        {
          GMTrace.o(4382343036928L, 32651);
          return;
        }
        if (c.this.hfR != null) {
          c.this.hfR.qf();
        }
        GMTrace.o(4382343036928L, 32651);
      }
    };
    this.hfP = null;
    this.hfQ = null;
    this.hfN = paramInt1;
    this.hfQ = new com.qq.wx.voice.vad.a();
    int i = 0;
    paramInt2 = i;
    Object localObject;
    if (ab.bPY())
    {
      localObject = com.tencent.mm.y.c.c.Ct().er("100235");
      paramInt2 = i;
      if (((com.tencent.mm.storage.c)localObject).isValid()) {
        paramInt2 = bg.getInt((String)((com.tencent.mm.storage.c)localObject).bSg().get("MMVoipVadOn"), 0);
      }
    }
    w.i(TAG, "VoiceSilentDetectAPI: abTestFlag = [%s]", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 == 0)
    {
      com.qq.wx.voice.vad.a.ai(false);
      localObject = this.hfQ;
      if (!com.qq.wx.voice.vad.a.aDA) {
        break label295;
      }
      ((com.qq.wx.voice.vad.a)localObject).aDx = ((com.qq.wx.voice.vad.a)localObject).aDz.Init(16000, paramInt3, paramFloat, paramInt4, paramInt5);
      label206:
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad Init handle = " + ((com.qq.wx.voice.vad.a)localObject).aDx);
      }
      if (((com.qq.wx.voice.vad.a)localObject).aDx != 0L) {
        break label321;
      }
      paramInt2 = 1;
      label250:
      if (paramInt2 != 1)
      {
        localObject = this.hfQ;
        if (((com.qq.wx.voice.vad.a)localObject).aDx != 0L) {
          break label326;
        }
        paramInt2 = 1;
      }
    }
    for (;;)
    {
      if (paramInt2 != 1) {
        break label398;
      }
      throw new b("Init ERROR");
      com.qq.wx.voice.vad.a.ai(true);
      break;
      label295:
      ((com.qq.wx.voice.vad.a)localObject).aDx = ((com.qq.wx.voice.vad.a)localObject).aDy.Init(16000, paramInt3, paramFloat, paramInt4, paramInt5);
      break label206;
      label321:
      paramInt2 = 0;
      break label250;
      label326:
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad Reset handle = " + ((com.qq.wx.voice.vad.a)localObject).aDx);
      }
      if (com.qq.wx.voice.vad.a.aDA) {
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).aDz.Reset(((com.qq.wx.voice.vad.a)localObject).aDx);
      } else {
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).aDy.Reset(((com.qq.wx.voice.vad.a)localObject).aDx);
      }
    }
    label398:
    this.hfP = new a(paramInt6 * 16);
    this.hfS = new short['ྠ'];
    this.handler.removeMessages(0);
    this.handler.sendEmptyMessageDelayed(0, paramInt1);
    this.hfK = paramBoolean1;
    this.hfL = paramBoolean2;
    GMTrace.o(4383014125568L, 32656);
  }
  
  public static String Oj()
  {
    GMTrace.i(4382745690112L, 32654);
    String str = String.format(Locale.CHINA, "%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s", new Object[] { "sil_time", Integer.valueOf(ghC.getInt("sil_time", 500)), "s_n_ration", Float.valueOf(ghC.getFloat("s_n_ration", 2.5F)), "s_window", Integer.valueOf(ghC.getInt("s_window", 500)), "s_length", Integer.valueOf(ghC.getInt("s_length", 350)), "s_delay_time", Integer.valueOf(ghC.getInt("s_delay_time", 550)) });
    GMTrace.o(4382745690112L, 32654);
    return str;
  }
  
  public final void c(short[] paramArrayOfShort, int paramInt)
  {
    GMTrace.i(4383148343296L, 32657);
    w.d(TAG, "input() called with: voice = [%s], length = [%s]", new Object[] { paramArrayOfShort, Integer.valueOf(paramInt) });
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0) || (paramInt <= 0) || (paramInt > paramArrayOfShort.length))
    {
      GMTrace.o(4383148343296L, 32657);
      return;
    }
    if (this.hfO)
    {
      w.i(TAG, "VoiceSilentDetectAPI is released.");
      GMTrace.o(4383148343296L, 32657);
      return;
    }
    Object localObject = this.hfQ;
    int i;
    if (((com.qq.wx.voice.vad.a)localObject).aDx == 0L) {
      i = 1;
    }
    long l;
    for (;;)
    {
      w.d(TAG, "currState = %s,prevState = %s,directFirstStart = %s,directTempState = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(this.hfJ), Boolean.valueOf(this.hfK), Boolean.valueOf(this.hfL) });
      if (!this.hfK) {
        break label487;
      }
      if (!this.hfL) {
        break label431;
      }
      l = System.currentTimeMillis();
      if (this.hfR != null) {
        this.hfR.Oe();
      }
      this.hfM = l;
      if (!this.hfO) {
        break;
      }
      GMTrace.o(4383148343296L, 32657);
      return;
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad AddData handle = " + ((com.qq.wx.voice.vad.a)localObject).aDx);
      }
      if (com.qq.wx.voice.vad.a.aDA) {
        i = ((com.qq.wx.voice.vad.a)localObject).aDz.AddData(((com.qq.wx.voice.vad.a)localObject).aDx, paramArrayOfShort, paramInt);
      } else {
        i = ((com.qq.wx.voice.vad.a)localObject).aDy.AddData(((com.qq.wx.voice.vad.a)localObject).aDx, paramArrayOfShort, paramInt);
      }
    }
    int j = this.hfP.hfG;
    int m = this.hfS.length;
    if (j > 0) {
      if (m <= j) {
        break label1233;
      }
    }
    label431:
    label487:
    label586:
    label930:
    label1089:
    label1099:
    label1187:
    label1215:
    label1221:
    label1226:
    label1233:
    for (int k = j;; k = m)
    {
      this.hfP.b(this.hfS, k);
      int n = j - k;
      j = n;
      if (this.hfR == null) {
        break;
      }
      this.hfR.a(this.hfS, k);
      j = n;
      break;
      this.hfL = false;
      this.handler.removeMessages(0);
      this.handler.sendEmptyMessageDelayed(0, this.hfN);
      for (;;)
      {
        this.hfI = false;
        this.hfJ = i;
        if (!this.hfO) {
          break;
        }
        GMTrace.o(4383148343296L, 32657);
        return;
        if ((this.hfJ == 3) && (i == 2)) {
          this.hfK = false;
        }
        if ((this.hfJ != 3) || (i != 3))
        {
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.hfN);
        }
      }
      if ((this.hfJ == 3) && (i == 2))
      {
        this.hfJ = i;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.hfN);
        l = System.currentTimeMillis();
        if (this.hfR != null) {
          this.hfR.Oe();
        }
        this.hfM = l;
        if (this.hfO)
        {
          GMTrace.o(4383148343296L, 32657);
          return;
        }
        i = this.hfP.hfG;
        k = this.hfS.length;
        if (i > 0) {
          if (k <= i) {
            break label1226;
          }
        }
      }
      for (j = i;; j = k)
      {
        this.hfP.b(this.hfS, j);
        m = i - j;
        i = m;
        if (this.hfR == null) {
          break label586;
        }
        this.hfR.a(this.hfS, j);
        i = m;
        break label586;
        this.hfI = false;
        break;
        if ((this.hfJ == 2) && (i == 3))
        {
          this.hfJ = i;
          this.hfI = true;
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.hfN);
          l = System.currentTimeMillis();
          if (this.hfR != null) {
            this.hfR.Od();
          }
          this.hfM = l;
          if (!this.hfO) {
            break;
          }
          GMTrace.o(4383148343296L, 32657);
          return;
        }
        if ((this.hfJ == 3) && (i == 3))
        {
          this.hfI = true;
          break;
        }
        if ((this.hfJ != 2) || (i != 2)) {
          break;
        }
        this.hfI = false;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.hfN);
        break;
        localObject = this.hfP;
        if (paramArrayOfShort.length >= 0) {
          if (paramInt <= paramArrayOfShort.length + 0) {
            break label1221;
          }
        }
        for (i = paramArrayOfShort.length + 0;; i = paramInt)
        {
          if (i != 0)
          {
            j = ((a)localObject).hfH.length - ((a)localObject).hfG;
            if (i > j)
            {
              j = i - j;
              if (j != 0)
              {
                if (j >= ((a)localObject).hfG) {
                  break label1089;
                }
                if (j > ((a)localObject).hfH.length - ((a)localObject).hfE) {
                  break label1099;
                }
                ((a)localObject).hfE += j;
                if (((a)localObject).hfE >= ((a)localObject).hfH.length) {
                  ((a)localObject).hfE = 0;
                }
                ((a)localObject).hfG -= j;
              }
            }
            if (i <= ((a)localObject).hfH.length) {
              break label1215;
            }
            j = i - ((a)localObject).hfH.length + 0;
            i = ((a)localObject).hfH.length;
          }
          for (;;)
          {
            if (i <= ((a)localObject).hfH.length - ((a)localObject).hfF)
            {
              System.arraycopy(paramArrayOfShort, j, ((a)localObject).hfH, ((a)localObject).hfF, i);
              ((a)localObject).hfF += i;
              if (((a)localObject).hfF < ((a)localObject).hfH.length) {}
            }
            for (((a)localObject).hfF = 0;; ((a)localObject).hfF = m)
            {
              ((a)localObject).hfG = (i + ((a)localObject).hfG);
              w.d(TAG, "isSilent %s", new Object[] { Boolean.valueOf(this.hfI) });
              if (!this.hfI) {
                break label1187;
              }
              GMTrace.o(4383148343296L, 32657);
              return;
              j = ((a)localObject).hfG;
              break;
              ((a)localObject).hfE = (j - (((a)localObject).hfH.length - ((a)localObject).hfE));
              break label930;
              k = ((a)localObject).hfH.length - ((a)localObject).hfF;
              System.arraycopy(paramArrayOfShort, j, ((a)localObject).hfH, ((a)localObject).hfF, k);
              m = i - k;
              System.arraycopy(paramArrayOfShort, j + k, ((a)localObject).hfH, 0, m);
            }
            if (this.hfR != null) {
              this.hfR.a(paramArrayOfShort, paramInt);
            }
            GMTrace.o(4383148343296L, 32657);
            return;
            j = 0;
          }
        }
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(4383282561024L, 32658);
    w.d(TAG, "released");
    this.hfO = true;
    this.hfK = false;
    this.hfL = false;
    if (this.hfQ != null)
    {
      com.qq.wx.voice.vad.a locala = this.hfQ;
      int i;
      if (locala.aDx == 0L) {
        i = 1;
      }
      while (i == 1)
      {
        throw new b();
        if (com.qq.wx.voice.vad.a.DEBUG) {
          System.out.println("EVad Release handle = " + locala.aDx);
        }
        if (com.qq.wx.voice.vad.a.aDA) {
          i = locala.aDz.Release(locala.aDx);
        } else {
          i = locala.aDy.Release(locala.aDx);
        }
      }
      this.hfQ = null;
    }
    this.hfP = null;
    this.hfS = null;
    if (this.handler != null)
    {
      this.handler.removeMessages(0);
      this.handler = null;
    }
    this.hfR = null;
    GMTrace.o(4383282561024L, 32658);
  }
  
  public static abstract interface a
  {
    public abstract void Od();
    
    public abstract void Oe();
    
    public abstract void a(short[] paramArrayOfShort, int paramInt);
    
    public abstract void qf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */