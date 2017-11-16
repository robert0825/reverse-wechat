package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bd.f;
import com.tencent.mm.bd.f.a;
import com.tencent.mm.bd.f.b;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Set;

public abstract class VoiceInputLayout
  extends LinearLayout
{
  private ae irz;
  private final aj jsM;
  private int tvA;
  protected a tvB;
  private ae tvC;
  protected int tvc;
  public b tvw;
  private f tvx;
  protected boolean tvy;
  private int tvz;
  
  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1176418385920L, 8765);
    this.tvw = null;
    this.tvy = false;
    this.tvc = 1;
    this.tvz = 3000;
    this.tvA = 10000;
    this.irz = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1165412532224L, 8683);
        if (paramAnonymousMessage.what != 0)
        {
          if (paramAnonymousMessage.what == 1) {
            w.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", new Object[] { Integer.valueOf(VoiceInputLayout.this.tvc) });
          }
        }
        else
        {
          w.d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", new Object[] { Integer.valueOf(VoiceInputLayout.this.tvc) });
          if (VoiceInputLayout.this.tvc == 3) {
            break label103;
          }
          GMTrace.o(1165412532224L, 8683);
          return;
        }
        GMTrace.o(1165412532224L, 8683);
        return;
        label103:
        VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(0);
        VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(1);
        if (VoiceInputLayout.b(VoiceInputLayout.this) != null) {
          VoiceInputLayout.b(VoiceInputLayout.this).bK(true);
        }
        VoiceInputLayout.this.reset(true);
        GMTrace.o(1165412532224L, 8683);
      }
    };
    this.tvC = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1166352056320L, 8690);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(1166352056320L, 8690);
          return;
          VoiceInputLayout.this.bLk();
          GMTrace.o(1166352056320L, 8690);
          return;
          paramAnonymousMessage = paramAnonymousMessage.getData();
          VoiceInputLayout.this.V(paramAnonymousMessage.getInt("localCode"), paramAnonymousMessage.getInt("errType"), paramAnonymousMessage.getInt("errCode"));
        }
      }
    };
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1171049676800L, 8725);
        if (VoiceInputLayout.b(VoiceInputLayout.this) == null)
        {
          GMTrace.o(1171049676800L, 8725);
          return true;
        }
        f localf = VoiceInputLayout.b(VoiceInputLayout.this);
        int i = localf.hfa;
        localf.hfa = 0;
        if (i > f.ezm) {
          f.ezm = i;
        }
        i = i * 100 / f.ezm;
        if (VoiceInputLayout.this.tvc == 2) {
          VoiceInputLayout.this.zc(i);
        }
        GMTrace.o(1171049676800L, 8725);
        return true;
      }
    }, true);
    GMTrace.o(1176418385920L, 8765);
  }
  
  @TargetApi(11)
  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1176284168192L, 8764);
    this.tvw = null;
    this.tvy = false;
    this.tvc = 1;
    this.tvz = 3000;
    this.tvA = 10000;
    this.irz = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1165412532224L, 8683);
        if (paramAnonymousMessage.what != 0)
        {
          if (paramAnonymousMessage.what == 1) {
            w.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", new Object[] { Integer.valueOf(VoiceInputLayout.this.tvc) });
          }
        }
        else
        {
          w.d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", new Object[] { Integer.valueOf(VoiceInputLayout.this.tvc) });
          if (VoiceInputLayout.this.tvc == 3) {
            break label103;
          }
          GMTrace.o(1165412532224L, 8683);
          return;
        }
        GMTrace.o(1165412532224L, 8683);
        return;
        label103:
        VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(0);
        VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(1);
        if (VoiceInputLayout.b(VoiceInputLayout.this) != null) {
          VoiceInputLayout.b(VoiceInputLayout.this).bK(true);
        }
        VoiceInputLayout.this.reset(true);
        GMTrace.o(1165412532224L, 8683);
      }
    };
    this.tvC = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1166352056320L, 8690);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(1166352056320L, 8690);
          return;
          VoiceInputLayout.this.bLk();
          GMTrace.o(1166352056320L, 8690);
          return;
          paramAnonymousMessage = paramAnonymousMessage.getData();
          VoiceInputLayout.this.V(paramAnonymousMessage.getInt("localCode"), paramAnonymousMessage.getInt("errType"), paramAnonymousMessage.getInt("errCode"));
        }
      }
    };
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1171049676800L, 8725);
        if (VoiceInputLayout.b(VoiceInputLayout.this) == null)
        {
          GMTrace.o(1171049676800L, 8725);
          return true;
        }
        f localf = VoiceInputLayout.b(VoiceInputLayout.this);
        int i = localf.hfa;
        localf.hfa = 0;
        if (i > f.ezm) {
          f.ezm = i;
        }
        i = i * 100 / f.ezm;
        if (VoiceInputLayout.this.tvc == 2) {
          VoiceInputLayout.this.zc(i);
        }
        GMTrace.o(1171049676800L, 8725);
        return true;
      }
    }, true);
    GMTrace.o(1176284168192L, 8764);
  }
  
  public final void V(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1177760563200L, 8775);
    w.d("MicroMsg.VoiceInputLayout", "doNetworkError localerrorType:%s,errorType:%s,errCode:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.tvc = 1;
    onReset();
    if (this.tvw != null) {
      this.tvw.W(paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(1177760563200L, 8775);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1176149950464L, 8763);
    this.tvB = parama;
    GMTrace.o(1176149950464L, 8763);
  }
  
  public final void bLi()
  {
    GMTrace.i(1177089474560L, 8770);
    if ((com.tencent.mm.p.a.aR(getContext())) || (com.tencent.mm.p.a.aP(getContext())))
    {
      w.d("MicroMsg.VoiceInputLayout", "voip is running, cann't record voice");
      onReset();
      GMTrace.o(1177089474560L, 8770);
      return;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.aS(getContext(), "android.permission.RECORD_AUDIO");
    w.d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      w.d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", new Object[] { Integer.valueOf(this.tvc) });
      if (this.tvc == 1)
      {
        this.tvc = 2;
        if (this.tvw != null) {
          this.tvw.bLo();
        }
        this.jsM.z(50L, 50L);
        kc(true);
        this.tvx = new f(new f.b()
        {
          public final void Ob()
          {
            GMTrace.i(1201517101056L, 8952);
            w.d("MicroMsg.VoiceInputLayout", "onRecordFin() onRecordFin currentState = %s", new Object[] { Integer.valueOf(VoiceInputLayout.this.tvc) });
            if (VoiceInputLayout.c(VoiceInputLayout.this) != null) {
              VoiceInputLayout.c(VoiceInputLayout.this).stopTimer();
            }
            VoiceInputLayout.d(VoiceInputLayout.this).sendEmptyMessage(0);
            GMTrace.o(1201517101056L, 8952);
          }
          
          public final void Of()
          {
            GMTrace.i(1201651318784L, 8953);
            w.d("MicroMsg.VoiceInputLayout", "onRecognize Finish");
            VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(0);
            VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(1);
            VoiceInputLayout.e(VoiceInputLayout.this).bLs();
            VoiceInputLayout.this.reset(false);
            GMTrace.o(1201651318784L, 8953);
          }
          
          public final void a(String[] paramAnonymousArrayOfString, Set<String> paramAnonymousSet)
          {
            GMTrace.i(1201785536512L, 8954);
            VoiceInputLayout.e(VoiceInputLayout.this).b(paramAnonymousArrayOfString, paramAnonymousSet);
            VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(0);
            VoiceInputLayout.a(VoiceInputLayout.this).sendEmptyMessageDelayed(0, VoiceInputLayout.f(VoiceInputLayout.this));
            GMTrace.o(1201785536512L, 8954);
          }
          
          public final void v(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(1201919754240L, 8955);
            VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(0);
            VoiceInputLayout.a(VoiceInputLayout.this).removeMessages(1);
            Message localMessage = new Message();
            Bundle localBundle = new Bundle();
            localBundle.putInt("localCode", paramAnonymousInt1);
            localBundle.putInt("errType", paramAnonymousInt2);
            localBundle.putInt("errCode", paramAnonymousInt3);
            localMessage.setData(localBundle);
            localMessage.what = 1;
            VoiceInputLayout.d(VoiceInputLayout.this).sendMessage(localMessage);
            GMTrace.o(1201919754240L, 8955);
          }
        });
        f localf = this.tvx;
        w.i("MicroMsg.SceneVoiceInputAddr", "start record");
        e.b(new f.a(localf), "SceneVoiceInputAddr_record", 10);
      }
      GMTrace.o(1177089474560L, 8770);
      return;
    }
    if ((getContext() instanceof Activity)) {
      com.tencent.mm.pluginsdk.h.a.d((Activity)getContext(), "android.permission.RECORD_AUDIO");
    }
    GMTrace.o(1177089474560L, 8770);
  }
  
  public final void bLj()
  {
    GMTrace.i(1177223692288L, 8771);
    w.d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", new Object[] { Integer.valueOf(this.tvc) });
    if (this.tvc == 1)
    {
      GMTrace.o(1177223692288L, 8771);
      return;
    }
    this.tvc = 1;
    if (this.tvw != null) {
      this.tvw.bLq();
    }
    if (this.tvx != null) {
      this.tvx.bK(true);
    }
    onReset();
    GMTrace.o(1177223692288L, 8771);
  }
  
  public final void bLk()
  {
    GMTrace.i(1177492127744L, 8773);
    w.d("MicroMsg.VoiceInputLayout", "doWaiting currentState = %s", new Object[] { Integer.valueOf(this.tvc) });
    if (this.tvc != 2)
    {
      GMTrace.o(1177492127744L, 8773);
      return;
    }
    this.tvc = 3;
    this.irz.removeMessages(0);
    this.irz.sendEmptyMessageDelayed(0, this.tvz);
    this.irz.sendEmptyMessageDelayed(1, this.tvA);
    ce(false);
    GMTrace.o(1177492127744L, 8773);
  }
  
  public final void bLl()
  {
    GMTrace.i(1177626345472L, 8774);
    V(12, -1, -1);
    GMTrace.o(1177626345472L, 8774);
  }
  
  public final int bLm()
  {
    GMTrace.i(1178028998656L, 8777);
    int i = this.tvc;
    GMTrace.o(1178028998656L, 8777);
    return i;
  }
  
  public final void be()
  {
    GMTrace.i(1177357910016L, 8772);
    w.d("MicroMsg.VoiceInputLayout", "do Stop. currentState = %s", new Object[] { Integer.valueOf(this.tvc) });
    if ((this.tvc == 1) || (this.tvc != 2))
    {
      GMTrace.o(1177357910016L, 8772);
      return;
    }
    this.tvc = 3;
    if (this.tvw != null) {
      this.tvw.bLp();
    }
    if (this.jsM != null) {
      this.jsM.stopTimer();
    }
    this.irz.removeMessages(0);
    this.irz.sendEmptyMessageDelayed(0, this.tvz);
    this.irz.sendEmptyMessageDelayed(1, this.tvA);
    ce(true);
    if (this.tvx != null) {
      this.tvx.ax(true);
    }
    GMTrace.o(1177357910016L, 8772);
  }
  
  protected abstract void ce(boolean paramBoolean);
  
  public final void kb(boolean paramBoolean)
  {
    GMTrace.i(16684471549952L, 124309);
    this.tvy = paramBoolean;
    GMTrace.o(16684471549952L, 124309);
  }
  
  protected abstract void kc(boolean paramBoolean);
  
  protected abstract void onReset();
  
  protected final void reset(boolean paramBoolean)
  {
    GMTrace.i(1177894780928L, 8776);
    w.d("MicroMsg.VoiceInputLayout", "reset currentState %s", new Object[] { Integer.valueOf(this.tvc) });
    if (this.tvc == 1)
    {
      GMTrace.o(1177894780928L, 8776);
      return;
    }
    this.tvc = 1;
    onReset();
    if ((paramBoolean) && (this.tvw != null)) {
      this.tvw.bLr();
    }
    GMTrace.o(1177894780928L, 8776);
  }
  
  protected abstract void zc(int paramInt);
  
  public static abstract interface a
  {
    public abstract void bLn();
  }
  
  public static abstract interface b
  {
    public abstract void W(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void b(String[] paramArrayOfString, Set<String> paramSet);
    
    public abstract void bLo();
    
    public abstract void bLp();
    
    public abstract void bLq();
    
    public abstract void bLr();
    
    public abstract void bLs();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */